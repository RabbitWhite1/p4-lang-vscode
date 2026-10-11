// SPDX-FileCopyrightText: 2026 Zhanghan Wang
// SPDX-License-Identifier: Apache-2.0

import * as fs from 'node:fs/promises';
import * as path from 'node:path';
import { URI } from 'vscode-uri';
import { Diagnostic, DiagnosticSeverity, Range } from 'vscode-languageserver/node';
import { ParsedFile, nodeRange, walk } from './parser';
import { extractModel, FileModel, TranslationUnit } from './model';
import { Include, Macro, preprocess, stripComments } from './preprocessor';

export interface Settings { includePaths: string[]; defines: Record<string, string>; maxNumberOfProblems: number; }
export const defaultSettings: Settings = { includePaths: [], defines: {}, maxNumberOfProblems: 100 };
interface OpenFile { text: string; version: number; }
interface UnitCache { unit: TranslationUnit; parsed: Map<string, ParsedFile>; dirty: boolean; diagnostics: Map<string, Diagnostic[]>; }

export class Workspace {
    readonly open = new Map<string, OpenFile>();
    private readonly cache = new Map<string, UnitCache>();
    private readonly pending = new Map<string, Promise<TranslationUnit>>();
    private readonly configurations = new Map<string, Settings>();
    revision = 0;
    constructor(public roots: string[] = [], public settings: Settings = defaultSettings) {}

    configure(settings: Partial<Settings>, uri?: string): void {
        const value: Settings = {
            includePaths: Array.isArray(settings.includePaths) ? settings.includePaths.filter(item => typeof item === 'string') : [],
            defines: Object.fromEntries(Object.entries(settings.defines ?? {}).filter(([name, value]) => /^[A-Za-z_]\w*$/.test(name) && typeof value === 'string')),
            maxNumberOfProblems: typeof settings.maxNumberOfProblems === 'number' && Number.isFinite(settings.maxNumberOfProblems)
                ? Math.max(0, Math.floor(settings.maxNumberOfProblems)) : defaultSettings.maxNumberOfProblems
        };
        const previous = uri ? this.configuration(uri) : this.settings;
        if (uri) { this.configurations.set(uri, value); }
        else { this.settings = value; this.configurations.clear(); }
        if (!uri || JSON.stringify(previous) !== JSON.stringify(value)) { this.invalidate(); }
    }
    configuration(uri: string): Settings { return this.configurations.get(uri) ?? this.settings; }
    update(uri: string, text: string, version: number): void {
        this.open.set(uri, { text, version });
        this.invalidate(uri);
    }
    close(uri: string): void {
        this.open.delete(uri);
        this.configurations.delete(uri);
        this.invalidate(uri);
        const entry = this.cache.get(uri);
        if (entry && !this.pending.has(uri)) { for (const file of entry.parsed.values()) { file.dispose(); } this.cache.delete(uri); }
    }
    invalidate(uri?: string): void {
        this.revision++;
        for (const [root, entry] of this.cache) {
            if (!uri || root === uri || entry.unit.files.has(uri) || [...entry.diagnostics.values()].some(issues => issues.length > 0)) { entry.dirty = true; }
        }
    }
    async read(uri: string): Promise<string | undefined> {
        const overlay = this.open.get(uri);
        if (overlay) { return overlay.text; }
        if (URI.parse(uri).scheme !== 'file') { return undefined; }
        try { return await fs.readFile(URI.parse(uri).fsPath, 'utf8'); }
        catch { return undefined; }
    }
    async get(uri: string): Promise<TranslationUnit> {
        const existing = this.cache.get(uri);
        if (existing && !existing.dirty) {
            this.cache.delete(uri);
            this.cache.set(uri, existing);
            return existing.unit;
        }
        const pending = this.pending.get(uri);
        if (pending) { await pending; return this.get(uri); }
        const result = this.build(uri);
        this.pending.set(uri, result);
        let unit: TranslationUnit;
        try { unit = await result; }
        finally { this.pending.delete(uri); }
        return this.cache.get(uri)?.dirty ? this.get(uri) : unit;
    }
    diagnostics(uri: string): Map<string, Diagnostic[]> { return this.cache.get(uri)?.diagnostics ?? new Map(); }

    private async build(rootUri: string): Promise<TranslationUnit> {
        const revision = this.revision;
        const previous = this.cache.get(rootUri);
        const parsed = previous?.parsed ?? new Map<string, ParsedFile>();
        const files = new Map<string, FileModel>();
        const diagnostics = new Map<string, Diagnostic[]>();
        const environment = new Map<string, Macro>();
        const settings = this.configuration(rootUri);
        for (const [name, value] of Object.entries(settings.defines)) {
            environment.set(name, { name, value, uri: '', start: 0, end: 0 });
        }
        const processing = new Set<string>();
        const once = new Set<string>();
        const load = async (uri: string, depth: number): Promise<void> => {
            const source = await this.read(uri);
            if (source === undefined || once.has(uri)) { return; }
            const guard = /^\s*#\s*ifndef\s+(\w+)\s*\r?\n\s*#\s*define\s+\1\b/.exec(stripComments(source));
            if (guard && environment.has(guard[1])) { return; }
            processing.add(uri);
            const includes = new Map<number, string>();
            const includeIssues: { start: number; end: number; message: string }[] = [];
            const preprocessed = await preprocess(uri, source, environment, async include => {
                const resolved = await this.resolveInclude(uri, include, settings);
                if (!resolved) { includeIssues.push({ ...include, message: `Cannot find include '${include.name}'. Configure p4.includePaths.` }); return; }
                includes.set(include.start, resolved);
                const includedSource = await this.read(resolved);
                const includedGuard = includedSource && /^\s*#\s*ifndef\s+(\w+)\s*\r?\n\s*#\s*define\s+\1\b/.exec(stripComments(includedSource));
                if (includedGuard && environment.has(includedGuard[1]) || once.has(resolved)) { return; }
                if (processing.has(resolved) || depth >= 64) {
                    includeIssues.push({ ...include, message: processing.has(resolved) ? 'Cyclic include without an include guard' : 'Include nesting limit exceeded' });
                    return;
                }
                await load(resolved, depth + 1);
            }, () => once.add(uri));
            processing.delete(uri);
            let file = parsed.get(uri);
            if (file) { file.update(source, preprocessed.text, this.open.get(uri)?.version ?? 0); }
            else { file = await ParsedFile.create(uri, source, preprocessed.text, this.open.get(uri)?.version ?? 0); parsed.set(uri, file); }
            const model = extractModel(file, preprocessed);
            const filename = URI.parse(uri).scheme === 'file' ? URI.parse(uri).fsPath : '';
            if ([path.resolve(__dirname, '../../p4include'), path.resolve(__dirname, '../p4include')].some(directory => path.dirname(filename) === directory)) {
                for (const symbol of model.symbols) { symbol.defaultLibrary = true; }
            }
            // The include target stays on the record without changing public source coordinates.
            for (const include of model.preprocessing.includes) { includeTargets.set(include, includes.get(include.start)); }
            files.set(uri, model);
            const issues: Diagnostic[] = [...preprocessed.issues, ...includeIssues].map(issue => ({
                range: { start: file!.document.positionAt(issue.start), end: file!.document.positionAt(issue.end) },
                message: issue.message, severity: DiagnosticSeverity.Error, source: 'p4' }));
            for (const node of walk(file.tree.rootNode)) {
                if (node.type !== 'ERROR' && !node.isMissing) { continue; }
                if (node.type === 'ERROR' && node.parent?.type === 'ERROR') { continue; }
                const range = nodeRange(file.document, node);
                if (node.isMissing && node.startIndex < source.length) { range.end = file.document.positionAt(node.startIndex + 1); }
                issues.push({ range, message: node.isMissing ? `Expected ${node.type}` : `Unexpected syntax: ${node.text.replace(/\s+/g, ' ').slice(0, 80)}`,
                    severity: DiagnosticSeverity.Error, source: 'p4', code: 'syntax' });
            }
            diagnostics.set(uri, issues.slice(0, Math.max(0, settings.maxNumberOfProblems)));
        };
        await load(rootUri, 0);
        for (const [uri, file] of parsed) { if (!files.has(uri)) { file.dispose(); parsed.delete(uri); } }
        const unit = new TranslationUnit(rootUri, files);
        this.cache.set(rootUri, { unit, parsed, diagnostics, dirty: revision !== this.revision });
        // Workspace searches parse files on demand; keep idle translation units bounded.
        for (const [uri, entry] of this.cache) {
            if (this.cache.size <= 32) { break; }
            if (uri === rootUri || this.open.has(uri) || this.pending.has(uri)) { continue; }
            for (const file of entry.parsed.values()) { file.dispose(); }
            this.cache.delete(uri);
        }
        return unit;
    }

    private async resolveInclude(uri: string, include: Include, settings: Settings): Promise<string | undefined> {
        const workspaceRoot = this.rootFor(uri);
        const currentDirectory = URI.parse(uri).scheme === 'file' ? path.dirname(URI.parse(uri).fsPath) : workspaceRoot;
        const directories = [include.quoted ? currentDirectory : undefined, ...settings.includePaths.map(directory => path.resolve(workspaceRoot ?? currentDirectory ?? '.', directory)),
            workspaceRoot, path.resolve(__dirname, '../../p4include'), path.resolve(__dirname, '../p4include')].filter((value): value is string => Boolean(value));
        for (const directory of [...new Set(directories)]) {
            const target = URI.file(path.resolve(directory, include.name)).toString();
            if (this.open.has(target)) { return target; }
            try { if ((await fs.stat(URI.parse(target).fsPath)).isFile()) { return target; } }
            catch { /* Continue searching include paths. */ }
        }
        return undefined;
    }
    rootFor(uri: string): string | undefined {
        if (URI.parse(uri).scheme !== 'file') { return this.roots[0] && URI.parse(this.roots[0]).fsPath; }
        const filename = URI.parse(uri).fsPath;
        return this.roots.map(root => URI.parse(root).fsPath).filter(root => {
            const relative = path.relative(root, filename);
            return !relative.startsWith(`..${path.sep}`) && relative !== '..' && !path.isAbsolute(relative);
        }).sort((a, b) => b.length - a.length)[0];
    }
    async projectFiles(): Promise<string[]> {
        const result = new Set(this.open.keys());
        const visit = async (directory: string, depth: number) => {
            if (depth > 64 || result.size >= 10000) { throw new Error('Workspace scan limit reached; narrow the workspace folders before searching or renaming.'); }
            let entries;
            try { entries = await fs.readdir(directory, { withFileTypes: true }); } catch { return; }
            for (const entry of entries) {
                if (entry.name.startsWith('.') || ['node_modules', 'dist', 'out', 'build', 'vendor'].includes(entry.name)) { continue; }
                const filename = path.join(directory, entry.name);
                if (entry.isDirectory()) { await visit(filename, depth + 1); }
                else if (entry.isFile() && filename.endsWith('.p4')) { result.add(URI.file(filename).toString()); }
            }
        };
        for (const root of this.roots) { if (URI.parse(root).scheme === 'file') { await visit(URI.parse(root).fsPath, 0); } }
        return [...result].sort();
    }
    dispose(): void {
        for (const entry of this.cache.values()) { for (const file of entry.parsed.values()) { file.dispose(); } }
        this.cache.clear();
    }
    async settle(): Promise<void> { await Promise.allSettled(this.pending.values()); }
}

export const includeTargets = new WeakMap<Include, string | undefined>();
export function offsetRange(model: FileModel, start: number, end: number): Range {
    return { start: model.file.document.positionAt(start), end: model.file.document.positionAt(end) };
}

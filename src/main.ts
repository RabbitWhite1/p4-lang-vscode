import * as path from 'node:path';
import * as vscode from 'vscode';
import { LanguageClient, TransportKind } from 'vscode-languageclient/node';

let client: LanguageClient | undefined;

export async function activate(context: vscode.ExtensionContext): Promise<void> {
    const serverModule = context.asAbsolutePath(path.join('dist', 'server.js'));
    const watcher = vscode.workspace.createFileSystemWatcher('**/*.p4');
    context.subscriptions.push(watcher);
    client = new LanguageClient('p4', 'P4 Language Server', {
        run: { module: serverModule, transport: TransportKind.ipc },
        debug: { module: serverModule, transport: TransportKind.ipc }
    }, {
        documentSelector: [{ scheme: 'file', language: 'p4' }, { scheme: 'untitled', language: 'p4' }],
        synchronize: { configurationSection: 'p4', fileEvents: watcher }
    });
    context.subscriptions.push(client);
    await client.start();
}

export async function deactivate(): Promise<void> {
    await client?.stop();
}

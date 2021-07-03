# P4-lang README

[![License: MIT](https://img.shields.io/badge/License-Apache-blue.svg)](https://github.com/RabbitWhite1/p4-lang-vscode/blob/master/LICENSE)

This is a vscode extension for [P4](https://p4.org/) for **Programming Protocol-independent Packet Processors**.

Most common **syntax and semantic highlights** are supported for now!

## Features

- simple syntax highlight
- relative complete semantic highlight based on **ANTLR4**
- 

## Develop This Extension

### Get Start

1. install npm, node-typescript and node_modules
  ```shell
  sudo apt-get install npm
  sudo apt-get install node-typescript
  npm install
  ```
2. generate antlr lexer and parser
  ```shell
  npm run antlr4ts
  ```
3. then simply press `F5` in vscode, then you can debug for it. 

You can refer to this [official document](https://code.visualstudio.com/api/get-started/your-first-extension) for more help! Have fun!😃

### What's in the folder

* This folder contains all of the files necessary for your extension.
* `package.json` - this is the manifest file in which you declare your language support and define the location of the grammar file that has been copied into your extension.
* `syntaxes/p4.tmLanguage.json` - this is the Text mate grammar file that is used for tokenization.
* `language-configuration.json` - this is the language configuration, defining the tokens that are used for comments and brackets.
* `src/main.ts` - contains all visitors for semantic highlight
* `src/grammar/*` - contains all P4 language grammar specification (with a bit modification).

## Known Issues and TODO List

### Syntax

- I only deal with some simple things in syntax, which means, without a semantic highlight, this extension might be a bit useless.

### Semantic

- **TODO**: provide a `TypeDefinitionProvider`
- **TODO**: deal with `macro`s. For now I just skip all macro lines. But when it comes to `#ifdef`, `#else` sequences, something could go wrong.

## Thanks

The ANTLR4 grammar file is based on [fattaholmanan/p4-vscode-extension](https://github.com/fattaholmanan/p4-vscode-extension)'s. Thanks to their publication.

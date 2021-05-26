# p4-lang README

[![License: MIT](https://img.shields.io/badge/License-Apache-blue.svg)](https://github.com/RabbitWhite1/p4-lang-vscode/blob/master/LICENSE)

This is a vscode extension for p4-lang. 

## Develop This Extension

1. install npm and node-typescript
  ```shell
  sudo apt-get install npm
  sudo apt-get install node-typescript
  ```
2. install node_modules
  ```shell
  npm install
  ```
3. generate antlr lexer and parser
  ```shell
  npm run antlr4ts
  ```
5. compile `.ts` files (under the root dir of this repository)
  ```shell
  npm run compile
  ```
5. then simply press `F5` in vscode, then you can debug for it. 

You can refer to this [official document](https://code.visualstudio.com/api/get-started/your-first-extension) for more help! Have fun!😃

## Known Issues

- I am just a starter of vscode extension, looking forward to more people to join me.

### Syntax

- when visiting member, still need to judge whether it is a function or variable.
- only deal with what I know for now, not according to the official language manual.

### Semantic

- Now only a sample semantic highlight for `#include`, I will plan to completely do this.

import { createConnection, ProposedFeatures } from 'vscode-languageserver/node';
const connection = createConnection(ProposedFeatures.all);
connection.onInitialize(() => ({ capabilities: {} }));
connection.listen();

using VerySimpleInterpreter.Lexer;
using VerySimpleInterpreter;

var st = new SymbolTable();
var basicLexer = new BasicLexer("docs/example.lang", st);

Token t = null;
do {
    t = basicLexer.GetNextToken();
    Console.WriteLine($"<{t.Type},{t.Value}>");
} while (t.Type != ETokenType.EOF);

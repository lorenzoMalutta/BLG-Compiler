using VerySimpleInterpreter.Lexer;
using VerySimpleInterpreter;
using VerySimpleInterpreter.Parser;

var st = new SymbolTable();
var basicLexer = new BasicLexer("docs/example.lang", st);
var basicParser = new BasicParser(basicLexer);

Token t = null;
do {
    t = basicLexer.GetNextToken();
    //Console.WriteLine($"<{t.Type},{t.Value}>");
    basicParser.Prog();
} while (t.Type != ETokenType.EOF);

//Console.Write(st);
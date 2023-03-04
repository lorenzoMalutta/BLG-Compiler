grammar Lang;

prog: functions line+             # progLine
    ;

functions: function functions
        |// empty
        ;
 
function: FUNCTION VAR '('params')' fnBlock;

fnBlock:
     '{' fnBody '}'                # fnBlockLine
    ;

fnBody:
      line                      # fnBodyLine
    | line fnBody               # fnBodyLineMore
    | RETURN expr EOL           # fnReturnExprLine
    | RETURN EOL                # fnReturnLine
    ;

params: 
        VAR
      | VAR SEP params
      | // empty
      ;

funcInvoc:
    VAR '(' params ')' # funcInvocLine
    ;

line:
	  stmt EOL          # lineStmt
	| ifst              # lineIf
    | whilest           # lineWhile
	| EOL               # lineEOL
    ;

stmt: 
      atrib     {Console.WriteLine("Atribuição reconhecida\n");}        # stmtAtrib
    | input     {Console.WriteLine("Input reconhecido\n");}             # stmtInput
    | output    {Console.WriteLine("Output reconhecida\n");}            # stmtOutput
    ;

input: 
      READ VAR            # inputRead
    ;    
 
output: 
      WRITE VAR           # outputWriteVar
    | WRITE STR           # outputWriteStr
    | WRITE expr          # outputWriteExpr
    ;

ifst:
	  IF '(' cond ')' THEN block                  # ifstIf
	| IF '(' cond ')' THEN b1=block ELSE b2=block # ifstIfElse
    ;
 
block:
     '{' line+ '}'                # blockLine
    ;

cond: 
      expr                                            # condExpr
    | e1=expr RELOP=(EQ|NE|LT|GT|LE|GE) e2=expr       # condRelop
    | c1=cond AND c2=cond                             # condAnd
    | c1=cond OR c2=cond                              # condOr
    | NOT cond                                        # condNot
    ;
 
whilest : WHILE '('cond')' DO block                   #while
    ;

atrib: 
       VAR '=' expr            # atribVar
    |  VAR '=' STR             # atribStr
    |  VAR                     # atribVarEmpty
    ;

tipo:
      'texto'
    | 'numero'
    | 'booleano'
    ;

expr: 
      term '+' expr         # exprPlus
    | term '-' expr         # exprMinus
    | term                  # exprTerm
    ;

term: 
      factor '*' term       # termMult
    | factor '/' term       # termDiv
    | factor                # termFactor
    ;           

factor: 
     '(' expr ')'           # factorExpr
    | VAR                   # factorVar
    | NUM                   # factorNum
    ;

// Lexical rules
SEP: ',';
OE: '(';
CE: ')';
OB: '{';
CB: '}';
AT: '=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
AND: '&&';
OR: '||';
NOT: '!';
EQ : '==';
LT : '<';
GT : '>';
LE : '<=';
GE : '>=';
NE : '!=';
BOOL_TRUE: 'true';
BOL_FALSE: 'false';
FUNCTION: [fF][uU][nN][cC][tT][iI][oO][nN];
RETURN: [rR][eE][tT][uU][rR][nN];
IF: [iI][fF];
WHILE: [wW][hH][iI][lL][eE];
DO: [dD][oO];
THEN: [tT][hH][eE][nN];
ELSE: [eE][lL][sS][eE];
WRITE: [wW][rR][iI][tT][eE];
READ: [rR][eE][aA][dD];
STR: '"' ~["]* '"';
EOL: ';';
NUM: [0-9]+ (.([0-9]+))?;
VAR: [a-zA-Z]+;
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\n\r]+ -> skip;

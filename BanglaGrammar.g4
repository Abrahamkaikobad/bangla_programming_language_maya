grammar BanglaGrammar;

// Tokens
TOKEN_PurnoShongkha : 'পূর্ণসংখ্যা';
TOKEN_Ashol : 'আসল';
TOKEN_Jodi : 'যদি';
TOKEN_Operator : 'operator';
TOKEN_Symbol : 'symbols';

// Reserved Words
//RESERVED_PurnoShongkha : 'পূর্ণসংখ্যা';
//RESERVED_Doshomik : 'দশমিক';
RESERVED_Or : 'অথবা';
RESERVED_Ashol : 'আসল';
RESERVED_Evong : 'এবং';
RESERVED_Jokhon : 'যখন';
RESERVED_Jodi : 'যদি';
RESERVED_Input : 'ইনপুট';
RESERVED_Chapao : 'ছাপাও';
RESERVED_Function : 'ফাঙ্কশন';
RESERVED_TYPE: 'পূর্ণসংখ্যা'|'দশমিক';

// Rules
program : statement+;

statement : assignmentStatement | calculationStatement | conditionalStatement | functionCallStatement;

assignmentStatement : RESERVED_TYPE identifier '=' expression |expression.expression';';

calculationStatement : RESERVED_TYPE identifier '=' arithmeticExpression ';';

conditionalStatement : RESERVED_Jodi '(' expression ')' block (RESERVED_Or block)?;

functionCallStatement : RESERVED_Function Identifier '(' arguments? ')' block;

arguments : expression (',' expression)*;

block : '{' statement* '}';

expression : logicalExpression;

logicalExpression : logicalExpression (RESERVED_Evong | RESERVED_Or) logicalExpression
                  | '(' logicalExpression ')'
                  | '!' logicalExpression
                  | relationalExpression;

relationalExpression : additiveExpression (comparisonOperator additiveExpression)?;

additiveExpression : additiveExpression ('+' | '-') multiplicativeExpression
                   | multiplicativeExpression;

multiplicativeExpression : multiplicativeExpression ('*' | '/' | '%') unaryExpression
                         | unaryExpression;

unaryExpression : primaryExpression | '++' primaryExpression | '--' primaryExpression;

primaryExpression : literal | identifier | '(' expression ')';

literal : INTEGER | DECIMAL | STRING;

identifier : Identifier;

comparisonOperator : '==' | '!=' | '>' | '<' | '>=' | '<=';

arithmeticExpression : additiveExpression;

// Lexer Rules
fragment Letter : ('\u0995'..'\u09C5' | '\u09CB'..'\u09CE' | '\u09DC'..'\u09E1');
fragment Digit : '\u09E6'..'\u09EF';
fragment IdentifierStart : Letter | '_';
fragment IdentifierPart : Letter | Digit | '_';

Identifier : IdentifierStart IdentifierPart*;

INTEGER : Digit+;
DECIMAL : Digit+ '.' Digit+;
STRING : '"' ~[\r\n]* '"';

// Ignore Whitespace and Comments
WS : [ \t\r\n]+ -> skip;
LINE_COMMENT : '#' ~[\r\n]* -> skip;
MULTILINE_COMMENT : '#.'~'#' '#' -> skip;

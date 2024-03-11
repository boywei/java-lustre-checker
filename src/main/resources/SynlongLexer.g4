// 定义词法符号（tokens），如关键字、标识符、操作符、字符串、数字等。

lexer grammar SynlongLexer;

// 变量名
BOOL: 'bool';
CHAR: 'char';
BYTE: 'byte';
UBYTE: 'ubyte';
SHORT:'short';
USHORT: 'ushort';
INT: 'int';
UINT: 'uint';
LONG: 'long';
ULONG: 'ulong';
FLOAT: 'float';
REAL: 'real';

// 操作符和分隔符
CARET       : '^';
COMMA       : ',';
COLON       : ':';
SEMI        : ';';
ADD         : '+';
MINUS       : '-';
MULTIPLY        : '*';
DIVIDE      : '/';
EQ          : '==';  // TODO 这里两个文件的语法不一样，现以 "==" 作为逻辑运算判等的符号
NEQ         : '<>';
LT          : '<';
LTE         : '<=';
GT          : '>';
GTE         : '>=';
ARROW       : '->';
PATHSEG     : '::';
ELLIPSE     : '..';
DIESE       : '#';
DPATTEN     : '_';
SEGREGATION : '——';
DOT         : '.';
NOT         : 'not';
DIV         : 'div';
MOD         : 'mod';
AND         : 'and';
OR          : 'or';
XOR         : 'xor';

LSHIFT      : '<<';
RSHIFT      : '>>';
LP          : '(';
RP          : ')';
LB          : '[';
RB          : ']';
LBB         : '{';
RBB         : '}';
CONCAT      : '@';


TYPE        : 'type';
CONST       : 'const';
FUNC        : 'function';
NODE        : 'node';
IMPORTED      : 'imported';
ENUM        : 'enum';
RETURNS     : 'returns';
AUTOMATON  : 'automaton';
MATCH       : 'match';
INITIAL     : 'initial';
FINAL       : 'final';
STATE       : 'state';
UNLESS      : 'unless';
UNTIL       : 'until';
DO          : 'do';
RESUME      : 'resume';
RESTART     : 'restart';
LAST        : 'last';
PRE         : 'pre';
FBY         : 'fby';
IF          : 'if';
THEN        : 'then';
ELSE        : 'else';
WHEN        : 'when';
CASE        : 'case';
OF          : 'of';
DEFAULT     : 'default';
FLATTEN     : 'flatten';
MAKE        : 'make';
WITH        : 'with';
NOR         : 'nor';
MAP         : 'map';
MAPI        : 'mapi';
FOLD        : 'fold';
FOLDI       : 'foldi';
MAPW        : 'mapw';
MAPWI       : 'mapwi';
FOLDW       : 'foldw';
FOLDWI      : 'foldwi';
MAPFOLD     : 'mapfold';
MERGE       : 'merge';
ACTIVATE    : 'activate';
VAR         : 'var';
LET         : 'let';
TEL         : 'tel';

ASSIGN      : '=';

// prefixOp
UPLUS: '+$';
UMINUS: '-$';
UNOT: 'not$';
UNARYSHORT: 'short$';
UNARYFLOAT: 'float$';
UNARYINT: 'int$';
UNARYREAL: 'real$';

BPLUS: '$+$';
BMINUS: '$-$';
BMULTI: '$*$';
BDIVIDE: '$/$';
BMOD: '$mod$';
BDIV: '$div$';
BEQ: '$=$';
BNEQ: '$<>$';
BLT: '$<$';
BLE: '$<=$';
BGT: '$>$';
BGE: '$>=$';
BAND: '$and$';
BOR: '$or$';
BXOR: '$xor$';

// 常量
BoolLiteral: 'true' | 'false';
// Character Literals
CharacterLiteral: '\'' LETTER '\'' | '\'' SIGN '\'';
// Integer Literals
IntegerLiteral: '0' | DIGIT9 DIGIT10*;
// Unsigned Integer literals
UnsignedIntegerLiteral: IntegerLiteral U;
// Floating point literals
FloatLiteral: DIGIT10+ DOT DIGIT10* EXPONENT? F;
// Real literals
RealLiteral: DIGIT10+ DOT DIGIT10* EXPONENT?;
// Unsigned short literals
UnsignedShortLiteral: IntegerLiteral US;
// Short literals
ShortLiteral: IntegerLiteral S;


fragment EXPONENT
    : (E1 | E2) SIGN? DIGIT10+
    ;

fragment DIGIT10 : [0-9];
fragment DIGIT9 : [1-9];
fragment LETTER : [a-zA-Z];

fragment E1
    : 'E'
    ;

fragment E2
    : 'e'
    ;

fragment F
    : '"f"'
    ;

fragment U
    : '"u"'
    ;

fragment US
    : '"us"'
    ;

fragment S
    : '"s"'
    ;

fragment SIGN
    : '+' | '-'
    ;

ID: [a-zA-Z_][a-zA-Z0-9_]*;


COMMENT: '(*' .*? '*)' -> channel(HIDDEN);
LINE_COMMENT: '--' ~[\r\n]* -> channel(HIDDEN);

WS          : [ \t\n\rEOF]+ -> channel(HIDDEN);
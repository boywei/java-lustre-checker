// 定义语法规则，即构成程序结构的各个元素，比如表达式、语句、声明、函数定义等。

parser grammar SynlongParser;

options { tokenVocab=SynlongLexer; }
//options { tokenVocab='./main/java/com/ecnu/synlong/tokens/SynlongLexer.tokens'; }

program
    : declarations* EOF
    ;

declarations
    : typeBlock    /* 类型块 */
    | constBlock     /* 常量块 */
    | userOpDecl  /* 节点定义 */
    ;

typeBlock
    : TYPE  (typeDecl SEMI)*
    ;

typeDecl
    : ID ('=' typeDef)?
    ;

typeDef
    : typeExpr
    | ENUM '{' ID (COMMA ID)* '}'
    ;

/* 缺少byte、ubyte、long、ulong */
typeExpr
    : BOOL | CHAR | BYTE | SHORT | INT | UINT | LONG | ULONG | FLOAT | REAL | USHORT
    | typevar
    | '{' fieldDecl (COMMA fieldDecl)* '}'
    | typeExpr CARET constExpr
    ;

fieldDecl : ID COLON typeExpr;

typevar: ID;

constBlock : CONST (constDecl SEMI)*;

constDecl : ID COLON typeExpr ('=' constExpr)?;

constExpr : ID | atom
    | unaryArithOp constExpr
    | constExpr binArithOp constExpr
    | constExpr binBoolOp constExpr
    | constExpr binRelationOp constExpr
    | LB constList RB
    | LBB constLabelExpr (COMMA constLabelExpr)* RBB
    ;

constList: (constExpr (COMMA constExpr)*)?;

constLabelExpr: ID COLON constExpr;

varDecls
    : varId (COMMA varId)* COLON typeExpr (whenDecl)? (lastDecl)?;

varId : ID;

whenDecl : WHEN clockExpr;

clockExpr : ID | NOT ID;

lastDecl : LAST '=' constExpr;

/* 节点定义 */
userOpDecl
    : opKind ID params RETURNS params SEMI
        opBody
    | FUNC IMPORTED ID params RETURNS params
    ;

opKind : FUNC | NODE;

params: LP (varDecls (SEMI varDecls)*)? RP;

// 节点或函数调用传入参数
args: LP ID RP
    | LP simpleExpr RP;

opBody : SEMI
    | (localBlock)?
        LET (equation SEMI)* TEL SEMI?;

localBlock : VAR (varDecls SEMI)*;

/* 外部函数定义 */
// TODO
// userOpDecl : FUNC IMPORTED ID params RETURNS params;

/* 等式定义 */
equation
    : lhs '=' expr
    | stateMachine return
    ;

lhs : LP RP
    | LP? lhsId RP?
    | LP lhsId (COMMA lhsId)+ RP
    ;

lhsId: ID;

return : RETURNS returnsVar;

returnsVar : (ID SEMI)* (ID | ELLIPSE);

/* 状态机定义 */
stateMachine : AUTOMATON ID? stateDecl+;

stateDecl : INITIAL? FINAL? STATE ID
            (UNLESS (transition SEMI)+)?
            dataDef
            (UNTIL (transition SEMI)+)?;

dataDef : equation SEMI
    | localBlock? (LET (equation SEMI)* TEL)?
    ;
transition : IF expr RESUME ID
    | IF expr RESTART ID
    ;

/* 条件块 */
clockedBlock : ACTIVATE ID? (ifBlock | matchBlock);

ifBlock : IF expr THEN (dataDef | ifBlock) ELSE (dataDef | ifBlock);

matchBlock : WHEN expr MATCH ( pattern COLON dataDef)+;
//matchBlock : WHEN expr MATCH ( | pattern COLON dataDef)+;



/* 表达式定义 */
expr : simpleExpr
    | LAST ID
    | tempoExpr
    | boolExpr
    | arrayExpr
    | structExpr
    | mixedConstructor
    | switchExpr
    | applyExpr
    |'(' expr ')'         // 添加对括号内嵌套表达式的支持
    | expr binBoolOp expr // 修改这里以支持连续的布尔表达式
    | unaryArithOp expr
    ;

list : (simpleExpr (COMMA simpleExpr)*)?;

tempoExpr: PRE expr
    | simpleExpr '->' expr
    | FBY LP simpleExpr SEMI constExpr SEMI simpleExpr RP
    | simpleExpr FBY simpleExpr
    | simpleExpr WHEN simpleExpr
    | MERGE ID LP simpleExpr RP LP simpleExpr RP
    ;

boolExpr: DIESE LP list RP;

arrayExpr
    : simpleExpr LB IntegerLiteral ELLIPSE IntegerLiteral RB // todo
    | LP simpleExpr DOT index+ DEFAULT simpleExpr
    | simpleExpr CARET constExpr
    | LB list RB
    ;

structExpr: LBB labelExpr (',' labelExpr)* RBB;

mixedConstructor: LP ID WITH (labelOrIndex)+ '=' simpleExpr;

labelExpr : ID COLON simpleExpr;

index: LB simpleExpr RB;

labelOrIndex: ID | index;

switchExpr
    : IF simpleExpr THEN simpleExpr ELSE simpleExpr
    | LP CASE simpleExpr OF (caseExpr)+ RP;

caseExpr: pattern COLON simpleExpr;
//caseExpr: | pattern COLON simpleExpr;


pattern : ID | CharacterLiteral | ('-')? IntegerLiteral | BoolLiteral | DPATTEN; //todo

/* 高阶运算表达式 */
applyExpr
    : prefixOp LP list RP
    | LP iterator '<<' prefixOp SEMI constExpr '>>' RP LP list RP
    | LP MAPW  '<<' prefixOp SEMI constExpr '>>' IF simpleExpr DEFAULT LP list RP RP LP list RP
    | LP MAPWI  '<<' prefixOp SEMI constExpr '>>' IF simpleExpr DEFAULT LP list RP RP LP list RP
    | LP FOLDW  '<<' prefixOp SEMI constExpr '>>' IF simpleExpr RP LP list RP
    | LP FOLDWI  '<<' prefixOp SEMI constExpr '>>' IF simpleExpr RP LP list RP
    ;

prefixOp : ID | prefixUnaryOp | prefixBinaryOp | LP MAKE ID RP | LP FLATTEN ID RP;

prefixUnaryOp: '+$' | '-$' | 'not$' | 'short$' | 'int$' | 'float$' | 'real$';

prefixBinaryOp: '$+$' | '$-$' | '$*$' | '$/$' | '$mod$' | '$div$'
    | '$=$' | '$<>$' | '$<$' | '$>$' | '$<=$' | '$>=$'
    | '$and$' | '$or$' | '$xor$';

iterator: MAP | FOLD | MAPI | FOLDI | MAPFOLD;

simpleExpr: ID | atom // todo
    | ID args // 调用节点或函数
    | '(' simpleExpr ')'
    | simpleExpr LB constExpr RB
    | simpleExpr DOT ID
    | unaryArithOp simpleExpr
    | simpleExpr binArithOp simpleExpr
    | simpleExpr binBoolOp simpleExpr
    | simpleExpr binRelationOp simpleExpr
    | LP typeExpr simpleExpr RP;


unaryArithOp: '-' | '+' | NOT;

binArithOp: ADD | MINUS | MULTIPLY | DIVIDE | MOD | DIV;

binRelationOp: EQ | NEQ | GT | LT | LTE | GTE;

binBoolOp : AND | OR | XOR;

atom: BoolLiteral | CharacterLiteral | IntegerLiteral | UnsignedIntegerLiteral | FloatLiteral | RealLiteral | UnsignedShortLiteral | ShortLiteral;
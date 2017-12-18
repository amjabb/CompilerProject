grammar Business;  

@header {
    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;
}

program   : header mainBlock '.' ;
header    : PROGRAM IDENTIFIER ';' ;
mainBlock : block;
block     : declarations main compoundStmt ;
main : MAIN;

declarations : declList ';' ;
declList     : decl ( ';' decl )* ;
decl         : varList ':' typeId
             | functionDeclaration ;
varList      : varId ( ',' varId )* ;
varId        : IDENTIFIER ;
funcId        : IDENTIFIER;
typeId       : IDENTIFIER ;

compoundStmt : BEGIN stmtList END ;

funcCompoundStmt : BEGIN funcStmtList END ;

stmt : compoundStmt
     | assignmentStmt
     | ifStatement
     | forStatement
     | printStmt
     | returnStmt
     | callStmt
     | functionAssignment
     | whileStatement
     | printStringStmt
     | printDoubleStmt
     ;

stmtList       : stmt ( ';' stmt )* ';' ;
funcStmtList       : funcStmt ( ';' funcStmt )* ';';

funcStmt : funcAssignmentStmt | printStmt | returnStmt | funcVar;

funcAssignmentStmt : variable '=' funcVar | funcExpr ;

funcExpr : variable | number  ;

assignmentStmt : variable '=' expr ;

variable : IDENTIFIER ;

expr locals [ TypeSpec type = null ]
    : expr mulDivOp expr   # mulDivExpr
    | expr addSubOp expr   # addSubExpr
    | number               # unsignedNumberExpr
    | signedNumber         # signedNumberExpr
    | variable             # variableExpr
    | STRING               # stringExpr
    | expr compareOp expr # compareExpr
    | '(' expr ')'         # parenExpr
    ;

compareOp : '==' | '!=' | '<' | '<=' | '>=' | '>' | 'IN';
mulDivOp : MUL_OP | DIV_OP ;
addSubOp : ADD_OP | SUB_OP ;
     
signedNumber locals [ TypeSpec type = null ] 
    : sign number 
    ;
sign : ADD_OP | SUB_OP ;

number locals [ TypeSpec type = null ]
    : INTEGER    # integerConst
    | FLOAT      # floatConst
    ;


ifStatement
   : 'IF' expr 'THEN' stmt (: 'ELSE' stmt)?
   ;

forStatement
   : 'RANGE' '(' INTEGER ')' compoundStmt
   ;

whileStatement
  : 'WHILE' '(' expr ')' compoundStmt;

functionDeclaration
   : function funcId (formalParameterList)? ':' IDENTIFIER ';' decl ';' funcMain funcCompoundStmt
   ;

returnStmt: RETURN funcVar?;

formalParameterList
   : '(' parameterGroup (';' parameterGroup)* ')'
   ;

parameterGroup
   : varList ':' typeId
   ;

callStmt : CALL functionDesignator;

functionDesignator
   : IDENTIFIER '(' parameterList ')'
   ;

parameterList
   : actualParameter (',' actualParameter)*
   ;

actualParameter
   : expr
   ;

funcVar
  : FUNCVAR INTEGER | variable;

printStmt: 'PRINT' '(' expr ')';

printStringStmt: 'PRINT_S' '(' STRING ')';

printDoubleStmt: 'PRINT_D' '(' expr ')';

STRING
   : '"' ( ~'"')* '"'
   ;

functionAssignment: IDENTIFIER '<=' callStmt;

PROGRAM : 'PROGRAM' ;
BEGIN   : '{' ;
RETURN : 'RETURN';
END     : '}' ;
MAIN : 'MAIN';
CALL : 'CALL';
FUNCVAR : 'FUNCVAR';
funcMain : 'MAIN';
function: 'def';

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER    : [0-9]+ ;
FLOAT      : [0-9]+ '.' [0-9]+ ;


MUL_OP :   '*' ;
DIV_OP :   '/' ;
ADD_OP :   '+' ;
SUB_OP :   '-' ;

LineComment:   '//' ~[\r\n]* -> skip;
NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ; 
grammar Business;  // A tiny subset of Pascal

@header {
    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;
}

program   : header mainBlock '.' ;
header    : PROGRAM IDENTIFIER ';' ;
mainBlock : block;
block     : declarations main compoundStmt ;
main : MAIN;

declarations : VAR declList ';' ;
declList     : decl ( ';' decl )* ;
decl         : varList ':' typeId
             | functionDeclaration ;
varList      : varId ( ',' varId )* ;
varId        : IDENTIFIER ;
funcId        : IDENTIFIER;
typeId       : IDENTIFIER ;

compoundStmt : BEGIN stmtList END ;

stmt : compoundStmt
     | assignmentStmt
     | ifStatement
     | whileStatement
     | printStmt
     | returnStmt
     | callStmt
     ;

stmtList       : stmt ( ';' stmt )* ;
assignmentStmt : variable ':=' expr ;

variable : IDENTIFIER ;

expr locals [ TypeSpec type = null ]
    : expr mulDivOp expr   # mulDivExpr
    | expr addSubOp expr   # addSubExpr
    | number               # unsignedNumberExpr
    | signedNumber         # signedNumberExpr
    | variable             # variableExpr
    | string               # stringExpr
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

whileStatement
   : 'WHILE' expr 'DO' stmt
   ;

functionDeclaration
   : 'FUNCTION' funcId (formalParameterList)? ':' IDENTIFIER ';' VAR IDENTIFIER ( ',' IDENTIFIER )* ':' IDENTIFIER  ';' compoundStmt
   ;

returnStmt: RETURN;

formalParameterList
   : '(' formalParameterSection (';' formalParameterSection)* ')'
   ;

formalParameterSection
   : parameterGroup
   | 'VAR' parameterGroup
   ;

parameterGroup
   : IDENTIFIER ( ',' IDENTIFIER )* ':' IDENTIFIER
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

printStmt: 'PRINT' '(' expr ')';

string
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;


PROGRAM : 'PROGRAM' ;
VAR     : 'VAR' ;
BEGIN   : 'BEGIN' ;
RETURN : 'RETURN';
END     : 'END' ;
MAIN : 'MAIN';
CALL : 'CALL';

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
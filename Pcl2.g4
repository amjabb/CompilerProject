grammar Pcl2;  // A tiny subset of Pascal

@header {
    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;
}

program   : header mainBlock;
header    : PROGRAM IDENTIFIER;
mainBlock : block;
block     : declarations stmtList ;

declarations : declList ;
declList     : decl (  decl )* ;
decl         : varList ':' typeId ;
varList      : varId ( ',' varId )* ;
varId        : IDENTIFIER ;
typeId       : IDENTIFIER ;

stmt : assignmentStmt
     | writeStmt
     | ifStmt
     | whileStmt
     | compareStmt
     ;
     
stmtList       : stmt;

assignmentStmt : variable 'duffle' expr ;

variable : IDENTIFIER ;

expr locals [ TypeSpec type = null ]
    : expr mulDivOp expr   # mulDivExpr
    | expr addSubOp expr   # addSubExpr
    | expr compareOp expr  # boolean
    | number               # unsignedNumberExpr
    | signedNumber         # signedNumberExpr
    | variable             # variableExpr
    | '(' expr ')'         # parenExpr
    ;
     
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

compareOp
   : '=='                        
   | '<'                         
   | '>'                         
   | '>='                        
   | '<='                        
   ;

factor
   : IDENTIFIER                           
   | INTEGER                     
   ;

string
   : '\'' factor* '\''
   ;

writeStmt
   : 'feedTheFish' '(' (((string | IDENTIFIER) ',')*  (string | IDENTIFIER)) ')'   
   ;

compareStmt
   : expr compareOp expr       
   ;

ifStmt
    :   IF_TOKEN '(' expr ')' stmt ('ahoyMatey' stmt)?    
    ;
    
whileStmt
    :   'swabTheDeck' '(' expr ')' stmt                 
    ;
    

PROGRAM : 'avast' ;
END     : 'blackspot' ;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER    : [0-9]+ ;
FLOAT      : [0-9]+ '.' [0-9]+ ;

MUL_OP :   'loot' ;
DIV_OP :   'boot' ;
ADD_OP :   'pillage' ;
SUB_OP :   'robbed' ;

WRITE      : 'feedTheFish'                   ;
READ       : 'YoHoHo'                        ;
OP_COMPARE : '=='                            ;
OP_LT      : '<'                             ;
OP_GT      : '>'                             ;
OP_GTEQ    : '>='                            ;
OP_LTEQ    : '<='                            ;
COMMA      : ','                             ;
DASH       : '-'                             ;
LPAREN     : '('                             ;
RPAREN     : ')'                             ;
IF_TOKEN   : 'ahoy'                          ;
ELSE_TOKEN : 'ahoyMatey'                     ;
WHILE_TOKEN: 'swabTheDeck'                   ;

NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ; 
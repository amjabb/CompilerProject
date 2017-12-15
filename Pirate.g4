grammar Pirate;

@header {
    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;
}

program : header mainBlock footer;

header  : BEGIN IDENTIFIER '{';
mainBlock: stmt_list;
footer  : '}' END;

stmt_list
   : stmt ( ';' stmt )* ;   

stmt
   : assign_stmt
   | write_stmt             
   ;

assign_stmt
   : variable 'duffle' expr
   ;

variable : IDENTIFIER ;


expr locals [ TypeSpec type = null ]
    : expr (MUL_OP | DIV_OP) expr   # mulDivExpr
    | expr (ADD_OP | SUB_OP) expr   # addSubExpr
    | number               # unsignedNumberExpr
    | IDENTIFIER             # variableExpr
    | '(' expr ')'         # parenExpr
    ;
     
number locals [ TypeSpec type = null ]
      :INTEGER # integerConst
      | FLOAT # floatConst;

write_stmt
      : 'feedTheFish' '(' output ')';

output: string | variable | ;

string
   : '\'' ('\'\'' | ~ ('\''))* '\''
   ;

BEGIN: 'avast';
END: 'blackspot';

//TOKEN NAMES
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER    : [0-9]+ ;
FLOAT      : [0-9]+ '.' [0-9]+ ;
WS         : [ \n\r\t] -> skip                 ;
MUL_OP :   '*' ;
DIV_OP :   '/' ;
ADD_OP :   '+' ;
SUB_OP :   '-' ;
ADD        : 'booty'                         ;
SUB        : 'pillage'                       ;
READ       : 'YoHoHo'                        ;
OP_COMPARE : '=='                            ;
OP_LT      : '<'                             ;
OP_GT      : '>'                             ;
OP_GTEQ    : '>='                            ;
OP_LTEQ    : '<='                            ;
COMMA      : ','                             ;
IF_TOKEN   : 'ahoy'                          ;
ELSE_TOKEN : 'ahoyMatey'                     ;
WHILE_TOKEN: 'swabTheDeck'                   ;






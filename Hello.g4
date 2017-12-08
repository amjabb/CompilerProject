grammar Hello;

program
   : 'avast' stmt_list 'blackSpot'
   ;



stmt_list
   : stmt_list stmt
   | stmt
   ;

stmt
   : assign_stmt
   | read_stmt
   | write_stmt
   | if_stmt
   | while_stmt
   | compare_stmt
   ;

assign_stmt
   : ident 'duffle' expr
   ;

read_stmt
   : 'ahoy' id_list
   ;

write_stmt
   : 'feedTheFish' expr_list
   ;

id_list
   : id_list ',' ident
   | ident
   ;

expr_list
   : expr_list ',' expr
   | expr
   ;

expr
   : expr operator factor
   | factor
   | expr compare_op expr
   ;

factor
   : ident
   | integer
   ;

integer
   : '-'? NUMBER
   ;

compare_op
   : '=='
   | '<'
   | '>'
   | '>='
   | '<='
   ;

compare_stmt
	: expr compare_op expr
	;

operator
   : 'booty' 		// add
   | 'pillage'      // subtract 
   ;

ident
   : ID
   ;
   
if_stmt
    :   'ahoy' '(' expr ')' stmt ('ahoyMatey' stmt)?
    ;
    
while_stmt
    :   'swabTheDeck' '(' expr ')' stmt
    ;
    
ID
   : ('a' .. 'z' | 'A' .. 'Z')+
   ;

NUMBER
   : ('0' .. '9')+
   ;

WS
   : [ \r\n\t] -> skip
   ;
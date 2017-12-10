grammar Hello;

program
   : 'avast' stmt_list 'blackSpot'
   ;



stmt_list
   : stmt +           
//   | stmt_list                
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
   : 'YoHoHo' id_list        
   ;

write_stmt
   : 'feedTheFish' '(' (((string | ident) ',')*  (string | ident)) ')'   
   ;

string
   : '\'' factor* '\''
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
   : expr mathOp expr            #expr_math
   | factor                      #expr_factor
   | expr compare_op expr        #expr_compare
   ;

factor
   : ident                       #id      
   | integer                     #int
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

mathOp
   : 'booty'                     
   | 'pillage'                   
   ;

ident
   : ID                         
   ;
   
if_stmt
    :   IF_TOKEN '(' expr ')' stmt ('ahoyMatey' stmt)?    
    ;
    
while_stmt
    :   'swabTheDeck' '(' expr ')' stmt                 
    ;
    


//TOKEN NAMES
ID         : ('a' .. 'z' | 'A' .. 'Z')+      ;
NUMBER     : ('0' .. '9')+                   ;
WS         : [ \r\n\t] -> skip               ;
ADD        : 'booty'                         ;
SUB        : 'pillage'                       ;
WRITE      : 'feedTheFish'                   ;
READ       : 'YoHoHo'                        ;
ASSIGN     : 'duffle'                        ;
PROG_START : 'avast'                         ;
PROG_END   : 'blackSpot'                     ;
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






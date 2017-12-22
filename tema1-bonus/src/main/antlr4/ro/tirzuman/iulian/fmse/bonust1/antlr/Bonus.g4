grammar Bonus;

/*
 * Parser Rules
 */
 
exp
	: (Int | Bool) WHITESPACE id';'
	| exp aritRelOp exp
	;
 
 bexp
 	: exp boolRelOp exp
 	| NOT exp
 	;
 
 assertt
 	: bexp
 	| exp IMPL exp
 	| ANY DOT exp
 	| EXISTS DOT exp
 	;
 
 id
   : WORD
   ;
   
 Int
   : 'int'
   ;
 
 Bool
   : 'bool'
   ;
 
 boolRelOp
   : EQ
   | GT
   | LT
   | AND
   | OR
   ;
   
 aritRelOp
   : PLUS
   | MINUS
   | TIMES
   | DIV
   ;
 

/*
 * Lexer Rules
 */
 PLUS
 	: '+'
 	;
 
 MINUS
   : '-'
   ;
 
 
 TIMES
   : '*'
   ;


 DIV
   : '/'
   ;
 
 GT
   : '>'
   ;


 LT
   : '<'
   ;


 EQ
   : '='
   ;
 
 NOT
   : '!'
   ;
   
 AND
   : '&&'
   ;
   
 OR
   : '||'
   ;
 
 ANY
   : 'ANY'
   ;
 
 EXISTS
   : 'EXISTS'
   ;
 
 DOT
   : '.'
   ;
 
 IMPL
   : 'IMPL'
   ;
 
 
fragment A          : ('A'|'a') ;
fragment S          : ('S'|'s') ;
fragment Y          : ('Y'|'y') ;
fragment H          : ('H'|'h') ;
fragment O          : ('O'|'o') ;
fragment U          : ('U'|'u') ;
fragment T          : ('T'|'t') ;
 
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
  
WORD                : (LOWERCASE | UPPERCASE | '_')+ ;
 
WHITESPACE          : (' ' | '\t') ;

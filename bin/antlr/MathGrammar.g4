grammar MathGrammar;

/*
 * Parser Rules
 */
start : expression EOF;
 
expression:
	SIN LEFT_BRACKET expression RIGHT_BRACKET #sin
	| COS LEFT_BRACKET expression RIGHT_BRACKET #cos
	| TAN LEFT_BRACKET expression RIGHT_BRACKET	#tan
	| ASIN LEFT_BRACKET expression RIGHT_BRACKET #asin
	| ACOS LEFT_BRACKET expression RIGHT_BRACKET #acos
	| ATAN LEFT_BRACKET expression RIGHT_BRACKET #atan
	| LOG LEFT_BRACKET expression COMA expression RIGHT_BRACKET #log
	| LG LEFT_BRACKET expression RIGHT_BRACKET #lg
	| LOG2 LEFT_BRACKET expression RIGHT_BRACKET #log2
	| LN LEFT_BRACKET expression RIGHT_BRACKET #ln
	| LEFT_BRACKET expression RIGHT_BRACKET #bracketExpression
	| <assoc=right> expression POWER expression #power
	| expression ASTERIKS expression #multiplication
	| expression SLASH expression #division
	| expression PLUS expression #addition
	| expression MINUS expression #subtraction
	| MINUS expression #reverseSign
	| NUMBER #number
	| VARIABLE #variable 
	;
 

 /*
 * Lexer Rules
 */
 
fragment DIGIT: [0-9] ;
fragment WHITESPACE: (' ' | '\t')+ ;

NUMBER: WHITESPACE* DIGIT+ ('.' DIGIT+)? WHITESPACE* ; 

PLUS: WHITESPACE* '+' ;
MINUS: WHITESPACE* '-' ;
SLASH: WHITESPACE* '/' ;
ASTERIKS: WHITESPACE* '*' ;
POWER: WHITESPACE* '^' ;
SIN: WHITESPACE* 'sin' ;
COS: WHITESPACE* 'cos' ;
TAN: WHITESPACE* 'tan' ;
ASIN: WHITESPACE* 'asin' ;
ACOS: WHITESPACE* 'acos' ;
ATAN: WHITESPACE* 'atan' ;
LOG: WHITESPACE* 'log' ;
LG: WHITESPACE* 'lg' ;
LOG2: WHITESPACE* 'lg2' ;
LN: WHITESPACE* 'ln' ;

VARIABLE: WHITESPACE* [xy] WHITESPACE* ;
COMA: WHITESPACE* ',' ;
LEFT_BRACKET: WHITESPACE* '(' ;
RIGHT_BRACKET: WHITESPACE* ')' WHITESPACE* ;

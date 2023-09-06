grammar SimpleLang;

// PARSER

project			:		'project' ID declarations* '{' methoddecl* '}'	;

declarations 	:		constdecl
				|		vardecl
				|		classdecl
				|		enumdecl
				|		interfacedecl
				;
				
constdecl		:		'const'	type ID '=' constvalue (',' ID '=' constvalue)* ';' 	;					
constvalue		:		(NUMCONST | CHARCONST | BOOLCONST)	;		

vardecl			:		type singlevardecl (',' singlevardecl)* ';'	; 
singlevardecl   :		ID ('[]')? ;

enumdecl		:		'enum' ID '{' numdecl (',' numdecl) '}' ;
numdecl			:		ID ('=' NUMCONST)?	;

classdecl		:		'class' ID ('extends' type)? ('implements' type (',' type)*)? '{' vardecl* ('{' methoddecl* '}')? '}' ;
interfacedecl	:		'interface'	ID '{' interfacemethoddecl* '}' ;
interfacemethoddecl :	returntype ID '(' formalparams? ')' ';' ; 

methoddecl		:		returntype ID '(' formalparams? ')' vardecl* '{' statement* '}'	;
returntype		:		(type | 'void') ;

formalparams	:		type singlevardecl (',' type singlevardecl)*	;
type			:		ID		;

statement		:		designatorstatement ';'
				|		ifelsestatement				// TODO
				|		forloopstatement			// TODO
				|		'break' ';'
				|		'continue' ';'
				|		'return' expr? ';'
				|		'read' '(' designator ')' ';'
				|		'print' '(' actualpars ')' ';'
				|		'{' statement* '}'
				;
				
designatorstatement : 	designator ('=' expr | functioncall | '++' | '--') ;
functioncall	:		'(' actualpars? ')' ;
actualpars		:		expr (',' expr)*	;

ifelsestatement :		'if' '(' condition ')' statement ('else' statement)? ;
forloopstatement :		'for' '(' designatorstatement? ';' condition? ';' designatorstatement ')' statement ;

condition		:		condterm ('||' condterm)* ;
condterm		:		condfact ('&&' condfact)* ;
condfact		:		expr (relop expr)?		;

expr			:		'-'? term (addop term)*		;
term			:		factor (mulop factor)*		;
factor			:		designator functioncall? | NUMCONST | CHARCONST | BOOLCONST | 'new' type ('[' expr ']')? | '(' expr ')';
designator		:		ID ('.'ID | '['expr']' )*	;

relop			:		'==' | '!=' | '>' | '>=' | '<' | '<=' ;
addop			:		'+' | '-' ;
mulop			:		'*' | '/' | '%' ;

// LEXER	(note that constant words marked with 'word' are automatically put in the lexer.)

NUMCONST		:		DIGIT+ ;
CHARCONST		:		'\'' . '\'' ;
BOOLCONST		:		('true' | 'false') ;

ID				:		LETTER (LETTER | DIGIT | '_')* ;
SLCOMMENT		:		'//' .*? '\r'? '\n' -> skip ;
WS 				: 		[ \t\r\n]+ -> skip ; // skip spaces, tabs, newline

fragment LETTER	:		[a-zA-Z] ;
fragment DIGIT  :		[0-9]	 ;

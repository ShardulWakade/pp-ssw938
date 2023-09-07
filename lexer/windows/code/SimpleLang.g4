grammar SimpleLang;

// PARSER

project			:		'project' ID declarations* '{' methoddecl* '}'	;

declarations 	:		constdecl							#projectConstDecl
				|		vardecl								#projectVarDecl
				|		classdecl							#projectClassDecl
				|		enumdecl							#projectEnumDecl
				|		interfacedecl						#projectInterfaceDecl
				;
				
constdecl		:		'const'	'int' ID '=' NUMCONST (',' ID '=' NUMCONST)* ';' 			#intConstDecl
				|		'const' 'char' ID '=' CHARCONST (',' ID '=' CHARCONST)* ';'			#charConstDecl
				|		'const' 'boolean' ID '=' BOOLCONST (',' ID '=' BOOLCONST)* ';'		#boolConstDecl
				;					
constvalue		:		val=(NUMCONST | CHARCONST | BOOLCONST)	;		

vardecl			:		type singlevardecl (',' singlevardecl)* ';'	; 
singlevardecl   :		ID ('[]')? ;

enumdecl		:		'enum' ID '{' numdecl (',' numdecl)* '}' ;
numdecl			:		ID ('=' NUMCONST)?	;

classdecl		:		'class' ID classext? interfaceimpl? '{' vardecl* ('{' methoddecl* '}')? '}' ;
interfacedecl	:		'interface'	ID '{' interfacemethoddecl* '}' ;
interfacemethoddecl :	returntype ID '(' formalparams? ')' ';' ; 

methoddecl		:		returntype ID '(' formalparams? ')' vardecl* '{' statement* '}'	;
returntype		:		type 			#nonVoidReturn
				| 		'void' 			#voidReturn
				;

formalparams	:		type singlevardecl (',' type singlevardecl)*	;
classext		:		('extends' ID)									;
interfaceimpl	:		('implements' ID (',' ID)*)						;
type			:		t=('int' | 'char' | 'boolean' | ID)				;

statement		:		designatorstatement ';'				#statementDesignator
				|		ifelsestatement						#statementIfElse
				|		forloopstatement					#statementForLoop
				|		'break' ';'							#statementBreak
				|		'continue' ';'						#statementContinue
				|		'return' expr? ';'					#statementReturn
				|		'read' '(' designator ')' ';'		#statementRead
				|		'print' '(' actualpars ')' ';'		#statementPrint
				|		'{' statement* '}'					#statementBlock
				;
				
designatorstatement : 	designator assignExpr 				#designatorAssign
					|	designator functioncall 			#designatorFunctionCall
					| 	designator unaryop 					#designatorUnaryOp
					;
assignExpr		:		'=' expr 			;
unaryop			:		op=(INCR | DECR) 	;
functioncall	:		'(' actualpars? ')' ;
actualpars		:		expr (',' expr)*	;

ifelsestatement :		'if' '(' condition ')' statement ('else' statement)? ;
forloopstatement :		'for' '(' designatorstatement? ';' condition? ';' designatorstatement? ')' statement ;

condition		:		condterm ('||' condterm)* ;
condterm		:		condfact ('&&' condfact)* ;
condfact		:		expr (relop expr)?		;

expr			:		'-'? term (addop term)*		;
term			:		factor (mulop factor)*		;
factor			:		'ord' '(' ID ')'				#ordFunction		
				|		'chr' '(' expr ')'				#chrFunction
				|		'len' '(' expr ')'				#lenFunction	
				|		designator functioncall? 		#designatorFactor
				| 		constvalue 						#constFactor
				| 		'new' type ('[' expr ']')? 		#newFactor
				| 		'(' expr ')'					#parenFactor
				;

designator		:		ID ('.'ID | '['expr']' )*	;

relop			:		op=(RELEQ | RELNE | RELGT | RELGE | RELLT | RELLE);
addop			:		op=(ADD | SUB);
mulop			:		op=(MUL | DIV | MOD) ;

// LEXER	(note that constant words marked with 'word' are automatically put in the lexer.)

// unary operators
INCR 			:		'++'	;
DECR 			:		'--'	;

// relational operators
RELEQ			:		'=='	;
RELNE 			:		'!='	;
RELGT			:		'>'		;
RELGE			:		'>='	;
RELLT			:		'<'		;
RELLE			:		'<='	;

// addition/subtraction
ADD				:		'+'		;
SUB 			:		'-'		;

// mul/div/mod
MUL 			:		'*'		;
DIV				:		'/'		;
MOD 			:		'%'		;

// Consts
NUMCONST		:		DIGIT+ ;
CHARCONST		:		'\'' . '\'' ;
BOOLCONST		:		('true' | 'false') ;

// Generic
ID				:		LETTER (LETTER | DIGIT | '_')* ;
SLCOMMENT		:		'//' .*? '\r'? '\n' -> skip ;
WS 				: 		[ \t\r\n]+ -> skip ; // skip spaces, tabs, newline

fragment LETTER	:		[a-zA-Z] ;
fragment DIGIT  :		[0-9]	 ;

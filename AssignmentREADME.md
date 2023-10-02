<h3>PLEASE READ</h3>
I made a very small commit after the dealine to ensure that the code compiled on linux. This only included a change in the code/simple shell script. Only a single line was changed and no java code was altered or added. The details can be found in the commit. This was done for the convinience of the grader so I hope this would be acceptable.

<h3>HOW TO USE</h3>
Download the lexparse folder.
Then type the following commands on a unix shell:

<code>
cd lexparse
./s
</code>
(This will build the project and run a very basic test case : 0.prog)

After this do the following to test another program (for example 1.prog)

<code>
cd code
./simple ../tests/1.prog
</code>
This should get it working.

<h3> Features of the project </h3>

<h4>Prints out aprropriate LEXER/PARSER errors</h4>
          Note that this feature has currently been turned off by me as it really makes more sense to let ANTLR do the error handling. However if we wish to see simple LEXER/PARSER error detection, then uncomment lines 25, 26, 31, 32 from main/Main.java and then rebuild the project. This will print out whether it is a lexer or parser error and then terminate the program if either error occurs.

<h4>Semantic error detection</h4>
<i>Entry error detection</i> : Detects whether the program has an entry function. Note that the return type and parameter list of entry are taken into account to determine this (Overloading is supported).
<br> <br> 
<i>Type Error</i> : Detects whether a type already exists. Like a class having a same name as a an interface or a variable having the same name as a class. Or using a type that doesn't exist. For example :
<code>
class A{}  interface A{}      // Type error
class Num{}   int Num;        // Type error
class A{}    B b;            // Type error   
</code>
<br> <br>
<i>Name use errors</i> : Detects whether a variable name is allowed at compile time. Errors of this kind would be declaring a variable with the same name twice. Or declaring a local variable with the same name as a type. Note that variable shadowing is supported. So a global variable a will not create conflict for a local variable a.
<code>
class A{ { void f() int A; {} }}    // Name use error
class A{ int a; {void f(int a){}}}  // OK (different levels)
class A{ { void f(int a) A a; {}}}  // Name use error
enum B{ NUM = 10, NUM = 5}          // Name use error
</code>
<br><br>
<i>Var error</i> : Detects whether a variable/function has been declared before used. This one is a bit intensive so Im gonna break this down point by point.<br>
1) functions and variables are 2 different entities : <br>
<code>
project proj int a; int b; { void function(){ a(1, 2, 3); }}  // Function not found error
project proj { int a(){} void function(){ a = 10; }}        // Variable not declared error
project proj { void a(){} void function(){ a(1, 2, 3); } }    // Ok (Doesn't check the argument list of a, only cares that a is a function.)
project proj class A{} { void function(){ b.c = 10; }}        // Error : no idea what b is
project proj class A{} { void function(){ A.c = 10;}}          // Ok  (Doesn't really check whether class A has member c)
project proj class A{} A a; { void function(){ a.c(10, 20, 30); }} // Ok (Doesn't really care whether c is a method of a)
</code><br>
2) Inheritance is supported and there are no access modifiers: everything is public: <br>
<code>
project proj class A{ int a; } class B extends A { {void function(){ a= 10; }}} {}  // OK
project proj interface A {void func();} class B implements A{ void func(){} } class C extends B{ void func2(){ func(); }}   // OK (Note that it is required for a function to have an implementation before it is used.)
project proj interface A {void func();} class B implements A{ void func2(){ func(); }}    // Does not compile as no implementation for func has been found yet.
</code><br>
3) Scoping is supported and variables and methods declared in a class are accessible by the instance methods. Global variables and methods are accesible to all.
<br><br>
<i>Object oriented errors(the extra semantic check i guess)</i> : The following principles from object oriented programming are supported : <br>
1) Acyclic inheritance (Like from C++) : All classes must be declared before they are extended from. This automatically prevents cyclic inheritance. Note that this doesn't apply to interfaces.
<code>
project proj interface A0 {} class A1 extends A2 implements A0 {} class A2 {}      // ERROR : class A2 needs to be declared before A1
project proj class A0 implements A1 {} interface A1 {}                             // OK since A1 is an interface
</code><br>
2) Method overloading : Methods can be overloaded based on name and parameter list.
<code>
void func(){} int func(){}    // ERROR : Duplicate function signature.
void func(){} void func(int a){}  // OK
class A{} void func(int a){} void func(A a){} // OK
interface A{ void f(int a); void f(int a[]); }  // OK
</code><br><br>
<i>Miscellanoues errors</i> : Enums must have at least one member; Too complicated expressions are only checked at the surface level
<code>
enum A{}    // Error
void func(){ A.b[var0.size].anotherVar.method(1, 2, var1, c, 45); }  // Checks whether A and var0 are valid types/variables. Checks whether var1 and c are variables.
</code>

<h3>Original Requirements</h3>

### Intro ###

Write a lexer and parser (using ANTLR) and a semantics analyzer for
simple Java-like language described in this file.

 - Each program starts with a keyword "project" and has static fields,
   static methods, inerfaces, and inner classes.
 - The main method in the language is always called entry().
 - There are:
   -- three types of constants: int, char, and boolean.
   -- several primitive types: int, boolean, char (ASCII only), enums.
   -- several kinds of variables: global (static), local, fields.
   -- reference types: arrays like in Java, interfaces and inner
      classes with fields and methods.
   -- static methods
 - There is also class inheritance and polymorphism.
 - Overloading is also available.
 - Three predefined procedure include: ord, chr, and len.
 - The "print" method prints values for all primitive types.
 - Control structures include "if" and "for".


### Syntax ###

Below, you can find "terminals" and terminals, as well as
Non-terminals.  We use alteration (|) and we show that some things can
repeat zero or more times between {and}.

Project = "project" ident {ConstDecl | VarDecl | ClassDecl| EnumDecl | InterfaceDecl} "{" {MethodDecl} "}".

ConstDecl = "const" Type ident "=" (numConst | charConst| booleanConst) {, ident "=" (numConst | charConst | booleanConst)} ";".

EnumDecl = "enum" ident "{" ident ["=" numConst] {"," ident ["=" numConst]} "}".

VarDecl = Type ident ["[" "]"] {"," ident ["[" "]"]} ";".

ClassDecl = "class" ident ["extends" Type] ["implements" Type {"," Type}]"{"  {VarDecl}["{"{MethodDecl} "}"]"}".

InterfaceDecl = "interface" ident "{"{InterfaceMethodDecl} "}".

InterfaceMethodDecl = (Type | "void") ident "(" [FormPars]")" ";".

MethodDecl = (Type | "void") ident "(" [FormPars]")" {VarDecl} "{" {Statement} "}".

FormPars = Type ident ["[" "]"] {"," Type ident ["[" "]"]}.

Type = ident.

Statement =  DesignatorStatement ";"
  | "if" "(" Condition ")" Statement ["else" Statement]
  | "for" "(" [DesignatorStatement ] ";" [Condition] ";" [DesignatorStatement] ")" Statement
  | "break" ";"
  | "continue" ";"
  | "return" [Expr] ";"
  | "read" "(" Designator ")" ";"
  | "print" "(" Expr ["," numConst] ")" ";"
  | "{" {Statement} "}".

DesignatorStatement = Designator (Assignop Expr | "(" [ActPars] ")" | "++" | "--").

ActPars = Expr {"," Expr}.

Condition = CondTerm {"||" CondTerm}.

CondTerm = CondFact {"&&" CondFact}.

CondFact = Expr [Relop Expr].

Expr = ["-"] Term {Addop Term}.

Term = Factor {Mulop Factor}.

Factor = Designator ["(" [ActPars] ")"]
  | numConst
  | charConst
  | booleanConst
  | "new" Type ["[" Expr "]"]
  | "(" Expr ")".

Designator = ident {"." ident | "[" Expr "]"}.

Assignop = "=".

Relop = "==" | "!=" | ">" | ">=" | "<" | "<=".

Addop = "+" | "-".

Mulop = "*" | "/" | "%".


### Other Lexical Structures ###

keywords: project, break, class, interface, enum, else, const, if,
new, print, read, return, void, for, extends, continue

token types:
    ident = letter {letter | digit | "_"}.
    numConst = digit {digit}.
    charConst = "'" printableChar "'".
    booleanConst = ("true" | "false")

operators: +, -, *, /, %, ==, !=, >, >=, <, <=, &&, ||, =, ++, --, ;,
comma, ., (, ), [, ], {, }

comments: // until the end of the line

OUTPUT: if there is any lexical error, print "LEX ERROR" to the stdout.


### Semantics ###

 - Each name must be declared before its fist use.
   OUTPUT: if this error happens, output "NAME USE ERROR" to the stdout.
 - There cannot be two variables with the same name in one scope.
   OUTPUT: if this error happens, output "VAR ERROR" to the stdout.
 - There must be a method "entry"; the return type must be void and the
   method should have no arguments.
   OUTPUT: if this error happens, output "ENTRY ERROR" to the stdout.
 - Come up with an analysis that you find appropriate for this language,
   implement it and describe briefly (using an example test program).

These checks should be done on the AST. Note that ANTLR already
generates visitors for you (see the provided script).

OUTPUT: if there is any error during parsing (order of tokens), print
"PARSER ERROR" to the stdout.


### Submission Instructions ###

Share with us a PRIVATE GitHub repository (see syllabus for our IDs)
that use the following naming convention: pp-YOUR_UT_ID.  If
YOUR_UT_ID is "abc", then share: pp-abc.

Take the given directory (do NOT change the name) and include into
your repository.  (Extending the example above, you would have
pp-abc/lexparse.)

Then you should start modifying code/ and tests/.  No need to modify
files outside these two directories.


### Clarifications and Hints ###

We expect you will mostly modify the following files: code/simple,
code/SimpleLang.g4, files that implement Visitors.

We will use Linux to test all assignments. If you do not test on
Linux, we might see different result from you.

Be creative.  When something is unclear make a reasonable assumption.

Also, do not try to cover everything at once; start with small
examples and then expand from there.

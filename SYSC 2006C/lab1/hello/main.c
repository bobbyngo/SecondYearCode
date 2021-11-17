#include <stdio.h>
#include <stdlib.h>

/* main: generate some simple output. */

int main(void)

{
	printf ("Hello World!\n");
	printf ("C programming is fun!\n");
	return EXIT_SUCCESS;
}

/* Excercise 2

Ngo Huu Gia Bao, 101163137

a) Remove closing curly bracket (}) 

C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(15): error #2001: Syntax error: expected '}' but found 'end of input'


b) Remove the opening curly-bracket ({)

C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(9): error #2001: Syntax error: expected ';' but found 'printf'.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(9): warning #2099: Missing type specifier; assuming 'int'.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(9): error #2001: Syntax error: expected ')' but found 'string constant'.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(9): error #2120: Redeclaration of 'printf', previously declared at C:\Program Files\PellesC\Include\stdio.h(140); expected 'int function(const char * restrict, ...)' but found 'int function()'.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(9): error #2001: Syntax error: expected ';' but found ')'.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(10): warning #2099: Missing type specifier; assuming 'int'.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(10): error #2001: Syntax error: expected ')' but found 'string constant'.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(10): error #2001: Syntax error: expected ';' but found ')'.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(11): error #2156: Unrecognized declaration.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(11): error #2156: Unrecognized declaration.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(12): error #2156: Unrecognized declaration.


c)Remove the int before main 

C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(6): warning #2099: Missing type specifier; assuming 'int'.


d)Change main to mian. 

POLINK: error: Unresolved external symbol 'main'.
POLINK: fatal error: 1 unresolved external(s).



e)Remove the closing comment symbol from the comment.

Building main.obj.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(4): warning #1042: EOF inside comment.
Building hello.exe.
POLINK: error: Unresolved external symbol 'main'.
POLINK: fatal error: 1 unresolved external(s).


f) Change the first occurrence of printf to pintf

Building main.obj.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(9): warning #2018: Undeclared function 'pintf' (did you mean 'printf'?); assuming 'extern' returning 'int'.
Building hello.exe.
POLINK: error: Unresolved external symbol 'pintf'.
POLINK: fatal error: 1 unresolved external(s).


g) Delete one of the parentheses: ( or ).

C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(9): error #2001: Syntax error: expected ';' but found 'string constant'.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(9): error #2001: Syntax error: expected ';' but found ')'.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(9): error #2061: Invalid statement termination.


h)Duplicate one of the parentheses: change a ( to (( or ) to )).
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(9): error #2001: Syntax error: expected ')' but found ';'.


i)Delete the semicolon ; after the return statement.
C:\Users\USER\Documents\Univeristy\SYSC 2006C\lab1\hello\main.c(12): error #2001: Syntax error: expected ';' but found '}'.

*/

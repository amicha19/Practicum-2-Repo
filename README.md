## Practicum-2-Repo
Repo for Practicum 2 - Java Basics - Understanding Public Static Void Main
# Understanding `public static void main` in Java

**BACKGROUND**<br>
Java programs generally consist of multiple file (as a
"project"). When a project is executed, there is one
file where the execution begins. That is the file with
the special file name `main`. In addition, the function
header must be written exactly as given below,

`public static void main(String[] args)`

So what is required syntax about? Every class is 
(generally) in its own file in Java. Entities within
a class (such as function main) are not directly 
accessible unless they are declared `public`. (This will 
become  more clear as we cover more Java.)

Why `static`? This is harder to explain at this point, 
but in order for function main to be able to be "picked
out" of the class and executed, it must be declared
static. 

The reason for the use of `void` is because the main 
function is called directly by Java, and is not meant
to return a  value.

What about the String array parameter `String[] args`?
Although it is not commonly used (and we will not make 
use of it) parameter values can be provided when 
executing a Java program that causes the program to
behave in different ways. A classic example is to run 
a program with `trace on`. If a program is written with
various "trace statements" used when testing a program
that display what part of a program has been reached
and/or the values of particular varaiables at that point,
that can be enabled and disabled based on the a parameter
provided when the program is executed, e.g.,<br>

`java my_program`

would execute a program in the "default" way. Running
the program as<br>

`java my_program trace_on`

would execute the program with the trace statements
executed (displayed). 

Again, this is not something that we will make use of,
but it at least explains the reason for the required
syntax.

**WHAT TO DO**<br>
Under Tools, selected Console. Under the console tab, enter<br>
`java Main`<br><br>
and observe the results.
Then under console re-execute the program by entering<br>
`java Main trace_on`
<br><br>and again observe the results.

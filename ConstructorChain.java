/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 public class ConstructorChain
{
    ConstructorChain()
    {
        this("Hello");
         System.out.println(" Default constructor called");
    }
    {
         System.out.println("Parameterized constructor called");
    }
      public static void main(String[]args)
      {
          ConstructorChain cc=new ConstructorChain();
      }
}

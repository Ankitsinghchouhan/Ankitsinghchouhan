/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Animal{
    protected String name;
    protected void display()
    {
    System.out.println("I am an animal");     
    }
}
class Dog extends Animal{
     public static void main(String[] args)
{
    Dog dog=new Dog();
    dog.display();
    dog.name="java";
}   
}
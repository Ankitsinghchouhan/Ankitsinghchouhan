/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Animal{
public void eat(){
    System.out.println("I can eat");
}
}
class Dog extends Animal{
    public void eat(){
        super.eat();
        System.out.println("I eat dog food");
    }
    public void bark()
    {
    System.out.println("I can break");
}
}
class Main{
    public static void main(String[]args)
    {
        Dog labradog=new Dog();
        labradog.eat();
        labradog.bark();
    }
}
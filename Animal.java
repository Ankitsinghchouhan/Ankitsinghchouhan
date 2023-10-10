/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Animal
{
    public int legCount;
    public void display(){
        System.out.println("I am an animal");
        System.out.println("I have "+legCount+"legs");
    }
}
public class Main{
   	public static void main(String[] args){
   	    Animal animal=new Animal();
   	    animal.legCount=4;
   	    animal.display();
   	} 
}

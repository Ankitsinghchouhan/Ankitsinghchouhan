/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Calculator {
    public void add();
    public void substract();
    public void product();
    public void divide();
}
class User1 implements Calculator {
   
    public void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("User1: " + num1 + " + " + num2 + " = " + result);
    }

    public void subtract(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("User1: " + num1 + " - " + num2 + " = " + result);
    }

    public void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("User1: " + num1 + " * " + num2 + " = " + result);
    }

    public void divide(int num1, int num2) {
        if (num2 != 0) {
            double result = (double);
                   System.out.println("User1: " + num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println("User1: Division by zero is not allowed.");
        }
    }
}

class User2 implements Calculator {

    public void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("User2: " + num1 + " + " + num2 + " = " + result);
    }

    public void subtract(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("User2: " + num1 + " - " + num2 + " = " + result);
    }

    public void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("User2: " + num1 + " * " + num2 + " = " + result);
    }

    public void divide(int num1, int num2) {
        if (num2 != 0) {
            double result = (double) num1 / num2;
            System.out.println("User2: " + num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println("User2: Division by zero is not allowed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        User1 user1 = new User1();
        User2 user2 = new User2();

        
        user1.add(10, 5);
        user1.subtract(20, 8);
        user1.multiply(7, 3);
        user1.divide(15, 3);

        
        user2.add(12, 6);
        user2.subtract(30, 15);
        user2.multiply(4, 9);
        user2.divide(10, 0); 

    }
}
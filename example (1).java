/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import jana.util*;
public class Example
{
	public static void main(String[] args) {
	    Scanner sc = new.Scanner(System.in);
	     Scanner sc1 = new.Scanner(System.in);
	    System.out.println("enter the name");
	    String name = sc.nextLine();
	    
	    System.out.println("enter the year");
	    int i=sc.nextInt();
	   String year = Integer.valueOf("i");
	   System.out.println("enter the enrollement no.");
	   
	   String enroll = sc1.nextLine();
	   String e=enrollment.substring(1,4);
	   String joinedString=(name.concat(year)).concat(enrollment);
	   System.out.println("joined String:"+joinedString);
	}
}

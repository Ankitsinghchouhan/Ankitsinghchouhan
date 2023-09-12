class Program2
{
	public static void main(String ar[])
	{
	boolean f = false;
	char a = 'A';
	byte x = 127;
	short y = 32767;
	int x1 = 2147483647;
	long y1 = 9223372036854775807l;
	float z = 1;
	double z1 = 1.2;
	System.out.println("boolean value = " + f);
	System.out.println("char value = " + a);
	System.out.println("byte value = " + x);
	System.out.println("short value = " + y);
	System.out.println("int value = " + x1);
	System.out.println("long value = " + y1);
	System.out.println("float value = " + z);
	System.out.println("double value = " + z1);
	}
}
import java.util.*;
class Program3//check wheather the number is even or odd;

{
	public static void main(String a[])
	{
	System.out.println("Enter two Integers:-");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int t;
	System.out.println("Before Swapping");
	System.out.println("x = " + x);
	System.out.println("y = " + y);
	t=x;
x=y;
	y=t;
	System.out.println("After Swapping");
	System.out.println("x = " + x);
	System.out.println("y = " + y);
	
	}
}


// create a string array of size 2x2 inttialize using for loop nd display it using for each loop.
import java.util.Scanner;
public class StringArraysDemo {
    public static void main(String args[]) {
        String[][] s = new String[2][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter String:");
                s[i][j] = sc.nextLine();
            }
        }
        System.out.println("Elements in the array:");
        for (String[] k : s) {
            for (String val : k) {
                System.out.println(val);
            }
        }
    }
}

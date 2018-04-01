package Java;

import java.util.Scanner;

/*
Task:
	you must read an integer, a double, and a String from stdin, then print the values according to the instructions.
*/

public class JavaStdInOut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); //this reads the rest of the line after the double
        String s = scan.nextLine();//reads the next line

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

	}

}

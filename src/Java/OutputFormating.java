package Java;

import java.util.Scanner;

public class OutputFormating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d",s1 ,x );
            // System.out.printf("%-15s%03d",s1 ,x ); the space between the %-14s and %03d is also considered in the output
            
            System.out.println();
        }
        System.out.println("================================");

	}

}

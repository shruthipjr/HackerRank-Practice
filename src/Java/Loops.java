package Java;

import java.util.Scanner;

/*
 * Given an integer,N, print its first 10 multiples. Each multiple N x i(where  1<= i<=10)
should be printed on a new line in the form:N x i = results
 */

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        for(int i=1; i<=10;i++){
	            System.out.println(n +" x " + i +" = " + n*i);
	}

	}
}

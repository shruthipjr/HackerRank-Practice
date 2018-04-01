package problemSolving;

import java.io.IOException;
import java.util.Scanner;

/*
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals. 
 */

public class DiagonalDifference {

	static int diagonalDifference(int[][] a) {
		int sum1 =0;
		int sum2 =0;
		for(int i=0; i<a.length; i++){

			for(int j=0; j<a.length; j++){

				if(i==j){
					sum1 += a[i][j];
				}

               if(i+j == a.length-1){
            	   sum2 += a[i][j];
               }

			}

		}
		
		/*One more solution
		 * for(int i=0 , j=a.length-1; i< a.length; i++,j-- ){
			//sum1 += a[i][i];
			 sum2 += a[i][j];
			System.out.println("i"+i +"j " + j);
		}*/
		
		/*Another solution
		for(int i=0; i<a.length ; i++){
			sum1 += a[i][i];
			sum2 += a[i][(a.length-1)-i];
			
			System.out.println("sum1 " + sum1);
			System.out.println("sum2 " + sum2);
		}*/

		return Math.abs(sum1-sum2);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine().trim());

		int[][] a = new int[n][n];

		for (int aRowItr = 0; aRowItr < n; aRowItr++) {
			String[] aRowItems = scan.nextLine().split(" ");

			for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
				int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
				a[aRowItr][aColumnItr] = aItem;
			}
		}

		int result = diagonalDifference(a);

		System.out.println("result :"+ result);
	}
}

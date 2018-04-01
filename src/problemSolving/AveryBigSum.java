package problemSolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
 Raw Input Format :
The first line of the input consists of an integer 
The next line contains 
space-separated integers contained in the array. 
 */

public class AveryBigSum {
	 
	    static long aVeryBigSum(int n, long[] ar) {
	       long sum = 0;
	        for(int i=0; i<n; i++){
	            sum += ar[i];
	        }

	        return sum;
	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	       Scanner scan = new Scanner(System.in);

	        int n = Integer.parseInt(scan.nextLine().trim());

	        long[] ar = new long[n];

	        String[] arItems = scan.nextLine().split(" ");

	        for (int arItr = 0; arItr < n; arItr++) {
	            long arItem = Long.parseLong(arItems[arItr].trim());
	            ar[arItr] = arItem;
	        }

	        long result = aVeryBigSum(n, ar);

	      System.out.println("result :" + result);
	    }
}

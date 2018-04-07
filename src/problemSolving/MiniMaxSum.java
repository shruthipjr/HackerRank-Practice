package problemSolving;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers
 */
public class MiniMaxSum {

	static void miniMaxSum(int[] arr) {

		//int[] sum = new int[5];

		/*for(int j=0; j<arr.length; j++){

			for(int i=0; i<arr.length ; i++){
				if(i == j){
					continue;
				}

				sum[j] += arr[i];
			}
		}

		for(int i=0; i<sum.length;i++){
			System.out.println(sum[i]);
		}
		int min = sum[0];
		for(int i=0; i<sum.length;i++){
			if(sum[i] < min){
				min = sum[i];
			}
		}

		int max = sum[0];
		for(int i=0; i<sum.length;i++){
			if(sum[i] > max){
				max = sum[i];
			}
		}*/
		int min=1000000000;
		int max=arr[0];
		int sum=0;
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]> max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
			
			sum += arr[i];
		}
		
		//System.out.println(sum + " "+ min + " " + max);
		
		
		System.out.println(sum-max + " " + (sum-min));
         /*Arrays.sort(arr);
		int min = arr[0]+arr[1]+arr[2]+arr[3];
		int max = arr[1]+arr[2]+arr[4]+arr[3];
		System.out.println(min + " "+ max);*/
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < 5; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		miniMaxSum(arr);
	}
}
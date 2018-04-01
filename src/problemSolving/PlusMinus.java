package problemSolving;

import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr) {
		double p =0,n=0,z=0;

		for(int i=0; i<arr.length; i++){
			if(arr[i]>0){
				p++;
			}
			else if(arr[i]<0){
				n++;
			}
			else{
				z++;
			}

		}

		System.out.printf( "%.6f %n" ,p/arr.length);
		System.out.printf("%.6f %n" ,n/arr.length);
		System.out.printf( "%.6f %n" ,z/arr.length);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println(5/3);
		
		int n = Integer.parseInt(scan.nextLine().trim());

		int[] arr = new int[n];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < n; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		plusMinus(arr);
	}

}

package problemSolving;

import java.util.Scanner;

public class Staircase {
	
	static void staircase(int n) {
		/*for(int i=0; i<n;i++){
			//System.out.print(" ");
			//for(int j=i;j<n;j++){
			for(int j=(n-1)-i; j<n;j++){
				
				System.out.print("#");
				
			}
			System.out.println();
		}*/
		 String str="#";
	        for (int i=0;i<n;i++)
	            { 
	            System.out.printf("%"+(n+1)+"s",str+"\n");
	            str=str+"#";
	            }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		  int n = Integer.parseInt(scan.nextLine().trim());

	        staircase(n);
	    }

}

package problemSolving;
import java.io.IOException;
import java.util.Scanner;

public class CompareTheTriplets {
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		int[] result = new int[2] ;
		int alic = 0, bob=0;
		int[] a = {a0,a1,a2};
		int[] b = {b0,b1,b2};
		
		for(int i=0; i<a.length;i++){
			if(a[i]<b[i]){
				bob++;
			}
			else if(a[i] > b[i]){
				alic++;
			}
		}

		
		/*if (a0 == b0){

		}
		else if(a0 < b0){
			b++;
		}

		else{
			a++;
		}

		if (a1 == b1){

		}
		else if(a1 < b1) b++;
		else a++;

		if (a2 == b2){

		}
		else if(a2 < b2) b++;
		else a++;
*/
		result[0] = alic;
		result[1] = bob;

		return result;
	}



	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String[] a0A1A2 = scan.nextLine().split(" ");

		int a0 = Integer.parseInt(a0A1A2[0].trim());

		int a1 = Integer.parseInt(a0A1A2[1].trim());

		int a2 = Integer.parseInt(a0A1A2[2].trim());

		String[] b0B1B2 = scan.nextLine().split(" ");

		int b0 = Integer.parseInt(b0B1B2[0].trim());

		int b1 = Integer.parseInt(b0B1B2[1].trim());

		int b2 = Integer.parseInt(b0B1B2[2].trim());

		int[] result = solve(a0, a1, a2, b0, b1, b2);


		for(int i=0; i<2 ; i++){
			System.out.print(result[i] + " ");
		}
	}
}



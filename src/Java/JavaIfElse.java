package Java;
/*
Task 
Given an integer,n, perform the following conditional actions:
	if n is odd, print weird
	if n is even and in the inclusive range of 2 and 5, print Not weird
	if n is even and in the inclusive range of 6 and 20, print weird
	if n is even and greater than 20  print Not weird
	*/

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();            
         String ans="";
         if(n%2==1){
           ans = "Weird";
         }
         else{
                     
             if(n>=2 && n <= 5){
                 ans="Not Weird";
             }
               
             else if(n>=6 && n <= 20)
             {
                 ans = "Weird";
             }
             
             else{
                  ans="Not Weird";
             }
         }
         System.out.println(ans);
         
	}

}

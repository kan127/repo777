package pack7;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("value is" +s);
		System.out.println("enter value is");
				int k=s.nextInt();
				int mul=1;
		
		for(int i=1;i<=k;i++) {
			
			
			 mul=mul*i;
			 
		}
			System.out.println("the factorial value is :"+mul);
			
		

	}

}

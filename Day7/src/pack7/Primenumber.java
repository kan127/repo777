package pack7;

import java.util.Scanner;

public class Primenumber {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the a value:" );
		int a=s.nextInt();
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				System.out.println();
			}
		}
		
		
	}
}

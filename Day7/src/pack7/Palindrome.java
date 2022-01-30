package pack7;

import java.util.Scanner;
public class Palindrome {
	public int pal(int n) {
		int rev_num = 0;
	    while (n > 0) {
	        rev_num = rev_num * 10 + n % 10;
	        n = n/10;
	    }
	    return rev_num;
	}
public static void main(String[] args) {
		Palindrome p= new Palindrome();
		Scanner s =new Scanner(System.in);
		System.out.println("value is" +s);
		System.out.println("enter value is");
				int k=s.nextInt();
			int j=p.pal(k);
	        if(j==k) {
	        	System.out.println("palindrome");
	        }
	        else
	        	System.out.println("non palindrome");
	
	}

}

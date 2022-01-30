package pack7;

import java.util.Scanner;

/*public class Swap {  //without using 3rd variable
	static int a=5;
	static int b=2;
			

	public static void main(String[] args) {
		 a=5+2;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("the value of a is :" +b);
		 System.out.println("the value of b is :" +a);
		
		

	}

}*/
  // or
public class Swap {  //without using 3rd variable
	
public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the value of a:");
		 int a=s.nextInt();
		 System.out.println("enter the value of b");
		 int b=s.nextInt();
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("the value of a is :" +a);
		 System.out.println("the value of b is :" +b);
}
}


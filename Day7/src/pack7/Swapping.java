package pack7;

public class Swapping {
	
	
	public int swap(int a ,int b) {
		int c =a;
		a=b;
		b=c;
		return(b);
		
		
	}

	public static void main(String[] args) {
		Swapping ss =new Swapping();
		int p=ss.swap(2, 3);
		int q=ss.swap(2, 3);
   System.out.println("after swapping:"+p);
	}

}

package forloop;

public class Fibonacci {
	public static void main(String[] args) {
		int x=0, y=1, z=x+y;
		System.out.print(x);
		System.out.print(y);
		for(int i=1;i<=10;i++) {
			x=y;
			y=z;
			z=x+y;
			System.out.print(z);
			
			
		}
		
	}

}

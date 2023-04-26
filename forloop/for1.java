package forloop;

public class for1 {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println(i);	
		}
		System.out.println("out of the program 1");
		System.out.println("********************************************************************");
		
		//other way
		int j=1;
		for(;j<=10;j++) {
			System.out.println(j);
		}
		System.out.println("out of the program 2");
		System.out.println("**********************************************************************");
		
		//other way
		int k=0;
		for(;k<=2;) {
			System.out.println("this is third program");
			k++;
		}
		System.out.println("out of the program 3");
		System.out.println("*************************************************************");
		
	}

}


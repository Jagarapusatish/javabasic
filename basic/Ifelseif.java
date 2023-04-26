package basic;

import java.util.Scanner;

public class Ifelseif {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner var1 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=var1.nextInt();
		
		if (n<35) {
			System.out.println("student is fail");
		}
		else if((n>=35)&&(n<50)){
			System.out.println("student is pass and got 2nd class");
		}
		else if ((n>=50)&&(n<70)) {
			System.out.println("student is pass and got 1st class");
		}
		else {
			System.out.println("student is pass and got distinction");
		}
	}

}

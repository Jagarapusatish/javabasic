package basic;

import java.util.Scanner;

public class Ifelse6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner var1 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=var1.nextInt();
		
		
		if(n>=0){
			System.out.println("Entered number is positive: ");		}
		else{
				System.out.println("Entered number is negative: ");		}
	}

}

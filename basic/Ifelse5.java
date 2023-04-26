package basic;

import java.util.Scanner;

public class Ifelse5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range");
		int number = sc.nextInt();
	
	if(number%2 == 0){
		System.out.println(" it is even number...");
	}else{
		System.out.println("it is odd number...");
	}
 }
}

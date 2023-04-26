package basic;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.println("Enter number 1 or 2 or 3 :");
		@SuppressWarnings("resource")
		Scanner var1 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=var1.nextInt();
		
		switch(n){
			case 1: System.out.println("You entered ONE");
					break;
					
			case 2:System.out.println("You entered TWO");
					break;
					
			case 3: System.out.println("You entered THREE");
					break;
					
			default:System.out.println("Invalid entry...");
		}
		
		System.out.println("Out of switch block...");
	}

}

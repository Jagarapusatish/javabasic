package basic;
import java.util.Scanner;
public class Prime {
public static void main(String args[]) {
	//reading input from user
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your range");
	int n = sc.nextInt();
	for (int i = 2;i<=n;i++) {
		int counter=0;
		for (int j=1;j<=i;j++) {
			if (i%j==0) {
			counter ++;
			}
		}
		if (counter ==2) {
			System.out.println(i);
		}
		
	}
	sc.close();		
}
}

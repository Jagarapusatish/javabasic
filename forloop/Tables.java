package forloop;
import java.util.Scanner;
public class Tables {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which table you want : ");
		int n=sc.nextInt();
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter range of the table you want : ");
		int m=cs.nextInt();
//		for(int i=n;i<=n;i++)
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=m;j++) {
				int k = i*j;
				System.out.println(i + " * " + j + " = " + k);	
			}
			System.out.println();

		}
		sc.close();
		cs.close();
	}

}
// printing tables
package forloop;

public class While {
	public static void main(String[] args) {
	//to print 1 to 10 numbers using while loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("end of the prog1...");
		
	//print 1 to 10 numbers using dowhile
		int j=1;
		do{
			System.out.println(j);
			j++;
		}while(j<=10);
		System.out.println("end of the prog2....");
		
	//print 10 to 1
		int k=10;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		System.out.println("end of the prog3...");
		
		int l=-10;
		while(l<=10) {
			System.out.println(l);
			l++;
		}
		System.out.println("end of the prog4...");
		
	
	}
}

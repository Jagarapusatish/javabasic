package forloop;

public class Pyramid1 {
	public static void main(String[] args) {
		int i,j;
		
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}

		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
			
		}
		
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print(i + "and" + j);
			}
			System.out.println();
			
		}
		
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
			
		}
	}

}

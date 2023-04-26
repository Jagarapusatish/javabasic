package basic;
import java.util.Scanner;
public class ifelse4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	   Scanner var1 = new Scanner(System.in);
	   System.out.println("Input the value of var1:");
       Scanner var2 = new Scanner(System.in);
       System.out.println("Input the value of var2:");
       int num1=var1.nextInt();
       int num2=var2.nextInt();
		   
		   if (num1 != num2){
			   System.out.println("var1 is not equal to var2\n");
		 		if (num1 > num2){
		 			System.out.println("var1 is greater than var2\n");
		 		}else{
		 			System.out.println("var2 is greater than var1\n");
		 		}
		   }else{
			   System.out.println("var1 is equal to var2\n");
		   }
		   
	}

}

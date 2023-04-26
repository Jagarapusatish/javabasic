package basic;
import java.util.Date;
public class Ifelse {
	  public static void main(String[] args) {
	        Date a = new Date();
	        Date b = new Date();
	        System.out.println(a);
	        System.out.println(b);

	        if(a==b){
	            System.out.println("Both are equal");
	            }
	        else{
	                System.out.println("Both are not equal");
	        }
	    }

}

/*values of variables are not initialized so 'if' condition compares memory locations of 'a' and 'b'
then displays 'else' condition as "Both are not equal" */

//we replace if(a==b) with if(a.equals(b)) then it compares values and returns "Both are equal"

/*values of variables are initialized as 'a=2' and 'b=2' so 'if' condition compares values of variables 
 * 'a' and 'b'n displays output as "Both are are equal" */
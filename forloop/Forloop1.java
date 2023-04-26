package forloop;

public class Forloop1 {
	public static void main(String[] args) {
		
//to print 1 to 10 numbers accept 6 and 9	
int i;
	
	for(i=1;i<=10;i++){
		if(i==6 || i==9){
			continue;
		}
		System.out.println(i);
	}
	
	System.out.println("Out of loop" );

//to print 1 to 10 numbers accept 6	
	for(i=1;i<=10;i++){
		if(i==6){
			continue;
		}
		System.out.println(i);
	}
	
	}
}

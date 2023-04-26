package Methods;

public class Method1 {
	int x=100, y=200;
	void add() {
		System.out.println("Addition is: " + (x+y));
	}
public static void main(String args[]) {
	Method1 a=new Method1();
	System.out.println("First variable is: " + a.x);
	System.out.println("Second variable is: " + a.y);
	a.add();
	//Every memory have its own independent memory
	//Any change in one memory will not reflect another memory(object)
	Method1 b = new Method1();
	b.x=500;
	b.y=200;
	System.out.println("First value is: " + b.x);
	System.out.println("Second value is: " + b.y);
	b.add();
	
	
}
}

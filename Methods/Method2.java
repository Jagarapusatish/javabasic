package Methods;

public class Method2 {
	static int x = 100; //class variable
	static int y = 50;
	void add() {
		int y =20; //local variable
		System.out.println("output from add is : " + (x+y));
	}
	public static void main(String args[]) {
		int y = 30;
		Method2 obj = new Method2();
		obj.add();
		
		System.out.println("output from main is : " + (x+y));
		
	}

}

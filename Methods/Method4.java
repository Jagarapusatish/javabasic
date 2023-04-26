package Methods;

public class Method4 {
	void add() {
		int x= 50, y=5;
		System.out.println("Addition is : " + (x+y));
	}
	
	int sub() {
		int x=100, y=25;
		return (x-y);

	}
	float mul() {

		return (4.5f*5.5f);
	}
	boolean whichIsGreaterNumber() {
		int x=5, y=4;
		return x>y;
	}
	String EnterMyName() {
		return "Satish";
	}
	public static void main (String args[]) {
		Method4 obj = new Method4();
		obj.add();
		System.out.println("Sub output is : " + obj.sub());
		System.out.println(obj.EnterMyName());
		System.out.println(obj.whichIsGreaterNumber());
		System.out.println(obj.mul());
	}

}

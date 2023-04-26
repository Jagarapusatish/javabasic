package Methods;

public class Method3 {
	//Return type of method
	int add(){
		int a=25;
		return a;
		
	}
	public static void main (String args[]) {
		Method3 obj = new Method3();
		System.out.println("output from add is : " + obj.add());
	}

}

/*
'return' is a keyword.
'return' is used to get the control out of a method suddenly.
It is recommended to use 'return' only once per method.
'return' should be used only in methods.
it is also used to carry a label variable to the calling method line.
*/
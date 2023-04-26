package basic;

public class DataTypeConversion2 {
	public static void main(String[] args) {
		String value = "2000";
		System.out.println(value + "  This is string value");
		//converting value from string to integer
		//Type-casting
		int v1=Integer.parseInt(value);
		System.out.println(v1+" This is converted value from string to int");
		//converting value from string to float
		float v2=Float.parseFloat(value);
		System.out.println(v2 + " This is converted value from string to float");
		//converting value from string to boolean
		boolean v3=Boolean.parseBoolean(value);
		System.out.println(v3+" This is converted value from string to boolean" );
		//converting value from integer to string
		int a=100;
		String v4=Integer.toString(a);
		System.out.println(v4 + "  converted value from int to string" );
		//converting value from float to string
		float b = 25.25f;
		String v5=Float.toString(b);
		System.out.println(v5+" converted value from float to string ");
	}

}

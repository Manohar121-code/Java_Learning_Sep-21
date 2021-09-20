package learn.basics.methods;

public class MethodsWithParameterEx {
	public static void main(String[] args) {
		testInt(10);
		System.out.println("--------------");
		
		testString("java");
		
		System.out.println("--------------");
		
		testBoolean(true);
		
		System.out.println("--------------");
		
		testIntAndString(20, "Ferrari");
	}
	
	public static void testInt(int i) {
		System.out.println("test() called");
		System.out.println("parameter sent - "+ i);
	}
	
	public static void testString(String s) {
		System.out.println("test() called");
		System.out.println("parameter sent - "+ s);
	}
	
	public static void testBoolean(boolean b) {
		System.out.println("test() called");
		System.out.println("parameter sent - "+ b);
	}
	
	public static void testIntAndString(int i, String s) {
		System.out.println("test() called");
		System.out.println("parameter sent - "+ i +" , "+ s);
	}
}

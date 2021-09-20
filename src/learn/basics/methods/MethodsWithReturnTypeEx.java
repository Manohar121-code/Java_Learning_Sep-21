package learn.basics.methods;

public class MethodsWithReturnTypeEx {
	public static void main(String[] args) {
		int result = testInt();
		System.out.println(result);
		
		System.out.println("--------");
		
		double d = testDouble();
		System.out.println(d);
		
		System.out.println("--------");
		
		System.out.println(testChar());
	}
	
	public static int testInt() {
		int i = 20;
		return i;
	}
	
	public static double testDouble() {
		double d = 767.7657;
		return d;
	}
	
	public static char testChar() {
		char ch = 'H';
		return ch;
	}
}

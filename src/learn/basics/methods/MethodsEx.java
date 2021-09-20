package learn.basics.methods;

public class MethodsEx {
	public static void main(String[] args) {
		test();
	}
	
	//syntax
//	<access_modifier> <static/non-static> <return_type> <identifier>(arguments-optional) {
//		
//	}
	
	public static void test() {
		System.out.println("test() called");
		sample();
	}
	
	public static void sample() {
		System.out.println("sample() called");
	}
}

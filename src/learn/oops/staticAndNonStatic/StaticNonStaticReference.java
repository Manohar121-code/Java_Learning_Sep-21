package learn.oops.staticAndNonStatic;

public class StaticNonStaticReference {
	
	int i = 10;
	static int j = 20;
	
	public static void main(String[] args) {
		System.out.println(j);
//		System.out.println(i);
		staticMethod2();
//		nonStaticMethod1();
//		nonStaticMethod2();
	}
	
	public static void staticMethod2() {
		System.out.println(j);
//		System.out.println(i);
//		nonStaticMethod1();
//		nonStaticMethod2();
	}
	
	public void nonStaticMethod1() {
		System.out.println(i);
		System.out.println(j);
		staticMethod2();
		nonStaticMethod2();
	}
	
	public void nonStaticMethod2() {
		System.out.println(i);
		System.out.println(j);
		staticMethod2();
		nonStaticMethod1();
	}
}

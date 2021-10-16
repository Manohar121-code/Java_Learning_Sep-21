package learn.oops.privateFinalStatic;

public class Parent {

	private void privateMethod() {
		System.out.println("Parent privateMethod() called");
	}
	
	final void finalMethod() {
		System.out.println("Parent finalMethod() called");
	}
	
	static void staticMethod() {
		System.out.println("Parent staticMethod() called");
	}
	
}

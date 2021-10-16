package learn.oops.privateFinalStatic;

public class Child extends Parent {

	//you can just inherit final methods but you can't override.
	
//	final void finalMethod() {
//		System.out.println("Child finalMethod() called");
//	}
	
	static void staticMethod() {
		System.out.println("Child stticMethod() called");
	}
	
}

package learn.oops.abstraction.interfaces.inheritance.multiLevel;

public class ImplClass implements ISuperChild {

	@Override
	public void m2() {
		System.out.println("ImplClass m2() called");
	}

	@Override
	public void m1() {
		System.out.println("ImplClass m1() called");
	}

	@Override
	public void m3() {
		System.out.println("ImplClass m3() called");
	}
	
	public static void main(String[] args) {
		ImplClass obj1 = new ImplClass();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		
		System.out.println("-------------");
		
		ISuperChild obj2 = new ImplClass();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		
		System.out.println("-------------");
		
		IChild obj3 = new ImplClass();
		obj3.m1();
		obj3.m2();
		
		System.out.println("-------------");
		
		IParent obj4 = new ImplClass();
		obj4.m1();
	}

}

package learn.oops.abstraction.interfaces.inheritance.multiple;

public class ImplClass implements IChild {

	@Override
	public void m1() {
		System.out.println("ImplClass m1() called");
	}

	@Override
	public void test() {
		System.out.println("ImplClass test() called");
	}

	@Override
	public void m2() {
		System.out.println("ImplClass m2() called");
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
		obj1.test();
		
		System.out.println("-----------");
		
		IChild obj2 = new ImplClass();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		obj2.test();
		
		System.out.println("-----------");
		
		IParent1 obj3 = new ImplClass();
		obj3.m1();
		obj3.test();
		
		System.out.println("-----------");
		
		IParent2 obj4 = new ImplClass();
		obj4.m2();
		obj4.test();
	}

}

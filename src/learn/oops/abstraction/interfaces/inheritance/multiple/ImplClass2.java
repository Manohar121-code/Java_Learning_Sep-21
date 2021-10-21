package learn.oops.abstraction.interfaces.inheritance.multiple;

public class ImplClass2 implements IParent1, IParent2 {

	@Override
	public void m2() {
		System.out.println("ImplClass2 m2() called");
	}

	@Override
	public void m1() {
		System.out.println("ImplClass2 m1() called");
	}

	@Override
	public void test() {
		System.out.println("ImplClass2 test() called");
	}
	
	public static void main(String[] args) {
		ImplClass2 obj1 = new ImplClass2();
		obj1.m1();
		obj1.m2();
		obj1.test();
		
		System.out.println("----------");
		
		IParent1 obj2 = new ImplClass2();
		obj2.m1();
		obj2.test();
		
		System.out.println("----------");
		
		IParent2 obj3 = new ImplClass2();
		obj3.m2();
		obj3.test();
		
	}

}

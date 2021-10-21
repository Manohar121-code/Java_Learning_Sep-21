package learn.oops.abstraction.interfaces.inheritance.heirarchical;

public class ImplClass1 implements IChild1 {

	@Override
	public void m1() {
		System.out.println("ImplClass1 m1() called");
	}

	@Override
	public void m2() {
		System.out.println("ImplClass1 m2() called");
	}
	
	public static void main(String[] args) {
		ImplClass1 obj1 = new ImplClass1();
		obj1.m1();
		obj1.m2();
		
		System.out.println("------------");
		
		IChild1 obj2 = new ImplClass1();
		obj2.m1();
		obj2.m2();
		
		System.out.println("------------");
		
		IParent obj3 = new ImplClass1();
		obj3.m1();
	}

}

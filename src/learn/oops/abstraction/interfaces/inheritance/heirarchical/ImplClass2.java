package learn.oops.abstraction.interfaces.inheritance.heirarchical;

public class ImplClass2 implements IChild2 {

	@Override
	public void m1() {
		System.out.println("ImplClass2 m1() called");
	}

	@Override
	public void m3() {
		System.out.println("ImplClass2 m3() called");
	}
	
	public static void main(String[] args) {
		ImplClass2 obj1 = new ImplClass2();
		obj1.m1();
		obj1.m3();
		
		System.out.println("------------");
		
		IChild2 obj2 = new ImplClass2();
		obj2.m1();
		obj2.m3();
		
		System.out.println("------------");
		
		IParent obj3 = new ImplClass2();
		obj3.m1();
	}

}

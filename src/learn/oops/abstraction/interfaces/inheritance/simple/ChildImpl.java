package learn.oops.abstraction.interfaces.inheritance.simple;

public class ChildImpl implements IChild {

	@Override
	public void m1() {
		System.out.println("ChilImpl m1() called");
	}

	@Override
	public void m2() {
		System.out.println("ChilImpl m2() called");
	}
	
	public static void main(String[] args) {
		ChildImpl obj1 = new ChildImpl();
		obj1.m1();
		obj1.m2();
		
		System.out.println("------------------");
		
		IChild obj2 = new ChildImpl();
		obj2.m1();
		obj2.m2();
		
		System.out.println("------------------");
		
		IParent obj3 = new ChildImpl();
		obj3.m1();
	}

}

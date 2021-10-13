package learn.oops.polymorphism.methodOverriding;

public class MethodOverridingEx {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.test();
		p.sample();
		
		System.out.println("------------------");
		
		Child c = new Child();
		c.test();
		c.sample();
	}
}

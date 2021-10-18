package learn.oops.typeCasting;

public class ClassTypeCastingEx {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1();
		p.m2();
		p.m3();
		
		System.out.println("-------------");
		
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		
		System.out.println("--------------");
		
		Parent obj = new Child(); //up casting
		obj.m1();
		obj.m2();
		obj.m3();
		
//		Child obj2 = new Parent();
//		obj2.m4();
		
		System.out.println("--------------");
		
		Child obj2 = (Child) obj;//down casting
		obj2.m1();
		obj2.m2();
		obj2.m3();
		obj2.m4();
		
		System.out.println("---------------");
		
		Parent p1 = new Parent();
		
		if (p1 instanceof Child) {
			Child c1 = (Child) p1;
			c1.m1();
		}
		
		sample(new Parent()); //Parent obj = new Parent();
		sample(new Child());  //Parent obj = new Child();
		
	}
	
	public static void sample(Parent obj) {
		if (obj instanceof Child) {
			Child c = (Child) obj;
		}
	}
}

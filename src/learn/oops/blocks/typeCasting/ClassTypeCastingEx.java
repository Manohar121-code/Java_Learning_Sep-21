package learn.oops.blocks.typeCasting;

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
	}
}

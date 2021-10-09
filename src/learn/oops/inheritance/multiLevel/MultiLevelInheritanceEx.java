package learn.oops.inheritance.multiLevel;

public class MultiLevelInheritanceEx {
	public static void main(String[] args) {
		GrandFather obj1 = new GrandFather();
		obj1.setGfProp1(1);
		obj1.setGfProp2("Gopal");
		
		System.out.println(obj1.getGfProp1());
		System.out.println(obj1.getGfProp2());
		
		System.out.println("--------------------");
		
		Father obj2 = new Father();
		obj2.setGfProp1(1);
		obj2.setGfProp2("Gopal");
		obj2.setfProp1(2);
		obj2.setfProp2("Raghu");
		
		System.out.println(obj2.getGfProp1());
		System.out.println(obj2.getGfProp2());
		System.out.println(obj2.getfProp1());
		System.out.println(obj2.getfProp2());
		
		System.out.println("--------------------");
		
		Child obj3 = new Child();
		obj3.setGfProp1(1);
		obj3.setGfProp2("Gopal");
		obj3.setfProp1(2);
		obj3.setfProp2("Raghu");
		obj3.setcProp1(3);
		obj3.setcProp2("Manohar");
		
		System.out.println(obj3.getGfProp1());
		System.out.println(obj3.getGfProp2());
		System.out.println(obj3.getfProp1());
		System.out.println(obj3.getfProp2());
		System.out.println(obj3.getcProp1());
		System.out.println(obj3.getcProp2());
	}
}

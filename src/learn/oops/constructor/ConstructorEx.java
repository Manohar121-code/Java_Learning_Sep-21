package learn.oops.constructor;

public class ConstructorEx {
	public static void main(String[] args) {
		
		Employee obj1 = new Employee();
		obj1.id = 10;
		obj1.name = "Surya";
		
		System.out.println(obj1.id);
		System.out.println(obj1.name);
		
		System.out.println("--------------------");
		
		Employee obj2 = new Employee(1, "Naresh");
		
		System.out.println(obj2.id);
		System.out.println(obj2.name);
		
		System.out.println("--------------------");
		
		Employee obj3 = new Employee(20);
		
		System.out.println(obj3.id);
		System.out.println(obj3.name);
		
		System.out.println("--------------------");
		
		Employee obj4 = new Employee("Suresh");
		
		System.out.println(obj4.id);
		System.out.println(obj4.name);
	}
}

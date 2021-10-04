package learn.oops.constructor;

public class Employee {
	int id;
	String name;
	
	//syntax
//	<access_modifier> <class_name>() {
//		
//	}
	
	public Employee() {
		System.out.println("Object is created by using default constructor");
	}
	
	public Employee(int id, String name) {
		//object is created
		System.out.println("Object is created by using parameterized constructor");
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id) {
		System.out.println("Object is created by using parameterized constructor");
		this.id = id;
	}
	
	public Employee(String name) {
		System.out.println("Object is created by using parameterized constructor");
		this.name = name;
	}
	
	public void test() {
		System.out.println("test() called");
	}
}

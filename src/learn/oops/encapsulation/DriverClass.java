package learn.oops.encapsulation;

public class DriverClass {
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setId(10);
		obj.setName("Santhosh");
		obj.setSalary(57658768);
		
		System.out.println(obj);
	}
}

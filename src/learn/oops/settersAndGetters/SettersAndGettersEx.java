package learn.oops.settersAndGetters;

public class SettersAndGettersEx {
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.setId(1);
		obj1.setName("Praneeth");
		obj1.setSalary(765765898);
		
		int id = obj1.getId();
		String name = obj1.getName();
		long salary = obj1.getSalary();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}

package learn.oops.staticAndNonStatic;

public class EmployeeSignUp {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empId = 1;
		e1.empName = "Jagadeesh";
		e1.salary = 75757;
		e1.country = "India";
		
		System.out.println(e1.empId);
		System.out.println(e1.empName);
		System.out.println(e1.salary);
		System.out.println(e1.country);
		
		System.out.println("--------------------");
		
		Employee e2 = new Employee();
		e2.empId = 2;
		e2.empName = "Naresh";
		e2.salary = 35476;
		e2.country = "America";
		
		System.out.println(e2.empId);
		System.out.println(e2.empName);
		System.out.println(e2.salary);
		System.out.println(e2.country);
		
		System.out.println("Employee1 country - "+e1.country);
		
		System.out.println("--------------");
		
		Employee.country = "Australia";
		System.out.println(Employee.country);
		System.out.println("Employee1 country - "+e1.country);
		System.out.println("Employee2 country - "+e2.country);
		
	}
}

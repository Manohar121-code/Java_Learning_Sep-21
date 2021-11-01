package learn.oops.part3.collectons.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import learn.oops.encapsulation.Employee;

public class GenericsEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("--------------");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
		
		System.out.println("----------------------------------");
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Sathish", 76576));
		employeeList.add(new Employee(2, "Ranjith", 65767));
		employeeList.add(new Employee(3, "Chandra", 86857));
		
		for (Employee e : employeeList) {
			System.out.println(e);
		}
	}
}

package learn.oops.garbageCollection;

import learn.oops.encapsulation.Employee;

public class GarbageCollectionEx {
	public static void main(String[] args) {
		
		Employee o1 = new Employee();
		
		Employee o2 = new Employee();
		
		o1 = new Employee();
		
		//-------------------------
		
		Employee obj = new Employee();
		
		obj = null;
		
		//-------------------------
		
		Employee e1 = new Employee();
		
		Employee e2 = e1;
		
		e1 = null;
		
		//-------------------------
		
		//approach1
		System.gc();
		
		//approach2
		Runtime.getRuntime().gc();		
	}
}

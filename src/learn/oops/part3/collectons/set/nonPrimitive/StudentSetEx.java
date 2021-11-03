package learn.oops.part3.collectons.set.nonPrimitive;

import java.util.HashSet;
import java.util.Set;

public class StudentSetEx {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		Student s1 = new Student(1, "Mahesh", 20);
		Student s2 = new Student(2, "Kiran", 25);
		Student s3 = new Student(3, "Lokesh", 23);
		Student s4 = new Student(1, "Mahesh", 22);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println(set.size());
		
		for (Student s : set) {
			System.out.println(s);
		}
	}
}

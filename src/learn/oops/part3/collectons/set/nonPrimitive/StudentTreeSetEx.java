package learn.oops.part3.collectons.set.nonPrimitive;

import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSetEx {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();
		
		Student s1 = new Student(1, "Mahesh", 23);
		Student s2 = new Student(2, "Arjun", 35);
		Student s3 = new Student(3, "Pawan", 38);
		Student s4 = new Student(2, "Arjun", 35);

		set.add(s2);
		set.add(s4);
		set.add(s1);
		set.add(s3);
		
		System.out.println("size - "+ set.size());
		
		for (Student s : set) {
			System.out.println(s);
		}
	}
}

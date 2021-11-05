package learn.oops.part3.collectons.set.nonPrimitive;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudentEx2 {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet(new SortByName());

		Student s1 = new Student(1, "Mahesh", 23);
		Student s2 = new Student(2, "Arjun", 35);
		Student s3 = new Student(3, "Pawan", 38);
		Student s4 = new Student(2, "Arjun", 35);

		set.add(s2);
		set.add(s4);
		set.add(s1);
		set.add(s3);

		System.out.println("size - " + set.size());

		for (Student s : set) {
			System.out.println(s);
		}
		
		System.out.println("---------------------------------------");
		
		Set<Student> set2 = new TreeSet<>(new SortByAge());
		
		Student s5 = new Student(1, "Mahesh", 23);
		Student s6 = new Student(2, "Arjun", 35);
		Student s7 = new Student(3, "Pawan", 38);
		Student s8 = new Student(2, "Arjun", 35);

		set2.add(s6);
		set2.add(s8);
		set2.add(s5);
		set2.add(s7);

		System.out.println("size - " + set2.size());

		for (Student s : set2) {
			System.out.println(s);
		}
	}
}

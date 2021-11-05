package learn.oops.part3.collectons.set.nonPrimitive;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

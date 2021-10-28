package learn.oops.part3.collectons.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		
		List al = new ArrayList();
		
		int i = 10;
		String s = "python";
		double d = 10.23;
		float f = 12.34f;
		boolean b = true;
		char ch = 'G';
		
		int size = al.size();
		System.out.println("Before inserting the elements, size - "+ size);
		
		al.add(i);
		al.add(s);
		al.add(d);
		al.add(f);
		al.add(b);
		al.add(ch);
		
		int size2 = al.size();
		System.out.println("After inserting the elements, size - "+ size2);
		
		for (int j = 0; j < al.size(); j++) {
			Object obj = al.get(j);
			System.out.println(obj);
		}
		
	}
}

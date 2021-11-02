package learn.oops.part3.collectons.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(10);
		set.add(30);
		set.add("Harish");
		set.add(10);
		set.add("Naresh");
		set.add("Harish");
		
		System.out.println("size - "+ set.size());
		
		for (Object obj : set) {
			System.out.println(obj);
		}
		
		System.out.println("---------------");
		
		Set set2 = new HashSet();
		set2.add(60);
		set2.add("Naresh");
		set2.add(10);
		set2.add("Praveen");
		
		set.addAll(set2);
		printSet(set);
		
		set.add(null);
		set.add(null);
		
		printSet(set);
		
//		set.clear();
//		System.out.println("size - "+ set.size());
		
		boolean contains = set.contains(60);
		System.out.println("Contains 60? "+ contains);
		
		boolean empty = set.isEmpty();
		System.out.println("Empty? "+ empty);
		
		System.out.println("**************");
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Object obj = (Object) itr.next();
			System.out.println(obj);
		}
		System.out.println("**************");
		
		boolean remove = set.remove("Praveen");
		printSet(set);
	}
	
	private static void printSet(Set set) {
		System.out.println("*********************");
		for (Object object : set) {
			System.out.println(object);
		}
		System.out.println("*********************");
	}
}

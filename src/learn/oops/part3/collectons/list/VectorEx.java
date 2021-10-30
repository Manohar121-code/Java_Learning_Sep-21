package learn.oops.part3.collectons.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		List list = new Vector();
		list.add(25);
		list.add("Mahesh");
		list.add(true);
		list.add(2656.34);
		
		int size = list.size();
		System.out.println("size - "+ size);
		
		printList(list);
		
		list.add(2, "Naresh");
		
		printList(list);
		
//		list.clear();
//		
//		System.out.println("size - "+ list.size());
		
		boolean contains = list.contains("Mahesh");
		System.out.println("List contains Mahesh? "+ contains);
		
		System.out.println("size - "+ list.size());
		
		Object object = list.get(3);
		System.out.println("3rd index element - "+object);
		
		int indexOf = list.indexOf("Naresh");
		System.out.println("Naresh index - "+ indexOf);
		
		System.out.println("List empty? "+ list.isEmpty());
		
		System.out.println("----------------------");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object2 = (Object) iterator.next();
			System.out.println(object2);
		}
		System.out.println("----------------------");
		
		list.set(3, "Jagadeesh");
		
		printList(list);
	}
	
	private static void printList(List list) {
		System.out.println("**********************");
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		System.out.println("**********************");
	}
}

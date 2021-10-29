package learn.oops.part3.collectons.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		int i = 10;
		String s = "python";
		double d = 10.23;
		float f = 12.34f;
		boolean b = true;
		char ch = 'G';
		
		int size = list.size();
		System.out.println("Before inserting the elements, size - "+ size);
		
		list.add(i);
		list.add(s);
		list.add(d);
		list.add(f);
		list.add(b);
		list.add(ch);
		
		int size2 = list.size();
		System.out.println("After inserting the elements, size - "+ size2);
		
		for (int j = 0; j < list.size(); j++) {
			Object obj = list.get(j);
			System.out.println(obj);
		}
		
		System.out.println("---------------------");
		
		list.add(1, "java");
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------");
		
		List al2 = new ArrayList();
		al2.add(765);
		al2.add("golang");
		
		list.addAll(al2);
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("---------------------");

//		list.clear();
//		
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
		
		System.out.println("---------------------");
		
		boolean contains = list.contains("c++");
		System.out.println("List contains c++? "+ contains);
		
		System.out.println("---------------------");
		
		int indexOf = list.indexOf("java");
		System.out.println("Index of java - "+ indexOf);
		
		System.out.println("---------------------");
		
		boolean empty = list.isEmpty();
		
		System.out.println("List is empty? "+ empty);
		
		System.out.println("---------------------");
		
		list.add(2, 5);
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println(object);
		}
		
		System.out.println("---------------------");
		
		Object remove = list.remove(5);
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("----------------------");
		
		boolean remove2 = list.remove("python");
		
		printList(list);
		
		int val = 5;
		Integer iObj = val; //boxing
		list.remove(iObj);
		
		printList(list);
		
		list.set(5, 800);
		
		printList(list);
		
		List subList = list.subList(2, 5);
		
		printList(subList);
	}
	
	private static void printList(List list) {
		System.out.println("**************************");
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("**************************");
	}
}

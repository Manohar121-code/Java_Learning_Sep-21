package learn.oops.part3.collectons.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {

		LinkedList list = new LinkedList(); // upcasting
		list.add(10);
		list.add(20);
		list.add("Java");

		printList(list);
		
		list.add(2, "Python");
		
		printList(list);
		
		list.addFirst(1);
		
		printList(list);
		
		list.addLast("last Element");
		
		printList(list);
		
		Object object = list.get(3);
		System.out.println("3rd index element in list - "+ object);
		
		Object first = list.getFirst();
		System.out.println("First element in LL - "+ first);
		
		Object last = list.getLast();
		System.out.println("Last element in LL - "+ last);
		
		System.out.println("-------------");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object object2 = (Object) itr.next();
			System.out.println(object2);
		}
		System.out.println("-------------");
		
		Object removeFirst = list.removeFirst();
		
		printList(list);
		
		Object removeLast = list.removeLast();
		
		printList(list);
	}

	private static void printList(LinkedList list) {
		System.out.println("**********************");

		for (Object object : list) {
			System.out.println(object);
		}

		System.out.println("**********************");
	}
}

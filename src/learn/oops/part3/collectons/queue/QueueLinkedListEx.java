package learn.oops.part3.collectons.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListEx {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		for (Integer i : queue) {
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		Iterator<Integer> itr = queue.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		Integer peek = queue.peek();
		System.out.println("Peek elemenet -> "+peek);
		
		Integer poll = queue.poll();
		System.out.println("Polled element -> "+ poll);
		
		Integer peek2 = queue.peek();
		System.out.println("peek element after poll -> "+ peek2);
		
		System.out.println(queue.size());
		
		System.out.println("----------------");
		
		queue.add(4);
		queue.add(5);
		
		while (queue.peek() != null) {
			Integer obj = queue.poll();
			System.out.println(obj);
		}
		
		System.out.println("size - "+ queue.size());
	}
}

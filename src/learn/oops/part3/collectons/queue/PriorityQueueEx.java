package learn.oops.part3.collectons.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(5);
		queue.add(1);
		queue.add(4);
		queue.add(3);
		
		for (Integer i : queue) {
			System.out.println(i);
		}
		
		System.out.println("--------------");
		
		while (queue.peek() != null) {
			System.out.println(queue.poll());
		}
	}
}

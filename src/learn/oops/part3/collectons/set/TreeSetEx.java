package learn.oops.part3.collectons.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(30);
		set.add(10);
		set.add(20);
		set.add(50);
		set.add(15);
		
		printSet(set);
		
		Set set2 = new TreeSet();
		set2.add(35);
		set2.add(20);
		set2.add(60);
		set2.add(25);
		
		set.addAll(set2);
		printSet(set);
	}
	
	private static void printSet(Set set) {
		System.out.println("*******************");
		for (Object obj : set) {
			System.out.println(obj);
		}
		System.out.println("*******************");
	}
}

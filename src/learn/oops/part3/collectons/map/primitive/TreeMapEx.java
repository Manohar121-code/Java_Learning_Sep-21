package learn.oops.part3.collectons.map.primitive;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(4, "Naresh");
		map.put(6, "Lokesh");
		map.put(2, "Rohit");
		map.put(1, "Rahul");
		
		printMap(map);
		
		Map<String, Integer> map2 = new TreeMap<>();
		map2.put("Karun", 25);
		map2.put("Lokesh", 46);
		map2.put("Ganesh", 26);
		map2.put("Harish", 28);
		
		printMap2(map2);
	}
	
	private static void printMap(Map<Integer, String> map) {
		System.out.println("***********************");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			String value = map.get(key);
			System.out.println(key+" - "+value);
		}
		System.out.println("***********************");
	}
	
	private static void printMap2(Map<String, Integer> map) {
		System.out.println("***********************");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key+" - "+value);
		}
		System.out.println("***********************");
	}
}

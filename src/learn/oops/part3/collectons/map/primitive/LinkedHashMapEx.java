package learn.oops.part3.collectons.map.primitive;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("Karun", 25);
		map.put("Lokesh", 46);
		map.put("Ganesh", 26);
		map.put("Harish", 28);
		
		printMap(map);
		
		map.put("Karun", 26);
		
		printMap(map);
		
		map.remove("Harish");
		
		printMap(map);
		
		map.put(null, 0);
		
		printMap(map);
		
	}

	private static void printMap(Map<String, Integer> map) {
		System.out.println("***********************");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key+" - "+value);
		}
		System.out.println("***********************");
	}
	
	
}

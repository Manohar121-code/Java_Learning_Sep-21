package learn.oops.part3.collectons.map.primitive;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Sachin");
		map.put(7, "Dhoni");
		map.put(18, "Kohli");
		map.put(45, "Rohit");
		
		String val = map.get(7);
		System.out.println(val);
		
		map.put(null, "Null Value");
		
		System.out.println("size - "+ map.size());
		
		String string = map.get(null);
		System.out.println(string);
		
		String string2 = map.get(17);
		System.out.println("value for 17 key - "+ string2);
		
		boolean containsKey = map.containsKey(18);
		System.out.println("18 is present? "+ containsKey);
		
		String orDefault = map.getOrDefault(17, "ABD");
		System.out.println(orDefault);
		
		boolean empty = map.isEmpty();
		System.out.println("map empty? "+ empty);
		
//		map.clear();
//		System.out.println("map empty? "+ map.isEmpty());
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(17, "ABD");
		map2.put(8, "Yuvraj");
		
		map.putAll(map2);
		
		System.out.println(map.size());
		System.out.println(map.get(45));
		map.put(45, "Rohit Sharma");
		System.out.println(map.size());
		System.out.println(map.get(45));
		
		System.out.println(map.get(10));
		map.put(10, "Sachin Tendulkar");
		System.out.println(map.get(10));
		
		String remove = map.remove(18);
		System.out.println(map.get(18));
		
		map.put(18, "Virat Kohli");
		map.put(55, "Virat Kohli");
		
		System.out.println("-----------------");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			String value = map.get(key);
			System.out.println(key+" - "+ value);
		}
		System.out.println("-----------------");
		
		Collection<String> values = map.values();
		for (String value2 : values) {
			System.out.println(value2);
		}
		
		System.out.println("-----------------");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" - "+ value);
		}
	}
}

package learn.oops.part3.collectons.map.nonPrimitive;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapEx {
	public static void main(String[] args) {
		Map<Employee, Boolean> map = new LinkedHashMap<>();
		
		Employee e1 = new Employee(1, "Harish", 57657);
		Employee e2 = new Employee(2, "Prashanth", 25627);
		Employee e3 = new Employee(3, "Rajesh", 44765);
		Employee e4 = new Employee(3, "Rajesh", 44765);

		map.put(e3, true);
		map.put(e1, true);
		map.put(e2, false);
		map.put(e4, true);
		
		System.out.println(map.size());
		
		Set<Employee> keySet = map.keySet();
		for (Employee key : keySet) {
			Boolean value = map.get(key);
			System.out.println(key+" -> "+ value);
		}
		
		System.out.println("-------------");
		
		Set<Entry<Employee, Boolean>> entrySet = map.entrySet();
		for (Entry<Employee, Boolean> entry : entrySet) {
			Employee key = entry.getKey();
			Boolean value = entry.getValue();
			System.out.println(key+" -> "+ value);
		}
	}
}

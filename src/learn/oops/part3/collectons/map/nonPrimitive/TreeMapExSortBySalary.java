package learn.oops.part3.collectons.map.nonPrimitive;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExSortBySalary {
	public static void main(String[] args) {
		SortBySalary sortBySalary = new SortBySalary();
		Map<Employee, Boolean> map = new TreeMap<>(sortBySalary);
		
		Employee e1 = new Employee(1, "Harish", 57657);
		Employee e2 = new Employee(2, "Rajesh", 25627);
		Employee e3 = new Employee(3, "Prashanth", 44765);
		Employee e4 = new Employee(3, "Prashanth", 44765);
		
		map.put(e1, true);
		map.put(e2, false);
		map.put(e3, true);
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

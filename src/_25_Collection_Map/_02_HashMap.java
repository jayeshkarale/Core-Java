package _25_Collection_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _02_HashMap {
	public static void main(String[] args) {
		
		Map<Integer, String> names = new HashMap<Integer, String>();
		
		names.put(1, "Mauli");
		names.put(5, "Jethalal");
		names.put(3, "Salman");
		names.put(2, "Sotya");
		System.out.println(names);
		
		System.out.println(names.get(2));
		
		Set<Integer> KeySet = names.keySet();
		System.out.println(KeySet);
		
		System.out.println(names.containsValue("Salman"));
		
		names.remove(1);
		System.out.println(names);
	}

}

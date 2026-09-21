package _23_Collection_Map;   // --- 07/08/2026

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _01_LearnMap {
	public static void main(String[] args) {
		
		Map<Integer, String> flowers = new HashMap<Integer, String>();  // HashMap
		
		flowers.put(1, "Rose");
		flowers.put(5, "Sunflower");
		flowers.put(3, "Lotus");
		flowers.put(4, "Lily");
		System.out.println(flowers);
		
		for (Map.Entry<Integer, String> f : flowers.entrySet()) {
			System.out.println(f.getKey()+" : "+f.getValue());
		}
		
		Map<Integer, String> colors = new LinkedHashMap<Integer, String>();  // // LinkedHashMap
		colors.put(1, "blue");
		colors.put(3, "red");
		colors.put(2, "black");
		colors.put(5, "purple");
		System.out.println(colors);
		
		Map<Integer, String> names = new TreeMap<Integer, String>();  // // TreeMap
		names.put(8,"Jayesh");
		names.put(15,"Shashwat");
		names.put(5,"Sagar");
		names.put(2,"Kiran");
		System.out.println(names);
	}

}

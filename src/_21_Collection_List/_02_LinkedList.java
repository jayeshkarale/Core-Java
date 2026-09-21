package _21_Collection_List;

import java.util.LinkedList;

public class _02_LinkedList {
	public static void main(String[] args) {
		
		LinkedList<String> FruitsList = new LinkedList<>();
		
		FruitsList.add("Mango");
		FruitsList.add("Apple");
		FruitsList.add("Banana");
		FruitsList.add("Orange");
		
		System.out.println(FruitsList);
		
		System.out.println(FruitsList.get(2));  // access element by index.
		
		FruitsList.add(2, "Sugercane");  // update element by index.
		System.out.println(FruitsList);
		
		FruitsList.remove(2);  // remove element by index.
		System.out.println(FruitsList);
		
		System.out.println(FruitsList.contains("Mango"));
	}

}

package _22_Collection_Sets;

import java.util.Set;
import java.util.HashSet; 

public class _04_Prorams01 {
	public static void main(String[] args) {
		
		int arr1[] = {10,20,30,90,60};
		int arr2[] = {10,20,90,80,70,20};
		
//		for (int i = 0; i < a1.length; i++) {
//			for (int j = 0; j < a2.length; j++) {
//				if (a1[i]==a2[j]) {
//					System.out.println(a1[i]);
//				}
//			}
//		}
		
		Set<Integer> set1 = new HashSet<>();  // convert arrays to sets.
		Set<Integer> set2 = new HashSet<>();
		
		for (int n : arr1) {
			set1.add(n);
		}
		
		for (int n : arr2) {
			set2.add(n);
		}
		
		HashSet<Integer> common = new HashSet<Integer>(); // find all common elements.
		common.addAll(set1);
		common.retainAll(set2);
		System.out.println("Common Elements: "+common);
		
		HashSet<Integer> unique = new HashSet<Integer>(); // find all unique elements.
		unique.addAll(set1);
		unique.addAll(set2);
		System.out.println("Unique Elements: "+unique);
		
		System.out.println("Count of Unique Elements: "+unique.size());
				
	}

}

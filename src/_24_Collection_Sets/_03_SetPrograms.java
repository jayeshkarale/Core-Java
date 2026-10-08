package _24_Collection_Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _03_SetPrograms {
	public static void main(String[] args) {
		
		int a[] = {12, 34, 56, 78, 88};
		
		Set<Integer> nums = new HashSet<Integer>();
		for (Integer n : a){
			nums.add(n);
		}
		System.out.println(nums);
	}

}

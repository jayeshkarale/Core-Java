package _18_Arrays;

public class _01_CreateArray {
	public static void main(String[] args) {
		
//	Creating Array in java.  20/06/2026
		
	int marks[]  = new int[3];
	marks[0] = 96;  // mathematics
	marks[1] = 85;  // physics
	marks[2] = 89;  // chemistry
	
//	int marks[] = {96, 85, 89}; // when we know array values.
	
	for(int i=0; i<marks.length; i++) {         // or marks.length = 3
		System.out.println(marks[i]);
	}
	
  }

}

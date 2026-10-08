package _18_Arrays;
import java.util.*; 

public class _03_ArrayInput {
	public static void main(String[] args) {
		
//		Create array input its size, values and print.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int marks[] = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter array value: ");
			marks[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			System.out.print("Array is: "+marks[i]+" ");
		}
		sc.close();
	}

}

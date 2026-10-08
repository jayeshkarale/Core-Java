package _20_2d_Array;

import java.util.Scanner;

public class _05_SearchArray {
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
	        System.out.print("enter the size of array: ");
	        int size = sc.nextInt();
	        int number[] = new int[size];

//	        for input
	        for (int i=0;i<size;i++){
	            number[i] = sc.nextInt();
	        }

	        System.out.print("Enter Value(x) to Find: ");
	        int x =sc.nextInt();

//	        for output
	        for (int i=0;i<number.length;i++){
	            if (number[i] == x){
	                System.out.println("x found at location (index): " + i);
	            }
	        }
	}

}

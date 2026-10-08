package _20_2d_Array;
import java.util.Scanner;

// Display 2-d Array with input Elements

public class _02_Array2d {
	public static void main(String[] args) {
			
		int arr[][]=new int[2][2];
		accept(arr);
		display(arr);
		sumofElements(arr);
		avgofElements(arr);
		displayMax(arr);
	}
	
	static void accept(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("Enter Number: ");
				arr[row][col]=sc.nextInt();
			}
			sc.close();
		}
	}
	
	static void display(int[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void sumofElements(int[][] arr) {
		int sum=0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sum=sum+arr[row][col];
			}
		}
		System.out.println("Sum is: "+sum);
	}
	
	static void avgofElements(int[][] arr) {
		double sum=0;
		int count=0;
		double avg=0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sum=sum+arr[row][col];
				count++;
			}
		}
		avg=sum/count;
		System.out.println("Average is: "+avg);
	}
	
	static void displayMax(int[][] arr) {
		int max=arr[0][0];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(max<arr[row][col]) {
					max=arr[row][col];
				}
			}
			System.out.println(max);
		}
	}

}

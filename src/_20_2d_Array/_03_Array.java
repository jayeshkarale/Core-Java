package _20_2d_Array;
import java.util.Scanner;

public class _03_Array {
	public static void main(String[] args) {
		int b[][]= new int[2][3];
		
		int c[][]= {
				{10,20,30},
				{50,60,70}   };
				
		AcceptArray(b);
		DisplayArray(b);
	}
	
	static void AcceptArray(int[][] b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element: ");
		
		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[row].length; col++) {
				b[row][col]=sc.nextInt();
			}
			System.out.println();
		}
		sc.close();
	}
	
	static void DisplayArray(int[][] b) {
		Scanner sc = new Scanner(System.in);
		
		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[row].length; col++) {
				System.out.print(b[row][col]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}

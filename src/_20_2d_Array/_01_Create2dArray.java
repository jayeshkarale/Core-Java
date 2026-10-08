package _20_2d_Array;

// Display 2-D Array

public class _01_Create2dArray {
	public static void main(String[] args) {
		
		int a[][]= {
				{2,1,4},
			  	{8,3,7}
		};
		
		System.out.println("Rows: "+a.length);
		System.out.println("Columns: "+a[0].length);
		display(a);
	
	}
	
	static void display(int[][] a) {
		for(int rows=0; rows<a.length; rows++) {
			for(int col=0; col<a[rows].length; col++) {
				System.out.print(a[rows][col]+" ");
			}
			System.out.println();
		}
	}
}

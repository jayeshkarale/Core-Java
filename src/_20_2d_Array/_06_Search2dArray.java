package _20_2d_Array;

import java.util.Scanner;

public class _06_Search2dArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns]; // Create 2d Array

//        for input
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter Value(x) to Find: ");
        int x= sc.nextInt();
//        for output
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                if (matrix[i][j] == x){
                    System.out.println("x found at location: (" + i + "," + j + ")");
                }
            }
            System.out.println();
        }
	}

}

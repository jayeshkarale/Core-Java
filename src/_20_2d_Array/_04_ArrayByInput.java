package _20_2d_Array;

import java.util.Scanner;

public class _04_ArrayByInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Number of Columns: ");
        int columns = sc.nextInt();
        
        System.out.println("Enter Array Elements: ");

        int[][] matrix = new int[rows][columns];

//        for inputs
        for (int i=0;i<rows;i++){  //outer loop for rows
            //inner loop for columns
            for (int j=0;j<columns;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

//        for output
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
	}

}

package _11_Patterns;

public class _04_HollowStarRectangle {
	public static void main(String[] args) {
        int rows = 4;
        int columns = 5;

//        outer loop for rows
        for (int i=1; i<=rows; i++) {

//            inner loop for columns
            for (int j=1; j<=columns; j++) {

//                to print * at borders & ' ' for hollow part
                if (i==1 || i==rows || j==1 || j==columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

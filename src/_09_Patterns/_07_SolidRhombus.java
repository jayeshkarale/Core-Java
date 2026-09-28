package _09_Patterns;

public class _07_SolidRhombus {
	public static void main(String[] args) {
        int n=5;

        for (int i=1;i<=n;i++){
//            for printing spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            for printing stars
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

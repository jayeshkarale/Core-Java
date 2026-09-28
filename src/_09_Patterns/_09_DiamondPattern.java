package _09_Patterns;

public class _09_DiamondPattern {
	public static void main(String[] args) {
        int n=4;

//          UPPER DIAMOND PART
        for (int i=1;i<=n;i++){
//            for printing spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            for printing stars
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//          LOWER DIAMOND PART
        for (int i= n;i>=1;i--){
//            for printing spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            for printing stars
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

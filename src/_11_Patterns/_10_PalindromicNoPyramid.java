package _11_Patterns;

public class _10_PalindromicNoPyramid {
	public static void main(String args[]){
        int n=5;

        for (int i=1;i<=n;i++){
//            for printing spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            for printing 1st part numbers
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
//            for printing 2nd part numbers
            for (int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

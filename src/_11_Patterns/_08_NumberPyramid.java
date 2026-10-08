package _11_Patterns;

public class _08_NumberPyramid {
	public static void main(String[] args) {
		
		int n = 5;   // number of rows
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {   // print lending spaces
				System.out.print(" ");
			}
			
			// print numbers with trailing space
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();  // move to the next line
		}
	}

}

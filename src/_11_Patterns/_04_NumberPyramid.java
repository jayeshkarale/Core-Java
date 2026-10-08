package _11_Patterns;

public class _04_NumberPyramid {
	public static void main(String[] args) {
		
//		Print 1 to 5 Number Pyramid.
		
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {   // for printing spaces.
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {   // for printing numbers.
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

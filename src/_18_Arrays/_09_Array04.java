package _18_Arrays;
import java.util.Scanner;

public class _09_Array04 {
	public static void main(String[] args) {
        
		int arr[] = new int[5];
		
		accept(arr);
		displayPrime(arr);
	}
		
		
		// Accept Array Elements
	    public static void accept(int[] arr) {
	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print("Enter Element: ");
	            arr[i] = sc.nextInt();
	        }
			sc.close();
	    }
	    
//	    Check Prime Element
	    public static void checkPrime(int n) {
			int count=0;
			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(n+" ");
			}
		}
	    
//		Display Prime Elements
		public static void displayPrime(int []arr) {
			System.out.println("Prime Elements: ");
			for(int i=1;i<arr.length; i++) {
				checkPrime(arr[i]);
			}
	}
}

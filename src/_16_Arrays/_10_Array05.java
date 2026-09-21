package _16_Arrays;
import java.util.Scanner;

public class _10_Array05 {
	public static void main(String[] args) {

		int arr[] = {1,2,6,4,5};
		
//		acceptElements(arr);
		displaySum10(arr);
		displayPairs(arr);
		displayPairsOdd(arr);
		
	}
	
//		Accept Array Elements.
		public static void acceptElements(int[] arr) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Elements: ");
			
			for(int i=0; i<arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			sc.close();
		}
		
//		Display pairs whose sum is 10.
		public static void displaySum10(int[] arr) {
			System.out.println("Pairs Whose Sum is 10: ");
			
			for(int i=0; i<arr.length; i++) {
				for(int j=i; j<arr.length; j++) {         // doubt j=i+1 is correct or not
					if((arr[i]+arr[j])==10) {
						int sum=arr[i]+arr[j];
						System.out.println(arr[i]+","+arr[j]+"--> "+sum);
					}
				}
			}
		}
		
//		Display pairs whose sum is Even.
		public static void displayPairs(int[] arr) {
			System.out.println("Pairs Whose Sum is Even: ");
			
			for(int i=0; i<arr.length; i++) {
				for(int j=i; j<arr.length; j++) {         // doubt j=i+1 is correct or not
					if((arr[i]+arr[j])%2==0) {
						int sum=arr[i]+arr[j];
						System.out.println(arr[i]+","+arr[j]+"--> "+sum);
					}
				}
			}
		}
		
//		Display pairs whose sum is Odd.
		public static void displayPairsOdd(int[] arr) {
			System.out.println("Pairs Whose Sum is Odd: ");
			
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length; j++) {         // doubt j=i+1 is correct or not
					if((arr[i]+arr[j])%2!=0) {
						int sum=arr[i]+arr[j];
						System.out.println(arr[i]+","+arr[j]+"--> "+sum);
					}
				}
			}
		}
		
}

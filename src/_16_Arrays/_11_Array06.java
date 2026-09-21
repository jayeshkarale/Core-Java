package _16_Arrays;

public class _11_Array06 {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		displayPrime(arr);
	}
	
	public static void checkPrime(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n);
		}
	}
	
//	Display pairs whose sum is Prime Number.
	public static void displayPrime(int[] arr) {
		System.out.println("Pairs whose sum is Prime Number: ");
		for(int i=1;i<arr.length; i++) {
			checkPrime(arr[i]);
		}
	}
  
}

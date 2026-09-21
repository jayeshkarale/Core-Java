package _16_Arrays;
import java.util.Scanner;


public class _08_Array04 {
	public static void main(String[] args) {
		
		int arr[]= new int[5];
		accept(arr);
		display(arr);
		SumofElement(arr);
		SumofOdd(arr);
		acceptEven(arr);
		displayEven(arr);
	
}

//	Accept
	private static void accept(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter Element: ");
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
		
//		Display
		public static void display(int[] arr) {
			for(int i=0;i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		
//		Sum of Elements
		public static void SumofElement(int[] arr) {
			int sum=0;
			for(int i=0;i<arr.length; i++) {
				sum=sum+arr[i];
			}
			System.out.println("Sum of Elements: "+sum);
	}
		
//	   Sum of Odd Elements
		public static void SumofOdd(int[] arr) {
			int Oddsum=0;
			for(int i=0;i<arr.length; i++) {
				if(arr[i]%2!=0) {
					Oddsum=Oddsum+arr[i];
				}
			}
			System.out.println("Sum of Odd Elements: "+Oddsum);
	 }
		
//		Accept Even Elements
		private static void acceptEven(int[] arr) {
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<arr.length; i++) {
				System.out.println("Enter Element: ");
				int num=sc.nextInt();
				
				if(num%2==0) {
					arr[i]=num;
				} else {
					System.out.println("Enter only Even Element..!");
					i--;
				}
			}
			sc.close();
		}
		
//		Display Even Elements
		public static void displayEven(int[] arr) {
			System.out.println("Even Elements: ");
			for(int i=0;i<arr.length; i++) {
				if(arr[i]%2 ==0) {
					System.out.print(arr[i]+" ");
				}
			}
		}
}

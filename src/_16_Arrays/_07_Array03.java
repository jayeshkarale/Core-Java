package _16_Arrays;
// import java.util.Scanner;

class ArrayNum{
	
//	void accept(int Num[]) {         // to input array numbers
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i<Num.length; i++) {
//			System.out.print("Enter Number: ");
//			Num[i]=sc.nextInt();
//		}
//	}
	
	void displayOdd(int Num[]) {       // Print odd Numbers From Array.
		System.out.print("Odd Numbers: ");
		for(int i=0; i<Num.length; i++) {
			if(Num[i]%2!=0) {
				System.out.print(Num[i]+" ");
			}
		}
		System.out.println();
	}
	
	void displayReverse(int Num[]) {     // Print Reverse Numbers From Array.
		System.out.print("Reverse Array: ");
		for(int i=Num.length-1;i>=0; i--) {
			System.out.print(Num[i]+" ");
		}
		System.out.println();
	}
	
	void displayMultiple(int Num[]) {     // print numbers which are multiple of 3
		System.out.print("Multiples of 3: ");
		for(int i=0; i<Num.length; i++) {
			if(Num[i] %3 ==0) {
				System.out.print(Num[i]+" ");
			}
		}
		System.out.println();
	}
	
	
	
}

public class _07_Array03 {
	public static void main(String[] args) {
		
//		int Numbers[] = new int[5];
		
		int Numbers[] = {2,3,4,6,5,8,7,8,10,11,13,14,15};
		
		ArrayNum a = new ArrayNum();
//		a.accept(Numbers);
		a.displayOdd(Numbers);
		a.displayReverse(Numbers);
		a.displayMultiple(Numbers);
	}

}

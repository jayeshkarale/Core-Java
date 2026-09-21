package _06_Methods;

import java.util.Scanner;
public class _16_ReverseNumber {
	
//	Create method to Reverse the input number.
	
	int DisplayReverse(int a) {
		int rev =0;
		
		while(a>0) {
			int rem=a%10;  // 12345%10= 1234.5
			rev=rev*10+rem; // rev = 0*10+3 = 5
			a=a/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		_16_ReverseNumber obj = new _16_ReverseNumber();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int a=sc.nextInt();
		int result = obj.DisplayReverse(a);
		System.out.print("Reversed Number: "+result);
		sc.close();
	}

}

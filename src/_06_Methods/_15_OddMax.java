package _06_Methods;

import java.util.Scanner;
public class _15_OddMax {
	
//	2) Create method OddMax() with 1 input parameter and return max odd number.
	
	int OddMax(int a) {
		int max=0;
		
		while(a>0) {
			int digit=a%10;
			
			if(digit%2!=0 && digit>max) {
				max=digit;
			}
			a = a/10;
		}
		return max;
	}
	
	public static void main(String[] args) {
		_15_OddMax obj = new _15_OddMax();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int a =sc.nextInt();
		
		System.out.print("Max Odd Number is: ");
		System.out.println(obj.OddMax(a));
		sc.close();
	}

}

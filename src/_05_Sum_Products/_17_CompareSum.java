package _05_Sum_Products;

import java.util.Scanner;
public class _17_CompareSum {
	public static void main(String[] args) {
		
//		10) input numbers and calculate sum of even and odd digits and compare sum of even and odd digits.
		
		Scanner sc = new Scanner(System.in);
		
//		Sum of Even Digits
		
		System.out.print("Enter number: ");
		int a = sc.nextInt();
		
		int sum=0;
		int digit=0;
		
		while(a!=0) {
			digit=a%10;  // a%10 remainder stores to digit
			if(digit%2==0) {
			sum=sum+digit;	
			}
			a=a/10;
		}
		System.out.println("Sum of Even digits is: "+sum);
		
		
//		Sum of Odd Digits
		
		System.out.print("Enter number: ");
		int a1 = sc.nextInt();
		
		int sum1=0;
		int digit1=0;
		
		while(a1!=0) {
			digit1=a1%10;  // a%10 remainder stores to digit
			if(digit1%2!=0) {
			sum1=sum1+digit1;	
			}
			a1=a1/10;
		}
		System.out.println("Sum of Odd digits is: "+sum1);
		
//		compare
		
		if(sum>sum1) {
			System.out.println("Sum of Even Digits is Greater");
		} else {
			System.out.println("Sum of Odd Digits is Greater");
		}
		sc.close();
	}

}

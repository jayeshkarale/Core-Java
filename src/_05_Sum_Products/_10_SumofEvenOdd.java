package _05_Sum_Products;

import java.util.Scanner;
public class _10_SumofEvenOdd {
	public static void main(String[] args) {
		
//		2) input integer from user and find sum of all even digits of given integers.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int a =sc.nextInt();
		
		int sum=0, digit=0;
		
		while(a>0) {
			digit=a%10;
			if(digit%2==0) {
				sum=sum+digit;
			}
			a=a/10;
		}
		System.out.println("Sum of Even Digits is: "+sum);
		
		
//      3) input integer from user and find sum of all odd digits of given integers.
		
		System.out.print("Enter a Number: ");
		int b =sc.nextInt();
		
		int sum1=0, digit1=0;
		
		while(b>0) {
			digit1=b%10;
			if(digit1%2!=0) {
				sum1=sum1+digit1;
			}
			b=b/10;
		}
		System.out.println("Sum of Odd Digits is: "+sum1);
		sc.close();
	}

}

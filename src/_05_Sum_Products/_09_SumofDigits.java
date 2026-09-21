package _05_Sum_Products;

import java.util.Scanner;
public class _09_SumofDigits {
	public static void main(String[] args) {
		
//		1) Program to find sum of all digits of given integers.
		
		int i = 123456;
		int sum = 0;
		int digit = 0;
		
		while(i!=0) {
			digit=i%10;
			sum=sum+digit;
			i=i/10;
		}
		System.out.println(sum);
		
//		By Taking input number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int a = sc.nextInt();
		
		int sum1=0, digit1=0;
		
		while(a!=0) {
			digit1=a%10;
			sum1=sum1+digit1;
			a=a/10;
		}
		System.out.println(sum1);
		sc.close();
	}

}

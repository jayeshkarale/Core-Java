package _05_Sum_Products;

import java.util.Scanner;
public class _14_SumCalculate {
	public static void main(String[] args) {
		
//		7) input integer value and calculate sum of numbers divisible by 3 and 5.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int a =sc.nextInt();
		
		int sum=0, digit=0;
		
		while(a>0) {
			digit=a%10;
			if(digit%3==0 && digit%5==0) {
				sum=sum+digit;
			}
			a=a/10;
		}
		System.out.println("Sum of Digits is: "+sum);
		sc.close();
	}

}

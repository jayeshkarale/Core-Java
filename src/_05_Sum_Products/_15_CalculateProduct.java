package _05_Sum_Products;

import java.util.Scanner;
public class _15_CalculateProduct {
	public static void main(String[] args) {
		
//		8) calculate products of digits which divisible by 2 and 3.
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int a =sc.nextInt();
		
		int prod=1, digit=0;
		
		while(a>0) {
			digit=a%10;
			if(digit%2==0 && digit%3==0) {
				prod=prod*digit;
			}
			a=a/10;
		}
		System.out.println("Product of Digits is: "+prod);
		sc.close();
	}

}

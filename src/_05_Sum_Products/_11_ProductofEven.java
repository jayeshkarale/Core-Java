package _05_Sum_Products;

import java.util.Scanner;

public class _11_ProductofEven {
	public static void main(String[] args) {
		
		
//		4) input integer number and calculate product of even digits.
		
       Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int a = sc.nextInt();
		
		int prod=1, digit=0;
		
		while(a>0) {
			digit=a%10;
			if(digit%2==0) {
				prod=prod*digit;
			}
			a=a/10;
		}
		System.out.println("Product of Even Digits is: "+prod);
		sc.close();
	}

}

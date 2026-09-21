package _05_Sum_Products;

import java.util.Scanner;
public class _13_ProductofSquares {
	public static void main(String[] args) {
		
//		6) input number integer and calculate product of square of odd numbers.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int a = sc.nextInt();
		
		int prod=1, digit=0;
		
		while(a>0) {
			digit=a%10;
			if(digit%2!=0) {
				prod=prod*digit*digit;
			}
			a=a/10;
		}
		System.out.println("Square of Product of odd numbers is: "+prod);
		sc.close();
	}

}

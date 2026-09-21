package _05_Sum_Products;

import java.util.Scanner;
public class _18_CompareProducts {
	public static void main(String[] args) {
		
//		11) input 2 numbers and calculate products of even and odd digits also compare them.
		
		Scanner sc = new Scanner(System.in);
		
//		product of even digits
		
		System.out.print("Enter number: ");
		int a = sc.nextInt();
		
		int prod=1;
		int digit=0;
		
		while(a>0) {
			digit=a%10;
			if(digit%2==0) {
				prod=prod*digit;
			}
			a=a/10;
		}
		System.out.println("Product of Even digits is: "+prod);
		
//		product of odd digits
		
		System.out.print("Enter number: ");
		int b = sc.nextInt();
		
		int prod1=1;
		int digit1=0;
		
		while(b>0) {
			digit1=b%10;
			if(digit1%2!=0) {
				prod1=prod1*digit1;
			}
			b=b/10;
		}
		System.out.println("Product of Odd digits is: "+prod1);
		
//		compare products
		
		if(prod>prod1) {
			System.out.println("Product of Even is Greater");
		} else {
			System.out.println("Product of Odd is Greater");
		}
		sc.close();
	}

}

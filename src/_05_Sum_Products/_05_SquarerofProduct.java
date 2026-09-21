package _05_Sum_Products;

import java.util.Scanner;
public class _05_SquarerofProduct {
	public static void main(String[] args) {
		
//		6) input 2 numbers and display the square of product between them using do while. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st num: ");
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd num: ");
		int b =sc.nextInt();
		
		long prod=1l;
		
		do {
			prod=prod*a;
			a++;
		} while(a<=b);
		
		System.out.println("Sum of Product is: "+prod*prod);
		sc.close();
	}

}

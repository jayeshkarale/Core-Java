package _05_Sum_Products;

import java.util.Scanner;
public class _06_ProductofNumbers {
	public static void main(String[] args) {
		
//		7) input 2 numbers and calculate product of numbers which are divisible by 3, 5 and 7 between them.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st num: ");
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd num: ");
		int b = sc.nextInt();
		
		long prod = 1l;
		
		for(int i=a; i<=b; i++) {
			if(i%3==0 && i%5==0 && i%7==0) {
				prod = prod * i;
			}
			
		}
		System.out.println(prod);
		sc.close();
	}

}

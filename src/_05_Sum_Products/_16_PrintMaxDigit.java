package _05_Sum_Products;

import java.util.Scanner;
public class _16_PrintMaxDigit {
	public static void main(String[] args) {
		
//		9) input numbers and find out max digit.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int a = sc.nextInt();
		
		int max=0, digit=0;
		
		while(a!=0) {
			digit=a%10;
			
			if(digit>max) {
				max=digit;
			}
			a=a/10;
		}
		System.out.println("Maximum digit is: "+max);
		sc.close();
	}

}

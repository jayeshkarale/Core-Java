package _05_Sum_Products;

import java.util.Scanner;
public class _12_SumofSquares {
	public static void main(String[] args) {
		
//		5) input number and calculate sum of squares of even numbers.
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int a = sc.nextInt();
		
		int sum1=0, digit1=0;
		
		while(a!=0) {
			digit1=a%10;
			if(a%2==0) {
				sum1=sum1+digit1*digit1;
			}
			a=a/10;
		}
		System.out.println(sum1);
		sc.close();
	}

}

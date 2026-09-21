package _04_Loops;

import java.util.Scanner;
public class _14_DoWhileLoopP1 {
	public static void main(String[] args) {
		
//		1) input 2 numbers and print sum of numbers divisible by 7 between them.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		
		int x = a;
		int sum = 0;
		
		do {
			if(x%7==0) {
				sum = sum + x;
			}
			x++;
		} while(x<=b);
		System.out.println(sum);
		
//		2) input 2 numbers and print sum of odd float numbers between them.
		
		
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		
		float sum1 = 0, y = num1;
		
		do {
			if(y%2!=0) {
				sum1 = sum1 + y;
			}
			y++;
		} while(y<=num2);
		System.out.println(sum1);
		sc.close();
	}

}

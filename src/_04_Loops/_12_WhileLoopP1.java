package _04_Loops;

import java.util.Scanner;
public class _12_WhileLoopP1 {
	public static void main(String[] args) {
		
//		3) calculate sum of even numbers 21 to 47 using while loop
		
		int a = 21;
		int b = 47;
		
		int sum =0;
		
		int i=a;
		while(i<=b) {
			if(i%2 ==0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
		
//		4) take 2 input numbers and calculate sum of odd numbers between them
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		int x = sc.nextInt();
		
		System.out.print("Enter 2nd Number: ");
		int y = sc.nextInt();
		
		int sum1 = 0;
		int j=x;
		while(j<=y) {
			if(j%2 !=0) {
				sum1 = sum1 + j;
			}
			j++;
		}
		System.out.println(sum1);
		sc.close();
	}
	
}

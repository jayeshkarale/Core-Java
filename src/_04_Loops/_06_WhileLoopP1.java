package _04_Loops;

import java.util.Scanner;
public class _06_WhileLoopP1 {
	public static void main(String[] args) {
		
//		1) take 2 number inputs from user and print numbers between them.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd Number: ");
		int b = sc.nextInt();
		
		int i=a;
		while(i<=b) {
			System.out.print(i+" ");
			i++;
		}
		sc.close();
	}

}

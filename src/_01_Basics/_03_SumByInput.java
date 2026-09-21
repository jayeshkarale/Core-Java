package _01_Basics;

import java.util.Scanner;

public class _03_SumByInput {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter 1st Number: ");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("Sum is: "+ sum);
		sc.close();
	}
}

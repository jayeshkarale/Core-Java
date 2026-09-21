package _03_Conditional_Statements;

import java.util.Scanner;
public class _06_SwitchP2 {
	public static void main(String[] args) {
		
//		2) Take 2 integer inputs and 1 string input and perform basic arithmetic operations.
//		if user gives any operation it prints output.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter operation: ");
		String name = sc.next();
		
		switch (name) {
		
		case "add" :
			System.out.println(num1+num2);
			break;
			
		case "sub":
			System.out.println(num1-num2);
			break;
		
		case "mul":
			System.out.println(num1*num2);
			break;
			
		case "div":
			System.out.println(num1/num2);
			break;
			
		case "mod":
			System.out.println(num1%num2);
			break;
			
		default:
			System.out.println("Invalid Input");
			
		}
		sc.close();
	}
}

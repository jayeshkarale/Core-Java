package _03_Conditional_Statements;

import java.util.Scanner;
public class _07_SwitchP3 {
	public static void main(String[] args) {
		
//		3) WAP to create ATM Menu using switch with basic banking operations.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your balance: ");
		int balance = sc.nextInt();
		
		System.out.println("------ATM Menu------");
		System.out.println("Check balance press 1");
		System.out.println("Deposit money press 2");
		System.out.println("Withdraw money press 3");
		
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.print("Available balance is: "+ balance);
			break;
			
		case 2:
			System.out.print("Enter amount to deposit: ");
			int deposit = sc.nextInt();
			balance = balance + deposit;
			System.out.print("New balance: "+balance);
			
		case 3:
			System.out.print("Enter amount to withdraw: ");
			int withdraw = sc.nextInt();
			balance = balance - withdraw;
			if(balance<withdraw) {
				System.out.println("insufficient Balance");
			}
			System.out.print("Remaining balance is: "+ balance);
			
		default:
			System.out.print("Invalid Input.");
		}
		sc.close();
	}

}

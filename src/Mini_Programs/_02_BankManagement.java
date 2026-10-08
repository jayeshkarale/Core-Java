package Mini_Programs;
import java.util.Scanner;

// Bank Management System (Deposit, Withdraw and Check Balance)

class AccountInfo{
	private double balance;
	
//	Deposit Money
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance + amount;
			System.out.println("₹ "+amount+" Deposited Sucessfully");
		} else {
			System.out.println("Invalid Amount");
		}
	}
	
//	Withdraw Money
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance = balance - amount;
			System.out.println("₹ "+amount+" Widrawn Sucessfully");
			System.out.println("Account Balance is: "+balance+" ₹");
			
		} else {
			System.out.println("Insufficient Balance");
		}
	}
	
//	Check Balance
	public void checkBalance() {
		System.out.println("Account Balance: "+balance+" ₹");
	}
}

public class _02_BankManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AccountInfo a = new AccountInfo();
		
		int choice;
		
		do {
			System.out.println("=== BANK MENU ===");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter Amount to Deposit:");
				double d = sc.nextDouble();         // d is deposit money
				a.deposit(d);
				break;
			
			case 2:
				System.out.print("Enter Amount to Widraw:");
				double w = sc.nextDouble();         // w is withdraw money
				a.withdraw(w);
				break;
			
			case 3:
				a.checkBalance();
				break;
				
			}
			
		} while(choice !=4);
		sc.close();
	}
}

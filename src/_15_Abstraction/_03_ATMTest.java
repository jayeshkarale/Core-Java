package _15_Abstraction;

abstract class ATM{
	abstract void widraw(double amount);
	abstract void deposit(double amount);
	
	void CheckBalance() {
		System.out.println("Account Balance is: 45,000 ₹");
	}
}

class SBIatm extends ATM{
	@Override
	void widraw(double amount) {
		System.out.println(amount+" ₹ Widrawn Successfully");
	}
	@Override
	void deposit(double amount) {
		System.out.println(amount+" ₹ Deposited Successfully");
	}
}

public class _03_ATMTest {
	public static void main(String[] args) {
		ATM a = new SBIatm();
		a.CheckBalance();
		a.widraw(5000);
		a.deposit(8000);
		
	}
}

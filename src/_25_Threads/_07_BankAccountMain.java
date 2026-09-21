package _25_Threads;

class BankAccount {
	int balance = 15000;
	
	public synchronized void withdraw(int amt) {
		System.out.println("Withdrawing ammount is: "+amt);
		
		while (balance<amt) {
			System.out.println("Insufficient Balanace");
			System.out.println("Please Deposite Money");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		balance = balance - amt;
		System.out.println("Withdrawal Success");
		System.out.println("Current Balance: "+balance);
	}
	
	public synchronized void deposit(int amt) {
		System.out.println("Diposit Ammount is: "+amt);
		balance = balance + amt;
		System.out.println("Current Balance"+balance);
		notify();
	}
}

class Wife extends Thread {
	BankAccount account;
	
	public Wife(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(17000);
	}
}

class Husband extends Thread {
	BankAccount account;
	
	public Husband(BankAccount account) {
		this.account=account;
	}
	
	@Override
	public void run() {
		account.deposit(10000);
	}
}

public class _07_BankAccountMain {
	public static void main(String[] args) throws InterruptedException{
		
		BankAccount account = new BankAccount();
		
		Wife w = new Wife(account);
		Husband h = new Husband(account);
		
		w.start();
		Thread.sleep(2000);
		h.start();	
	}
}

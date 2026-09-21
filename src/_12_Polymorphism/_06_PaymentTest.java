package _12_Polymorphism;

/*  Create a Payment class with a pay(double amount) method.Create CreditCardPayment, DebitCardPayment
    and UPIPayment classes that override the method to process payment differently.*/

class Payment{
	void pay(double amount) {
		System.out.println("payment in process");
	}
}

class CreditCard extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("Credit card Transaction: "+amount);
	}
}

class DebitCard extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("Debit card Transaction: "+amount);
	}
}

class UPIPayments extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("UPI Transaction: "+amount);
	}
}

public class _06_PaymentTest {
	public static void main(String[] args) {
		Payment p1 = new CreditCard();
		p1.pay(1500);
		Payment p2 = new DebitCard();
		p2.pay(5600);
		Payment p3 = new UPIPayments();
		p3.pay(4800);
	}
}

package _26_Java_8_Features;

public class _03_BankTest {
	public static void main(String[] args) {

        // Calling static method
        _01_Bank.bankRules();

        // Creating object
        _01_Bank b = new _02_SBI();

        // Calling default method
        b.welcome();

        // Calling overridden abstract method
        b.accountType();
    }
}

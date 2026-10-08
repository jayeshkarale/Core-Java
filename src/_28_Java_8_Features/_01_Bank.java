package _28_Java_8_Features;

public interface _01_Bank {
	// Java 8 Static Method
    public static void bankRules() {
        System.out.println("Bank Rules: Maintain minimum balance");
    }

    // Java 8 Default Method
    public default void welcome() {
        System.out.println("Welcome to our Bank");
    }

    // Abstract method
    public void accountType();
}

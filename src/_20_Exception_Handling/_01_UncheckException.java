package _20_Exception_Handling;

public class _01_UncheckException {
	public static void main(String[] args) {
		
		System.out.println("Hi..");
		
		try {
			int num=10/0;
		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.getClass());
			e.printStackTrace(); //Prints the complete exception details along with the line number where the exception occurred.
		} finally {
			System.out.println("End...");
		}
		System.out.println("Bye..");
	}

}

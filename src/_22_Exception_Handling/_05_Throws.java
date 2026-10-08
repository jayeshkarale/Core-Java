package _22_Exception_Handling;  //  31/07/2026

public class _05_Throws {
	public static void main(String[] args) {
		System.out.println("Start..");
		
		try {
			divideNum();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("End..");
	}
	
	static void divideNum() throws ArithmeticException {
		int a = 15;
		int b = 0;
		int ans = a/b;
		System.out.println(ans);
	}

}

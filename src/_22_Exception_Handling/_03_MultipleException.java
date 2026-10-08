package _22_Exception_Handling;

public class _03_MultipleException {
	public static void main(String[] args) {
		
		int arr[]= {22, 34, 88};
		try {
			int num = arr[1]/0;
			System.out.println(arr[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("End...");
	}

}

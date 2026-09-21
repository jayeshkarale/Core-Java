package _20_Exception_Handling;

public class _04_NestedException {
	public static void main(String[] args) {
		
		try {
			try {
				int a=10/0;
			} catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				
			}
			
			int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End..");
	}

}

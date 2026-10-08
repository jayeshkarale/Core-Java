package _22_Exception_Handling;
import java.util.Scanner;

class InvalidPassException extends Exception{
	public InvalidPassException(String msg) {
		super(msg);
	}
}

public class _15_EmployeeLogin {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Employee id: ");
			int Eid=sc.nextInt();
			System.out.println("Enter Employee Password: ");
			String Pass=sc.next();
			
			loginCheck(Eid, Pass);
		} catch(InvalidPassException e) {
		System.out.println(e.getMessage());
	   }
	}
		
	
	static void loginCheck(int Eid, String Pass) throws InvalidPassException{
		if(Eid != 1001 || !Pass.equals("jay")) {
			throw new InvalidPassException("Employee id or Password is Wrong..");
		} else {
			System.out.println("Employee Login Successful..");
		}
	}

}

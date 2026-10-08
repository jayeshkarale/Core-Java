package _14_Polymorphism;
import java.util.Scanner;

// Username & Password

class Users{
	void login() {
		System.out.println("Log in..");
	}
}

class U1 extends Users{
	@Override
	void login() {
		System.out.println("Welcome Jayesh Karale");
	}
}

class U2 extends Users{
	@Override
	void login() {
		System.out.println("Welcome Om Sanjay Borde");
	}
}

class U3 extends Users{
	@Override
	void login() {
		System.out.println("Welcome Karan Santosh Shelke");
	}
}

public class _10_LoginTest {
	public static void main(String[] args) {
		Users u1 = new U1();
		Users u2 = new U2();
		Users u3 = new U3();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Username: ");
		String username = sc.next();
		
		System.out.print("Enter Password: ");
		int password = sc.nextInt();
		
		if(username.equals("jayeshk") && password==8801) {
			System.out.println("Login Success..");
			u1.login();
		} else if(username.equals("omb") && password==123) {
			System.out.println("Login Success..");
			u2.login();
		} else if(username.equals("karan") && password==456) {
			System.out.println("Login Success..");
			u3.login();
		} else {
			System.out.println("Invailid Username or Password");
		}
		sc.close();
	}
}

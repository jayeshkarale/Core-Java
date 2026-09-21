package _12_Polymorphism;
/* Create a User class with a login() method. Create Admin and Customer classes that override the login() method
   to perform role-specific login operations.
*/

class User{
	void login() {
		System.out.println("plz login...");
	}
}

class Admin extends User {
	@Override
	void login() {
		System.out.println("Welcome Admin...");
	}
}

class Customer extends User{
	@Override
	void login() {
		System.out.println("Welcome Customer...");
	}
}

public class _09_UserTest {
	public static void main(String[] args) {
		User u1 = new Admin();
		u1.login();
		User u2 = new Customer();
		u2.login();
	}
}

package _20_Exception_Handling;

public class _14_PasswordCheck {
	public static void main(String[] args) {
		try {
			checkPassword("Jay@12");
		} catch(_13_InvalidPasswordException e){
			System.out.println(e.getMessage());
		}
	}
	
	static void checkPassword(String pass) throws _13_InvalidPasswordException{
		if(pass != "Jay@123") {
			throw new _13_InvalidPasswordException("Password is Wrong..");
		} else {
			System.out.println("Login Success..");
		}
	}

}

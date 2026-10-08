package _22_Exception_Handling;

public class _08_Voting {
	
	static void checkAge(int age) throws  _07_InvalidAgeException{
		
		if(age<18) {
			throw new _07_InvalidAgeException("minor");
		}
		System.out.println("you can vote");
	}
	
	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch(_07_InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}

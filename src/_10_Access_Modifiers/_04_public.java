package _10_Access_Modifiers;

public class _04_public {
	
//	4. Public Specifiers/Modifiers.
	
	public void display() {
		System.out.println("Hello..");
	}
	
	public static void main(String[] args) {
		_04_public obj = new _04_public();
		obj.display();
	}

}

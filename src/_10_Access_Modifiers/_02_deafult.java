package _10_Access_Modifiers;

public class _02_deafult {
	
//	2. Default Specifiers/Modifiers.
	
	String name = "Jayesh Karale";
	
	void display() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		_02_deafult obj = new _02_deafult();
		obj.display();
	}

}

package _10_Access_Modifiers;

public class _03_protected {
	
//	3. Protected Specifiers/Modifiers.
	
	protected void sound() {
		System.out.println("Animal Makes Sound...");
	}
	
	public static void main(String[] args) {
		_03_protected obj = new _03_protected();
		obj.sound();
	}

}

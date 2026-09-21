package _02_Operators;

public class _02_AssignmentOperators {
	public static void main(String[] args) {
		
//	2. Assignment Operators. [+=, -=, *=, /=, %=]
		
		int a = 15;
		a += 10; // a = a + 10;
		System.out.println(a); // 25
		
		a -= 10; // a = a - 10
		System.out.println(a); // 15
		
		a *= 10; // a = a * 10
		System.out.println(a); // 150
		
		a /= 10; // a = a / 10
		System.out.println(a); // 15
		
		a %= 10; // a = a % 10
		System.out.println(a); // 5
	}

}

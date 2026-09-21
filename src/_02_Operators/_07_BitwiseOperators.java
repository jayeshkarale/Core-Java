package _02_Operators;

public class _07_BitwiseOperators {
	public static void main(String[] args) {
		
//		6. Bitwise Operators.[&, |, ~, ^, <<, >>]   16/07/2026
		
//		Decimal to Binary.
		int n = 6;
		String a1 = Integer.toBinaryString(n);
		System.out.println(a1);
		
//		1) Bitwise AND &
		int n1 = 5, n2 = 6;
		int result = n1 & n2;
		System.out.println(result);
		
//		2) Bitwise OR |
		int x = 5, y = 6;
		int result1 = x | y;
		System.out.println(result1);
		
//		3) Bitwise Compliment ~
		int j = 6;
		String s1 = Integer.toBinaryString(~j);
		System.out.println(s1);
		
//		4) Bitwise XOR ^
		int xor_result = n1 ^ n2;
		System.out.println(xor_result);
		
//		5) Left Shift << and Right Shift >>
		int m = 5;
		int leftshift_result = m << 1;
		System.out.println(leftshift_result);
		
		int rightshift_result = m >> 1;
		System.out.println(rightshift_result);
		
		
	}

}

package _02_Operators;

public class _05_UnaryOperators {
	public static void main(String[] args) {
		
//		5. Unary Operators. [++, --, !, -]

		int a = 10;
		int b = a++;  // post-increment, use value then change value.
		System.out.println(b);
		System.out.println(a);
		
		int a1 = 10;
		int b1 = 0;
		b1 = ++a1; // pre-increment, change value then use value.
		System.out.println(b1);
		System.out.println(a1);
		
		int c = 16;
		int d = 0;
		d = --c; // pre-decrement, change value then use value.
		System.out.println(d);
		System.out.println(c);
		
		int c1 = 20;
		int d1 = 0;
		d1 = c1--; // post-decrement, use value then change value.
		System.out.println(d1);
		System.out.println(c1);
				
	}

}

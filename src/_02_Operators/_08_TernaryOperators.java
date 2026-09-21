package _02_Operators;

public class _08_TernaryOperators {
	public static void main(String[] args) {
		
//		7. Ternary Operators.  16/07/2026
		
		int m = 10, n = 5;
		String result = m<n?"Yes":"No";
		System.out.println(result);
		
//		positive or negative number.
		int num1 = -10;
		String result2 = num1>0?"positive":"negative";
		System.out.println(result2);
		
//		Which is Greater Number.
		int x = 10, y = 5;
		String result3 = x<y?"y is greater":"x is greater";
		System.out.println(result3);
		
//		Even or Odd Number.
		int num2 = 14;
		String result4 = (num2 % 2 == 0)?"Even Number":"Odd Number";
		System.out.println(result4);
		
	}

}

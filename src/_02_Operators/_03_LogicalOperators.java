package _02_Operators;

public class _03_LogicalOperators {
	public static void main(String[] args) {
		
//	3. Logical Operators.[&&, |, !]
		
		int a =20;
		int b = 10;
		int c = 30;
		
		System.out.println((a>b) && (b==10)); // true && true = true
		System.out.println((a>b) && (b<10)); // true && false = false
		System.out.println((a>b) | (b<10)); // true | false = true
		System.out.println(!(a>b) | !(b<10)); // false | true = true
		System.out.println(!(a<b) && !(b>c)); // true && true = true
		System.out.println(!(a!=b) && !(a>c)); // false && true = false
		
	}


}

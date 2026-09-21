package _26_Java_8_Features;

// 2. Lambda Expression
interface Calculator{
	int add(int a, int b);
}

public class _04_LamdaExpression {
	public static void main(String[] args) {
		Calculator c = (a, b) -> {
			return a+b;
		};
		
		int result = c.add(10, 13);
		System.out.println("Addition is: "+result);
	}
}

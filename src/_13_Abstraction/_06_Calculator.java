package _13_Abstraction;

interface Calculator{
	void add(int a , int b);
}

class SimpleCalculator implements Calculator{
	@Override
	public void add(int a, int b) {
		System.out.println("Sum is: "+(a+b));
	}
}
	
	
public class _06_Calculator {
	public static void main(String[] args) {
		SimpleCalculator s = new SimpleCalculator();
		s.add(15, 4);
	}
}

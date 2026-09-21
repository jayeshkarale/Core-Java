package _04_Loops;

public class _16_FibonacciSeries {
	public static void main(String[] args) {
		
//		Fibonacci series.(Each number is sum of the preceding two numbers)
		
		int a=0,b=1;
		
		for(int i=0; i<=10; i++) {
			System.out.print(a+" ");
			int c = a + b;
			a=b;
			b=c;
		}
	}

}

package _06_Methods;

public class _06_FibonacciSeries {
	
//	Fibonacci Series using method.
	
	int Fibonacci() {
		int a=0,b=1;
		for(int i=0; i<=10; i++) {
			System.out.print(a+" ");
			int c = a + b;
			a=b;
			b=c;
		}
		return a;
	}
		
	
	public static void main(String[] args) {
		
		_06_FibonacciSeries obj = new _06_FibonacciSeries();
		System.out.print(obj.Fibonacci());
		
	}

}

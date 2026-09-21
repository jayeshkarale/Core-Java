package _06_Methods;

public class _19_Factorial {
	
//	Factorial of Number.
	
	int DisplayFcatorial(int a) {
		int fact =1;
		for(int i=a; i>=1; i--) {
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		_19_Factorial obj = new _19_Factorial();
		
		int result = obj.DisplayFcatorial(5);
		System.out.println(result);
	}

}

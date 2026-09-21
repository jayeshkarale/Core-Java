package _06_Methods;

public class _20 {
	
//	Create method CountDigit() take input number and return count digit.
	
	int CountDigit(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		_20 obj = new _20();
		
		int count = obj.CountDigit(1234);
		System.out.println("Conut of Number: "+count);
	}
}

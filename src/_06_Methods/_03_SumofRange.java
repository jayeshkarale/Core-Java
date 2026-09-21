package _06_Methods;

public class _03_SumofRange {
	
//	1) Create method sumofRange() which calculate and return the sum of range 27 to 13.
	
	int sumofRange() {
		int a=27, sum=0;
		for(int i=a; i>=13; i--) {
			sum=sum+i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		_03_SumofRange obj = new _03_SumofRange();
		
		int result = obj.sumofRange();
		System.out.println(result);
	}

}

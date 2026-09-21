package _06_Methods;

public class _17_CheckPrime {
	
//	Create method and check prime number or not.
	
	void CheckPrimeNum(int n) {
		int count =0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println("count: "+count);
		if(count==2) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}
	}
	
	public static void main(String[] args) {
		_17_CheckPrime obj = new _17_CheckPrime();
		
		obj.CheckPrimeNum(3);
	}

}

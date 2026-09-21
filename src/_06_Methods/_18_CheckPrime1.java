package _06_Methods;

public class _18_CheckPrime1 {
	
//	Create method the check prime number or not and return boolean result.
	
	boolean checkPrime(int n){
		int count = 0;
		for(int i=1; i<=n; i++){
			if(n%i==0) {
				count++;
			}
		}
		System.out.println(count);
		if(count==2) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		_18_CheckPrime1 obj = new _18_CheckPrime1();
		
		boolean result= obj.checkPrime(5);
		System.out.println(result);
		
	
	}

}

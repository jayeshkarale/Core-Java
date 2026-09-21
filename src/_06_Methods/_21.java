package _06_Methods;

public class _21 {
	
//	Create method CalcPower() with 2 parameters base and power and return the product. 
	
	int CalcPower(int base, int power) {
		int prod=1;
		for(int i=1; i<=power; i++) {
			prod=prod*base;
		}
		return prod;
	}
	
	public static void main(String[] args) {
		_21 obj = new _21();
		
		int result = obj.CalcPower(3, 3); //3*3*3
		System.out.println("Answer is: "+result);
	}

}

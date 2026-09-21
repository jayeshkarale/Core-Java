package calculatorapp;
import calculator.Calculate;

public class Test {
	
	public static void main(String[] args) {
		
		Calculate obj = new Calculate();
		
		int num1 = 15;
		int num2 = 5;
		
		System.out.println("Numbers are: "+num1+" and "+num2);
		System.out.println("Addition is: "+obj.add(num1, num2));
		System.out.println("Substraction is: "+obj.sub(num1, num2));
		System.out.println("Multiplication is: "+obj.mul(num1, num2));
		System.out.println("Division is: "+obj.div(num1, num2));
		System.out.println("Modulo is: "+obj.mod(num1, num2));
			
	}

}

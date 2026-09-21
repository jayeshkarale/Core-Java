package _06_Methods;

import java.util.Scanner;
public class _04_DisplayMax {
	
//	2) Create method DisplayMax() input 3 numbers from user and return max number from them.
	
	int DisplayMax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max=0;
		sc.close();
		
		if(num1>num2 && num1>num3) {
			max = num1;
		} else if(num2>num1 && num2>num3) {
			max = num2;
		} else {
			max = num3;
		}
		return max;
	}
	
	public static void main(String[] args) {
		_04_DisplayMax obj = new _04_DisplayMax();
		
		int max = obj.DisplayMax();
		System.out.println("Max Number is: "+max);
		
	}
}

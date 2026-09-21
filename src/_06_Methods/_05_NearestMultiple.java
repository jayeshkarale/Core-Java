package _06_Methods;

import java.util.Scanner;
public class _05_NearestMultiple {
	
//	3) Create Method and Print the previous nearest multiple of 5 for input number.
	
	int PreviousMultiple() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int a = sc.nextInt();
		int b = 0;
		sc.close();
		
		b = (a/5) *5;   // logic---> 163/5 = 32.6 = 32*5 = 160
		return b;
	}
	
	
	public static void main(String[] args) {
		
		_05_NearestMultiple obj = new _05_NearestMultiple();
		System.out.println("Previous multiple of 5 is: "+obj.PreviousMultiple());
		
	}

}

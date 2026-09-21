package _06_Methods;

import java.util.Scanner;
public class _10_CalcSum {
	
//	1) create method add() input 2 numbers as parameters and return sum of the two numbers.
	
	int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		_10_CalcSum obj = new _10_CalcSum();
		
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int sum=obj.add(a, b);
		System.out.println(sum);
		sc.close();
	}

}

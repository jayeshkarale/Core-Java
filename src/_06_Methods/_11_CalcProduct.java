package _06_Methods;

import java.util.Scanner;
public class _11_CalcProduct {
	
//	2) create method product() input 2 float numbers as parameters and return product of the two numbers.
	
	int prod(int j, int k) {
		return j*k;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		_11_CalcProduct obj = new _11_CalcProduct();
		
		System.out.println("Enter two numbers: ");
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		int product=obj.prod(j, k);
		System.out.println(product);
		sc.close();
	}

}

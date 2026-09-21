package _06_Methods;

import java.util.Scanner;
public class _12_CalcAverage {
	
//	3) create method average() input 4 numbers as parameter calculate the average and return.
	
	int average(int a,int b,int c,int d) {
		int avg=(a+b+c+d)/4;
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		_12_CalcAverage obj = new _12_CalcAverage();
		
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int avg=obj.average(a, b, c, d);
		System.out.println(avg);
		sc.close();
	}

}

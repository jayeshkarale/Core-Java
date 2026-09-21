package _05_Sum_Products;

import java.util.Scanner;
public class _03_CalculateProduct {
	public static void main(String[] args) {
		
//		3) input range and calculate product of multiple of 3
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		int prod = 1;
		
		for(int i=a; i<=b; i++) {
			if(i%3==0) {
				prod =prod * i;
			}
		}
		System.out.println(prod);
		sc.close();
	}
	
}

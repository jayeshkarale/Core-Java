package _05_Sum_Products;

import java.util.Scanner;
public class _04_ProductofMultiple {
	public static void main(String[] args) {
		
//		4) input range and calculate product of multiple of 5 using while loop.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int prod1=1;
		int i=a;
		
		while(i<=b) {
			if(i%5==0) {
				prod1=prod1*i;
			}
			i++;
		}
		System.out.println(prod1);
		
		
//		5) calculate product of multiple of 7 or 3 between range 21 to 13
		
		long prod=1l;
		
		for(int j=13; j<=21; j++) {
			if(j%7==0 || j%3==0) {
				prod = prod * j;
			}
		}
		System.out.println(prod);
		sc.close();
	}

}

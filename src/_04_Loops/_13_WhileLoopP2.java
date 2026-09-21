package _04_Loops;

import java.util.Scanner;

public class _13_WhileLoopP2 {
	public static void main(String[] args) {
		
//		5) take 2 input and calculate sum of square of even numbers between them
		
        Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		int x = sc.nextInt();
		
		System.out.print("Enter 2nd Number: ");
		int y = sc.nextInt();
		
		int sqr1 = 0;
		int j=x;
		while(j<=y) {
			if(j%2==0) {
				sqr1 = sqr1 + (j*j);
			}
			j++;
		}
		System.out.println(sqr1);
		sc.close();
	
//		6) print the sum of numbers greater than 10 and less than 21 between range 7 to 31.
		
		int a = 7;
		int sum1 = 0;
		
		while(a<=31) {
			if(a>10 && a<21) {
				sum1=sum1+a;
			}
			a++;
		}
		System.out.println(sum1);
	}

}

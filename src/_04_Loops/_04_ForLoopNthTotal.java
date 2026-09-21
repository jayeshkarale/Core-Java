package _04_Loops;

import java.util.Scanner;
public class _04_ForLoopNthTotal {
	public static void main(String[] args) {
		
//		Calculate sum of nth total numbers.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println("Nth Total is: "+sum);
		sc.close();
	}

}

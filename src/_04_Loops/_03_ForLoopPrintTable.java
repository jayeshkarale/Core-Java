package _04_Loops;
import java.util.Scanner;
public class _03_ForLoopPrintTable {
	public static void main(String[] args) {
		
//		Print table by input number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.print(n*i+ " ");
		}
		sc.close();
	}

}

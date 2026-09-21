package _04_Loops;
import java.util.Scanner;
public class _07_WhileLoopP2 {
	public static void main(String[] args) {
		
//		2) Inputs 2 numbers from user and print odd numbers between them.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		
		int i=a;
		while(i<=b) {
			if(i%2 != 0) {
				System.out.print(i+" ");
			}
			i++;
		}
		sc.close();
	}

}

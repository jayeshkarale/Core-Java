package _04_Loops;
import java.util.Scanner;
public class _08_WhileLoopP3 {
	public static void main(String[] args) {
		
//		3) Input 2 numbers from user and display squares of even numbers between them.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd Number: ");
		int b = sc.nextInt();
		
		int i=a, sqr=0;
		while(i<=b) {
			if(i%2==0) {
				sqr = i*i;
				System.out.println(sqr);
			}
			i++;
		}
		sc.close();
	}

}

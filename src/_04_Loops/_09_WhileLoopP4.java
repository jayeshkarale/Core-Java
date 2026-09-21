package _04_Loops;
import java.util.Scanner;
public class _09_WhileLoopP4 {
	public static void main(String[] args) {
		
//		4) Input 2 numbers from user and print numbers divisible by 7 between them.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		int i=a;
		while(i<=b) {
			if(i%7==0) {
				System.out.println(i);
			}
			i++;
		}
		sc.close();
	}
}

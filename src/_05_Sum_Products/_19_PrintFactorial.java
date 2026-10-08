package _05_Sum_Products;
import java.util.Scanner;

public class _19_PrintFactorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a =sc.nextInt();
		if(a<0) {
			System.out.println("invalid number");
		} else {
			int fact=1;
			for(int i=1; i<=a; i++) {
				fact=fact*i;
			}
			System.out.println("Factorial: "+fact);
		}
		sc.close();
	}
}

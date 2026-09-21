package _03_Conditional_Statements;

public class _01_if_Statement {
	public static void main(String[] args) {
		
//		1. if Statement.         17/06/2026
		
//		1) Check Positive or Negative Number
		int n = -15;
		if(n>0) {
			System.out.println("Positive Number");
		}
		
		if (n<0) {
			System.out.println("Negative Number");
		}
		
//		2) Check Even or Odd Number
		int m = 7;
		if(m % 2 == 0) {
			System.out.println("Even Number");
		}
		
		if(m % 2 != 0) {
			System.out.println("Odd Number");
		}
		
	}

}

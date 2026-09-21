package _04_Loops;

public class _05_WhileLoop {
	public static void main(String[] args) {
		
//		2. While Loop.
		
//		print 15 to 1 numbers
		int i=15;
		while(i>=1) {
			System.out.print(i+" ");
			i--;
		}
		
//		even numbers from 1 to 10
		int j = 2;
		while(j<=10) {
			if(j%2 ==0) {
				System.out.print(j+" ");
			}
			j++;
		}
		
//		odd numbers from 1 to 10
		int k = 1;
		while(k<=10) {
			System.out.print(k+" ");
			k = k + 2;
		}
	}

}

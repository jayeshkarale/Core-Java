package _04_Loops;

public class _15_DoWhileP2 {
	public static void main(String[] args) {
			
//		3) calculate sum of cube of even numbers between 13 to 45.
		
		int a = 13, b = 45;
		int sum = 0;
		int i = a;
		
		do {
			if(i%2 == 0) {
				sum = sum + i*i*i;
			}
			i++;
		} while(i<=b);
		System.out.println(sum);

	}

}

package _05_Sum_Products;

public class _01_CalculateProduct {
	public static void main(String[] args) {
		
//		1) calculate product of 1 to 5 numbers.
		
		int a = 1;
		for(int i=1; i<=5; i++) {
			a =a*i;
		}
		System.out.println(a);
		
//		calculate product of range 21 to 11
		
		long prod = 1;
			
		for(int i=21; i>=11; i--) {
			prod = prod*i;
		}
		System.out.println(prod);
		
	}

}

package _05_Sum_Products;

public class _07_ProductofEven {
	public static void main(String[] args) {
		
//	8) calculate product of even numbers from range 45 to 1 but number should be greater than 12 and less than 17.
		
		long prod=1l;
		int i=45;
		
		do {
			if(i<17 && i>12 && i%2==0) {
				prod=prod*i;
			}
			i--;
		} while(i>=1);
		System.out.println(prod);
		
	}

}

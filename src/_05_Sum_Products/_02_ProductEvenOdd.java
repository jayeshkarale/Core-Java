package _05_Sum_Products;

public class _02_ProductEvenOdd {
	public static void main(String[] args) {
			
//		2) calculate product of even numbers using while loop from range 11 to 21.
		
		int i=11;
		long prod=1l;
		while(i<=21) {
			if(i%2==0) {
				prod=prod*i;
			}
			i++;
		}
		System.out.println(prod);
		
//      calculate product of odd numbers using do while loop from range 13 to 19.
		
		int j=13;
		long prod1=1l;
		
		do {
			if(j%2!=0) {
				prod1=prod1*j;
			}
			j++;
		} while(j<=19);
		System.out.println(prod1);
	}

}

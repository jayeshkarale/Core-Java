package _05_Sum_Products;

public class _08_CompareSquares {
	public static void main(String[] args) {

/*	  calculate sum of numbers from 98 to 12 and square the final sum also calculate product
      of odd numbers for range 13 to 4 and compare square of sum and product of numbers. */

//		sum calculate

		int sum = 0, sumsqr = 0;

		for (int i = 98; i >= 12; i--) {
			sum = sum + i;
		}
		sumsqr = sum * sum;
		System.out.println("Square of sum is: " + sumsqr);

//		product calculate

		long prod = 1l;

		for (int j = 13; j >= 4; j--) {
			if (j % 2 != 0) {
				prod = prod * j;
			}
		}
		System.out.println("Product of numbers: " + prod);

//		compare

		if (sumsqr > prod) {
			System.out.println("Square of sum is Greater");
		} else {
			System.out.println("Product of numbers is Greater");
		}

	}

}

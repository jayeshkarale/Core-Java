package _04_Loops;

public class _11_ForLoopP1 {
	public static void main(String[] args) {
	
//		1) calculate sum of range between 13 to 31 using for loop.
		
		int a = 13;
		int b = 31;
		
		int sum = 0;
		
		for(int i=a;i<=b;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
//		2) calculate sum of even numbers between 17 to 34 using for loop.
		int x = 17;
		int y = 34;
		
		int sum1 =0;
		for(int j=x;j<=y;j++) {
			sum1 =sum1 +j;
		}
		System.out.println(sum1);
		
//		3) print the sum of numbers greater than 10 and less than 21 between range 7 to 31.
		
		int sum2 = 0;
		for(int i=7; i<=31; i++) {
			if(i>10 && i<21) {
				sum2 = sum2 + i;
			}
		}
		System.out.println(sum2);
	
	}

}

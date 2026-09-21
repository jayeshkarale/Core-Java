package _04_Loops;

public class _01_ForLoop {
	public static void main(String[] args) {
		
//		1. For Loop.
		
		for (int i=1;i<5;i++) {
			System.out.println("Hello World..." +i);
		}
		
		
//		print sum of 1 to 15 odd numbers.
		
		int sum=0;
		for(int x=1; x<=15; x++) {
			if(x%2 !=0) {
				sum = sum+x;
			}
		}
		System.out.println("Sum is: "+sum);
		
	}

}

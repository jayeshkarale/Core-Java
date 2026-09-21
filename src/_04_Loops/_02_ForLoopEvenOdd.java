package _04_Loops;

public class _02_ForLoopEvenOdd {
	public static void main(String[] args) {
		
//		print 1 to 10 even numbers
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			
		}
		
//		print 1 to 10 odd numbers
		for (int j=1; j<=10; j++) {
			if(j%2!=0) {
				System.out.print(j+" ");
			}
		}
	}

}

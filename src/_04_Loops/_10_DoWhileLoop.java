package _04_Loops;

public class _10_DoWhileLoop {
	public static void main(String[] args) {
		
//		3. Do-While Loop.
		
		int i = 1;
		do {
			System.out.println("Hello World..."+i);
			i++;
		} while (i<6);
		
//		Print 1 to 10 numbers using do while
		
		int a = 1;
		do {
			System.out.print(a+" ");
			a++;
			
		} while(a<=10);
		
//		Print 15 to 5 numbers using do while
		
		int b = 15;
		do {
			System.out.print(b+" ");
			b--;
		} while(b>=5);
		
//		print 10 to 25 even numbers.
		
		int x = 10;
		do {
			if(x%2==0) {
				System.out.print(x+" ");
			}
			x++;
		} while(x<=25);
	}

}

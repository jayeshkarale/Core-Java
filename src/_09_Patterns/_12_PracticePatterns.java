package _09_Patterns;

public class _12_PracticePatterns {
	
//	1) Print 4*4 Stars.
	
	void Pattern01() {
		for(int i=1; i<=4; i++) {          // * * * *
			for(int j=1; j<=4;j++) {       // * * * *
				System.out.print("* ");    // * * * * 
			}                              // * * * *
			System.out.println(" ");
		}
	}
	
//	2)
	void Pattern02() {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4;j++) {
				System.out.print("8 ");
			}
			System.out.println(" ");
		}
	}
	
	
//	3) 
	void Pattern03() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5;j++) {
				System.out.print("@ ");
			}
			System.out.println(" ");
		}
	}
	
//	4) 
	void Pattern04() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
	
//	5) 
	void Pattern05() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5;j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}
	
//	6) 
	void Pattern06() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i%2!=0) {
					System.out.print("* ");
				} else {
					System.out.print("$ ");
				}
			}
			System.out.println();
		}
	}
	
/*   7) Print the Pattern.   A B C D E
                             F G H I J 
                             K L M N O 
                             P Q R S T 
                             U V W X Y 

*/
	
	void Pattern07() {
		char ch ='A';
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=5; col++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
	
/*	8)  * * * *   Print this pattern.
	      * * *
	        * *
	          *
*/
	void Pattern08() {
		for(int row=1; row<=4; row++) {
			for(int space=1; space<=row-1; space++) {
				System.out.print(" ");
			}
			for (int col=1; col<=4-row+1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		_12_PracticePatterns obj = new _12_PracticePatterns();
		
		obj.Pattern01();
		obj.Pattern02();
		obj.Pattern03();
		obj.Pattern04();
		obj.Pattern05();
		obj.Pattern06();
		obj.Pattern07();
		obj.Pattern08();
		
	}
	

}

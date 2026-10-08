package _11_Patterns;

public class _13_PracticePatterns {
	
/* 1) Print the Pattern *                03/07/2026
	                    * *
	                    * * *
	                    * * * *
	                    * * * * *
*/
	void Pattern1() {
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

/* 2) Print the Pattern.  1
                          1 2
                          1 2 3
                          1 2 3 4
                          1 2 3 4 5	
 */
	void Pattern2() {
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
/* 3) Print the Pattern. 1
                         2 2
                         3 3 3
                         4 4 4 4
                         5 5 5 5 5
 */
	
	void Pattern3() {
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
/* 4)  A
       A B
       A B C
       A B C D
       A B C D E

 */
	void Pattern4() {
		for(int row=1; row<=5; row++) {
			char ch = 'A';
			
			for(int col=1; col<=row; col++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
	
	
/* ) * * * * *
     * * * *
     * * *
     * * 
     * 
*/
	void Pattern5() {
		for(int row=1; row<=5; row++) {
			for(int col=5; col>=row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		_13_PracticePatterns obj = new _13_PracticePatterns();
		
		obj.Pattern1();
		obj.Pattern2();
		obj.Pattern3();
		obj.Pattern4();
		obj.Pattern5();
		
	}

}
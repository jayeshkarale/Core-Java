package _09_Patterns;

public class _01_Pattterns {
	
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
	
	
	public static void main(String[] args) {
		_01_Pattterns obj = new _01_Pattterns();
		
		obj.Pattern01();
		obj.Pattern02();
		obj.Pattern03();
		obj.Pattern04();
		
	}
	

}

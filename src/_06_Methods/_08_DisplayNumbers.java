package _06_Methods;

public class _08_DisplayNumbers {
	
//	2) take start and end s parameter of range and display even numbers.
	void displayEven(int x, int y ) {
		for(int i=x; i<=y; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	
//	3) take start and end s parameter of range and display odd numbers.
	void displayOdd(int j,int k) {
		for(int z=j; z<=k; z++) {
			if(z%2!=0) {
				System.out.println(z);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		_08_DisplayNumbers obj = new _08_DisplayNumbers();
		obj.displayEven(5, 20);
		obj.displayOdd(14, 56);
	}

}

package _06_Methods;

import java.util.Scanner;
public class _14_EvenMax {
	
//	Home Work 29/06/2026
//	1) Create method EvenMax() which have 1 input parameter return max even digit from number.
	
	int EvenMax(int a) {
		int max=0;
		
		while(a>0) {
			int digit=a%10;  // shifts digit to back by 1 point.
			
			if(digit%2==0 && digit>max) {
				max=digit;
			}
			a = a/10;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		_14_EvenMax obj = new _14_EvenMax();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Numbers: ");
		int a=sc.nextInt();
		
		System.out.print("Max Even Number is: "+obj.EvenMax(a));
		sc.close();
	}

}

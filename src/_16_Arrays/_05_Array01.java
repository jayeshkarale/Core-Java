package _16_Arrays;
import java.util.Scanner;
//                           21/07/2026
class Array1{
	void accept(int arr[]) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element: ");
			arr[i]= sc.nextInt();
		}
		sc.close();
	}
	
	void display(int a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}

public class _05_Array01 {
	public static void main(String[] args) {
		
		int num[]= new int [5];
		
		Array1 aa = new Array1();
		aa.accept(num);
		aa.display(num);
	}
}

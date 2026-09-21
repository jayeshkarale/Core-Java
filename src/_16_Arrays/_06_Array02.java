package _16_Arrays;
import java.util.Scanner;

class PrintCars{
	void accept(String Cars[]) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<Cars.length;i++) {
			System.out.println("Enter Car Name: ");
			Cars[i]=sc.next();
		}
		sc.close();
	}
	
	void display(String Cars[]) {
		for(int i=0;i<Cars.length;i++) {
			System.out.println(Cars[i]);
		}
	}
}

public class _06_Array02 {
	public static void main(String[] args) {
		
		String Cars[] = new String[4];
		
		PrintCars a1 =new PrintCars();
		
		a1.accept(Cars);
		a1.display(Cars);
	}
}

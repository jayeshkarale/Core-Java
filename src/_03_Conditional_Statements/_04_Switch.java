package _03_Conditional_Statements;

import java.util.Scanner;
public class _04_Switch {

	public static void main(String[] args) {
		
//		4. Switch Statement.   19/06/2026
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day Number: ");
		int days = sc.nextInt();
		
		switch(days) {
		case 1:
			System.out.println("Monday");
			break;
		
		case 2:
			System.out.println("Tuesday");
			break;
		
		case 3:
			System.out.println("Wednesday");
			break;
		
		case 4:
			System.out.println("Thursday");
			break;
		
		case 5:
			System.out.println("Friday");
			break;
		
		case 6:
			System.out.println("Saturday");
			break;
		
		case 7:
			System.out.println("Sunday");
			break;
		
		default:
			System.out.println("invalid day");
		}
		sc.close();
	}

}

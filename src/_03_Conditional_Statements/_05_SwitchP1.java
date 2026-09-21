package _03_Conditional_Statements;

import java.util.Scanner;
public class _05_SwitchP1 {
public static void main(String[] args) {
		
//		1) WAP to know Month using switch statement.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month Number: ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("January");
			break;
		
		case 2:
			System.out.println("Feb");
			break;
		
		case 3:
			System.out.println("Mar");
			break;
		
		case 4:
			System.out.println("April");
			break;
		
		case 5:
			System.out.println("May");
			break;
		
		case 6:
			System.out.println("June");
			break;
		
		case 7:
			System.out.println("July");
			break;
			
		case 8:
			System.out.println("August");
			break;
		
		case 9:
			System.out.println("Sept");
			break;
			
		case 10:
			System.out.println("Oct");
			break;
		
		case 11:
			System.out.println("November");
			break;
			
		case 12:
			System.out.println("December");
			break;
			
		default:
			System.out.println("invalid Month");
		}
		sc.close();
   }
}

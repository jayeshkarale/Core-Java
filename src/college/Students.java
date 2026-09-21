package college;
import java.util.Scanner;

public class Students {
	
	int rollNo;
	String name;
	
	public void acceptStudent(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Roll Number: ");
		rollNo = sc.nextInt();
		
		System.out.print("Enter Name: ");
		name = sc.next();
	}
	
	public void displayStudent(){
		System.out.println("Student Name is: "+name);
		System.out.println("Roll Number is: "+rollNo);
	}

}

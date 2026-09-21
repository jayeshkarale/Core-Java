package college;
import java.util.Scanner;

public class Teachers {
	
	int teacherId;
	String teacherName;
	
	public void acceptTeacher() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Teacher Id: ");
		teacherId = sc.nextInt();
		
		System.out.print("Enter teacher Name: ");
		teacherName = sc.next();
	}
	
	public void displayTeacher() {
		System.out.println("Teacher Name is: "+teacherName);
		System.out.println("Teacher id is: "+teacherId);
	}
}

package _17_Array_Sorting;      // 23/07/2026
import java.util.Scanner;

public class _02_Student {
	private int rollNo;
	private String name;
	
	public _02_Student() {
		
	}
	
	public _02_Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void accept(_02_Student stu[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<stu.length; i++) {
			System.out.print("Enter Roll No: ");
			rollNo=sc.nextInt();
			System.out.print("Enter Name: ");
			name=sc.next();
			stu[i]=new _02_Student(rollNo,name);
		}
		sc.close();
	}
	
	public void display(_02_Student stu[]) {
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i]);
		}
	}
	
	public void display1(_02_Student stu[]) {
		for(int i=0;i<stu.length; i++) {
			System.out.println("Roll Number: "+stu[i].rollNo);
			System.out.println("Student name: "+stu[i].name);
			
		}
	}

	@Override
	public String toString() {
		return "_02_Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}



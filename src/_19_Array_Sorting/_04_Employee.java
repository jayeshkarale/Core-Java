package _19_Array_Sorting;
import java.util.Scanner;

public class _04_Employee {
	private int Eid;
	private String name;
	private String CompanyName;
	private int Salary;
	private String Designation;
	
	public _04_Employee() {
		
	}
	
	public _04_Employee(int eid, String name, String companyName, int salary, String designation) {
		super();
		Eid = eid;
		this.name = name;
		CompanyName = companyName;
		Salary = salary;
		Designation = designation;
	}

	public void acceptEmployee(_04_Employee arr[]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter Eid: ");
			Eid=sc.nextInt();
			System.out.print("Enter Name: ");
			name=sc.next();
			System.out.print("Enter Company Name: ");
			CompanyName=sc.next();
			System.out.print("Enter Salary: ");
			Salary=sc.nextInt();
			System.out.print("Enter Designation: ");
			Designation=sc.next();
			arr[i]=new _04_Employee(Eid,name, CompanyName, Salary, Designation);
		}
		sc.close();
	}
	
	public void displayEmployee(_04_Employee arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	@Override
	public String toString() {
		return "_04_Employee [Eid= " + Eid + ", name= " + name + ", CompanyName= " + CompanyName + ", Salary= " + Salary+" ₹"
				+ ", Designation= " + Designation + "]";
	}

}

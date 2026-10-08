package _10_Access_Modifiers;

class Employee{
	public int EmpId;
	public String name;
	
	String CompanyName;
	protected int salary;
	
	private void myId() {
		System.out.println(EmpId);
	}
	
	public void myName() {
		System.out.println(name);
	}
	
	void display() {		
		System.out.println("Employee id: "+EmpId);
		System.out.println("Employee Name: "+name);
		System.out.println("Company Name: "+CompanyName);
		System.out.println("Employee Salary: "+salary+" $");
	}
}

public class _05_EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.EmpId=156;
		e.name="Jayesh Karale";
		e.CompanyName="Cogizant pvt ltd";
		e.salary=65000;
		
		e.display();
	}
}

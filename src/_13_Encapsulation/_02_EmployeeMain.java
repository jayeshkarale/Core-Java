package _13_Encapsulation;

class Employee {
	
//	instance variables
	private String CompanyName;
	private int EmpId;
	private int Salary;
	
//	Setter Methods
	public void setCName(String c) {
		CompanyName = c;
	}
	
	public void setEId(int id) {
		EmpId = id;
	}
	
	public void setSal(int s) {
		Salary = s;
	}
	
//	Getter Methods
	public String getCName() {
		return CompanyName;
	}
	
	public int getEId() {
		return EmpId;
	}
	
	public int getSal() {
		return Salary;
	}
}

public class _02_EmployeeMain {
	public static void main(String[] args) {
		Employee obj = new Employee();
		
		obj.setCName("Cognizant Pvt Ltd");
		obj.setEId(2001);
		obj.setSal(58000);
		
		System.out.println("Company Name: "+obj.getCName());
		System.out.println("Employee Id: "+obj.getEId());
		System.out.println("Employee Salary: "+obj.getSal()+" ₹");
	}
}

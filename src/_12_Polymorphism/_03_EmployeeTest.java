package _12_Polymorphism;

//  Create an Employee class with a calculateSalary() method. Create PermanentEmployee and
//  ContractEmployee classes that override the method to calculate salary differently.

class Employee {
	int CalcSalary() {
		return 0;
	}
}

class PermEmployee extends Employee{
	@Override
	int CalcSalary() {
		return 15000 + 3000;
	}
}

class ContrEmployee extends Employee{
	@Override
	int CalcSalary() {
		return 16000;
	}
}

public class _03_EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new PermEmployee();
		Employee e2 = new ContrEmployee();
		
		System.out.println("Salary of Permenent Employee: "+e1.CalcSalary());
		System.out.println("Salary of Permenent Employee: "+e2.CalcSalary());
	}

}

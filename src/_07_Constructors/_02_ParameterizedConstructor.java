package _07_Constructors;

// 2. Parameterized Constructor: a constructor that accepts parameters

class Employee{
	int Eid;
	String name;
	
	Employee(String n, int r){
		Eid=r;
		name=n;
	}
	void Display() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee id: "+Eid);
	}
}


public class _02_ParameterizedConstructor {
	public static void main(String[] args) {
		Employee e = new Employee( "Jayesh K",2001);
		e.Display();
	}
}

package _10_Variables;

public class _01_Employee {
	
	private int Eid;         // instance variables
	private String Ename;
	
	public _01_Employee(int id, String name) {
		Eid = id;
		Ename = name;
	}
	
	void display() {
		System.out.println(Eid);
		System.out.println(Ename);
	}
	
	void details() {
		int num = 10;     // local variable
		System.out.println(num);
	}

}

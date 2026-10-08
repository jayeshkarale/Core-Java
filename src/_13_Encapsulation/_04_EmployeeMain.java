package _13_Encapsulation;

class Employees{
	private int Eid;         // private data member
	String name;             // default (package-private) access
	
	public void setEid(int Eid) {
		this.Eid =Eid;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public int getEid() {
		return Eid;
	}
	
	public String getname() {
		return name;
	}
}


public class _04_EmployeeMain {
	public static void main(String[] args) {
		Employees e = new Employees();
		e.setEid(2001);
		e.setname("Jayesh");
		
		e.name="Karale";
//		e.Eid=1564;        // you cannot do this due to private variable.

		System.out.println(e.getEid());
		System.out.println(e.getname());
	}
}

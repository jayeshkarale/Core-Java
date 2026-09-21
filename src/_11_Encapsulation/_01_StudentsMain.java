package _11_Encapsulation;

class Students {
	
//	instance variables
	private int RollNo;
	private String StudentName;
	private String CollegeName;
	
//	Setter Methods	
	public void setRollNo(int r) {
		RollNo = r;
	}
	
	public void setName(String n) {
		StudentName = n;
	}
	
	public void setCollegeName(String c) {
		CollegeName = c;
	}
	
//	Getter Methods
	public int getRollNo() {
		return RollNo;
	}
	
	public String getName() {
		return StudentName;
	}
	
	public String getCollegeName() {
		return CollegeName;
	}
	
}

public class _01_StudentsMain {
	public static void main(String[] args) {
		Students obj = new Students();
		
		obj.setRollNo(112);
		obj.setName("Jayesh Karale");
		obj.setCollegeName("SSGMCE Shegaon");
		
		System.out.println("Roll number: "+obj.getRollNo());
		System.out.println("Name: "+obj.getName());
		System.out.println("College: "+obj.getCollegeName());
	}
}

package _07_Constructors;

class Students{
	String name;
	int rollNo;
	double percentage;
	
	void printInfo() {
		System.out.println("Student name: "+this.name);
		System.out.println("Student Roll Number: "+this.rollNo);
		System.out.println("Student Percentage: "+this.percentage);
	}
	
	Students(String name, int rollNo, double percentage){
		this.name=name;
		this.rollNo=rollNo;
		this.percentage=percentage;
	}
}

public class _03_StudentTest {
	public static void main(String[] args) {
		Students s = new Students("jayesh karale", 16, 95.10);
		s.printInfo();
	}
}

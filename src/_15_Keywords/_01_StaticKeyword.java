package _15_Keywords;

// Static Keyword
class Student{
	String name;
	int rollNo;
	static String College="SSGMCE SHEGAON";
}

public class _01_StaticKeyword {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name="Jayesh Karale";
		s1.rollNo=2001;
		
		Student s2 = new Student();
		s2.name="Karan Shelke";
		s2.rollNo=2002;

		System.out.println("Name: "+s1.name);
		System.out.println("Roll No: "+s1.rollNo);
		System.out.println("College: "+Student.College);
		
		System.out.println("Name: "+s2.name);
		System.out.println("Roll No: "+s2.rollNo);
		System.out.println("College: "+Student.College);
		
		
	}
}

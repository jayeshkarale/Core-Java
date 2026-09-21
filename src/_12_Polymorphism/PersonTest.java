package _12_Polymorphism;

class Person{
	void intro() {
		System.out.println("i am person");
	}
}

class Son extends Person{
	@Override
	void intro() {
		System.out.println("Son at home");
	}
}

class Student extends Person{
	@Override
	void intro() {
		System.out.println("Student at college");
	}
}

public class PersonTest {
	public static void main(String[] args) {
		
		Person p;    //  parent reference, child object
		p = new Son();
		p.intro();
		
		Person p1;
		p1 = new Student();
		p1.intro();
		
	}

}

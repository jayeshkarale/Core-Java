package _07_Constructors;

// 1. Default Constructor (no-argument)

class Student{
	Student() {      // constructor created
		System.out.println("Constructor called...");
	}
}

public class _01_DefaultConstructor {
	public static void main(String[] args) {
		Student a = new Student();  // automatically called
	}
}

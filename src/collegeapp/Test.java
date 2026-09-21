package collegeapp;

import college.Students;
import college.Teachers;

public class Test {
	
	public static void main(String[] args) {
		Students s = new Students();
		
		s.acceptStudent();
		s.displayStudent();
		
		Teachers t = new Teachers();
		t.acceptTeacher();
		t.displayTeacher();
	}

}

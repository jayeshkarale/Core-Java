package _06_Methods;

public class _09_RollNumber {
	
//	2. Method with Return value and Parameters
	
	int rollNumber(int rollno) {
		rollno = rollno + 10;
		return rollno;
	}
	
	public static void main(String[] args) {
		_09_RollNumber obj = new _09_RollNumber();
		
		int result = obj.rollNumber(8);
		System.out.println(result);
	}

}

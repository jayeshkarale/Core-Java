package _20_Exception_Handling;

public class _10_PassFail {
	public static void main(String[] args) {
		try {
			checkMarks(85);
		} catch(_09_InvalidMarks e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void checkMarks(int marks) throws _09_InvalidMarks {
		if(marks<75) {
			throw new _09_InvalidMarks("Fail");
		}
		System.out.println("you are pass..");
	}

}

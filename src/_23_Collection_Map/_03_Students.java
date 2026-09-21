package _23_Collection_Map;
import java.util.Map;
import java.util.Scanner;

class Students {
	private int rollNo;
	private String name;
	private String department;
	
	public Students(int rollNo, String name, String department) {
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
	}
	
	public Students(){
		
	}
	
	@Override
	public String toString() {
		return "Students [sid=" + rollNo + ", name=" + name + ", department=" + department + "]";
	}

	void accept(Map<Integer, Students>pmap) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter key: ");
			int key = sc.nextInt();
			
			System.out.println("Enter Roll No: ");
			int rollNo = sc.nextInt();
			
			System.out.println("Enter Student name: ");
			String name = sc.next();
			
			System.out.println("Enter Department: ");
			String department = sc.next();
			
			Students s = new Students(rollNo, name, department);
			pmap.put(key,s);
			sc.close();
		}
	}
}

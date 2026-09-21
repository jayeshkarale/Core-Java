package _26_Java_8_Features;

import java.util.List;
import java.util.Arrays;

class Employee{
	private int eid;
	private String name;
	private int Salary;
	
	public Employee() {
		
	}
	
    public Employee(int eid, String name, int Salary) {
		super();
		this.eid=eid;
		this.name=name;
		this.Salary=Salary;
	}
    
    public int getEid() {
    	return eid;
    }
    
    public void setEid(int eid) {
    	this.eid=eid;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name=name;
    }
    
    public int getSalary() {
    	return Salary;
    }
    
    public void setSalary(int Salary) {
    	this.Salary=Salary;
    }
}

public class _07_MainEmployee {
	public static void main(String[] args) {
		
		List<Employee> emplist = Arrays.asList(new Employee(1,"Jethalal G",20000),
				(new Employee(2,"Mauli M", 70000)),
				(new Employee(3,"Jayesh K", 85000)),
				(new Employee(4,"Salman K", 35000))
				);   // shortcut to create variables --> SHIFT + ALT +l
				
		emplist.forEach(n -> {
			if(n.getSalary()>50000) {
				System.out.println(n.getName()+" : "+n.getSalary()+" ₹");
			}
		});
	}
}

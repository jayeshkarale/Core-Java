package _23_Collection_List;

import java.util.Vector;

public class _03_Vector {
	public static void main(String[] args) {
		
		Vector<String> list = new Vector<String>();
		
		list.add("physics");
		list.add("chemistry");
		list.add("mathematics");
		list.add("computer science");
		
		System.out.println(list);
		
		list.add("marathi");
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.capacity());
		
		
	}

}

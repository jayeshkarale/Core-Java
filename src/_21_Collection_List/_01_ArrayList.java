package _21_Collection_List;
import java.util.ArrayList;

public class _01_ArrayList {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		System.out.println(list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Jayesh");
		list2.add("Karale");
		System.out.println("Names: "+list2);
		
		System.out.println(list2.get(1));  // accessing element by index.
		
		list2.addFirst("Jay");  // to add element at first index.
		System.out.println(list2);
		
		list2.addLast("Shegaon");  // to add element at last index.
		System.out.println(list2);
		
		list2.set(1, "Patil");   // updating an element by index.
		System.out.println(list2);
		
		list2.remove(1);  // removing an element by index.
		System.out.println(list2);
		
		System.out.println(list2.size());  // prints size of list.
		
		System.out.println(list2.contains("Shegaon"));  // returns true if list has element otherwise false.
		
	}

}

package _22_Collection_Sets;      // -- 06/08/2026
import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _01_HashSets {
	public static void main(String[] args) {
		
		HashSet<String> course = new HashSet<String>();  // creating HashSet-it does not maintains insertion order & duplicate values not allowed.
		course.add("java");
		course.add("python");
		course.add("c++");
		course.add("Sql");
		course.add("Spring Boot");
		course.add("java");
		System.out.println(course);
		
		Iterator<String> iterator = course.iterator();
		while(iterator.hasNext()) {              // printing each elements one by one
			System.out.println(iterator.next());
		}
		
		Set<String> course1 = new LinkedHashSet<String>(); // creating LinkedHashSet-it maintains insertion order & duplicate values not allowed.
		course1.add("java");
		course1.add("python");
		course1.add("c++");
		course1.add("Sql");
		course1.add("SpringBoot");
		System.out.println(course1);
	}

}

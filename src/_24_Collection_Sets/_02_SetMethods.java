package _24_Collection_Sets;
import java.util.HashSet;

public class _02_SetMethods {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("SQL");
        set.add("Java"); // Duplicate
        System.out.println(set);
        
        System.out.println(set.size());
        System.out.println(set.contains("Java"));
        
        set.remove("SQL");
        System.out.println(set);
	}

}

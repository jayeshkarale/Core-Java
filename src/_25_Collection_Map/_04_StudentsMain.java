package _25_Collection_Map;
import java.util.Map;
import java.util.HashMap;

public class _04_StudentsMain {
	public static void main(String[] args) {
		
		Map<Integer, Students> pmap= new HashMap<Integer, Students>();
		
		Students s = new Students();
		s.accept(pmap);
		System.out.println("\nStudent Details:");
		for(Map.Entry<Integer, Students> entry : pmap.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}

}

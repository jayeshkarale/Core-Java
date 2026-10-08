package _22_Exception_Handling;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class _02_CheckException {
	public static void main(String[] args) {
		
		try {
			FileReader file = new FileReader("text.txt");
		} catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	
	}

}

package _24_File_Handling;
import java.io.File;
import java.io.IOException;

public class _01_CreateFile {
	public static void main(String[] args) {
		try {
			File file = new File("jayesh.txt");
			if(file.createNewFile()) {
				System.out.println("File Created: "+file.getName());
			} else {
				System.out.println("File Already Exists.");
			}
		} catch (IOException e) {
			System.out.println("An Error Occurred.");
			e.printStackTrace();
		}
	}
	
	
	
}

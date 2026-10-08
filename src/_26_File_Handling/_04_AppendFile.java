package _26_File_Handling;
import java.io.FileWriter;
import java.io.IOException;

public class _04_AppendFile {
	public static void main(String[] args) {
		
		try {
			FileWriter file = new FileWriter("jayesh.txt", true);
			file.write("i am from Shegaon, Maharashtra");
			file.close();
		} catch (IOException e) {
			System.out.println("Error Occurred.");
		}
	}
}

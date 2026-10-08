package _26_File_Handling;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class _03_ReadFile {
	public static void main(String[] args) {
		
		try {
			File file = new File("jayesh.txt");
			Scanner sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
		}
	}
}

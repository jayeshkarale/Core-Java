package _26_File_Handling;
import java.io.FileWriter;
import java.io.IOException;

public class _02_WriteFile {
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("jayesh.txt");
			writer.write("My name is Jayesh Karale & i am Full Stack Java Developer.");
			writer.close();
			System.out.println("Write Success.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

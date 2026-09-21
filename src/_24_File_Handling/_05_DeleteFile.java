package _24_File_Handling;
import java.io.File;
import java.io.IOException;

public class _05_DeleteFile {
	public static void main(String[] args) {
		
		File file = new File("jayesh.txt");
		if(file.delete()) {
			System.out.println("Deleted file. "+file.getName());
		} else {
			System.out.println("file does not exists.");
		}
	}

}

package _21_Strings;
import java.util.Arrays;
import java.util.Scanner;

public class _06_AnagramCheck {
	public static void main(String[] args) {
		checkAnagram();
	}
	
	public static void checkAnagram() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter first String: ");
		 String str1 = sc.next();
		 
		 System.out.println("Enter first String: ");
		 String str2 = sc.next();
		 
		 char ch[]=str1.toCharArray();
		 Arrays.sort(ch);
		 
		 char ch1[]=str2.toCharArray();
		 Arrays.sort(ch1);
		 
		 if(Arrays.equals(ch, ch1)) {           // == compares memory addresses.
			 System.out.println("Anagram.");
		 } else {
			 System.out.println("Not an Anagram.");
		 }

		sc.close();
	}

}

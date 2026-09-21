package _19_Strings;       // 28/07/2026
import java.util.Scanner;

public class _04_StringPrograms1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String str1 = sc.next();
		int length = str1.length();
		System.out.println("length of string: "+length);
		
		countLowercase();
		countUppercase();
		countDigits();
		reverseString();
		checkPalidrom();
		printSubstring();
		sc.close();
	}

	static void countLowercase() {
		String str2 = "ProGramMinG";
		int count=0;
		
		for (int i = 0; i < str2.length(); i++) {
			char ch=str2.charAt(i);
			
			if(ch>='a' && ch<='z') {
				count++;
			}
		}
		System.out.println("lower case count: "+count);
	}
	
	static void countUppercase() {
		String str2 = "ProGramMinG";
		int count=0;
		
		for (int i = 0; i < str2.length(); i++) {
			char ch=str2.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				count++;
			}
		}
		System.out.println("upper case count: "+count);
	}
	
	static void countDigits() {    // count digits in string.
		String str1="P5roG1ram5MinG7";
		int count=0;
		for (int i = 0; i < str1.length(); i++) {
			int a =str1.charAt(i);
			
			if(a>='0' && a<='9') {
				count++;
			}
		}
		System.out.println("digit count: "+count);
	}
	
	static void reverseString() {     // print reverse string.
		String str2 = "jayesh";
		String newstr = "";
		
		for (int i = 0; i < str2.length(); i++) {
			newstr = str2.charAt(i)+newstr;
		}
		System.out.println("Reverse String: "+newstr);
	}
	
	static void checkPalidrom() {        // check string is palindrome.
		String str3 = "RACECAR";
		String reversestr = "";
		
		for (int i = 0; i < str3.length(); i++) {
			reversestr = str3.charAt(i)+reversestr;
		}
		if(reversestr.equals(str3)) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("it is not palindrom");
		}
	}
	
	static void printSubstring() {
		String str4="java";
		System.out.println("Substrings are: ");
		for (int i = 0; i < str4.length(); i++) {
			for (int j = 1+i; j <= str4.length(); j++) {
				String substr=str4.substring(i,j);
				System.out.print(substr+" ");
			}
					
		}
	}

}

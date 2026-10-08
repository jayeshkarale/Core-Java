package _21_Strings;

// Methods in Strings.    27/07/2026

public class _02_StringMethods {
	public static void main(String[] args) {
		
		String str1 ="java learning";
		
		int length = str1.length();
		System.out.println("Length of String: "+length);  // prints length of string.
		
		String str2 = str1.concat("-2026");      // String concatenate- it joins 2nd String to the end of 1st String.
		System.out.println(str1);
		System.out.println(str2);  // prints the concatenated string.
		
		boolean empty = str2.isEmpty();  // checks the string has 0 characters and returns true otherwise false.
		System.out.println(empty);       // returns false, because string has 13 characters.
		
		int first=str2.indexOf('v');    // searches the first occurrence of specified character or string.
		System.out.println(first);      // prints v because it first occurrence is at index 2.
				
		boolean equals = str2.equals("java");  // it compares the contents(values) of strings.
		System.out.println(equals);            // false because "java" is not same as "java learning-2026"
		
		char ch = str2.charAt(6);       // prints the character of string at 6th index.
		System.out.println(ch);         // at index 6th character is "e".
		
		char charray[] = str2.toCharArray();  // converts the entire string into character array.
		System.out.println(charray);
		
		for (int i = 0; i < charray.length; i++) {  // prints the each character of array.
			System.out.print(charray[i]+" ");
		}
		System.out.println();
		
		String upperCase = str2.toUpperCase();  // converts lower case string to upper case. 
		System.out.println(upperCase);
		
		String sub = str2.substring(5,13);   // prints substring by start and end index values.
		System.out.println(sub);
		
		String str3 = "   java   ";
		String trim =  str3.trim();  // it removes the starting and ending white spaces from string.
		System.out.println(trim);
		
		String str4 ="JAYESH";
		String str5 = str4.replace("A", "@");     // it replaces the string characters of old with new character.
		System.out.println(str5);
		
		String str6 = "246JAY9HIND758";
		String str7=str6.replaceAll("[0-9]","-");  // replaces 0-9 numbers with the white spaces.
		System.out.println(str7);
		
		int a=100;                 //converts the value of any primitive data type (int, double, char, boolean) into string.
		String str8 = String.valueOf(a);   // integer 100 in converted into String "100"
		System.out.println(str8);
	}

}

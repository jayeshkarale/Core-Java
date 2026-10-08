package _21_Strings;

public class _01_CreateString {
	public static void main(String[] args) {
		
		String s = new String("jayesh k");   // create string by new keyword.
		System.out.println(s);
		
		String s1 = "java learning";         // create string by literal (constant).
		System.out.println(s1);
		
		char ch[] = {'a','b','c','d'};       // creating array of strings.
		String s3 = new String(ch);
		System.out.println(s3);
		
		
		String str = "java";
		System.out.println(str.length());
		System.out.println(str.substring(2, 4));
		
	}

}

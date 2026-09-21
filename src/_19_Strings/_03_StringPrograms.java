package _19_Strings;

public class _03_StringPrograms {
	public static void main(String[] args) {
		
		displayVowels();
	}
	
	public static void displayVowels() {
		
//		1st Way
		String s1="jayesh";
		char ch[]=s1.toCharArray();
		System.out.println("Vovels in jayesh: ");
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				System.out.print(ch[i]+" ");
			}
		}
		System.out.println();
		
//		2nd Way
		String s2 = "karale";
		System.out.println("Vowels in karale: ");
		for (int i = 0; i < s2.length(); i++) {
			char ch1 =s2.charAt(i);
			if (ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') {
				System.out.print(ch1+" ");
			}
		}
	}

}

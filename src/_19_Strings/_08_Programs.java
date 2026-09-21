package _19_Strings;

public class _08_Programs {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("i am learning java");  // remove spaces.
		String str =sb.toString();
		String str1 =str.replace(" ", "");
		System.out.println(str1);
		
		StringBuilder sb1 = new StringBuilder("123am6learning7java"); // replace digits.
		String str2 =sb1.toString();
		String str3 =str2.replaceAll("[0-9]", " ");
		System.out.println(str3);
		
//		StringBuilder sb2 = new StringBuilder("Proramming");
//		String str4 = sb2.toString();
//		char ch[] = str4.toCharArray();
//		
//		int count=0;
//		for (int i = 0; i < ch.length; i++) {
//			if(ch)
//		}		
		
		
	}

}

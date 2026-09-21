package _19_Strings;

public class _05_StringSorting {
	public static void main(String[] args) {
		
//		String str = "JAyesh";
//		StringBuilder sb = new StringBuilder(str);
//		sb.setCharAt(5, 'K');
//		System.out.println(sb);
		
		sortString();
		
	}
	
	public static void sortString() {   // String Sorting.
		String str = "jayesh";
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length-i-1; j++) {
				if(ch[j]>ch[j+1]) {
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
	
package _19_Strings;

public class _07_StringBuffer {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("java ");
		
		sb.append("prorammming.");
		System.out.println(sb);
		
		sb.setCharAt(1, '@');
		System.out.println(sb);
		
		sb.insert(6, 'J');
		System.out.println(sb);
		
		sb.delete(6, 7);
		System.out.println(sb);
		
		sb.replace(0, 5, "python ");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("Developer");
		sb1.reverse();
		System.out.println(sb1);
		
	}

}

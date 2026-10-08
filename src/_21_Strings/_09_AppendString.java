package _21_Strings;

public class _09_AppendString {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("J");
        sb.append("A");
        sb.append("Y");
        sb.append("E");
        sb.append("S");
        sb.append("H");
        sb.append(" K");

        System.out.println(sb);
        System.out.println("Length of String: "+sb.length());
	}

}

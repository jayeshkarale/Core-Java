package _26_Java_8_Features;

import java.util.Optional;

public class _12_Optional {
	public static void main(String[] args) {
		String str =null;
		System.out.println(str.length());
		
		Optional<String> optionalName = Optional.ofNullable(str);
		System.out.println(optionalName);
		
		String n = optionalName.orElse("Unknown");
		System.out.println(n);
	}
// core java end...
}
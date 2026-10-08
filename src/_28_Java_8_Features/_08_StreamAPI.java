package _28_Java_8_Features;  // 19/08/2026
// Stream API

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _08_StreamAPI {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
//		for (Integer n : numbers) {  // Before Java 8
//			if (n<40) {
//				System.out.println(n);
//			}
//		}
		
//		Using Stream API
		numbers.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
		
//		Even Numbers.
		List<Integer> evenNum = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(evenNum);
		
//		Odd Numbers greater than 5.
		List<Integer> oddNum = numbers.stream().filter(n -> n%2!=0 && n>5).collect(Collectors.toList());
		System.out.println(oddNum);
		
	}
}

package _26_Java_8_Features;

import java.util.Arrays;
import java.util.List;

public class _09_LearnStream {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,5,2,3,4,5,6,7,6,8,9);
		
//		Squares
		numbers.stream().map(n-> n*n).forEach(n-> System.out.print(n+" "));
		System.out.println();
		
//		add +3
		numbers.stream().map(n-> n+3).forEach(n-> System.out.print(n+" "));
		System.out.println();
		
		numbers.stream().distinct().forEach(n->System.out.print(n+" ")); // .distinct()
		System.out.println();
		
		numbers.stream().limit(3).forEach(n->System.out.print(n+" ")); // .limit(3)
		System.out.println();
		
		numbers.stream().sorted().forEach(n->System.out.print(n+" ")); // .sorted()
		System.out.println();
		
		numbers.stream().sorted((a,b)->b-a).forEach(n->System.out.print(n+" "));
		System.out.println();		
	}
}

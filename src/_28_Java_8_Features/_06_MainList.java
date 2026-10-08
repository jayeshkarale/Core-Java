package _28_Java_8_Features;

import java.util.List;
import java.util.Arrays;

public class _06_MainList {
	public static void main(String[] args) {
		
        List<Integer> num2 = Arrays.asList(10, 20, 30, 40, 50);

        // Traditional for-each loop
        for (Integer n : num2) {
            System.out.println(n);
        }

        System.out.println();

        // Java 8 forEach() + Lambda
        num2.forEach(n -> System.out.println(n));
    }
}

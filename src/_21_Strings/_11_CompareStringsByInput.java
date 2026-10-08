package _21_Strings;

import java.util.Scanner;

public class _11_CompareStringsByInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("enter first string: ");
        String name1 = sc.nextLine();

        System.out.print("enter second string: ");
        String name2 = sc.nextLine();

        if (name1.compareTo(name2) == 0){
            System.out.println("Result: strings are equal");
        }else {
            System.out.println("Result: strings are not equal");
        }
	}

}

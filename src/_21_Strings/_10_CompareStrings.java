package _21_Strings;

public class _10_CompareStrings {
	public static void main(String[] args) {
		String name1 = "Jayesh";
        String name2 = "Jayesh K";

//        s1 > s2: +ve value
//        s1 == s2: 0
//        s1 < s2: -ve value

//        How strings are compared in java ?
//        1. strings "hello" > "cello" cause "h" comes after "c"
//        2. strings "hello" < "wello" cause "w" comes after "h"
//        as so in alphabetical order

        if (name1.compareTo(name2) == 0){
            System.out.println("Strings are Equal");
        }else{
            System.out.println("Strings are not Equal");
        }
	}

}

package _03_Conditional_Statements;

public class _02_if_else {
	public static void main(String[] args) {
		
//		2. If-else Statement Programs.
		
//		1) Check Positive or Negative Number
		int m = -15;
		if(m>0) {
			System.out.println("Postive Number");
		} else {
			System.out.println("Negative Number");
		}
		
//		2) Check Even or Odd Number
		int n = 9;
		if(n % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		
//		3) Find Which is Big Number
		int num1 = 12, num2 = 7;
		if(num1>num2) {
			System.out.println("num 1 is Big");
		} else {
			System.out.println("num 2 is Big");
		}
		
//		4) Take 2 double variable & Find which is smallest.
		double x = 12.6, y = 18.5;
		if(x<y) {
			System.out.println("x is small");
		} else {
			System.out.println("y is small");
		}
		
//		5) WAP to check eligibility to vote if age is >= 18 otherwise not.
		int age = 16;
		if(age>=18) {
			System.out.println("you can vote");
		} else {
			System.out.println("you cannot vote");
		}
		
//		6) WAP which checks number is divisible of 5 or not.
		int a = 45;
		if(a % 5 == 0) {
			System.out.println("No is Divisible by 5");
		} else {
			System.out.println(" No is not divisible by 5");
		}
		
//		7) WAP which checks number is divisible of 4 and 7.
		int a1 = 28;
		if(a1 % 4 == 0 && a1 % 7 == 0) {
			System.out.println("No is Divisible by 4 and 7");
		} else {
			System.out.println("No is not divisible by 4 and 7");
		}
		
//		8) WAP which checks year is leap or not.
		int year = 2028;
		if((year % 400 == 0)  || ((year % 4 ==0) && (year % 100 != 0))) {
			System.out.println("leap year");
		} else {
			System.out.println("not leap year");
		}
		
//		9) Check Character is vowel or consonant.
		char ch = 'j';
		if(ch== 'a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'a'||ch== 'u') {
			System.out.println("Character is vowel");
		} else {
			System.out.println("Character is consonant");
		}
	}

}

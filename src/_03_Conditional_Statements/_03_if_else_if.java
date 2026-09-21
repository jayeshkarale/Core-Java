package _03_Conditional_Statements;

public class _03_if_else_if {
	public static void main(String[] args) {
		
//		3. If-else If Statement.
		
		int n =10;
		if(n>0) {
			System.out.println("positive");
		} else if(n<0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
		
//		1) Find biggest number from 5 integer numbers.
		
		int num1 = 12, num2 = 15, num3 = 17, num4 = 20, num5 = 13;
		if (num1>num2 && num1>num3 && num1>num4 && num1>num5) {
			System.out.println(num1 +" is biggest");
		} else if (num2>num1 && num2>num3 && num2>num4 && num2>num5) {
			System.out.println(num2 +" is biggest");
		} else if (num3>num1 && num3>num2 && num3>num4 && num3>num5) {
			System.out.println(num3 +" is biggest");
		} else if (num4>num1 && num4>num2 && num4>num3 && num4>num5) {
			System.out.println(num4 +" is biggest");
		} else {
			System.out.println(num5 +" is biggest");
		}
		
//		2) Find smallest number between 4 float numbers.
		
		float a = 3.25f, b = 6.3f, c = 12.564f, d = 8.54f;
		if (a<b && a<c && a<d) {
			System.out.println(a+" is smallest float number");
		} else if(b<a && b<c && b<d) {
			System.out.println(b+" is smallest float number");
		} else if(c<a && c<b && c<d) {
			System.out.println(c+" is smallest float number");
		} else if(d<a && d<b && d<c) {
			System.out.println(d+" is smallest float number");
		}
		
		
//	    3) Find 2nd biggest number between 3 integers.
		int a1 = 23, b1 = 56, c1 = 48;
		int max = Integer.MIN_VALUE, smax = Integer.MAX_VALUE;
		
		// compare with a1
		if(a1>max) {
			smax = max;
			max = a1;
		} else if(a1>smax) {
			smax=a1;
		}
		
		// compare with b1
		if(b1>max) {
			smax = max;
			max = b1;
		} else if(b1>smax) {
			smax = b1;
		}
		
		// compare with c1
		if(c1>max) {
			smax = max;
			max = c1;
		} else if(c1>smax) {
			smax = c1;
		}
		System.out.println(max+" biggest number");
		System.out.println(smax+" 2nd biggest number");
		
	}

}

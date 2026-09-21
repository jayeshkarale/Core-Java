package _02_Operators;

public class _06_UnaryOperatorsP1 {
	public static void main(String[] args) {
		
		int c =20; // 20,21,22
		int d = c++ + c++; // post-increment
		System.out.println(d);
		System.out.println(c);
		
		int c1 = 20; // 20,19,18
		int d1 = c1-- + c1--; // post-decrement
		System.out.println(d1);
		
		int m = 5, n = 7, p = 9; // m = 5,6,7  n = 7,8  p = 9,10,9
		int q = m++ + n++ + p++ + ++m + --p;
//		      =  6  +  8  +  10 + 1+6 + 10-1  = 37
		System.out.println(q);
		
		int m1 = 4, n1 = 5, p1 = 6;// m1 = 4,5,4,5  n1 = 5,4,5,6  p1 = 6,5,4,5
		int q1 = m1++ + n1-- + p1-- + --m1 + ++n1;
//		       =   5  +  4   +   5  +  4   +   5   = 24
		System.out.println(q1);
		
		int x1 = q1-- + ++m1 + p1-- + ++n1 + p1++;
//		       =  24  +  5   +  4   +  6   +  5   =  44
		System.out.println(x1);
		
		int k1 = 6, k2 = 7, k3 = 8;
		int j1= k1++ + ++k1 + k2++ - k3++ + --k3 + k3++;
		System.out.println(j1);
		
		int r = 6, s = 3; // Updated Values: c = 6,7,6,7  d = 3,2,3
		int t = r++ + --r + --s + s++ - r++ + s++ - --r;
//		    e =  6  +  6  +  2  +  2  -  6  +  3  -  6 = 7   
		System.out.println(t);
		
		int x = 4, y = 6, z = 7; // Updated Values: x = 4,5,6 y = 6,7,6 z = 7,8,7
		int z1 = x++ + y++ + z++ - --y + ++x - --z;
//		    z1 =  4  +  6  +  7  -  6  +  6  -  7 = 10 
		System.out.println(z1);
	}

}

package _06_Methods;

import java.util.Scanner;
public class _13_Percentage {
	
//	4) create method CalcAverage() input 2 parameters values as percentage and total value of percent.
	
	float CalcPercentage(float percentage, float total) {
		float result = (total*percentage)/100;
		return result;
	}
	
	public static void main(String[] args) {
		_13_Percentage obj = new _13_Percentage();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total: ");
		float total=sc.nextFloat();
		System.out.print("Enter Percentage: ");
		float percentge=sc.nextFloat();
		
		float ans = obj.CalcPercentage(percentge, total);
		System.out.println(ans);
		sc.close();
	}

}

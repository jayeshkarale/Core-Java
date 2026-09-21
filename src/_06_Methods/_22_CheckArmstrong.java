package _06_Methods;

public class _22_CheckArmstrong {
	
//	Armstrong Number
	
/* Number = 153
   1^3 + 5^3 + 3^3 = 1+125+27 = 153
   then it is Armstrong Number.
  
*/
	
	int CountDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    int calpow(int base, int power) {
        int prod = 1;
        for (int i = 1; i <= power; i++) {
            prod = prod * base;
        }
        return prod;
    }
	
    void ArmstrongNum(int n) {
        int temp = n;
        int power = CountDigit(n);
        int sum = 0;

        while (n > 0) {
            int base = n % 10;
            sum = sum + calpow(base, power);
            n = n / 10;
        }

        if (sum == temp) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
	
	public static void main(String[] args) {
		_22_CheckArmstrong obj = new _22_CheckArmstrong();
		
		obj.ArmstrongNum(153);   // Armstrong
        obj.ArmstrongNum(370);   // Armstrong
        obj.ArmstrongNum(371);   // Armstrong
        obj.ArmstrongNum(407);   // Armstrong
        obj.ArmstrongNum(123);   // Not Armstrong
	}

}

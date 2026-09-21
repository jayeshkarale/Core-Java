package _26_Java_8_Features;

interface CheckPrime{
	boolean isPrime(int n);
}
public class _05_CheckPrime {
	public static void main(String[] args) {
		
		CheckPrime p = (n) -> {

            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        };

        boolean result = p.isPrime(7);

        if (result) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
	}
}

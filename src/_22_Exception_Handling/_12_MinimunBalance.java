package _22_Exception_Handling;

public class _12_MinimunBalance {
	public static void main(String[] args) {
		try {
			minBalance(450);
		} catch (_11_MinimumBalException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void minBalance(int bal) throws _11_MinimumBalException {
		if(bal<500) {
			throw new _11_MinimumBalException("Minimun withdrawl ammount should be 500.00 ₹");
		}
		System.out.println("Withdrawl Successful..");
	}

}

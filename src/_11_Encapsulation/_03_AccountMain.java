package _11_Encapsulation;

class AccountInfo{
	private int AccountNo;     // private data member
	String BankName;           // default (package-private) access   
	
	public void setAccountNo(int AccountNo){
		this.AccountNo=AccountNo;
	}
	
	public void setBankName(String BankName){
		this.BankName=BankName;
	}
	
	public int getAccountNo() {
		return AccountNo;
	}
	
	public String getBankName() {
		return BankName;
	}
}

public class _03_AccountMain {
	public static void main(String[] args) {
		AccountInfo a = new AccountInfo();
		a.setAccountNo(60320);
		a.setBankName("Bank of Baroda");
		
//		a.AccountNo=15446;      // you cannot do this due to private variable.
		a.BankName="Bank of Maharashtra";     // this can be done cause BankName is not private.
		
		System.out.println("Account Number is: "+a.getAccountNo());
		System.out.println("Bank Name is: "+a.getBankName());
	}
}

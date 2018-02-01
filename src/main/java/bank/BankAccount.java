package bank;

public class BankAccount {

	private String accountNum;
	private String type;
	private double balance;
	
	public BankAccount(String accountNum, String type, double balance) {
		this.accountNum = accountNum;
		this.type = type;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNum;
	}

	public String getAccountType() {
		
		return type;
	}

	public double getBalance() {
		return balance;
	}

	

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public void setAccountType(String type) {
		this.type = type;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

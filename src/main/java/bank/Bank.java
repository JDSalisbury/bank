package bank;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	
	private Map<String,BankAccount> accounts = new HashMap<String, BankAccount>();

	public void addAccount(BankAccount bankAccount) {
		 accounts.put(bankAccount.getAccountNumber(), bankAccount);
	}

	public int numberOfAccounts() {
		return accounts.size();
	}

	public void closeAccount(String key) {
		accounts.remove(key);
		
	}

}

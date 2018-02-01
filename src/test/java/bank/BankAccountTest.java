package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;

public class BankAccountTest {
	
	@Test
	public void shouldcreateBankAccountWithAccountNameTypeAndBalance() {
		BankAccount underTest = new BankAccount("", "", 0.0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldReturnAccountNumber() {
		BankAccount underTest = new BankAccount("", "", 0.0);
		String check = underTest.getAccountNumber();
		assertEquals("",check);
	}
	
	@Test
	public void shouldReturnAccountType() {
		BankAccount underTest = new BankAccount("", "", 0.0);
		String check = underTest.getAccountType();
		assertEquals("", check);
	}
	
	@Test
	public void shouldReturnBalance() {
		BankAccount underTest = new BankAccount("", "", 0.0);
		Double check = underTest.getBalance();
		assertEquals(0.0, check,0.001);
	}
	
	@Test
	public void shouldDeposit50() {
		BankAccount underTest = new BankAccount("2222","Checking", 100.00);
		underTest.deposit(50.00);
		Double check = underTest.getBalance();
		assertEquals(150.00,check,0.001);
	}
	
	@Test
	public void shouldWithdraw50() {
		BankAccount underTest = new BankAccount("2222", "Checking", 150.00);
		underTest.withdraw(50.00);
		Double check = underTest.getBalance();
		assertEquals(100.00,check,0.001);
	}
	
	
}

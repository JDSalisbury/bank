package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class BankTest {
	
	@Test
	public void shouldcreateBankAccountWithAccountNameTypeAndBalance() {
		BankAccount underTest = new BankAccount("", "", 0.0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldReturnAccountNumber() {
		BankAccount underTest = new BankAccount("1111", "", 0.0);
		String check = underTest.getAccountNumber();
		assertEquals("1111",check);
	}
	
	@Test
	public void shouldReturnAccountType() {
		BankAccount underTest = new BankAccount("1111", "Checking", 0.0);
		String check = underTest.getAccountType();
		assertEquals("Checking", check);
	}
}

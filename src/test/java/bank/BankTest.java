package bank;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class BankTest {
	
	@Test
	public void shouldcreateBankAccountWithAccountNameTypeAndBalance() {
		BankAccount underTest = new BankAccount("", "", 0);
		assertNotNull(underTest);
	}
}

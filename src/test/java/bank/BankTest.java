package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BankTest {
	
	@Test
	public void shouldInstantiateABankObject() {
		Bank underTest = new Bank();
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldAssertThatABankAccountHasBeenAdded() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("", "", 0.0));
		int check = underTest.numberOfAccounts();
		assertEquals(1,check);
	}
	
	@Test
	public void shouldAddTwoBankAccounts() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("", "", 0.0));
		underTest.addAccount(new BankAccount("", "", 0.0));
		int check = underTest.numberOfAccounts();
		assertEquals(2,check);
	}
	
	@Test
	public void shouldCloseAnAccount() {
		Bank underTest = new Bank();
		underTest.addAccount(new BankAccount("1111", "",0.0));
		underTest.addAccount(new BankAccount("2222", "", 0.0));
		underTest.closeAccount("1111");
		int check = underTest.numberOfAccounts();
		assertEquals(1,check);
	}
	
	
}

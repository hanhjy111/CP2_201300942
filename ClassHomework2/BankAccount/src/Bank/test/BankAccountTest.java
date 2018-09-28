package classHomework.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testGetName() {
		BankAccount bankAccount = new BankAccount();
		assertTrue(bankAccount.name(이형진));
	} // 계좌주인 이형진

	@Test
	void testGetBalance() {
		BankAccount bankAccount = new BankAccount();
		assertTrue(bankAccount.balance(300000));
	} // 잔액 300000원

	@Test
	void testDeposit() {
		BankAccount bankAccount = new BankAccount();
		assertEquals(400000, bankAccount.deposit(300000,100000));
	} // 10만원 입금 40만원 잔액


	@Test
	void testWithdraw() {
		BankAccount bankAccount = new BankAccount();
		assertEquals(200000, bankAccount.withdraw(300000,100000));
	} // 10만원 출금 20만원 잔액

	@Test
	void testInstallmentSavingPredict() {
		BankAccount bankAccount = new BankAccount();
		assertEquals();
	}// 매월 10000원 적금 12개월

	@Test
	void testFixedDepositPredict() {
		BankAccount bankAccount = new BankAccount();
		assertEquals();
	} // 매월 200000원 적금 24개월

}

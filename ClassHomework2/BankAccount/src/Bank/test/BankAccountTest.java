package classHomework.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testGetName() {
		BankAccount bankAccount = new BankAccount();
		assertTrue(bankAccount.name(������));
	} // �������� ������

	@Test
	void testGetBalance() {
		BankAccount bankAccount = new BankAccount();
		assertTrue(bankAccount.balance(300000));
	} // �ܾ� 300000��

	@Test
	void testDeposit() {
		BankAccount bankAccount = new BankAccount();
		assertEquals(400000, bankAccount.deposit(300000,100000));
	} // 10���� �Ա� 40���� �ܾ�


	@Test
	void testWithdraw() {
		BankAccount bankAccount = new BankAccount();
		assertEquals(200000, bankAccount.withdraw(300000,100000));
	} // 10���� ��� 20���� �ܾ�

	@Test
	void testInstallmentSavingPredict() {
		BankAccount bankAccount = new BankAccount();
		assertEquals();
	}// �ſ� 10000�� ���� 12����

	@Test
	void testFixedDepositPredict() {
		BankAccount bankAccount = new BankAccount();
		assertEquals();
	} // �ſ� 200000�� ���� 24����

}

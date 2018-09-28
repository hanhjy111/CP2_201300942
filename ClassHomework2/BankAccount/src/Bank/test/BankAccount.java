package classHomework.test;

import java.util.function.BooleanSupplier;

public class BankAccount {

	private int balance;
	private String name;
	private double rates;
	private String accountNumber;
	
	public BankAccount(String name, int balance, double rates) {
		this.name = name;
		this.rates = rates;
		this.balance = balance;
	}

	public BankAccount() {
	
	}

	public String getName(){
		return this.name;
	}
	
	public double getBalance() {
		return this.balance;
	}

	public void deposit(int balance, int money) {
		this.balance = this.balance + money;
	}
	
	public void withdraw(int balance, int money) {
		
		this.balance = this.balance - money;
	}
	

	public void installmentSavingPredict(int month, int money) {
		
		this.rates = money*this.rates/12*(month*(month+1)/2)+money*month;
	}

	public int fixedDepositPredict(int month, int money) {
		
		this.balance = this.balance*(((1+rates/12)^month)-1);
	}



}

package com.account;

public class Account {

	private int accountBalance;
	private int pin;
	private int minimumBalance ;
	
	public void depositMoney(int amount) {
		if(0 < amount) {
		this.accountBalance += amount;
		}
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void withdrawCash(int amountWithdrawn) {
		if(amountWithdrawn < accountBalance) {
		this.accountBalance -= amountWithdrawn;
		}
		
		if(amountWithdrawn > accountBalance) {
			System.out.println("Insufficient Funds");
		}
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = 9000;
	}

	public void withdrawWithPin(int pin) {
		pin = 0;
		
	}

	public void minimumBalance() {
		if(accountBalance <= 1000) {
			this.minimumBalance = minimumBalance;
		}
		
	}

}

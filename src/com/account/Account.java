package com.account;

public class Account {

	private int accountBalance;

	//@todo Deborah, i dont think you implemented the pin in this code.... Where do you allow the user to create pins in this code base?
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


	//@todo Deborah, please remove integrate the withdraw with pin to this method.

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

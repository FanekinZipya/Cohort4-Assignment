package com.chapter3;

public class ModifiedAccount {
	private int balance;
	
	public int getBalance() {
		return balance;
	}

	public void depositCash(int amount) {
		balance += amount;
		
	}

	public void withdrawCash(int withdraw) {
		if(withdraw < balance) {
			balance -= withdraw;
		}else {
			System.out.println( "Withdrawal amount exceeded account balance.");
		}
		
	}

}

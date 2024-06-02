package Assignments.Day1;

import Assignments.Day2.InsufficientFundsException;

public class Account {
	String accountId;
	double balance;
	Customer customer;
	
	public Account(String accountId,Customer customer) {
		this.accountId=accountId;
		this.customer=customer;
		this.balance=0.0;
	}


	public String getAccountId() {
		return accountId;
	}
	public double getBalance() {
		return balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		}else {
			throw new IllegalArgumentException("Deposit amount must be greater than 0");
		}
	
	}
	public void withdraw(double amount)throws InsufficientFundsException{
		if(amount>balance) {
			throw new InsufficientFundsException("Insufficient funds");
		}if(amount <=0) {
			throw new IllegalArgumentException("Withdrawal amount must be greater than 0");
		}
		balance-=amount;
	 }
	@Override
	public String toString() {
		return "Account{accountId='"+accountId+"',balance="+balance+",customer="+ customer+"}";
	}
}

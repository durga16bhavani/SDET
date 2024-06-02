package Assignments.Day2;

import java.util.HashMap;
import java.util.Map;

import Assignments.Day1.Account;
import Assignments.Day1.Customer;

public class Bank {
    Map<String, Customer> customers;
	Map<String, Account> accounts;
	
	public Bank() {
		customers=new HashMap<>();
		accounts=new HashMap<>();
	}
	
	public void addCustomer(String name,String customerId) {
		if(!customers.containsKey(customerId)) {
			Customer customer=new Customer(name,customerId);
			customers.put(customerId,customer);
		}else {
			throw new IllegalArgumentException("Customer Id  already exists.");
		}
	}
	
	
	public void addAccount(String accountId,String CustomerId) {
		if(accounts.containsKey(accountId)) {
			throw new IllegalArgumentException("Account Id already exists.");
		}
		Customer customer=customers.get(CustomerId);
		if(customer==null) {
			throw new IllegalArgumentException("Customer does not exist.");
		}
		Account account=new Account(accountId, customer);
		accounts.put(accountId, account);
	}
	public Account getAccount(String accountId) {
		return accounts.get(accountId);
	}
	public void depositToAccount(String accountId,double amount)throws Exception{
		Account account=accounts.get(accountId);
		if(account==null) {
			throw new Exception("Account does not exist");
		}
		account.deposit(amount);
	}
	public Customer getCustomer(String customerId) {
		return customers.get(customerId);
	}
	public void withdrawFromAccount(String accountId,double amount)throws Exception{
		Account account=accounts.get(accountId);
		if(account==null) {
			throw new IllegalArgumentException("Account does not exist.");
		}
		account.withdraw(amount);
	}
	@Override
	public String toString() {
		return "Bank{customers=" + customers+", accounts=" +accounts + "}";
	}

}
 
package Assignments.Day2;
import Assignments.Day2.InsufficientFundsException;

public class ExecuteBank {

	public static void main(String[] args) throws Exception {
		Bank bank=new Bank();
		
		bank.addCustomer("Durga", "C001");
		bank.addCustomer("Bhavani", "C002");
		
		bank.addAccount("A001","C001");
		bank.addAccount("A002","C002");
		
		bank.depositToAccount("A001", 1000.0);
		bank.depositToAccount("A002",500.0);
		
		try {
			bank.withdrawFromAccount("A001",100.0);
			bank.withdrawFromAccount("A002", 1000.0);
		}catch(InsufficientFundsException e) {
			System.out.println("Insufficient balance");
		}
		System.out.println(bank.getAccount("A001"));
		System.out.println(bank.getAccount("A002"));
	}

}

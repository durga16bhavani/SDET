package Assignments.Day1;

public class Transaction{
	
	final int id;
	final double amount;
	final String type;
	
	public Transaction(int id,double amount,String type) {
		this.id=id;
		this.amount=amount;
		this.type=type;
	}
	
	public int getId() {
		return id;
	}
	public double getAmount() {
		return amount;
	}
	public String getType() {
		return type;
	}
	public void process() {
		System.out.println("Processing Transaction:"+getId());
	}

}

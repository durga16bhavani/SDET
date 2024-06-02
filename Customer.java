package Assignments.Day1;

public class Customer {
	String name;
	String customerId;
	
	
	public Customer(String name,String customerId) {
		this.name=name;
		this.customerId=customerId;
		
	}
	public String getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Customer{name='"+name+"',custpmerId='"+customerId+"'}";
	}
}

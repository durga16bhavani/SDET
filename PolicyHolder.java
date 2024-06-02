package Assignments.Day1;

public class PolicyHolder {

	String name;
	String policyholderId;
 // Constructor
	public PolicyHolder(String name, String policyholderId) {
		this.name=name;
		this.policyholderId=policyholderId;
	}
	
	//getter
	public String getHolderId() {
		return policyholderId;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "PolicyHolder{name='"+name+"',policyholderId='"+policyholderId+"'}";
	}
}

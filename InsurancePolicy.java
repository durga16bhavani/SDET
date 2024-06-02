package Assignments.Day1;

public abstract class InsurancePolicy<T>{
	String policyId;
	 PolicyHolder policyholder;
	 T details;
	
	public InsurancePolicy(String policyId, PolicyHolder policyholder, T details) {
		this.policyId=policyId;
		this.policyholder=policyholder;
		this.details=details;
	}
	//getter
	public String getPolicyid() {
		return policyId;
	}
	
	public PolicyHolder getpolicyholder() {
		return policyholder;
	}
	
	public T getDetails() {
		return details;
	}
	
	@Override
	public String toString() {
		return "InsurancePolicy{policyId='"+policyId+"',policyholder="+policyholder+",details="+details+"}";
	}
    
}

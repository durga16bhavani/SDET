package Assignments.Day2;

import java.util.HashMap;
import java.util.Map;

import Assignments.Day1.Claim;
import Assignments.Day1.InsurancePolicy;
import Assignments.Day1.PolicyHolder;

public class InsuranceManager {
    Map<String,PolicyHolder> policyholders;
    Map<String,InsurancePolicy<?>> policies;
    Map<String,Claim> claims;
    
    public InsuranceManager() {
    	policyholders=new HashMap<>();
    	policies=new HashMap<>();
    	claims=new HashMap<>();
    }
    public void addPolicyholder(String name,String policyholderId) {
    	if(!policyholders.containsKey(policyholderId)) {
    		PolicyHolder policyholder=new PolicyHolder(name,policyholderId);
    		policyholders.put(policyholderId, policyholder);
    	}else {
    		throw new IllegalArgumentException("Policyholder Id already exists.");
    	} 
    }
    public <T,P extends InsurancePolicy<T>> void addPolicy(String policyId,String policyholderId,T details,PolicyFactory<T,P>factory) {
    	if(policies.containsKey(policyId)) {
    		throw new IllegalArgumentException("Policy Id already exists");
    	}
    	PolicyHolder policyholder=policyholders.get(policyholderId);
    	if(policyholder==null) {
    		throw new IllegalArgumentException("Policyholder does not exist");
    	}
        P policy=factory.createPolicy(policyId,policyholder,details);
    	policies.put(policyId,policy);
    }
    public void addClaim(String claimId,String policyId,double amount,String description)throws ClaimValidationException{
    	if(claims.containsKey(claimId)) {
    		throw new IllegalArgumentException("Claim  Id already exists.");
    	}
    	InsurancePolicy<?> policy=policies.get(policyId);
    	if(policy==null) {
    		throw new IllegalArgumentException("Policy does not exist.");	
    	}
    	if(amount<=0) {
    		throw new ClaimValidationException("Claim amount must be positive");
    	}
    	Claim claim=new Claim(claimId,policyId,amount,description);
    	claims.put(claimId,claim);
    }
    public PolicyHolder getPolicyholder(String policyholderId) {
    	return policyholders.get(policyholderId);
    }
    public InsurancePolicy<?> getPolicy(String policyId){
    	return policies.get(policyId);
    }
    public Claim getClaim(String claimId) {
    	return claims.get(claimId);
    }
    @Override
    public String toString() {
    	return "InsuranceManger{policyholders="+policyholders+",policies="+policies+",claims="+claims+"}";
    	
    }
}

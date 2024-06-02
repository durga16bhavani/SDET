package Assignments.Day1;

public class Claim {
	
         String claimId;
         String policyId;
         double amount;
         String description;
        
         //constructor
         public Claim(String claimId, String policyId, double amount,String description){
        	 this.claimId=claimId;
        	 this.policyId=policyId;
        	 this.amount=amount;
        	 this.description=description;
         }
         //getter
         public String getClaimid() {
        	 return claimId;
         }
         public String getPolicyId() {
        	 return policyId;
         }
         public double getClaimAmount() {
        	return amount; 
         }
         public String getDescription() {
        	 return description;
         }
         @Override
         public String toString() {
        	 return "Claim{claimId='"+claimId+"',policyId='"+policyId+"',amount="+amount+",description='"+description+"'}";
         }
}

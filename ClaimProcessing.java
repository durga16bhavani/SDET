package Assignments.Day1;

public class ClaimProcessing {
	
	static int claimId;
	static int policyId;
	static double claimAmount;
	static boolean isValid;
	static boolean isApproved;
	
	//Method to create a claim
	public static void createClaim(int cId, int pId, double amount) {
		claimId=cId;
		policyId=pId;
		claimAmount=amount;
		isValid=false;
		isApproved=false;
	}
	
	//Method to validate a claim
	public static boolean validateClaim(double coverageAmount) {
		if(claimAmount <= coverageAmount) {
			isValid=true;
			return true;
		}else {
			isValid=false;
			return false;
		}
	}
	
	//Method to process a claim
	public static void processClaim(double coverageAmount) {
		if(validateClaim(coverageAmount)) {
			approveClaim();
		}else {
			rejectClaim();
		}
	}
	
	//Method to approve a claim
	public static void approveClaim() {
		isApproved=true;
		System.out.println("Claim "+ claimId +" has been approved.");
	}
	
	//method to reject a claim
	public static void rejectClaim() {
		isApproved=false;
		System.out.println("Claim "+ claimId + " has been rejected");
	}
	

	public static void main(String[] args) {
		int claimId=234;
		int policyId=89733;
		double coverageAmount=100000.0;
		
		createClaim(claimId,policyId,coverageAmount);
		processClaim(coverageAmount);
		
		

	}

}

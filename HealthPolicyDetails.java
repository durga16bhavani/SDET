package Assignments.Day2;

public class HealthPolicyDetails {
   String coverageType;
   double coverageAmount;
   
   public HealthPolicyDetails(String coverageType,double coverageAmount) {
	   this.coverageType=coverageType;
	   this.coverageAmount=coverageAmount;
   }
   public String getCoverageType() {
	   return coverageType;
   }
   public double getCoverageAmount() {
	   return coverageAmount;
   }
   @Override
   public String toString() {
	   return "HealthPolicydetails{coverageType='"+coverageType+"',coverageAmount="+coverageAmount+"}";
   }
}

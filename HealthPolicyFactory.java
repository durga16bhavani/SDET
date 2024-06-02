package Assignments.Day2;

import Assignments.Day1.PolicyHolder;

public class HealthPolicyFactory implements PolicyFactory<HealthPolicyDetails,HealthInsurancePolicy>{
   @Override
   public HealthInsurancePolicy createPolicy(String policyId,PolicyHolder policyholder,HealthPolicyDetails details) {
	   return new HealthInsurancePolicy(policyId,policyholder,details);
   }
}

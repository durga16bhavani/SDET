package Assignments.Day2;

import Assignments.Day1.InsurancePolicy;
import Assignments.Day1.PolicyHolder;

public class HealthInsurancePolicy extends InsurancePolicy<HealthPolicyDetails> {
	public HealthInsurancePolicy(String policyId,PolicyHolder policyholder,HealthPolicyDetails details) {
		super(policyId,policyholder,details);
	}

}

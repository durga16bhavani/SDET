package Assignments.Day2;

import Assignments.Day1.InsurancePolicy;
import Assignments.Day1.PolicyHolder;

public interface PolicyFactory<T,P extends InsurancePolicy<T>>{
  P createPolicy(String policyId,PolicyHolder policyholder,T details);
}

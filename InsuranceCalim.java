package Assignments.Day2;

public class InsuranceCalim {

	public static void main(String[] args) {
        InsuranceManager manager=new InsuranceManager();
        
        //Add Policyholders
        
        manager.addPolicyholder("Durga","P001");
        manager.addPolicyholder("Bhavani","P002");
        
        //create policy factories
        HealthPolicyFactory healthPolicyFactory=new HealthPolicyFactory();
        
        //Add Policies
        HealthPolicyDetails durgaDetails=new HealthPolicyDetails("Comprehensive",10000);
        HealthPolicyDetails bhavaniDetails=new HealthPolicyDetails("Basic",50000);
        
        manager.addPolicy("HP001", "P001", durgaDetails,healthPolicyFactory);
        manager.addPolicy("HP002", "P002", bhavaniDetails,healthPolicyFactory);
        
        //Add claims
       try {
        	manager.addClaim("C001","HP001",5000, "Hospitalization");
        	manager.addClaim("C002","HP002",4000,"Surgery");	
        }catch(ClaimValidationException e) {
        	System.err.println(e.getMessage());
        }
        
        //print details
        System.out.println(manager.getPolicy("HP001"));
        System.out.println(manager.getPolicy("HP002"));
        System.out.println(manager.getClaim("C001"));
        System.out.println(manager.getClaim("C001"));
	}
}

package Assignments.Day3;

import java.util.ArrayList;
import java.util.List;

public class ClaimExecute {

	public static void main(String[] args) {
		List<Claim> claims=new ArrayList<>();
		claims.add(new HealthClaim(1,1000));
		claims.add(new HealthClaim(2,2000));
		claims.add(new HealthClaim(3,1500));
		claims.add(new HealthClaim(4,3000));
		
		ClaimProcessor processor=new ClaimProcessor(4);
		processor.processClaims(claims);
		System.out.println("Total Claim Amount:"+ClaimSummary.getTotalClaimAmount(claims));
		List<Claim> healthClaims=ClaimSummary.filterClaimsByType(claims,"Health");
		System.out.println("Number of health Claims:"+healthClaims.size());
		processor.shutdown();
	}

}

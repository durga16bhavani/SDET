package Assignments.Day3;

import java.util.List;
import java.util.stream.Collectors;

//Use Java Streams
public class ClaimSummary {
   public static double getTotalClaimAmount(List<? extends Claim> claims) {
	   return claims.stream()
			   .mapToDouble(Claim::getAmount)
			   .sum();
   }
   
   public static List<Claim>filterClaimsByType(List<? extends  Claim> claims,String type){
	   return claims.stream()
			   .filter(claim->claim.getType().equals(type))
			   .collect(Collectors.toList());
   }
}

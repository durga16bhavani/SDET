package Assignments.Day3;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Implement Multithreading
public class ClaimProcessor {
    final ExecutorService executor;
    
    public ClaimProcessor(int numberOfThreads) {
    	executor=Executors.newFixedThreadPool(numberOfThreads);
    }
    public void processClaims(List<? extends Claim> claims) {
    	for(Claim claim:claims) {
    		executor.submit(()->claim.process());
    	}
    }
    public void shutdown() {
    	executor.shutdown();
    }
}

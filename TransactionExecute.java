package Assignments.Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import Assignments.Day1.Transaction;

//Multithreading
class TransactionProcessor{
	final ExecutorService executor;
	
	public TransactionProcessor(int numberOfThreads) {
		executor=Executors.newFixedThreadPool(numberOfThreads);
	}
	public void processTransactions(List<Transaction> transactions) {
		for(Transaction transaction:transactions) {
			executor.submit(()->transaction.process());
		}
	}
	public void shutdown() {
		executor.shutdown();
	}
}

//TransactionSummary class with Java Streams

class TransactionSummary{
	public static double getTotalTransactionAmount(List<Transaction> transactions) {
		return transactions.stream()
				.mapToDouble(Transaction::getAmount)
				.sum();
	}
	public static List<Transaction> filterTransactionByType(List<Transaction> transactions,String type) {
		return transactions.stream()
				.filter(transaction->transaction.getType().equals(type))
				.collect(Collectors.toList());
	}
}

//main

public class TransactionExecute {

	public static void main(String[] args) {
		List<Transaction> transactions=new ArrayList<>();
		transactions.add(new Transaction(1,1000,"Credit"));
		transactions.add(new Transaction(2,4000,"Debit"));
		transactions.add(new Transaction(3,1500,"Credit"));
		transactions.add(new Transaction(4,2000,"Debit"));
		
		TransactionProcessor processor =new TransactionProcessor(4);
		processor.processTransactions(transactions);
		
		System.out.println("Total Transaction Amount:"+TransactionSummary.getTotalTransactionAmount(transactions));
		
		List<Transaction> creditTransactions=TransactionSummary.filterTransactionByType(transactions, "Credit");
        System.out.println("Number of Credit Transactions:"+creditTransactions.size());
        processor.shutdown();
	}

}

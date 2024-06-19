package javaprograms;
import java.util.Scanner;

public class ParameterisedMethod {
	
	public void ageEligible(int age,String name) {
		
		if(age>=18) {
			System.out.println(name+" is eligible to get the driving licensse");
			System.out.println(name+" is eligible to vote");
		}else {
			System.out.println(name+" is not eligible to vote and to drive");
		}
	}

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		System.out.println("Enter your name:");
		String n=sc.next();
		sc.close();
		ParameterisedMethod obj1=new ParameterisedMethod();
		obj1.ageEligible(a,n);
		
	}

}

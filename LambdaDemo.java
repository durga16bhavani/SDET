package javaDesignPatterns_Programs;

@FunctionalInterface
interface MathOperation {
	int operate(int a,int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
		//Using lambda expression to define the method
		
		MathOperation addition=(a,b)->a+b;
		MathOperation subtraction=(a,b)->a-b;
		
		System.out.println("Addition:"+addition.operate(5,3));
		System.out.println("Subtraction:"+subtraction.operate(5,3));

	}

}

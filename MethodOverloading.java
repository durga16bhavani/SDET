package javaprograms;

public class MethodOverloading {
	static int val1 =34, val2 =56,sum;
	
	// method with no args
	static int sum() {
		sum= val1+val2;
		System.out.println(sum);
		return (sum);
	}
	
	// method with args
	static int sum(int a,int b) {
		System.out.println(a+b);
		return(a+b);
	}
	
	static float sum(float a,float b) {
		System.out.println(a+b);
		return (a+b);
	}

	public static void main(String[] args) {
		sum();
		sum(12,23);
		sum(12.5f,23.67f);
	}

}

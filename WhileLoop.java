package javaprograms;

public class WhileLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i=1;
		while(i<10) {
			System.out.println(i);
			Thread.sleep(1000);
			i++;
		}

	}

}

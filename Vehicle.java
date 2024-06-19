package javaprograms;

public class Vehicle extends Factory {
	protected String brand="Tata";
	public void horn() {
		System.out.println("Beep.....beep"+super.brand);
	}

}

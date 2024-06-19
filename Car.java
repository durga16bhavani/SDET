package javaprograms;

public class Car extends Vehicle {
	private String modelName="i20";
	public Car() {
		brand=super.brand;
	}
	public static void main(String[] args) {
		Car c1=new Car();
		c1.horn();
		System.out.println(c1.modelName+" "+c1.brand+" "+c1.waiting);

	}

}

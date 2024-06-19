package javaprograms;
import java.util.LinkedList;

public class LinkedListdemo {

	public static void main(String[] args) {
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		
		cars.addFirst("Hyundai");
		System.out.println(cars);
		
	}

}

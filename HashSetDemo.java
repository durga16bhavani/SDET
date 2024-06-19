package javaprograms;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		 HashSet<String> scooters=new HashSet<String>();
		 scooters.add("Honda");
		 scooters.add("TVS");
		 scooters.add("Yamaha");
		 scooters.add("Jupiter");
		 scooters.add("Activa");
		 scooters.add("Honda");// update duplicates 
		 System.out.println(scooters);
		 
		 System.out.println(scooters.contains("TVS"));
		 
		 for(String i:scooters) {
			 System.out.println(i);
		 }		 
		 
	}

}

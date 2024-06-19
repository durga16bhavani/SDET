package javaDesignPatterns_Programs;

public class Box<T> {
	private T item;
	
	public void setItem(T item) {
		this.item=item;
	}
	public T getItem() {
		return item;
	}
	
	//Generic method
	public static <T> void printArray(T[] array) {
		for(T element:array) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	public static <T extends Number> void printNumbers(T[] array) {
		for(T number:array) {
			System.out.println(number.doubleValue());
		}
	}

	public static void main(String[] args) {
		Box<String> stringBox=new Box<>();
		stringBox.setItem("Hello world");
		System.out.println(stringBox.getItem());
		
		Box<Integer>integerBox=new Box<>();
		integerBox.setItem(123);
		System.out.println(integerBox.getItem());
		
		String[] stringArray= {"Hello","World"};
		Integer[] integerArray= {1,2,3,4,5};
		printArray(stringArray);
		printArray(integerArray);
		
		Double[] doubleArray= {1.1,2.3,3.5,5.7};
		printNumbers(doubleArray);
		printArray(doubleArray);
		//printNumbers(StringArray);

	}

}

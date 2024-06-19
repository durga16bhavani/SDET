package javaDesignPatterns_Programs;

//Product interface
interface Product{
	void use();
}
//Concrete Product implementations
class ConcreteProductA implements Product{
	public void use() {
		System.out.println("Using ConcreteProductA");
	}
}

class ConcreteProductB implements Product{
	public void use() {
		System.out.println("Using ConcreteProductB");
	}
}

// Factory method in Creator class

abstract class Creator{
	public abstract Product factoryMethod();
	
	public void doSomething() {
		Product product=factoryMethod();
		product.use();
	}
}

class ConcreteCreatorA extends Creator{
	public Product factoryMethod() {
		return new ConcreteProductA();
	}
}

class ConcreteCreatorB extends Creator{
	public Product factoryMethod() {
		return new ConcreteProductB();
	}
}

//Usage
public class FactoryMethodDemo {

	public static void main(String[] args) {
		Creator creatorA=new ConcreteCreatorA();
		creatorA.doSomething();
		
		Creator creatorB=new ConcreteCreatorB();
		creatorB.doSomething();

	}

}

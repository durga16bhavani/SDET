package javaDesignPatterns_Programs;

public class SingletonDemo {
    private static SingletonDemo instance;
    
    private SingletonDemo() {
    	//private constructor to prevent instantiation
    }
    
    public static SingletonDemo getInstance() {
    	if(instance==null) {
    		instance=new SingletonDemo();
    	}    
    	return instance;
    }
}

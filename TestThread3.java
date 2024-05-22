package javaprograms;

public class TestThread3 {

	public static void main(String[] args) throws InterruptedException{
		Thread t1=new Thread(new ThreadDemo3(),"Thread-1");
		Thread t2=new Thread(new ThreadDemo3(),"Thread-2");
		Thread t3=new Thread(new ThreadDemo3(),"Thread-3");
		t1.start();
		t1.join();// joins the main thread once t1 has started
		
         t2.start();//start when t1 dead
         t2.join();
         
         t3.start();
         
	}

}

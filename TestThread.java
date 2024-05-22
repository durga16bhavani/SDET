package javaprograms;

public class TestThread {

		public static void main(String[] args) {
			ThreadDemo2 t1=new ThreadDemo2("Thread-1");
			t1.start();
			
			ThreadDemo2 t2=new ThreadDemo2("Thread-2");
			t2.start();	
		}
	}

package javaprograms;


class thread implements Runnable{
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("State of thread1 while it called join() on thread2--"+Threadstatesdemo.thread1.getState());
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}

public class Threadstatesdemo {
	public static Thread thread1;
	public static Threadstatesdemo obj;

	public static void main(String[] args) throws InterruptedException {
		obj=new Threadstatesdemo();
		thread1=new Thread();
		
		System.out.println("State of the thread1 after creating--"+thread1.getState());
		thread1.start();
		
		System.out.println("State of the thread1 after starting--"+thread1.getState());
		
		Thread myThread = new Thread();
		Thread thread2=new Thread(myThread);
		System.out.println("State of the thread2 after creating--"+thread2.getState());
		thread2.start();
		
		System.out.println("State of the thread2 after starting--"+thread2.getState());
		
		try {
			Thread.sleep(200);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("State of the thread2 after starting--"+thread2.getState());
		try {
			thread2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State of the thread2 after starting--"+thread2.getState());
		
		
	}

}

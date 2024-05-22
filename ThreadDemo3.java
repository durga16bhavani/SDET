package javaprograms;

public class ThreadDemo3 implements Runnable {
	
	ThreadDemo3()
	{
		System.out.println("Thread:"+Thread.currentThread().getName());
	}	 
	
	@Override
	public void run() {
		System.out.println("Thread:"+Thread.currentThread().getName());
		for(int i=4;i>0;i--) {
			System.out.println("Thread:"+Thread.currentThread().getName()+","+i);
		}
		System.out.println("Thread:"+Thread.currentThread().getName()+","+"State;Dead");
	}
}


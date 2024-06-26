package javaprograms;

public class ThreadDemo2 implements Runnable {
	private Thread t;
	private String threadName;
	
	//constructor
	ThreadDemo2(String name){
		threadName=name;
		System.out.println("Creating"+ threadName);
	}
    //run method
	public void run() {
		System.out.println("Running"+threadName);
		try {
			for(int i=4;i>0;i--) {
				System.out.println("Thread:"+threadName+"Interrupted"+","+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Thread"+threadName+"interrupted.");
		}
		System.out.println("Thread"+threadName+"exiting");
	}
	public void start() {
		System.out.println("Starting"+threadName);
		if(t==null) {
			t=new Thread(this,threadName);
			t.start();
					
		}
	}
}



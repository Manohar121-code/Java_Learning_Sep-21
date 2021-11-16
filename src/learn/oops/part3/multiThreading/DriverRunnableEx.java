package learn.oops.part3.multiThreading;

public class DriverRunnableEx {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main started");
		
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable);
		
		MyRunnable myRunnable2 = new MyRunnable();
		Thread t2 = new Thread(myRunnable2);
		
		t1.setName("t1");
		t2.setName("t2");
		
//		t1.setPriority(10);
//		t2.setPriority(1);
		
		t1.start();
		
//		t1.join();
		
		t2.start();
		
//		t2.yield();
		
		t1.setDaemon(true);
		
		System.out.println("Main ended");
	}
}

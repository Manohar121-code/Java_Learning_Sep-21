package learn.oops.part3.multiThreading;

public class DriverClass {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main started");
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
		
//		Thread.sleep(4000);
		
		System.out.println("Main ended");
	}
}

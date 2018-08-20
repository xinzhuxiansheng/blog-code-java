package blog.JAVABINGFA.base.juc.choose_extendsthread_implementsrunnable;

public class ImplementsRunnable implements Runnable{
	private int num =5;

	@Override
	public synchronized void run() {
		//num--;
		//System.out.println(Thread.currentThread().getName() +" num = " + num);
		try {
			Thread.sleep(1000);
			System.out.println("休眠");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ImplementsRunnable implementsRunnable = new ImplementsRunnable();
		Thread t1 = new Thread(implementsRunnable,"t1");
		Thread t2 = new Thread(implementsRunnable,"t2");
		Thread t3 = new Thread(implementsRunnable,"t3");
		Thread t4 = new Thread(implementsRunnable,"t4");
		Thread t5 = new Thread(implementsRunnable,"t5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	/*	t1.run();
		t2.run();
		t3.run();
		t4.run();
		t5.run();*/
		System.out.println("aaa");
	}
}

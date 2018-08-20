package blog.JAVABINGFA.base.juc.choose_extendsthread_implementsrunnable;

public class ExtendsThread02 extends Thread{

	private int num =5;

	@Override
	public synchronized void run() {
		num--;
		System.out.println(Thread.currentThread().getName() +" num = " + num);
	}

	public static void main(String[] args) {
		ExtendsThread02 et = new ExtendsThread02();
		Thread t1 = new Thread(et);
		Thread t2 = new Thread(et);
		Thread t3 = new Thread(et);
		Thread t4 = new Thread(et);
		Thread t5 = new Thread(et);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

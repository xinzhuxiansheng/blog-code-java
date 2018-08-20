package blog.JAVABINGFA.base.juc.create_thread;

/**
 * 创建多线程
 * @author yzhou
 */
public class CreateThread01 extends Thread{
	@Override
	public void run() {
		System.out.println("继承Thread类 重写run方法 创建一个多线程");
	}

	public static void main(String[] args) throws InterruptedException {	
		Thread t1 = new CreateThread01();
		t1.start();
		
		Thread.sleep(5000);
		System.out.println("主线程结束");
	}	
}


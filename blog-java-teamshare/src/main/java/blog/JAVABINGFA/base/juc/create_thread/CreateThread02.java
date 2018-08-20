package blog.JAVABINGFA.base.juc.create_thread;

/**
 * 创建多线程
 * @author yzhou
 */
public class CreateThread02{
	public static void main(String[] args) throws InterruptedException {
		//创建一个Thead类实例
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("java匿名内部类 ，创建一个线程");
			}
		};
		//启动线程
		t1.start();
		Thread.sleep(5000);
		System.out.println("主线程结束");
	}	
}

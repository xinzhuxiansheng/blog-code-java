package blog.JAVABINGFA.base.juc.create_thread;

/**
 * 创建多线程
 * @author yzhou
 */
public class CreateThread03 implements Runnable{

	@Override
	public void run() {
		System.out.println("实现Runnable接口，创建一个多线程");
	}
	
	public static void main(String[] args) throws InterruptedException {
		CreateThread03 ct = new CreateThread03();
		Thread t1 = new Thread(ct);
		t1.start();
		
		Thread.sleep(5000);
		System.out.println("主线程结束");
	}
}

package blog.JAVABINGFA.base.juc.create_thread;

/**
 * 创建多线程
 * @author yzhou
 */
public class CreateThread04{
	public static void main(String[] args) throws InterruptedException {
		//创建一个Thead类实例
		//Runnable接口实例化，过程是创建一个实现自Runnable的匿名类对象，通过new表达式返回的引用自动向上转型对Runnable的引用
		//要记住上转型对象能调用子类重写父类的方法。
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("匿名Runnable对象，创建一个多线程");
			}
		});
		//启动线程
		t1.start();
		Thread.sleep(5000);
		System.out.println("主线程结束");
	}	
}

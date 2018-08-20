package blog.JAVABINGFA.base.juc.difference_threadstart_threadrun;

public class TestMain {
	public static void main(String[] args) {
		//@1
		new Cycle().run();
		new Car().run();
		//@2
		Thread thread = new Thread(new Car());
		thread.start();
	}
}

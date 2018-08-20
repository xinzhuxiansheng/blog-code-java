package blog.JAVABINGFA.base.juc.difference_threadstart_threadrun;

public class Car implements Runnable{
	@Override
	public void run() {
		System.out.println("Run car ...");
	}
}

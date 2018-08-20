package blog.JAVABINGFA.base.juc.choose_extendsthread_implementsrunnable;

public class ExtendsThread01 extends Thread{

	private int num =5;

	@Override
	public synchronized void run() {
		num--;
		System.out.println(Thread.currentThread().getName() +" num = " + num);
	}

	public static void main(String[] args) {
		ExtendsThread01 et = new ExtendsThread01();
		ExtendsThread01 et1 = new ExtendsThread01();
		ExtendsThread01 et2 = new ExtendsThread01();
		ExtendsThread01 et3 = new ExtendsThread01();
		ExtendsThread01 et4 = new ExtendsThread01();
		ExtendsThread01 et5 = new ExtendsThread01();
		et1.start();
		et2.start();
		et3.start();
		et4.start();
		et5.start();
	}
}

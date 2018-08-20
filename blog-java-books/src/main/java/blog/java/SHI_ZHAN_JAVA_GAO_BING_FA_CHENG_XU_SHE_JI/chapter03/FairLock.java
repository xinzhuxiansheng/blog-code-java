package blog.java.SHI_ZHAN_JAVA_GAO_BING_FA_CHENG_XU_SHE_JI.chapter03;

import java.util.concurrent.locks.ReentrantLock;

public class FairLock implements Runnable{

	public static ReentrantLock fairLock = new ReentrantLock(true);
	
	
	@Override
	public void run() {
		while(true) {
			try {
				fairLock.lock();
				System.out.println(Thread.currentThread().getName()+" 获得锁");
			} finally{
				fairLock.unlock();
			}
		}
	}

	public static void main(String[] args) {
		FairLock f1 = new FairLock();
		Thread t1 = new Thread(f1,"t1");
		Thread t2 = new Thread(f1,"t2");
		t1.start();t2.start();
	}
	
}

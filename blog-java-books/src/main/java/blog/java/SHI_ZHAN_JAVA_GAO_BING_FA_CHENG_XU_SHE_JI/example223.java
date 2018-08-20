package blog.java.SHI_ZHAN_JAVA_GAO_BING_FA_CHENG_XU_SHE_JI;

public class example223 {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while(true) {
					if(Thread.currentThread().isInterrupted()) {
						System.out.println("isInterrupted");
						break;
					}
					
					try {
						Thread.sleep(2000);
					}catch(InterruptedException e) {
						System.out.println("Interruped when sleep");
						//设置中断状态  
						 // main方法中的 t1.interruped() 是让线程在sleep中被中断触发中断异常， ‘
						//在catch中再次设置 interrupt是为了让 上面的if判断到 当前线程被中断
						Thread.currentThread().interrupt();  
					}
					Thread.yield();
				}
			}
		};
		t1.start();
		Thread.sleep(2000);
		t1.interrupt();
	}
}

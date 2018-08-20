package blog.java.SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA.chapter11.p03_aop.securitycheck;

public class Account {
	public void operation() {
		System.out.println("operation ...");
		try {
			Thread.sleep(10);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

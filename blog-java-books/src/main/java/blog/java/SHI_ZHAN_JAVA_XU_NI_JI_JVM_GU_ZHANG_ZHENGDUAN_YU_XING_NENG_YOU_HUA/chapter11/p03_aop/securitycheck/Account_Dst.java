package blog.java.SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA.chapter11.p03_aop.securitycheck;

public class Account_Dst { 
	 public void operation() {
	     if(!SecurityChecker.checkSecurity())
	         return;
		 System.out.println("operation......"); 
	 } 
}

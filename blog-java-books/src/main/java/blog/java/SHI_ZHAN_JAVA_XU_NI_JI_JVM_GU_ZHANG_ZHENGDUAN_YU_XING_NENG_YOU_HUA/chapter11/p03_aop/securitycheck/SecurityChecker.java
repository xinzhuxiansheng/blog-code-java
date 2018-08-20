package blog.java.SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA.chapter11.p03_aop.securitycheck;

public class SecurityChecker { 
	 public static boolean checkSecurity() { 
		 System.out.println("SecurityChecker.checkSecurity ...");
		 if((System.currentTimeMillis()&0x1)==0)
		     return false;
		 else
		     return true;
	 } 	
}

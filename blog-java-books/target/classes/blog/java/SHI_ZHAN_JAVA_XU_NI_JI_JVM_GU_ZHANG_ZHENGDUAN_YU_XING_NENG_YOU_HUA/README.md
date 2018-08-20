实战Java虚拟机 JVM故障诊断与性能分析


p03_aop_.securitycheck
执行：
1.先使用javac编译生成Account.class
2.用SecurityWeaveGenerator类对Account.class进行处理，织入权限校验的字节码
3.使用以下简单的代码测试
public class RunAccountMain {
	 public static void main(String[] args) { 
		 Account account = new Account(); 
		 account.operation(); 
	 } 
}

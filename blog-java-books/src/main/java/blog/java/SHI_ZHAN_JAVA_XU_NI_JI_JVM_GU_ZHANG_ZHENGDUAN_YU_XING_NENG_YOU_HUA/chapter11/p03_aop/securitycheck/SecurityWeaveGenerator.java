package blog.java.SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA.chapter11.p03_aop.securitycheck;

import java.io.File;
import java.io.FileOutputStream;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class SecurityWeaveGenerator{ 
	 public static void main(String args[]) throws Exception { 
	     String className=Account.class.getName();
		 ClassReader cr = new ClassReader(className); 
		 ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES); 
		 AddSecurityCheckClassAdapter classAdapter = new AddSecurityCheckClassAdapter(cw); 
		 cr.accept(classAdapter, ClassReader.SKIP_DEBUG); 
		 byte[] data = cw.toByteArray();
		 String classpath = "D:\\code\\eclipse_oxygen_workspace\\blog-java\\blog-java-books\\target\\classes\\blog\\java\\SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA\\chapter11\\p03_aop\\securitycheck\\Account.class";
		 File file = new File(classpath); 
		 FileOutputStream fout = new FileOutputStream(file); 
		 fout.write(data); 
		 fout.close(); 
	 } 
}
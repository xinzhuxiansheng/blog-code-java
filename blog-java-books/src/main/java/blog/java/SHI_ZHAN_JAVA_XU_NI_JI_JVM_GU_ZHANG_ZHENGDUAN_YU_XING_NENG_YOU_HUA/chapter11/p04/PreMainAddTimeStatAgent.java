/*package blog.java.SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA.chapter11.p04;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class PreMainAddTimeStatAgent {
	
	public static void premain(String agentArgs,Instrumentation inst) {
		System.out.println("agentArgs:" + agentArgs);
		inst.addTransformer(new ClassFileTransformer() {
			@Override
			public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
					ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
				if(className.equals("blog/java/SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA/chapter11")) {
					System.out.println("meet blog.java.SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA.chapter11.Account");
					ClassReader cr = new ClassReader(classfileBuffer);
					ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
					TimeStatClassAdapter classAdpater = new TimeStatClassAdapter(cw);
					cr.accept(classAdpater, ClassReader.SKIP_DEBUG);
					return cw.toByteArray();
				}else {
					System.out.println(className);
					return classfileBuffer;
				}
			}
		});	
	}
}
*/
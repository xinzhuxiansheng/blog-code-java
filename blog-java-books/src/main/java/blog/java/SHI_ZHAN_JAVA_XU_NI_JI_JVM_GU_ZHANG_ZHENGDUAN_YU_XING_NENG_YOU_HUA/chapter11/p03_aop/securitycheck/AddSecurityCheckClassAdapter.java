package blog.java.SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA.chapter11.p03_aop.securitycheck;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

class AddSecurityCheckClassAdapter extends ClassVisitor {
    public AddSecurityCheckClassAdapter( ClassVisitor cv) {
		super(Opcodes.ASM5, cv);
	}
    
    public MethodVisitor visitMethod(final int access, final String name, 
        final String desc, final String signature, final String[] exceptions) { 
        MethodVisitor mv = cv.visitMethod(access, name, desc, signature,exceptions);
        MethodVisitor wrappedMv = mv; 
        if (mv != null) { 
            if (name.equals("operation")) { 
                wrappedMv = new AddSecurityCheckMethodAdapter(mv); 
            } 
        } 
        return wrappedMv; 
    } 
}
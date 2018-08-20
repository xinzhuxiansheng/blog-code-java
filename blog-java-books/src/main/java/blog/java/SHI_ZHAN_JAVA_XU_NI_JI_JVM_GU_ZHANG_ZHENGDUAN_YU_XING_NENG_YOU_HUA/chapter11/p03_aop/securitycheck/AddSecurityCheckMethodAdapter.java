package blog.java.SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA.chapter11.p03_aop.securitycheck;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

class AddSecurityCheckMethodAdapter extends MethodVisitor { 
	 public AddSecurityCheckMethodAdapter(MethodVisitor mv) { 
		 super(Opcodes.ASM5,mv); 
	 } 

	 public void visitCode() { 
	     Label continueLabel = new Label(); 
		 visitMethodInsn(Opcodes.INVOKESTATIC, "blog/java/SHI_ZHAN_JAVA_XU_NI_JI_JVM_GU_ZHANG_ZHENGDUAN_YU_XING_NENG_YOU_HUA/chapter11/p03_aop/securitycheck/SecurityChecker", 
			"checkSecurity", "()Z"); 
		 visitJumpInsn(Opcodes.IFNE,continueLabel);
		 visitInsn(Opcodes.RETURN);
		 visitLabel(continueLabel);
		 super.visitCode();
	 } 
}
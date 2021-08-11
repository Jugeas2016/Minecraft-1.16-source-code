/*    */ import com.google.common.base.Charsets;
/*    */ import java.nio.ByteBuffer;
/*    */ import org.lwjgl.BufferUtils;
/*    */ import org.lwjgl.glfw.GLFW;
/*    */ import org.lwjgl.glfw.GLFWErrorCallback;
/*    */ import org.lwjgl.glfw.GLFWErrorCallbackI;
/*    */ import org.lwjgl.system.MemoryUtil;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class deh
/*    */ {
/* 16 */   private final ByteBuffer a = BufferUtils.createByteBuffer(8192);
/*    */   
/*    */   public String a(long ☃, GLFWErrorCallbackI gLFWErrorCallbackI) {
/* 19 */     GLFWErrorCallback gLFWErrorCallback1 = GLFW.glfwSetErrorCallback(gLFWErrorCallbackI);
/* 20 */     String str = GLFW.glfwGetClipboardString(☃);
/* 21 */     str = (str != null) ? afr.a(str) : "";
/* 22 */     GLFWErrorCallback gLFWErrorCallback2 = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)gLFWErrorCallback1);
/* 23 */     if (gLFWErrorCallback2 != null) {
/* 24 */       gLFWErrorCallback2.free();
/*    */     }
/* 26 */     return str;
/*    */   }
/*    */ 
/*    */   
/*    */   private static void a(long ☃, ByteBuffer byteBuffer, byte[] arrayOfByte) {
/* 31 */     byteBuffer.clear();
/* 32 */     byteBuffer.put(arrayOfByte);
/* 33 */     byteBuffer.put((byte)0);
/* 34 */     byteBuffer.flip();
/* 35 */     GLFW.glfwSetClipboardString(☃, byteBuffer);
/*    */   }
/*    */   
/*    */   public void a(long ☃, String str) {
/* 39 */     byte[] arrayOfByte = str.getBytes(Charsets.UTF_8);
/*    */     
/* 41 */     int i = arrayOfByte.length + 1;
/* 42 */     if (i < this.a.capacity()) {
/* 43 */       a(☃, this.a, arrayOfByte);
/*    */     } else {
/* 45 */       ByteBuffer byteBuffer = MemoryUtil.memAlloc(i);
/*    */       try {
/* 47 */         a(☃, byteBuffer, arrayOfByte);
/*    */       } finally {
/* 49 */         MemoryUtil.memFree(byteBuffer);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\deh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
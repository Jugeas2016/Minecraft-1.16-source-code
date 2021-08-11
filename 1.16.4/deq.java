/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.ByteOrder;
/*    */ import java.nio.FloatBuffer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class deq
/*    */ {
/*    */   public static synchronized ByteBuffer a(int ☃) {
/* 18 */     return ByteBuffer.allocateDirect(☃).order(ByteOrder.nativeOrder());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static FloatBuffer b(int ☃) {
/* 38 */     return a(☃ << 2).asFloatBuffer();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\deq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ekm
/*    */   extends ack<int[]>
/*    */ {
/* 12 */   private static final vk a = new vk("textures/colormap/grass.png");
/*    */ 
/*    */   
/*    */   protected int[] a(ach ☃, anw anw1) {
/*    */     try {
/* 17 */       return eko.a(☃, a);
/* 18 */     } catch (IOException iOException) {
/* 19 */       throw new IllegalStateException("Failed to load grass color texture", iOException);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(int[] ☃, ach ach1, anw anw1) {
/* 25 */     brv.a(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
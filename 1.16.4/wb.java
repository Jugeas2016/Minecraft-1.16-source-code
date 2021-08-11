/*    */ public class wb
/*    */   implements Runnable
/*    */ {
/*    */   private final int a;
/*    */   private final Runnable b;
/*    */   
/*    */   public wb(int ☃, Runnable runnable) {
/*  8 */     this.a = ☃;
/*  9 */     this.b = runnable;
/*    */   }
/*    */   
/*    */   public int a() {
/* 13 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 18 */     this.b.run();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
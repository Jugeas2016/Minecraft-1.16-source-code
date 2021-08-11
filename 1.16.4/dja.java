/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class dja
/*    */   implements dhk, Runnable
/*    */ {
/* 14 */   public static final Logger a = LogManager.getLogger();
/*    */   protected dhz b;
/*    */   
/*    */   protected static void a(int ☃) {
/*    */     try {
/* 19 */       Thread.sleep((☃ * 1000));
/* 20 */     } catch (InterruptedException interruptedException) {
/* 21 */       a.error("", interruptedException);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static void a(dot ☃) {
/* 27 */     djz djz = djz.C();
/* 28 */     djz.execute(() -> ☃.a(dot1));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(dhz ☃) {
/* 34 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nr ☃) {
/* 39 */     this.b.a(☃);
/*    */   }
/*    */   
/*    */   public void b(nr ☃) {
/* 43 */     this.b.b(☃);
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 47 */     return this.b.a();
/*    */   }
/*    */   
/*    */   public void b() {}
/*    */   
/*    */   public void d() {}
/*    */   
/*    */   public void a() {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
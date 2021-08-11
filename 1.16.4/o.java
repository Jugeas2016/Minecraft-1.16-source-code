/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ public class o
/*    */   implements Thread.UncaughtExceptionHandler
/*    */ {
/*    */   private final Logger a;
/*    */   
/*    */   public o(Logger ☃) {
/*  9 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void uncaughtException(Thread ☃, Throwable throwable) {
/* 14 */     this.a.error("Caught previously unhandled exception :", throwable);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
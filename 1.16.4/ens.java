/*    */ import java.util.concurrent.locks.LockSupport;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ens
/*    */   extends aob<Runnable>
/*    */ {
/*    */   private Thread a;
/*    */   private volatile boolean b;
/*    */   
/*    */   public ens() {
/* 13 */     super("Sound executor");
/* 14 */     this.a = b();
/*    */   }
/*    */   
/*    */   private Thread b() {
/* 18 */     Thread ☃ = new Thread(this::c);
/* 19 */     ☃.setDaemon(true);
/* 20 */     ☃.setName("Sound engine");
/* 21 */     ☃.start();
/* 22 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Runnable e(Runnable ☃) {
/* 27 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean d(Runnable ☃) {
/* 32 */     return !this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Thread aw() {
/* 37 */     return this.a;
/*    */   }
/*    */   
/*    */   private void c() {
/* 41 */     while (!this.b) {
/* 42 */       c(() -> this.b);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void bm() {
/* 49 */     LockSupport.park("waiting for tasks");
/*    */   }
/*    */   
/*    */   public void a() {
/* 53 */     this.b = true;
/* 54 */     this.a.interrupt();
/*    */     try {
/* 56 */       this.a.join();
/* 57 */     } catch (InterruptedException ☃) {
/* 58 */       Thread.currentThread().interrupt();
/*    */     } 
/* 60 */     bk();
/* 61 */     this.b = false;
/* 62 */     this.a = b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ens.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
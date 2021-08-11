/*    */ import java.util.concurrent.atomic.AtomicInteger;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class adi
/*    */   implements Runnable
/*    */ {
/* 11 */   private static final Logger d = LogManager.getLogger();
/* 12 */   private static final AtomicInteger e = new AtomicInteger(0);
/*    */   
/*    */   protected volatile boolean a;
/*    */   protected final String b;
/*    */   @Nullable
/*    */   protected Thread c;
/*    */   
/*    */   protected adi(String ☃) {
/* 20 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public synchronized boolean a() {
/* 27 */     if (this.a) {
/* 28 */       return true;
/*    */     }
/* 30 */     this.a = true;
/* 31 */     this.c = new Thread(this, this.b + " #" + e.incrementAndGet());
/* 32 */     this.c.setUncaughtExceptionHandler(new p(d));
/* 33 */     this.c.start();
/* 34 */     d.info("Thread {} started", this.b);
/* 35 */     return true;
/*    */   }
/*    */   
/*    */   public synchronized void b() {
/* 39 */     this.a = false;
/* 40 */     if (null == this.c) {
/*    */       return;
/*    */     }
/* 43 */     int ☃ = 0;
/* 44 */     while (this.c.isAlive()) {
/*    */       
/*    */       try {
/* 47 */         this.c.join(1000L);
/* 48 */         ☃++;
/* 49 */         if (☃ >= 5) {
/*    */ 
/*    */ 
/*    */           
/* 53 */           d.warn("Waited {} seconds attempting force stop!", Integer.valueOf(☃)); continue;
/* 54 */         }  if (this.c.isAlive()) {
/* 55 */           d.warn("Thread {} ({}) failed to exit after {} second(s)", this, this.c.getState(), Integer.valueOf(☃), new Exception("Stack:"));
/*    */           
/* 57 */           this.c.interrupt();
/*    */         } 
/* 59 */       } catch (InterruptedException interruptedException) {}
/*    */     } 
/*    */ 
/*    */     
/* 63 */     d.info("Thread {} stopped", this.b);
/* 64 */     this.c = null;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 68 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
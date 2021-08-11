/*    */ import com.google.common.util.concurrent.RateLimiter;
/*    */ import java.time.Duration;
/*    */ import java.util.concurrent.atomic.AtomicReference;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eoq
/*    */ {
/*    */   private final float a;
/* 14 */   private final AtomicReference<a> b = new AtomicReference<>();
/*    */   
/*    */   public eoq(Duration ☃) {
/* 17 */     this.a = 1000.0F / (float)☃.toMillis();
/*    */   }
/*    */   
/*    */   public void a(String ☃) {
/* 21 */     a a = this.b.updateAndGet(a1 -> 
/* 22 */         (a1 == null || !☃.equals(a.b(a1))) ? new a(☃, RateLimiter.create(this.a)) : a1);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     if (a.a(a).tryAcquire(1))
/* 28 */       dkz.b.a(no.b, new oe(☃), x.b); 
/*    */   }
/*    */   
/*    */   static class a
/*    */   {
/*    */     private final String a;
/*    */     private final RateLimiter b;
/*    */     
/*    */     a(String ☃, RateLimiter rateLimiter) {
/* 37 */       this.a = ☃;
/* 38 */       this.b = rateLimiter;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eoq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
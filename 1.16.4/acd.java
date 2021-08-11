/*    */ import com.google.common.base.Stopwatch;
/*    */ import java.util.List;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.concurrent.Executor;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import java.util.concurrent.atomic.AtomicLong;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acd
/*    */   extends acl<acd.a>
/*    */ {
/* 19 */   private static final Logger d = LogManager.getLogger();
/* 20 */   private final Stopwatch e = Stopwatch.createUnstarted();
/*    */   
/*    */   public acd(ach ☃, List<acc> list, Executor executor1, Executor executor2, CompletableFuture<afx> completableFuture) {
/* 23 */     super(executor1, executor2, ☃, list, (a1, ach1, acc1, executor1, executor2) -> { AtomicLong atomicLong1 = new AtomicLong(); AtomicLong atomicLong2 = new AtomicLong(); anp anp1 = new anp(x.a, (), false); anp anp2 = new anp(x.a, (), false); CompletableFuture<Void> completableFuture = acc1.a(a1, ach1, anp1, anp2, (), ()); return completableFuture.thenApplyAsync((), ☃); }completableFuture);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     this.e.start();
/* 47 */     this.c.thenAcceptAsync(this::a, executor2);
/*    */   }
/*    */   
/*    */   private void a(List<a> ☃) {
/* 51 */     this.e.stop();
/* 52 */     int i = 0;
/* 53 */     d.info("Resource reload finished after " + this.e.elapsed(TimeUnit.MILLISECONDS) + " ms");
/* 54 */     for (a a : ☃) {
/* 55 */       anv anv1 = a.a(a);
/* 56 */       anv anv2 = a.b(a);
/* 57 */       int j = (int)(a.c(a).get() / 1000000.0D);
/* 58 */       int k = (int)(a.d(a).get() / 1000000.0D);
/* 59 */       int m = j + k;
/* 60 */       String str = a.e(a);
/* 61 */       d.info(str + " took approximately " + m + " ms (" + j + " ms preparing, " + k + " ms applying)");
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
/* 75 */       i += k;
/*    */     } 
/*    */     
/* 78 */     d.info("Total blocking time: " + i + " ms");
/*    */   }
/*    */   
/*    */   public static class a {
/*    */     private final String a;
/*    */     private final anv b;
/*    */     private final anv c;
/*    */     private final AtomicLong d;
/*    */     private final AtomicLong e;
/*    */     
/*    */     private a(String ☃, anv anv1, anv anv2, AtomicLong atomicLong1, AtomicLong atomicLong2) {
/* 89 */       this.a = ☃;
/* 90 */       this.b = anv1;
/* 91 */       this.c = anv2;
/* 92 */       this.d = atomicLong1;
/* 93 */       this.e = atomicLong2;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ import com.google.common.collect.Queues;
/*     */ import java.util.Queue;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.concurrent.locks.LockSupport;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import java.util.function.Supplier;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class aob<R extends Runnable>
/*     */   implements aod<R>, Executor
/*     */ {
/*     */   private final String b;
/*  17 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*  19 */   private final Queue<R> d = Queues.newConcurrentLinkedQueue();
/*     */   private int e;
/*     */   
/*     */   protected aob(String ☃) {
/*  23 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bh() {
/*  31 */     return (Thread.currentThread() == aw());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean av() {
/*  37 */     return !bh();
/*     */   }
/*     */   
/*     */   public int bi() {
/*  41 */     return this.d.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public String bj() {
/*  46 */     return this.b;
/*     */   }
/*     */   
/*     */   public <V> CompletableFuture<V> a(Supplier<V> ☃) {
/*  50 */     if (av()) {
/*  51 */       return CompletableFuture.supplyAsync(☃, this);
/*     */     }
/*  53 */     return CompletableFuture.completedFuture(☃.get());
/*     */   }
/*     */ 
/*     */   
/*     */   private CompletableFuture<Void> a(Runnable ☃) {
/*  58 */     return CompletableFuture.supplyAsync(() -> { ☃.run(); return null; }this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CompletableFuture<Void> f(Runnable ☃) {
/*  67 */     if (av()) {
/*  68 */       return a(☃);
/*     */     }
/*  70 */     ☃.run();
/*  71 */     return CompletableFuture.completedFuture(null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(Runnable ☃) {
/*  76 */     if (!bh()) {
/*  77 */       a(☃).join();
/*     */     } else {
/*  79 */       ☃.run();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void h(R ☃) {
/*  85 */     this.d.add(☃);
/*  86 */     LockSupport.unpark(aw());
/*     */   }
/*     */ 
/*     */   
/*     */   public void execute(Runnable ☃) {
/*  91 */     if (av()) {
/*  92 */       h(e(☃));
/*     */     } else {
/*  94 */       ☃.run();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void bk() {
/*  99 */     this.d.clear();
/*     */   }
/*     */   
/*     */   protected void bl() {
/* 103 */     while (y());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean y() {
/* 109 */     Runnable runnable = (Runnable)this.d.peek();
/* 110 */     if (runnable == null) {
/* 111 */       return false;
/*     */     }
/*     */     
/* 114 */     if (this.e == 0 && !d((R)runnable)) {
/* 115 */       return false;
/*     */     }
/*     */     
/* 118 */     c(this.d.remove());
/*     */     
/* 120 */     return true;
/*     */   }
/*     */   
/*     */   public void c(BooleanSupplier ☃) {
/* 124 */     this.e++;
/*     */     try {
/* 126 */       while (!☃.getAsBoolean()) {
/* 127 */         if (!y())
/*     */         {
/* 129 */           bm();
/*     */         }
/*     */       } 
/*     */     } finally {
/* 133 */       this.e--;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void bm() {
/* 138 */     Thread.yield();
/* 139 */     LockSupport.parkNanos("waiting for tasks", 100000L);
/*     */   }
/*     */   
/*     */   protected void c(R ☃) {
/*     */     try {
/* 144 */       ☃.run();
/* 145 */     } catch (Exception exception) {
/* 146 */       c.fatal("Error executing task on {}", bj(), exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected abstract R e(Runnable paramRunnable);
/*     */   
/*     */   protected abstract boolean d(R paramR);
/*     */   
/*     */   protected abstract Thread aw();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
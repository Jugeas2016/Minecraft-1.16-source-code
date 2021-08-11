/*     */ import it.unimi.dsi.fastutil.ints.Int2BooleanFunction;
/*     */ import java.util.concurrent.ConcurrentLinkedQueue;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.concurrent.RejectedExecutionException;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aoe<T>
/*     */   implements aod<T>, AutoCloseable, Runnable
/*     */ {
/*  17 */   private static final Logger b = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*  21 */   private final AtomicInteger c = new AtomicInteger(0);
/*     */   public final aog<? super T, ? extends Runnable> a;
/*     */   private final Executor d;
/*     */   private final String e;
/*     */   
/*     */   public static aoe<Runnable> a(Executor ☃, String str) {
/*  27 */     return new aoe<>(new aog.c<>(new ConcurrentLinkedQueue<>()), ☃, str);
/*     */   }
/*     */   
/*     */   public aoe(aog<? super T, ? extends Runnable> ☃, Executor executor, String str) {
/*  31 */     this.d = executor;
/*  32 */     this.a = ☃;
/*  33 */     this.e = str;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean a() {
/*     */     while (true) {
/*  39 */       int ☃ = this.c.get();
/*  40 */       if ((☃ & 0x3) != 0) {
/*  41 */         return false;
/*     */       }
/*  43 */       if (this.c.compareAndSet(☃, ☃ | 0x2))
/*  44 */         return true; 
/*     */     } 
/*     */   }
/*     */   private void b() {
/*     */     int ☃;
/*     */     do {
/*  50 */       ☃ = this.c.get();
/*  51 */     } while (!this.c.compareAndSet(☃, ☃ & 0xFFFFFFFD));
/*     */   }
/*     */   
/*     */   private boolean c() {
/*  55 */     if ((this.c.get() & 0x1) != 0) {
/*  56 */       return false;
/*     */     }
/*     */     
/*  59 */     return !this.a.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/*     */     int ☃;
/*     */     do {
/*  66 */       ☃ = this.c.get();
/*  67 */     } while (!this.c.compareAndSet(☃, ☃ | 0x1));
/*     */   }
/*     */   
/*     */   private boolean d() {
/*  71 */     return ((this.c.get() & 0x2) != 0);
/*     */   } private boolean e() {
/*     */     String str;
/*     */     Thread thread;
/*  75 */     if (!d()) {
/*  76 */       return false;
/*     */     }
/*     */     
/*  79 */     Runnable ☃ = this.a.a();
/*  80 */     if (☃ == null) {
/*  81 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  86 */     if (w.d) {
/*  87 */       thread = Thread.currentThread();
/*  88 */       str = thread.getName();
/*  89 */       thread.setName(this.e);
/*     */     } else {
/*  91 */       thread = null;
/*  92 */       str = null;
/*     */     } 
/*  94 */     ☃.run();
/*  95 */     if (thread != null) {
/*  96 */       thread.setName(str);
/*     */     }
/*     */     
/*  99 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*     */     try {
/* 105 */       a(☃ -> (☃ == 0));
/*     */     } finally {
/* 107 */       b();
/* 108 */       f();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃) {
/* 114 */     this.a.a(☃);
/* 115 */     f();
/*     */   }
/*     */   
/*     */   private void f() {
/* 119 */     if (c() && 
/* 120 */       a()) {
/*     */       try {
/* 122 */         this.d.execute(this);
/* 123 */       } catch (RejectedExecutionException ☃) {
/*     */         
/*     */         try {
/* 126 */           this.d.execute(this);
/* 127 */         } catch (RejectedExecutionException rejectedExecutionException) {
/* 128 */           b.error("Cound not schedule mailbox", rejectedExecutionException);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private int a(Int2BooleanFunction ☃) {
/* 136 */     int i = 0;
/* 137 */     while (☃.get(i) && e()) {
/* 138 */       i++;
/*     */     }
/* 140 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 145 */     return this.e + " " + this.c.get() + " " + this.a.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public String bj() {
/* 150 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aoe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
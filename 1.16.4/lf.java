/*     */ import com.google.common.base.Stopwatch;
/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.objects.Object2LongMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.Collection;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lf
/*     */ {
/*     */   private final lu a;
/*     */   @Nullable
/*     */   private fx b;
/*     */   private final aag c;
/*  30 */   private final Collection<lg> d = Lists.newArrayList();
/*     */   
/*     */   private final int e;
/*  33 */   private final Collection<lj> f = Lists.newCopyOnWriteArrayList();
/*  34 */   private Object2LongMap<Runnable> g = (Object2LongMap<Runnable>)new Object2LongOpenHashMap();
/*     */   
/*     */   private long h;
/*     */   private long i;
/*     */   private boolean j = false;
/*  39 */   private final Stopwatch k = Stopwatch.createUnstarted();
/*     */   
/*     */   private boolean l = false;
/*     */   
/*     */   private final bzm m;
/*     */   @Nullable
/*     */   private Throwable n;
/*     */   
/*     */   public lf(lu ☃, bzm bzm1, aag aag1) {
/*  48 */     this.a = ☃;
/*  49 */     this.c = aag1;
/*  50 */     this.e = ☃.c();
/*  51 */     this.m = ☃.g().a(bzm1);
/*     */   }
/*     */   
/*     */   void a(fx ☃) {
/*  55 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   void a() {
/*  59 */     this.h = this.c.T() + 1L + this.a.f();
/*  60 */     this.k.start();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/*  67 */     if (k()) {
/*     */       return;
/*     */     }
/*  70 */     this.i = this.c.T() - this.h;
/*  71 */     if (this.i < 0L) {
/*     */       return;
/*     */     }
/*  74 */     if (this.i == 0L) {
/*  75 */       v();
/*     */     }
/*  77 */     ObjectIterator<Object2LongMap.Entry<Runnable>> ☃ = this.g.object2LongEntrySet().iterator();
/*  78 */     while (☃.hasNext()) {
/*  79 */       Object2LongMap.Entry<Runnable> entry = (Object2LongMap.Entry<Runnable>)☃.next();
/*  80 */       if (entry.getLongValue() <= this.i) {
/*     */         try {
/*  82 */           ((Runnable)entry.getKey()).run();
/*  83 */         } catch (Exception exception) {
/*  84 */           a(exception);
/*     */         } 
/*  86 */         ☃.remove();
/*     */       } 
/*     */     } 
/*  89 */     if (this.i > this.e) {
/*     */       
/*  91 */       if (this.f.isEmpty()) {
/*  92 */         a(new lm("Didn't succeed or fail within " + this.a.c() + " ticks"));
/*     */       } else {
/*  94 */         this.f.forEach(☃ -> ☃.b(this.i));
/*  95 */         if (this.n == null) {
/*  96 */           a(new lm("No sequences finished"));
/*     */         }
/*     */       } 
/*     */     } else {
/*     */       
/* 101 */       this.f.forEach(☃ -> ☃.a(this.i));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void v() {
/* 106 */     if (this.j) {
/* 107 */       throw new IllegalStateException("Test already started");
/*     */     }
/* 109 */     this.j = true;
/*     */     try {
/* 111 */       this.a.a(new le(this));
/* 112 */     } catch (Exception ☃) {
/* 113 */       a(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String c() {
/* 122 */     return this.a.a();
/*     */   }
/*     */   
/*     */   public fx d() {
/* 126 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aag g() {
/* 154 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 158 */     return (this.l && this.n == null);
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 162 */     return (this.n != null);
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 166 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean k() {
/* 170 */     return this.l;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void x() {
/* 178 */     if (!this.l) {
/* 179 */       this.l = true;
/* 180 */       this.k.stop();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Throwable ☃) {
/* 193 */     x();
/* 194 */     this.n = ☃;
/* 195 */     this.d.forEach(☃ -> ☃.c(this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Throwable n() {
/* 203 */     return this.n;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 208 */     return c();
/*     */   }
/*     */   
/*     */   public void a(lg ☃) {
/* 212 */     this.d.add(☃);
/*     */   }
/*     */   
/*     */   public void a(fx ☃, int i) {
/* 216 */     cdj cdj = lq.a(s(), ☃, t(), i, this.c, false);
/* 217 */     a(cdj.o());
/*     */     
/* 219 */     cdj.a(c());
/* 220 */     lq.a(this.b, new fx(1, 0, -1), t(), this.c);
/*     */     
/* 222 */     this.d.forEach(☃ -> ☃.a(this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean q() {
/* 236 */     return this.a.d();
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 240 */     return !this.a.d();
/*     */   }
/*     */   
/*     */   public String s() {
/* 244 */     return this.a.b();
/*     */   }
/*     */   
/*     */   public bzm t() {
/* 248 */     return this.m;
/*     */   }
/*     */   
/*     */   public lu u() {
/* 252 */     return this.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\lf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
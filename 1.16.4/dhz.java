/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class dhz
/*     */   extends eoo
/*     */   implements dhk
/*     */ {
/*  24 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private final dot c;
/*     */   
/*  28 */   private volatile nr p = oe.d;
/*     */   
/*     */   @Nullable
/*     */   private volatile nr q;
/*     */   
/*     */   private volatile boolean r;
/*     */   private int s;
/*     */   private final dja t;
/*  36 */   private final int u = 212;
/*     */   
/*     */   public dhz(dot ☃, dja dja1) {
/*  39 */     this.c = ☃;
/*  40 */     this.t = dja1;
/*  41 */     dja1.a(this);
/*     */     
/*  43 */     Thread thread = new Thread(dja1, "Realms-long-running-task");
/*  44 */     thread.setUncaughtExceptionHandler(new dhg(b));
/*  45 */     thread.start();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  50 */     super.d();
/*     */     
/*  52 */     eoj.b(this.p.getString());
/*     */     
/*  54 */     this.s++;
/*  55 */     this.t.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  60 */     if (☃ == 256) {
/*  61 */       h();
/*  62 */       return true;
/*     */     } 
/*  64 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  69 */     this.t.d();
/*     */     
/*  71 */     a(new dlj(this.k / 2 - 106, j(12), 212, 20, nq.d, ☃ -> h()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void h() {
/*  77 */     this.r = true;
/*  78 */     this.t.a();
/*  79 */     this.i.a(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  84 */     a(☃);
/*     */     
/*  86 */     a(☃, this.o, this.p, this.k / 2, j(3), 16777215);
/*     */     
/*  88 */     nr nr1 = this.q;
/*  89 */     if (nr1 == null) {
/*  90 */       a(☃, this.o, a[this.s % a.length], this.k / 2, j(8), 8421504);
/*     */     } else {
/*  92 */       a(☃, this.o, nr1, this.k / 2, j(8), 16711680);
/*     */     } 
/*     */     
/*  95 */     super.a(☃, i, j, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nr ☃) {
/* 100 */     this.q = ☃;
/* 101 */     eoj.a(☃.getString());
/* 102 */     i();
/* 103 */     a(new dlj(this.k / 2 - 106, this.l / 4 + 120 + 12, 200, 20, nq.h, ☃ -> h()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void i() {
/* 109 */     Set<dmi> ☃ = Sets.newHashSet(this.m);
/*     */ 
/*     */     
/* 112 */     this.e.removeIf(☃::contains);
/* 113 */     this.m.clear();
/*     */   }
/*     */   
/*     */   public void b(nr ☃) {
/* 117 */     this.p = ☃;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 121 */     return this.r;
/*     */   }
/*     */ 
/*     */   
/* 125 */   public static final String[] a = new String[] { "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃", "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄", "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅", "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆", "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇", "_ _ _ _ _ ▃ ▄ ▅ ▆ ▇ █", "_ _ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇", "_ _ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆", "_ _ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅", "_ ▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄", "▃ ▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃", "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _", "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _", "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _", "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _", "█ ▇ ▆ ▅ ▄ ▃ _ _ _ _ _", "▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _ _", "▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _ _", "▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _ _", "▄ ▅ ▆ ▇ █ ▇ ▆ ▅ ▄ ▃ _" };
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
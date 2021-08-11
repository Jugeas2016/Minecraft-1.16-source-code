/*     */ import java.util.EnumSet;
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
/*     */ public abstract class awj
/*     */   extends avv
/*     */ {
/*     */   protected final aqu a;
/*     */   public final double b;
/*     */   protected int c;
/*     */   protected int d;
/*     */   private int g;
/*  20 */   protected fx e = fx.b;
/*     */   
/*     */   private boolean h;
/*     */   private final int i;
/*     */   private final int j;
/*     */   protected int f;
/*     */   
/*     */   public awj(aqu ☃, double d, int i) {
/*  28 */     this(☃, d, i, 1);
/*     */   }
/*     */   
/*     */   public awj(aqu ☃, double d, int i, int j) {
/*  32 */     this.a = ☃;
/*  33 */     this.b = d;
/*  34 */     this.i = i;
/*  35 */     this.f = 0;
/*  36 */     this.j = j;
/*  37 */     a(EnumSet.of(avv.a.a, avv.a.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  42 */     if (this.c > 0) {
/*  43 */       this.c--;
/*  44 */       return false;
/*     */     } 
/*  46 */     this.c = a(this.a);
/*  47 */     return m();
/*     */   }
/*     */   
/*     */   protected int a(aqu ☃) {
/*  51 */     return 200 + ☃.cY().nextInt(200);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  56 */     return (this.d >= -this.g && this.d <= 1200 && a(this.a.l, this.e));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  61 */     g();
/*  62 */     this.d = 0;
/*  63 */     this.g = this.a.cY().nextInt(this.a.cY().nextInt(1200) + 1200) + 1200;
/*     */   }
/*     */   
/*     */   protected void g() {
/*  67 */     this.a.x().a(this.e.u() + 0.5D, (this.e.v() + 1), this.e.w() + 0.5D, this.b);
/*     */   }
/*     */   
/*     */   public double h() {
/*  71 */     return 1.0D;
/*     */   }
/*     */   
/*     */   protected fx j() {
/*  75 */     return this.e.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  80 */     fx ☃ = j();
/*  81 */     if (!☃.a(this.a.cA(), h())) {
/*  82 */       this.h = false;
/*  83 */       this.d++;
/*  84 */       if (k()) {
/*  85 */         this.a.x().a(☃.u() + 0.5D, ☃.v(), ☃.w() + 0.5D, this.b);
/*     */       }
/*     */     } else {
/*  88 */       this.h = true;
/*  89 */       this.d--;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean k() {
/*  94 */     return (this.d % 40 == 0);
/*     */   }
/*     */   
/*     */   protected boolean l() {
/*  98 */     return this.h;
/*     */   }
/*     */   
/*     */   protected boolean m() {
/* 102 */     int ☃ = this.i;
/* 103 */     int i = this.j;
/* 104 */     fx fx1 = this.a.cB();
/*     */     
/* 106 */     fx.a a = new fx.a(); int j;
/* 107 */     for (j = this.f; j <= i; j = (j > 0) ? -j : (1 - j)) {
/* 108 */       for (int k = 0; k < ☃; k++) {
/* 109 */         int m; for (m = 0; m <= k; m = (m > 0) ? -m : (1 - m)) {
/*     */           
/* 111 */           int n = (m < k && m > -k) ? k : 0;
/* 112 */           for (; n <= k; n = (n > 0) ? -n : (1 - n)) {
/* 113 */             a.a(fx1, m, j - 1, n);
/* 114 */             if (this.a.a(a) && a(this.a.l, a)) {
/* 115 */               this.e = a;
/* 116 */               return true;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 123 */     return false;
/*     */   }
/*     */   
/*     */   protected abstract boolean a(brz parambrz, fx paramfx);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
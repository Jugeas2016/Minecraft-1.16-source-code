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
/*     */ 
/*     */ 
/*     */ public class awf
/*     */   extends avv
/*     */ {
/*     */   protected final aqu a;
/*     */   private final double b;
/*     */   private final boolean c;
/*     */   private cxd d;
/*     */   private double e;
/*     */   private double f;
/*     */   private double g;
/*     */   private int h;
/*     */   private int i;
/*  26 */   private final int j = 20;
/*     */   
/*     */   private long k;
/*     */ 
/*     */   
/*     */   public awf(aqu ☃, double d, boolean bool) {
/*  32 */     this.a = ☃;
/*  33 */     this.b = d;
/*  34 */     this.c = bool;
/*  35 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  40 */     long ☃ = this.a.l.T();
/*  41 */     if (☃ - this.k < 20L) {
/*  42 */       return false;
/*     */     }
/*     */     
/*  45 */     this.k = ☃;
/*     */     
/*  47 */     aqm aqm = this.a.A();
/*  48 */     if (aqm == null) {
/*  49 */       return false;
/*     */     }
/*  51 */     if (!aqm.aX()) {
/*  52 */       return false;
/*     */     }
/*  54 */     this.d = this.a.x().a(aqm, 0);
/*  55 */     if (this.d != null) {
/*  56 */       return true;
/*     */     }
/*  58 */     if (a(aqm) >= this.a.h(aqm.cD(), aqm.cE(), aqm.cH())) {
/*  59 */       return true;
/*     */     }
/*  61 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  66 */     aqm ☃ = this.a.A();
/*  67 */     if (☃ == null) {
/*  68 */       return false;
/*     */     }
/*  70 */     if (!☃.aX()) {
/*  71 */       return false;
/*     */     }
/*  73 */     if (!this.c) {
/*  74 */       return !this.a.x().m();
/*     */     }
/*  76 */     if (!this.a.a(☃.cB())) {
/*  77 */       return false;
/*     */     }
/*     */     
/*  80 */     if (☃ instanceof bfw && (☃.a_() || ((bfw)☃).b_())) {
/*  81 */       return false;
/*     */     }
/*     */     
/*  84 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  89 */     this.a.x().a(this.d, this.b);
/*  90 */     this.a.s(true);
/*  91 */     this.h = 0;
/*  92 */     this.i = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  97 */     aqm ☃ = this.a.A();
/*  98 */     if (!aqd.e.test(☃)) {
/*  99 */       this.a.h((aqm)null);
/*     */     }
/* 101 */     this.a.s(false);
/* 102 */     this.a.x().o();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 107 */     aqm ☃ = this.a.A();
/* 108 */     this.a.t().a(☃, 30.0F, 30.0F);
/* 109 */     double d = this.a.h(☃.cD(), ☃.cE(), ☃.cH());
/* 110 */     this.h = Math.max(this.h - 1, 0);
/*     */     
/* 112 */     if ((this.c || this.a.z().a(☃)) && 
/* 113 */       this.h <= 0 && ((
/* 114 */       this.e == 0.0D && this.f == 0.0D && this.g == 0.0D) || ☃.h(this.e, this.f, this.g) >= 1.0D || this.a.cY().nextFloat() < 0.05F)) {
/* 115 */       this.e = ☃.cD();
/* 116 */       this.f = ☃.cE();
/* 117 */       this.g = ☃.cH();
/* 118 */       this.h = 4 + this.a.cY().nextInt(7);
/*     */       
/* 120 */       if (d > 1024.0D) {
/* 121 */         this.h += 10;
/* 122 */       } else if (d > 256.0D) {
/* 123 */         this.h += 5;
/*     */       } 
/*     */       
/* 126 */       if (!this.a.x().a(☃, this.b)) {
/* 127 */         this.h += 15;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 133 */     this.i = Math.max(this.i - 1, 0);
/* 134 */     a(☃, d);
/*     */   }
/*     */   
/*     */   protected void a(aqm ☃, double d) {
/* 138 */     double d1 = a(☃);
/* 139 */     if (d <= d1 && this.i <= 0) {
/* 140 */       g();
/* 141 */       this.a.a(aot.a);
/* 142 */       this.a.B(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void g() {
/* 147 */     this.i = 20;
/*     */   }
/*     */   
/*     */   protected boolean h() {
/* 151 */     return (this.i <= 0);
/*     */   }
/*     */   
/*     */   protected int j() {
/* 155 */     return this.i;
/*     */   }
/*     */   
/*     */   protected int k() {
/* 159 */     return 20;
/*     */   }
/*     */   
/*     */   protected double a(aqm ☃) {
/* 163 */     return (this.a.cy() * 2.0F * this.a.cy() * 2.0F + ☃.cy());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
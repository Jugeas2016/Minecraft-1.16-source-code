/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ava
/*     */ {
/*     */   protected final aqn a;
/*     */   protected float b;
/*     */   protected float c;
/*     */   protected boolean d;
/*     */   protected double e;
/*     */   protected double f;
/*     */   protected double g;
/*     */   
/*     */   public ava(aqn ☃) {
/*  19 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(dcn ☃) {
/*  23 */     a(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aqa ☃, float f1, float f2) {
/*  31 */     a(☃.cD(), b(☃), ☃.cH(), f1, f2);
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, double d2) {
/*  35 */     a(☃, d1, d2, this.a.ep(), this.a.O());
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, double d2, float f1, float f2) {
/*  39 */     this.e = ☃;
/*  40 */     this.f = d1;
/*  41 */     this.g = d2;
/*  42 */     this.b = f1;
/*  43 */     this.c = f2;
/*  44 */     this.d = true;
/*     */   }
/*     */   
/*     */   public void a() {
/*  48 */     if (b()) {
/*  49 */       this.a.q = 0.0F;
/*     */     }
/*     */     
/*  52 */     if (this.d) {
/*  53 */       this.d = false;
/*     */       
/*  55 */       this.a.aC = a(this.a.aC, h(), this.b);
/*  56 */       this.a.q = a(this.a.q, g(), this.c);
/*     */     } else {
/*  58 */       this.a.aC = a(this.a.aC, this.a.aA, 10.0F);
/*     */     } 
/*     */     
/*  61 */     if (!this.a.x().m())
/*     */     {
/*  63 */       this.a.aC = afm.b(this.a.aC, this.a.aA, this.a.Q());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b() {
/*  69 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  73 */     return this.d;
/*     */   }
/*     */   
/*     */   public double d() {
/*  77 */     return this.e;
/*     */   }
/*     */   
/*     */   public double e() {
/*  81 */     return this.f;
/*     */   }
/*     */   
/*     */   public double f() {
/*  85 */     return this.g;
/*     */   }
/*     */   
/*     */   protected float g() {
/*  89 */     double ☃ = this.e - this.a.cD();
/*  90 */     double d1 = this.f - this.a.cG();
/*  91 */     double d2 = this.g - this.a.cH();
/*  92 */     double d3 = afm.a(☃ * ☃ + d2 * d2);
/*  93 */     return (float)-(afm.d(d1, d3) * 57.2957763671875D);
/*     */   }
/*     */   
/*     */   protected float h() {
/*  97 */     double ☃ = this.e - this.a.cD();
/*  98 */     double d1 = this.g - this.a.cH();
/*  99 */     return (float)(afm.d(d1, ☃) * 57.2957763671875D) - 90.0F;
/*     */   }
/*     */   
/*     */   protected float a(float ☃, float f1, float f2) {
/* 103 */     float f3 = afm.c(☃, f1);
/* 104 */     float f4 = afm.a(f3, -f2, f2);
/* 105 */     return ☃ + f4;
/*     */   }
/*     */   
/*     */   private static double b(aqa ☃) {
/* 109 */     if (☃ instanceof aqm) {
/* 110 */       return ☃.cG();
/*     */     }
/* 112 */     return ((☃.cc()).b + (☃.cc()).e) / 2.0D;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ava.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
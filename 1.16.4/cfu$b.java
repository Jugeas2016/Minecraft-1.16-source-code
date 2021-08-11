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
/*     */ class b
/*     */   implements cfu.a
/*     */ {
/*     */   private final double b;
/*     */   private final double c;
/*     */   private final long d;
/*     */   private final long e;
/*     */   private final double f;
/*     */   
/*     */   private b(cfu paramcfu, double ☃, double d1, long l) {
/*  59 */     this.b = ☃;
/*  60 */     this.c = d1;
/*     */     
/*  62 */     this.f = l;
/*  63 */     this.e = x.b();
/*  64 */     this.d = this.e + l;
/*     */   }
/*     */ 
/*     */   
/*     */   public double a() {
/*  69 */     return Math.max(this.a.a() - e() / 2.0D, -cfu.a(this.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public double c() {
/*  74 */     return Math.max(this.a.b() - e() / 2.0D, -cfu.a(this.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public double b() {
/*  79 */     return Math.min(this.a.a() + e() / 2.0D, cfu.a(this.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public double d() {
/*  84 */     return Math.min(this.a.b() + e() / 2.0D, cfu.a(this.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public double e() {
/*  89 */     double ☃ = (x.b() - this.e) / this.f;
/*  90 */     return (☃ < 1.0D) ? afm.d(☃, this.b, this.c) : this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public double f() {
/*  95 */     return Math.abs(this.b - this.c) / (this.d - this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public long g() {
/* 100 */     return this.d - x.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public double h() {
/* 105 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public cft i() {
/* 110 */     return (this.c < this.b) ? cft.b : cft.a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void j() {}
/*     */ 
/*     */   
/*     */   public cfu.a l() {
/* 123 */     if (g() <= 0L) {
/* 124 */       return new cfu.d(this.a, this.c);
/*     */     }
/*     */     
/* 127 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh m() {
/* 132 */     return dde.a(dde.a, dde.a(
/* 133 */           Math.floor(a()), Double.NEGATIVE_INFINITY, Math.floor(c()), 
/* 134 */           Math.ceil(b()), Double.POSITIVE_INFINITY, Math.ceil(d())), dcr.e);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfu$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
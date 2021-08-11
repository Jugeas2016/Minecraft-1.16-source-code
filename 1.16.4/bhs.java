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
/*     */ public class bhs
/*     */   extends bhl
/*     */ {
/*  29 */   private static final us<Boolean> d = uv.a((Class)bhs.class, uu.i);
/*     */   
/*     */   private int e;
/*     */   public double b;
/*     */   public double c;
/*  34 */   private static final bon f = bon.a(new brw[] { bmd.ke, bmd.kf });
/*     */   
/*     */   public bhs(aqe<? extends bhs> ☃, brx brx1) {
/*  37 */     super(☃, brx1);
/*     */   }
/*     */   
/*     */   public bhs(brx ☃, double d1, double d2, double d3) {
/*  41 */     super(aqe.W, ☃, d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public bhl.a o() {
/*  46 */     return bhl.a.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  51 */     super.e();
/*  52 */     this.R.a(d, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  57 */     super.j();
/*     */     
/*  59 */     if (!this.l.s_()) {
/*  60 */       if (this.e > 0) {
/*  61 */         this.e--;
/*     */       }
/*  63 */       if (this.e <= 0) {
/*  64 */         this.b = 0.0D;
/*  65 */         this.c = 0.0D;
/*     */       } 
/*  67 */       o((this.e > 0));
/*     */     } 
/*     */     
/*  70 */     if (u() && this.J.nextInt(4) == 0) {
/*  71 */       this.l.a(hh.L, cD(), cE() + 0.8D, cH(), 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected double g() {
/*  77 */     return 0.2D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(apk ☃) {
/*  82 */     super.a(☃);
/*     */     
/*  84 */     if (!☃.d() && this.l.V().b(brt.g)) {
/*  85 */       a(bup.bY);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void c(fx ☃, ceh ceh1) {
/*  92 */     double d1 = 1.0E-4D;
/*  93 */     double d2 = 0.001D;
/*     */     
/*  95 */     super.c(☃, ceh1);
/*     */     
/*  97 */     dcn dcn = cC();
/*     */     
/*  99 */     double d3 = c(dcn);
/* 100 */     double d4 = this.b * this.b + this.c * this.c;
/* 101 */     if (d4 > 1.0E-4D && d3 > 0.001D) {
/* 102 */       double d5 = afm.a(d3);
/* 103 */       double d6 = afm.a(d4);
/*     */ 
/*     */       
/* 106 */       this.b = dcn.b / d5 * d6;
/* 107 */       this.c = dcn.d / d5 * d6;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void i() {
/* 113 */     double ☃ = this.b * this.b + this.c * this.c;
/*     */     
/* 115 */     if (☃ > 1.0E-7D) {
/* 116 */       ☃ = afm.a(☃);
/* 117 */       this.b /= ☃;
/* 118 */       this.c /= ☃;
/* 119 */       f(cC().d(0.8D, 0.0D, 0.8D).b(this.b, 0.0D, this.c));
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 125 */       f(cC().d(0.98D, 0.0D, 0.98D));
/*     */     } 
/*     */     
/* 128 */     super.i();
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(bfw ☃, aot aot1) {
/* 133 */     bmb bmb = ☃.b(aot1);
/* 134 */     if (f.a(bmb) && this.e + 3600 <= 32000) {
/* 135 */       if (!☃.bC.d) {
/* 136 */         bmb.g(1);
/*     */       }
/* 138 */       this.e += 3600;
/*     */     } 
/*     */     
/* 141 */     if (this.e > 0) {
/* 142 */       this.b = cD() - ☃.cD();
/* 143 */       this.c = cH() - ☃.cH();
/*     */     } 
/*     */     
/* 146 */     return aou.a(this.l.v);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/* 151 */     super.b(☃);
/* 152 */     ☃.a("PushX", this.b);
/* 153 */     ☃.a("PushZ", this.c);
/* 154 */     ☃.a("Fuel", (short)this.e);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 159 */     super.a(☃);
/* 160 */     this.b = ☃.k("PushX");
/* 161 */     this.c = ☃.k("PushZ");
/* 162 */     this.e = ☃.g("Fuel");
/*     */   }
/*     */   
/*     */   protected boolean u() {
/* 166 */     return ((Boolean)this.R.<Boolean>a(d)).booleanValue();
/*     */   }
/*     */   
/*     */   protected void o(boolean ☃) {
/* 170 */     this.R.b(d, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh q() {
/* 175 */     return bup.bY.n().a(bwy.a, gc.c).a(bwy.b, Boolean.valueOf(u()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
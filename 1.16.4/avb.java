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
/*     */ public class avb
/*     */ {
/*     */   protected final aqn a;
/*     */   protected double b;
/*     */   protected double c;
/*     */   protected double d;
/*     */   protected double e;
/*     */   protected float f;
/*     */   protected float g;
/*  29 */   protected a h = a.a;
/*     */   
/*     */   public avb(aqn ☃) {
/*  32 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  36 */     return (this.h == a.b);
/*     */   }
/*     */   
/*     */   public double c() {
/*  40 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, double d2, double d3) {
/*  44 */     this.b = ☃;
/*  45 */     this.c = d1;
/*  46 */     this.d = d2;
/*  47 */     this.e = d3;
/*  48 */     if (this.h != a.d) {
/*  49 */       this.h = a.b;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(float ☃, float f1) {
/*  54 */     this.h = a.c;
/*  55 */     this.f = ☃;
/*  56 */     this.g = f1;
/*  57 */     this.e = 0.25D;
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
/*     */   public void a() {
/*  71 */     if (this.h == a.c) {
/*  72 */       float ☃ = (float)this.a.b(arl.d);
/*  73 */       float f1 = (float)this.e * ☃;
/*     */       
/*  75 */       float f2 = this.f;
/*  76 */       float f3 = this.g;
/*  77 */       float f4 = afm.c(f2 * f2 + f3 * f3);
/*  78 */       if (f4 < 1.0F) {
/*  79 */         f4 = 1.0F;
/*     */       }
/*  81 */       f4 = f1 / f4;
/*  82 */       f2 *= f4;
/*  83 */       f3 *= f4;
/*     */       
/*  85 */       float f5 = afm.a(this.a.p * 0.017453292F);
/*  86 */       float f6 = afm.b(this.a.p * 0.017453292F);
/*  87 */       float f7 = f2 * f6 - f3 * f5;
/*  88 */       float f8 = f3 * f6 + f2 * f5;
/*     */       
/*  90 */       if (!b(f7, f8)) {
/*     */         
/*  92 */         this.f = 1.0F;
/*  93 */         this.g = 0.0F;
/*     */       } 
/*     */       
/*  96 */       this.a.q(f1);
/*  97 */       this.a.t(this.f);
/*  98 */       this.a.v(this.g);
/*     */       
/* 100 */       this.h = a.a;
/* 101 */     } else if (this.h == a.b) {
/* 102 */       this.h = a.a;
/*     */       
/* 104 */       double ☃ = this.b - this.a.cD();
/* 105 */       double d1 = this.d - this.a.cH();
/* 106 */       double d2 = this.c - this.a.cE();
/* 107 */       double d3 = ☃ * ☃ + d2 * d2 + d1 * d1;
/* 108 */       if (d3 < 2.500000277905201E-7D) {
/* 109 */         this.a.t(0.0F);
/*     */         
/*     */         return;
/*     */       } 
/* 113 */       float f = (float)(afm.d(d1, ☃) * 57.2957763671875D) - 90.0F;
/*     */       
/* 115 */       this.a.p = a(this.a.p, f, 90.0F);
/* 116 */       this.a.q((float)(this.e * this.a.b(arl.d)));
/*     */       
/* 118 */       fx fx = this.a.cB();
/* 119 */       ceh ceh = this.a.l.d_(fx);
/* 120 */       buo buo = ceh.b();
/* 121 */       ddh ddh = ceh.k(this.a.l, fx);
/* 122 */       if ((d2 > this.a.G && ☃ * ☃ + d1 * d1 < Math.max(1.0F, this.a.cy())) || (
/* 123 */         !ddh.b() && this.a.cE() < ddh.c(gc.a.b) + fx.v() && !buo.a(aed.p) && !buo.a(aed.M))) {
/*     */         
/* 125 */         this.a.v().a();
/* 126 */         this.h = a.d;
/*     */       } 
/* 128 */     } else if (this.h == a.d) {
/* 129 */       this.a.q((float)(this.e * this.a.b(arl.d)));
/* 130 */       if (this.a.ao()) {
/* 131 */         this.h = a.a;
/*     */       }
/*     */     } else {
/* 134 */       this.a.t(0.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean b(float ☃, float f1) {
/* 139 */     ayj ayj = this.a.x();
/* 140 */     if (ayj != null) {
/* 141 */       cxc cxc = ayj.q();
/* 142 */       if (cxc != null && cxc.a(this.a.l, afm.c(this.a.cD() + ☃), afm.c(this.a.cE()), afm.c(this.a.cH() + f1)) != cwz.c) {
/* 143 */         return false;
/*     */       }
/*     */     } 
/* 146 */     return true;
/*     */   }
/*     */   
/*     */   protected float a(float ☃, float f1, float f2) {
/* 150 */     float f3 = afm.g(f1 - ☃);
/* 151 */     if (f3 > f2) {
/* 152 */       f3 = f2;
/*     */     }
/* 154 */     if (f3 < -f2) {
/* 155 */       f3 = -f2;
/*     */     }
/* 157 */     float f4 = ☃ + f3;
/* 158 */     if (f4 < 0.0F) {
/* 159 */       f4 += 360.0F;
/* 160 */     } else if (f4 > 360.0F) {
/* 161 */       f4 -= 360.0F;
/*     */     } 
/* 163 */     return f4;
/*     */   }
/*     */   
/*     */   public double d() {
/* 167 */     return this.b;
/*     */   }
/*     */   
/*     */   public double e() {
/* 171 */     return this.c;
/*     */   }
/*     */   
/*     */   public double f() {
/* 175 */     return this.d;
/*     */   }
/*     */   
/*     */   public enum a {
/* 179 */     a,
/* 180 */     b,
/* 181 */     c,
/* 182 */     d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
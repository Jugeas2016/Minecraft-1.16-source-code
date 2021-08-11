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
/*     */ public class ayi
/*     */   extends ayj
/*     */ {
/*     */   private boolean p;
/*     */   
/*     */   public ayi(aqn ☃, brx brx1) {
/*  22 */     super(☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected cxf a(int ☃) {
/*  27 */     this.o = new cxj();
/*  28 */     this.o.a(true);
/*  29 */     return new cxf(this.o, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a() {
/*  34 */     return (this.a.ao() || p() || this.a.br());
/*     */   }
/*     */ 
/*     */   
/*     */   protected dcn b() {
/*  39 */     return new dcn(this.a.cD(), u(), this.a.cH());
/*     */   }
/*     */ 
/*     */   
/*     */   public cxd a(fx ☃, int i) {
/*  44 */     if (this.b.d_(☃).g()) {
/*  45 */       fx fx1 = ☃.c();
/*  46 */       while (fx1.v() > 0 && this.b.d_(fx1).g()) {
/*  47 */         fx1 = fx1.c();
/*     */       }
/*     */       
/*  50 */       if (fx1.v() > 0) {
/*  51 */         return super.a(fx1.b(), i);
/*     */       }
/*     */       
/*  54 */       while (fx1.v() < this.b.L() && this.b.d_(fx1).g()) {
/*  55 */         fx1 = fx1.b();
/*     */       }
/*  57 */       ☃ = fx1;
/*     */     } 
/*     */     
/*  60 */     if (this.b.d_(☃).c().b()) {
/*  61 */       fx fx1 = ☃.b();
/*  62 */       while (fx1.v() < this.b.L() && this.b.d_(fx1).c().b()) {
/*  63 */         fx1 = fx1.b();
/*     */       }
/*  65 */       return super.a(fx1, i);
/*     */     } 
/*     */     
/*  68 */     return super.a(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public cxd a(aqa ☃, int i) {
/*  73 */     return a(☃.cB(), i);
/*     */   }
/*     */   
/*     */   private int u() {
/*  77 */     if (!this.a.aE() || !r()) {
/*  78 */       return afm.c(this.a.cE() + 0.5D);
/*     */     }
/*     */ 
/*     */     
/*  82 */     int ☃ = afm.c(this.a.cE());
/*  83 */     buo buo = this.b.d_(new fx(this.a.cD(), ☃, this.a.cH())).b();
/*  84 */     int i = 0;
/*  85 */     while (buo == bup.A) {
/*  86 */       ☃++;
/*  87 */       buo = this.b.d_(new fx(this.a.cD(), ☃, this.a.cH())).b();
/*  88 */       if (++i > 16) {
/*  89 */         return afm.c(this.a.cE());
/*     */       }
/*     */     } 
/*  92 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void D_() {
/*  97 */     super.D_();
/*     */     
/*  99 */     if (this.p) {
/* 100 */       if (this.b.e(new fx(this.a.cD(), this.a.cE() + 0.5D, this.a.cH()))) {
/*     */         return;
/*     */       }
/*     */       
/* 104 */       for (int ☃ = 0; ☃ < this.c.e(); ☃++) {
/* 105 */         cxb cxb = this.c.a(☃);
/* 106 */         if (this.b.e(new fx(cxb.a, cxb.b, cxb.c))) {
/* 107 */           this.c.b(☃);
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(dcn ☃, dcn dcn1, int i, int j, int k) {
/* 116 */     int m = afm.c(☃.b);
/* 117 */     int n = afm.c(☃.d);
/*     */     
/* 119 */     double d1 = dcn1.b - ☃.b;
/* 120 */     double d2 = dcn1.d - ☃.d;
/* 121 */     double d3 = d1 * d1 + d2 * d2;
/* 122 */     if (d3 < 1.0E-8D) {
/* 123 */       return false;
/*     */     }
/*     */     
/* 126 */     double d4 = 1.0D / Math.sqrt(d3);
/* 127 */     d1 *= d4;
/* 128 */     d2 *= d4;
/*     */     
/* 130 */     i += 2;
/* 131 */     k += 2;
/* 132 */     if (!a(m, afm.c(☃.c), n, i, j, k, ☃, d1, d2)) {
/* 133 */       return false;
/*     */     }
/* 135 */     i -= 2;
/* 136 */     k -= 2;
/*     */     
/* 138 */     double d5 = 1.0D / Math.abs(d1);
/* 139 */     double d6 = 1.0D / Math.abs(d2);
/*     */     
/* 141 */     double d7 = m - ☃.b;
/* 142 */     double d8 = n - ☃.d;
/* 143 */     if (d1 >= 0.0D) {
/* 144 */       d7++;
/*     */     }
/* 146 */     if (d2 >= 0.0D) {
/* 147 */       d8++;
/*     */     }
/* 149 */     d7 /= d1;
/* 150 */     d8 /= d2;
/*     */     
/* 152 */     int i1 = (d1 < 0.0D) ? -1 : 1;
/* 153 */     int i2 = (d2 < 0.0D) ? -1 : 1;
/* 154 */     int i3 = afm.c(dcn1.b);
/* 155 */     int i4 = afm.c(dcn1.d);
/* 156 */     int i5 = i3 - m;
/* 157 */     int i6 = i4 - n;
/* 158 */     while (i5 * i1 > 0 || i6 * i2 > 0) {
/* 159 */       if (d7 < d8) {
/* 160 */         d7 += d5;
/* 161 */         m += i1;
/* 162 */         i5 = i3 - m;
/*     */       } else {
/* 164 */         d8 += d6;
/* 165 */         n += i2;
/* 166 */         i6 = i4 - n;
/*     */       } 
/*     */       
/* 169 */       if (!a(m, afm.c(☃.c), n, i, j, k, ☃, d1, d2)) {
/* 170 */         return false;
/*     */       }
/*     */     } 
/* 173 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i, int j, int k, int m, int n, dcn dcn1, double d1, double d2) {
/* 177 */     int i1 = ☃ - k / 2;
/* 178 */     int i2 = j - n / 2;
/*     */     
/* 180 */     if (!b(i1, i, i2, k, m, n, dcn1, d1, d2)) {
/* 181 */       return false;
/*     */     }
/*     */     
/* 184 */     for (int i3 = i1; i3 < i1 + k; i3++) {
/* 185 */       for (int i4 = i2; i4 < i2 + n; i4++) {
/* 186 */         double d3 = i3 + 0.5D - dcn1.b;
/* 187 */         double d4 = i4 + 0.5D - dcn1.d;
/* 188 */         if (d3 * d1 + d4 * d2 >= 0.0D) {
/*     */ 
/*     */ 
/*     */           
/* 192 */           cwz cwz = this.o.a(this.b, i3, i - 1, i4, this.a, k, m, n, true, true);
/*     */           
/* 194 */           if (!a(cwz)) {
/* 195 */             return false;
/*     */           }
/*     */           
/* 198 */           cwz = this.o.a(this.b, i3, i, i4, this.a, k, m, n, true, true);
/* 199 */           float f = this.a.a(cwz);
/*     */           
/* 201 */           if (f < 0.0F || f >= 8.0F) {
/* 202 */             return false;
/*     */           }
/*     */           
/* 205 */           if (cwz == cwz.m || cwz == cwz.l || cwz == cwz.q) {
/* 206 */             return false;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 211 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean a(cwz ☃) {
/* 215 */     if (☃ == cwz.h) {
/* 216 */       return false;
/*     */     }
/*     */     
/* 219 */     if (☃ == cwz.g) {
/* 220 */       return false;
/*     */     }
/*     */     
/* 223 */     if (☃ == cwz.b) {
/* 224 */       return false;
/*     */     }
/*     */     
/* 227 */     return true;
/*     */   }
/*     */   
/*     */   private boolean b(int ☃, int i, int j, int k, int m, int n, dcn dcn1, double d1, double d2) {
/* 231 */     for (fx fx : fx.a(new fx(☃, i, j), new fx(☃ + k - 1, i + m - 1, j + n - 1))) {
/* 232 */       double d3 = fx.u() + 0.5D - dcn1.b;
/* 233 */       double d4 = fx.w() + 0.5D - dcn1.d;
/* 234 */       if (d3 * d1 + d4 * d2 < 0.0D) {
/*     */         continue;
/*     */       }
/* 237 */       if (!this.b.d_(fx).a(this.b, fx, cxe.a)) {
/* 238 */         return false;
/*     */       }
/*     */     } 
/* 241 */     return true;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 245 */     this.o.b(☃);
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
/*     */   public boolean f() {
/* 257 */     return this.o.c();
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 261 */     this.p = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
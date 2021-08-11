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
/*     */ public class cxi
/*     */   extends cxj
/*     */ {
/*     */   private float k;
/*     */   private float l;
/*     */   
/*     */   public void a(bsi ☃, aqn aqn1) {
/*  24 */     super.a(☃, aqn1);
/*  25 */     aqn1.a(cwz.h, 0.0F);
/*  26 */     this.k = aqn1.a(cwz.c);
/*  27 */     aqn1.a(cwz.c, 6.0F);
/*  28 */     this.l = aqn1.a(cwz.i);
/*  29 */     aqn1.a(cwz.i, 4.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  34 */     this.b.a(cwz.c, this.k);
/*  35 */     this.b.a(cwz.i, this.l);
/*  36 */     super.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public cxb b() {
/*  41 */     return a(afm.c((this.b.cc()).a), afm.c((this.b.cc()).b + 0.5D), afm.c((this.b.cc()).c));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cxh a(double ☃, double d1, double d2) {
/*  47 */     return new cxh(a(afm.c(☃), afm.c(d1 + 0.5D), afm.c(d2)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(cxb[] ☃, cxb cxb1) {
/*  53 */     int i = 0;
/*  54 */     int j = 1;
/*     */     
/*  56 */     fx fx = new fx(cxb1.a, cxb1.b, cxb1.c);
/*  57 */     double d = b(fx);
/*     */     
/*  59 */     cxb cxb2 = a(cxb1.a, cxb1.b, cxb1.c + 1, 1, d);
/*  60 */     cxb cxb3 = a(cxb1.a - 1, cxb1.b, cxb1.c, 1, d);
/*  61 */     cxb cxb4 = a(cxb1.a + 1, cxb1.b, cxb1.c, 1, d);
/*  62 */     cxb cxb5 = a(cxb1.a, cxb1.b, cxb1.c - 1, 1, d);
/*  63 */     cxb cxb6 = a(cxb1.a, cxb1.b + 1, cxb1.c, 0, d);
/*  64 */     cxb cxb7 = a(cxb1.a, cxb1.b - 1, cxb1.c, 1, d);
/*     */     
/*  66 */     if (cxb2 != null && !cxb2.i) {
/*  67 */       ☃[i++] = cxb2;
/*     */     }
/*  69 */     if (cxb3 != null && !cxb3.i) {
/*  70 */       ☃[i++] = cxb3;
/*     */     }
/*  72 */     if (cxb4 != null && !cxb4.i) {
/*  73 */       ☃[i++] = cxb4;
/*     */     }
/*  75 */     if (cxb5 != null && !cxb5.i) {
/*  76 */       ☃[i++] = cxb5;
/*     */     }
/*  78 */     if (cxb6 != null && !cxb6.i) {
/*  79 */       ☃[i++] = cxb6;
/*     */     }
/*  81 */     if (cxb7 != null && !cxb7.i) {
/*  82 */       ☃[i++] = cxb7;
/*     */     }
/*     */     
/*  85 */     boolean bool1 = (cxb5 == null || cxb5.l == cwz.b || cxb5.k != 0.0F);
/*  86 */     boolean bool2 = (cxb2 == null || cxb2.l == cwz.b || cxb2.k != 0.0F);
/*  87 */     boolean bool3 = (cxb4 == null || cxb4.l == cwz.b || cxb4.k != 0.0F);
/*  88 */     boolean bool4 = (cxb3 == null || cxb3.l == cwz.b || cxb3.k != 0.0F);
/*     */     
/*  90 */     if (bool1 && bool4) {
/*  91 */       cxb cxb8 = a(cxb1.a - 1, cxb1.b, cxb1.c - 1, 1, d);
/*  92 */       if (cxb8 != null && !cxb8.i) {
/*  93 */         ☃[i++] = cxb8;
/*     */       }
/*     */     } 
/*  96 */     if (bool1 && bool3) {
/*  97 */       cxb cxb8 = a(cxb1.a + 1, cxb1.b, cxb1.c - 1, 1, d);
/*  98 */       if (cxb8 != null && !cxb8.i) {
/*  99 */         ☃[i++] = cxb8;
/*     */       }
/*     */     } 
/* 102 */     if (bool2 && bool4) {
/* 103 */       cxb cxb8 = a(cxb1.a - 1, cxb1.b, cxb1.c + 1, 1, d);
/* 104 */       if (cxb8 != null && !cxb8.i) {
/* 105 */         ☃[i++] = cxb8;
/*     */       }
/*     */     } 
/* 108 */     if (bool2 && bool3) {
/* 109 */       cxb cxb8 = a(cxb1.a + 1, cxb1.b, cxb1.c + 1, 1, d);
/* 110 */       if (cxb8 != null && !cxb8.i) {
/* 111 */         ☃[i++] = cxb8;
/*     */       }
/*     */     } 
/*     */     
/* 115 */     return i;
/*     */   }
/*     */   
/*     */   private double b(fx ☃) {
/* 119 */     if (!this.b.aE()) {
/* 120 */       fx fx1 = ☃.c();
/* 121 */       ddh ddh = this.a.d_(fx1).k(this.a, fx1);
/* 122 */       return fx1.v() + (ddh.b() ? 0.0D : ddh.c(gc.a.b));
/*     */     } 
/* 124 */     return ☃.v() + 0.5D;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private cxb a(int ☃, int i, int j, int k, double d) {
/* 129 */     cxb cxb = null;
/*     */     
/* 131 */     fx fx = new fx(☃, i, j);
/* 132 */     double d1 = b(fx);
/*     */ 
/*     */     
/* 135 */     if (d1 - d > 1.125D) {
/* 136 */       return null;
/*     */     }
/*     */     
/* 139 */     cwz cwz = a(this.a, ☃, i, j, this.b, this.d, this.e, this.f, false, false);
/*     */     
/* 141 */     float f = this.b.a(cwz);
/* 142 */     double d2 = this.b.cy() / 2.0D;
/*     */     
/* 144 */     if (f >= 0.0F) {
/* 145 */       cxb = a(☃, i, j);
/* 146 */       cxb.l = cwz;
/* 147 */       cxb.k = Math.max(cxb.k, f);
/*     */     } 
/*     */     
/* 150 */     if (cwz == cwz.h || cwz == cwz.c) {
/*     */       
/* 152 */       if (i < this.b.l.t_() - 10 && cxb != null) {
/* 153 */         cxb.k++;
/*     */       }
/*     */       
/* 156 */       return cxb;
/*     */     } 
/*     */     
/* 159 */     if (cxb == null && k > 0 && cwz != cwz.f && cwz != cwz.k && cwz != cwz.e) {
/* 160 */       cxb = a(☃, i + 1, j, k - 1, d);
/*     */     }
/*     */     
/* 163 */     if (cwz == cwz.b) {
/*     */       
/* 165 */       dci dci = new dci(☃ - d2 + 0.5D, i + 0.001D, j - d2 + 0.5D, ☃ + d2 + 0.5D, (i + this.b.cz()), j + d2 + 0.5D);
/* 166 */       if (!this.b.l.a_(this.b, dci)) {
/* 167 */         return null;
/*     */       }
/*     */ 
/*     */       
/* 171 */       cwz cwz1 = a(this.a, ☃, i - 1, j, this.b, this.d, this.e, this.f, false, false);
/* 172 */       if (cwz1 == cwz.a) {
/* 173 */         cxb = a(☃, i, j);
/* 174 */         cxb.l = cwz.c;
/* 175 */         cxb.k = Math.max(cxb.k, f);
/* 176 */         return cxb;
/*     */       } 
/* 178 */       if (cwz1 == cwz.h) {
/* 179 */         cxb = a(☃, i, j);
/* 180 */         cxb.l = cwz.h;
/* 181 */         cxb.k = Math.max(cxb.k, f);
/* 182 */         return cxb;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 187 */       int m = 0;
/* 188 */       while (i > 0 && cwz == cwz.b) {
/* 189 */         i--;
/*     */         
/* 191 */         if (m++ >= this.b.bP()) {
/* 192 */           return null;
/*     */         }
/*     */         
/* 195 */         cwz = a(this.a, ☃, i, j, this.b, this.d, this.e, this.f, false, false);
/* 196 */         f = this.b.a(cwz);
/*     */         
/* 198 */         if (cwz != cwz.b && f >= 0.0F) {
/* 199 */           cxb = a(☃, i, j);
/* 200 */           cxb.l = cwz;
/* 201 */           cxb.k = Math.max(cxb.k, f); break;
/*     */         } 
/* 203 */         if (f < 0.0F) {
/* 204 */           return null;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 209 */     return cxb;
/*     */   }
/*     */ 
/*     */   
/*     */   protected cwz a(brc ☃, boolean bool1, boolean bool2, fx fx1, cwz cwz1) {
/* 214 */     if (cwz1 == cwz.j && !(☃.d_(fx1).b() instanceof bug) && !(☃.d_(fx1.c()).b() instanceof bug)) {
/* 215 */       cwz1 = cwz.k;
/*     */     }
/* 217 */     if (cwz1 == cwz.r || cwz1 == cwz.s || cwz1 == cwz.t) {
/* 218 */       cwz1 = cwz.a;
/*     */     }
/* 220 */     if (cwz1 == cwz.v) {
/* 221 */       cwz1 = cwz.a;
/*     */     }
/* 223 */     return cwz1;
/*     */   }
/*     */ 
/*     */   
/*     */   public cwz a(brc ☃, int i, int j, int k) {
/* 228 */     fx.a a = new fx.a();
/* 229 */     cwz cwz = b(☃, a.d(i, j, k));
/*     */     
/* 231 */     if (cwz == cwz.h) {
/* 232 */       for (gc gc : gc.values()) {
/* 233 */         cwz cwz1 = b(☃, a.d(i, j, k).c(gc));
/* 234 */         if (cwz1 == cwz.a) {
/* 235 */           return cwz.i;
/*     */         }
/*     */       } 
/*     */       
/* 239 */       return cwz.h;
/*     */     } 
/*     */     
/* 242 */     if (cwz == cwz.b && j >= 1) {
/* 243 */       ceh ceh = ☃.d_(new fx(i, j - 1, k));
/* 244 */       cwz cwz1 = b(☃, a.d(i, j - 1, k));
/* 245 */       if (cwz1 == cwz.c || cwz1 == cwz.b || cwz1 == cwz.g) {
/* 246 */         cwz = cwz.b;
/*     */       } else {
/* 248 */         cwz = cwz.c;
/*     */       } 
/*     */       
/* 251 */       if (cwz1 == cwz.m || ceh.a(bup.iJ) || ceh.a(aed.ay)) {
/* 252 */         cwz = cwz.m;
/*     */       }
/*     */       
/* 255 */       if (cwz1 == cwz.o) {
/* 256 */         cwz = cwz.o;
/*     */       }
/*     */       
/* 259 */       if (cwz1 == cwz.q) {
/* 260 */         cwz = cwz.q;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 265 */     if (cwz == cwz.c) {
/* 266 */       cwz = a(☃, a.d(i, j, k), cwz);
/*     */     }
/*     */     
/* 269 */     return cwz;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
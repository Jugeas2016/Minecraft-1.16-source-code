/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class bbr
/*     */   extends aqn
/*     */   implements bdi
/*     */ {
/*  59 */   private static final Logger bv = LogManager.getLogger();
/*     */   
/*  61 */   public static final us<Integer> b = uv.a((Class)bbr.class, uu.b);
/*     */   
/*  63 */   private static final azg bw = (new azg()).a(64.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   public final double[][] c = new double[64][3];
/*  70 */   public int d = -1;
/*     */   
/*     */   private final bbp[] bx;
/*     */   
/*     */   public final bbp bo;
/*     */   
/*     */   private final bbp by;
/*     */   
/*     */   private final bbp bz;
/*     */   private final bbp bA;
/*     */   private final bbp bB;
/*     */   private final bbp bC;
/*     */   private final bbp bD;
/*     */   private final bbp bE;
/*     */   public float bp;
/*     */   public float bq;
/*     */   public boolean br;
/*     */   public int bs;
/*     */   public float bt;
/*     */   @Nullable
/*     */   public bbq bu;
/*     */   @Nullable
/*     */   private final chg bF;
/*     */   private final bci bG;
/*  94 */   private int bH = 100;
/*     */   private int bI;
/*  96 */   private final cxb[] bJ = new cxb[24];
/*  97 */   private final int[] bK = new int[24];
/*  98 */   private final cwy bL = new cwy();
/*     */   
/*     */   public bbr(aqe<? extends bbr> ☃, brx brx1) {
/* 101 */     super((aqe)aqe.t, brx1);
/*     */     
/* 103 */     this.bo = new bbp(this, "head", 1.0F, 1.0F);
/* 104 */     this.by = new bbp(this, "neck", 3.0F, 3.0F);
/* 105 */     this.bz = new bbp(this, "body", 5.0F, 3.0F);
/* 106 */     this.bA = new bbp(this, "tail", 2.0F, 2.0F);
/* 107 */     this.bB = new bbp(this, "tail", 2.0F, 2.0F);
/* 108 */     this.bC = new bbp(this, "tail", 2.0F, 2.0F);
/* 109 */     this.bD = new bbp(this, "wing", 4.0F, 2.0F);
/* 110 */     this.bE = new bbp(this, "wing", 4.0F, 2.0F);
/*     */     
/* 112 */     this.bx = new bbp[] { this.bo, this.by, this.bz, this.bA, this.bB, this.bC, this.bD, this.bE };
/*     */     
/* 114 */     c(dx());
/*     */     
/* 116 */     this.H = true;
/*     */     
/* 118 */     this.Y = true;
/*     */     
/* 120 */     if (brx1 instanceof aag) {
/* 121 */       this.bF = ((aag)brx1).D();
/*     */     } else {
/* 123 */       this.bF = null;
/*     */     } 
/*     */     
/* 126 */     this.bG = new bci(this);
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/* 130 */     return aqn.p()
/* 131 */       .a(arl.a, 200.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 136 */     super.e();
/* 137 */     ab().a(b, Integer.valueOf(bch.k.b()));
/*     */   }
/*     */   
/*     */   public double[] a(int ☃, float f) {
/* 141 */     if (dl()) {
/* 142 */       f = 0.0F;
/*     */     }
/*     */     
/* 145 */     f = 1.0F - f;
/*     */     
/* 147 */     int i = this.d - ☃ & 0x3F;
/* 148 */     int j = this.d - ☃ - 1 & 0x3F;
/* 149 */     double[] arrayOfDouble = new double[3];
/* 150 */     double d1 = this.c[i][0];
/* 151 */     double d2 = afm.g(this.c[j][0] - d1);
/* 152 */     arrayOfDouble[0] = d1 + d2 * f;
/*     */     
/* 154 */     d1 = this.c[i][1];
/* 155 */     d2 = this.c[j][1] - d1;
/*     */     
/* 157 */     arrayOfDouble[1] = d1 + d2 * f;
/* 158 */     arrayOfDouble[2] = afm.d(f, this.c[i][2], this.c[j][2]);
/* 159 */     return arrayOfDouble;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 164 */     if (this.l.v) {
/* 165 */       c(dk());
/*     */       
/* 167 */       if (!aA()) {
/* 168 */         float f11 = afm.b(this.bq * 6.2831855F);
/* 169 */         float f12 = afm.b(this.bp * 6.2831855F);
/*     */         
/* 171 */         if (f12 <= -0.3F && f11 >= -0.3F) {
/* 172 */           this.l.a(cD(), cE(), cH(), adq.ds, cu(), 5.0F, 0.8F + this.J.nextFloat() * 0.3F, false);
/*     */         }
/*     */         
/* 175 */         if (!this.bG.a().a() && --this.bH < 0) {
/* 176 */           this.l.a(cD(), cE(), cH(), adq.dt, cu(), 2.5F, 0.8F + this.J.nextFloat() * 0.3F, false);
/* 177 */           this.bH = 200 + this.J.nextInt(200);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 182 */     this.bp = this.bq;
/*     */     
/* 184 */     if (dl()) {
/* 185 */       float f11 = (this.J.nextFloat() - 0.5F) * 8.0F;
/* 186 */       float f12 = (this.J.nextFloat() - 0.5F) * 4.0F;
/* 187 */       float f13 = (this.J.nextFloat() - 0.5F) * 8.0F;
/* 188 */       this.l.a(hh.w, cD() + f11, cE() + 2.0D + f12, cH() + f13, 0.0D, 0.0D, 0.0D);
/*     */       
/*     */       return;
/*     */     } 
/* 192 */     eN();
/*     */     
/* 194 */     dcn ☃ = cC();
/* 195 */     float f1 = 0.2F / (afm.a(c(☃)) * 10.0F + 1.0F);
/* 196 */     f1 *= (float)Math.pow(2.0D, ☃.c);
/* 197 */     if (this.bG.a().a()) {
/* 198 */       this.bq += 0.1F;
/* 199 */     } else if (this.br) {
/* 200 */       this.bq += f1 * 0.5F;
/*     */     } else {
/* 202 */       this.bq += f1;
/*     */     } 
/*     */     
/* 205 */     this.p = afm.g(this.p);
/*     */     
/* 207 */     if (eD()) {
/* 208 */       this.bq = 0.5F;
/*     */       
/*     */       return;
/*     */     } 
/* 212 */     if (this.d < 0) {
/* 213 */       for (int k = 0; k < this.c.length; k++) {
/* 214 */         this.c[k][0] = this.p;
/* 215 */         this.c[k][1] = cE();
/*     */       } 
/*     */     }
/*     */     
/* 219 */     if (++this.d == this.c.length) {
/* 220 */       this.d = 0;
/*     */     }
/* 222 */     this.c[this.d][0] = this.p;
/* 223 */     this.c[this.d][1] = cE();
/*     */     
/* 225 */     if (this.l.v) {
/* 226 */       if (this.aU > 0) {
/* 227 */         double d1 = cD() + (this.aV - cD()) / this.aU;
/* 228 */         double d2 = cE() + (this.aW - cE()) / this.aU;
/* 229 */         double d3 = cH() + (this.aX - cH()) / this.aU;
/*     */         
/* 231 */         double d4 = afm.g(this.aY - this.p);
/*     */         
/* 233 */         this.p = (float)(this.p + d4 / this.aU);
/* 234 */         this.q = (float)(this.q + (this.aZ - this.q) / this.aU);
/*     */         
/* 236 */         this.aU--;
/* 237 */         d(d1, d2, d3);
/* 238 */         a(this.p, this.q);
/*     */       } 
/*     */       
/* 241 */       this.bG.a().b();
/*     */     } else {
/* 243 */       bcb bcb = this.bG.a();
/* 244 */       bcb.c();
/*     */       
/* 246 */       if (this.bG.a() != bcb) {
/* 247 */         bcb = this.bG.a();
/* 248 */         bcb.c();
/*     */       } 
/*     */       
/* 251 */       dcn dcn = bcb.g();
/*     */       
/* 253 */       if (dcn != null) {
/* 254 */         double d1 = dcn.b - cD();
/* 255 */         double d2 = dcn.c - cE();
/* 256 */         double d3 = dcn.d - cH();
/*     */         
/* 258 */         double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 259 */         float f11 = bcb.f();
/* 260 */         double d5 = afm.a(d1 * d1 + d3 * d3);
/* 261 */         if (d5 > 0.0D) {
/* 262 */           d2 = afm.a(d2 / d5, -f11, f11);
/*     */         }
/* 264 */         f(cC().b(0.0D, d2 * 0.01D, 0.0D));
/* 265 */         this.p = afm.g(this.p);
/*     */         
/* 267 */         double d6 = afm.a(afm.g(180.0D - afm.d(d1, d3) * 57.2957763671875D - this.p), -50.0D, 50.0D);
/* 268 */         dcn dcn1 = dcn.a(cD(), cE(), cH()).d();
/* 269 */         dcn dcn2 = (new dcn(afm.a(this.p * 0.017453292F), (cC()).c, -afm.b(this.p * 0.017453292F))).d();
/* 270 */         float f12 = Math.max(((float)dcn2.b(dcn1) + 0.5F) / 1.5F, 0.0F);
/*     */         
/* 272 */         this.bt *= 0.8F;
/* 273 */         this.bt = (float)(this.bt + d6 * bcb.h());
/* 274 */         this.p += this.bt * 0.1F;
/*     */         
/* 276 */         float f13 = (float)(2.0D / (d4 + 1.0D));
/* 277 */         float f14 = 0.06F;
/* 278 */         a(0.06F * (f12 * f13 + 1.0F - f13), new dcn(0.0D, 0.0D, -1.0D));
/* 279 */         if (this.br) {
/* 280 */           a(aqr.a, cC().a(0.800000011920929D));
/*     */         } else {
/* 282 */           a(aqr.a, cC());
/*     */         } 
/*     */         
/* 285 */         dcn dcn3 = cC().d();
/* 286 */         double d7 = 0.8D + 0.15D * (dcn3.b(dcn2) + 1.0D) / 2.0D;
/*     */         
/* 288 */         f(cC().d(d7, 0.9100000262260437D, d7));
/*     */       } 
/*     */     } 
/*     */     
/* 292 */     this.aA = this.p;
/*     */     
/* 294 */     dcn[] arrayOfDcn = new dcn[this.bx.length];
/* 295 */     for (int i = 0; i < this.bx.length; i++) {
/* 296 */       arrayOfDcn[i] = new dcn(this.bx[i].cD(), this.bx[i].cE(), this.bx[i].cH());
/*     */     }
/*     */     
/* 299 */     float f2 = (float)(a(5, 1.0F)[1] - a(10, 1.0F)[1]) * 10.0F * 0.017453292F;
/* 300 */     float f3 = afm.b(f2);
/* 301 */     float f4 = afm.a(f2);
/*     */     
/* 303 */     float f5 = this.p * 0.017453292F;
/* 304 */     float f6 = afm.a(f5);
/* 305 */     float f7 = afm.b(f5);
/*     */     
/* 307 */     a(this.bz, (f6 * 0.5F), 0.0D, (-f7 * 0.5F));
/* 308 */     a(this.bD, (f7 * 4.5F), 2.0D, (f6 * 4.5F));
/* 309 */     a(this.bE, (f7 * -4.5F), 2.0D, (f6 * -4.5F));
/*     */     
/* 311 */     if (!this.l.v && this.an == 0) {
/* 312 */       a(this.l.a(this, this.bD.cc().c(4.0D, 2.0D, 4.0D).d(0.0D, -2.0D, 0.0D), aqd.e));
/* 313 */       a(this.l.a(this, this.bE.cc().c(4.0D, 2.0D, 4.0D).d(0.0D, -2.0D, 0.0D), aqd.e));
/* 314 */       b(this.l.a(this, this.bo.cc().g(1.0D), aqd.e));
/* 315 */       b(this.l.a(this, this.by.cc().g(1.0D), aqd.e));
/*     */     } 
/*     */     
/* 318 */     float f8 = afm.a(this.p * 0.017453292F - this.bt * 0.01F);
/* 319 */     float f9 = afm.b(this.p * 0.017453292F - this.bt * 0.01F);
/* 320 */     float f10 = eM();
/* 321 */     a(this.bo, (f8 * 6.5F * f3), (f10 + f4 * 6.5F), (-f9 * 6.5F * f3));
/* 322 */     a(this.by, (f8 * 5.5F * f3), (f10 + f4 * 5.5F), (-f9 * 5.5F * f3));
/*     */ 
/*     */     
/* 325 */     double[] arrayOfDouble = a(5, 1.0F); int j;
/* 326 */     for (j = 0; j < 3; j++) {
/* 327 */       bbp bbp1 = null;
/*     */       
/* 329 */       if (j == 0) {
/* 330 */         bbp1 = this.bA;
/*     */       }
/* 332 */       if (j == 1) {
/* 333 */         bbp1 = this.bB;
/*     */       }
/* 335 */       if (j == 2) {
/* 336 */         bbp1 = this.bC;
/*     */       }
/*     */       
/* 339 */       double[] arrayOfDouble1 = a(12 + j * 2, 1.0F);
/*     */       
/* 341 */       float f11 = this.p * 0.017453292F + i(arrayOfDouble1[0] - arrayOfDouble[0]) * 0.017453292F;
/* 342 */       float f12 = afm.a(f11);
/* 343 */       float f13 = afm.b(f11);
/*     */       
/* 345 */       float f14 = 1.5F;
/* 346 */       float f15 = (j + 1) * 2.0F;
/* 347 */       a(bbp1, (-(f6 * 1.5F + f12 * f15) * f3), arrayOfDouble1[1] - arrayOfDouble[1] - ((f15 + 1.5F) * f4) + 1.5D, ((f7 * 1.5F + f13 * f15) * f3));
/*     */     } 
/*     */     
/* 350 */     if (!this.l.v) {
/*     */       
/* 352 */       this.br = b(this.bo.cc()) | b(this.by.cc()) | b(this.bz.cc());
/*     */       
/* 354 */       if (this.bF != null) {
/* 355 */         this.bF.b(this);
/*     */       }
/*     */     } 
/* 358 */     for (j = 0; j < this.bx.length; j++) {
/* 359 */       (this.bx[j]).m = (arrayOfDcn[j]).b;
/* 360 */       (this.bx[j]).n = (arrayOfDcn[j]).c;
/* 361 */       (this.bx[j]).o = (arrayOfDcn[j]).d;
/* 362 */       (this.bx[j]).D = (arrayOfDcn[j]).b;
/* 363 */       (this.bx[j]).E = (arrayOfDcn[j]).c;
/* 364 */       (this.bx[j]).F = (arrayOfDcn[j]).d;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bbp ☃, double d1, double d2, double d3) {
/* 369 */     ☃.d(cD() + d1, cE() + d2, cH() + d3);
/*     */   }
/*     */   
/*     */   private float eM() {
/* 373 */     if (this.bG.a().a()) {
/* 374 */       return -1.0F;
/*     */     }
/* 376 */     double[] ☃ = a(5, 1.0F);
/* 377 */     double[] arrayOfDouble1 = a(0, 1.0F);
/* 378 */     return (float)(☃[1] - arrayOfDouble1[1]);
/*     */   }
/*     */   
/*     */   private void eN() {
/* 382 */     if (this.bu != null) {
/* 383 */       if (this.bu.y) {
/* 384 */         this.bu = null;
/* 385 */       } else if (this.K % 10 == 0 && 
/* 386 */         dk() < dx()) {
/* 387 */         c(dk() + 1.0F);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 392 */     if (this.J.nextInt(10) == 0) {
/* 393 */       List<bbq> ☃ = this.l.a(bbq.class, cc().g(32.0D));
/*     */       
/* 395 */       bbq bbq1 = null;
/* 396 */       double d = Double.MAX_VALUE;
/* 397 */       for (bbq bbq2 : ☃) {
/* 398 */         double d1 = bbq2.h(this);
/* 399 */         if (d1 < d) {
/* 400 */           d = d1;
/* 401 */           bbq1 = bbq2;
/*     */         } 
/*     */       } 
/*     */       
/* 405 */       this.bu = bbq1;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(List<aqa> ☃) {
/* 410 */     double d1 = ((this.bz.cc()).a + (this.bz.cc()).d) / 2.0D;
/* 411 */     double d2 = ((this.bz.cc()).c + (this.bz.cc()).f) / 2.0D;
/*     */     
/* 413 */     for (aqa aqa : ☃) {
/* 414 */       if (aqa instanceof aqm) {
/* 415 */         double d3 = aqa.cD() - d1;
/* 416 */         double d4 = aqa.cH() - d2;
/* 417 */         double d5 = Math.max(d3 * d3 + d4 * d4, 0.1D);
/* 418 */         aqa.i(d3 / d5 * 4.0D, 0.20000000298023224D, d4 / d5 * 4.0D);
/* 419 */         if (!this.bG.a().a() && ((aqm)aqa).da() < aqa.K - 2) {
/* 420 */           aqa.a(apk.c(this), 5.0F);
/* 421 */           a(this, aqa);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(List<aqa> ☃) {
/* 428 */     for (aqa aqa : ☃) {
/* 429 */       if (aqa instanceof aqm) {
/* 430 */         aqa.a(apk.c(this), 10.0F);
/* 431 */         a(this, aqa);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private float i(double ☃) {
/* 437 */     return (float)afm.g(☃);
/*     */   }
/*     */   
/*     */   private boolean b(dci ☃) {
/* 441 */     int i = afm.c(☃.a);
/* 442 */     int j = afm.c(☃.b);
/* 443 */     int k = afm.c(☃.c);
/* 444 */     int m = afm.c(☃.d);
/* 445 */     int n = afm.c(☃.e);
/* 446 */     int i1 = afm.c(☃.f);
/* 447 */     boolean bool1 = false;
/* 448 */     boolean bool2 = false;
/* 449 */     for (int i2 = i; i2 <= m; i2++) {
/* 450 */       for (int i3 = j; i3 <= n; i3++) {
/* 451 */         for (int i4 = k; i4 <= i1; i4++) {
/* 452 */           fx fx = new fx(i2, i3, i4);
/* 453 */           ceh ceh = this.l.d_(fx);
/* 454 */           buo buo = ceh.b();
/* 455 */           if (!ceh.g() && ceh.c() != cva.n)
/*     */           {
/* 457 */             if (!this.l.V().b(brt.b) || aed.ag.a(buo)) {
/* 458 */               bool1 = true;
/*     */             } else {
/* 460 */               bool2 = (this.l.a(fx, false) || bool2);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 466 */     if (bool2) {
/*     */ 
/*     */ 
/*     */       
/* 470 */       fx fx = new fx(i + this.J.nextInt(m - i + 1), j + this.J.nextInt(n - j + 1), k + this.J.nextInt(i1 - k + 1));
/*     */       
/* 472 */       this.l.c(2008, fx, 0);
/*     */     } 
/*     */     
/* 475 */     return bool1;
/*     */   }
/*     */   
/*     */   public boolean a(bbp ☃, apk apk1, float f) {
/* 479 */     if (this.bG.a().i() == bch.j) {
/* 480 */       return false;
/*     */     }
/*     */     
/* 483 */     f = this.bG.a().a(apk1, f);
/*     */     
/* 485 */     if (☃ != this.bo) {
/* 486 */       f = f / 4.0F + Math.min(f, 1.0F);
/*     */     }
/*     */     
/* 489 */     if (f < 0.01F) {
/* 490 */       return false;
/*     */     }
/*     */     
/* 493 */     if (apk1.k() instanceof bfw || apk1.d()) {
/* 494 */       float f1 = dk();
/* 495 */       f(apk1, f);
/*     */       
/* 497 */       if (dl() && !this.bG.a().a()) {
/* 498 */         c(1.0F);
/* 499 */         this.bG.a(bch.j);
/*     */       } 
/*     */       
/* 502 */       if (this.bG.a().a()) {
/* 503 */         this.bI = (int)(this.bI + f1 - dk());
/*     */         
/* 505 */         if (this.bI > 0.25F * dx()) {
/* 506 */           this.bI = 0;
/* 507 */           this.bG.a(bch.e);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 512 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 517 */     if (☃ instanceof apl && ((apl)☃).y()) {
/* 518 */       a(this.bz, ☃, f);
/*     */     }
/* 520 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean f(apk ☃, float f) {
/* 524 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void aa() {
/* 529 */     ad();
/*     */     
/* 531 */     if (this.bF != null) {
/* 532 */       this.bF.b(this);
/* 533 */       this.bF.a(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void cU() {
/* 539 */     if (this.bF != null) {
/* 540 */       this.bF.b(this);
/*     */     }
/*     */     
/* 543 */     this.bs++;
/* 544 */     if (this.bs >= 180 && this.bs <= 200) {
/* 545 */       float f1 = (this.J.nextFloat() - 0.5F) * 8.0F;
/* 546 */       float f2 = (this.J.nextFloat() - 0.5F) * 4.0F;
/* 547 */       float f3 = (this.J.nextFloat() - 0.5F) * 8.0F;
/* 548 */       this.l.a(hh.v, cD() + f1, cE() + 2.0D + f2, cH() + f3, 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */     
/* 551 */     boolean ☃ = this.l.V().b(brt.e);
/* 552 */     int i = 500;
/* 553 */     if (this.bF != null && !this.bF.d()) {
/* 554 */       i = 12000;
/*     */     }
/*     */     
/* 557 */     if (!this.l.v) {
/* 558 */       if (this.bs > 150 && this.bs % 5 == 0 && ☃) {
/* 559 */         a(afm.d(i * 0.08F));
/*     */       }
/* 561 */       if (this.bs == 1 && !aA()) {
/* 562 */         this.l.b(1028, cB(), 0);
/*     */       }
/*     */     } 
/* 565 */     a(aqr.a, new dcn(0.0D, 0.10000000149011612D, 0.0D));
/* 566 */     this.p += 20.0F;
/* 567 */     this.aA = this.p;
/*     */     
/* 569 */     if (this.bs == 200 && !this.l.v) {
/* 570 */       if (☃) {
/* 571 */         a(afm.d(i * 0.2F));
/*     */       }
/* 573 */       if (this.bF != null) {
/* 574 */         this.bF.a(this);
/*     */       }
/* 576 */       ad();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 581 */     while (☃ > 0) {
/* 582 */       int i = aqg.a(☃);
/* 583 */       ☃ -= i;
/* 584 */       this.l.c(new aqg(this.l, cD(), cE(), cH(), i));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int eI() {
/* 590 */     if (this.bJ[0] == null) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 596 */       for (int ☃ = 0; ☃ < 24; ☃++) {
/* 597 */         int k, m, i = 5;
/* 598 */         int j = ☃;
/*     */ 
/*     */ 
/*     */         
/* 602 */         if (☃ < 12) {
/* 603 */           k = afm.d(60.0F * afm.b(2.0F * (-3.1415927F + 0.2617994F * j)));
/* 604 */           m = afm.d(60.0F * afm.a(2.0F * (-3.1415927F + 0.2617994F * j)));
/* 605 */         } else if (☃ < 20) {
/* 606 */           j -= 12;
/* 607 */           k = afm.d(40.0F * afm.b(2.0F * (-3.1415927F + 0.3926991F * j)));
/* 608 */           m = afm.d(40.0F * afm.a(2.0F * (-3.1415927F + 0.3926991F * j)));
/* 609 */           i += 10;
/*     */         } else {
/* 611 */           j -= 20;
/* 612 */           k = afm.d(20.0F * afm.b(2.0F * (-3.1415927F + 0.7853982F * j)));
/* 613 */           m = afm.d(20.0F * afm.a(2.0F * (-3.1415927F + 0.7853982F * j)));
/*     */         } 
/*     */ 
/*     */         
/* 617 */         int n = Math.max(this.l.t_() + 10, this.l.a(chn.a.f, new fx(k, 0, m)).v() + i);
/*     */         
/* 619 */         this.bJ[☃] = new cxb(k, n, m);
/*     */       } 
/*     */       
/* 622 */       this.bK[0] = 6146;
/* 623 */       this.bK[1] = 8197;
/* 624 */       this.bK[2] = 8202;
/* 625 */       this.bK[3] = 16404;
/* 626 */       this.bK[4] = 32808;
/* 627 */       this.bK[5] = 32848;
/* 628 */       this.bK[6] = 65696;
/* 629 */       this.bK[7] = 131392;
/* 630 */       this.bK[8] = 131712;
/* 631 */       this.bK[9] = 263424;
/* 632 */       this.bK[10] = 526848;
/* 633 */       this.bK[11] = 525313;
/*     */       
/* 635 */       this.bK[12] = 1581057;
/* 636 */       this.bK[13] = 3166214;
/* 637 */       this.bK[14] = 2138120;
/* 638 */       this.bK[15] = 6373424;
/* 639 */       this.bK[16] = 4358208;
/* 640 */       this.bK[17] = 12910976;
/* 641 */       this.bK[18] = 9044480;
/* 642 */       this.bK[19] = 9706496;
/*     */       
/* 644 */       this.bK[20] = 15216640;
/* 645 */       this.bK[21] = 13688832;
/* 646 */       this.bK[22] = 11763712;
/* 647 */       this.bK[23] = 8257536;
/*     */     } 
/*     */     
/* 650 */     return p(cD(), cE(), cH());
/*     */   }
/*     */   
/*     */   public int p(double ☃, double d1, double d2) {
/* 654 */     float f = 10000.0F;
/* 655 */     int i = 0;
/* 656 */     cxb cxb1 = new cxb(afm.c(☃), afm.c(d1), afm.c(d2));
/* 657 */     int j = 0;
/*     */     
/* 659 */     if (this.bF == null || this.bF.c() == 0)
/*     */     {
/* 661 */       j = 12;
/*     */     }
/*     */     
/* 664 */     for (int k = j; k < 24; k++) {
/* 665 */       if (this.bJ[k] != null) {
/* 666 */         float f1 = this.bJ[k].b(cxb1);
/* 667 */         if (f1 < f) {
/* 668 */           f = f1;
/* 669 */           i = k;
/*     */         } 
/*     */       } 
/*     */     } 
/* 673 */     return i;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cxd a(int ☃, int i, @Nullable cxb cxb1) {
/* 678 */     for (int j = 0; j < 24; j++) {
/* 679 */       cxb cxb5 = this.bJ[j];
/* 680 */       cxb5.i = false;
/* 681 */       cxb5.g = 0.0F;
/* 682 */       cxb5.e = 0.0F;
/* 683 */       cxb5.f = 0.0F;
/* 684 */       cxb5.h = null;
/* 685 */       cxb5.d = -1;
/*     */     } 
/*     */     
/* 688 */     cxb cxb2 = this.bJ[☃];
/* 689 */     cxb cxb3 = this.bJ[i];
/*     */     
/* 691 */     cxb2.e = 0.0F;
/* 692 */     cxb2.f = cxb2.a(cxb3);
/* 693 */     cxb2.g = cxb2.f;
/*     */     
/* 695 */     this.bL.a();
/* 696 */     this.bL.a(cxb2);
/*     */     
/* 698 */     cxb cxb4 = cxb2;
/*     */     
/* 700 */     int k = 0;
/* 701 */     if (this.bF == null || this.bF.c() == 0)
/*     */     {
/* 703 */       k = 12;
/*     */     }
/*     */     
/* 706 */     while (!this.bL.e()) {
/* 707 */       cxb cxb5 = this.bL.c();
/*     */       
/* 709 */       if (cxb5.equals(cxb3)) {
/* 710 */         if (cxb1 != null) {
/* 711 */           cxb1.h = cxb3;
/* 712 */           cxb3 = cxb1;
/*     */         } 
/* 714 */         return a(cxb2, cxb3);
/*     */       } 
/*     */       
/* 717 */       if (cxb5.a(cxb3) < cxb4.a(cxb3)) {
/* 718 */         cxb4 = cxb5;
/*     */       }
/* 720 */       cxb5.i = true;
/*     */       
/* 722 */       int m = 0; int n;
/* 723 */       for (n = 0; n < 24; n++) {
/* 724 */         if (this.bJ[n] == cxb5) {
/* 725 */           m = n;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/* 730 */       for (n = k; n < 24; n++) {
/* 731 */         if ((this.bK[m] & 1 << n) > 0) {
/* 732 */           cxb cxb6 = this.bJ[n];
/*     */           
/* 734 */           if (!cxb6.i) {
/*     */ 
/*     */ 
/*     */             
/* 738 */             float f = cxb5.e + cxb5.a(cxb6);
/* 739 */             if (!cxb6.c() || f < cxb6.e) {
/* 740 */               cxb6.h = cxb5;
/* 741 */               cxb6.e = f;
/* 742 */               cxb6.f = cxb6.a(cxb3);
/* 743 */               if (cxb6.c()) {
/* 744 */                 this.bL.a(cxb6, cxb6.e + cxb6.f);
/*     */               } else {
/* 746 */                 cxb6.g = cxb6.e + cxb6.f;
/* 747 */                 this.bL.a(cxb6);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 754 */     if (cxb4 == cxb2) {
/* 755 */       return null;
/*     */     }
/* 757 */     bv.debug("Failed to find path from {} to {}", Integer.valueOf(☃), Integer.valueOf(i));
/* 758 */     if (cxb1 != null) {
/* 759 */       cxb1.h = cxb4;
/* 760 */       cxb4 = cxb1;
/*     */     } 
/* 762 */     return a(cxb2, cxb4);
/*     */   }
/*     */   
/*     */   private cxd a(cxb ☃, cxb cxb1) {
/* 766 */     List<cxb> list = Lists.newArrayList();
/* 767 */     cxb cxb2 = cxb1;
/* 768 */     list.add(0, cxb2);
/* 769 */     while (cxb2.h != null) {
/* 770 */       cxb2 = cxb2.h;
/* 771 */       list.add(0, cxb2);
/*     */     } 
/* 773 */     return new cxd(list, new fx(cxb1.a, cxb1.b, cxb1.c), true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 778 */     super.b(☃);
/* 779 */     ☃.b("DragonPhase", this.bG.a().i().b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 784 */     super.a(☃);
/* 785 */     if (☃.e("DragonPhase")) {
/* 786 */       this.bG.a(bch.a(☃.h("DragonPhase")));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void cI() {}
/*     */ 
/*     */   
/*     */   public bbp[] eJ() {
/* 795 */     return this.bx;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/* 800 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public adr cu() {
/* 805 */     return adr.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 810 */     return adq.dp;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 815 */     return adq.du;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dG() {
/* 820 */     return 5.0F;
/*     */   }
/*     */   public float a(int ☃, double[] arrayOfDouble1, double[] arrayOfDouble2) {
/*     */     double d;
/* 824 */     bcb bcb = this.bG.a();
/* 825 */     bch<? extends bcb> bch = bcb.i();
/*     */ 
/*     */     
/* 828 */     if (bch == bch.d || bch == bch.e) {
/* 829 */       fx fx = this.l.a(chn.a.f, cjk.a);
/* 830 */       float f = Math.max(afm.a(fx.a(cA(), true)) / 4.0F, 1.0F);
/* 831 */       d = (☃ / f);
/* 832 */     } else if (bcb.a()) {
/* 833 */       d = ☃;
/*     */     }
/* 835 */     else if (☃ == 6) {
/* 836 */       d = 0.0D;
/*     */     } else {
/* 838 */       d = arrayOfDouble2[1] - arrayOfDouble1[1];
/*     */     } 
/*     */ 
/*     */     
/* 842 */     return (float)d;
/*     */   }
/*     */   public dcn x(float ☃) {
/*     */     dcn dcn;
/* 846 */     bcb bcb = this.bG.a();
/* 847 */     bch<? extends bcb> bch = bcb.i();
/*     */ 
/*     */     
/* 850 */     if (bch == bch.d || bch == bch.e) {
/* 851 */       fx fx = this.l.a(chn.a.f, cjk.a);
/* 852 */       float f1 = Math.max(afm.a(fx.a(cA(), true)) / 4.0F, 1.0F);
/* 853 */       float f2 = 6.0F / f1;
/*     */       
/* 855 */       float f3 = this.q;
/* 856 */       float f4 = 1.5F;
/* 857 */       this.q = -f2 * 1.5F * 5.0F;
/*     */       
/* 859 */       dcn = f(☃);
/* 860 */       this.q = f3;
/* 861 */     } else if (bcb.a()) {
/* 862 */       float f1 = this.q;
/* 863 */       float f2 = 1.5F;
/* 864 */       this.q = -45.0F;
/*     */       
/* 866 */       dcn = f(☃);
/* 867 */       this.q = f1;
/*     */     } else {
/* 869 */       dcn = f(☃);
/*     */     } 
/*     */     
/* 872 */     return dcn;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bbq ☃, fx fx1, apk apk1) {
/*     */     bfw bfw;
/* 878 */     if (apk1.k() instanceof bfw) {
/* 879 */       bfw = (bfw)apk1.k();
/*     */     } else {
/* 881 */       bfw = this.l.a(bw, fx1.u(), fx1.v(), fx1.w());
/*     */     } 
/*     */     
/* 884 */     if (☃ == this.bu) {
/* 885 */       a(this.bo, apk.d(bfw), 10.0F);
/*     */     }
/*     */     
/* 888 */     this.bG.a().a(☃, fx1, apk1, bfw);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 893 */     if (b.equals(☃) && this.l.v) {
/* 894 */       this.bG.a(bch.a(((Integer)ab().<Integer>a(b)).intValue()));
/*     */     }
/*     */     
/* 897 */     super.a(☃);
/*     */   }
/*     */   
/*     */   public bci eK() {
/* 901 */     return this.bG;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public chg eL() {
/* 906 */     return this.bF;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(apu ☃) {
/* 911 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean n(aqa ☃) {
/* 916 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bO() {
/* 921 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.List;
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
/*     */ public class bhn
/*     */   extends aqa
/*     */ {
/*  52 */   private static final us<Integer> b = uv.a((Class)bhn.class, uu.b);
/*  53 */   private static final us<Integer> c = uv.a((Class)bhn.class, uu.b);
/*  54 */   private static final us<Float> d = uv.a((Class)bhn.class, uu.c);
/*  55 */   private static final us<Integer> e = uv.a((Class)bhn.class, uu.b);
/*  56 */   private static final us<Boolean> f = uv.a((Class)bhn.class, uu.i);
/*  57 */   private static final us<Boolean> g = uv.a((Class)bhn.class, uu.i);
/*  58 */   private static final us<Integer> ag = uv.a((Class)bhn.class, uu.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   private final float[] ah = new float[2];
/*     */   
/*     */   private float ai;
/*     */   
/*     */   private float aj;
/*     */   private float ak;
/*     */   private int al;
/*     */   private double am;
/*     */   private double an;
/*     */   private double ao;
/*     */   private double ap;
/*     */   private double aq;
/*     */   private boolean ar;
/*     */   private boolean as;
/*     */   private boolean at;
/*     */   private boolean au;
/*     */   private double av;
/*     */   private float aw;
/*     */   private a ax;
/*     */   private a ay;
/*     */   private double az;
/*     */   private boolean aA;
/*     */   private boolean aB;
/*     */   private float aC;
/*     */   private float aD;
/*     */   private float aE;
/*     */   
/*     */   public bhn(aqe<? extends bhn> ☃, brx brx1) {
/*  94 */     super(☃, brx1);
/*  95 */     this.i = true;
/*     */   }
/*     */   
/*     */   public bhn(brx ☃, double d1, double d2, double d3) {
/*  99 */     this(aqe.g, ☃);
/* 100 */     d(d1, d2, d3);
/*     */     
/* 102 */     f(dcn.a);
/*     */     
/* 104 */     this.m = d1;
/* 105 */     this.n = d2;
/* 106 */     this.o = d3;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float a(aqx ☃, aqb aqb1) {
/* 111 */     return aqb1.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/* 116 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 121 */     this.R.a(b, Integer.valueOf(0));
/* 122 */     this.R.a(c, Integer.valueOf(1));
/* 123 */     this.R.a(d, Float.valueOf(0.0F));
/* 124 */     this.R.a(e, Integer.valueOf(b.a.ordinal()));
/* 125 */     this.R.a(f, Boolean.valueOf(false));
/* 126 */     this.R.a(g, Boolean.valueOf(false));
/* 127 */     this.R.a(ag, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j(aqa ☃) {
/* 132 */     return a(this, ☃);
/*     */   }
/*     */   
/*     */   public static boolean a(aqa ☃, aqa aqa1) {
/* 136 */     return ((aqa1.aZ() || aqa1.aU()) && !☃.x(aqa1));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aZ() {
/* 141 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aU() {
/* 146 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected dcn a(gc.a ☃, i.a a1) {
/* 151 */     return aqm.h(super.a(☃, a1));
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/* 156 */     return -0.1D;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 161 */     if (b(☃)) {
/* 162 */       return false;
/*     */     }
/* 164 */     if (this.l.v || this.y) {
/* 165 */       return true;
/*     */     }
/* 167 */     c(-o());
/* 168 */     b(10);
/* 169 */     a(m() + f * 10.0F);
/* 170 */     aS();
/* 171 */     boolean bool = (☃.k() instanceof bfw && ((bfw)☃.k()).bC.d);
/* 172 */     if (bool || m() > 40.0F) {
/* 173 */       if (!bool && this.l.V().b(brt.g)) {
/* 174 */         a(g());
/*     */       }
/* 176 */       ad();
/*     */     } 
/* 178 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(boolean ☃) {
/* 183 */     if (!this.l.v) {
/* 184 */       this.aA = true;
/* 185 */       this.aB = ☃;
/* 186 */       if (z() == 0) {
/* 187 */         d(60);
/*     */       }
/*     */     } 
/*     */     
/* 191 */     this.l.a(hh.Z, cD() + this.J.nextFloat(), cE() + 0.7D, cH() + this.J.nextFloat(), 0.0D, 0.0D, 0.0D);
/* 192 */     if (this.J.nextInt(20) == 0) {
/* 193 */       this.l.a(cD(), cE(), cH(), aw(), cu(), 1.0F, 0.8F + 0.4F * this.J.nextFloat(), false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void i(aqa ☃) {
/* 199 */     if (☃ instanceof bhn) {
/* 200 */       if ((☃.cc()).b < (cc()).e) {
/* 201 */         super.i(☃);
/*     */       }
/* 203 */     } else if ((☃.cc()).b <= (cc()).b) {
/* 204 */       super.i(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public blx g() {
/* 209 */     switch (null.a[p().ordinal()])
/*     */     
/*     */     { default:
/* 212 */         return bmd.lR;
/*     */       case 2:
/* 214 */         return bmd.qp;
/*     */       case 3:
/* 216 */         return bmd.qq;
/*     */       case 4:
/* 218 */         return bmd.qr;
/*     */       case 5:
/* 220 */         return bmd.qs;
/*     */       case 6:
/* 222 */         break; }  return bmd.qt;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void bm() {
/* 228 */     c(-o());
/* 229 */     b(10);
/* 230 */     a(m() * 11.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/* 235 */     return !this.y;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1, double d2, float f1, float f2, int i, boolean bool) {
/* 240 */     this.am = ☃;
/* 241 */     this.an = d1;
/* 242 */     this.ao = d2;
/* 243 */     this.ap = f1;
/* 244 */     this.aq = f2;
/* 245 */     this.al = 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public gc ca() {
/* 250 */     return bZ().g();
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 255 */     this.ay = this.ax;
/* 256 */     this.ax = s();
/*     */     
/* 258 */     if (this.ax == a.b || this.ax == a.c) {
/* 259 */       this.aj++;
/*     */     } else {
/* 261 */       this.aj = 0.0F;
/*     */     } 
/*     */     
/* 264 */     if (!this.l.v && this.aj >= 60.0F) {
/* 265 */       be();
/*     */     }
/*     */     
/* 268 */     if (n() > 0) {
/* 269 */       b(n() - 1);
/*     */     }
/* 271 */     if (m() > 0.0F) {
/* 272 */       a(m() - 1.0F);
/*     */     }
/*     */     
/* 275 */     super.j();
/* 276 */     r();
/*     */     
/* 278 */     if (cs()) {
/* 279 */       if (cn().isEmpty() || !(cn().get(0) instanceof bfw)) {
/* 280 */         a(false, false);
/*     */       }
/*     */       
/* 283 */       v();
/* 284 */       if (this.l.v) {
/* 285 */         x();
/* 286 */         this.l.a(new sv(a(0), a(1)));
/*     */       } 
/* 288 */       a(aqr.a, cC());
/*     */     } else {
/* 290 */       f(dcn.a);
/*     */     } 
/*     */     
/* 293 */     q();
/*     */     
/* 295 */     for (int i = 0; i <= 1; i++) {
/* 296 */       if (a(i)) {
/* 297 */         if (!aA() && (this.ah[i] % 6.2831855F) <= 0.7853981852531433D && (this.ah[i] + 0.39269909262657166D) % 6.2831854820251465D >= 0.7853981852531433D) {
/* 298 */           adp adp = h();
/* 299 */           if (adp != null) {
/* 300 */             dcn dcn = f(1.0F);
/* 301 */             double d1 = (i == 1) ? -dcn.d : dcn.d;
/* 302 */             double d2 = (i == 1) ? dcn.b : -dcn.b;
/*     */             
/* 304 */             this.l.a((bfw)null, cD() + d1, cE(), cH() + d2, adp, cu(), 1.0F, 0.8F + 0.4F * this.J.nextFloat());
/*     */           } 
/*     */         } 
/* 307 */         this.ah[i] = (float)(this.ah[i] + 0.39269909262657166D);
/*     */       } else {
/* 309 */         this.ah[i] = 0.0F;
/*     */       } 
/*     */     } 
/*     */     
/* 313 */     ay();
/*     */     
/* 315 */     List<aqa> ☃ = this.l.a(this, cc().c(0.20000000298023224D, -0.009999999776482582D, 0.20000000298023224D), aqd.a(this));
/*     */     
/* 317 */     if (!☃.isEmpty()) {
/* 318 */       boolean bool = (!this.l.v && !(cm() instanceof bfw));
/* 319 */       for (int j = 0; j < ☃.size(); j++) {
/* 320 */         aqa aqa1 = ☃.get(j);
/* 321 */         if (!aqa1.w(this))
/*     */         {
/*     */ 
/*     */           
/* 325 */           if (bool && 
/* 326 */             cn().size() < 2 && 
/* 327 */             !aqa1.br() && aqa1
/* 328 */             .cy() < cy() && aqa1 instanceof aqm && !(aqa1 instanceof bay) && !(aqa1 instanceof bfw)) {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 333 */             aqa1.m(this);
/*     */           } else {
/* 335 */             i(aqa1);
/*     */           }  } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void q() {
/* 342 */     if (this.l.v) {
/* 343 */       int ☃ = z();
/* 344 */       if (☃ > 0) {
/* 345 */         this.aC += 0.05F;
/*     */       } else {
/* 347 */         this.aC -= 0.1F;
/*     */       } 
/* 349 */       this.aC = afm.a(this.aC, 0.0F, 1.0F);
/*     */       
/* 351 */       this.aE = this.aD;
/* 352 */       this.aD = 10.0F * (float)Math.sin((0.5F * (float)this.l.T())) * this.aC;
/*     */     } else {
/* 354 */       if (!this.aA) {
/* 355 */         d(0);
/*     */       }
/*     */       
/* 358 */       int ☃ = z();
/* 359 */       if (☃ > 0) {
/* 360 */         ☃--;
/* 361 */         d(☃);
/*     */         
/* 363 */         int i = 60 - ☃ - 1;
/* 364 */         if (i > 0 && 
/* 365 */           ☃ == 0) {
/* 366 */           d(0);
/* 367 */           dcn dcn = cC();
/* 368 */           if (this.aB) {
/* 369 */             f(dcn.b(0.0D, -0.7D, 0.0D));
/* 370 */             be();
/*     */           } else {
/* 372 */             n(dcn.b, a((Class)bfw.class) ? 2.7D : 0.6D, dcn.d);
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 377 */         this.aA = false;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected adp h() {
/* 384 */     switch (null.b[s().ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/*     */       case 3:
/* 388 */         return adq.aR;
/*     */       case 4:
/* 390 */         return adq.aQ;
/*     */     } 
/*     */     
/* 393 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private void r() {
/* 398 */     if (cs()) {
/* 399 */       this.al = 0;
/* 400 */       c(cD(), cE(), cH());
/*     */     } 
/* 402 */     if (this.al <= 0) {
/*     */       return;
/*     */     }
/*     */     
/* 406 */     double ☃ = cD() + (this.am - cD()) / this.al;
/* 407 */     double d1 = cE() + (this.an - cE()) / this.al;
/* 408 */     double d2 = cH() + (this.ao - cH()) / this.al;
/*     */     
/* 410 */     double d3 = afm.g(this.ap - this.p);
/*     */     
/* 412 */     this.p = (float)(this.p + d3 / this.al);
/* 413 */     this.q = (float)(this.q + (this.aq - this.q) / this.al);
/*     */     
/* 415 */     this.al--;
/* 416 */     d(☃, d1, d2);
/* 417 */     a(this.p, this.q);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃, boolean bool1) {
/* 421 */     this.R.b(f, Boolean.valueOf(☃));
/* 422 */     this.R.b(g, Boolean.valueOf(bool1));
/*     */   }
/*     */   
/*     */   public float a(int ☃, float f) {
/* 426 */     if (a(☃)) {
/* 427 */       return (float)afm.b(this.ah[☃] - 0.39269909262657166D, this.ah[☃], f);
/*     */     }
/* 429 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public enum a {
/* 433 */     a,
/* 434 */     b,
/* 435 */     c,
/* 436 */     d,
/* 437 */     e;
/*     */   }
/*     */   
/*     */   private a s() {
/* 441 */     a ☃ = u();
/* 442 */     if (☃ != null) {
/* 443 */       this.av = (cc()).e;
/* 444 */       return ☃;
/*     */     } 
/*     */     
/* 447 */     if (t()) {
/* 448 */       return a.a;
/*     */     }
/*     */     
/* 451 */     float f = k();
/* 452 */     if (f > 0.0F) {
/* 453 */       this.aw = f;
/* 454 */       return a.d;
/*     */     } 
/*     */     
/* 457 */     return a.e;
/*     */   }
/*     */   
/*     */   public float i() {
/* 461 */     dci ☃ = cc();
/* 462 */     int i = afm.c(☃.a);
/* 463 */     int j = afm.f(☃.d);
/* 464 */     int k = afm.c(☃.e);
/* 465 */     int m = afm.f(☃.e - this.az);
/* 466 */     int n = afm.c(☃.c);
/* 467 */     int i1 = afm.f(☃.f);
/*     */     
/* 469 */     fx.a a1 = new fx.a();
/*     */     int i2;
/* 471 */     label24: for (i2 = k; i2 < m; i2++) {
/* 472 */       float f = 0.0F;
/* 473 */       for (int i3 = i; i3 < j; i3++) {
/* 474 */         for (int i4 = n; i4 < i1; i4++) {
/* 475 */           a1.d(i3, i2, i4);
/* 476 */           cux cux = this.l.b(a1);
/* 477 */           if (cux.a(aef.b)) {
/* 478 */             f = Math.max(f, cux.a(this.l, a1));
/*     */           }
/* 480 */           if (f >= 1.0F) {
/*     */             continue label24;
/*     */           }
/*     */         } 
/*     */       } 
/* 485 */       if (f < 1.0F) {
/* 486 */         return a1.v() + f;
/*     */       }
/*     */     } 
/* 489 */     return (m + 1);
/*     */   }
/*     */   
/*     */   public float k() {
/* 493 */     dci ☃ = cc();
/* 494 */     dci dci1 = new dci(☃.a, ☃.b - 0.001D, ☃.c, ☃.d, ☃.b, ☃.f);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 504 */     int i = afm.c(dci1.a) - 1;
/* 505 */     int j = afm.f(dci1.d) + 1;
/* 506 */     int k = afm.c(dci1.b) - 1;
/* 507 */     int m = afm.f(dci1.e) + 1;
/* 508 */     int n = afm.c(dci1.c) - 1;
/* 509 */     int i1 = afm.f(dci1.f) + 1;
/*     */     
/* 511 */     ddh ddh = dde.a(dci1);
/* 512 */     float f = 0.0F;
/* 513 */     int i2 = 0;
/*     */     
/* 515 */     fx.a a1 = new fx.a();
/* 516 */     for (int i3 = i; i3 < j; i3++) {
/* 517 */       for (int i4 = n; i4 < i1; i4++) {
/*     */         
/* 519 */         int i5 = ((i3 == i || i3 == j - 1) ? 1 : 0) + ((i4 == n || i4 == i1 - 1) ? 1 : 0);
/* 520 */         if (i5 != 2)
/*     */         {
/*     */ 
/*     */           
/* 524 */           for (int i6 = k; i6 < m; i6++) {
/*     */             
/* 526 */             if (i5 <= 0 || (i6 != k && i6 != m - 1)) {
/*     */ 
/*     */ 
/*     */               
/* 530 */               a1.d(i3, i6, i4);
/*     */               
/* 532 */               ceh ceh = this.l.d_(a1);
/* 533 */               if (!(ceh.b() instanceof cbo))
/*     */               {
/*     */                 
/* 536 */                 if (dde.c(ceh.k(this.l, a1).a(i3, i6, i4), ddh, dcr.i)) {
/* 537 */                   f += ceh.b().j();
/* 538 */                   i2++;
/*     */                 }  } 
/*     */             } 
/*     */           }  } 
/*     */       } 
/*     */     } 
/* 544 */     return f / i2;
/*     */   }
/*     */   private boolean t() {
/*     */     int i2;
/* 548 */     dci ☃ = cc();
/* 549 */     int i = afm.c(☃.a);
/* 550 */     int j = afm.f(☃.d);
/* 551 */     int k = afm.c(☃.b);
/* 552 */     int m = afm.f(☃.b + 0.001D);
/* 553 */     int n = afm.c(☃.c);
/* 554 */     int i1 = afm.f(☃.f);
/*     */     
/* 556 */     boolean bool = false;
/* 557 */     this.av = Double.MIN_VALUE;
/*     */     
/* 559 */     fx.a a1 = new fx.a();
/* 560 */     for (int i3 = i; i3 < j; i3++) {
/* 561 */       for (int i4 = k; i4 < m; i4++) {
/* 562 */         for (int i5 = n; i5 < i1; i5++) {
/* 563 */           a1.d(i3, i4, i5);
/* 564 */           cux cux = this.l.b(a1);
/*     */           
/* 566 */           if (cux.a(aef.b)) {
/*     */ 
/*     */ 
/*     */             
/* 570 */             float f = i4 + cux.a(this.l, a1);
/* 571 */             this.av = Math.max(f, this.av);
/* 572 */             i2 = bool | ((☃.b < f) ? 1 : 0);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 577 */     return i2;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private a u() {
/* 582 */     dci ☃ = cc();
/* 583 */     double d = ☃.e + 0.001D;
/*     */     
/* 585 */     int i = afm.c(☃.a);
/* 586 */     int j = afm.f(☃.d);
/* 587 */     int k = afm.c(☃.e);
/* 588 */     int m = afm.f(d);
/* 589 */     int n = afm.c(☃.c);
/* 590 */     int i1 = afm.f(☃.f);
/*     */     
/* 592 */     boolean bool = false;
/* 593 */     fx.a a1 = new fx.a();
/* 594 */     for (int i2 = i; i2 < j; i2++) {
/* 595 */       for (int i3 = k; i3 < m; i3++) {
/* 596 */         for (int i4 = n; i4 < i1; i4++) {
/* 597 */           a1.d(i2, i3, i4);
/* 598 */           cux cux = this.l.b(a1);
/* 599 */           if (cux.a(aef.b) && 
/* 600 */             d < (a1.v() + cux.a(this.l, a1))) {
/* 601 */             if (cux.b()) {
/* 602 */               bool = true;
/*     */             } else {
/* 604 */               return a.c;
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 612 */     return bool ? a.b : null;
/*     */   }
/*     */   
/*     */   private void v() {
/* 616 */     double ☃ = -0.03999999910593033D;
/* 617 */     double d1 = aB() ? 0.0D : -0.03999999910593033D;
/* 618 */     double d2 = 0.0D;
/* 619 */     this.ai = 0.05F;
/*     */     
/* 621 */     if (this.ay == a.e && this.ax != a.e && this.ax != a.d) {
/* 622 */       this.av = e(1.0D);
/* 623 */       d(cD(), (i() - cz()) + 0.101D, cH());
/* 624 */       f(cC().d(1.0D, 0.0D, 1.0D));
/* 625 */       this.az = 0.0D;
/*     */       
/* 627 */       this.ax = a.a;
/*     */     } else {
/* 629 */       if (this.ax == a.a) {
/* 630 */         d2 = (this.av - cE()) / cz();
/* 631 */         this.ai = 0.9F;
/* 632 */       } else if (this.ax == a.c) {
/* 633 */         d1 = -7.0E-4D;
/* 634 */         this.ai = 0.9F;
/* 635 */       } else if (this.ax == a.b) {
/* 636 */         d2 = 0.009999999776482582D;
/* 637 */         this.ai = 0.45F;
/* 638 */       } else if (this.ax == a.e) {
/* 639 */         this.ai = 0.9F;
/* 640 */       } else if (this.ax == a.d) {
/* 641 */         this.ai = this.aw;
/* 642 */         if (cm() instanceof bfw) {
/* 643 */           this.aw /= 2.0F;
/*     */         }
/*     */       } 
/*     */       
/* 647 */       dcn dcn = cC();
/* 648 */       n(dcn.b * this.ai, dcn.c + d1, dcn.d * this.ai);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 653 */       this.ak *= this.ai;
/*     */       
/* 655 */       if (d2 > 0.0D) {
/* 656 */         dcn dcn1 = cC();
/* 657 */         n(dcn1.b, (dcn1.c + d2 * 0.06153846016296973D) * 0.75D, dcn1.d);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void x() {
/* 667 */     if (!bs()) {
/*     */       return;
/*     */     }
/*     */     
/* 671 */     float ☃ = 0.0F;
/* 672 */     if (this.ar) {
/* 673 */       this.ak--;
/*     */     }
/* 675 */     if (this.as) {
/* 676 */       this.ak++;
/*     */     }
/* 678 */     if (this.as != this.ar && !this.at && !this.au) {
/* 679 */       ☃ += 0.005F;
/*     */     }
/* 681 */     this.p += this.ak;
/*     */     
/* 683 */     if (this.at) {
/* 684 */       ☃ += 0.04F;
/*     */     }
/* 686 */     if (this.au) {
/* 687 */       ☃ -= 0.005F;
/*     */     }
/*     */     
/* 690 */     f(cC().b((
/* 691 */           afm.a(-this.p * 0.017453292F) * ☃), 0.0D, (
/*     */           
/* 693 */           afm.b(this.p * 0.017453292F) * ☃)));
/*     */ 
/*     */     
/* 696 */     a(((this.as && !this.ar) || this.at), ((this.ar && !this.as) || this.at));
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(aqa ☃) {
/* 701 */     if (!w(☃)) {
/*     */       return;
/*     */     }
/*     */     
/* 705 */     float f1 = 0.0F;
/* 706 */     float f2 = (float)((this.y ? 0.009999999776482582D : bc()) + ☃.bb());
/*     */     
/* 708 */     if (cn().size() > 1) {
/* 709 */       int i = cn().indexOf(☃);
/* 710 */       if (i == 0) {
/* 711 */         f1 = 0.2F;
/*     */       } else {
/* 713 */         f1 = -0.6F;
/*     */       } 
/*     */       
/* 716 */       if (☃ instanceof azz) {
/* 717 */         f1 = (float)(f1 + 0.2D);
/*     */       }
/*     */     } 
/*     */     
/* 721 */     dcn dcn = (new dcn(f1, 0.0D, 0.0D)).b(-this.p * 0.017453292F - 1.5707964F);
/*     */     
/* 723 */     ☃.d(cD() + dcn.b, cE() + f2, cH() + dcn.d);
/*     */     
/* 725 */     ☃.p += this.ak;
/* 726 */     ☃.m(☃.bK() + this.ak);
/*     */     
/* 728 */     a(☃);
/*     */     
/* 730 */     if (☃ instanceof azz && cn().size() > 1) {
/* 731 */       int i = (☃.Y() % 2 == 0) ? 90 : 270;
/* 732 */       ☃.n(((azz)☃).aA + i);
/* 733 */       ☃.m(☃.bK() + i);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn b(aqm ☃) {
/* 739 */     dcn dcn = a((cy() * afm.a), ☃.cy(), this.p);
/*     */     
/* 741 */     double d1 = cD() + dcn.b;
/* 742 */     double d2 = cH() + dcn.d;
/*     */     
/* 744 */     fx fx1 = new fx(d1, (cc()).e, d2);
/* 745 */     fx fx2 = fx1.c();
/*     */     
/* 747 */     if (!this.l.A(fx2)) {
/* 748 */       double d3 = fx1.v() + this.l.h(fx1);
/* 749 */       double d4 = fx1.v() + this.l.h(fx2);
/*     */       
/* 751 */       for (UnmodifiableIterator<aqx> unmodifiableIterator = ☃.ej().iterator(); unmodifiableIterator.hasNext(); ) { aqx aqx = unmodifiableIterator.next();
/* 752 */         dcn dcn1 = bho.a(this.l, d1, d3, d2, ☃, aqx);
/* 753 */         if (dcn1 != null) {
/* 754 */           ☃.b(aqx);
/* 755 */           return dcn1;
/*     */         } 
/*     */         
/* 758 */         dcn dcn2 = bho.a(this.l, d1, d4, d2, ☃, aqx);
/* 759 */         if (dcn2 != null) {
/* 760 */           ☃.b(aqx);
/* 761 */           return dcn2;
/*     */         }  }
/*     */     
/*     */     } 
/*     */     
/* 766 */     return super.b(☃);
/*     */   }
/*     */   
/*     */   protected void a(aqa ☃) {
/* 770 */     ☃.n(this.p);
/*     */     
/* 772 */     float f1 = afm.g(☃.p - this.p);
/* 773 */     float f2 = afm.a(f1, -105.0F, 105.0F);
/* 774 */     ☃.r += f2 - f1;
/* 775 */     ☃.p += f2 - f1;
/* 776 */     ☃.m(☃.p);
/*     */   }
/*     */ 
/*     */   
/*     */   public void l(aqa ☃) {
/* 781 */     a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/* 786 */     ☃.a("Type", p().a());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 791 */     if (☃.c("Type", 8)) {
/* 792 */       a(b.a(☃.l("Type")));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(bfw ☃, aot aot1) {
/* 798 */     if (☃.eq()) {
/* 799 */       return aou.c;
/*     */     }
/*     */     
/* 802 */     if (this.aj < 60.0F) {
/* 803 */       if (!this.l.v) {
/* 804 */         return ☃.m(this) ? aou.b : aou.c;
/*     */       }
/* 806 */       return aou.a;
/*     */     } 
/* 808 */     return aou.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(double ☃, boolean bool, ceh ceh1, fx fx1) {
/* 813 */     this.az = (cC()).c;
/* 814 */     if (br()) {
/*     */       return;
/*     */     }
/*     */     
/* 818 */     if (bool) {
/* 819 */       if (this.C > 3.0F) {
/*     */         
/* 821 */         if (this.ax != a.d) {
/* 822 */           this.C = 0.0F;
/*     */           
/*     */           return;
/*     */         } 
/* 826 */         b(this.C, 1.0F);
/* 827 */         if (!this.l.v && !this.y) {
/* 828 */           ad();
/* 829 */           if (this.l.V().b(brt.g)) {
/* 830 */             int i; for (i = 0; i < 3; i++) {
/* 831 */               a(p().b());
/*     */             }
/* 833 */             for (i = 0; i < 2; i++) {
/* 834 */               a(bmd.kP);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/* 839 */       this.C = 0.0F;
/* 840 */     } else if (!this.l.b(cB().c()).a(aef.b) && 
/* 841 */       ☃ < 0.0D) {
/* 842 */       this.C = (float)(this.C - ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃) {
/* 848 */     return (((Boolean)this.R.<Boolean>a((☃ == 0) ? f : g)).booleanValue() && cm() != null);
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 852 */     this.R.b(d, Float.valueOf(☃));
/*     */   }
/*     */   
/*     */   public float m() {
/* 856 */     return ((Float)this.R.<Float>a(d)).floatValue();
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 860 */     this.R.b(b, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int n() {
/* 864 */     return ((Integer)this.R.<Integer>a(b)).intValue();
/*     */   }
/*     */   
/*     */   private void d(int ☃) {
/* 868 */     this.R.b(ag, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   private int z() {
/* 872 */     return ((Integer)this.R.<Integer>a(ag)).intValue();
/*     */   }
/*     */   
/*     */   public float b(float ☃) {
/* 876 */     return afm.g(☃, this.aE, this.aD);
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 880 */     this.R.b(c, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int o() {
/* 884 */     return ((Integer)this.R.<Integer>a(c)).intValue();
/*     */   }
/*     */   
/*     */   public void a(b ☃) {
/* 888 */     this.R.b(e, Integer.valueOf(☃.ordinal()));
/*     */   }
/*     */   
/*     */   public b p() {
/* 892 */     return b.a(((Integer)this.R.<Integer>a(e)).intValue());
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean q(aqa ☃) {
/* 897 */     return (cn().size() < 2 && !a(aef.b));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqa cm() {
/* 903 */     List<aqa> ☃ = cn();
/* 904 */     return ☃.isEmpty() ? null : ☃.get(0);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃, boolean bool1, boolean bool2, boolean bool3) {
/* 908 */     this.ar = ☃;
/* 909 */     this.as = bool1;
/* 910 */     this.at = bool2;
/* 911 */     this.au = bool3;
/*     */   }
/*     */   
/*     */   public enum b {
/* 915 */     a((String)bup.n, "oak"),
/* 916 */     b((String)bup.o, "spruce"),
/* 917 */     c((String)bup.p, "birch"),
/* 918 */     d((String)bup.q, "jungle"),
/* 919 */     e((String)bup.r, "acacia"),
/* 920 */     f((String)bup.s, "dark_oak");
/*     */     
/*     */     private final String g;
/*     */     private final buo h;
/*     */     
/*     */     b(buo ☃, String str1) {
/* 926 */       this.g = str1;
/* 927 */       this.h = ☃;
/*     */     }
/*     */     
/*     */     public String a() {
/* 931 */       return this.g;
/*     */     }
/*     */     
/*     */     public buo b() {
/* 935 */       return this.h;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 940 */       return this.g;
/*     */     }
/*     */     
/*     */     public static b a(int ☃) {
/* 944 */       b[] arrayOfB = values();
/* 945 */       if (☃ < 0 || ☃ >= arrayOfB.length) {
/* 946 */         ☃ = 0;
/*     */       }
/* 948 */       return arrayOfB[☃];
/*     */     }
/*     */     
/*     */     public static b a(String ☃) {
/* 952 */       b[] arrayOfB = values();
/* 953 */       for (int i = 0; i < arrayOfB.length; i++) {
/* 954 */         if (arrayOfB[i].a().equals(☃)) {
/* 955 */           return arrayOfB[i];
/*     */         }
/*     */       } 
/* 958 */       return arrayOfB[0];
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 964 */     return new on(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aI() {
/* 969 */     return (this.ax == a.b || this.ax == a.c);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
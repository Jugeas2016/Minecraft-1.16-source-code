/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.EnumMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public abstract class bhl
/*     */   extends aqa
/*     */ {
/*     */   public enum a
/*     */   {
/*  51 */     a,
/*  52 */     b,
/*  53 */     c,
/*  54 */     d,
/*  55 */     e,
/*  56 */     f,
/*  57 */     g;
/*     */   }
/*     */ 
/*     */   
/*  61 */   private static final us<Integer> b = uv.a((Class)bhl.class, uu.b);
/*  62 */   private static final us<Integer> c = uv.a((Class)bhl.class, uu.b);
/*  63 */   private static final us<Float> d = uv.a((Class)bhl.class, uu.c);
/*  64 */   private static final us<Integer> e = uv.a((Class)bhl.class, uu.b);
/*  65 */   private static final us<Integer> f = uv.a((Class)bhl.class, uu.b);
/*  66 */   private static final us<Boolean> g = uv.a((Class)bhl.class, uu.i);
/*     */   
/*  68 */   private static final ImmutableMap<aqx, ImmutableList<Integer>> ag = ImmutableMap.of(aqx.a, 
/*  69 */       ImmutableList.of(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(-1)), aqx.f, 
/*  70 */       ImmutableList.of(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(-1)), aqx.d, 
/*  71 */       ImmutableList.of(Integer.valueOf(0), Integer.valueOf(1))); private boolean ah; private static final Map<cfk, Pair<gr, gr>> ai;
/*     */   private int aj;
/*     */   private double ak;
/*     */   private double al;
/*     */   
/*     */   protected bhl(aqe<?> ☃, brx brx1) {
/*  77 */     super(☃, brx1);
/*  78 */     this.i = true;
/*     */   }
/*     */   private double am; private double an; private double ao; private double ap; private double aq; private double ar;
/*     */   protected bhl(aqe<?> ☃, brx brx1, double d1, double d2, double d3) {
/*  82 */     this(☃, brx1);
/*  83 */     d(d1, d2, d3);
/*     */     
/*  85 */     f(dcn.a);
/*     */     
/*  87 */     this.m = d1;
/*  88 */     this.n = d2;
/*  89 */     this.o = d3;
/*     */   }
/*     */   
/*     */   public static bhl a(brx ☃, double d1, double d2, double d3, a a1) {
/*  93 */     if (a1 == a.b)
/*  94 */       return new bhq(☃, d1, d2, d3); 
/*  95 */     if (a1 == a.c)
/*  96 */       return new bhs(☃, d1, d2, d3); 
/*  97 */     if (a1 == a.d)
/*  98 */       return new bhv(☃, d1, d2, d3); 
/*  99 */     if (a1 == a.e)
/* 100 */       return new bhu(☃, d1, d2, d3); 
/* 101 */     if (a1 == a.f)
/* 102 */       return new bht(☃, d1, d2, d3); 
/* 103 */     if (a1 == a.g) {
/* 104 */       return new bhr(☃, d1, d2, d3);
/*     */     }
/* 106 */     return new bhp(☃, d1, d2, d3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/* 112 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 117 */     this.R.a(b, Integer.valueOf(0));
/* 118 */     this.R.a(c, Integer.valueOf(1));
/* 119 */     this.R.a(d, Float.valueOf(0.0F));
/* 120 */     this.R.a(e, Integer.valueOf(buo.i(bup.a.n())));
/* 121 */     this.R.a(f, Integer.valueOf(6));
/* 122 */     this.R.a(g, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j(aqa ☃) {
/* 127 */     return bhn.a(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aU() {
/* 132 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected dcn a(gc.a ☃, i.a a1) {
/* 137 */     return aqm.h(super.a(☃, a1));
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/* 142 */     return 0.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn b(aqm ☃) {
/* 147 */     gc gc = ca();
/* 148 */     if (gc.n() == gc.a.b) {
/* 149 */       return super.b(☃);
/*     */     }
/*     */     
/* 152 */     int[][] arrayOfInt = bho.a(gc);
/* 153 */     fx fx = cB();
/* 154 */     fx.a a = new fx.a();
/*     */     
/* 156 */     ImmutableList<aqx> immutableList = ☃.ej();
/*     */     
/* 158 */     for (UnmodifiableIterator<aqx> unmodifiableIterator1 = immutableList.iterator(); unmodifiableIterator1.hasNext(); ) { aqx aqx = unmodifiableIterator1.next();
/* 159 */       aqb aqb = ☃.a(aqx);
/*     */ 
/*     */       
/* 162 */       float f = Math.min(aqb.a, 1.0F) / 2.0F;
/*     */       
/* 164 */       for (UnmodifiableIterator<Integer> unmodifiableIterator = ((ImmutableList)ag.get(aqx)).iterator(); unmodifiableIterator.hasNext(); ) { int i = ((Integer)unmodifiableIterator.next()).intValue();
/* 165 */         for (int[] arrayOfInt1 : arrayOfInt) {
/* 166 */           a.d(fx.u() + arrayOfInt1[0], fx.v() + i, fx.w() + arrayOfInt1[1]);
/*     */           
/* 168 */           double d1 = this.l.a(bho.a(this.l, a), () -> bho.a(this.l, ☃.c()));
/* 169 */           if (bho.a(d1)) {
/*     */ 
/*     */ 
/*     */             
/* 173 */             dci dci = new dci(-f, 0.0D, -f, f, aqb.b, f);
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 178 */             dcn dcn = dcn.a(a, d1);
/* 179 */             if (bho.a((brg)this.l, ☃, dci.c(dcn))) {
/* 180 */               ☃.b(aqx);
/* 181 */               return dcn;
/*     */             } 
/*     */           } 
/*     */         }  }
/*     */        }
/*     */     
/* 187 */     double d = (cc()).e;
/* 188 */     a.c(fx.u(), d, fx.w());
/*     */     
/* 190 */     for (UnmodifiableIterator<aqx> unmodifiableIterator2 = immutableList.iterator(); unmodifiableIterator2.hasNext(); ) { aqx aqx = unmodifiableIterator2.next();
/* 191 */       double d1 = (☃.a(aqx)).b;
/* 192 */       int i = afm.f(d - a.v() + d1);
/* 193 */       double d2 = bho.a(a, i, ☃ -> this.l.d_(☃).k(this.l, ☃));
/*     */       
/* 195 */       if (d + d1 <= d2) {
/* 196 */         ☃.b(aqx);
/*     */         
/*     */         break;
/*     */       }  }
/*     */     
/* 201 */     return super.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 206 */     if (this.l.v || this.y) {
/* 207 */       return true;
/*     */     }
/* 209 */     if (b(☃)) {
/* 210 */       return false;
/*     */     }
/* 212 */     d(-n());
/* 213 */     c(10);
/* 214 */     aS();
/* 215 */     a(k() + f * 10.0F);
/* 216 */     boolean bool = (☃.k() instanceof bfw && ((bfw)☃.k()).bC.d);
/*     */     
/* 218 */     if (bool || k() > 40.0F) {
/* 219 */       be();
/*     */       
/* 221 */       if (!bool || S()) {
/* 222 */         a(☃);
/*     */       } else {
/* 224 */         ad();
/*     */       } 
/*     */     } 
/* 227 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float ar() {
/* 232 */     ceh ☃ = this.l.d_(cB());
/* 233 */     if (☃.a(aed.H)) {
/* 234 */       return 1.0F;
/*     */     }
/* 236 */     return super.ar();
/*     */   }
/*     */   
/*     */   public void a(apk ☃) {
/* 240 */     ad();
/*     */     
/* 242 */     if (this.l.V().b(brt.g)) {
/* 243 */       bmb bmb = new bmb(bmd.lN);
/* 244 */       if (S()) {
/* 245 */         bmb.a(T());
/*     */       }
/* 247 */       a(bmb);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void bm() {
/* 253 */     d(-n());
/* 254 */     c(10);
/* 255 */     a(k() + k() * 10.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/* 260 */     return !this.y;
/*     */   }
/*     */   static {
/* 263 */     ai = x.<Map<cfk, Pair<gr, gr>>>a(Maps.newEnumMap(cfk.class), ☃ -> {
/*     */           gr gr1 = gc.e.p();
/*     */           gr gr2 = gc.f.p();
/*     */           gr gr3 = gc.c.p();
/*     */           gr gr4 = gc.d.p();
/*     */           gr gr5 = gr1.n();
/*     */           gr gr6 = gr2.n();
/*     */           gr gr7 = gr3.n();
/*     */           gr gr8 = gr4.n();
/*     */           ☃.put(cfk.a, Pair.of(gr3, gr4));
/*     */           ☃.put(cfk.b, Pair.of(gr1, gr2));
/*     */           ☃.put(cfk.c, Pair.of(gr5, gr2));
/*     */           ☃.put(cfk.d, Pair.of(gr1, gr6));
/*     */           ☃.put(cfk.e, Pair.of(gr3, gr8));
/*     */           ☃.put(cfk.f, Pair.of(gr7, gr4));
/*     */           ☃.put(cfk.g, Pair.of(gr4, gr2));
/*     */           ☃.put(cfk.h, Pair.of(gr4, gr1));
/*     */           ☃.put(cfk.i, Pair.of(gr3, gr1));
/*     */           ☃.put(cfk.j, Pair.of(gr3, gr2));
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private static Pair<gr, gr> a(cfk ☃) {
/* 287 */     return ai.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public gc ca() {
/* 292 */     return this.ah ? bZ().f().g() : bZ().g();
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 297 */     if (m() > 0) {
/* 298 */       c(m() - 1);
/*     */     }
/* 300 */     if (k() > 0.0F) {
/* 301 */       a(k() - 1.0F);
/*     */     }
/* 303 */     if (cE() < -64.0D) {
/* 304 */       an();
/*     */     }
/*     */     
/* 307 */     bk();
/*     */     
/* 309 */     if (this.l.v) {
/* 310 */       if (this.aj > 0) {
/* 311 */         double d4 = cD() + (this.ak - cD()) / this.aj;
/* 312 */         double d5 = cE() + (this.al - cE()) / this.aj;
/* 313 */         double d6 = cH() + (this.am - cH()) / this.aj;
/*     */         
/* 315 */         double d7 = afm.g(this.an - this.p);
/*     */         
/* 317 */         this.p = (float)(this.p + d7 / this.aj);
/* 318 */         this.q = (float)(this.q + (this.ao - this.q) / this.aj);
/*     */         
/* 320 */         this.aj--;
/* 321 */         d(d4, d5, d6);
/* 322 */         a(this.p, this.q);
/*     */       } else {
/* 324 */         af();
/* 325 */         a(this.p, this.q);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 330 */     if (!aB()) {
/* 331 */       f(cC().b(0.0D, -0.04D, 0.0D));
/*     */     }
/*     */     
/* 334 */     int ☃ = afm.c(cD());
/* 335 */     int i = afm.c(cE());
/* 336 */     int j = afm.c(cH());
/* 337 */     if (this.l.d_(new fx(☃, i - 1, j)).a(aed.H)) {
/* 338 */       i--;
/*     */     }
/*     */     
/* 341 */     fx fx = new fx(☃, i, j);
/* 342 */     ceh ceh = this.l.d_(fx);
/* 343 */     if (bug.g(ceh)) {
/* 344 */       c(fx, ceh);
/*     */       
/* 346 */       if (ceh.a(bup.fD)) {
/* 347 */         a(☃, i, j, ((Boolean)ceh.c(byx.d)).booleanValue());
/*     */       }
/*     */     } else {
/* 350 */       h();
/*     */     } 
/*     */     
/* 353 */     ay();
/*     */     
/* 355 */     this.q = 0.0F;
/* 356 */     double d1 = this.m - cD();
/* 357 */     double d2 = this.o - cH();
/* 358 */     if (d1 * d1 + d2 * d2 > 0.001D) {
/* 359 */       this.p = (float)(afm.d(d2, d1) * 180.0D / Math.PI);
/* 360 */       if (this.ah) {
/* 361 */         this.p += 180.0F;
/*     */       }
/*     */     } 
/*     */     
/* 365 */     double d3 = afm.g(this.p - this.r);
/* 366 */     if (d3 < -170.0D || d3 >= 170.0D) {
/* 367 */       this.p += 180.0F;
/* 368 */       this.ah = !this.ah;
/*     */     } 
/* 370 */     a(this.p, this.q);
/*     */     
/* 372 */     if (o() == a.a && c(cC()) > 0.01D) {
/* 373 */       List<aqa> list = this.l.a(this, cc().c(0.20000000298023224D, 0.0D, 0.20000000298023224D), aqd.a(this));
/* 374 */       if (!list.isEmpty()) {
/* 375 */         for (int k = 0; k < list.size(); k++) {
/* 376 */           aqa aqa1 = list.get(k);
/* 377 */           if (aqa1 instanceof bfw || aqa1 instanceof bai || aqa1 instanceof bhl || bs() || aqa1.br()) {
/* 378 */             aqa1.i(this);
/*     */           } else {
/* 380 */             aqa1.m(this);
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } else {
/* 385 */       for (aqa aqa1 : this.l.a(this, cc().c(0.20000000298023224D, 0.0D, 0.20000000298023224D))) {
/* 386 */         if (!w(aqa1) && aqa1.aU() && aqa1 instanceof bhl) {
/* 387 */           aqa1.i(this);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 392 */     aK();
/*     */     
/* 394 */     if (aQ()) {
/* 395 */       ak();
/* 396 */       this.C *= 0.5F;
/*     */     } 
/*     */     
/* 399 */     this.Q = false;
/*     */   }
/*     */   
/*     */   protected double g() {
/* 403 */     return 0.4D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, boolean bool) {}
/*     */   
/*     */   protected void h() {
/* 410 */     double ☃ = g();
/* 411 */     dcn dcn = cC();
/* 412 */     n(
/* 413 */         afm.a(dcn.b, -☃, ☃), dcn.c, 
/*     */         
/* 415 */         afm.a(dcn.d, -☃, ☃));
/*     */     
/* 417 */     if (this.t) {
/* 418 */       f(cC().a(0.5D));
/*     */     }
/* 420 */     a(aqr.a, cC());
/*     */     
/* 422 */     if (!this.t)
/* 423 */       f(cC().a(0.95D)); 
/*     */   }
/*     */   
/*     */   protected void c(fx ☃, ceh ceh1) {
/*     */     double d14;
/* 428 */     this.C = 0.0F;
/*     */     
/* 430 */     double d1 = cD();
/* 431 */     double d2 = cE();
/* 432 */     double d3 = cH();
/* 433 */     dcn dcn1 = p(d1, d2, d3);
/* 434 */     d2 = ☃.v();
/*     */     
/* 436 */     boolean bool1 = false;
/* 437 */     boolean bool2 = false;
/* 438 */     bug bug = (bug)ceh1.b();
/*     */     
/* 440 */     if (bug == bup.aN) {
/* 441 */       bool1 = ((Boolean)ceh1.c(byx.d)).booleanValue();
/* 442 */       bool2 = !bool1;
/*     */     } 
/*     */     
/* 445 */     double d4 = 0.0078125D;
/* 446 */     dcn dcn2 = cC();
/* 447 */     cfk cfk = (cfk)ceh1.c(bug.d());
/* 448 */     switch (null.a[cfk.ordinal()]) {
/*     */       case 1:
/* 450 */         f(dcn2.b(-0.0078125D, 0.0D, 0.0D));
/* 451 */         d2++;
/*     */         break;
/*     */       case 2:
/* 454 */         f(dcn2.b(0.0078125D, 0.0D, 0.0D));
/* 455 */         d2++;
/*     */         break;
/*     */       case 3:
/* 458 */         f(dcn2.b(0.0D, 0.0D, 0.0078125D));
/* 459 */         d2++;
/*     */         break;
/*     */       case 4:
/* 462 */         f(dcn2.b(0.0D, 0.0D, -0.0078125D));
/* 463 */         d2++;
/*     */         break;
/*     */     } 
/*     */     
/* 467 */     dcn2 = cC();
/*     */     
/* 469 */     Pair<gr, gr> pair = a(cfk);
/* 470 */     gr gr1 = (gr)pair.getFirst();
/* 471 */     gr gr2 = (gr)pair.getSecond();
/*     */ 
/*     */     
/* 474 */     double d5 = (gr2.u() - gr1.u());
/* 475 */     double d6 = (gr2.w() - gr1.w());
/* 476 */     double d7 = Math.sqrt(d5 * d5 + d6 * d6);
/*     */     
/* 478 */     double d8 = dcn2.b * d5 + dcn2.d * d6;
/* 479 */     if (d8 < 0.0D) {
/* 480 */       d5 = -d5;
/* 481 */       d6 = -d6;
/*     */     } 
/*     */     
/* 484 */     double d9 = Math.min(2.0D, Math.sqrt(c(dcn2)));
/*     */     
/* 486 */     dcn2 = new dcn(d9 * d5 / d7, dcn2.c, d9 * d6 / d7);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 491 */     f(dcn2);
/*     */     
/* 493 */     aqa aqa1 = cn().isEmpty() ? null : cn().get(0);
/* 494 */     if (aqa1 instanceof bfw) {
/* 495 */       dcn dcn = aqa1.cC();
/* 496 */       double d17 = c(dcn);
/* 497 */       double d18 = c(cC());
/* 498 */       if (d17 > 1.0E-4D && d18 < 0.01D) {
/* 499 */         f(cC().b(dcn.b * 0.1D, 0.0D, dcn.d * 0.1D));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 505 */         bool2 = false;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 510 */     if (bool2) {
/* 511 */       double d = Math.sqrt(c(cC()));
/* 512 */       if (d < 0.03D) {
/* 513 */         f(dcn.a);
/*     */       } else {
/* 515 */         f(cC().d(0.5D, 0.0D, 0.5D));
/*     */       } 
/*     */     } 
/*     */     
/* 519 */     double d10 = ☃.u() + 0.5D + gr1.u() * 0.5D;
/* 520 */     double d11 = ☃.w() + 0.5D + gr1.w() * 0.5D;
/* 521 */     double d12 = ☃.u() + 0.5D + gr2.u() * 0.5D;
/* 522 */     double d13 = ☃.w() + 0.5D + gr2.w() * 0.5D;
/*     */     
/* 524 */     d5 = d12 - d10;
/* 525 */     d6 = d13 - d11;
/*     */ 
/*     */     
/* 528 */     if (d5 == 0.0D) {
/* 529 */       d14 = d3 - ☃.w();
/* 530 */     } else if (d6 == 0.0D) {
/* 531 */       d14 = d1 - ☃.u();
/*     */     } else {
/* 533 */       double d17 = d1 - d10;
/* 534 */       double d18 = d3 - d11;
/*     */       
/* 536 */       d14 = (d17 * d5 + d18 * d6) * 2.0D;
/*     */     } 
/*     */     
/* 539 */     d1 = d10 + d5 * d14;
/* 540 */     d3 = d11 + d6 * d14;
/*     */     
/* 542 */     d(d1, d2, d3);
/*     */     
/* 544 */     double d15 = bs() ? 0.75D : 1.0D;
/* 545 */     double d16 = g();
/*     */     
/* 547 */     dcn2 = cC();
/* 548 */     a(aqr.a, new dcn(
/* 549 */           afm.a(d15 * dcn2.b, -d16, d16), 0.0D, 
/*     */           
/* 551 */           afm.a(d15 * dcn2.d, -d16, d16)));
/*     */ 
/*     */     
/* 554 */     if (gr1.v() != 0 && afm.c(cD()) - ☃.u() == gr1.u() && afm.c(cH()) - ☃.w() == gr1.w()) {
/* 555 */       d(cD(), cE() + gr1.v(), cH());
/* 556 */     } else if (gr2.v() != 0 && afm.c(cD()) - ☃.u() == gr2.u() && afm.c(cH()) - ☃.w() == gr2.w()) {
/* 557 */       d(cD(), cE() + gr2.v(), cH());
/*     */     } 
/*     */     
/* 560 */     i();
/*     */     
/* 562 */     dcn dcn3 = p(cD(), cE(), cH());
/* 563 */     if (dcn3 != null && dcn1 != null) {
/* 564 */       double d17 = (dcn1.c - dcn3.c) * 0.05D;
/*     */       
/* 566 */       dcn dcn = cC();
/* 567 */       double d18 = Math.sqrt(c(dcn));
/* 568 */       if (d18 > 0.0D) {
/* 569 */         f(dcn.d((d18 + d17) / d18, 1.0D, (d18 + d17) / d18));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 575 */       d(cD(), dcn3.c, cH());
/*     */     } 
/*     */     
/* 578 */     int i = afm.c(cD());
/* 579 */     int j = afm.c(cH());
/* 580 */     if (i != ☃.u() || j != ☃.w()) {
/* 581 */       dcn dcn = cC();
/* 582 */       double d = Math.sqrt(c(dcn));
/* 583 */       n(d * (i - ☃
/* 584 */           .u()), dcn.c, d * (j - ☃
/*     */           
/* 586 */           .w()));
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 591 */     if (bool1) {
/* 592 */       dcn dcn = cC();
/* 593 */       double d = Math.sqrt(c(dcn));
/* 594 */       if (d > 0.01D) {
/* 595 */         double d17 = 0.06D;
/* 596 */         f(dcn.b(dcn.b / d * 0.06D, 0.0D, dcn.d / d * 0.06D));
/*     */ 
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 603 */         dcn dcn4 = cC();
/* 604 */         double d17 = dcn4.b;
/* 605 */         double d18 = dcn4.d;
/* 606 */         if (cfk == cfk.b) {
/* 607 */           if (a(☃.f())) {
/* 608 */             d17 = 0.02D;
/* 609 */           } else if (a(☃.g())) {
/* 610 */             d17 = -0.02D;
/*     */           } 
/* 612 */         } else if (cfk == cfk.a) {
/* 613 */           if (a(☃.d())) {
/* 614 */             d18 = 0.02D;
/* 615 */           } else if (a(☃.e())) {
/* 616 */             d18 = -0.02D;
/*     */           } 
/*     */         } else {
/*     */           return;
/*     */         } 
/* 621 */         n(d17, dcn4.c, d18);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃) {
/* 627 */     return this.l.d_(☃).g(this.l, ☃);
/*     */   }
/*     */   
/*     */   protected void i() {
/* 631 */     double ☃ = bs() ? 0.997D : 0.96D;
/* 632 */     f(cC().d(☃, 0.0D, ☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dcn a(double ☃, double d1, double d2, double d3) {
/* 637 */     int i = afm.c(☃);
/* 638 */     int j = afm.c(d1);
/* 639 */     int k = afm.c(d2);
/* 640 */     if (this.l.d_(new fx(i, j - 1, k)).a(aed.H)) {
/* 641 */       j--;
/*     */     }
/*     */     
/* 644 */     ceh ceh = this.l.d_(new fx(i, j, k));
/* 645 */     if (bug.g(ceh)) {
/* 646 */       cfk cfk = (cfk)ceh.c(((bug)ceh.b()).d());
/* 647 */       d1 = j;
/* 648 */       if (cfk.c()) {
/* 649 */         d1 = (j + 1);
/*     */       }
/*     */       
/* 652 */       Pair<gr, gr> pair = a(cfk);
/* 653 */       gr gr1 = (gr)pair.getFirst();
/* 654 */       gr gr2 = (gr)pair.getSecond();
/*     */       
/* 656 */       double d4 = (gr2.u() - gr1.u());
/* 657 */       double d5 = (gr2.w() - gr1.w());
/* 658 */       double d6 = Math.sqrt(d4 * d4 + d5 * d5);
/* 659 */       d4 /= d6;
/* 660 */       d5 /= d6;
/*     */       
/* 662 */       ☃ += d4 * d3;
/* 663 */       d2 += d5 * d3;
/*     */       
/* 665 */       if (gr1.v() != 0 && afm.c(☃) - i == gr1.u() && afm.c(d2) - k == gr1.w()) {
/* 666 */         d1 += gr1.v();
/* 667 */       } else if (gr2.v() != 0 && afm.c(☃) - i == gr2.u() && afm.c(d2) - k == gr2.w()) {
/* 668 */         d1 += gr2.v();
/*     */       } 
/*     */       
/* 671 */       return p(☃, d1, d2);
/*     */     } 
/* 673 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dcn p(double ☃, double d1, double d2) {
/* 678 */     int i = afm.c(☃);
/* 679 */     int j = afm.c(d1);
/* 680 */     int k = afm.c(d2);
/* 681 */     if (this.l.d_(new fx(i, j - 1, k)).a(aed.H)) {
/* 682 */       j--;
/*     */     }
/*     */     
/* 685 */     ceh ceh = this.l.d_(new fx(i, j, k));
/* 686 */     if (bug.g(ceh)) {
/* 687 */       double d12; cfk cfk = (cfk)ceh.c(((bug)ceh.b()).d());
/*     */       
/* 689 */       Pair<gr, gr> pair = a(cfk);
/* 690 */       gr gr1 = (gr)pair.getFirst();
/* 691 */       gr gr2 = (gr)pair.getSecond();
/*     */       
/* 693 */       double d3 = i + 0.5D + gr1.u() * 0.5D;
/* 694 */       double d4 = j + 0.0625D + gr1.v() * 0.5D;
/* 695 */       double d5 = k + 0.5D + gr1.w() * 0.5D;
/* 696 */       double d6 = i + 0.5D + gr2.u() * 0.5D;
/* 697 */       double d7 = j + 0.0625D + gr2.v() * 0.5D;
/* 698 */       double d8 = k + 0.5D + gr2.w() * 0.5D;
/*     */       
/* 700 */       double d9 = d6 - d3;
/* 701 */       double d10 = (d7 - d4) * 2.0D;
/* 702 */       double d11 = d8 - d5;
/*     */ 
/*     */       
/* 705 */       if (d9 == 0.0D) {
/* 706 */         d12 = d2 - k;
/* 707 */       } else if (d11 == 0.0D) {
/* 708 */         d12 = ☃ - i;
/*     */       } else {
/* 710 */         double d13 = ☃ - d3;
/* 711 */         double d14 = d2 - d5;
/*     */         
/* 713 */         d12 = (d13 * d9 + d14 * d11) * 2.0D;
/*     */       } 
/*     */       
/* 716 */       ☃ = d3 + d9 * d12;
/* 717 */       d1 = d4 + d10 * d12;
/* 718 */       d2 = d5 + d11 * d12;
/* 719 */       if (d10 < 0.0D) {
/* 720 */         d1++;
/* 721 */       } else if (d10 > 0.0D) {
/* 722 */         d1 += 0.5D;
/*     */       } 
/* 724 */       return new dcn(☃, d1, d2);
/*     */     } 
/* 726 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public dci cd() {
/* 731 */     dci ☃ = cc();
/* 732 */     if (t()) {
/* 733 */       return ☃.g(Math.abs(r()) / 16.0D);
/*     */     }
/* 735 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 740 */     if (☃.q("CustomDisplayTile")) {
/* 741 */       b(mp.c(☃.p("DisplayState")));
/*     */       
/* 743 */       l(☃.h("DisplayOffset"));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/* 749 */     if (t()) {
/* 750 */       ☃.a("CustomDisplayTile", true);
/* 751 */       ☃.a("DisplayState", mp.a(p()));
/* 752 */       ☃.b("DisplayOffset", r());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void i(aqa ☃) {
/* 758 */     if (this.l.v) {
/*     */       return;
/*     */     }
/* 761 */     if (☃.H || this.H) {
/*     */       return;
/*     */     }
/*     */     
/* 765 */     if (w(☃)) {
/*     */       return;
/*     */     }
/*     */     
/* 769 */     double d1 = ☃.cD() - cD();
/* 770 */     double d2 = ☃.cH() - cH();
/*     */     
/* 772 */     double d3 = d1 * d1 + d2 * d2;
/* 773 */     if (d3 >= 9.999999747378752E-5D) {
/* 774 */       d3 = afm.a(d3);
/* 775 */       d1 /= d3;
/* 776 */       d2 /= d3;
/* 777 */       double d = 1.0D / d3;
/* 778 */       if (d > 1.0D) {
/* 779 */         d = 1.0D;
/*     */       }
/* 781 */       d1 *= d;
/* 782 */       d2 *= d;
/* 783 */       d1 *= 0.10000000149011612D;
/* 784 */       d2 *= 0.10000000149011612D;
/*     */       
/* 786 */       d1 *= (1.0F - this.I);
/* 787 */       d2 *= (1.0F - this.I);
/* 788 */       d1 *= 0.5D;
/* 789 */       d2 *= 0.5D;
/*     */       
/* 791 */       if (☃ instanceof bhl) {
/* 792 */         double d4 = ☃.cD() - cD();
/* 793 */         double d5 = ☃.cH() - cH();
/*     */         
/* 795 */         dcn dcn1 = (new dcn(d4, 0.0D, d5)).d();
/* 796 */         dcn dcn2 = (new dcn(afm.b(this.p * 0.017453292F), 0.0D, afm.a(this.p * 0.017453292F))).d();
/*     */         
/* 798 */         double d6 = Math.abs(dcn1.b(dcn2));
/*     */         
/* 800 */         if (d6 < 0.800000011920929D) {
/*     */           return;
/*     */         }
/*     */         
/* 804 */         dcn dcn3 = cC();
/* 805 */         dcn dcn4 = ☃.cC();
/*     */         
/* 807 */         if (((bhl)☃).o() == a.c && o() != a.c) {
/* 808 */           f(dcn3.d(0.2D, 1.0D, 0.2D));
/* 809 */           i(dcn4.b - d1, 0.0D, dcn4.d - d2);
/* 810 */           ☃.f(dcn4.d(0.95D, 1.0D, 0.95D));
/* 811 */         } else if (((bhl)☃).o() != a.c && o() == a.c) {
/* 812 */           ☃.f(dcn4.d(0.2D, 1.0D, 0.2D));
/* 813 */           ☃.i(dcn3.b + d1, 0.0D, dcn3.d + d2);
/* 814 */           f(dcn3.d(0.95D, 1.0D, 0.95D));
/*     */         } else {
/* 816 */           double d7 = (dcn4.b + dcn3.b) / 2.0D;
/* 817 */           double d8 = (dcn4.d + dcn3.d) / 2.0D;
/*     */           
/* 819 */           f(dcn3.d(0.2D, 1.0D, 0.2D));
/* 820 */           i(d7 - d1, 0.0D, d8 - d2);
/* 821 */           ☃.f(dcn4.d(0.2D, 1.0D, 0.2D));
/* 822 */           ☃.i(d7 + d1, 0.0D, d8 + d2);
/*     */         } 
/*     */       } else {
/* 825 */         i(-d1, 0.0D, -d2);
/* 826 */         ☃.i(d1 / 4.0D, 0.0D, d2 / 4.0D);
/*     */       } 
/*     */     } 
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
/*     */   
/*     */   public void a(double ☃, double d1, double d2, float f1, float f2, int i, boolean bool) {
/* 843 */     this.ak = ☃;
/* 844 */     this.al = d1;
/* 845 */     this.am = d2;
/* 846 */     this.an = f1;
/* 847 */     this.ao = f2;
/*     */     
/* 849 */     this.aj = i + 2;
/*     */     
/* 851 */     n(this.ap, this.aq, this.ar);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(double ☃, double d1, double d2) {
/* 856 */     this.ap = ☃;
/* 857 */     this.aq = d1;
/* 858 */     this.ar = d2;
/* 859 */     n(this.ap, this.aq, this.ar);
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 863 */     this.R.b(d, Float.valueOf(☃));
/*     */   }
/*     */   
/*     */   public float k() {
/* 867 */     return ((Float)this.R.<Float>a(d)).floatValue();
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 871 */     this.R.b(b, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int m() {
/* 875 */     return ((Integer)this.R.<Integer>a(b)).intValue();
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 879 */     this.R.b(c, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public int n() {
/* 883 */     return ((Integer)this.R.<Integer>a(c)).intValue();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh p() {
/* 889 */     if (!t()) {
/* 890 */       return q();
/*     */     }
/* 892 */     return buo.a(((Integer)ab().<Integer>a(e)).intValue());
/*     */   }
/*     */   
/*     */   public ceh q() {
/* 896 */     return bup.a.n();
/*     */   }
/*     */   
/*     */   public int r() {
/* 900 */     if (!t()) {
/* 901 */       return s();
/*     */     }
/* 903 */     return ((Integer)ab().<Integer>a(f)).intValue();
/*     */   }
/*     */   
/*     */   public int s() {
/* 907 */     return 6;
/*     */   }
/*     */   
/*     */   public void b(ceh ☃) {
/* 911 */     ab().b(e, Integer.valueOf(buo.i(☃)));
/* 912 */     a(true);
/*     */   }
/*     */   
/*     */   public void l(int ☃) {
/* 916 */     ab().b(f, Integer.valueOf(☃));
/* 917 */     a(true);
/*     */   }
/*     */   
/*     */   public boolean t() {
/* 921 */     return ((Boolean)ab().<Boolean>a(g)).booleanValue();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 925 */     ab().b(g, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 930 */     return new on(this);
/*     */   }
/*     */   
/*     */   public abstract a o();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
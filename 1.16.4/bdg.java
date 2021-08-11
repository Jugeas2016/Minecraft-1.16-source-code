/*     */ import java.util.EnumSet;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdg
/*     */   extends bdq
/*     */   implements aqs
/*     */ {
/*  64 */   private static final UUID b = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
/*  65 */   private static final arj c = new arj(b, "Attacking speed boost", 0.15000000596046448D, arj.a.a);
/*     */ 
/*     */ 
/*     */   
/*  69 */   private static final us<Optional<ceh>> d = uv.a((Class)bdg.class, uu.h);
/*  70 */   private static final us<Boolean> bo = uv.a((Class)bdg.class, uu.i); private static final Predicate<aqm> bq;
/*  71 */   private static final us<Boolean> bp = uv.a((Class)bdg.class, uu.i);
/*     */   static {
/*  73 */     bq = (☃ -> (☃ instanceof bdh && ((bdh)☃).eK()));
/*     */   }
/*  75 */   private int br = Integer.MIN_VALUE;
/*     */   
/*     */   private int bs;
/*  78 */   private static final afh bt = afu.a(20, 39);
/*     */   private int bu;
/*     */   private UUID bv;
/*     */   
/*     */   public bdg(aqe<? extends bdg> ☃, brx brx1) {
/*  83 */     super((aqe)☃, brx1);
/*     */     
/*  85 */     this.G = 1.0F;
/*     */     
/*  87 */     a(cwz.h, -1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  92 */     this.bk.a(0, new avp(this));
/*  93 */     this.bk.a(1, new a(this));
/*  94 */     this.bk.a(2, new awf(this, 1.0D, false));
/*  95 */     this.bk.a(7, new axk(this, 1.0D, 0.0F));
/*  96 */     this.bk.a(8, new awd(this, (Class)bfw.class, 8.0F));
/*  97 */     this.bk.a(8, new aws(this));
/*     */     
/*  99 */     this.bk.a(10, new b(this));
/* 100 */     this.bk.a(11, new d(this));
/*     */     
/* 102 */     this.bl.a(1, new c(this, this::a_));
/* 103 */     this.bl.a(2, new axp(this, new Class[0]));
/* 104 */     this.bl.a(3, new axq<>(this, bdh.class, 10, true, false, bq));
/* 105 */     this.bl.a(4, new axw<>(this, false));
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/* 109 */     return bdq.eR()
/* 110 */       .a(arl.a, 40.0D)
/* 111 */       .a(arl.d, 0.30000001192092896D)
/* 112 */       .a(arl.f, 7.0D)
/* 113 */       .a(arl.b, 64.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void h(@Nullable aqm ☃) {
/* 118 */     super.h(☃);
/*     */     
/* 120 */     arh arh = a(arl.d);
/*     */     
/* 122 */     if (☃ == null) {
/* 123 */       this.bs = 0;
/* 124 */       this.R.b(bo, Boolean.valueOf(false));
/* 125 */       this.R.b(bp, Boolean.valueOf(false));
/*     */       
/* 127 */       arh.d(c);
/*     */     } else {
/* 129 */       this.bs = this.K;
/* 130 */       this.R.b(bo, Boolean.valueOf(true));
/*     */       
/* 132 */       if (!arh.a(c)) {
/* 133 */         arh.b(c);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 140 */     super.e();
/*     */     
/* 142 */     this.R.a(d, Optional.empty());
/* 143 */     this.R.a(bo, Boolean.valueOf(false));
/* 144 */     this.R.a(bp, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void G_() {
/* 149 */     a_(bt.a(this.J));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(int ☃) {
/* 154 */     this.bu = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int E_() {
/* 159 */     return this.bu;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable UUID ☃) {
/* 164 */     this.bv = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public UUID F_() {
/* 169 */     return this.bv;
/*     */   }
/*     */   
/*     */   public void eK() {
/* 173 */     if (this.K >= this.br + 400) {
/* 174 */       this.br = this.K;
/* 175 */       if (!aA()) {
/* 176 */         this.l.a(cD(), cG(), cH(), adq.dC, cu(), 2.5F, 1.0F, false);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 183 */     if (bo.equals(☃) && 
/* 184 */       eO() && this.l.v) {
/* 185 */       eK();
/*     */     }
/*     */     
/* 188 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 193 */     super.b(☃);
/* 194 */     ceh ceh = eM();
/* 195 */     if (ceh != null) {
/* 196 */       ☃.a("carriedBlockState", mp.a(ceh));
/*     */     }
/* 198 */     c(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 203 */     super.a(☃);
/* 204 */     ceh ceh = null;
/* 205 */     if (☃.c("carriedBlockState", 10)) {
/* 206 */       ceh = mp.c(☃.p("carriedBlockState"));
/* 207 */       if (ceh.g()) {
/* 208 */         ceh = null;
/*     */       }
/*     */     } 
/* 211 */     c(ceh);
/* 212 */     a((aag)this.l, ☃);
/*     */   }
/*     */   
/*     */   private boolean g(bfw ☃) {
/* 216 */     bmb bmb = ☃.bm.b.get(3);
/* 217 */     if (bmb.b() == bup.cU.h()) {
/* 218 */       return false;
/*     */     }
/*     */     
/* 221 */     dcn dcn1 = ☃.f(1.0F).d();
/* 222 */     dcn dcn2 = new dcn(cD() - ☃.cD(), cG() - ☃.cG(), cH() - ☃.cH());
/* 223 */     double d1 = dcn2.f();
/* 224 */     dcn2 = dcn2.d();
/* 225 */     double d2 = dcn1.b(dcn2);
/* 226 */     if (d2 > 1.0D - 0.025D / d1) {
/* 227 */       return ☃.D(this);
/*     */     }
/* 229 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 234 */     return 2.55F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 239 */     if (this.l.v) {
/* 240 */       for (int ☃ = 0; ☃ < 2; ☃++) {
/* 241 */         this.l.a(hh.Q, d(0.5D), cF() - 0.25D, g(0.5D), (this.J.nextDouble() - 0.5D) * 2.0D, -this.J.nextDouble(), (this.J.nextDouble() - 0.5D) * 2.0D);
/*     */       }
/*     */     }
/*     */     
/* 245 */     this.aQ = false;
/*     */     
/* 247 */     if (!this.l.v) {
/* 248 */       a((aag)this.l, true);
/*     */     }
/* 250 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dO() {
/* 255 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/* 260 */     if (this.l.M() && this.K >= this.bs + 600) {
/* 261 */       float ☃ = aR();
/* 262 */       if (☃ > 0.5F && 
/* 263 */         this.l.e(cB()) && this.J.nextFloat() * 30.0F < (☃ - 0.4F) * 2.0F) {
/* 264 */         h((aqm)null);
/* 265 */         eL();
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 270 */     super.N();
/*     */   }
/*     */   
/*     */   protected boolean eL() {
/* 274 */     if (this.l.s_() || !aX()) {
/* 275 */       return false;
/*     */     }
/*     */     
/* 278 */     double ☃ = cD() + (this.J.nextDouble() - 0.5D) * 64.0D;
/* 279 */     double d1 = cE() + (this.J.nextInt(64) - 32);
/* 280 */     double d2 = cH() + (this.J.nextDouble() - 0.5D) * 64.0D;
/* 281 */     return p(☃, d1, d2);
/*     */   }
/*     */   
/*     */   private boolean a(aqa ☃) {
/* 285 */     dcn dcn = new dcn(cD() - ☃.cD(), e(0.5D) - ☃.cG(), cH() - ☃.cH());
/* 286 */     dcn = dcn.d();
/* 287 */     double d1 = 16.0D;
/* 288 */     double d2 = cD() + (this.J.nextDouble() - 0.5D) * 8.0D - dcn.b * 16.0D;
/* 289 */     double d3 = cE() + (this.J.nextInt(16) - 8) - dcn.c * 16.0D;
/* 290 */     double d4 = cH() + (this.J.nextDouble() - 0.5D) * 8.0D - dcn.d * 16.0D;
/* 291 */     return p(d2, d3, d4);
/*     */   }
/*     */   
/*     */   private boolean p(double ☃, double d1, double d2) {
/* 295 */     fx.a a = new fx.a(☃, d1, d2);
/* 296 */     while (a.v() > 0 && !this.l.d_(a).c().c()) {
/* 297 */       a.c(gc.a);
/*     */     }
/* 299 */     ceh ceh = this.l.d_(a);
/* 300 */     boolean bool1 = ceh.c().c();
/* 301 */     boolean bool2 = ceh.m().a(aef.b);
/* 302 */     if (!bool1 || bool2) {
/* 303 */       return false;
/*     */     }
/*     */     
/* 306 */     boolean bool3 = a(☃, d1, d2, true);
/* 307 */     if (bool3 && 
/* 308 */       !aA()) {
/* 309 */       this.l.a((bfw)null, this.m, this.n, this.o, adq.dD, cu(), 1.0F, 1.0F);
/* 310 */       a(adq.dD, 1.0F, 1.0F);
/*     */     } 
/*     */ 
/*     */     
/* 314 */     return bool3;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 319 */     return eN() ? adq.dB : adq.dy;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 324 */     return adq.dA;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 329 */     return adq.dz;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(apk ☃, int i, boolean bool) {
/* 334 */     super.a(☃, i, bool);
/* 335 */     ceh ceh = eM();
/* 336 */     if (ceh != null) {
/* 337 */       a(ceh.b());
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(@Nullable ceh ☃) {
/* 342 */     this.R.b(d, Optional.ofNullable(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ceh eM() {
/* 347 */     return ((Optional<ceh>)this.R.<Optional<ceh>>a(d)).orElse(null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 352 */     if (b(☃)) {
/* 353 */       return false;
/*     */     }
/*     */     
/* 356 */     if (☃ instanceof apm) {
/* 357 */       for (int i = 0; i < 64; i++) {
/* 358 */         if (eL()) {
/* 359 */           return true;
/*     */         }
/*     */       } 
/* 362 */       return false;
/*     */     } 
/*     */     
/* 365 */     boolean bool = super.a(☃, f);
/* 366 */     if (!this.l.s_() && !(☃.k() instanceof aqm) && this.J.nextInt(10) != 0) {
/* 367 */       eL();
/*     */     }
/*     */     
/* 370 */     return bool;
/*     */   }
/*     */   
/*     */   public boolean eN() {
/* 374 */     return ((Boolean)this.R.<Boolean>a(bo)).booleanValue();
/*     */   }
/*     */   
/*     */   public boolean eO() {
/* 378 */     return ((Boolean)this.R.<Boolean>a(bp)).booleanValue();
/*     */   }
/*     */   
/*     */   public void eP() {
/* 382 */     this.R.b(bp, Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean K() {
/* 387 */     return (super.K() || eM() != null);
/*     */   }
/*     */   
/*     */   static class c
/*     */     extends axq<bfw> {
/*     */     private final bdg i;
/*     */     private bfw j;
/*     */     private int k;
/*     */     private int l;
/*     */     private final azg m;
/* 397 */     private final azg n = (new azg()).c();
/*     */     
/*     */     public c(bdg ☃, @Nullable Predicate<aqm> predicate) {
/* 400 */       super(☃, bfw.class, 10, false, false, predicate);
/* 401 */       this.i = ☃;
/*     */       
/* 403 */       this.m = (new azg()).a(k()).a(aqm1 -> bdg.a(☃, (bfw)aqm1));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 408 */       this.j = this.i.l.a(this.m, this.i);
/* 409 */       return (this.j != null);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 414 */       this.k = 5;
/* 415 */       this.l = 0;
/* 416 */       this.i.eP();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void d() {
/* 422 */       this.j = null;
/*     */       
/* 424 */       super.d();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 429 */       if (this.j != null) {
/* 430 */         if (!bdg.a(this.i, this.j)) {
/* 431 */           return false;
/*     */         }
/* 433 */         this.i.a(this.j, 10.0F, 10.0F);
/* 434 */         return true;
/* 435 */       }  if (this.c != null && this.n.a(this.i, this.c)) {
/* 436 */         return true;
/*     */       }
/* 438 */       return super.b();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 443 */       if (this.i.A() == null) {
/* 444 */         a((aqm)null);
/*     */       }
/*     */       
/* 447 */       if (this.j != null) {
/* 448 */         if (--this.k <= 0) {
/* 449 */           this.c = this.j;
/* 450 */           this.j = null;
/* 451 */           super.c();
/*     */         } 
/*     */       } else {
/* 454 */         if (this.c != null && !this.i.br()) {
/* 455 */           if (bdg.a(this.i, (bfw)this.c)) {
/* 456 */             if (this.c.h(this.i) < 16.0D) {
/* 457 */               this.i.eL();
/*     */             }
/* 459 */             this.l = 0;
/* 460 */           } else if (this.c.h(this.i) > 256.0D && 
/* 461 */             this.l++ >= 30 && 
/* 462 */             bdg.a(this.i, this.c)) {
/* 463 */             this.l = 0;
/*     */           } 
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 469 */         super.e();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends avv {
/*     */     private final bdg a;
/*     */     private aqm b;
/*     */     
/*     */     public a(bdg ☃) {
/* 479 */       this.a = ☃;
/* 480 */       a(EnumSet.of(avv.a.c, avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 485 */       this.b = this.a.A();
/* 486 */       if (!(this.b instanceof bfw)) {
/* 487 */         return false;
/*     */       }
/* 489 */       double ☃ = this.b.h(this.a);
/* 490 */       if (☃ > 256.0D) {
/* 491 */         return false;
/*     */       }
/* 493 */       return bdg.a(this.a, (bfw)this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 498 */       this.a.x().o();
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 503 */       this.a.t().a(this.b.cD(), this.b.cG(), this.b.cH());
/*     */     }
/*     */   }
/*     */   
/*     */   static class b extends avv {
/*     */     private final bdg a;
/*     */     
/*     */     public b(bdg ☃) {
/* 511 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 516 */       if (this.a.eM() == null) {
/* 517 */         return false;
/*     */       }
/* 519 */       if (!this.a.l.V().b(brt.b)) {
/* 520 */         return false;
/*     */       }
/* 522 */       return (this.a.cY().nextInt(2000) == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 527 */       Random ☃ = this.a.cY();
/* 528 */       brx brx = this.a.l;
/*     */       
/* 530 */       int i = afm.c(this.a.cD() - 1.0D + ☃.nextDouble() * 2.0D);
/* 531 */       int j = afm.c(this.a.cE() + ☃.nextDouble() * 2.0D);
/* 532 */       int k = afm.c(this.a.cH() - 1.0D + ☃.nextDouble() * 2.0D);
/* 533 */       fx fx1 = new fx(i, j, k);
/* 534 */       ceh ceh1 = brx.d_(fx1);
/* 535 */       fx fx2 = fx1.c();
/* 536 */       ceh ceh2 = brx.d_(fx2);
/*     */       
/* 538 */       ceh ceh3 = this.a.eM();
/* 539 */       if (ceh3 == null) {
/*     */         return;
/*     */       }
/*     */       
/* 543 */       ceh3 = buo.b(ceh3, this.a.l, fx1);
/* 544 */       if (a(brx, fx1, ceh3, ceh1, ceh2, fx2)) {
/* 545 */         brx.a(fx1, ceh3, 3);
/* 546 */         this.a.c((ceh)null);
/*     */       } 
/*     */     }
/*     */     
/*     */     private boolean a(brx ☃, fx fx1, ceh ceh1, ceh ceh2, ceh ceh3, fx fx2) {
/* 551 */       return (ceh2.g() && !ceh3.g() && !ceh3.a(bup.z) && ceh3.r(☃, fx2) && ceh1.a(☃, fx1) && ☃
/* 552 */         .a(this.a, dci.a(dcn.b(fx1))).isEmpty());
/*     */     }
/*     */   }
/*     */   
/*     */   static class d extends avv {
/*     */     private final bdg a;
/*     */     
/*     */     public d(bdg ☃) {
/* 560 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 565 */       if (this.a.eM() != null) {
/* 566 */         return false;
/*     */       }
/* 568 */       if (!this.a.l.V().b(brt.b)) {
/* 569 */         return false;
/*     */       }
/* 571 */       return (this.a.cY().nextInt(20) == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 576 */       Random ☃ = this.a.cY();
/* 577 */       brx brx = this.a.l;
/*     */       
/* 579 */       int i = afm.c(this.a.cD() - 2.0D + ☃.nextDouble() * 4.0D);
/* 580 */       int j = afm.c(this.a.cE() + ☃.nextDouble() * 3.0D);
/* 581 */       int k = afm.c(this.a.cH() - 2.0D + ☃.nextDouble() * 4.0D);
/* 582 */       fx fx = new fx(i, j, k);
/* 583 */       ceh ceh = brx.d_(fx);
/* 584 */       buo buo = ceh.b();
/*     */       
/* 586 */       dcn dcn1 = new dcn(afm.c(this.a.cD()) + 0.5D, j + 0.5D, afm.c(this.a.cH()) + 0.5D);
/* 587 */       dcn dcn2 = new dcn(i + 0.5D, j + 0.5D, k + 0.5D);
/* 588 */       dcj dcj = brx.a(new brf(dcn1, dcn2, brf.a.b, brf.b.a, this.a));
/* 589 */       boolean bool = dcj.a().equals(fx);
/*     */       
/* 591 */       if (buo.a(aed.T) && bool) {
/* 592 */         brx.a(fx, false);
/* 593 */         this.a.c(ceh.b().n());
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
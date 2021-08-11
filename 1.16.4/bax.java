/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bax
/*     */   extends azz
/*     */ {
/*  70 */   private static final us<fx> bp = uv.a((Class)bax.class, uu.l);
/*  71 */   private static final us<Boolean> bq = uv.a((Class)bax.class, uu.i);
/*  72 */   private static final us<Boolean> br = uv.a((Class)bax.class, uu.i);
/*  73 */   private static final us<fx> bs = uv.a((Class)bax.class, uu.l);
/*  74 */   private static final us<Boolean> bt = uv.a((Class)bax.class, uu.i); private int bv;
/*  75 */   private static final us<Boolean> bu = uv.a((Class)bax.class, uu.i);
/*     */   public static final Predicate<aqm> bo;
/*     */   
/*     */   static {
/*  79 */     bo = (☃ -> (☃.w_() && !☃.aE()));
/*     */   }
/*     */   public bax(aqe<? extends bax> ☃, brx brx1) {
/*  82 */     super((aqe)☃, brx1);
/*     */     
/*  84 */     a(cwz.h, 0.0F);
/*  85 */     this.bh = new e(this);
/*  86 */     this.G = 1.0F;
/*     */   }
/*     */   
/*     */   public void g(fx ☃) {
/*  90 */     this.R.b(bp, ☃);
/*     */   }
/*     */   
/*     */   private fx eN() {
/*  94 */     return this.R.<fx>a(bp);
/*     */   }
/*     */   
/*     */   private void h(fx ☃) {
/*  98 */     this.R.b(bs, ☃);
/*     */   }
/*     */   
/*     */   private fx eO() {
/* 102 */     return this.R.<fx>a(bs);
/*     */   }
/*     */   
/*     */   public boolean eK() {
/* 106 */     return ((Boolean)this.R.<Boolean>a(bq)).booleanValue();
/*     */   }
/*     */   
/*     */   private void t(boolean ☃) {
/* 110 */     this.R.b(bq, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean eL() {
/* 114 */     return ((Boolean)this.R.<Boolean>a(br)).booleanValue();
/*     */   }
/*     */   
/*     */   private void u(boolean ☃) {
/* 118 */     this.bv = ☃ ? 1 : 0;
/* 119 */     this.R.b(br, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   private boolean eU() {
/* 123 */     return ((Boolean)this.R.<Boolean>a(bt)).booleanValue();
/*     */   }
/*     */   
/*     */   private void v(boolean ☃) {
/* 127 */     this.R.b(bt, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   private boolean eV() {
/* 131 */     return ((Boolean)this.R.<Boolean>a(bu)).booleanValue();
/*     */   }
/*     */   
/*     */   private void w(boolean ☃) {
/* 135 */     this.R.b(bu, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 140 */     super.e();
/* 141 */     this.R.a(bp, fx.b);
/* 142 */     this.R.a(bq, Boolean.valueOf(false));
/* 143 */     this.R.a(bs, fx.b);
/* 144 */     this.R.a(bt, Boolean.valueOf(false));
/* 145 */     this.R.a(bu, Boolean.valueOf(false));
/* 146 */     this.R.a(br, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 151 */     super.b(☃);
/*     */     
/* 153 */     ☃.b("HomePosX", eN().u());
/* 154 */     ☃.b("HomePosY", eN().v());
/* 155 */     ☃.b("HomePosZ", eN().w());
/* 156 */     ☃.a("HasEgg", eK());
/*     */     
/* 158 */     ☃.b("TravelPosX", eO().u());
/* 159 */     ☃.b("TravelPosY", eO().v());
/* 160 */     ☃.b("TravelPosZ", eO().w());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 165 */     int i = ☃.h("HomePosX");
/* 166 */     int j = ☃.h("HomePosY");
/* 167 */     int k = ☃.h("HomePosZ");
/* 168 */     g(new fx(i, j, k));
/*     */     
/* 170 */     super.a(☃);
/* 171 */     t(☃.q("HasEgg"));
/*     */     
/* 173 */     int m = ☃.h("TravelPosX");
/* 174 */     int n = ☃.h("TravelPosY");
/* 175 */     int i1 = ☃.h("TravelPosZ");
/* 176 */     h(new fx(m, n, i1));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 182 */     g(cB());
/* 183 */     h(fx.b);
/* 184 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   public static boolean c(aqe<bax> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 188 */     return (fx1.v() < bry1.t_() + 4 && 
/* 189 */       cbf.a(bry1, fx1) && bry1
/* 190 */       .b(fx1, 0) > 8);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 195 */     this.bk.a(0, new f(this, 1.2D));
/* 196 */     this.bk.a(1, new a(this, 1.0D));
/* 197 */     this.bk.a(1, new d(this, 1.0D));
/* 198 */     this.bk.a(2, new i(this, 1.1D, bup.aU.h()));
/* 199 */     this.bk.a(3, new c(this, 1.0D));
/* 200 */     this.bk.a(4, new b(this, 1.0D));
/* 201 */     this.bk.a(7, new j(this, 1.0D));
/* 202 */     this.bk.a(8, new awd(this, (Class)bfw.class, 8.0F));
/* 203 */     this.bk.a(9, new h(this, 1.0D, 100));
/*     */   }
/*     */   
/*     */   public static ark.a eM() {
/* 207 */     return aqn.p()
/* 208 */       .a(arl.a, 30.0D)
/* 209 */       .a(arl.d, 0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bV() {
/* 214 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean cM() {
/* 220 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public aqq dC() {
/* 225 */     return aqq.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public int D() {
/* 230 */     return 200;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp I() {
/* 236 */     if (!aE() && this.t && !w_()) {
/* 237 */       return adq.pt;
/*     */     }
/*     */     
/* 240 */     return super.I();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void d(float ☃) {
/* 245 */     super.d(☃ * 1.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp av() {
/* 250 */     return adq.pE;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp e(apk ☃) {
/* 256 */     if (w_()) {
/* 257 */       return adq.pA;
/*     */     }
/* 259 */     return adq.pz;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp dq() {
/* 265 */     if (w_()) {
/* 266 */       return adq.pv;
/*     */     }
/* 268 */     return adq.pu;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 273 */     adp adp = w_() ? adq.pD : adq.pC;
/*     */     
/* 275 */     a(adp, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean eP() {
/* 280 */     return (super.eP() && !eK());
/*     */   }
/*     */ 
/*     */   
/*     */   protected float at() {
/* 285 */     return this.B + 0.15F;
/*     */   }
/*     */ 
/*     */   
/*     */   public float cS() {
/* 290 */     return w_() ? 0.3F : 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ayj b(brx ☃) {
/* 295 */     return new g(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public apy a(aag ☃, apy apy1) {
/* 301 */     return aqe.aN.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 306 */     return (☃.b() == bup.aU.h());
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(fx ☃, brz brz1) {
/* 311 */     if (!eU() && brz1.b(☃).a(aef.b)) {
/* 312 */       return 10.0F;
/*     */     }
/*     */     
/* 315 */     if (cbf.a(brz1, ☃)) {
/* 316 */       return 10.0F;
/*     */     }
/*     */     
/* 319 */     return brz1.y(☃) - 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 324 */     super.k();
/*     */     
/* 326 */     if (aX() && eL() && this.bv >= 1 && this.bv % 5 == 0) {
/* 327 */       fx ☃ = cB();
/* 328 */       if (cbf.a(this.l, ☃)) {
/* 329 */         this.l.c(2001, ☃, buo.i(bup.C.n()));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m() {
/* 336 */     super.m();
/*     */ 
/*     */     
/* 339 */     if (!w_() && this.l.V().b(brt.e)) {
/* 340 */       a(bmd.jZ, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void g(dcn ☃) {
/* 346 */     if (dS() && aE()) {
/* 347 */       a(0.1F, ☃);
/* 348 */       a(aqr.a, cC());
/*     */       
/* 350 */       f(cC().a(0.9D));
/* 351 */       if (A() == null && (!eU() || !eN().a(cA(), 20.0D))) {
/* 352 */         f(cC().b(0.0D, -0.005D, 0.0D));
/*     */       }
/*     */     } else {
/* 355 */       super.g(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 361 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, aql aql1) {
/* 366 */     a(apk.b, Float.MAX_VALUE);
/*     */   }
/*     */   
/*     */   static class f extends awp {
/*     */     f(bax ☃, double d) {
/* 371 */       super(☃, d);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 376 */       if (this.a.cZ() == null && !this.a.bq()) {
/* 377 */         return false;
/*     */       }
/*     */       
/* 380 */       fx ☃ = a(this.a.l, this.a, 7, 4);
/* 381 */       if (☃ != null) {
/* 382 */         this.c = ☃.u();
/* 383 */         this.d = ☃.v();
/* 384 */         this.e = ☃.w();
/*     */         
/* 386 */         return true;
/*     */       } 
/*     */       
/* 389 */       return g();
/*     */     }
/*     */   }
/*     */   
/*     */   static class j extends avv {
/*     */     private final bax a;
/*     */     private final double b;
/*     */     private boolean c;
/*     */     
/*     */     j(bax ☃, double d) {
/* 399 */       this.a = ☃;
/* 400 */       this.b = d;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 405 */       return (!bax.a(this.a) && !this.a.eK() && this.a.aE());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 410 */       int ☃ = 512;
/* 411 */       int i = 4;
/* 412 */       Random random = bax.b(this.a);
/* 413 */       int k = random.nextInt(1025) - 512;
/* 414 */       int m = random.nextInt(9) - 4;
/* 415 */       int n = random.nextInt(1025) - 512;
/*     */       
/* 417 */       if (m + this.a.cE() > (this.a.l.t_() - 1)) {
/* 418 */         m = 0;
/*     */       }
/* 420 */       fx fx = new fx(k + this.a.cD(), m + this.a.cE(), n + this.a.cH());
/* 421 */       bax.a(this.a, fx);
/* 422 */       bax.a(this.a, true);
/* 423 */       this.c = false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 428 */       if (this.a.x().m()) {
/* 429 */         dcn ☃ = dcn.c(bax.c(this.a));
/* 430 */         dcn dcn1 = azj.a(this.a, 16, 3, ☃, 0.3141592741012573D);
/* 431 */         if (dcn1 == null) {
/* 432 */           dcn1 = azj.b(this.a, 8, 7, ☃);
/*     */         }
/*     */ 
/*     */         
/* 436 */         if (dcn1 != null) {
/* 437 */           int i = afm.c(dcn1.b);
/* 438 */           int k = afm.c(dcn1.d);
/* 439 */           int m = 34;
/* 440 */           if (!this.a.l.a(i - 34, 0, k - 34, i + 34, 0, k + 34)) {
/* 441 */             dcn1 = null;
/*     */           }
/*     */         } 
/*     */         
/* 445 */         if (dcn1 == null) {
/* 446 */           this.c = true;
/*     */           
/*     */           return;
/*     */         } 
/* 450 */         this.a.x().a(dcn1.b, dcn1.c, dcn1.d, this.b);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 456 */       return (!this.a.x().m() && !this.c && !bax.a(this.a) && !this.a.eS() && !this.a.eK());
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 461 */       bax.a(this.a, false);
/* 462 */       super.d();
/*     */     }
/*     */   }
/*     */   
/*     */   static class b
/*     */     extends avv {
/*     */     private final bax a;
/*     */     private final double b;
/*     */     private boolean c;
/*     */     private int d;
/*     */     
/*     */     b(bax ☃, double d) {
/* 474 */       this.a = ☃;
/* 475 */       this.b = d;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 480 */       if (this.a.w_()) {
/* 481 */         return false;
/*     */       }
/*     */       
/* 484 */       if (this.a.eK()) {
/* 485 */         return true;
/*     */       }
/*     */       
/* 488 */       if (this.a.cY().nextInt(700) != 0) {
/* 489 */         return false;
/*     */       }
/*     */       
/* 492 */       return !bax.d(this.a).a(this.a.cA(), 64.0D);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 497 */       bax.b(this.a, true);
/* 498 */       this.c = false;
/* 499 */       this.d = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 504 */       bax.b(this.a, false);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 509 */       return (!bax.d(this.a).a(this.a.cA(), 7.0D) && !this.c && this.d <= 600);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 514 */       fx ☃ = bax.d(this.a);
/* 515 */       boolean bool = ☃.a(this.a.cA(), 16.0D);
/* 516 */       if (bool) {
/* 517 */         this.d++;
/*     */       }
/*     */       
/* 520 */       if (this.a.x().m()) {
/* 521 */         dcn dcn1 = dcn.c(☃);
/* 522 */         dcn dcn2 = azj.a(this.a, 16, 3, dcn1, 0.3141592741012573D);
/* 523 */         if (dcn2 == null) {
/* 524 */           dcn2 = azj.b(this.a, 8, 7, dcn1);
/*     */         }
/*     */         
/* 527 */         if (dcn2 != null && !bool && !this.a.l.d_(new fx(dcn2)).a(bup.A))
/*     */         {
/* 529 */           dcn2 = azj.b(this.a, 16, 5, dcn1);
/*     */         }
/*     */         
/* 532 */         if (dcn2 == null) {
/* 533 */           this.c = true;
/*     */           
/*     */           return;
/*     */         } 
/* 537 */         this.a.x().a(dcn2.b, dcn2.c, dcn2.d, this.b);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class i extends avv {
/* 543 */     private static final azg a = (new azg()).a(10.0D).b().a();
/*     */     
/*     */     private final bax b;
/*     */     private final double c;
/*     */     private bfw d;
/*     */     private int e;
/*     */     private final Set<blx> f;
/*     */     
/*     */     i(bax ☃, double d, blx blx1) {
/* 552 */       this.b = ☃;
/* 553 */       this.c = d;
/* 554 */       this.f = Sets.newHashSet((Object[])new blx[] { blx1 });
/* 555 */       a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 560 */       if (this.e > 0) {
/* 561 */         this.e--;
/* 562 */         return false;
/*     */       } 
/* 564 */       this.d = this.b.l.a(a, this.b);
/*     */       
/* 566 */       if (this.d == null) {
/* 567 */         return false;
/*     */       }
/* 569 */       return (a(this.d.dD()) || a(this.d.dE()));
/*     */     }
/*     */     
/*     */     private boolean a(bmb ☃) {
/* 573 */       return this.f.contains(☃.b());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 578 */       return a();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 583 */       this.d = null;
/* 584 */       this.b.x().o();
/* 585 */       this.e = 100;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 590 */       this.b.t().a(this.d, (this.b.Q() + 20), this.b.O());
/* 591 */       if (this.b.h(this.d) < 6.25D) {
/* 592 */         this.b.x().o();
/*     */       } else {
/* 594 */         this.b.x().a(this.d, this.c);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends avi {
/*     */     private final bax d;
/*     */     
/*     */     a(bax ☃, double d) {
/* 603 */       super(☃, d);
/* 604 */       this.d = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 609 */       return (super.a() && !this.d.eK());
/*     */     }
/*     */ 
/*     */     
/*     */     protected void g() {
/* 614 */       aah ☃ = this.a.eR();
/* 615 */       if (☃ == null && this.c.eR() != null) {
/* 616 */         ☃ = this.c.eR();
/*     */       }
/*     */       
/* 619 */       if (☃ != null) {
/* 620 */         ☃.a(aea.O);
/* 621 */         ac.o.a(☃, this.a, this.c, (apy)null);
/*     */       } 
/*     */       
/* 624 */       bax.c(this.d, true);
/* 625 */       this.a.eT();
/* 626 */       this.c.eT();
/*     */       
/* 628 */       Random random = this.a.cY();
/* 629 */       if (this.b.V().b(brt.e))
/* 630 */         this.b.c(new aqg(this.b, this.a.cD(), this.a.cE(), this.a.cH(), random.nextInt(7) + 1)); 
/*     */     }
/*     */   }
/*     */   
/*     */   static class d
/*     */     extends awj {
/*     */     private final bax g;
/*     */     
/*     */     d(bax ☃, double d1) {
/* 639 */       super(☃, d1, 16);
/* 640 */       this.g = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 645 */       if (this.g.eK() && bax.d(this.g).a(this.g.cA(), 9.0D)) {
/* 646 */         return super.a();
/*     */       }
/* 648 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 653 */       return (super.b() && this.g.eK() && bax.d(this.g).a(this.g.cA(), 9.0D));
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 658 */       super.e();
/*     */       
/* 660 */       fx ☃ = this.g.cB();
/* 661 */       if (!this.g.aE() && l()) {
/* 662 */         if (bax.e(this.g) < 1) {
/* 663 */           bax.d(this.g, true);
/* 664 */         } else if (bax.e(this.g) > 200) {
/* 665 */           brx brx = this.g.l;
/* 666 */           brx.a((bfw)null, ☃, adq.pB, adr.e, 0.3F, 0.9F + brx.t.nextFloat() * 0.2F);
/* 667 */           brx.a(this.e.b(), bup.kf.n().a(cbf.b, Integer.valueOf(bax.f(this.g).nextInt(4) + 1)), 3);
/* 668 */           bax.c(this.g, false);
/* 669 */           bax.d(this.g, false);
/* 670 */           this.g.s(600);
/*     */         } 
/* 672 */         if (this.g.eL()) {
/* 673 */           bax.g(this.g);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(brz ☃, fx fx1) {
/* 680 */       if (!☃.w(fx1.b())) {
/* 681 */         return false;
/*     */       }
/*     */       
/* 684 */       return cbf.b(☃, fx1);
/*     */     }
/*     */   }
/*     */   
/*     */   static class h extends awt {
/*     */     private final bax h;
/*     */     
/*     */     private h(bax ☃, double d, int i) {
/* 692 */       super(☃, d, i);
/* 693 */       this.h = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 698 */       if (!this.a.aE() && !bax.a(this.h) && !this.h.eK()) {
/* 699 */         return super.a();
/*     */       }
/*     */       
/* 702 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   static class c
/*     */     extends awj
/*     */   {
/*     */     private final bax g;
/*     */     
/*     */     private c(bax ☃, double d) {
/* 712 */       super(☃, ☃.w_() ? 2.0D : d, 24);
/* 713 */       this.g = ☃;
/* 714 */       this.f = -1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 719 */       return (!this.g.aE() && this.d <= 1200 && a(this.g.l, this.e));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 724 */       if (this.g.w_() && !this.g.aE()) {
/* 725 */         return super.a();
/*     */       }
/*     */       
/* 728 */       if (!bax.a(this.g) && !this.g.aE() && !this.g.eK()) {
/* 729 */         return super.a();
/*     */       }
/*     */       
/* 732 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean k() {
/* 737 */       return (this.d % 160 == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(brz ☃, fx fx1) {
/* 742 */       return ☃.d_(fx1).a(bup.A);
/*     */     }
/*     */   }
/*     */   
/*     */   static class e extends avb {
/*     */     private final bax i;
/*     */     
/*     */     e(bax ☃) {
/* 750 */       super(☃);
/* 751 */       this.i = ☃;
/*     */     }
/*     */     
/*     */     private void g() {
/* 755 */       if (this.i.aE()) {
/*     */         
/* 757 */         this.i.f(this.i.cC().b(0.0D, 0.005D, 0.0D));
/*     */         
/* 759 */         if (!bax.d(this.i).a(this.i.cA(), 16.0D)) {
/* 760 */           this.i.q(Math.max(this.i.dN() / 2.0F, 0.08F));
/*     */         }
/*     */         
/* 763 */         if (this.i.w_()) {
/* 764 */           this.i.q(Math.max(this.i.dN() / 3.0F, 0.06F));
/*     */         }
/* 766 */       } else if (bax.h(this.i)) {
/* 767 */         this.i.q(Math.max(this.i.dN() / 2.0F, 0.06F));
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 773 */       g();
/*     */       
/* 775 */       if (this.h != avb.a.b || this.i.x().m()) {
/* 776 */         this.i.q(0.0F);
/*     */         
/*     */         return;
/*     */       } 
/* 780 */       double ☃ = this.b - this.i.cD();
/* 781 */       double d1 = this.c - this.i.cE();
/* 782 */       double d2 = this.d - this.i.cH();
/* 783 */       double d3 = afm.a(☃ * ☃ + d1 * d1 + d2 * d2);
/* 784 */       d1 /= d3;
/*     */       
/* 786 */       float f1 = (float)(afm.d(d2, ☃) * 57.2957763671875D) - 90.0F;
/* 787 */       this.i.p = a(this.i.p, f1, 90.0F);
/* 788 */       this.i.aA = this.i.p;
/*     */       
/* 790 */       float f2 = (float)(this.e * this.i.b(arl.d));
/* 791 */       this.i.q(afm.g(0.125F, this.i.dN(), f2));
/*     */       
/* 793 */       this.i.f(this.i.cC().b(0.0D, this.i.dN() * d1 * 0.1D, 0.0D));
/*     */     }
/*     */   }
/*     */   
/*     */   static class g extends ayl {
/*     */     g(bax ☃, brx brx1) {
/* 799 */       super(☃, brx1);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a() {
/* 804 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected cxf a(int ☃) {
/* 810 */       this.o = new cxi();
/* 811 */       return new cxf(this.o, ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(fx ☃) {
/* 816 */       if (this.a instanceof bax) {
/* 817 */         bax bax = (bax)this.a;
/* 818 */         if (bax.i(bax)) {
/* 819 */           return this.b.d_(☃).a(bup.A);
/*     */         }
/*     */       } 
/*     */       
/* 823 */       return !this.b.d_(☃.c()).g();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
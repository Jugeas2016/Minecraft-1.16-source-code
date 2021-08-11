/*      */ import com.google.common.collect.ImmutableList;
/*      */ import com.google.common.collect.ImmutableMap;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import com.mojang.datafixers.util.Either;
/*      */ import java.nio.charset.StandardCharsets;
/*      */ import java.util.Collection;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Optional;
/*      */ import java.util.OptionalInt;
/*      */ import java.util.UUID;
/*      */ import java.util.function.Predicate;
/*      */ import javax.annotation.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class bfw
/*      */   extends aqm
/*      */ {
/*  134 */   public static final aqb bh = aqb.b(0.6F, 1.8F);
/*  135 */   private static final Map<aqx, aqb> b = (Map<aqx, aqb>)ImmutableMap.builder()
/*  136 */     .put(aqx.a, bh)
/*  137 */     .put(aqx.c, ah)
/*  138 */     .put(aqx.b, aqb.b(0.6F, 0.6F))
/*  139 */     .put(aqx.d, aqb.b(0.6F, 0.6F))
/*  140 */     .put(aqx.e, aqb.b(0.6F, 0.6F))
/*  141 */     .put(aqx.f, aqb.b(0.6F, 1.5F))
/*  142 */     .put(aqx.g, aqb.c(0.2F, 0.2F))
/*  143 */     .build();
/*      */ 
/*      */ 
/*      */   
/*  147 */   private static final us<Float> c = uv.a((Class)bfw.class, uu.c);
/*  148 */   private static final us<Integer> d = uv.a((Class)bfw.class, uu.b);
/*  149 */   protected static final us<Byte> bi = uv.a((Class)bfw.class, uu.a);
/*  150 */   protected static final us<Byte> bj = uv.a((Class)bfw.class, uu.a);
/*      */   
/*  152 */   protected static final us<md> bk = uv.a((Class)bfw.class, uu.p);
/*  153 */   protected static final us<md> bl = uv.a((Class)bfw.class, uu.p);
/*      */   
/*      */   private long e;
/*  156 */   public final bfv bm = new bfv(this);
/*  157 */   protected bji bn = new bji();
/*      */   
/*      */   public final biz bo;
/*      */   public bic bp;
/*  161 */   protected bhy bq = new bhy();
/*      */   
/*      */   protected int br;
/*      */   
/*      */   public float bs;
/*      */   
/*      */   public float bt;
/*      */   
/*      */   public int bu;
/*      */   
/*      */   public double bv;
/*      */   
/*      */   public double bw;
/*      */   
/*      */   public double bx;
/*      */   public double by;
/*      */   public double bz;
/*      */   public double bA;
/*      */   private int f;
/*      */   protected boolean bB;
/*  181 */   public final bft bC = new bft();
/*      */   
/*      */   public int bD;
/*      */   
/*      */   public int bE;
/*      */   public float bF;
/*      */   protected int bG;
/*  188 */   protected final float bH = 0.02F;
/*      */   private int g;
/*      */   private final GameProfile bJ;
/*      */   private boolean bK;
/*  192 */   private bmb bL = bmb.b;
/*  193 */   private final bly bM = i();
/*      */   
/*      */   @Nullable
/*      */   public bgi bI;
/*      */   
/*      */   public bfw(brx ☃, fx fx1, float f, GameProfile gameProfile) {
/*  199 */     super((aqe)aqe.bc, ☃);
/*  200 */     a_(a(gameProfile));
/*      */     
/*  202 */     this.bJ = gameProfile;
/*      */     
/*  204 */     this.bo = new biz(this.bm, !☃.v, this);
/*  205 */     this.bp = this.bo;
/*      */     
/*  207 */     b(fx1.u() + 0.5D, (fx1.v() + 1), fx1.w() + 0.5D, f, 0.0F);
/*      */     
/*  209 */     this.aN = 180.0F;
/*      */   }
/*      */   
/*      */   public boolean a(brx ☃, fx fx1, bru bru1) {
/*  213 */     if (!bru1.d()) {
/*  214 */       return false;
/*      */     }
/*  216 */     if (bru1 == bru.e) {
/*  217 */       return true;
/*      */     }
/*  219 */     if (eK()) {
/*  220 */       return false;
/*      */     }
/*  222 */     bmb bmb1 = dD();
/*  223 */     return (bmb1.a() || !bmb1.a(☃.p(), new cel(☃, fx1, false)));
/*      */   }
/*      */   
/*      */   public static ark.a ep() {
/*  227 */     return aqm.cL()
/*  228 */       .a(arl.f, 1.0D)
/*  229 */       .a(arl.d, 0.10000000149011612D)
/*  230 */       .a(arl.h)
/*  231 */       .a(arl.k);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void e() {
/*  236 */     super.e();
/*      */     
/*  238 */     this.R.a(c, Float.valueOf(0.0F));
/*  239 */     this.R.a(d, Integer.valueOf(0));
/*  240 */     this.R.a(bi, Byte.valueOf((byte)0));
/*  241 */     this.R.a(bj, Byte.valueOf((byte)1));
/*  242 */     this.R.a(bk, new md());
/*  243 */     this.R.a(bl, new md());
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {
/*  248 */     this.H = a_();
/*  249 */     if (a_()) {
/*  250 */       this.t = false;
/*      */     }
/*      */     
/*  253 */     if (this.bu > 0) {
/*  254 */       this.bu--;
/*      */     }
/*  256 */     if (em()) {
/*  257 */       this.f++;
/*  258 */       if (this.f > 100) {
/*  259 */         this.f = 100;
/*      */       }
/*      */       
/*  262 */       if (!this.l.v && this.l.M()) {
/*  263 */         a(false, true);
/*      */       }
/*  265 */     } else if (this.f > 0) {
/*  266 */       this.f++;
/*  267 */       if (this.f >= 110) {
/*  268 */         this.f = 0;
/*      */       }
/*      */     } 
/*      */     
/*  272 */     et();
/*      */     
/*  274 */     super.j();
/*      */     
/*  276 */     if (!this.l.v && 
/*  277 */       this.bp != null && !this.bp.a(this)) {
/*  278 */       m();
/*  279 */       this.bp = this.bo;
/*      */     } 
/*      */ 
/*      */     
/*  283 */     p();
/*      */     
/*  285 */     if (!this.l.v) {
/*  286 */       this.bq.a(this);
/*  287 */       a(aea.k);
/*  288 */       if (aX()) {
/*  289 */         a(aea.l);
/*      */       }
/*  291 */       if (bx()) {
/*  292 */         a(aea.n);
/*      */       }
/*  294 */       if (!em()) {
/*  295 */         a(aea.m);
/*      */       }
/*      */     } 
/*      */     
/*  299 */     int ☃ = 29999999;
/*  300 */     double d1 = afm.a(cD(), -2.9999999E7D, 2.9999999E7D);
/*  301 */     double d2 = afm.a(cH(), -2.9999999E7D, 2.9999999E7D);
/*  302 */     if (d1 != cD() || d2 != cH()) {
/*  303 */       d(d1, cE(), d2);
/*      */     }
/*      */     
/*  306 */     this.at++;
/*      */     
/*  308 */     bmb bmb1 = dD();
/*  309 */     if (!bmb.b(this.bL, bmb1)) {
/*      */ 
/*      */ 
/*      */       
/*  313 */       if (!bmb.d(this.bL, bmb1)) {
/*  314 */         eS();
/*      */       }
/*  316 */       this.bL = bmb1.i();
/*      */     } 
/*      */     
/*  319 */     o();
/*  320 */     this.bM.a();
/*  321 */     eu();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean eq() {
/*  330 */     return bu();
/*      */   }
/*      */   
/*      */   protected boolean er() {
/*  334 */     return bu();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean es() {
/*  342 */     return bu();
/*      */   }
/*      */   
/*      */   protected boolean et() {
/*  346 */     this.bB = a(aef.b);
/*  347 */     return this.bB;
/*      */   }
/*      */   
/*      */   private void o() {
/*  351 */     bmb ☃ = b(aqf.f);
/*  352 */     if (☃.b() == bmd.jY && !a(aef.b)) {
/*  353 */       c(new apu(apw.m, 200, 0, false, false, true));
/*      */     }
/*      */   }
/*      */   
/*      */   protected bly i() {
/*  358 */     return new bly();
/*      */   }
/*      */   
/*      */   private void p() {
/*  362 */     this.bv = this.by;
/*  363 */     this.bw = this.bz;
/*  364 */     this.bx = this.bA;
/*      */     
/*  366 */     double ☃ = cD() - this.by;
/*  367 */     double d1 = cE() - this.bz;
/*  368 */     double d2 = cH() - this.bA;
/*      */     
/*  370 */     double d3 = 10.0D;
/*  371 */     if (☃ > 10.0D) {
/*  372 */       this.by = cD();
/*  373 */       this.bv = this.by;
/*      */     } 
/*  375 */     if (d2 > 10.0D) {
/*  376 */       this.bA = cH();
/*  377 */       this.bx = this.bA;
/*      */     } 
/*  379 */     if (d1 > 10.0D) {
/*  380 */       this.bz = cE();
/*  381 */       this.bw = this.bz;
/*      */     } 
/*  383 */     if (☃ < -10.0D) {
/*  384 */       this.by = cD();
/*  385 */       this.bv = this.by;
/*      */     } 
/*  387 */     if (d2 < -10.0D) {
/*  388 */       this.bA = cH();
/*  389 */       this.bx = this.bA;
/*      */     } 
/*  391 */     if (d1 < -10.0D) {
/*  392 */       this.bz = cE();
/*  393 */       this.bw = this.bz;
/*      */     } 
/*      */     
/*  396 */     this.by += ☃ * 0.25D;
/*  397 */     this.bA += d2 * 0.25D;
/*  398 */     this.bz += d1 * 0.25D;
/*      */   }
/*      */   protected void eu() {
/*      */     aqx ☃, aqx1;
/*  402 */     if (!c(aqx.d)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  411 */     if (ef()) {
/*  412 */       ☃ = aqx.b;
/*  413 */     } else if (em()) {
/*  414 */       ☃ = aqx.c;
/*  415 */     } else if (bB()) {
/*  416 */       ☃ = aqx.d;
/*  417 */     } else if (dR()) {
/*  418 */       ☃ = aqx.e;
/*  419 */     } else if (bu() && !this.bC.b) {
/*  420 */       ☃ = aqx.f;
/*      */     } else {
/*  422 */       ☃ = aqx.a;
/*      */     } 
/*      */ 
/*      */     
/*  426 */     if (a_() || br() || c(☃)) {
/*  427 */       aqx1 = ☃;
/*  428 */     } else if (c(aqx.f)) {
/*      */       
/*  430 */       aqx1 = aqx.f;
/*      */     } else {
/*      */       
/*  433 */       aqx1 = aqx.d;
/*      */     } 
/*  435 */     b(aqx1);
/*      */   }
/*      */ 
/*      */   
/*      */   public int aj() {
/*  440 */     return this.bC.a ? 1 : 80;
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp av() {
/*  445 */     return adq.lG;
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp aw() {
/*  450 */     return adq.lE;
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp ax() {
/*  455 */     return adq.lF;
/*      */   }
/*      */ 
/*      */   
/*      */   public int bl() {
/*  460 */     return 10;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(adp ☃, float f1, float f2) {
/*  466 */     this.l.a(this, cD(), cE(), cH(), ☃, cu(), f1, f2);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adp ☃, adr adr1, float f1, float f2) {}
/*      */ 
/*      */   
/*      */   public adr cu() {
/*  474 */     return adr.h;
/*      */   }
/*      */ 
/*      */   
/*      */   protected int cv() {
/*  479 */     return 20;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(byte ☃) {
/*  484 */     if (☃ == 9) {
/*  485 */       s();
/*  486 */     } else if (☃ == 23) {
/*  487 */       this.bK = false;
/*  488 */     } else if (☃ == 22) {
/*  489 */       this.bK = true;
/*  490 */     } else if (☃ == 43) {
/*  491 */       a(hh.f);
/*      */     } else {
/*  493 */       super.a(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(hf ☃) {
/*  498 */     for (int i = 0; i < 5; i++) {
/*  499 */       double d1 = this.J.nextGaussian() * 0.02D;
/*  500 */       double d2 = this.J.nextGaussian() * 0.02D;
/*  501 */       double d3 = this.J.nextGaussian() * 0.02D;
/*  502 */       this.l.a(☃, d(1.0D), cF() + 1.0D, g(1.0D), d1, d2, d3);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void m() {
/*  507 */     this.bp = this.bo;
/*      */   }
/*      */ 
/*      */   
/*      */   public void ba() {
/*  512 */     if (er() && br()) {
/*  513 */       l();
/*  514 */       f(false);
/*      */       
/*      */       return;
/*      */     } 
/*  518 */     double ☃ = cD();
/*  519 */     double d1 = cE();
/*  520 */     double d2 = cH();
/*      */     
/*  522 */     super.ba();
/*  523 */     this.bs = this.bt;
/*  524 */     this.bt = 0.0F;
/*      */     
/*  526 */     q(cD() - ☃, cE() - d1, cH() - d2);
/*      */   }
/*      */ 
/*      */   
/*      */   public void ac() {
/*  531 */     b(aqx.a);
/*  532 */     super.ac();
/*  533 */     c(dx());
/*  534 */     this.aq = 0;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void dP() {
/*  539 */     super.dP();
/*  540 */     dA();
/*      */     
/*  542 */     this.aC = this.p;
/*      */   }
/*      */   
/*      */   public void k() {
/*      */     float ☃;
/*  547 */     if (this.br > 0) {
/*  548 */       this.br--;
/*      */     }
/*      */     
/*  551 */     if (this.l.ad() == aor.a && this.l.V().b(brt.i)) {
/*  552 */       if (dk() < dx() && 
/*  553 */         this.K % 20 == 0) {
/*  554 */         b(1.0F);
/*      */       }
/*      */       
/*  557 */       if (this.bq.c() && 
/*  558 */         this.K % 10 == 0) {
/*  559 */         this.bq.a(this.bq.a() + 1);
/*      */       }
/*      */     } 
/*      */     
/*  563 */     this.bm.j();
/*  564 */     this.bs = this.bt;
/*      */     
/*  566 */     super.k();
/*      */     
/*  568 */     this.aE = 0.02F;
/*  569 */     if (bA()) {
/*  570 */       this.aE = (float)(this.aE + 0.005999999865889549D);
/*      */     }
/*      */     
/*  573 */     q((float)b(arl.d));
/*      */ 
/*      */     
/*  576 */     if (!this.t || dl() || bB()) {
/*  577 */       ☃ = 0.0F;
/*      */     } else {
/*  579 */       ☃ = Math.min(0.1F, afm.a(c(cC())));
/*      */     } 
/*      */     
/*  582 */     this.bt += (☃ - this.bt) * 0.4F;
/*      */     
/*  584 */     if (dk() > 0.0F && !a_()) {
/*      */       dci dci;
/*  586 */       if (br() && !(ct()).y) {
/*      */         
/*  588 */         dci = cc().b(ct().cc()).c(1.0D, 0.0D, 1.0D);
/*      */       } else {
/*  590 */         dci = cc().c(1.0D, 0.5D, 1.0D);
/*      */       } 
/*      */       
/*  593 */       List<aqa> list = this.l.a(this, dci);
/*  594 */       for (int i = 0; i < list.size(); i++) {
/*  595 */         aqa aqa = list.get(i);
/*  596 */         if (!aqa.y) {
/*  597 */           c(aqa);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  602 */     j(eP());
/*  603 */     j(eQ());
/*  604 */     if ((!this.l.v && (this.C > 0.5F || aE())) || this.bC.b || em()) {
/*  605 */       eM();
/*      */     }
/*      */   }
/*      */   
/*      */   private void j(@Nullable md ☃) {
/*  610 */     if (☃ != null && (!☃.e("Silent") || !☃.q("Silent")) && this.l.t.nextInt(200) == 0) {
/*  611 */       String str = ☃.l("id");
/*  612 */       aqe.a(str).filter(☃ -> (☃ == aqe.af)).ifPresent(☃ -> {
/*      */             if (!bam.a(this.l, this)) {
/*      */               this.l.a((bfw)null, cD(), cE(), cH(), bam.a(this.l, this.l.t), cu(), 1.0F, bam.a(this.l.t));
/*      */             }
/*      */           });
/*      */     } 
/*      */   }
/*      */   
/*      */   private void c(aqa ☃) {
/*  621 */     ☃.a_(this);
/*      */   }
/*      */   
/*      */   public int ev() {
/*  625 */     return ((Integer)this.R.<Integer>a(d)).intValue();
/*      */   }
/*      */   
/*      */   public void s(int ☃) {
/*  629 */     this.R.b(d, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   public void t(int ☃) {
/*  633 */     int i = ev();
/*  634 */     this.R.b(d, Integer.valueOf(i + ☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(apk ☃) {
/*  639 */     super.a(☃);
/*  640 */     af();
/*      */     
/*  642 */     if (!a_()) {
/*  643 */       d(☃);
/*      */     }
/*      */     
/*  646 */     if (☃ != null) {
/*  647 */       n((
/*  648 */           -afm.b((this.ap + this.p) * 0.017453292F) * 0.1F), 0.10000000149011612D, (
/*      */           
/*  650 */           -afm.a((this.ap + this.p) * 0.017453292F) * 0.1F));
/*      */     } else {
/*      */       
/*  653 */       n(0.0D, 0.1D, 0.0D);
/*      */     } 
/*      */     
/*  656 */     a(aea.M);
/*  657 */     a(aea.i.b(aea.l));
/*  658 */     a(aea.i.b(aea.m));
/*  659 */     am();
/*  660 */     b(0, false);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void dn() {
/*  665 */     super.dn();
/*  666 */     if (!this.l.V().b(brt.c)) {
/*  667 */       ew();
/*  668 */       this.bm.k();
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void ew() {
/*  673 */     for (int ☃ = 0; ☃ < this.bm.Z_(); ☃++) {
/*  674 */       bmb bmb1 = this.bm.a(☃);
/*  675 */       if (!bmb1.a() && bpu.e(bmb1)) {
/*  676 */         this.bm.b(☃);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp e(apk ☃) {
/*  683 */     if (☃ == apk.c) {
/*  684 */       return adq.lA;
/*      */     }
/*  686 */     if (☃ == apk.h) {
/*  687 */       return adq.lz;
/*      */     }
/*  689 */     if (☃ == apk.u) {
/*  690 */       return adq.lB;
/*      */     }
/*  692 */     return adq.ly;
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp dq() {
/*  697 */     return adq.lx;
/*      */   }
/*      */   
/*      */   public boolean a(boolean ☃) {
/*  701 */     return (a(this.bm.a(this.bm.d, (☃ && !this.bm.f().a()) ? this.bm.f().E() : 1), false, true) != null);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public bcv a(bmb ☃, boolean bool) {
/*  706 */     return a(☃, false, bool);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public bcv a(bmb ☃, boolean bool1, boolean bool2) {
/*  711 */     if (☃.a()) {
/*  712 */       return null;
/*      */     }
/*      */ 
/*      */     
/*  716 */     if (this.l.v) {
/*  717 */       a(aot.a);
/*      */     }
/*      */     
/*  720 */     double d = cG() - 0.30000001192092896D;
/*  721 */     bcv bcv = new bcv(this.l, cD(), d, cH(), ☃);
/*  722 */     bcv.a(40);
/*      */     
/*  724 */     if (bool2) {
/*  725 */       bcv.c(bS());
/*      */     }
/*      */     
/*  728 */     if (bool1) {
/*  729 */       float f1 = this.J.nextFloat() * 0.5F;
/*  730 */       float f2 = this.J.nextFloat() * 6.2831855F;
/*  731 */       bcv.n((
/*  732 */           -afm.a(f2) * f1), 0.20000000298023224D, (
/*      */           
/*  734 */           afm.b(f2) * f1));
/*      */     } else {
/*      */       
/*  737 */       float f1 = 0.3F;
/*  738 */       float f2 = afm.a(this.q * 0.017453292F);
/*  739 */       float f3 = afm.b(this.q * 0.017453292F);
/*  740 */       float f4 = afm.a(this.p * 0.017453292F);
/*  741 */       float f5 = afm.b(this.p * 0.017453292F);
/*      */       
/*  743 */       float f6 = this.J.nextFloat() * 6.2831855F;
/*  744 */       float f7 = 0.02F * this.J.nextFloat();
/*      */       
/*  746 */       bcv.n((-f4 * f3 * 0.3F) + 
/*  747 */           Math.cos(f6) * f7, (-f2 * 0.3F + 0.1F + (this.J
/*  748 */           .nextFloat() - this.J.nextFloat()) * 0.1F), (f5 * f3 * 0.3F) + 
/*  749 */           Math.sin(f6) * f7);
/*      */     } 
/*      */     
/*  752 */     return bcv;
/*      */   }
/*      */   
/*      */   public float c(ceh ☃) {
/*  756 */     float f = this.bm.a(☃);
/*  757 */     if (f > 1.0F) {
/*  758 */       int i = bpu.f(this);
/*  759 */       bmb bmb1 = dD();
/*      */       
/*  761 */       if (i > 0 && !bmb1.a()) {
/*  762 */         f += (i * i + 1);
/*      */       }
/*      */     } 
/*      */     
/*  766 */     if (apv.a(this)) {
/*  767 */       f *= 1.0F + (apv.b(this) + 1) * 0.2F;
/*      */     }
/*  769 */     if (a(apw.d)) {
/*      */       float f1;
/*      */ 
/*      */       
/*  773 */       switch (b(apw.d).c()) {
/*      */         case 0:
/*  775 */           f1 = 0.3F;
/*      */           break;
/*      */         case 1:
/*  778 */           f1 = 0.09F;
/*      */           break;
/*      */         case 2:
/*  781 */           f1 = 0.0027F;
/*      */           break;
/*      */         
/*      */         default:
/*  785 */           f1 = 8.1E-4F;
/*      */           break;
/*      */       } 
/*  788 */       f *= f1;
/*      */     } 
/*      */     
/*  791 */     if (a(aef.b) && !bpu.h(this)) {
/*  792 */       f /= 5.0F;
/*      */     }
/*  794 */     if (!this.t) {
/*  795 */       f /= 5.0F;
/*      */     }
/*      */     
/*  798 */     return f;
/*      */   }
/*      */   
/*      */   public boolean d(ceh ☃) {
/*  802 */     return (!☃.q() || this.bm.f().b(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(md ☃) {
/*  807 */     super.a(☃);
/*      */     
/*  809 */     a_(a(this.bJ));
/*  810 */     mj mj = ☃.d("Inventory", 10);
/*  811 */     this.bm.b(mj);
/*  812 */     this.bm.d = ☃.h("SelectedItemSlot");
/*  813 */     this.f = ☃.g("SleepTimer");
/*      */     
/*  815 */     this.bF = ☃.j("XpP");
/*  816 */     this.bD = ☃.h("XpLevel");
/*  817 */     this.bE = ☃.h("XpTotal");
/*  818 */     this.bG = ☃.h("XpSeed");
/*  819 */     if (this.bG == 0) {
/*  820 */       this.bG = this.J.nextInt();
/*      */     }
/*  822 */     s(☃.h("Score"));
/*      */     
/*  824 */     this.bq.a(☃);
/*  825 */     this.bC.b(☃);
/*      */     
/*  827 */     a(arl.d).a(this.bC.b());
/*      */     
/*  829 */     if (☃.c("EnderItems", 9)) {
/*  830 */       this.bn.a(☃.d("EnderItems", 10));
/*      */     }
/*      */     
/*  833 */     if (☃.c("ShoulderEntityLeft", 10)) {
/*  834 */       h(☃.p("ShoulderEntityLeft"));
/*      */     }
/*  836 */     if (☃.c("ShoulderEntityRight", 10)) {
/*  837 */       i(☃.p("ShoulderEntityRight"));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(md ☃) {
/*  843 */     super.b(☃);
/*  844 */     ☃.b("DataVersion", w.a().getWorldVersion());
/*  845 */     ☃.a("Inventory", this.bm.a(new mj()));
/*  846 */     ☃.b("SelectedItemSlot", this.bm.d);
/*  847 */     ☃.a("SleepTimer", (short)this.f);
/*  848 */     ☃.a("XpP", this.bF);
/*  849 */     ☃.b("XpLevel", this.bD);
/*  850 */     ☃.b("XpTotal", this.bE);
/*  851 */     ☃.b("XpSeed", this.bG);
/*  852 */     ☃.b("Score", ev());
/*      */     
/*  854 */     this.bq.b(☃);
/*  855 */     this.bC.a(☃);
/*  856 */     ☃.a("EnderItems", this.bn.g());
/*      */     
/*  858 */     if (!eP().isEmpty()) {
/*  859 */       ☃.a("ShoulderEntityLeft", eP());
/*      */     }
/*  861 */     if (!eQ().isEmpty()) {
/*  862 */       ☃.a("ShoulderEntityRight", eQ());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(apk ☃) {
/*  868 */     if (super.b(☃)) {
/*  869 */       return true;
/*      */     }
/*      */     
/*  872 */     if (☃ == apk.h)
/*  873 */       return !this.l.V().b(brt.A); 
/*  874 */     if (☃ == apk.k)
/*  875 */       return !this.l.V().b(brt.B); 
/*  876 */     if (☃.p()) {
/*  877 */       return !this.l.V().b(brt.C);
/*      */     }
/*  879 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(apk ☃, float f) {
/*  884 */     if (b(☃)) {
/*  885 */       return false;
/*      */     }
/*  887 */     if (this.bC.a && !☃.h()) {
/*  888 */       return false;
/*      */     }
/*      */     
/*  891 */     this.aI = 0;
/*  892 */     if (dl()) {
/*  893 */       return false;
/*      */     }
/*      */     
/*  896 */     eM();
/*      */     
/*  898 */     if (☃.s()) {
/*  899 */       if (this.l.ad() == aor.a) {
/*  900 */         f = 0.0F;
/*      */       }
/*  902 */       if (this.l.ad() == aor.b) {
/*  903 */         f = Math.min(f / 2.0F + 1.0F, f);
/*      */       }
/*  905 */       if (this.l.ad() == aor.d) {
/*  906 */         f = f * 3.0F / 2.0F;
/*      */       }
/*      */     } 
/*      */     
/*  910 */     if (f == 0.0F) {
/*  911 */       return false;
/*      */     }
/*      */     
/*  914 */     return super.a(☃, f);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void d(aqm ☃) {
/*  919 */     super.d(☃);
/*      */     
/*  921 */     if (☃.dD().b() instanceof bkd) {
/*  922 */       p(true);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean a(bfw ☃) {
/*  927 */     ddp ddp1 = bG();
/*  928 */     ddp ddp2 = ☃.bG();
/*      */     
/*  930 */     if (ddp1 == null) {
/*  931 */       return true;
/*      */     }
/*  933 */     if (!ddp1.a(ddp2)) {
/*  934 */       return true;
/*      */     }
/*  936 */     return ddp1.h();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(apk ☃, float f) {
/*  941 */     this.bm.a(☃, f);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void p(float ☃) {
/*  946 */     if (this.bc.b() != bmd.qn) {
/*      */       return;
/*      */     }
/*  949 */     if (!this.l.v) {
/*  950 */       b(aea.c.b(this.bc.b()));
/*      */     }
/*  952 */     if (☃ >= 3.0F) {
/*  953 */       int i = 1 + afm.d(☃);
/*  954 */       aot aot = dX();
/*  955 */       this.bc.a(i, this, bfw1 -> bfw1.d(☃));
/*  956 */       if (this.bc.a()) {
/*      */         
/*  958 */         if (aot == aot.a) {
/*  959 */           a(aqf.a, bmb.b);
/*      */         } else {
/*  961 */           a(aqf.b, bmb.b);
/*      */         } 
/*  963 */         this.bc = bmb.b;
/*  964 */         a(adq.mV, 0.8F, 0.8F + this.l.t.nextFloat() * 0.4F);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void e(apk ☃, float f) {
/*  971 */     if (b(☃)) {
/*      */       return;
/*      */     }
/*  974 */     f = c(☃, f);
/*  975 */     f = d(☃, f);
/*      */     
/*  977 */     float f1 = f;
/*  978 */     f = Math.max(f - dT(), 0.0F);
/*  979 */     s(dT() - f1 - f);
/*      */     
/*  981 */     float f2 = f1 - f;
/*  982 */     if (f2 > 0.0F && f2 < 3.4028235E37F) {
/*  983 */       a(aea.K, Math.round(f2 * 10.0F));
/*      */     }
/*      */     
/*  986 */     if (f == 0.0F) {
/*      */       return;
/*      */     }
/*      */     
/*  990 */     t(☃.g());
/*  991 */     float f3 = dk();
/*  992 */     c(dk() - f);
/*  993 */     dv().a(☃, f3, f);
/*  994 */     if (f < 3.4028235E37F) {
/*  995 */       a(aea.I, Math.round(f * 10.0F));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected boolean cP() {
/* 1001 */     return (!this.bC.b && super.cP());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cdf ☃) {}
/*      */ 
/*      */   
/*      */   public void a(bqy ☃) {}
/*      */ 
/*      */   
/*      */   public void a(cco ☃) {}
/*      */ 
/*      */   
/*      */   public void a(cdj ☃) {}
/*      */ 
/*      */   
/*      */   public void a(ccz ☃) {}
/*      */ 
/*      */   
/*      */   public void a(bbb ☃, aon aon1) {}
/*      */   
/*      */   public OptionalInt a(@Nullable aox ☃) {
/* 1023 */     return OptionalInt.empty();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(int ☃, bqw bqw1, int i, int j, boolean bool1, boolean bool2) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(bmb ☃, aot aot1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public aou a(aqa ☃, aot aot1) {
/* 1039 */     if (a_()) {
/* 1040 */       if (☃ instanceof aox) {
/* 1041 */         a((aox)☃);
/*      */       }
/* 1043 */       return aou.c;
/*      */     } 
/*      */     
/* 1046 */     bmb bmb1 = b(aot1);
/*      */     
/* 1048 */     bmb bmb2 = bmb1.i();
/* 1049 */     aou aou = ☃.a(this, aot1);
/* 1050 */     if (aou.a()) {
/* 1051 */       if (this.bC.d && bmb1 == b(aot1) && bmb1.E() < bmb2.E()) {
/* 1052 */         bmb1.e(bmb2.E());
/*      */       }
/* 1054 */       return aou;
/*      */     } 
/*      */     
/* 1057 */     if (!bmb1.a() && ☃ instanceof aqm) {
/*      */       
/* 1059 */       if (this.bC.d) {
/* 1060 */         bmb1 = bmb2;
/*      */       }
/* 1062 */       aou aou1 = bmb1.a(this, (aqm)☃, aot1);
/* 1063 */       if (aou1.a()) {
/*      */         
/* 1065 */         if (bmb1.a() && !this.bC.d) {
/* 1066 */           a(aot1, bmb.b);
/*      */         }
/* 1068 */         return aou1;
/*      */       } 
/*      */     } 
/* 1071 */     return aou.c;
/*      */   }
/*      */ 
/*      */   
/*      */   public double bb() {
/* 1076 */     return -0.35D;
/*      */   }
/*      */ 
/*      */   
/*      */   public void bf() {
/* 1081 */     super.bf();
/*      */     
/* 1083 */     this.j = 0;
/*      */   }
/*      */ 
/*      */   
/*      */   protected boolean dI() {
/* 1088 */     return (super.dI() || em());
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean cT() {
/* 1093 */     return !this.bC.b;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected dcn a(dcn ☃, aqr aqr1) {
/* 1102 */     if (!this.bC.b && (aqr1 == aqr.a || aqr1 == aqr.b) && es() && q()) {
/* 1103 */       double d1 = ☃.b;
/* 1104 */       double d2 = ☃.d;
/* 1105 */       double d3 = 0.05D;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1110 */       while (d1 != 0.0D && this.l.a_(this, cc().d(d1, -this.G, 0.0D))) {
/* 1111 */         if (d1 < 0.05D && d1 >= -0.05D) {
/* 1112 */           d1 = 0.0D; continue;
/* 1113 */         }  if (d1 > 0.0D) {
/* 1114 */           d1 -= 0.05D; continue;
/*      */         } 
/* 1116 */         d1 += 0.05D;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1121 */       while (d2 != 0.0D && this.l.a_(this, cc().d(0.0D, -this.G, d2))) {
/* 1122 */         if (d2 < 0.05D && d2 >= -0.05D) {
/* 1123 */           d2 = 0.0D; continue;
/* 1124 */         }  if (d2 > 0.0D) {
/* 1125 */           d2 -= 0.05D; continue;
/*      */         } 
/* 1127 */         d2 += 0.05D;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1132 */       while (d1 != 0.0D && d2 != 0.0D && this.l.a_(this, cc().d(d1, -this.G, d2))) {
/* 1133 */         if (d1 < 0.05D && d1 >= -0.05D) {
/* 1134 */           d1 = 0.0D;
/* 1135 */         } else if (d1 > 0.0D) {
/* 1136 */           d1 -= 0.05D;
/*      */         } else {
/* 1138 */           d1 += 0.05D;
/*      */         } 
/*      */         
/* 1141 */         if (d2 < 0.05D && d2 >= -0.05D) {
/* 1142 */           d2 = 0.0D; continue;
/* 1143 */         }  if (d2 > 0.0D) {
/* 1144 */           d2 -= 0.05D; continue;
/*      */         } 
/* 1146 */         d2 += 0.05D;
/*      */       } 
/*      */       
/* 1149 */       ☃ = new dcn(d1, ☃.c, d2);
/*      */     } 
/* 1151 */     return ☃;
/*      */   }
/*      */   
/*      */   private boolean q() {
/* 1155 */     return (this.t || (this.C < this.G && !this.l.a_(this, cc().d(0.0D, (this.C - this.G), 0.0D))));
/*      */   }
/*      */   public void f(aqa ☃) {
/*      */     float f2;
/* 1159 */     if (!☃.bL()) {
/*      */       return;
/*      */     }
/* 1162 */     if (☃.t(this)) {
/*      */       return;
/*      */     }
/*      */     
/* 1166 */     float f1 = (float)b(arl.f);
/*      */ 
/*      */     
/* 1169 */     if (☃ instanceof aqm) {
/* 1170 */       f2 = bpu.a(dD(), ((aqm)☃).dC());
/*      */     } else {
/* 1172 */       f2 = bpu.a(dD(), aqq.a);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1177 */     float f3 = u(0.5F);
/* 1178 */     f1 *= 0.2F + f3 * f3 * 0.8F;
/* 1179 */     f2 *= f3;
/*      */     
/* 1181 */     eS();
/*      */     
/* 1183 */     if (f1 > 0.0F || f2 > 0.0F) {
/* 1184 */       boolean bool1 = (f3 > 0.9F);
/*      */       
/* 1186 */       boolean bool2 = false;
/* 1187 */       int i = 0;
/* 1188 */       i += bpu.b(this);
/*      */       
/* 1190 */       if (bA() && bool1) {
/* 1191 */         this.l.a((bfw)null, cD(), cE(), cH(), adq.lp, cu(), 1.0F, 1.0F);
/* 1192 */         i++;
/* 1193 */         bool2 = true;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1198 */       boolean bool3 = (bool1 && this.C > 0.0F && !this.t && !c_() && !aE() && !a(apw.o) && !br() && ☃ instanceof aqm);
/*      */       
/* 1200 */       bool3 = (bool3 && !bA());
/* 1201 */       if (bool3) {
/* 1202 */         f1 *= 1.5F;
/*      */       }
/* 1204 */       f1 += f2;
/*      */       
/* 1206 */       boolean bool4 = false;
/*      */ 
/*      */       
/* 1209 */       double d = (this.A - this.z);
/* 1210 */       if (bool1 && !bool3 && !bool2 && this.t && d < dN()) {
/*      */         
/* 1212 */         bmb bmb1 = b(aot.a);
/* 1213 */         if (bmb1.b() instanceof bnf) {
/* 1214 */           bool4 = true;
/*      */         }
/*      */       } 
/*      */       
/* 1218 */       float f = 0.0F;
/* 1219 */       boolean bool5 = false;
/* 1220 */       int j = bpu.c(this);
/*      */       
/* 1222 */       if (☃ instanceof aqm) {
/* 1223 */         f = ((aqm)☃).dk();
/*      */ 
/*      */         
/* 1226 */         if (j > 0 && !☃.bq()) {
/* 1227 */           bool5 = true;
/* 1228 */           ☃.f(1);
/*      */         } 
/*      */       } 
/*      */       
/* 1232 */       dcn dcn = ☃.cC();
/*      */       
/* 1234 */       boolean bool6 = ☃.a(apk.a(this), f1);
/* 1235 */       if (bool6) {
/* 1236 */         if (i > 0) {
/* 1237 */           if (☃ instanceof aqm) {
/* 1238 */             ((aqm)☃).a(i * 0.5F, afm.a(this.p * 0.017453292F), -afm.b(this.p * 0.017453292F));
/*      */           } else {
/* 1240 */             ☃.i((-afm.a(this.p * 0.017453292F) * i * 0.5F), 0.1D, (afm.b(this.p * 0.017453292F) * i * 0.5F));
/*      */           } 
/* 1242 */           f(cC().d(0.6D, 1.0D, 0.6D));
/* 1243 */           g(false);
/*      */         } 
/* 1245 */         if (bool4) {
/* 1246 */           float f4 = 1.0F + bpu.a(this) * f1;
/* 1247 */           List<aqm> list = this.l.a(aqm.class, ☃.cc().c(1.0D, 0.25D, 1.0D));
/* 1248 */           for (aqm aqm1 : list) {
/* 1249 */             if (aqm1 == this || aqm1 == ☃ || r(aqm1)) {
/*      */               continue;
/*      */             }
/*      */             
/* 1253 */             if (aqm1 instanceof bcn && ((bcn)aqm1).q()) {
/*      */               continue;
/*      */             }
/*      */             
/* 1257 */             if (h(aqm1) < 9.0D) {
/* 1258 */               aqm1.a(0.4F, afm.a(this.p * 0.017453292F), -afm.b(this.p * 0.017453292F));
/* 1259 */               aqm1.a(apk.a(this), f4);
/*      */             } 
/*      */           } 
/* 1262 */           this.l.a((bfw)null, cD(), cE(), cH(), adq.ls, cu(), 1.0F, 1.0F);
/* 1263 */           ex();
/*      */         } 
/*      */         
/* 1266 */         if (☃ instanceof aah && ☃.w) {
/* 1267 */           ((aah)☃).b.a(new rc(☃));
/* 1268 */           ☃.w = false;
/* 1269 */           ☃.f(dcn);
/*      */         } 
/*      */         
/* 1272 */         if (bool3) {
/* 1273 */           this.l.a((bfw)null, cD(), cE(), cH(), adq.lo, cu(), 1.0F, 1.0F);
/* 1274 */           a(☃);
/*      */         } 
/*      */         
/* 1277 */         if (!bool3 && !bool4) {
/* 1278 */           if (bool1) {
/* 1279 */             this.l.a((bfw)null, cD(), cE(), cH(), adq.lr, cu(), 1.0F, 1.0F);
/*      */           } else {
/* 1281 */             this.l.a((bfw)null, cD(), cE(), cH(), adq.lt, cu(), 1.0F, 1.0F);
/*      */           } 
/*      */         }
/*      */         
/* 1285 */         if (f2 > 0.0F) {
/* 1286 */           b(☃);
/*      */         }
/*      */         
/* 1289 */         z(☃);
/*      */         
/* 1291 */         if (☃ instanceof aqm) {
/* 1292 */           bpu.a((aqm)☃, this);
/*      */         }
/* 1294 */         bpu.b(this, ☃);
/*      */         
/* 1296 */         bmb bmb1 = dD();
/* 1297 */         aqa aqa1 = ☃;
/* 1298 */         if (☃ instanceof bbp) {
/* 1299 */           aqa1 = ((bbp)☃).b;
/*      */         }
/* 1301 */         if (!this.l.v && !bmb1.a() && aqa1 instanceof aqm) {
/* 1302 */           bmb1.a((aqm)aqa1, this);
/*      */ 
/*      */           
/* 1305 */           if (bmb1.a()) {
/* 1306 */             a(aot.a, bmb.b);
/*      */           }
/*      */         } 
/* 1309 */         if (☃ instanceof aqm) {
/* 1310 */           float f4 = f - ((aqm)☃).dk();
/*      */           
/* 1312 */           a(aea.F, Math.round(f4 * 10.0F));
/*      */           
/* 1314 */           if (j > 0) {
/* 1315 */             ☃.f(j * 4);
/*      */           }
/*      */ 
/*      */           
/* 1319 */           if (this.l instanceof aag && f4 > 2.0F) {
/* 1320 */             int k = (int)(f4 * 0.5D);
/* 1321 */             ((aag)this.l).a(hh.h, ☃.cD(), ☃.e(0.5D), ☃.cH(), k, 0.1D, 0.0D, 0.1D, 0.2D);
/*      */           } 
/*      */         } 
/*      */         
/* 1325 */         t(0.1F);
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/* 1331 */         this.l.a((bfw)null, cD(), cE(), cH(), adq.lq, cu(), 1.0F, 1.0F);
/*      */         
/* 1333 */         if (bool5) {
/* 1334 */           ☃.am();
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void g(aqm ☃) {
/* 1342 */     f(☃);
/*      */   }
/*      */   
/*      */   public void p(boolean ☃) {
/* 1346 */     float f = 0.25F + bpu.f(this) * 0.05F;
/*      */     
/* 1348 */     if (☃) {
/* 1349 */       f += 0.75F;
/*      */     }
/*      */     
/* 1352 */     if (this.J.nextFloat() < f) {
/* 1353 */       eT().a(bmd.qn, 100);
/* 1354 */       ec();
/* 1355 */       this.l.a(this, (byte)30);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqa ☃) {}
/*      */ 
/*      */   
/*      */   public void b(aqa ☃) {}
/*      */ 
/*      */   
/*      */   public void ex() {
/* 1367 */     double ☃ = -afm.a(this.p * 0.017453292F);
/* 1368 */     double d1 = afm.b(this.p * 0.017453292F);
/* 1369 */     if (this.l instanceof aag) {
/* 1370 */       ((aag)this.l).a(hh.W, cD() + ☃, e(0.5D), cH() + d1, 0, ☃, 0.0D, d1, 0.0D);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void ey() {}
/*      */ 
/*      */   
/*      */   public void ad() {
/* 1379 */     super.ad();
/* 1380 */     this.bo.b(this);
/* 1381 */     if (this.bp != null) {
/* 1382 */       this.bp.b(this);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean ez() {
/* 1387 */     return false;
/*      */   }
/*      */   
/*      */   public GameProfile eA() {
/* 1391 */     return this.bJ;
/*      */   }
/*      */   
/*      */   public enum a {
/* 1395 */     a,
/* 1396 */     b((String)new of("block.minecraft.bed.no_sleep")),
/* 1397 */     c((String)new of("block.minecraft.bed.too_far_away")),
/* 1398 */     d((String)new of("block.minecraft.bed.obstructed")),
/* 1399 */     e,
/* 1400 */     f((String)new of("block.minecraft.bed.not_safe"));
/*      */     
/*      */     @Nullable
/*      */     private final nr g;
/*      */     
/*      */     a() {
/* 1406 */       this.g = null;
/*      */     }
/*      */     
/*      */     a(nr ☃) {
/* 1410 */       this.g = ☃;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public nr a() {
/* 1415 */       return this.g;
/*      */     }
/*      */   }
/*      */   
/*      */   public Either<a, afx> a(fx ☃) {
/* 1420 */     b(☃);
/*      */     
/* 1422 */     this.f = 0;
/*      */     
/* 1424 */     return Either.right(afx.a);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(boolean ☃, boolean bool1) {
/* 1435 */     super.en();
/*      */     
/* 1437 */     if (this.l instanceof aag && bool1) {
/* 1438 */       ((aag)this.l).n_();
/*      */     }
/*      */     
/* 1441 */     this.f = ☃ ? 0 : 100;
/*      */   }
/*      */ 
/*      */   
/*      */   public void en() {
/* 1446 */     a(true, true);
/*      */   }
/*      */   
/*      */   public static Optional<dcn> a(aag ☃, fx fx1, float f, boolean bool1, boolean bool2) {
/* 1450 */     ceh ceh = ☃.d_(fx1);
/* 1451 */     buo buo = ceh.b();
/* 1452 */     if (buo instanceof bzj && ((Integer)ceh.c(bzj.a)).intValue() > 0 && bzj.a(☃)) {
/* 1453 */       Optional<dcn> optional = bzj.a(aqe.bc, ☃, fx1);
/* 1454 */       if (!bool2 && optional.isPresent()) {
/* 1455 */         ☃.a(fx1, ceh.a(bzj.a, Integer.valueOf(((Integer)ceh.c(bzj.a)).intValue() - 1)), 3);
/*      */       }
/* 1457 */       return optional;
/* 1458 */     }  if (buo instanceof buj && buj.a(☃))
/*      */     {
/* 1460 */       return buj.a(aqe.bc, ☃, fx1, f);
/*      */     }
/*      */     
/* 1463 */     if (!bool1) {
/* 1464 */       return Optional.empty();
/*      */     }
/*      */     
/* 1467 */     boolean bool3 = buo.ai_();
/* 1468 */     boolean bool4 = ☃.d_(fx1.b()).b().ai_();
/*      */     
/* 1470 */     if (bool3 && bool4) {
/* 1471 */       return Optional.of(new dcn(fx1.u() + 0.5D, fx1.v() + 0.1D, fx1.w() + 0.5D));
/*      */     }
/*      */     
/* 1474 */     return Optional.empty();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean eB() {
/* 1479 */     return (em() && this.f >= 100);
/*      */   }
/*      */   
/*      */   public int eC() {
/* 1483 */     return this.f;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(nr ☃, boolean bool) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(vk ☃) {
/* 1498 */     b(aea.i.b(☃));
/*      */   }
/*      */   
/*      */   public void a(vk ☃, int i) {
/* 1502 */     a(aea.i.b(☃), i);
/*      */   }
/*      */   
/*      */   public void b(adx<?> ☃) {
/* 1506 */     a(☃, 1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adx<?> ☃, int i) {}
/*      */ 
/*      */   
/*      */   public void a(adx<?> ☃) {}
/*      */   
/*      */   public int a(Collection<boq<?>> ☃) {
/* 1516 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(vk[] ☃) {}
/*      */   
/*      */   public int b(Collection<boq<?>> ☃) {
/* 1523 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public void dK() {
/* 1528 */     super.dK();
/*      */     
/* 1530 */     a(aea.D);
/* 1531 */     if (bA()) {
/* 1532 */       t(0.2F);
/*      */     } else {
/* 1534 */       t(0.05F);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void g(dcn ☃) {
/* 1540 */     double d1 = cD();
/* 1541 */     double d2 = cE();
/* 1542 */     double d3 = cH();
/*      */     
/* 1544 */     if (bB() && !br()) {
/* 1545 */       double d4 = (bh()).c;
/* 1546 */       double d5 = (d4 < -0.2D) ? 0.085D : 0.06D;
/*      */       
/* 1548 */       if (d4 <= 0.0D || this.aQ || !this.l.d_(new fx(cD(), cE() + 1.0D - 0.1D, cH())).m().c()) {
/* 1549 */         dcn dcn1 = cC();
/* 1550 */         f(dcn1.b(0.0D, (d4 - dcn1.c) * d5, 0.0D));
/*      */       } 
/*      */     } 
/*      */     
/* 1554 */     if (this.bC.b && !br()) {
/* 1555 */       double d = (cC()).c;
/* 1556 */       float f = this.aE;
/*      */       
/* 1558 */       this.aE = this.bC.a() * (bA() ? 2 : true);
/* 1559 */       super.g(☃);
/* 1560 */       dcn dcn1 = cC();
/* 1561 */       n(dcn1.b, d * 0.6D, dcn1.d);
/* 1562 */       this.aE = f;
/*      */       
/* 1564 */       this.C = 0.0F;
/*      */       
/* 1566 */       b(7, false);
/*      */     } else {
/* 1568 */       super.g(☃);
/*      */     } 
/*      */     
/* 1571 */     p(cD() - d1, cE() - d2, cH() - d3);
/*      */   }
/*      */ 
/*      */   
/*      */   public void aJ() {
/* 1576 */     if (this.bC.b) {
/* 1577 */       h(false);
/*      */     } else {
/* 1579 */       super.aJ();
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean f(fx ☃) {
/* 1584 */     return !this.l.d_(☃).o(this.l, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public float dN() {
/* 1589 */     return (float)b(arl.d);
/*      */   }
/*      */   
/*      */   public void p(double ☃, double d1, double d2) {
/* 1593 */     if (br()) {
/*      */       return;
/*      */     }
/*      */     
/* 1597 */     if (bB()) {
/* 1598 */       int i = Math.round(afm.a(☃ * ☃ + d1 * d1 + d2 * d2) * 100.0F);
/* 1599 */       if (i > 0) {
/* 1600 */         a(aea.B, i);
/* 1601 */         t(0.01F * i * 0.01F);
/*      */       } 
/* 1603 */     } else if (a(aef.b)) {
/* 1604 */       int i = Math.round(afm.a(☃ * ☃ + d1 * d1 + d2 * d2) * 100.0F);
/* 1605 */       if (i > 0) {
/* 1606 */         a(aea.v, i);
/* 1607 */         t(0.01F * i * 0.01F);
/*      */       } 
/* 1609 */     } else if (aE()) {
/* 1610 */       int i = Math.round(afm.a(☃ * ☃ + d2 * d2) * 100.0F);
/* 1611 */       if (i > 0) {
/* 1612 */         a(aea.r, i);
/* 1613 */         t(0.01F * i * 0.01F);
/*      */       } 
/* 1615 */     } else if (c_()) {
/* 1616 */       if (d1 > 0.0D) {
/* 1617 */         a(aea.t, (int)Math.round(d1 * 100.0D));
/*      */       }
/* 1619 */     } else if (this.t) {
/* 1620 */       int i = Math.round(afm.a(☃ * ☃ + d2 * d2) * 100.0F);
/* 1621 */       if (i > 0) {
/* 1622 */         if (bA()) {
/* 1623 */           a(aea.q, i);
/* 1624 */           t(0.1F * i * 0.01F);
/* 1625 */         } else if (bz()) {
/* 1626 */           a(aea.p, i);
/* 1627 */           t(0.0F * i * 0.01F);
/*      */         } else {
/* 1629 */           a(aea.o, i);
/* 1630 */           t(0.0F * i * 0.01F);
/*      */         } 
/*      */       }
/* 1633 */     } else if (ef()) {
/* 1634 */       int i = Math.round(afm.a(☃ * ☃ + d1 * d1 + d2 * d2) * 100.0F);
/* 1635 */       a(aea.A, i);
/*      */     } else {
/* 1637 */       int i = Math.round(afm.a(☃ * ☃ + d2 * d2) * 100.0F);
/* 1638 */       if (i > 25) {
/* 1639 */         a(aea.u, i);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private void q(double ☃, double d1, double d2) {
/* 1645 */     if (br()) {
/* 1646 */       int i = Math.round(afm.a(☃ * ☃ + d1 * d1 + d2 * d2) * 100.0F);
/* 1647 */       if (i > 0) {
/* 1648 */         aqa aqa = ct();
/* 1649 */         if (aqa instanceof bhl) {
/* 1650 */           a(aea.w, i);
/* 1651 */         } else if (aqa instanceof bhn) {
/* 1652 */           a(aea.x, i);
/* 1653 */         } else if (aqa instanceof ban) {
/* 1654 */           a(aea.y, i);
/* 1655 */         } else if (aqa instanceof bbb) {
/* 1656 */           a(aea.z, i);
/* 1657 */         } else if (aqa instanceof bed) {
/* 1658 */           a(aea.C, i);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(float ☃, float f1) {
/* 1669 */     if (this.bC.c) {
/* 1670 */       return false;
/*      */     }
/*      */     
/* 1673 */     if (☃ >= 2.0F) {
/* 1674 */       a(aea.s, (int)Math.round(☃ * 100.0D));
/*      */     }
/* 1676 */     return super.b(☃, f1);
/*      */   }
/*      */   
/*      */   public boolean eD() {
/* 1680 */     if (!this.t && !ef() && !aE() && !a(apw.y)) {
/* 1681 */       bmb ☃ = b(aqf.e);
/* 1682 */       if (☃.b() == bmd.qo && bld.d(☃)) {
/* 1683 */         eE();
/* 1684 */         return true;
/*      */       } 
/*      */     } 
/* 1687 */     return false;
/*      */   }
/*      */   
/*      */   public void eE() {
/* 1691 */     b(7, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public void eF() {
/* 1696 */     b(7, true);
/* 1697 */     b(7, false);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void aM() {
/* 1702 */     if (!a_()) {
/* 1703 */       super.aM();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp o(int ☃) {
/* 1709 */     if (☃ > 4) {
/* 1710 */       return adq.lu;
/*      */     }
/* 1712 */     return adq.lD;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(aag ☃, aqm aqm1) {
/* 1718 */     b(aea.g.b(aqm1.X()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ceh ☃, dcn dcn1) {
/* 1723 */     if (!this.bC.b) {
/* 1724 */       super.a(☃, dcn1);
/*      */     }
/*      */   }
/*      */   
/*      */   public void d(int ☃) {
/* 1729 */     t(☃);
/* 1730 */     this.bF += ☃ / eH();
/* 1731 */     this.bE = afm.a(this.bE + ☃, 0, 2147483647);
/* 1732 */     while (this.bF < 0.0F) {
/* 1733 */       float f = this.bF * eH();
/* 1734 */       if (this.bD > 0) {
/* 1735 */         c(-1);
/* 1736 */         this.bF = 1.0F + f / eH(); continue;
/*      */       } 
/* 1738 */       c(-1);
/* 1739 */       this.bF = 0.0F;
/*      */     } 
/*      */     
/* 1742 */     while (this.bF >= 1.0F) {
/* 1743 */       this.bF = (this.bF - 1.0F) * eH();
/* 1744 */       c(1);
/* 1745 */       this.bF /= eH();
/*      */     } 
/*      */   }
/*      */   
/*      */   public int eG() {
/* 1750 */     return this.bG;
/*      */   }
/*      */   
/*      */   public void a(bmb ☃, int i) {
/* 1754 */     this.bD -= i;
/* 1755 */     if (this.bD < 0) {
/* 1756 */       this.bD = 0;
/* 1757 */       this.bF = 0.0F;
/* 1758 */       this.bE = 0;
/*      */     } 
/* 1760 */     this.bG = this.J.nextInt();
/*      */   }
/*      */   
/*      */   public void c(int ☃) {
/* 1764 */     this.bD += ☃;
/* 1765 */     if (this.bD < 0) {
/* 1766 */       this.bD = 0;
/* 1767 */       this.bF = 0.0F;
/* 1768 */       this.bE = 0;
/*      */     } 
/*      */     
/* 1771 */     if (☃ > 0 && this.bD % 5 == 0 && this.g < this.K - 100.0F) {
/* 1772 */       float f = (this.bD > 30) ? 1.0F : (this.bD / 30.0F);
/* 1773 */       this.l.a((bfw)null, cD(), cE(), cH(), adq.lC, cu(), f * 0.75F, 1.0F);
/* 1774 */       this.g = this.K;
/*      */     } 
/*      */   }
/*      */   
/*      */   public int eH() {
/* 1779 */     if (this.bD >= 30) {
/* 1780 */       return 112 + (this.bD - 30) * 9;
/*      */     }
/* 1782 */     if (this.bD >= 15) {
/* 1783 */       return 37 + (this.bD - 15) * 5;
/*      */     }
/* 1785 */     return 7 + this.bD * 2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void t(float ☃) {
/* 1797 */     if (this.bC.a) {
/*      */       return;
/*      */     }
/*      */     
/* 1801 */     if (!this.l.v) {
/* 1802 */       this.bq.a(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public bhy eI() {
/* 1807 */     return this.bq;
/*      */   }
/*      */   
/*      */   public boolean q(boolean ☃) {
/* 1811 */     return (this.bC.a || ☃ || this.bq.c());
/*      */   }
/*      */   
/*      */   public boolean eJ() {
/* 1815 */     return (dk() > 0.0F && dk() < dx());
/*      */   }
/*      */   
/*      */   public boolean eK() {
/* 1819 */     return this.bC.e;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(fx ☃, gc gc1, bmb bmb1) {
/* 1824 */     if (this.bC.e) {
/* 1825 */       return true;
/*      */     }
/*      */     
/* 1828 */     fx fx1 = ☃.a(gc1.f());
/* 1829 */     cel cel = new cel(this.l, fx1, false);
/* 1830 */     return bmb1.b(this.l.p(), cel);
/*      */   }
/*      */ 
/*      */   
/*      */   protected int d(bfw ☃) {
/* 1835 */     if (this.l.V().b(brt.c) || a_()) {
/* 1836 */       return 0;
/*      */     }
/*      */     
/* 1839 */     int i = this.bD * 7;
/* 1840 */     if (i > 100) {
/* 1841 */       return 100;
/*      */     }
/* 1843 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean cX() {
/* 1849 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bY() {
/* 1854 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean aC() {
/* 1861 */     return (!this.bC.b && (!this.t || !bx()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void t() {}
/*      */ 
/*      */   
/*      */   public void a(bru ☃) {}
/*      */ 
/*      */   
/*      */   public nr R() {
/* 1872 */     return new oe(this.bJ.getName());
/*      */   }
/*      */   
/*      */   public bji eL() {
/* 1876 */     return this.bn;
/*      */   }
/*      */ 
/*      */   
/*      */   public bmb b(aqf ☃) {
/* 1881 */     if (☃ == aqf.a)
/* 1882 */       return this.bm.f(); 
/* 1883 */     if (☃ == aqf.b)
/* 1884 */       return this.bm.c.get(0); 
/* 1885 */     if (☃.a() == aqf.a.b) {
/* 1886 */       return this.bm.b.get(☃.b());
/*      */     }
/* 1888 */     return bmb.b;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqf ☃, bmb bmb1) {
/* 1893 */     if (☃ == aqf.a) {
/* 1894 */       b(bmb1);
/* 1895 */       this.bm.a.set(this.bm.d, bmb1);
/* 1896 */     } else if (☃ == aqf.b) {
/* 1897 */       b(bmb1);
/* 1898 */       this.bm.c.set(0, bmb1);
/* 1899 */     } else if (☃.a() == aqf.a.b) {
/* 1900 */       b(bmb1);
/* 1901 */       this.bm.b.set(☃.b(), bmb1);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean g(bmb ☃) {
/* 1906 */     b(☃);
/* 1907 */     return this.bm.e(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public Iterable<bmb> bn() {
/* 1912 */     return Lists.newArrayList((Object[])new bmb[] { dD(), dE() });
/*      */   }
/*      */ 
/*      */   
/*      */   public Iterable<bmb> bo() {
/* 1917 */     return this.bm.b;
/*      */   }
/*      */   
/*      */   public boolean g(md ☃) {
/* 1921 */     if (br() || !this.t || aE()) {
/* 1922 */       return false;
/*      */     }
/*      */ 
/*      */     
/* 1926 */     if (eP().isEmpty()) {
/* 1927 */       h(☃);
/* 1928 */       this.e = this.l.T();
/* 1929 */       return true;
/* 1930 */     }  if (eQ().isEmpty()) {
/* 1931 */       i(☃);
/* 1932 */       this.e = this.l.T();
/* 1933 */       return true;
/*      */     } 
/*      */     
/* 1936 */     return false;
/*      */   }
/*      */   
/*      */   protected void eM() {
/* 1940 */     if (this.e + 20L < this.l.T()) {
/* 1941 */       k(eP());
/* 1942 */       h(new md());
/* 1943 */       k(eQ());
/* 1944 */       i(new md());
/*      */     } 
/*      */   }
/*      */   
/*      */   private void k(md ☃) {
/* 1949 */     if (!this.l.v && !☃.isEmpty()) {
/* 1950 */       aqe.a(☃, this.l).ifPresent(☃ -> {
/*      */             if (☃ instanceof are) {
/*      */               ((are)☃).b(this.ad);
/*      */             }
/*      */             ☃.d(cD(), cE() + 0.699999988079071D, cH());
/*      */             ((aag)this.l).d(☃);
/*      */           });
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bB() {
/* 1967 */     return (!this.bC.b && !a_() && super.bB());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bV() {
/* 1974 */     return !this.bC.b;
/*      */   }
/*      */   
/*      */   public ddn eN() {
/* 1978 */     return this.l.G();
/*      */   }
/*      */ 
/*      */   
/*      */   public nr d() {
/* 1983 */     nx ☃ = ddl.a(bG(), R());
/* 1984 */     return a(☃);
/*      */   }
/*      */   
/*      */   private nx a(nx ☃) {
/* 1988 */     String str = eA().getName();
/*      */     
/* 1990 */     return ☃.a(ob1 -> ob1.a(new np(np.a.d, "/tell " + ☃ + " ")).a(cb()).a(☃));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String bU() {
/* 1999 */     return eA().getName();
/*      */   }
/*      */ 
/*      */   
/*      */   public float b(aqx ☃, aqb aqb1) {
/* 2004 */     switch (null.a[☃.ordinal()]) {
/*      */       case 1:
/*      */       case 2:
/*      */       case 3:
/* 2008 */         return 0.4F;
/*      */       
/*      */       case 4:
/* 2011 */         return 1.27F;
/*      */     } 
/* 2013 */     return 1.62F;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void s(float ☃) {
/* 2019 */     if (☃ < 0.0F) {
/* 2020 */       ☃ = 0.0F;
/*      */     }
/* 2022 */     ab().b(c, Float.valueOf(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public float dT() {
/* 2027 */     return ((Float)ab().<Float>a(c)).floatValue();
/*      */   }
/*      */   
/*      */   public static UUID a(GameProfile ☃) {
/* 2031 */     UUID uUID = ☃.getId();
/* 2032 */     if (uUID == null) {
/* 2033 */       uUID = c(☃.getName());
/*      */     }
/* 2035 */     return uUID;
/*      */   }
/*      */   
/*      */   public static UUID c(String ☃) {
/* 2039 */     return UUID.nameUUIDFromBytes(("OfflinePlayer:" + ☃).getBytes(StandardCharsets.UTF_8));
/*      */   }
/*      */   
/*      */   public boolean a(bfx ☃) {
/* 2043 */     return ((((Byte)ab().<Byte>a(bi)).byteValue() & ☃.a()) == ☃.a());
/*      */   }
/*      */   
/*      */   public boolean a_(int ☃, bmb bmb1) {
/*      */     aqf aqf;
/* 2048 */     if (☃ >= 0 && ☃ < this.bm.a.size()) {
/* 2049 */       this.bm.a(☃, bmb1);
/* 2050 */       return true;
/*      */     } 
/*      */ 
/*      */     
/* 2054 */     if (☃ == 100 + aqf.f.b()) {
/* 2055 */       aqf = aqf.f;
/* 2056 */     } else if (☃ == 100 + aqf.e.b()) {
/* 2057 */       aqf = aqf.e;
/* 2058 */     } else if (☃ == 100 + aqf.d.b()) {
/* 2059 */       aqf = aqf.d;
/* 2060 */     } else if (☃ == 100 + aqf.c.b()) {
/* 2061 */       aqf = aqf.c;
/*      */     } else {
/* 2063 */       aqf = null;
/*      */     } 
/*      */     
/* 2066 */     if (☃ == 98) {
/* 2067 */       a(aqf.a, bmb1);
/* 2068 */       return true;
/* 2069 */     }  if (☃ == 99) {
/* 2070 */       a(aqf.b, bmb1);
/* 2071 */       return true;
/*      */     } 
/*      */     
/* 2074 */     if (aqf != null) {
/* 2075 */       if (!bmb1.a()) {
/* 2076 */         if (bmb1.b() instanceof bjy || bmb1.b() instanceof bld) {
/* 2077 */           if (aqn.j(bmb1) != aqf) {
/* 2078 */             return false;
/*      */           }
/* 2080 */         } else if (aqf != aqf.f) {
/* 2081 */           return false;
/*      */         } 
/*      */       }
/* 2084 */       this.bm.a(aqf.b() + this.bm.a.size(), bmb1);
/* 2085 */       return true;
/*      */     } 
/* 2087 */     int i = ☃ - 200;
/* 2088 */     if (i >= 0 && i < this.bn.Z_()) {
/* 2089 */       this.bn.a(i, bmb1);
/* 2090 */       return true;
/*      */     } 
/* 2092 */     return false;
/*      */   }
/*      */   
/*      */   public boolean eO() {
/* 2096 */     return this.bK;
/*      */   }
/*      */   
/*      */   public void r(boolean ☃) {
/* 2100 */     this.bK = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void g(int ☃) {
/* 2105 */     super.g(this.bC.a ? Math.min(☃, 1) : ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public aqi dV() {
/* 2110 */     return (((Byte)this.R.<Byte>a(bj)).byteValue() == 0) ? aqi.a : aqi.b;
/*      */   }
/*      */   
/*      */   public void a(aqi ☃) {
/* 2114 */     this.R.b(bj, Byte.valueOf((byte)((☃ == aqi.a) ? 0 : 1)));
/*      */   }
/*      */   
/*      */   public md eP() {
/* 2118 */     return this.R.<md>a(bk);
/*      */   }
/*      */   
/*      */   protected void h(md ☃) {
/* 2122 */     this.R.b(bk, ☃);
/*      */   }
/*      */   
/*      */   public md eQ() {
/* 2126 */     return this.R.<md>a(bl);
/*      */   }
/*      */   
/*      */   protected void i(md ☃) {
/* 2130 */     this.R.b(bl, ☃);
/*      */   }
/*      */   
/*      */   public float eR() {
/* 2134 */     return (float)(1.0D / b(arl.h) * 20.0D);
/*      */   }
/*      */   
/*      */   public float u(float ☃) {
/* 2138 */     return afm.a((this.at + ☃) / eR(), 0.0F, 1.0F);
/*      */   }
/*      */   
/*      */   public void eS() {
/* 2142 */     this.at = 0;
/*      */   }
/*      */   
/*      */   public bly eT() {
/* 2146 */     return this.bM;
/*      */   }
/*      */ 
/*      */   
/*      */   protected float ar() {
/* 2151 */     return (this.bC.b || ef()) ? 1.0F : super.ar();
/*      */   }
/*      */   
/*      */   public float eU() {
/* 2155 */     return (float)b(arl.k);
/*      */   }
/*      */   
/*      */   public boolean eV() {
/* 2159 */     return (this.bC.d && y() >= 2);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean e(bmb ☃) {
/* 2164 */     aqf aqf = aqn.j(☃);
/* 2165 */     return b(aqf).a();
/*      */   }
/*      */ 
/*      */   
/*      */   public aqb a(aqx ☃) {
/* 2170 */     return b.getOrDefault(☃, bh);
/*      */   }
/*      */ 
/*      */   
/*      */   public ImmutableList<aqx> ej() {
/* 2175 */     return ImmutableList.of(aqx.a, aqx.f, aqx.d);
/*      */   }
/*      */ 
/*      */   
/*      */   public bmb f(bmb ☃) {
/* 2180 */     if (!(☃.b() instanceof bmo)) {
/* 2181 */       return bmb.b;
/*      */     }
/*      */     
/* 2184 */     Predicate<bmb> predicate = ((bmo)☃.b()).e();
/* 2185 */     bmb bmb1 = bmo.a(this, predicate);
/* 2186 */     if (!bmb1.a()) {
/* 2187 */       return bmb1;
/*      */     }
/*      */     
/* 2190 */     predicate = ((bmo)☃.b()).b();
/* 2191 */     for (int i = 0; i < this.bm.Z_(); i++) {
/* 2192 */       bmb bmb2 = this.bm.a(i);
/* 2193 */       if (predicate.test(bmb2)) {
/* 2194 */         return bmb2;
/*      */       }
/*      */     } 
/* 2197 */     return this.bC.d ? new bmb(bmd.kd) : bmb.b;
/*      */   }
/*      */ 
/*      */   
/*      */   public bmb a(brx ☃, bmb bmb1) {
/* 2202 */     eI().a(bmb1.b(), bmb1);
/* 2203 */     b(aea.c.b(bmb1.b()));
/*      */     
/* 2205 */     ☃.a((bfw)null, cD(), cE(), cH(), adq.lw, adr.h, 0.5F, ☃.t.nextFloat() * 0.1F + 0.9F);
/* 2206 */     if (this instanceof aah) {
/* 2207 */       ac.z.a((aah)this, bmb1);
/*      */     }
/* 2209 */     return super.a(☃, bmb1);
/*      */   }
/*      */ 
/*      */   
/*      */   protected boolean b(ceh ☃) {
/* 2214 */     return (this.bC.b || super.b(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public dcn o(float ☃) {
/* 2219 */     double d1 = 0.22D * ((dV() == aqi.b) ? -1.0D : 1.0D);
/* 2220 */     float f1 = afm.g(☃ * 0.5F, this.q, this.s) * 0.017453292F;
/* 2221 */     float f2 = afm.g(☃, this.aB, this.aA) * 0.017453292F;
/* 2222 */     if (ef() || dR()) {
/*      */       float f;
/* 2224 */       dcn dcn1 = f(☃);
/* 2225 */       dcn dcn2 = cC();
/* 2226 */       double d4 = aqa.c(dcn2);
/* 2227 */       double d5 = aqa.c(dcn1);
/*      */       
/* 2229 */       if (d4 > 0.0D && d5 > 0.0D) {
/* 2230 */         double d6 = (dcn2.b * dcn1.b + dcn2.d * dcn1.d) / Math.sqrt(d4 * d5);
/* 2231 */         double d7 = dcn2.b * dcn1.d - dcn2.d * dcn1.b;
/* 2232 */         f = (float)(Math.signum(d7) * Math.acos(d6));
/*      */       } else {
/* 2234 */         f = 0.0F;
/*      */       } 
/* 2236 */       return l(☃).e((new dcn(d1, -0.11D, 0.85D)).c(-f).a(-f1).b(-f2));
/* 2237 */     }  if (bC()) {
/* 2238 */       return l(☃).e((new dcn(d1, 0.2D, -0.15D)).a(-f1).b(-f2));
/*      */     }
/* 2240 */     double d2 = cc().c() - 1.0D;
/* 2241 */     double d3 = bz() ? -0.2D : 0.07D;
/* 2242 */     return l(☃).e((new dcn(d1, d2, d3)).b(-f2));
/*      */   }
/*      */   
/*      */   public abstract boolean a_();
/*      */   
/*      */   public abstract boolean b_();
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
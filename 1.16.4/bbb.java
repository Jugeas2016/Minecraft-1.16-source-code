/*      */ import com.google.common.collect.UnmodifiableIterator;
/*      */ import java.util.Optional;
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
/*      */ public abstract class bbb
/*      */   extends azz
/*      */   implements aop, aqw, ara
/*      */ {
/*      */   private static final Predicate<aqm> bw;
/*      */   
/*      */   static {
/*   81 */     bw = (☃ -> (☃ instanceof bbb && ((bbb)☃).fb()));
/*   82 */   } private static final azg bx = (new azg()).a(16.0D).a().b().c().a(bw);
/*      */   
/*   84 */   private static final bon by = bon.a(new brw[] { bmd.kW, bmd.mM, bup.gA.h(), bmd.kb, bmd.pd, bmd.lA, bmd.lB });
/*      */   
/*   86 */   private static final us<Byte> bz = uv.a((Class)bbb.class, uu.a);
/*   87 */   private static final us<Optional<UUID>> bA = uv.a((Class)bbb.class, uu.o);
/*      */   
/*      */   private int bB;
/*      */   
/*      */   private int bC;
/*      */   
/*      */   private int bD;
/*      */   
/*      */   public int bo;
/*      */   
/*      */   public int bp;
/*      */   
/*      */   protected boolean bq;
/*      */   
/*      */   protected apa br;
/*      */   
/*      */   protected int bs;
/*      */   
/*      */   protected float bt;
/*      */   
/*      */   private boolean bE;
/*      */   
/*      */   private float bF;
/*      */   
/*      */   private float bG;
/*      */   
/*      */   private float bH;
/*      */   
/*      */   private float bI;
/*      */   private float bJ;
/*      */   private float bK;
/*      */   protected boolean bu = true;
/*      */   protected int bv;
/*      */   
/*      */   protected bbb(aqe<? extends bbb> ☃, brx brx1) {
/*  122 */     super((aqe)☃, brx1);
/*      */     
/*  124 */     this.G = 1.0F;
/*      */     
/*  126 */     fd();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void o() {
/*  131 */     this.bk.a(1, new awp(this, 1.2D));
/*  132 */     this.bk.a(1, new axa(this, 1.2D));
/*  133 */     this.bk.a(2, new avi(this, 1.0D, (Class)bbb.class));
/*  134 */     this.bk.a(4, new avu(this, 1.0D));
/*  135 */     this.bk.a(6, new axk(this, 0.7D));
/*  136 */     this.bk.a(7, new awd(this, (Class)bfw.class, 6.0F));
/*  137 */     this.bk.a(8, new aws(this));
/*      */     
/*  139 */     eV();
/*      */   }
/*      */   
/*      */   protected void eV() {
/*  143 */     this.bk.a(0, new avp(this));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void e() {
/*  148 */     super.e();
/*  149 */     this.R.a(bz, Byte.valueOf((byte)0));
/*  150 */     this.R.a(bA, Optional.empty());
/*      */   }
/*      */   
/*      */   protected boolean t(int ☃) {
/*  154 */     return ((((Byte)this.R.<Byte>a(bz)).byteValue() & ☃) != 0);
/*      */   }
/*      */   
/*      */   protected void d(int ☃, boolean bool) {
/*  158 */     byte b = ((Byte)this.R.<Byte>a(bz)).byteValue();
/*  159 */     if (bool) {
/*  160 */       this.R.b(bz, Byte.valueOf((byte)(b | ☃)));
/*      */     } else {
/*  162 */       this.R.b(bz, Byte.valueOf((byte)(b & (☃ ^ 0xFFFFFFFF))));
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean eW() {
/*  167 */     return t(2);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public UUID eX() {
/*  172 */     return ((Optional<UUID>)this.R.<Optional<UUID>>a(bA)).orElse(null);
/*      */   }
/*      */   
/*      */   public void b(@Nullable UUID ☃) {
/*  176 */     this.R.b(bA, Optional.ofNullable(☃));
/*      */   }
/*      */   
/*      */   public boolean eY() {
/*  180 */     return this.bq;
/*      */   }
/*      */   
/*      */   public void u(boolean ☃) {
/*  184 */     d(2, ☃);
/*      */   }
/*      */   
/*      */   public void v(boolean ☃) {
/*  188 */     this.bq = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void x(float ☃) {
/*  193 */     if (☃ > 6.0F && eZ()) {
/*  194 */       x(false);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean eZ() {
/*  199 */     return t(16);
/*      */   }
/*      */   
/*      */   public boolean fa() {
/*  203 */     return t(32);
/*      */   }
/*      */   
/*      */   public boolean fb() {
/*  207 */     return t(8);
/*      */   }
/*      */   
/*      */   public void w(boolean ☃) {
/*  211 */     d(8, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean L_() {
/*  216 */     return (aX() && !w_() && eW());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(@Nullable adr ☃) {
/*  221 */     this.br.a(0, new bmb(bmd.lO));
/*  222 */     if (☃ != null) {
/*  223 */       this.l.a((bfw)null, this, adq.ga, ☃, 0.5F, 1.0F);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean M_() {
/*  229 */     return t(4);
/*      */   }
/*      */   
/*      */   public int fc() {
/*  233 */     return this.bs;
/*      */   }
/*      */   
/*      */   public void u(int ☃) {
/*  237 */     this.bs = ☃;
/*      */   }
/*      */   
/*      */   public int v(int ☃) {
/*  241 */     int i = afm.a(fc() + ☃, 0, fj());
/*      */     
/*  243 */     u(i);
/*  244 */     return i;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aU() {
/*  249 */     return !bs();
/*      */   }
/*      */   
/*      */   private void eL() {
/*  253 */     eO();
/*  254 */     if (!aA()) {
/*  255 */       adp ☃ = fg();
/*  256 */       if (☃ != null) {
/*  257 */         this.l.a((bfw)null, cD(), cE(), cH(), ☃, cu(), 1.0F, 1.0F + (this.J.nextFloat() - this.J.nextFloat()) * 0.2F);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(float ☃, float f1) {
/*  264 */     if (☃ > 1.0F) {
/*  265 */       a(adq.fZ, 0.4F, 1.0F);
/*      */     }
/*      */     
/*  268 */     int i = e(☃, f1);
/*  269 */     if (i <= 0) {
/*  270 */       return false;
/*      */     }
/*      */     
/*  273 */     a(apk.k, i);
/*      */     
/*  275 */     if (bs()) {
/*  276 */       for (aqa aqa : co()) {
/*  277 */         aqa.a(apk.k, i);
/*      */       }
/*      */     }
/*      */     
/*  281 */     dt();
/*  282 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected int e(float ☃, float f1) {
/*  287 */     return afm.f((☃ * 0.5F - 3.0F) * f1);
/*      */   }
/*      */   
/*      */   protected int eN() {
/*  291 */     return 2;
/*      */   }
/*      */   
/*      */   protected void fd() {
/*  295 */     apa ☃ = this.br;
/*  296 */     this.br = new apa(eN());
/*  297 */     if (☃ != null) {
/*  298 */       ☃.b(this);
/*      */       
/*  300 */       int i = Math.min(☃.Z_(), this.br.Z_());
/*  301 */       for (int j = 0; j < i; j++) {
/*  302 */         bmb bmb = ☃.a(j);
/*  303 */         if (!bmb.a()) {
/*  304 */           this.br.a(j, bmb.i());
/*      */         }
/*      */       } 
/*      */     } 
/*  308 */     this.br.a(this);
/*  309 */     fe();
/*      */   }
/*      */   
/*      */   protected void fe() {
/*  313 */     if (this.l.v) {
/*      */       return;
/*      */     }
/*      */     
/*  317 */     d(4, !this.br.a(0).a());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aon ☃) {
/*  322 */     boolean bool = M_();
/*  323 */     fe();
/*  324 */     if (this.K > 20 && !bool && M_()) {
/*  325 */       a(adq.ga, 0.5F, 1.0F);
/*      */     }
/*      */   }
/*      */   
/*      */   public double ff() {
/*  330 */     return b(arl.m);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected adp fg() {
/*  335 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp dq() {
/*  341 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp e(apk ☃) {
/*  347 */     if (this.J.nextInt(3) == 0) {
/*  348 */       eU();
/*      */     }
/*  350 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp I() {
/*  356 */     if (this.J.nextInt(10) == 0 && !dI()) {
/*  357 */       eU();
/*      */     }
/*  359 */     return null;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected adp fh() {
/*  364 */     eU();
/*  365 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(fx ☃, ceh ceh1) {
/*  370 */     if (ceh1.c().a()) {
/*      */       return;
/*      */     }
/*      */     
/*  374 */     ceh ceh2 = this.l.d_(☃.b());
/*  375 */     cae cae = ceh1.o();
/*  376 */     if (ceh2.a(bup.cC)) {
/*  377 */       cae = ceh2.o();
/*      */     }
/*      */     
/*  380 */     if (bs() && this.bu) {
/*  381 */       this.bv++;
/*  382 */       if (this.bv > 5 && this.bv % 3 == 0) {
/*  383 */         a(cae);
/*  384 */       } else if (this.bv <= 5) {
/*  385 */         a(adq.gc, cae.a() * 0.15F, cae.b());
/*      */       } 
/*  387 */     } else if (cae == cae.a) {
/*  388 */       a(adq.gc, cae.a() * 0.15F, cae.b());
/*      */     } else {
/*  390 */       a(adq.gb, cae.a() * 0.15F, cae.b());
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void a(cae ☃) {
/*  395 */     a(adq.fW, ☃.a() * 0.15F, ☃.b());
/*      */   }
/*      */   
/*      */   public static ark.a fi() {
/*  399 */     return aqn.p()
/*  400 */       .a(arl.m)
/*  401 */       .a(arl.a, 53.0D)
/*  402 */       .a(arl.d, 0.22499999403953552D);
/*      */   }
/*      */ 
/*      */   
/*      */   public int eq() {
/*  407 */     return 6;
/*      */   }
/*      */   
/*      */   public int fj() {
/*  411 */     return 100;
/*      */   }
/*      */ 
/*      */   
/*      */   protected float dG() {
/*  416 */     return 0.8F;
/*      */   }
/*      */ 
/*      */   
/*      */   public int D() {
/*  421 */     return 400;
/*      */   }
/*      */   
/*      */   public void f(bfw ☃) {
/*  425 */     if (!this.l.v && (!bs() || w(☃)) && eW()) {
/*  426 */       ☃.a(this, this.br);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public aou b(bfw ☃, bmb bmb1) {
/*  432 */     boolean bool = c(☃, bmb1);
/*  433 */     if (!☃.bC.d) {
/*  434 */       bmb1.g(1);
/*      */     }
/*  436 */     if (this.l.v) {
/*  437 */       return aou.b;
/*      */     }
/*  439 */     return bool ? aou.a : aou.c;
/*      */   }
/*      */   
/*      */   protected boolean c(bfw ☃, bmb bmb1) {
/*  443 */     boolean bool = false;
/*  444 */     float f = 0.0F;
/*  445 */     int i = 0;
/*  446 */     int j = 0;
/*      */     
/*  448 */     blx blx = bmb1.b();
/*  449 */     if (blx == bmd.kW) {
/*  450 */       f = 2.0F;
/*  451 */       i = 20;
/*  452 */       j = 3;
/*  453 */     } else if (blx == bmd.mM) {
/*  454 */       f = 1.0F;
/*  455 */       i = 30;
/*  456 */       j = 3;
/*  457 */     } else if (blx == bup.gA.h()) {
/*  458 */       f = 20.0F;
/*  459 */       i = 180;
/*  460 */     } else if (blx == bmd.kb) {
/*  461 */       f = 3.0F;
/*  462 */       i = 60;
/*  463 */       j = 3;
/*  464 */     } else if (blx == bmd.pd) {
/*  465 */       f = 4.0F;
/*  466 */       i = 60;
/*  467 */       j = 5;
/*  468 */       if (!this.l.v && eW() && i() == 0 && !eS()) {
/*  469 */         bool = true;
/*  470 */         g(☃);
/*      */       } 
/*  472 */     } else if (blx == bmd.lA || blx == bmd.lB) {
/*  473 */       f = 10.0F;
/*  474 */       i = 240;
/*  475 */       j = 10;
/*  476 */       if (!this.l.v && eW() && i() == 0 && !eS()) {
/*  477 */         bool = true;
/*  478 */         g(☃);
/*      */       } 
/*      */     } 
/*  481 */     if (dk() < dx() && f > 0.0F) {
/*  482 */       b(f);
/*  483 */       bool = true;
/*      */     } 
/*  485 */     if (w_() && i > 0) {
/*  486 */       this.l.a(hh.E, d(1.0D), cF() + 0.5D, g(1.0D), 0.0D, 0.0D, 0.0D);
/*  487 */       if (!this.l.v) {
/*  488 */         a(i);
/*      */       }
/*  490 */       bool = true;
/*      */     } 
/*  492 */     if (j > 0 && (bool || !eW()) && fc() < fj()) {
/*  493 */       bool = true;
/*  494 */       if (!this.l.v) {
/*  495 */         v(j);
/*      */       }
/*      */     } 
/*  498 */     if (bool) {
/*  499 */       eL();
/*      */     }
/*  501 */     return bool;
/*      */   }
/*      */   
/*      */   protected void h(bfw ☃) {
/*  505 */     x(false);
/*  506 */     y(false);
/*  507 */     if (!this.l.v) {
/*  508 */       ☃.p = this.p;
/*  509 */       ☃.q = this.q;
/*  510 */       ☃.m(this);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected boolean dI() {
/*  516 */     return ((super.dI() && bs() && M_()) || eZ() || fa());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean k(bmb ☃) {
/*  523 */     return by.a(☃);
/*      */   }
/*      */   
/*      */   private void eM() {
/*  527 */     this.bo = 1;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void dn() {
/*  532 */     super.dn();
/*  533 */     if (this.br == null) {
/*      */       return;
/*      */     }
/*  536 */     for (int ☃ = 0; ☃ < this.br.Z_(); ☃++) {
/*  537 */       bmb bmb = this.br.a(☃);
/*  538 */       if (!bmb.a() && !bpu.e(bmb))
/*      */       {
/*      */         
/*  541 */         a(bmb);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public void k() {
/*  547 */     if (this.J.nextInt(200) == 0) {
/*  548 */       eM();
/*      */     }
/*      */     
/*  551 */     super.k();
/*      */     
/*  553 */     if (this.l.v || !aX()) {
/*      */       return;
/*      */     }
/*      */     
/*  557 */     if (this.J.nextInt(900) == 0 && this.aq == 0) {
/*  558 */       b(1.0F);
/*      */     }
/*      */     
/*  561 */     if (fl()) {
/*  562 */       if (!eZ() && !bs() && this.J.nextInt(300) == 0 && 
/*  563 */         this.l.d_(cB().c()).a(bup.i)) {
/*  564 */         x(true);
/*      */       }
/*      */ 
/*      */       
/*  568 */       if (eZ() && ++this.bB > 50) {
/*  569 */         this.bB = 0;
/*  570 */         x(false);
/*      */       } 
/*      */     } 
/*      */     
/*  574 */     fk();
/*      */   }
/*      */   
/*      */   protected void fk() {
/*  578 */     if (fb() && w_() && !eZ()) {
/*  579 */       aqm ☃ = this.l.a((Class)bbb.class, bx, this, cD(), cE(), cH(), cc().g(16.0D));
/*  580 */       if (☃ != null && h(☃) > 4.0D) {
/*  581 */         this.bj.a(☃, 0);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean fl() {
/*  587 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {
/*  592 */     super.j();
/*      */     
/*  594 */     if (this.bC > 0 && ++this.bC > 30) {
/*  595 */       this.bC = 0;
/*  596 */       d(64, false);
/*      */     } 
/*      */     
/*  599 */     if ((cs() || dS()) && 
/*  600 */       this.bD > 0 && ++this.bD > 20) {
/*  601 */       this.bD = 0;
/*  602 */       y(false);
/*      */     } 
/*      */ 
/*      */     
/*  606 */     if (this.bo > 0 && ++this.bo > 8) {
/*  607 */       this.bo = 0;
/*      */     }
/*      */     
/*  610 */     if (this.bp > 0) {
/*  611 */       this.bp++;
/*      */       
/*  613 */       if (this.bp > 300) {
/*  614 */         this.bp = 0;
/*      */       }
/*      */     } 
/*      */     
/*  618 */     this.bG = this.bF;
/*  619 */     if (eZ()) {
/*  620 */       this.bF += (1.0F - this.bF) * 0.4F + 0.05F;
/*  621 */       if (this.bF > 1.0F) {
/*  622 */         this.bF = 1.0F;
/*      */       }
/*      */     } else {
/*  625 */       this.bF += (0.0F - this.bF) * 0.4F - 0.05F;
/*  626 */       if (this.bF < 0.0F) {
/*  627 */         this.bF = 0.0F;
/*      */       }
/*      */     } 
/*  630 */     this.bI = this.bH;
/*  631 */     if (fa()) {
/*      */       
/*  633 */       this.bF = 0.0F;
/*  634 */       this.bG = this.bF;
/*  635 */       this.bH += (1.0F - this.bH) * 0.4F + 0.05F;
/*  636 */       if (this.bH > 1.0F) {
/*  637 */         this.bH = 1.0F;
/*      */       }
/*      */     } else {
/*  640 */       this.bE = false;
/*      */       
/*  642 */       this.bH += (0.8F * this.bH * this.bH * this.bH - this.bH) * 0.6F - 0.05F;
/*  643 */       if (this.bH < 0.0F) {
/*  644 */         this.bH = 0.0F;
/*      */       }
/*      */     } 
/*  647 */     this.bK = this.bJ;
/*  648 */     if (t(64)) {
/*  649 */       this.bJ += (1.0F - this.bJ) * 0.7F + 0.05F;
/*  650 */       if (this.bJ > 1.0F) {
/*  651 */         this.bJ = 1.0F;
/*      */       }
/*      */     } else {
/*  654 */       this.bJ += (0.0F - this.bJ) * 0.7F - 0.05F;
/*  655 */       if (this.bJ < 0.0F) {
/*  656 */         this.bJ = 0.0F;
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private void eO() {
/*  662 */     if (!this.l.v) {
/*  663 */       this.bC = 1;
/*  664 */       d(64, true);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void x(boolean ☃) {
/*  669 */     d(16, ☃);
/*      */   }
/*      */   
/*      */   public void y(boolean ☃) {
/*  673 */     if (☃) {
/*  674 */       x(false);
/*      */     }
/*  676 */     d(32, ☃);
/*      */   }
/*      */   
/*      */   private void eU() {
/*  680 */     if (cs() || dS()) {
/*  681 */       this.bD = 1;
/*  682 */       y(true);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void fm() {
/*  687 */     if (!fa()) {
/*  688 */       eU();
/*  689 */       adp ☃ = fh();
/*  690 */       if (☃ != null) {
/*  691 */         a(☃, dG(), dH());
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean i(bfw ☃) {
/*  697 */     b(☃.bS());
/*  698 */     u(true);
/*  699 */     if (☃ instanceof aah) {
/*  700 */       ac.x.a((aah)☃, this);
/*      */     }
/*  702 */     this.l.a(this, (byte)7);
/*  703 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void g(dcn ☃) {
/*  708 */     if (!aX()) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  713 */     if (!bs() || !er() || !M_()) {
/*  714 */       this.aE = 0.02F;
/*  715 */       super.g(☃);
/*      */       
/*      */       return;
/*      */     } 
/*  719 */     aqm aqm = (aqm)cm();
/*      */     
/*  721 */     this.p = aqm.p;
/*  722 */     this.r = this.p;
/*  723 */     this.q = aqm.q * 0.5F;
/*  724 */     a(this.p, this.q);
/*  725 */     this.aA = this.p;
/*  726 */     this.aC = this.aA;
/*      */     
/*  728 */     float f1 = aqm.aR * 0.5F;
/*  729 */     float f2 = aqm.aT;
/*      */ 
/*      */     
/*  732 */     if (f2 <= 0.0F) {
/*  733 */       f2 *= 0.25F;
/*  734 */       this.bv = 0;
/*      */     } 
/*      */     
/*  737 */     if (this.t && this.bt == 0.0F && fa() && !this.bE) {
/*  738 */       f1 = 0.0F;
/*  739 */       f2 = 0.0F;
/*      */     } 
/*      */ 
/*      */     
/*  743 */     if (this.bt > 0.0F && !eY() && this.t) {
/*  744 */       double d2, d1 = ff() * this.bt * aq();
/*      */ 
/*      */       
/*  747 */       if (a(apw.h)) {
/*  748 */         d2 = d1 + ((b(apw.h).c() + 1) * 0.1F);
/*      */       } else {
/*  750 */         d2 = d1;
/*      */       } 
/*  752 */       dcn dcn1 = cC();
/*  753 */       n(dcn1.b, d2, dcn1.d);
/*      */       
/*  755 */       v(true);
/*  756 */       this.Z = true;
/*      */       
/*  758 */       if (f2 > 0.0F) {
/*  759 */         float f3 = afm.a(this.p * 0.017453292F);
/*  760 */         float f4 = afm.b(this.p * 0.017453292F);
/*      */         
/*  762 */         f(cC().b((-0.4F * f3 * this.bt), 0.0D, (0.4F * f4 * this.bt)));
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  768 */       this.bt = 0.0F;
/*      */     } 
/*      */     
/*  771 */     this.aE = dN() * 0.1F;
/*  772 */     if (cs()) {
/*  773 */       q((float)b(arl.d));
/*  774 */       super.g(new dcn(f1, ☃.c, f2));
/*  775 */     } else if (aqm instanceof bfw) {
/*  776 */       f(dcn.a);
/*      */     } 
/*      */     
/*  779 */     if (this.t) {
/*      */       
/*  781 */       this.bt = 0.0F;
/*  782 */       v(false);
/*      */     } 
/*  784 */     a(this, false);
/*      */   }
/*      */   
/*      */   protected void fn() {
/*  788 */     a(adq.fY, 0.4F, 1.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(md ☃) {
/*  793 */     super.b(☃);
/*      */     
/*  795 */     ☃.a("EatingHaystack", eZ());
/*  796 */     ☃.a("Bred", fb());
/*  797 */     ☃.b("Temper", fc());
/*  798 */     ☃.a("Tame", eW());
/*      */     
/*  800 */     if (eX() != null) {
/*  801 */       ☃.a("Owner", eX());
/*      */     }
/*      */     
/*  804 */     if (!this.br.a(0).a()) {
/*  805 */       ☃.a("SaddleItem", this.br.a(0).b(new md()));
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(md ☃) {
/*      */     UUID uUID;
/*  811 */     super.a(☃);
/*  812 */     x(☃.q("EatingHaystack"));
/*  813 */     w(☃.q("Bred"));
/*  814 */     u(☃.h("Temper"));
/*  815 */     u(☃.q("Tame"));
/*      */ 
/*      */     
/*  818 */     if (☃.b("Owner")) {
/*  819 */       uUID = ☃.a("Owner");
/*      */     } else {
/*  821 */       String str = ☃.l("Owner");
/*  822 */       uUID = act.a(ch(), str);
/*      */     } 
/*  824 */     if (uUID != null) {
/*  825 */       b(uUID);
/*      */     }
/*      */     
/*  828 */     if (☃.c("SaddleItem", 10)) {
/*  829 */       bmb bmb = bmb.a(☃.p("SaddleItem"));
/*  830 */       if (bmb.b() == bmd.lO) {
/*  831 */         this.br.a(0, bmb);
/*      */       }
/*      */     } 
/*  834 */     fe();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(azz ☃) {
/*  839 */     return false;
/*      */   }
/*      */   
/*      */   protected boolean fo() {
/*  843 */     return (!bs() && !br() && eW() && !w_() && dk() >= dx() && eS());
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public apy a(aag ☃, apy apy1) {
/*  849 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(apy ☃, bbb bbb1) {
/*  854 */     double d1 = c(arl.a) + ☃.c(arl.a) + fp();
/*  855 */     bbb1.a(arl.a).a(d1 / 3.0D);
/*      */     
/*  857 */     double d2 = c(arl.m) + ☃.c(arl.m) + fq();
/*  858 */     bbb1.a(arl.m).a(d2 / 3.0D);
/*      */     
/*  860 */     double d3 = c(arl.d) + ☃.c(arl.d) + fr();
/*  861 */     bbb1.a(arl.d).a(d3 / 3.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean er() {
/*  866 */     return cm() instanceof aqm;
/*      */   }
/*      */   
/*      */   public float y(float ☃) {
/*  870 */     return afm.g(☃, this.bG, this.bF);
/*      */   }
/*      */   
/*      */   public float z(float ☃) {
/*  874 */     return afm.g(☃, this.bI, this.bH);
/*      */   }
/*      */   
/*      */   public float A(float ☃) {
/*  878 */     return afm.g(☃, this.bK, this.bJ);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b_(int ☃) {
/*  883 */     if (!M_()) {
/*      */       return;
/*      */     }
/*      */     
/*  887 */     if (☃ < 0) {
/*  888 */       ☃ = 0;
/*      */     } else {
/*  890 */       this.bE = true;
/*  891 */       eU();
/*      */     } 
/*      */     
/*  894 */     if (☃ >= 90) {
/*  895 */       this.bt = 1.0F;
/*      */     } else {
/*  897 */       this.bt = 0.4F + 0.4F * ☃ / 90.0F;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean P_() {
/*  903 */     return M_();
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
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int ☃) {
/*  918 */     this.bE = true;
/*  919 */     eU();
/*  920 */     fn();
/*      */   }
/*      */ 
/*      */   
/*      */   public void c() {}
/*      */ 
/*      */   
/*      */   protected void z(boolean ☃) {
/*  928 */     hf hf = ☃ ? hh.G : hh.S;
/*      */     
/*  930 */     for (int i = 0; i < 7; i++) {
/*  931 */       double d1 = this.J.nextGaussian() * 0.02D;
/*  932 */       double d2 = this.J.nextGaussian() * 0.02D;
/*  933 */       double d3 = this.J.nextGaussian() * 0.02D;
/*  934 */       this.l.a(hf, d(1.0D), cF() + 0.5D, g(1.0D), d1, d2, d3);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(byte ☃) {
/*  940 */     if (☃ == 7) {
/*  941 */       z(true);
/*  942 */     } else if (☃ == 6) {
/*  943 */       z(false);
/*      */     } else {
/*  945 */       super.a(☃);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void k(aqa ☃) {
/*  951 */     super.k(☃);
/*      */     
/*  953 */     if (☃ instanceof aqn) {
/*  954 */       aqn aqn = (aqn)☃;
/*  955 */       this.aA = aqn.aA;
/*      */     } 
/*      */     
/*  958 */     if (this.bI > 0.0F) {
/*  959 */       float f1 = afm.a(this.aA * 0.017453292F);
/*  960 */       float f2 = afm.b(this.aA * 0.017453292F);
/*  961 */       float f3 = 0.7F * this.bI;
/*  962 */       float f4 = 0.15F * this.bI;
/*      */       
/*  964 */       ☃.d(cD() + (f3 * f1), cE() + bc() + ☃.bb() + f4, cH() - (f3 * f2));
/*  965 */       if (☃ instanceof aqm) {
/*  966 */         ((aqm)☃).aA = this.aA;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected float fp() {
/*  973 */     return 15.0F + this.J.nextInt(8) + this.J.nextInt(9);
/*      */   }
/*      */   
/*      */   protected double fq() {
/*  977 */     return 0.4000000059604645D + this.J.nextDouble() * 0.2D + this.J.nextDouble() * 0.2D + this.J.nextDouble() * 0.2D;
/*      */   }
/*      */   
/*      */   protected double fr() {
/*  981 */     return (0.44999998807907104D + this.J.nextDouble() * 0.3D + this.J.nextDouble() * 0.3D + this.J.nextDouble() * 0.3D) * 0.25D;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean c_() {
/*  986 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   protected float b(aqx ☃, aqb aqb1) {
/*  991 */     return aqb1.b * 0.95F;
/*      */   }
/*      */   
/*      */   public boolean fs() {
/*  995 */     return false;
/*      */   }
/*      */   
/*      */   public boolean ft() {
/*  999 */     return !b(aqf.e).a();
/*      */   }
/*      */   
/*      */   public boolean l(bmb ☃) {
/* 1003 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a_(int ☃, bmb bmb1) {
/* 1008 */     int i = ☃ - 400;
/* 1009 */     if (i >= 0 && i < 2 && i < this.br.Z_()) {
/* 1010 */       if (i == 0 && bmb1.b() != bmd.lO) {
/* 1011 */         return false;
/*      */       }
/* 1013 */       if (i == 1 && (!fs() || !l(bmb1))) {
/* 1014 */         return false;
/*      */       }
/* 1016 */       this.br.a(i, bmb1);
/* 1017 */       fe();
/* 1018 */       return true;
/*      */     } 
/* 1020 */     int j = ☃ - 500 + 2;
/* 1021 */     if (j >= 2 && j < this.br.Z_()) {
/* 1022 */       this.br.a(j, bmb1);
/* 1023 */       return true;
/*      */     } 
/* 1025 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public aqa cm() {
/* 1031 */     if (cn().isEmpty()) {
/* 1032 */       return null;
/*      */     }
/* 1034 */     return cn().get(0);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private dcn a(dcn ☃, aqm aqm1) {
/* 1039 */     double d1 = cD() + ☃.b;
/* 1040 */     double d2 = (cc()).b;
/* 1041 */     double d3 = cH() + ☃.d;
/*      */     
/* 1043 */     fx.a a = new fx.a(); UnmodifiableIterator<aqx> unmodifiableIterator;
/* 1044 */     label18: for (unmodifiableIterator = aqm1.ej().iterator(); unmodifiableIterator.hasNext(); ) { aqx aqx = unmodifiableIterator.next();
/* 1045 */       a.c(d1, d2, d3);
/* 1046 */       double d = (cc()).e + 0.75D;
/*      */       
/*      */       while (true) {
/* 1049 */         double d4 = this.l.h(a);
/*      */         
/* 1051 */         if (a.v() + d4 > d) {
/*      */           continue label18;
/*      */         }
/*      */         
/* 1055 */         if (bho.a(d4)) {
/* 1056 */           dci dci = aqm1.f(aqx);
/* 1057 */           dcn dcn1 = new dcn(d1, a.v() + d4, d3);
/*      */           
/* 1059 */           if (bho.a(this.l, aqm1, dci.c(dcn1))) {
/* 1060 */             aqm1.b(aqx);
/* 1061 */             return dcn1;
/*      */           } 
/*      */         } 
/*      */         
/* 1065 */         a.c(gc.b);
/* 1066 */         if (a.v() >= d)
/*      */           continue label18; 
/*      */       }  }
/* 1069 */      return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public dcn b(aqm ☃) {
/* 1074 */     dcn dcn1 = a(cy(), ☃.cy(), this.p + ((☃.dV() == aqi.b) ? 90.0F : -90.0F));
/* 1075 */     dcn dcn2 = a(dcn1, ☃);
/*      */     
/* 1077 */     if (dcn2 != null) {
/* 1078 */       return dcn2;
/*      */     }
/*      */     
/* 1081 */     dcn dcn3 = a(cy(), ☃.cy(), this.p + ((☃.dV() == aqi.a) ? 90.0F : -90.0F));
/* 1082 */     dcn dcn4 = a(dcn3, ☃);
/*      */     
/* 1084 */     if (dcn4 != null) {
/* 1085 */       return dcn4;
/*      */     }
/*      */     
/* 1088 */     return cA();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void eK() {}
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 1097 */     if (arc1 == null) {
/* 1098 */       arc1 = new apy.a(0.2F);
/*      */     }
/*      */     
/* 1101 */     eK();
/*      */     
/* 1103 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
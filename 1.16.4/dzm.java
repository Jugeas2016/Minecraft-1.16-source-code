/*      */ import com.google.common.collect.Lists;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.UUID;
/*      */ import java.util.stream.Stream;
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
/*      */ public class dzm
/*      */   extends dzj
/*      */ {
/*      */   public final dwu e;
/*      */   private final aeb bR;
/*      */   private final djm bS;
/*   96 */   private final List<eme> bT = Lists.newArrayList();
/*      */   
/*   98 */   private int bU = 0;
/*      */   
/*      */   private double bV;
/*      */   
/*      */   private double bW;
/*      */   
/*      */   private double bX;
/*      */   
/*      */   private float bY;
/*      */   
/*      */   private float bZ;
/*      */   
/*      */   private boolean ca;
/*      */   
/*      */   private boolean cb;
/*      */   
/*      */   private boolean cc;
/*      */   private boolean cd;
/*      */   private int ce;
/*      */   private boolean cf;
/*      */   private String cg;
/*      */   public dzk f;
/*      */   protected final djz g;
/*      */   protected int bJ;
/*      */   public int bK;
/*      */   public float bL;
/*      */   public float bM;
/*      */   public float bN;
/*      */   public float bO;
/*      */   private int ch;
/*      */   private float ci;
/*      */   public float bP;
/*      */   public float bQ;
/*      */   private boolean cj;
/*      */   private aot ck;
/*      */   private boolean cl;
/*      */   private boolean cm = true;
/*      */   private int cn;
/*      */   private boolean co;
/*      */   private int cp;
/*      */   private boolean cq = true;
/*      */   
/*      */   public dzm(djz ☃, dwt dwt1, dwu dwu1, aeb aeb1, djm djm1, boolean bool1, boolean bool2) {
/*  141 */     super(dwt1, dwu1.g());
/*  142 */     this.g = ☃;
/*  143 */     this.e = dwu1;
/*  144 */     this.bR = aeb1;
/*  145 */     this.bS = djm1;
/*  146 */     this.cc = bool1;
/*  147 */     this.cd = bool2;
/*  148 */     this.bT.add(new emv(this, ☃.W()));
/*  149 */     this.bT.add(new emj(this));
/*  150 */     this.bT.add(new emi(this, ☃.W(), dwt1.d()));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(apk ☃, float f) {
/*  155 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(float ☃) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(aqa ☃, boolean bool) {
/*  165 */     if (!super.a(☃, bool)) {
/*  166 */       return false;
/*      */     }
/*      */     
/*  169 */     if (☃ instanceof bhl) {
/*  170 */       this.g.W().a(new emo(this, (bhl)☃));
/*      */     }
/*      */     
/*  173 */     if (☃ instanceof bhn) {
/*  174 */       this.r = ☃.p;
/*  175 */       this.p = ☃.p;
/*  176 */       m(☃.p);
/*      */     } 
/*  178 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void bf() {
/*  183 */     super.bf();
/*  184 */     this.cl = false;
/*      */   }
/*      */ 
/*      */   
/*      */   public float g(float ☃) {
/*  189 */     return this.q;
/*      */   }
/*      */ 
/*      */   
/*      */   public float h(float ☃) {
/*  194 */     if (br()) {
/*  195 */       return super.h(☃);
/*      */     }
/*  197 */     return this.p;
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {
/*  202 */     if (!this.l.C(new fx(cD(), 0.0D, cH()))) {
/*      */       return;
/*      */     }
/*  205 */     super.j();
/*      */     
/*  207 */     if (br()) {
/*  208 */       this.e.a(new st.c(this.p, this.q, this.t));
/*  209 */       this.e.a(new tb(this.aR, this.aT, this.f.g, this.f.h));
/*  210 */       aqa ☃ = cr();
/*  211 */       if (☃ != this && ☃.cs()) {
/*  212 */         this.e.a(new su(☃));
/*      */       }
/*      */     } else {
/*  215 */       O();
/*      */     } 
/*      */     
/*  218 */     for (eme ☃ : this.bT) {
/*  219 */       ☃.a();
/*      */     }
/*      */   }
/*      */   
/*      */   public float w() {
/*  224 */     for (eme ☃ : this.bT) {
/*  225 */       if (☃ instanceof emi) {
/*  226 */         return ((emi)☃).b();
/*      */       }
/*      */     } 
/*  229 */     return 0.0F;
/*      */   }
/*      */   
/*      */   private void O() {
/*  233 */     boolean ☃ = bA();
/*  234 */     if (☃ != this.cd) {
/*  235 */       ta.a a = ☃ ? ta.a.d : ta.a.e;
/*  236 */       this.e.a(new ta(this, a));
/*  237 */       this.cd = ☃;
/*      */     } 
/*      */     
/*  240 */     boolean bool1 = bu();
/*  241 */     if (bool1 != this.cc) {
/*  242 */       ta.a a = bool1 ? ta.a.a : ta.a.b;
/*  243 */       this.e.a(new ta(this, a));
/*  244 */       this.cc = bool1;
/*      */     } 
/*      */     
/*  247 */     if (K()) {
/*  248 */       double d1 = cD() - this.bV;
/*  249 */       double d2 = cE() - this.bW;
/*  250 */       double d3 = cH() - this.bX;
/*      */       
/*  252 */       double d4 = (this.p - this.bY);
/*  253 */       double d5 = (this.q - this.bZ);
/*      */       
/*  255 */       this.ce++;
/*      */       
/*  257 */       boolean bool2 = (d1 * d1 + d2 * d2 + d3 * d3 > 9.0E-4D || this.ce >= 20);
/*  258 */       boolean bool3 = (d4 != 0.0D || d5 != 0.0D);
/*      */       
/*  260 */       if (br()) {
/*  261 */         dcn dcn = cC();
/*  262 */         this.e.a(new st.b(dcn.b, -999.0D, dcn.d, this.p, this.q, this.t));
/*  263 */         bool2 = false;
/*      */       }
/*  265 */       else if (bool2 && bool3) {
/*  266 */         this.e.a(new st.b(cD(), cE(), cH(), this.p, this.q, this.t));
/*  267 */       } else if (bool2) {
/*  268 */         this.e.a(new st.a(cD(), cE(), cH(), this.t));
/*  269 */       } else if (bool3) {
/*  270 */         this.e.a(new st.c(this.p, this.q, this.t));
/*  271 */       } else if (this.ca != this.t) {
/*  272 */         this.e.a(new st(this.t));
/*      */       } 
/*      */ 
/*      */       
/*  276 */       if (bool2) {
/*  277 */         this.bV = cD();
/*  278 */         this.bW = cE();
/*  279 */         this.bX = cH();
/*  280 */         this.ce = 0;
/*      */       } 
/*  282 */       if (bool3) {
/*  283 */         this.bY = this.p;
/*  284 */         this.bZ = this.q;
/*      */       } 
/*  286 */       this.ca = this.t;
/*      */       
/*  288 */       this.cm = this.g.k.J;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(boolean ☃) {
/*  294 */     sz.a a = ☃ ? sz.a.d : sz.a.e;
/*  295 */     this.e.a(new sz(a, fx.b, gc.a));
/*  296 */     return (this.bm.a(this.bm.d, (☃ && !this.bm.f().a()) ? this.bm.f().E() : 1) != bmb.b);
/*      */   }
/*      */   
/*      */   public void f(String ☃) {
/*  300 */     this.e.a(new se(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aot ☃) {
/*  305 */     super.a(☃);
/*  306 */     this.e.a(new tq(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void ey() {
/*  311 */     this.e.a(new sf(sf.a.a));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void e(apk ☃, float f) {
/*  316 */     if (b(☃)) {
/*      */       return;
/*      */     }
/*  319 */     c(dk() - f);
/*      */   }
/*      */ 
/*      */   
/*      */   public void m() {
/*  324 */     this.e.a(new sl(this.bp.b));
/*  325 */     x();
/*      */   }
/*      */ 
/*      */   
/*      */   public void x() {
/*  330 */     this.bm.g(bmb.b);
/*  331 */     super.m();
/*  332 */     this.g.a((dot)null);
/*      */   }
/*      */   
/*      */   public void v(float ☃) {
/*  336 */     if (this.cf) {
/*  337 */       float f = dk() - ☃;
/*  338 */       if (f <= 0.0F) {
/*  339 */         c(☃);
/*  340 */         if (f < 0.0F) {
/*  341 */           this.P = 10;
/*      */         }
/*      */       } else {
/*  344 */         this.aP = f;
/*  345 */         c(dk());
/*  346 */         this.P = 20;
/*  347 */         e(apk.n, f);
/*  348 */         this.ao = 10;
/*  349 */         this.an = this.ao;
/*      */       } 
/*      */     } else {
/*  352 */       c(☃);
/*  353 */       this.cf = true;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void t() {
/*  359 */     this.e.a(new sy(this.bC));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean ez() {
/*  364 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean ee() {
/*  369 */     return (!this.bC.b && super.ee());
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aO() {
/*  374 */     return (!this.bC.b && super.aO());
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean cN() {
/*  379 */     return (!this.bC.b && super.cN());
/*      */   }
/*      */   
/*      */   protected void z() {
/*  383 */     this.e.a(new ta(this, ta.a.f, afm.d(I() * 100.0F)));
/*      */   }
/*      */   
/*      */   public void A() {
/*  387 */     this.e.a(new ta(this, ta.a.h));
/*      */   }
/*      */   
/*      */   public void g(String ☃) {
/*  391 */     this.cg = ☃;
/*      */   }
/*      */   
/*      */   public String B() {
/*  395 */     return this.cg;
/*      */   }
/*      */   
/*      */   public aeb D() {
/*  399 */     return this.bR;
/*      */   }
/*      */   
/*      */   public djm F() {
/*  403 */     return this.bS;
/*      */   }
/*      */   
/*      */   public void a(boq<?> ☃) {
/*  407 */     if (this.bS.d(☃)) {
/*  408 */       this.bS.e(☃);
/*  409 */       this.e.a(new td(☃));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected int y() {
/*  415 */     return this.bU;
/*      */   }
/*      */   
/*      */   public void a(int ☃) {
/*  419 */     this.bU = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nr ☃, boolean bool) {
/*  424 */     if (bool) {
/*  425 */       this.g.j.a(☃, false);
/*      */     } else {
/*  427 */       this.g.j.c().a(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void b(double ☃, double d1) {
/*  432 */     fx fx = new fx(☃, cE(), d1);
/*      */     
/*  434 */     if (!g(fx)) {
/*      */       return;
/*      */     }
/*      */     
/*  438 */     double d2 = ☃ - fx.u();
/*  439 */     double d3 = d1 - fx.w();
/*      */     
/*  441 */     gc gc = null;
/*  442 */     double d4 = Double.MAX_VALUE;
/*      */     
/*  444 */     gc[] arrayOfGc = { gc.e, gc.f, gc.c, gc.d };
/*  445 */     for (gc gc1 : arrayOfGc) {
/*  446 */       double d5 = gc1.n().a(d2, 0.0D, d3);
/*  447 */       double d6 = (gc1.e() == gc.b.a) ? (1.0D - d5) : d5;
/*  448 */       if (d6 < d4 && !g(fx.a(gc1))) {
/*  449 */         d4 = d6;
/*  450 */         gc = gc1;
/*      */       } 
/*      */     } 
/*      */     
/*  454 */     if (gc != null) {
/*      */       
/*  456 */       dcn dcn = cC();
/*  457 */       if (gc.n() == gc.a.a) {
/*  458 */         n(0.1D * gc.i(), dcn.c, dcn.d);
/*      */       } else {
/*  460 */         n(dcn.b, dcn.c, 0.1D * gc.k());
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean g(fx ☃) {
/*  467 */     dci dci1 = cc();
/*  468 */     dci dci2 = (new dci(☃.u(), dci1.b, ☃.w(), ☃.u() + 1.0D, dci1.e, ☃.w() + 1.0D)).h(1.0E-7D);
/*  469 */     return !this.l.a(this, dci2, (☃, fx1) -> ☃.o(this.l, fx1));
/*      */   }
/*      */ 
/*      */   
/*      */   public void g(boolean ☃) {
/*  474 */     super.g(☃);
/*  475 */     this.bK = 0;
/*      */   }
/*      */   
/*      */   public void a(float ☃, int i, int j) {
/*  479 */     this.bF = ☃;
/*  480 */     this.bE = i;
/*  481 */     this.bD = j;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nr ☃, UUID uUID) {
/*  486 */     this.g.j.c().a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(byte ☃) {
/*  491 */     if (☃ >= 24 && ☃ <= 28) {
/*  492 */       a(☃ - 24);
/*      */     } else {
/*  494 */       super.a(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void b(boolean ☃) {
/*  499 */     this.cq = ☃;
/*      */   }
/*      */   
/*      */   public boolean G() {
/*  503 */     return this.cq;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adp ☃, float f1, float f2) {
/*  508 */     this.l.a(cD(), cE(), cH(), ☃, cu(), f1, f2, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(adp ☃, adr adr1, float f1, float f2) {
/*  513 */     this.l.a(cD(), cE(), cH(), ☃, adr1, f1, f2, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean dS() {
/*  518 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(aot ☃) {
/*  523 */     bmb bmb = b(☃);
/*  524 */     if (bmb.a() || dW()) {
/*      */       return;
/*      */     }
/*      */     
/*  528 */     super.c(☃);
/*      */     
/*  530 */     this.cj = true;
/*  531 */     this.ck = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean dW() {
/*  536 */     return this.cj;
/*      */   }
/*      */ 
/*      */   
/*      */   public void ec() {
/*  541 */     super.ec();
/*  542 */     this.cj = false;
/*      */   }
/*      */ 
/*      */   
/*      */   public aot dX() {
/*  547 */     return this.ck;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(us<?> ☃) {
/*  552 */     super.a(☃);
/*      */     
/*  554 */     if (ag.equals(☃)) {
/*  555 */       boolean bool = ((((Byte)this.R.<Byte>a(ag)).byteValue() & 0x1) > 0);
/*  556 */       aot aot1 = ((((Byte)this.R.<Byte>a(ag)).byteValue() & 0x2) > 0) ? aot.b : aot.a;
/*      */       
/*  558 */       if (bool && !this.cj) {
/*  559 */         c(aot1);
/*  560 */       } else if (!bool && this.cj) {
/*  561 */         ec();
/*      */       } 
/*      */     } 
/*  564 */     if (S.equals(☃) && 
/*  565 */       ef() && !this.co) {
/*  566 */       this.g.W().a(new emk(this));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean H() {
/*  572 */     aqa ☃ = ct();
/*  573 */     return (br() && ☃ instanceof aqw && ((aqw)☃).P_());
/*      */   }
/*      */   
/*      */   public float I() {
/*  577 */     return this.ci;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cdf ☃) {
/*  582 */     this.g.a(new dqv(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bqy ☃) {
/*  587 */     this.g.a(new dqs(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cco ☃) {
/*  592 */     this.g.a(new dpy(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cdj ☃) {
/*  597 */     this.g.a(new dqz(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ccz ☃) {
/*  602 */     this.g.a(new dqn(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bmb ☃, aot aot1) {
/*  607 */     blx blx = ☃.b();
/*      */     
/*  609 */     if (blx == bmd.oT) {
/*  610 */       this.g.a(new dpu(this, ☃, aot1));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqa ☃) {
/*  616 */     this.g.f.a(☃, hh.g);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(aqa ☃) {
/*  621 */     this.g.f.a(☃, hh.r);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bu() {
/*  626 */     return (this.f != null && this.f.h);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bz() {
/*  631 */     return this.cb;
/*      */   }
/*      */   
/*      */   public boolean J() {
/*  635 */     return (bz() || bD());
/*      */   }
/*      */ 
/*      */   
/*      */   public void dP() {
/*  640 */     super.dP();
/*      */     
/*  642 */     if (K()) {
/*  643 */       this.aR = this.f.a;
/*  644 */       this.aT = this.f.b;
/*  645 */       this.aQ = this.f.g;
/*  646 */       this.bN = this.bL;
/*  647 */       this.bO = this.bM;
/*  648 */       this.bM = (float)(this.bM + (this.q - this.bM) * 0.5D);
/*  649 */       this.bL = (float)(this.bL + (this.p - this.bL) * 0.5D);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean K() {
/*  654 */     return (this.g.aa() == this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void k() {
/*  659 */     this.bK++;
/*      */     
/*  661 */     if (this.bJ > 0) {
/*  662 */       this.bJ--;
/*      */     }
/*      */     
/*  665 */     Q();
/*      */     
/*  667 */     boolean ☃ = this.f.g;
/*  668 */     boolean bool1 = this.f.h;
/*  669 */     boolean bool2 = eY();
/*      */     
/*  671 */     this.cb = (!this.bC.b && !bB() && c(aqx.f) && (bu() || (!em() && !c(aqx.a))));
/*      */     
/*  673 */     this.f.a(J());
/*  674 */     this.g.ao().a(this.f);
/*  675 */     if (dW() && !br()) {
/*  676 */       this.f.a *= 0.2F;
/*  677 */       this.f.b *= 0.2F;
/*  678 */       this.bJ = 0;
/*      */     } 
/*  680 */     boolean bool3 = false;
/*  681 */     if (this.cn > 0) {
/*  682 */       this.cn--;
/*  683 */       bool3 = true;
/*  684 */       this.f.g = true;
/*      */     } 
/*      */     
/*  687 */     if (!this.H) {
/*  688 */       b(cD() - cy() * 0.35D, cH() + cy() * 0.35D);
/*  689 */       b(cD() - cy() * 0.35D, cH() - cy() * 0.35D);
/*  690 */       b(cD() + cy() * 0.35D, cH() - cy() * 0.35D);
/*  691 */       b(cD() + cy() * 0.35D, cH() + cy() * 0.35D);
/*      */     } 
/*      */     
/*  694 */     if (bool1) {
/*  695 */       this.bJ = 0;
/*      */     }
/*      */     
/*  698 */     boolean bool4 = (eI().a() > 6.0F || this.bC.c);
/*  699 */     if ((this.t || aI()) && !bool1 && !bool2 && eY() && !bA() && bool4 && !dW() && !a(apw.o)) {
/*  700 */       if (this.bJ > 0 || this.g.k.al.d()) {
/*  701 */         g(true);
/*      */       } else {
/*  703 */         this.bJ = 7;
/*      */       } 
/*      */     }
/*  706 */     if (!bA() && (!aE() || aI()) && eY() && bool4 && !dW() && !a(apw.o) && this.g.k.al.d()) {
/*  707 */       g(true);
/*      */     }
/*  709 */     if (bA()) {
/*  710 */       boolean bool6 = (!this.f.b() || !bool4);
/*  711 */       boolean bool7 = (bool6 || this.u || (aE() && !aI()));
/*  712 */       if (bB()) {
/*  713 */         if ((!this.t && !this.f.h && bool6) || !aE()) {
/*  714 */           g(false);
/*      */         }
/*  716 */       } else if (bool7) {
/*  717 */         g(false);
/*      */       } 
/*      */     } 
/*      */     
/*  721 */     boolean bool5 = false;
/*  722 */     if (this.bC.c) {
/*  723 */       if (this.g.q.j()) {
/*  724 */         if (!this.bC.b) {
/*  725 */           this.bC.b = true;
/*  726 */           bool5 = true;
/*  727 */           t();
/*      */         }
/*      */       
/*  730 */       } else if (!☃ && this.f.g && !bool3) {
/*  731 */         if (this.br == 0) {
/*  732 */           this.br = 7;
/*  733 */         } else if (!bB()) {
/*  734 */           this.bC.b = !this.bC.b;
/*  735 */           bool5 = true;
/*  736 */           t();
/*  737 */           this.br = 0;
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  743 */     if (this.f.g && !bool5 && !☃ && !this.bC.b && !br() && !c_()) {
/*  744 */       bmb bmb = b(aqf.e);
/*  745 */       if (bmb.b() == bmd.qo && bld.d(bmb) && 
/*  746 */         eD()) {
/*  747 */         this.e.a(new ta(this, ta.a.i));
/*      */       }
/*      */     } 
/*      */     
/*  751 */     this.co = ef();
/*      */     
/*  753 */     if (aE() && this.f.h && cT()) {
/*  754 */       dL();
/*      */     }
/*      */     
/*  757 */     if (a(aef.b)) {
/*  758 */       int i = a_() ? 10 : 1;
/*  759 */       this.cp = afm.a(this.cp + i, 0, 600);
/*  760 */     } else if (this.cp > 0) {
/*  761 */       a(aef.b);
/*  762 */       this.cp = afm.a(this.cp - 10, 0, 600);
/*      */     } 
/*      */     
/*  765 */     if (this.bC.b && K()) {
/*      */       
/*  767 */       int i = 0;
/*      */       
/*  769 */       if (this.f.h) {
/*  770 */         i--;
/*      */       }
/*  772 */       if (this.f.g) {
/*  773 */         i++;
/*      */       }
/*      */       
/*  776 */       if (i != 0) {
/*  777 */         f(cC().b(0.0D, (i * this.bC.a() * 3.0F), 0.0D));
/*      */       }
/*      */     } 
/*      */     
/*  781 */     if (H()) {
/*  782 */       aqw aqw = (aqw)ct();
/*  783 */       if (this.ch < 0) {
/*  784 */         this.ch++;
/*  785 */         if (this.ch == 0)
/*      */         {
/*  787 */           this.ci = 0.0F;
/*      */         }
/*      */       } 
/*  790 */       if (☃ && !this.f.g) {
/*      */         
/*  792 */         this.ch = -10;
/*  793 */         aqw.b_(afm.d(I() * 100.0F));
/*  794 */         z();
/*  795 */       } else if (!☃ && this.f.g) {
/*      */         
/*  797 */         this.ch = 0;
/*  798 */         this.ci = 0.0F;
/*  799 */       } else if (☃) {
/*      */         
/*  801 */         this.ch++;
/*  802 */         if (this.ch < 10) {
/*  803 */           this.ci = this.ch * 0.1F;
/*      */         } else {
/*  805 */           this.ci = 0.8F + 2.0F / (this.ch - 9) * 0.1F;
/*      */         } 
/*      */       } 
/*      */     } else {
/*  809 */       this.ci = 0.0F;
/*      */     } 
/*      */     
/*  812 */     super.k();
/*  813 */     if (this.t && this.bC.b && !this.g.q.j()) {
/*  814 */       this.bC.b = false;
/*  815 */       t();
/*      */     } 
/*      */   }
/*      */   
/*      */   private void Q() {
/*  820 */     this.bQ = this.bP;
/*      */     
/*  822 */     if (this.aa) {
/*  823 */       if (this.g.y != null && !this.g.y.ay_()) {
/*  824 */         if (this.g.y instanceof dpp) {
/*  825 */           m();
/*      */         }
/*  827 */         this.g.a((dot)null);
/*      */       } 
/*      */       
/*  830 */       if (this.bP == 0.0F) {
/*  831 */         this.g.W().a(emp.b(adq.lP, this.J.nextFloat() * 0.4F + 0.8F, 0.25F));
/*      */       }
/*  833 */       this.bP += 0.0125F;
/*  834 */       if (this.bP >= 1.0F) {
/*  835 */         this.bP = 1.0F;
/*      */       }
/*  837 */       this.aa = false;
/*  838 */     } else if (a(apw.i) && b(apw.i).b() > 60) {
/*  839 */       this.bP += 0.006666667F;
/*  840 */       if (this.bP > 1.0F) {
/*  841 */         this.bP = 1.0F;
/*      */       }
/*      */     } else {
/*  844 */       if (this.bP > 0.0F) {
/*  845 */         this.bP -= 0.05F;
/*      */       }
/*  847 */       if (this.bP < 0.0F) {
/*  848 */         this.bP = 0.0F;
/*      */       }
/*      */     } 
/*      */     
/*  852 */     E();
/*      */   }
/*      */ 
/*      */   
/*      */   public void ba() {
/*  857 */     super.ba();
/*  858 */     this.cl = false;
/*      */     
/*  860 */     if (ct() instanceof bhn) {
/*  861 */       bhn ☃ = (bhn)ct();
/*  862 */       ☃.a(this.f.e, this.f.f, this.f.c, this.f.d);
/*      */       
/*  864 */       this.cl |= (this.f.e || this.f.f || this.f.c || this.f.d) ? 1 : 0;
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean L() {
/*  869 */     return this.cl;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public apu c(@Nullable aps ☃) {
/*  875 */     if (☃ == apw.i) {
/*  876 */       this.bQ = 0.0F;
/*  877 */       this.bP = 0.0F;
/*      */     } 
/*      */     
/*  880 */     return super.c(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqr ☃, dcn dcn1) {
/*  885 */     double d1 = cD();
/*  886 */     double d2 = cH();
/*  887 */     super.a(☃, dcn1);
/*  888 */     g((float)(cD() - d1), (float)(cH() - d2));
/*      */   }
/*      */   
/*      */   public boolean M() {
/*  892 */     return this.cm;
/*      */   }
/*      */   
/*      */   protected void g(float ☃, float f1) {
/*  896 */     if (!eW()) {
/*      */       return;
/*      */     }
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
/*  931 */     dcn dcn1 = cA();
/*  932 */     dcn dcn2 = dcn1.b(☃, 0.0D, f1);
/*  933 */     dcn dcn3 = new dcn(☃, 0.0D, f1);
/*      */ 
/*      */     
/*  936 */     float f2 = dN();
/*  937 */     float f3 = (float)dcn3.g();
/*  938 */     if (f3 <= 0.001F) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  943 */       dcm dcm = this.f.a();
/*  944 */       float f13 = f2 * dcm.i;
/*  945 */       float f14 = f2 * dcm.j;
/*      */ 
/*      */       
/*  948 */       float f15 = afm.a(this.p * 0.017453292F);
/*  949 */       float f16 = afm.b(this.p * 0.017453292F);
/*  950 */       dcn3 = new dcn((f13 * f16 - f14 * f15), dcn3.c, (f14 * f16 + f13 * f15));
/*      */       
/*  952 */       f3 = (float)dcn3.g();
/*      */ 
/*      */       
/*  955 */       if (f3 <= 0.001F) {
/*      */         return;
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  961 */     float f4 = afm.i(f3);
/*  962 */     dcn dcn4 = dcn3.a(f4);
/*      */ 
/*      */ 
/*      */     
/*  966 */     dcn dcn5 = bj();
/*  967 */     float f5 = (float)(dcn5.b * dcn4.b + dcn5.d * dcn4.d);
/*  968 */     if (f5 < -0.15F) {
/*      */       return;
/*      */     }
/*      */     
/*  972 */     dcs dcs = dcs.a(this);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  977 */     fx fx = new fx(cD(), (cc()).e, cH());
/*  978 */     ceh ceh1 = this.l.d_(fx);
/*  979 */     if (!ceh1.b(this.l, fx, dcs).b()) {
/*      */       return;
/*      */     }
/*      */     
/*  983 */     fx = fx.b();
/*  984 */     ceh ceh2 = this.l.d_(fx);
/*  985 */     if (!ceh2.b(this.l, fx, dcs).b()) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  996 */     float f6 = 7.0F;
/*  997 */     float f7 = 1.2F;
/*  998 */     if (a(apw.h)) {
/*  999 */       f7 += (b(apw.h).c() + 1) * 0.75F;
/*      */     }
/*      */ 
/*      */     
/* 1003 */     float f8 = Math.max(f2 * 7.0F, 1.0F / f4);
/*      */ 
/*      */     
/* 1006 */     dcn dcn6 = dcn1;
/* 1007 */     dcn dcn7 = dcn2.e(dcn4.a(f8));
/*      */ 
/*      */ 
/*      */     
/* 1011 */     float f9 = cy();
/* 1012 */     float f10 = cz();
/* 1013 */     dci dci = (new dci(dcn6, dcn7.b(0.0D, f10, 0.0D))).c(f9, 0.0D, f9);
/*      */ 
/*      */ 
/*      */     
/* 1017 */     dcn6 = dcn6.b(0.0D, 0.5099999904632568D, 0.0D);
/* 1018 */     dcn7 = dcn7.b(0.0D, 0.5099999904632568D, 0.0D);
/*      */ 
/*      */ 
/*      */     
/* 1022 */     dcn dcn8 = dcn4.c(new dcn(0.0D, 1.0D, 0.0D));
/* 1023 */     dcn dcn9 = dcn8.a((f9 * 0.5F));
/*      */ 
/*      */     
/* 1026 */     dcn dcn10 = dcn6.d(dcn9);
/* 1027 */     dcn dcn11 = dcn7.d(dcn9);
/* 1028 */     dcn dcn12 = dcn6.e(dcn9);
/* 1029 */     dcn dcn13 = dcn7.e(dcn9);
/*      */ 
/*      */     
/* 1032 */     Iterator<dci> iterator = this.l.d(this, dci, ☃ -> true).<dci>flatMap(☃ -> ☃.d().stream()).iterator();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1037 */     float f11 = Float.MIN_VALUE;
/*      */     
/* 1039 */     while (iterator.hasNext()) {
/* 1040 */       dci dci1 = iterator.next();
/* 1041 */       if (!dci1.a(dcn10, dcn11) && !dci1.a(dcn12, dcn13)) {
/*      */         continue;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1048 */       f11 = (float)dci1.e;
/* 1049 */       dcn dcn = dci1.f();
/* 1050 */       fx fx1 = new fx(dcn);
/*      */ 
/*      */       
/* 1053 */       for (int i = 1; i < f7; i++) {
/* 1054 */         fx fx2 = fx1.b(i);
/* 1055 */         ceh ceh = this.l.d_(fx2); ddh ddh;
/* 1056 */         if (!(ddh = ceh.b(this.l, fx2, dcs)).b()) {
/* 1057 */           f11 = (float)ddh.c(gc.a.b) + fx2.v();
/* 1058 */           if (f11 - cE() > f7) {
/*      */             return;
/*      */           }
/*      */         } 
/* 1062 */         if (i > 1) {
/* 1063 */           fx = fx.b();
/* 1064 */           ceh ceh3 = this.l.d_(fx);
/* 1065 */           if (!ceh3.b(this.l, fx, dcs).b()) {
/*      */             return;
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1076 */     if (f11 == Float.MIN_VALUE) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1085 */     float f12 = (float)(f11 - cE());
/* 1086 */     if (f12 <= 0.5F || f12 > f7) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1091 */     this.cn = 1;
/*      */   }
/*      */   
/*      */   private boolean eW() {
/* 1095 */     return (M() && this.cn <= 0 && this.t && 
/*      */ 
/*      */       
/* 1098 */       !es() && 
/* 1099 */       !br() && 
/* 1100 */       eX() && 
/* 1101 */       aq() >= 1.0D);
/*      */   }
/*      */   
/*      */   private boolean eX() {
/* 1105 */     dcm ☃ = this.f.a();
/* 1106 */     return (☃.i != 0.0F || ☃.j != 0.0F);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean eY() {
/* 1112 */     double ☃ = 0.8D;
/* 1113 */     return aI() ? this.f.b() : ((this.f.b >= 0.8D));
/*      */   }
/*      */   
/*      */   public float N() {
/* 1117 */     if (!a(aef.b)) {
/* 1118 */       return 0.0F;
/*      */     }
/* 1120 */     float ☃ = 600.0F;
/* 1121 */     float f1 = 100.0F;
/* 1122 */     if (this.cp >= 600.0F) {
/* 1123 */       return 1.0F;
/*      */     }
/* 1125 */     float f2 = afm.a(this.cp / 100.0F, 0.0F, 1.0F);
/* 1126 */     float f3 = (this.cp < 100.0F) ? 0.0F : afm.a((this.cp - 100.0F) / 500.0F, 0.0F, 1.0F);
/* 1127 */     return f2 * 0.6F + f3 * 0.39999998F;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aI() {
/* 1132 */     return this.bB;
/*      */   }
/*      */ 
/*      */   
/*      */   protected boolean et() {
/* 1137 */     boolean ☃ = this.bB;
/* 1138 */     boolean bool1 = super.et();
/*      */     
/* 1140 */     if (a_()) {
/* 1141 */       return this.bB;
/*      */     }
/*      */     
/* 1144 */     if (!☃ && bool1) {
/* 1145 */       this.l.a(cD(), cE(), cH(), adq.q, adr.i, 1.0F, 1.0F, false);
/* 1146 */       this.g.W().a(new emw.b(this));
/*      */     } 
/*      */     
/* 1149 */     if (☃ && !bool1) {
/* 1150 */       this.l.a(cD(), cE(), cH(), adq.r, adr.i, 1.0F, 1.0F, false);
/*      */     }
/*      */     
/* 1153 */     return this.bB;
/*      */   }
/*      */ 
/*      */   
/*      */   public dcn o(float ☃) {
/* 1158 */     if (this.g.k.g().a()) {
/* 1159 */       float f1 = afm.g(☃ * 0.5F, this.p, this.r) * 0.017453292F;
/* 1160 */       float f2 = afm.g(☃ * 0.5F, this.q, this.s) * 0.017453292F;
/* 1161 */       double d = (dV() == aqi.b) ? -1.0D : 1.0D;
/* 1162 */       dcn dcn = new dcn(0.39D * d, -0.6D, 0.3D);
/* 1163 */       return dcn.a(-f2).b(-f1).e(j(☃));
/*      */     } 
/* 1165 */     return super.o(☃);
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
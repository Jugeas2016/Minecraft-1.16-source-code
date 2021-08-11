/*      */ import com.google.common.collect.Lists;
/*      */ import java.util.Comparator;
/*      */ import java.util.EnumSet;
/*      */ import java.util.List;
/*      */ import java.util.Optional;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
/*      */ import java.util.function.Predicate;
/*      */ import java.util.stream.Collectors;
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
/*      */ public class baa
/*      */   extends azz
/*      */   implements aqs, bag
/*      */ {
/*   93 */   private static final us<Byte> bo = uv.a((Class)baa.class, uu.a);
/*   94 */   private static final us<Integer> bp = uv.a((Class)baa.class, uu.b);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  128 */   private static final afh bq = afu.a(20, 39);
/*      */ 
/*      */   
/*      */   private UUID br;
/*      */ 
/*      */   
/*      */   private float bs;
/*      */ 
/*      */   
/*      */   private float bt;
/*      */ 
/*      */   
/*      */   private int bu;
/*      */   
/*      */   private int bv;
/*      */   
/*      */   private int bw;
/*      */   
/*      */   private int bx;
/*      */   
/*  148 */   private int by = 0;
/*      */ 
/*      */   
/*  151 */   private int bz = 0;
/*      */   @Nullable
/*  153 */   private fx bA = null;
/*      */   
/*      */   @Nullable
/*  156 */   private fx bB = null;
/*      */   
/*      */   private k bC;
/*      */   
/*      */   private e bD;
/*      */   
/*      */   private f bE;
/*      */   private int bF;
/*      */   
/*      */   public baa(aqe<? extends baa> ☃, brx brx1) {
/*  166 */     super((aqe)☃, brx1);
/*  167 */     this.bh = new auy(this, 20, true);
/*  168 */     this.g = new j(this, this);
/*      */     
/*  170 */     a(cwz.l, -1.0F);
/*  171 */     a(cwz.h, -1.0F);
/*  172 */     a(cwz.i, 16.0F);
/*  173 */     a(cwz.x, -1.0F);
/*  174 */     a(cwz.f, -1.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void e() {
/*  179 */     super.e();
/*  180 */     this.R.a(bo, Byte.valueOf((byte)0));
/*  181 */     this.R.a(bp, Integer.valueOf(0));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public float a(fx ☃, brz brz1) {
/*  187 */     if (brz1.d_(☃).g()) {
/*  188 */       return 10.0F;
/*      */     }
/*  190 */     return 0.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void o() {
/*  195 */     this.bk.a(0, new b(this, this, 1.399999976158142D, true));
/*  196 */     this.bk.a(1, new d());
/*  197 */     this.bk.a(2, new avi(this, 1.0D));
/*  198 */     this.bk.a(3, new axf(this, 1.25D, bon.a(aeg.M), false));
/*      */     
/*  200 */     this.bC = new k(this);
/*  201 */     this.bk.a(4, this.bC);
/*      */     
/*  203 */     this.bk.a(5, new avu(this, 1.25D));
/*      */     
/*  205 */     this.bk.a(5, new i());
/*      */     
/*  207 */     this.bD = new e(this);
/*  208 */     this.bk.a(5, this.bD);
/*      */     
/*  210 */     this.bE = new f(this);
/*  211 */     this.bk.a(6, this.bE);
/*      */     
/*  213 */     this.bk.a(7, new g());
/*  214 */     this.bk.a(8, new l(this));
/*  215 */     this.bk.a(9, new avp(this));
/*      */     
/*  217 */     this.bl.a(1, (new h(this, this)).a(new Class[0]));
/*  218 */     this.bl.a(2, new c(this));
/*  219 */     this.bl.a(3, new axw<>(this, true));
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(md ☃) {
/*  224 */     super.b(☃);
/*      */     
/*  226 */     if (eU()) {
/*  227 */       ☃.a("HivePos", mp.a(eV()));
/*      */     }
/*  229 */     if (eL()) {
/*  230 */       ☃.a("FlowerPos", mp.a(eK()));
/*      */     }
/*  232 */     ☃.a("HasNectar", eX());
/*  233 */     ☃.a("HasStung", eY());
/*  234 */     ☃.b("TicksSincePollination", this.bv);
/*  235 */     ☃.b("CannotEnterHiveTicks", this.bw);
/*  236 */     ☃.b("CropsGrownSincePollination", this.bx);
/*      */     
/*  238 */     c(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(md ☃) {
/*  243 */     this.bB = null;
/*  244 */     if (☃.e("HivePos")) {
/*  245 */       this.bB = mp.b(☃.p("HivePos"));
/*      */     }
/*      */     
/*  248 */     this.bA = null;
/*  249 */     if (☃.e("FlowerPos")) {
/*  250 */       this.bA = mp.b(☃.p("FlowerPos"));
/*      */     }
/*      */     
/*  253 */     super.a(☃);
/*  254 */     t(☃.q("HasNectar"));
/*  255 */     u(☃.q("HasStung"));
/*  256 */     this.bv = ☃.h("TicksSincePollination");
/*  257 */     this.bw = ☃.h("CannotEnterHiveTicks");
/*  258 */     this.bx = ☃.h("CropsGrownSincePollination");
/*      */     
/*  260 */     a((aag)this.l, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean B(aqa ☃) {
/*  265 */     boolean bool = ☃.a(apk.b(this), (int)b(arl.f));
/*  266 */     if (bool) {
/*  267 */       a(this, ☃);
/*  268 */       if (☃ instanceof aqm) {
/*  269 */         ((aqm)☃).q(((aqm)☃).dz() + 1);
/*  270 */         int i = 0;
/*  271 */         if (this.l.ad() == aor.c) {
/*  272 */           i = 10;
/*  273 */         } else if (this.l.ad() == aor.d) {
/*  274 */           i = 18;
/*      */         } 
/*      */         
/*  277 */         if (i > 0) {
/*  278 */           ((aqm)☃).c(new apu(apw.s, i * 20, 0));
/*      */         }
/*      */       } 
/*  281 */       u(true);
/*  282 */       J_();
/*      */       
/*  284 */       a(adq.aC, 1.0F, 1.0F);
/*      */     } 
/*  286 */     return bool;
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {
/*  291 */     super.j();
/*      */ 
/*      */     
/*  294 */     if (eX() && fg() < 10 && this.J.nextFloat() < 0.05F) {
/*  295 */       for (int ☃ = 0; ☃ < this.J.nextInt(2) + 1; ☃++) {
/*  296 */         a(this.l, cD() - 0.30000001192092896D, cD() + 0.30000001192092896D, cH() - 0.30000001192092896D, cH() + 0.30000001192092896D, e(0.5D), hh.al);
/*      */       }
/*      */     }
/*      */     
/*  300 */     fe();
/*      */   }
/*      */   
/*      */   private void a(brx ☃, double d1, double d2, double d3, double d4, double d5, hf hf1) {
/*  304 */     ☃.a(hf1, afm.d(☃.t.nextDouble(), d1, d2), d5, afm.d(☃.t.nextDouble(), d3, d4), 0.0D, 0.0D, 0.0D);
/*      */   }
/*      */   
/*      */   private void h(fx ☃) {
/*  308 */     dcn dcn1 = dcn.c(☃);
/*  309 */     int i = 0;
/*  310 */     fx fx1 = cB();
/*  311 */     int j = (int)dcn1.c - fx1.v();
/*  312 */     if (j > 2) {
/*  313 */       i = 4;
/*  314 */     } else if (j < -2) {
/*  315 */       i = -4;
/*      */     } 
/*      */     
/*  318 */     int m = 6;
/*  319 */     int n = 8;
/*  320 */     int i1 = fx1.k(☃);
/*  321 */     if (i1 < 15) {
/*  322 */       m = i1 / 2;
/*  323 */       n = i1 / 2;
/*      */     } 
/*      */     
/*  326 */     dcn dcn2 = azj.b(this, m, n, i, dcn1, 0.3141592741012573D);
/*  327 */     if (dcn2 == null) {
/*      */       return;
/*      */     }
/*  330 */     this.bj.a(0.5F);
/*  331 */     this.bj.a(dcn2.b, dcn2.c, dcn2.d, 1.0D);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public fx eK() {
/*  336 */     return this.bA;
/*      */   }
/*      */   
/*      */   public boolean eL() {
/*  340 */     return (this.bA != null);
/*      */   }
/*      */   
/*      */   public void g(fx ☃) {
/*  344 */     this.bA = ☃;
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
/*      */   private boolean fc() {
/*  358 */     return (this.bv > 3600);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean fd() {
/*  363 */     if (this.bw > 0 || k.a(this.bC) || eY() || A() != null) {
/*  364 */       return false;
/*      */     }
/*      */ 
/*      */     
/*  368 */     boolean ☃ = (fc() || this.l.X() || this.l.N() || eX());
/*      */ 
/*      */     
/*  371 */     return (☃ && !ff());
/*      */   }
/*      */   
/*      */   public void t(int ☃) {
/*  375 */     this.bw = ☃;
/*      */   }
/*      */   
/*      */   public float y(float ☃) {
/*  379 */     return afm.g(☃, this.bt, this.bs);
/*      */   }
/*      */   
/*      */   private void fe() {
/*  383 */     this.bt = this.bs;
/*  384 */     if (fk()) {
/*  385 */       this.bs = Math.min(1.0F, this.bs + 0.2F);
/*      */     } else {
/*  387 */       this.bs = Math.max(0.0F, this.bs - 0.24F);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void N() {
/*  393 */     boolean ☃ = eY();
/*      */     
/*  395 */     if (aH()) {
/*  396 */       this.bF++;
/*      */     } else {
/*  398 */       this.bF = 0;
/*      */     } 
/*      */     
/*  401 */     if (this.bF > 20) {
/*  402 */       a(apk.h, 1.0F);
/*      */     }
/*      */     
/*  405 */     if (☃) {
/*  406 */       this.bu++;
/*      */ 
/*      */ 
/*      */       
/*  410 */       if (this.bu % 5 == 0 && this.J.nextInt(afm.a(1200 - this.bu, 1, 1200)) == 0) {
/*  411 */         a(apk.n, dk());
/*      */       }
/*      */     } 
/*      */     
/*  415 */     if (!eX()) {
/*  416 */       this.bv++;
/*      */     }
/*      */     
/*  419 */     if (!this.l.v) {
/*  420 */       a((aag)this.l, false);
/*      */     }
/*      */   }
/*      */   
/*      */   public void eO() {
/*  425 */     this.bv = 0;
/*      */   }
/*      */   
/*      */   private boolean ff() {
/*  429 */     if (this.bB == null) {
/*  430 */       return false;
/*      */     }
/*  432 */     ccj ☃ = this.l.c(this.bB);
/*  433 */     return (☃ instanceof ccg && ((ccg)☃).d());
/*      */   }
/*      */ 
/*      */   
/*      */   public int E_() {
/*  438 */     return ((Integer)this.R.<Integer>a(bp)).intValue();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a_(int ☃) {
/*  443 */     this.R.b(bp, Integer.valueOf(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public UUID F_() {
/*  448 */     return this.br;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(@Nullable UUID ☃) {
/*  453 */     this.br = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void G_() {
/*  458 */     a_(bq.a(this.J));
/*      */   }
/*      */   
/*      */   private boolean i(fx ☃) {
/*  462 */     ccj ccj = this.l.c(☃);
/*  463 */     if (ccj instanceof ccg) {
/*  464 */       return !((ccg)ccj).h();
/*      */     }
/*  466 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean eU() {
/*  471 */     return (this.bB != null);
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public fx eV() {
/*  477 */     return this.bB;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void M() {
/*  487 */     super.M();
/*      */     
/*  489 */     rz.a(this);
/*      */   }
/*      */   
/*      */   private int fg() {
/*  493 */     return this.bx;
/*      */   }
/*      */   
/*      */   private void fh() {
/*  497 */     this.bx = 0;
/*      */   }
/*      */   
/*      */   private void fi() {
/*  501 */     this.bx++;
/*      */   }
/*      */ 
/*      */   
/*      */   public void k() {
/*  506 */     super.k();
/*      */     
/*  508 */     if (!this.l.v) {
/*  509 */       if (this.bw > 0) {
/*  510 */         this.bw--;
/*      */       }
/*  512 */       if (this.by > 0) {
/*  513 */         this.by--;
/*      */       }
/*  515 */       if (this.bz > 0) {
/*  516 */         this.bz--;
/*      */       }
/*      */ 
/*      */       
/*  520 */       boolean ☃ = (H_() && !eY() && A() != null && A().h(this) < 4.0D);
/*  521 */       v(☃);
/*      */       
/*  523 */       if (this.K % 20 == 0)
/*      */       {
/*  525 */         if (!fj()) {
/*  526 */           this.bB = null;
/*      */         }
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean fj() {
/*  533 */     if (!eU()) {
/*  534 */       return false;
/*      */     }
/*  536 */     ccj ☃ = this.l.c(this.bB);
/*  537 */     return (☃ != null && ☃.u() == cck.G);
/*      */   }
/*      */   
/*      */   public boolean eX() {
/*  541 */     return u(8);
/*      */   }
/*      */   
/*      */   private void t(boolean ☃) {
/*  545 */     if (☃) {
/*  546 */       eO();
/*      */     }
/*  548 */     d(8, ☃);
/*      */   }
/*      */   
/*      */   public boolean eY() {
/*  552 */     return u(4);
/*      */   }
/*      */   
/*      */   private void u(boolean ☃) {
/*  556 */     d(4, ☃);
/*      */   }
/*      */   
/*      */   private boolean fk() {
/*  560 */     return u(2);
/*      */   }
/*      */   
/*      */   private void v(boolean ☃) {
/*  564 */     d(2, ☃);
/*      */   }
/*      */   
/*      */   private boolean j(fx ☃) {
/*  568 */     return !b(☃, 32);
/*      */   }
/*      */   
/*      */   private void d(int ☃, boolean bool) {
/*  572 */     if (bool) {
/*  573 */       this.R.b(bo, Byte.valueOf((byte)(((Byte)this.R.<Byte>a(bo)).byteValue() | ☃)));
/*      */     } else {
/*  575 */       this.R.b(bo, Byte.valueOf((byte)(((Byte)this.R.<Byte>a(bo)).byteValue() & (☃ ^ 0xFFFFFFFF))));
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean u(int ☃) {
/*  580 */     return ((((Byte)this.R.<Byte>a(bo)).byteValue() & ☃) != 0);
/*      */   }
/*      */   
/*      */   public static ark.a eZ() {
/*  584 */     return aqn.p()
/*  585 */       .a(arl.a, 10.0D)
/*  586 */       .a(arl.e, 0.6000000238418579D)
/*  587 */       .a(arl.d, 0.30000001192092896D)
/*  588 */       .a(arl.f, 2.0D)
/*  589 */       .a(arl.b, 48.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   protected ayj b(brx ☃) {
/*  594 */     ayh ayh = new ayh(this, this, ☃)
/*      */       {
/*      */         public boolean a(fx ☃) {
/*  597 */           return !this.b.d_(☃.c()).g();
/*      */         }
/*      */ 
/*      */         
/*      */         public void c() {
/*  602 */           if (baa.k.a(baa.a(this.p))) {
/*      */             return;
/*      */           }
/*      */           
/*  606 */           super.c();
/*      */         }
/*      */       };
/*  609 */     ayh.a(false);
/*  610 */     ayh.d(false);
/*  611 */     ayh.b(true);
/*  612 */     return ayh;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean k(bmb ☃) {
/*  617 */     return ☃.b().a(aeg.M);
/*      */   }
/*      */   
/*      */   private boolean k(fx ☃) {
/*  621 */     return (this.l.p(☃) && this.l.d_(☃).b().a(aed.O));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void b(fx ☃, ceh ceh1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected adp I() {
/*  631 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp e(apk ☃) {
/*  636 */     return adq.az;
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp dq() {
/*  641 */     return adq.ay;
/*      */   }
/*      */ 
/*      */   
/*      */   protected float dG() {
/*  646 */     return 0.4F;
/*      */   }
/*      */ 
/*      */   
/*      */   public baa b(aag ☃, apy apy1) {
/*  651 */     return aqe.e.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   protected float b(aqx ☃, aqb aqb1) {
/*  656 */     if (w_()) {
/*  657 */       return aqb1.b * 0.5F;
/*      */     }
/*  659 */     return aqb1.b * 0.5F;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(float ☃, float f1) {
/*  664 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void a(double ☃, boolean bool, ceh ceh1, fx fx1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean az() {
/*  674 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void fb() {
/*  683 */     t(false);
/*  684 */     fh();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(apk ☃, float f1) {
/*  689 */     if (b(☃)) {
/*  690 */       return false;
/*      */     }
/*  692 */     aqa aqa = ☃.k();
/*  693 */     if (!this.l.v) {
/*  694 */       k.b(this.bC);
/*      */     }
/*  696 */     return super.a(☃, f1);
/*      */   }
/*      */ 
/*      */   
/*      */   public aqq dC() {
/*  701 */     return aqq.c;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void c(ael<cuw> ☃) {
/*  706 */     f(cC().b(0.0D, 0.01D, 0.0D));
/*      */   }
/*      */ 
/*      */   
/*      */   public dcn cf() {
/*  711 */     return new dcn(0.0D, (0.5F * ce()), (cy() * 0.2F));
/*      */   }
/*      */   
/*      */   private boolean b(fx ☃, int i) {
/*  715 */     return ☃.a(cB(), i);
/*      */   }
/*      */   
/*      */   class h extends axp {
/*      */     h(baa this$0, baa ☃) {
/*  720 */       super(☃, new Class[0]);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean b() {
/*  726 */       return (this.a.H_() && super.b());
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(aqn ☃, aqm aqm1) {
/*  731 */       if (☃ instanceof baa && this.e.D(aqm1))
/*  732 */         ☃.h(aqm1); 
/*      */     }
/*      */   }
/*      */   
/*      */   static class c
/*      */     extends axq<bfw> {
/*      */     c(baa ☃) {
/*  739 */       super(☃, bfw.class, 10, true, false, ☃::a_);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  744 */       return (h() && super.a());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/*  749 */       boolean ☃ = h();
/*  750 */       if (!☃ || this.e.A() == null) {
/*  751 */         this.g = null;
/*  752 */         return false;
/*      */       } 
/*  754 */       return super.b();
/*      */     }
/*      */     
/*      */     private boolean h() {
/*  758 */       baa ☃ = (baa)this.e;
/*  759 */       return (☃.H_() && !☃.eY());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   abstract class a
/*      */     extends avv
/*      */   {
/*      */     private a(baa this$0) {}
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  771 */       return (g() && !this.a.H_());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/*  776 */       return (h() && !this.a.H_());
/*      */     }
/*      */     
/*      */     public abstract boolean g();
/*      */     
/*      */     public abstract boolean h(); }
/*      */   
/*      */   class l extends avv {
/*      */     l(baa this$0) {
/*  785 */       a(EnumSet.of(avv.a.a));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  790 */       return (baa.b(this.a).m() && baa.c(this.a).nextInt(10) == 0);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/*  795 */       return baa.d(this.a).n();
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/*  800 */       dcn ☃ = g();
/*  801 */       if (☃ != null) {
/*  802 */         baa.f(this.a).a(baa.e(this.a).a(new fx(☃), 1), 1.0D);
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     @Nullable
/*      */     private dcn g() {
/*      */       dcn ☃;
/*  810 */       if (baa.g(this.a) && !baa.a(this.a, baa.h(this.a), 22)) {
/*      */         
/*  812 */         dcn dcn = dcn.a(baa.h(this.a));
/*  813 */         ☃ = dcn.d(this.a.cA()).d();
/*      */       } else {
/*  815 */         ☃ = this.a.f(0.0F);
/*      */       } 
/*      */       
/*  818 */       int i = 8;
/*  819 */       dcn dcn1 = azj.a(this.a, 8, 7, ☃, 1.5707964F, 2, 1);
/*  820 */       if (dcn1 != null) {
/*  821 */         return dcn1;
/*      */       }
/*      */ 
/*      */       
/*  825 */       return azj.a(this.a, 8, 4, -2, ☃, 1.5707963705062866D);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public class e
/*      */     extends a
/*      */   {
/*  838 */     private int c = this.b.l.t.nextInt(10);
/*      */ 
/*      */     
/*  841 */     private List<fx> d = Lists.newArrayList();
/*      */     @Nullable
/*  843 */     private cxd e = null;
/*      */     
/*      */     private int f;
/*      */ 
/*      */     
/*      */     e(baa ☃) {
/*  849 */       super(☃);
/*  850 */       a(EnumSet.of(avv.a.a));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean g() {
/*  855 */       return (baa.h(this.b) != null && 
/*  856 */         !this.b.ez() && 
/*  857 */         baa.i(this.b) && 
/*  858 */         !d(baa.h(this.b)) && this.b.l
/*  859 */         .d_(baa.h(this.b)).a(aed.aj));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean h() {
/*  864 */       return g();
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/*  869 */       this.c = 0;
/*  870 */       this.f = 0;
/*  871 */       super.c();
/*      */     }
/*      */ 
/*      */     
/*      */     public void d() {
/*  876 */       this.c = 0;
/*  877 */       this.f = 0;
/*  878 */       baa.j(this.b).o();
/*  879 */       baa.k(this.b).g();
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/*  884 */       if (baa.h(this.b) == null) {
/*      */         return;
/*      */       }
/*      */       
/*  888 */       this.c++;
/*      */       
/*  890 */       if (this.c > 600) {
/*      */         
/*  892 */         k();
/*      */         
/*      */         return;
/*      */       } 
/*  896 */       if (baa.l(this.b).n()) {
/*      */         return;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  903 */       if (baa.a(this.b, baa.h(this.b), 16)) {
/*      */         
/*  905 */         boolean ☃ = a(baa.h(this.b));
/*  906 */         if (!☃) {
/*      */           
/*  908 */           k();
/*      */         }
/*  910 */         else if (this.e != null && baa.m(this.b).k().a(this.e)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  916 */           this.f++;
/*      */           
/*  918 */           if (this.f > 60) {
/*  919 */             l();
/*  920 */             this.f = 0;
/*      */           } 
/*      */         } else {
/*      */           
/*  924 */           this.e = baa.n(this.b).k();
/*      */         } 
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/*  930 */       if (baa.a(this.b, baa.h(this.b))) {
/*      */         
/*  932 */         l();
/*      */ 
/*      */         
/*      */         return;
/*      */       } 
/*      */ 
/*      */       
/*  939 */       baa.b(this.b, baa.h(this.b));
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private boolean a(fx ☃) {
/*  946 */       baa.o(this.b).a(10.0F);
/*  947 */       baa.p(this.b).a(☃.u(), ☃.v(), ☃.w(), 1.0D);
/*  948 */       return (baa.q(this.b).k() != null && baa.r(this.b).k().j());
/*      */     }
/*      */     
/*      */     private boolean b(fx ☃) {
/*  952 */       return this.d.contains(☃);
/*      */     }
/*      */     
/*      */     private void c(fx ☃) {
/*  956 */       this.d.add(☃);
/*  957 */       while (this.d.size() > 3) {
/*  958 */         this.d.remove(0);
/*      */       }
/*      */     }
/*      */     
/*      */     private void j() {
/*  963 */       this.d.clear();
/*      */     }
/*      */     
/*      */     private void k() {
/*  967 */       if (baa.h(this.b) != null) {
/*  968 */         c(baa.h(this.b));
/*      */       }
/*  970 */       l();
/*      */     }
/*      */     
/*      */     private void l() {
/*  974 */       baa.c(this.b, (fx)null);
/*  975 */       baa.a(this.b, 200);
/*      */     }
/*      */     
/*      */     private boolean d(fx ☃) {
/*  979 */       if (baa.a(this.b, ☃, 2)) {
/*  980 */         return true;
/*      */       }
/*  982 */       cxd cxd1 = baa.s(this.b).k();
/*  983 */       return (cxd1 != null && cxd1.m().equals(☃) && cxd1.j() && cxd1.c());
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public class f
/*      */     extends a
/*      */   {
/*  996 */     private int c = this.b.l.t.nextInt(10);
/*      */     f(baa ☃) {
/*  998 */       super(☃);
/*  999 */       a(EnumSet.of(avv.a.a));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean g() {
/* 1004 */       return (baa.t(this.b) != null && 
/* 1005 */         !this.b.ez() && 
/* 1006 */         j() && 
/* 1007 */         baa.d(this.b, baa.t(this.b)) && 
/* 1008 */         !baa.a(this.b, baa.t(this.b), 2));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean h() {
/* 1013 */       return g();
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1018 */       this.c = 0;
/* 1019 */       super.c();
/*      */     }
/*      */ 
/*      */     
/*      */     public void d() {
/* 1024 */       this.c = 0;
/* 1025 */       baa.u(this.b).o();
/* 1026 */       baa.v(this.b).g();
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/* 1031 */       if (baa.t(this.b) == null) {
/*      */         return;
/*      */       }
/* 1034 */       this.c++;
/*      */       
/* 1036 */       if (this.c > 600) {
/*      */         
/* 1038 */         baa.e(this.b, (fx)null);
/*      */         
/*      */         return;
/*      */       } 
/* 1042 */       if (baa.w(this.b).n()) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/* 1047 */       if (baa.a(this.b, baa.t(this.b))) {
/*      */         
/* 1049 */         baa.e(this.b, (fx)null);
/*      */ 
/*      */         
/*      */         return;
/*      */       } 
/*      */ 
/*      */       
/* 1056 */       baa.b(this.b, baa.t(this.b));
/*      */     }
/*      */     
/*      */     private boolean j() {
/* 1060 */       return (baa.x(this.b) > 2400);
/*      */     }
/*      */   }
/*      */   
/*      */   class j extends ava {
/*      */     j(baa this$0, aqn ☃) {
/* 1066 */       super(☃);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a() {
/* 1071 */       if (this.h.H_()) {
/*      */         return;
/*      */       }
/* 1074 */       super.a();
/*      */     }
/*      */ 
/*      */     
/*      */     protected boolean b() {
/* 1079 */       return !baa.k.a(baa.a(this.h));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   class k
/*      */     extends a
/*      */   {
/*      */     private final Predicate<ceh> c;
/*      */ 
/*      */ 
/*      */     
/*      */     private int d;
/*      */ 
/*      */ 
/*      */     
/*      */     private int e;
/*      */ 
/*      */     
/*      */     private boolean f;
/*      */ 
/*      */     
/*      */     private dcn g;
/*      */ 
/*      */     
/*      */     private int h;
/*      */ 
/*      */ 
/*      */     
/*      */     k(baa this$0) {
/* 1111 */       super(this$0); this.c = (☃ -> ☃.a(aed.N) ? (☃.a(bup.gU) ? ((☃.c(bwd.a) == cfd.a)) : true) : ☃.a(aed.K)); this.d = 0; this.e = 0; this.h = 0;
/* 1112 */       a(EnumSet.of(avv.a.a));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean g() {
/* 1117 */       if (baa.y(this.b) > 0) {
/* 1118 */         return false;
/*      */       }
/*      */       
/* 1121 */       if (this.b.eX()) {
/* 1122 */         return false;
/*      */       }
/* 1124 */       if (this.b.l.X()) {
/* 1125 */         return false;
/*      */       }
/* 1127 */       if (baa.z(this.b).nextFloat() < 0.7F) {
/* 1128 */         return false;
/*      */       }
/* 1130 */       Optional<fx> ☃ = o();
/* 1131 */       if (☃.isPresent()) {
/* 1132 */         baa.e(this.b, ☃.get());
/*      */         
/* 1134 */         baa.A(this.b).a(baa.t(this.b).u() + 0.5D, baa.t(this.b).v() + 0.5D, baa.t(this.b).w() + 0.5D, 1.2000000476837158D);
/* 1135 */         return true;
/*      */       } 
/* 1137 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean h() {
/* 1142 */       if (!this.f) {
/* 1143 */         return false;
/*      */       }
/* 1145 */       if (!this.b.eL()) {
/* 1146 */         return false;
/*      */       }
/* 1148 */       if (this.b.l.X()) {
/* 1149 */         return false;
/*      */       }
/* 1151 */       if (j()) {
/* 1152 */         return (baa.B(this.b).nextFloat() < 0.2F);
/*      */       }
/*      */       
/* 1155 */       if (this.b.K % 20 == 0 && !baa.d(this.b, baa.t(this.b))) {
/* 1156 */         baa.e(this.b, (fx)null);
/* 1157 */         return false;
/*      */       } 
/* 1159 */       return true;
/*      */     }
/*      */     
/*      */     private boolean j() {
/* 1163 */       return (this.d > 400);
/*      */     }
/*      */     
/*      */     private boolean k() {
/* 1167 */       return this.f;
/*      */     }
/*      */     
/*      */     private void l() {
/* 1171 */       this.f = false;
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1176 */       this.d = 0;
/* 1177 */       this.h = 0;
/* 1178 */       this.e = 0;
/* 1179 */       this.f = true;
/* 1180 */       this.b.eO();
/*      */     }
/*      */ 
/*      */     
/*      */     public void d() {
/* 1185 */       if (j()) {
/* 1186 */         baa.a(this.b, true);
/*      */       }
/* 1188 */       this.f = false;
/* 1189 */       baa.C(this.b).o();
/*      */       
/* 1191 */       baa.b(this.b, 200);
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/* 1196 */       this.h++;
/* 1197 */       if (this.h > 600) {
/*      */         
/* 1199 */         baa.e(this.b, (fx)null);
/*      */         
/*      */         return;
/*      */       } 
/* 1203 */       dcn ☃ = dcn.c(baa.t(this.b)).b(0.0D, 0.6000000238418579D, 0.0D);
/*      */       
/* 1205 */       if (☃.f(this.b.cA()) > 1.0D) {
/* 1206 */         this.g = ☃;
/* 1207 */         m();
/*      */         
/*      */         return;
/*      */       } 
/* 1211 */       if (this.g == null) {
/* 1212 */         this.g = ☃;
/*      */       }
/*      */       
/* 1215 */       boolean bool1 = (this.b.cA().f(this.g) <= 0.1D);
/* 1216 */       boolean bool2 = true;
/*      */       
/* 1218 */       if (!bool1 && this.h > 600) {
/*      */         
/* 1220 */         baa.e(this.b, (fx)null);
/*      */         
/*      */         return;
/*      */       } 
/* 1224 */       if (bool1) {
/* 1225 */         boolean bool = (baa.D(this.b).nextInt(25) == 0);
/* 1226 */         if (bool) {
/* 1227 */           this.g = new dcn(☃.a() + n(), ☃.b(), ☃.c() + n());
/*      */           
/* 1229 */           baa.E(this.b).o();
/*      */         } else {
/* 1231 */           bool2 = false;
/*      */         } 
/*      */         
/* 1234 */         this.b.t().a(☃.a(), ☃.b(), ☃.c());
/*      */       } 
/*      */       
/* 1237 */       if (bool2) {
/* 1238 */         m();
/*      */       }
/*      */       
/* 1241 */       this.d++;
/*      */       
/* 1243 */       if (baa.F(this.b).nextFloat() < 0.05F && this.d > this.e + 60) {
/* 1244 */         this.e = this.d;
/* 1245 */         this.b.a(adq.aD, 1.0F, 1.0F);
/*      */       } 
/*      */     }
/*      */     
/*      */     private void m() {
/* 1250 */       this.b.u().a(this.g.a(), this.g.b(), this.g.c(), 0.3499999940395355D);
/*      */     }
/*      */     
/*      */     private float n() {
/* 1254 */       return (baa.G(this.b).nextFloat() * 2.0F - 1.0F) * 0.33333334F;
/*      */     }
/*      */     
/*      */     private Optional<fx> o() {
/* 1258 */       return a(this.c, 5.0D);
/*      */     }
/*      */     
/*      */     private Optional<fx> a(Predicate<ceh> ☃, double d) {
/* 1262 */       fx fx = this.b.cB();
/*      */       
/* 1264 */       fx.a a1 = new fx.a(); int i;
/* 1265 */       for (i = 0; i <= d; i = (i > 0) ? -i : (1 - i)) {
/* 1266 */         for (int j = 0; j < d; j++) {
/* 1267 */           int m; for (m = 0; m <= j; m = (m > 0) ? -m : (1 - m)) {
/*      */             
/* 1269 */             int n = (m < j && m > -j) ? j : 0;
/* 1270 */             for (; n <= j; n = (n > 0) ? -n : (1 - n)) {
/* 1271 */               a1.a(fx, m, i - 1, n);
/* 1272 */               if (fx.a(a1, d) && ☃.test(this.b.l.d_(a1))) {
/* 1273 */                 return Optional.of(a1);
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1280 */       return Optional.empty();
/*      */     }
/*      */   }
/*      */   
/*      */   class i
/*      */     extends a
/*      */   {
/*      */     private i(baa this$0) {}
/*      */     
/*      */     public boolean g() {
/* 1290 */       return (baa.H(this.b) == 0 && 
/* 1291 */         !this.b.eU() && 
/* 1292 */         baa.i(this.b));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean h() {
/* 1297 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1302 */       baa.a(this.b, 200);
/*      */ 
/*      */ 
/*      */       
/* 1306 */       List<fx> ☃ = j();
/*      */       
/* 1308 */       if (☃.isEmpty()) {
/*      */         return;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1314 */       for (fx fx : ☃) {
/* 1315 */         if (!baa.e.a(baa.I(this.b), fx)) {
/*      */           
/* 1317 */           baa.c(this.b, fx);
/*      */ 
/*      */           
/*      */           return;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1325 */       baa.e.c(baa.I(this.b));
/* 1326 */       baa.c(this.b, ☃.get(0));
/*      */     }
/*      */     
/*      */     private List<fx> j() {
/* 1330 */       fx ☃ = this.b.cB();
/* 1331 */       azo azo = ((aag)this.b.l).y();
/* 1332 */       Stream<azp> stream = azo.c(☃ -> (☃ == azr.t || ☃ == azr.u), ☃, 20, azo.b.c);
/* 1333 */       return (List<fx>)stream.map(azp::f)
/* 1334 */         .filter(fx1 -> baa.f(☃, fx1))
/* 1335 */         .sorted(Comparator.comparingDouble(fx1 -> fx1.j(☃))).collect(Collectors.toList());
/*      */     }
/*      */   }
/*      */   
/*      */   class g
/*      */     extends a
/*      */   {
/*      */     private g(baa this$0) {}
/*      */     
/*      */     public boolean g() {
/* 1345 */       if (baa.J(this.b) >= 10) {
/* 1346 */         return false;
/*      */       }
/*      */       
/* 1349 */       if (baa.K(this.b).nextFloat() < 0.3F) {
/* 1350 */         return false;
/*      */       }
/*      */ 
/*      */       
/* 1354 */       return (this.b.eX() && baa.g(this.b));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean h() {
/* 1359 */       return g();
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/* 1364 */       if (baa.L(this.b).nextInt(30) != 0) {
/*      */         return;
/*      */       }
/*      */       
/* 1368 */       for (int ☃ = 1; ☃ <= 2; ☃++) {
/* 1369 */         fx fx = this.b.cB().c(☃);
/* 1370 */         ceh ceh = this.b.l.d_(fx);
/* 1371 */         buo buo = ceh.b();
/* 1372 */         boolean bool = false;
/* 1373 */         cfg cfg = null;
/* 1374 */         if (buo.a(aed.al)) {
/* 1375 */           if (buo instanceof bvs) {
/* 1376 */             bvs bvs = (bvs)buo;
/* 1377 */             if (!bvs.h(ceh)) {
/* 1378 */               bool = true;
/* 1379 */               cfg = bvs.c();
/*      */             } 
/* 1381 */           } else if (buo instanceof cam) {
/* 1382 */             int i = ((Integer)ceh.c(cam.a)).intValue();
/* 1383 */             if (i < 7) {
/* 1384 */               bool = true;
/* 1385 */               cfg = cam.a;
/*      */             } 
/* 1387 */           } else if (buo == bup.mg) {
/* 1388 */             int i = ((Integer)ceh.c(cau.a)).intValue();
/* 1389 */             if (i < 3) {
/* 1390 */               bool = true;
/* 1391 */               cfg = cau.a;
/*      */             } 
/*      */           } 
/*      */           
/* 1395 */           if (bool) {
/* 1396 */             this.b.l.c(2005, fx, 0);
/* 1397 */             this.b.l.a(fx, ceh.a(cfg, Integer.valueOf(((Integer)ceh.c(cfg)).intValue() + 1)));
/* 1398 */             baa.M(this.b);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   class b
/*      */     extends awf {
/*      */     b(baa this$0, aqu ☃, double d, boolean bool) {
/* 1408 */       super(☃, d, bool);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1413 */       return (super.a() && this.b.H_() && !this.b.eY());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1418 */       return (super.b() && this.b.H_() && !this.b.eY());
/*      */     }
/*      */   }
/*      */   
/*      */   class d
/*      */     extends a
/*      */   {
/*      */     private d(baa this$0) {}
/*      */     
/*      */     public boolean g() {
/* 1428 */       if (this.b.eU() && baa.i(this.b) && baa.h(this.b).a(this.b.cA(), 2.0D)) {
/* 1429 */         ccj ☃ = this.b.l.c(baa.h(this.b));
/* 1430 */         if (☃ instanceof ccg) {
/* 1431 */           ccg ccg = (ccg)☃;
/* 1432 */           if (ccg.h()) {
/* 1433 */             baa.c(this.b, (fx)null);
/*      */           } else {
/* 1435 */             return true;
/*      */           } 
/*      */         } 
/*      */       } 
/* 1439 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean h() {
/* 1444 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1449 */       ccj ☃ = this.b.l.c(baa.h(this.b));
/* 1450 */       if (☃ instanceof ccg) {
/* 1451 */         ccg ccg = (ccg)☃;
/* 1452 */         ccg.a(this.b, this.b.eX());
/*      */       } 
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\baa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
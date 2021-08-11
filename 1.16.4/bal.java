/*      */ import java.util.Arrays;
/*      */ import java.util.Comparator;
/*      */ import java.util.EnumSet;
/*      */ import java.util.List;
/*      */ import java.util.Random;
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
/*      */ public class bal
/*      */   extends azz
/*      */ {
/*   67 */   private static final us<Integer> bp = uv.a((Class)bal.class, uu.b);
/*   68 */   private static final us<Integer> bq = uv.a((Class)bal.class, uu.b);
/*   69 */   private static final us<Integer> br = uv.a((Class)bal.class, uu.b);
/*   70 */   private static final us<Byte> bs = uv.a((Class)bal.class, uu.a);
/*   71 */   private static final us<Byte> bt = uv.a((Class)bal.class, uu.a);
/*      */   
/*   73 */   private static final us<Byte> bu = uv.a((Class)bal.class, uu.a);
/*      */   
/*   75 */   private static final azg bv = (new azg()).a(8.0D).b().a();
/*      */   
/*      */   private boolean bw;
/*      */   
/*      */   private boolean bx;
/*      */   
/*      */   public int bo;
/*      */   
/*      */   private dcn by;
/*      */   
/*      */   private float bz;
/*      */   
/*      */   private float bA;
/*      */   
/*      */   private float bB;
/*      */   
/*      */   private float bC;
/*      */   
/*      */   private float bD;
/*      */   
/*      */   private float bE;
/*      */   
/*      */   private g bF;
/*      */   private static final Predicate<bcv> bG;
/*      */   
/*      */   public bal(aqe<? extends bal> ☃, brx brx1) {
/*  101 */     super((aqe)☃, brx1);
/*      */     
/*  103 */     this.bh = new h(this);
/*      */     
/*  105 */     if (!w_()) {
/*  106 */       p(true);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean e(bmb ☃) {
/*  112 */     aqf aqf = aqn.j(☃);
/*  113 */     if (!b(aqf).a()) {
/*  114 */       return false;
/*      */     }
/*  116 */     return (aqf == aqf.a && super.e(☃));
/*      */   }
/*      */   
/*      */   public int eK() {
/*  120 */     return ((Integer)this.R.<Integer>a(bp)).intValue();
/*      */   }
/*      */   
/*      */   public void t(int ☃) {
/*  124 */     this.R.b(bp, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   public boolean eL() {
/*  128 */     return w(2);
/*      */   }
/*      */   
/*      */   public boolean eM() {
/*  132 */     return w(8);
/*      */   }
/*      */   
/*      */   public void t(boolean ☃) {
/*  136 */     d(8, ☃);
/*      */   }
/*      */   
/*      */   public boolean eN() {
/*  140 */     return w(16);
/*      */   }
/*      */   
/*      */   public void u(boolean ☃) {
/*  144 */     d(16, ☃);
/*      */   }
/*      */   
/*      */   public boolean eO() {
/*  148 */     return (((Integer)this.R.<Integer>a(br)).intValue() > 0);
/*      */   }
/*      */   
/*      */   public void v(boolean ☃) {
/*  152 */     this.R.b(br, Integer.valueOf(☃ ? 1 : 0));
/*      */   }
/*      */   
/*      */   private int fk() {
/*  156 */     return ((Integer)this.R.<Integer>a(br)).intValue();
/*      */   }
/*      */   
/*      */   private void v(int ☃) {
/*  160 */     this.R.b(br, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   public void w(boolean ☃) {
/*  164 */     d(2, ☃);
/*      */     
/*  166 */     if (!☃) {
/*  167 */       u(0);
/*      */     }
/*      */   }
/*      */   
/*      */   public int eU() {
/*  172 */     return ((Integer)this.R.<Integer>a(bq)).intValue();
/*      */   }
/*      */   
/*      */   public void u(int ☃) {
/*  176 */     this.R.b(bq, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   public a eV() {
/*  180 */     return a.a(((Byte)this.R.<Byte>a(bs)).byteValue());
/*      */   }
/*      */   
/*      */   public void a(a ☃) {
/*  184 */     if (☃.a() > 6) {
/*  185 */       ☃ = a.a(this.J);
/*      */     }
/*      */     
/*  188 */     this.R.b(bs, Byte.valueOf((byte)☃.a()));
/*      */   }
/*      */   
/*      */   public a eW() {
/*  192 */     return a.a(((Byte)this.R.<Byte>a(bt)).byteValue());
/*      */   }
/*      */   
/*      */   public void b(a ☃) {
/*  196 */     if (☃.a() > 6) {
/*  197 */       ☃ = a.a(this.J);
/*      */     }
/*      */     
/*  200 */     this.R.b(bt, Byte.valueOf((byte)☃.a()));
/*      */   }
/*      */   
/*      */   public boolean eX() {
/*  204 */     return w(4);
/*      */   }
/*      */   
/*      */   public void x(boolean ☃) {
/*  208 */     d(4, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void e() {
/*  213 */     super.e();
/*  214 */     this.R.a(bp, Integer.valueOf(0));
/*  215 */     this.R.a(bq, Integer.valueOf(0));
/*  216 */     this.R.a(bs, Byte.valueOf((byte)0));
/*  217 */     this.R.a(bt, Byte.valueOf((byte)0));
/*  218 */     this.R.a(bu, Byte.valueOf((byte)0));
/*  219 */     this.R.a(br, Integer.valueOf(0));
/*      */   }
/*      */   
/*      */   private boolean w(int ☃) {
/*  223 */     return ((((Byte)this.R.<Byte>a(bu)).byteValue() & ☃) != 0);
/*      */   }
/*      */   
/*      */   private void d(int ☃, boolean bool) {
/*  227 */     byte b = ((Byte)this.R.<Byte>a(bu)).byteValue();
/*  228 */     if (bool) {
/*  229 */       this.R.b(bu, Byte.valueOf((byte)(b | ☃)));
/*      */     } else {
/*  231 */       this.R.b(bu, Byte.valueOf((byte)(b & (☃ ^ 0xFFFFFFFF))));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(md ☃) {
/*  237 */     super.b(☃);
/*      */     
/*  239 */     ☃.a("MainGene", eV().b());
/*  240 */     ☃.a("HiddenGene", eW().b());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(md ☃) {
/*  245 */     super.a(☃);
/*      */     
/*  247 */     a(a.a(☃.l("MainGene")));
/*  248 */     b(a.a(☃.l("HiddenGene")));
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public apy a(aag ☃, apy apy1) {
/*  254 */     bal bal1 = aqe.ae.a(☃);
/*  255 */     if (apy1 instanceof bal) {
/*  256 */       bal1.a(this, (bal)apy1);
/*      */     }
/*      */     
/*  259 */     bal1.fg();
/*      */     
/*  261 */     return bal1;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void o() {
/*  266 */     this.bk.a(0, new avp(this));
/*  267 */     this.bk.a(2, new i(this, 2.0D));
/*  268 */     this.bk.a(2, new d(this, this, 1.0D));
/*  269 */     this.bk.a(3, new b(this, 1.2000000476837158D, true));
/*  270 */     this.bk.a(4, new axf(this, 1.0D, bon.a(new brw[] { bup.kY.h() }, ), false));
/*  271 */     this.bk.a(6, new c<>(this, bfw.class, 8.0F, 2.0D, 2.0D));
/*  272 */     this.bk.a(6, new c<>(this, bdq.class, 4.0F, 2.0D, 2.0D));
/*  273 */     this.bk.a(7, new k(this));
/*  274 */     this.bk.a(8, new f(this));
/*  275 */     this.bk.a(8, new l(this));
/*  276 */     this.bF = new g(this, (Class)bfw.class, 6.0F);
/*  277 */     this.bk.a(9, this.bF);
/*  278 */     this.bk.a(10, new aws(this));
/*  279 */     this.bk.a(12, new j(this));
/*  280 */     this.bk.a(13, new avu(this, 1.25D));
/*  281 */     this.bk.a(14, new axk(this, 1.0D));
/*      */     
/*  283 */     this.bl.a(1, (new e(this, new Class[0])).a(new Class[0]));
/*      */   }
/*      */   
/*      */   public static ark.a eY() {
/*  287 */     return aqn.p()
/*  288 */       .a(arl.d, 0.15000000596046448D)
/*  289 */       .a(arl.f, 6.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   public enum a
/*      */   {
/*  295 */     a(0, "normal", false),
/*  296 */     b(1, "lazy", false),
/*  297 */     c(2, "worried", false),
/*  298 */     d(3, "playful", false),
/*  299 */     e(4, "brown", true),
/*  300 */     f(5, "weak", true),
/*  301 */     g(6, "aggressive", false);
/*      */     static {
/*  303 */       h = (a[])Arrays.<a>stream(values()).sorted(Comparator.comparingInt(a::a)).toArray(☃ -> new a[☃]);
/*      */     }
/*      */     private static final a[] h;
/*      */     private final int i;
/*      */     private final String j;
/*      */     private final boolean k;
/*      */     
/*      */     a(int ☃, String str1, boolean bool) {
/*  311 */       this.i = ☃;
/*  312 */       this.j = str1;
/*  313 */       this.k = bool;
/*      */     }
/*      */     
/*      */     public int a() {
/*  317 */       return this.i;
/*      */     }
/*      */     
/*      */     public String b() {
/*  321 */       return this.j;
/*      */     }
/*      */     
/*      */     public boolean c() {
/*  325 */       return this.k;
/*      */     }
/*      */     
/*      */     private static a b(a ☃, a a1) {
/*  329 */       if (☃.c()) {
/*  330 */         if (☃ == a1) {
/*  331 */           return ☃;
/*      */         }
/*  333 */         return a;
/*      */       } 
/*      */ 
/*      */       
/*  337 */       return ☃;
/*      */     }
/*      */     
/*      */     public static a a(int ☃) {
/*  341 */       if (☃ < 0 || ☃ >= h.length) {
/*  342 */         ☃ = 0;
/*      */       }
/*  344 */       return h[☃];
/*      */     }
/*      */     
/*      */     public static a a(String ☃) {
/*  348 */       for (a a1 : values()) {
/*  349 */         if (a1.j.equals(☃)) {
/*  350 */           return a1;
/*      */         }
/*      */       } 
/*      */       
/*  354 */       return a;
/*      */     }
/*      */     
/*      */     public static a a(Random ☃) {
/*  358 */       int i = ☃.nextInt(16);
/*  359 */       if (i == 0) {
/*  360 */         return b;
/*      */       }
/*  362 */       if (i == 1) {
/*  363 */         return c;
/*      */       }
/*  365 */       if (i == 2) {
/*  366 */         return d;
/*      */       }
/*  368 */       if (i == 4) {
/*  369 */         return g;
/*      */       }
/*  371 */       if (i < 9) {
/*  372 */         return f;
/*      */       }
/*  374 */       if (i < 11) {
/*  375 */         return e;
/*      */       }
/*      */       
/*  378 */       return a;
/*      */     }
/*      */   }
/*      */   
/*      */   public a eZ() {
/*  383 */     return a.a(eV(), eW());
/*      */   }
/*      */   
/*      */   public boolean fa() {
/*  387 */     return (eZ() == a.b);
/*      */   }
/*      */   
/*      */   public boolean fb() {
/*  391 */     return (eZ() == a.c);
/*      */   }
/*      */   
/*      */   public boolean fc() {
/*  395 */     return (eZ() == a.d);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean fe() {
/*  403 */     return (eZ() == a.f);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean eF() {
/*  408 */     return (eZ() == a.g);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(bfw ☃) {
/*  413 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean B(aqa ☃) {
/*  418 */     a(adq.jU, 1.0F, 1.0F);
/*  419 */     if (!eF()) {
/*  420 */       this.bx = true;
/*      */     }
/*  422 */     return super.B(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {
/*  427 */     super.j();
/*      */     
/*  429 */     if (fb()) {
/*  430 */       if (this.l.W() && !aE()) {
/*  431 */         t(true);
/*  432 */         v(false);
/*  433 */       } else if (!eO()) {
/*  434 */         t(false);
/*      */       } 
/*      */     }
/*      */     
/*  438 */     if (A() == null) {
/*  439 */       this.bw = false;
/*  440 */       this.bx = false;
/*      */     } 
/*      */     
/*  443 */     if (eK() > 0) {
/*  444 */       if (A() != null) {
/*  445 */         a(A(), 90.0F, 90.0F);
/*      */       }
/*      */       
/*  448 */       if (eK() == 29 || eK() == 14) {
/*  449 */         a(adq.jQ, 1.0F, 1.0F);
/*      */       }
/*      */       
/*  452 */       t(eK() - 1);
/*      */     } 
/*      */     
/*  455 */     if (eL()) {
/*  456 */       u(eU() + 1);
/*  457 */       if (eU() > 20) {
/*  458 */         w(false);
/*  459 */         fr();
/*  460 */       } else if (eU() == 1) {
/*  461 */         a(adq.jK, 1.0F, 1.0F);
/*      */       } 
/*      */     } 
/*      */     
/*  465 */     if (eX()) {
/*  466 */       fq();
/*      */     } else {
/*  468 */       this.bo = 0;
/*      */     } 
/*      */     
/*  471 */     if (eM()) {
/*  472 */       this.q = 0.0F;
/*      */     }
/*      */     
/*  475 */     fn();
/*  476 */     fl();
/*  477 */     fo();
/*  478 */     fp();
/*      */   }
/*      */   
/*      */   public boolean ff() {
/*  482 */     return (fb() && this.l.W());
/*      */   }
/*      */   
/*      */   private void fl() {
/*  486 */     if (!eO() && eM() && !ff() && !b(aqf.a).a() && this.J.nextInt(80) == 1) {
/*  487 */       v(true);
/*  488 */     } else if (b(aqf.a).a() || !eM()) {
/*  489 */       v(false);
/*      */     } 
/*      */     
/*  492 */     if (eO()) {
/*  493 */       fm();
/*      */       
/*  495 */       if (!this.l.v && fk() > 80 && this.J.nextInt(20) == 1) {
/*  496 */         if (fk() > 100 && l(b(aqf.a))) {
/*      */           
/*  498 */           if (!this.l.v) {
/*  499 */             a(aqf.a, bmb.b);
/*      */           }
/*      */           
/*  502 */           t(false);
/*      */         } 
/*  504 */         v(false);
/*      */         
/*      */         return;
/*      */       } 
/*  508 */       v(fk() + 1);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void fm() {
/*  513 */     if (fk() % 5 == 0) {
/*  514 */       a(adq.jO, 0.5F + 0.5F * this.J.nextInt(2), (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/*      */       
/*  516 */       for (int ☃ = 0; ☃ < 6; ☃++) {
/*  517 */         dcn dcn1 = new dcn((this.J.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, (this.J.nextFloat() - 0.5D) * 0.1D);
/*  518 */         dcn1 = dcn1.a(-this.q * 0.017453292F);
/*  519 */         dcn1 = dcn1.b(-this.p * 0.017453292F);
/*      */         
/*  521 */         double d = -this.J.nextFloat() * 0.6D - 0.3D;
/*  522 */         dcn dcn2 = new dcn((this.J.nextFloat() - 0.5D) * 0.8D, d, 1.0D + (this.J.nextFloat() - 0.5D) * 0.4D);
/*  523 */         dcn2 = dcn2.b(-this.aA * 0.017453292F);
/*      */         
/*  525 */         dcn2 = dcn2.b(cD(), cG() + 1.0D, cH());
/*  526 */         this.l.a(new he(hh.I, b(aqf.a)), dcn2.b, dcn2.c, dcn2.d, dcn1.b, dcn1.c + 0.05D, dcn1.d);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void fn() {
/*  532 */     this.bA = this.bz;
/*  533 */     if (eM()) {
/*  534 */       this.bz = Math.min(1.0F, this.bz + 0.15F);
/*      */     } else {
/*  536 */       this.bz = Math.max(0.0F, this.bz - 0.19F);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void fo() {
/*  541 */     this.bC = this.bB;
/*  542 */     if (eN()) {
/*  543 */       this.bB = Math.min(1.0F, this.bB + 0.15F);
/*      */     } else {
/*  545 */       this.bB = Math.max(0.0F, this.bB - 0.19F);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void fp() {
/*  550 */     this.bE = this.bD;
/*  551 */     if (eX()) {
/*  552 */       this.bD = Math.min(1.0F, this.bD + 0.15F);
/*      */     } else {
/*  554 */       this.bD = Math.max(0.0F, this.bD - 0.19F);
/*      */     } 
/*      */   }
/*      */   
/*      */   public float y(float ☃) {
/*  559 */     return afm.g(☃, this.bA, this.bz);
/*      */   }
/*      */   
/*      */   public float z(float ☃) {
/*  563 */     return afm.g(☃, this.bC, this.bB);
/*      */   }
/*      */   
/*      */   public float A(float ☃) {
/*  567 */     return afm.g(☃, this.bE, this.bD);
/*      */   }
/*      */   
/*      */   private void fq() {
/*  571 */     this.bo++;
/*  572 */     if (this.bo > 32) {
/*  573 */       x(false);
/*      */       
/*      */       return;
/*      */     } 
/*  577 */     if (!this.l.v) {
/*  578 */       dcn ☃ = cC();
/*  579 */       if (this.bo == 1) {
/*  580 */         float f1 = this.p * 0.017453292F;
/*  581 */         float f2 = w_() ? 0.1F : 0.2F;
/*  582 */         this
/*      */ 
/*      */           
/*  585 */           .by = new dcn(☃.b + (-afm.a(f1) * f2), 0.0D, ☃.d + (afm.b(f1) * f2));
/*      */         
/*  587 */         f(this.by.b(0.0D, 0.27D, 0.0D));
/*  588 */       } else if (this.bo == 7.0F || this.bo == 15.0F || this.bo == 23.0F) {
/*  589 */         n(0.0D, this.t ? 0.27D : ☃.c, 0.0D);
/*      */       } else {
/*  591 */         n(this.by.b, ☃.c, this.by.d);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void fr() {
/*  597 */     dcn ☃ = cC();
/*  598 */     this.l.a(hh.T, cD() - (cy() + 1.0F) * 0.5D * afm.a(this.aA * 0.017453292F), cG() - 0.10000000149011612D, cH() + (cy() + 1.0F) * 0.5D * afm.b(this.aA * 0.017453292F), ☃.b, 0.0D, ☃.d);
/*  599 */     a(adq.jL, 1.0F, 1.0F);
/*      */ 
/*      */     
/*  602 */     List<bal> list = this.l.a(bal.class, cc().g(10.0D));
/*  603 */     for (bal bal1 : list) {
/*  604 */       if (!bal1.w_() && bal1.t && !bal1.aE() && bal1.fh()) {
/*  605 */         bal1.dK();
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  610 */     if (!this.l.s_() && this.J.nextInt(700) == 0 && this.l.V().b(brt.e)) {
/*  611 */       a(bmd.md);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(bcv ☃) {
/*  617 */     if (b(aqf.a).a() && bG.test(☃)) {
/*  618 */       a(☃);
/*  619 */       bmb bmb = ☃.g();
/*  620 */       a(aqf.a, bmb);
/*  621 */       this.bm[aqf.a.b()] = 2.0F;
/*  622 */       a(☃, bmb.E());
/*  623 */       ☃.ad();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(apk ☃, float f) {
/*  629 */     t(false);
/*  630 */     return super.a(☃, f);
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*  636 */     a(a.a(this.J));
/*  637 */     b(a.a(this.J));
/*      */     
/*  639 */     fg();
/*      */     
/*  641 */     if (arc1 == null) {
/*  642 */       arc1 = new apy.a(0.2F);
/*      */     }
/*      */     
/*  645 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*      */   }
/*      */   
/*      */   public void a(bal ☃, @Nullable bal bal1) {
/*  649 */     if (bal1 == null) {
/*  650 */       if (this.J.nextBoolean()) {
/*  651 */         a(☃.fs());
/*  652 */         b(a.a(this.J));
/*      */       } else {
/*  654 */         a(a.a(this.J));
/*  655 */         b(☃.fs());
/*      */       }
/*      */     
/*  658 */     } else if (this.J.nextBoolean()) {
/*  659 */       a(☃.fs());
/*  660 */       b(bal1.fs());
/*      */     } else {
/*  662 */       a(bal1.fs());
/*  663 */       b(☃.fs());
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  668 */     if (this.J.nextInt(32) == 0) {
/*  669 */       a(a.a(this.J));
/*      */     }
/*      */     
/*  672 */     if (this.J.nextInt(32) == 0) {
/*  673 */       b(a.a(this.J));
/*      */     }
/*      */   }
/*      */   
/*      */   private a fs() {
/*  678 */     if (this.J.nextBoolean()) {
/*  679 */       return eV();
/*      */     }
/*      */     
/*  682 */     return eW();
/*      */   }
/*      */   
/*      */   public void fg() {
/*  686 */     if (fe()) {
/*  687 */       a(arl.a).a(10.0D);
/*      */     }
/*      */     
/*  690 */     if (fa()) {
/*  691 */       a(arl.d).a(0.07000000029802322D);
/*      */     }
/*      */   }
/*      */   
/*      */   private void ft() {
/*  696 */     if (!aE()) {
/*  697 */       t(0.0F);
/*  698 */       x().o();
/*  699 */       t(true);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public aou b(bfw ☃, aot aot1) {
/*  705 */     bmb bmb = ☃.b(aot1);
/*      */     
/*  707 */     if (ff()) {
/*  708 */       return aou.c;
/*      */     }
/*      */     
/*  711 */     if (eN()) {
/*  712 */       u(false);
/*  713 */       return aou.a(this.l.v);
/*      */     } 
/*      */     
/*  716 */     if (k(bmb)) {
/*  717 */       if (A() != null) {
/*  718 */         this.bw = true;
/*      */       }
/*      */       
/*  721 */       if (w_()) {
/*  722 */         a(☃, bmb);
/*  723 */         a((int)((-i() / 20) * 0.1F), true);
/*  724 */       } else if (!this.l.v && i() == 0 && eP()) {
/*  725 */         a(☃, bmb);
/*  726 */         g(☃);
/*  727 */       } else if (!this.l.v && !eM() && !aE()) {
/*  728 */         ft();
/*  729 */         v(true);
/*      */         
/*  731 */         bmb bmb1 = b(aqf.a);
/*  732 */         if (!bmb1.a() && !☃.bC.d) {
/*  733 */           a(bmb1);
/*      */         }
/*  735 */         a(aqf.a, new bmb(bmb.b(), 1));
/*      */         
/*  737 */         a(☃, bmb);
/*      */       } else {
/*  739 */         return aou.c;
/*      */       } 
/*      */       
/*  742 */       return aou.a;
/*      */     } 
/*      */     
/*  745 */     return aou.c;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp I() {
/*  751 */     if (eF())
/*  752 */       return adq.jR; 
/*  753 */     if (fb()) {
/*  754 */       return adq.jS;
/*      */     }
/*  756 */     return adq.jM;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void b(fx ☃, ceh ceh1) {
/*  762 */     a(adq.jP, 0.15F, 1.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean k(bmb ☃) {
/*  767 */     return (☃.b() == bup.kY.h());
/*      */   }
/*      */   
/*      */   private boolean l(bmb ☃) {
/*  771 */     return (k(☃) || ☃.b() == bup.cW.h());
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp dq() {
/*  777 */     return adq.jN;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp e(apk ☃) {
/*  783 */     return adq.jT;
/*      */   }
/*      */   
/*      */   public boolean fh() {
/*  787 */     return (!eN() && !ff() && !eO() && !eX() && !eM());
/*      */   }
/*      */   
/*      */   static class h extends avb {
/*      */     private final bal i;
/*      */     
/*      */     public h(bal ☃) {
/*  794 */       super(☃);
/*  795 */       this.i = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public void a() {
/*  800 */       if (!this.i.fh()) {
/*      */         return;
/*      */       }
/*      */       
/*  804 */       super.a();
/*      */     }
/*      */   }
/*      */   
/*      */   static class b extends awf {
/*      */     private final bal b;
/*      */     
/*      */     public b(bal ☃, double d, boolean bool) {
/*  812 */       super(☃, d, bool);
/*  813 */       this.b = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  818 */       return (this.b.fh() && super.a());
/*      */     }
/*      */   }
/*      */   
/*      */   static class g extends awd {
/*      */     private final bal g;
/*      */     
/*      */     public g(bal ☃, Class<? extends aqm> clazz, float f) {
/*  826 */       super(☃, clazz, f);
/*  827 */       this.g = ☃;
/*      */     }
/*      */     
/*      */     public void a(aqm ☃) {
/*  831 */       this.b = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/*  836 */       return (this.b != null && super.b());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  841 */       if (this.a.cY().nextFloat() >= this.d) {
/*  842 */         return false;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  847 */       if (this.b == null) {
/*  848 */         if (this.e == bfw.class) {
/*  849 */           this.b = this.a.l.a(this.f, this.a, this.a.cD(), this.a.cG(), this.a.cH());
/*      */         } else {
/*  851 */           this.b = this.a.l.b((Class)this.e, this.f, this.a, this.a.cD(), this.a.cG(), this.a.cH(), this.a.cc().c(this.c, 3.0D, this.c));
/*      */         } 
/*      */       }
/*      */       
/*  855 */       return (this.g.fh() && this.b != null);
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/*  860 */       if (this.b != null)
/*  861 */         super.e(); 
/*      */     }
/*      */   }
/*      */   
/*      */   static class j
/*      */     extends avv {
/*      */     private final bal a;
/*      */     
/*      */     public j(bal ☃) {
/*  870 */       this.a = ☃;
/*  871 */       a(EnumSet.of(avv.a.a, avv.a.b, avv.a.c));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  876 */       if ((!this.a.w_() && !this.a.fc()) || !bal.a(this.a)) {
/*  877 */         return false;
/*      */       }
/*      */       
/*  880 */       if (!this.a.fh()) {
/*  881 */         return false;
/*      */       }
/*      */       
/*  884 */       float ☃ = this.a.p * 0.017453292F;
/*  885 */       int i = 0;
/*  886 */       int k = 0;
/*  887 */       float f1 = -afm.a(☃);
/*  888 */       float f2 = afm.b(☃);
/*  889 */       if (Math.abs(f1) > 0.5D) {
/*  890 */         i = (int)(i + f1 / Math.abs(f1));
/*      */       }
/*      */       
/*  893 */       if (Math.abs(f2) > 0.5D) {
/*  894 */         k = (int)(k + f2 / Math.abs(f2));
/*      */       }
/*      */       
/*  897 */       if (this.a.l.d_(this.a.cB().b(i, -1, k)).g()) {
/*  898 */         return true;
/*      */       }
/*      */       
/*  901 */       if (this.a.fc() && bal.b(this.a).nextInt(60) == 1) {
/*  902 */         return true;
/*      */       }
/*      */       
/*  905 */       return (bal.c(this.a).nextInt(500) == 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/*  910 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/*  915 */       this.a.x(true);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean C_() {
/*  920 */       return false;
/*      */     }
/*      */   }
/*      */   
/*      */   static class l
/*      */     extends avv {
/*      */     private final bal a;
/*      */     
/*      */     public l(bal ☃) {
/*  929 */       this.a = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  934 */       if (!this.a.w_() || !this.a.fh()) {
/*  935 */         return false;
/*      */       }
/*      */       
/*  938 */       if (this.a.fe() && bal.d(this.a).nextInt(500) == 1) {
/*  939 */         return true;
/*      */       }
/*      */       
/*  942 */       return (bal.e(this.a).nextInt(6000) == 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/*  947 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/*  952 */       this.a.w(true);
/*      */     }
/*      */   }
/*      */   
/*      */   class d extends avi {
/*      */     private final bal e;
/*      */     private int f;
/*      */     
/*      */     public d(bal this$0, bal ☃, double d1) {
/*  961 */       super(☃, d1);
/*  962 */       this.e = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  967 */       if (super.a() && this.e.eK() == 0) {
/*  968 */         if (!h()) {
/*  969 */           if (this.f <= this.e.K) {
/*  970 */             this.e.t(32);
/*  971 */             this.f = this.e.K + 600;
/*  972 */             if (this.e.dS()) {
/*  973 */               bfw ☃ = this.b.a(bal.fi(), this.e);
/*  974 */               bal.f(this.e).a(☃);
/*      */             } 
/*      */           } 
/*      */           
/*  978 */           return false;
/*      */         } 
/*      */         
/*  981 */         return true;
/*      */       } 
/*      */       
/*  984 */       return false;
/*      */     }
/*      */     
/*      */     private boolean h() {
/*  988 */       fx ☃ = this.e.cB();
/*  989 */       fx.a a = new fx.a();
/*  990 */       for (int i = 0; i < 3; i++) {
/*  991 */         for (int j = 0; j < 8; j++) {
/*  992 */           int k; for (k = 0; k <= j; k = (k > 0) ? -k : (1 - k)) {
/*  993 */             int m = (k < j && k > -j) ? j : 0;
/*  994 */             for (; m <= j; m = (m > 0) ? -m : (1 - m)) {
/*  995 */               a.a(☃, k, i, m);
/*  996 */               if (this.b.d_(a).a(bup.kY)) {
/*  997 */                 return true;
/*      */               }
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/* 1003 */       return false;
/*      */     }
/*      */   }
/*      */   
/*      */   static class c<T extends aqm> extends avd<T> {
/*      */     private final bal i;
/*      */     
/*      */     public c(bal ☃, Class<T> clazz, float f, double d1, double d2) {
/* 1011 */       super(☃, clazz, f, d1, d2, aqd.g::test);
/*      */       
/* 1013 */       this.i = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1018 */       return (this.i.fb() && this.i.fh() && super.a());
/*      */     } }
/*      */   
/*      */   static {
/* 1022 */     bG = (☃ -> {
/*      */         blx blx = ☃.g().b();
/* 1024 */         return ((blx == bup.kY.h() || blx == bup.cW.h()) && ☃.aX() && !☃.p());
/*      */       });
/*      */   }
/*      */   
/*      */   class k extends avv { private int b;
/*      */     
/*      */     public k(bal this$0) {
/* 1031 */       a(EnumSet.of(avv.a.a));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1036 */       if (this.b > this.a.K || this.a.w_() || this.a.aE() || !this.a.fh() || this.a.eK() > 0) {
/* 1037 */         return false;
/*      */       }
/*      */       
/* 1040 */       List<bcv> ☃ = this.a.l.a(bcv.class, this.a.cc().c(6.0D, 6.0D, 6.0D), bal.fj());
/* 1041 */       return (!☃.isEmpty() || !this.a.b(aqf.a).a());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1046 */       if (this.a.aE() || (!this.a.fa() && bal.g(this.a).nextInt(600) == 1)) {
/* 1047 */         return false;
/*      */       }
/*      */       
/* 1050 */       if (bal.h(this.a).nextInt(2000) == 1) {
/* 1051 */         return false;
/*      */       }
/*      */       
/* 1054 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/* 1059 */       if (!this.a.eM() && !this.a.b(aqf.a).a()) {
/* 1060 */         bal.i(this.a);
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1066 */       List<bcv> ☃ = this.a.l.a(bcv.class, this.a.cc().c(8.0D, 8.0D, 8.0D), bal.fj());
/* 1067 */       if (!☃.isEmpty() && this.a.b(aqf.a).a()) {
/* 1068 */         this.a.x().a(☃.get(0), 1.2000000476837158D);
/* 1069 */       } else if (!this.a.b(aqf.a).a()) {
/* 1070 */         bal.i(this.a);
/*      */       } 
/*      */       
/* 1073 */       this.b = 0;
/*      */     }
/*      */ 
/*      */     
/*      */     public void d() {
/* 1078 */       bmb ☃ = this.a.b(aqf.a);
/* 1079 */       if (!☃.a()) {
/* 1080 */         this.a.a(☃);
/* 1081 */         this.a.a(aqf.a, bmb.b);
/* 1082 */         int i = this.a.fa() ? (bal.j(this.a).nextInt(50) + 10) : (bal.k(this.a).nextInt(150) + 10);
/* 1083 */         this.b = this.a.K + i * 20;
/*      */       } 
/*      */       
/* 1086 */       this.a.t(false);
/*      */     } }
/*      */ 
/*      */   
/*      */   static class f extends avv {
/*      */     private final bal a;
/*      */     private int b;
/*      */     
/*      */     public f(bal ☃) {
/* 1095 */       this.a = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1100 */       return (this.b < this.a.K && this.a.fa() && this.a.fh() && bal.l(this.a).nextInt(400) == 1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1105 */       if (this.a.aE() || (!this.a.fa() && bal.m(this.a).nextInt(600) == 1)) {
/* 1106 */         return false;
/*      */       }
/*      */       
/* 1109 */       if (bal.n(this.a).nextInt(2000) == 1) {
/* 1110 */         return false;
/*      */       }
/*      */       
/* 1113 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1118 */       this.a.u(true);
/* 1119 */       this.b = 0;
/*      */     }
/*      */ 
/*      */     
/*      */     public void d() {
/* 1124 */       this.a.u(false);
/* 1125 */       this.b = this.a.K + 200;
/*      */     }
/*      */   }
/*      */   
/*      */   static class e extends axp {
/*      */     private final bal a;
/*      */     
/*      */     public e(bal ☃, Class<?>... arrayOfClass) {
/* 1133 */       super(☃, arrayOfClass);
/* 1134 */       this.a = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1139 */       if (bal.o(this.a) || bal.p(this.a)) {
/* 1140 */         this.a.h((aqm)null);
/* 1141 */         return false;
/*      */       } 
/* 1143 */       return super.b();
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(aqn ☃, aqm aqm1) {
/* 1148 */       if (☃ instanceof bal && ((bal)☃).eF())
/* 1149 */         ☃.h(aqm1); 
/*      */     }
/*      */   }
/*      */   
/*      */   static class i
/*      */     extends awp {
/*      */     private final bal g;
/*      */     
/*      */     public i(bal ☃, double d) {
/* 1158 */       super(☃, d);
/* 1159 */       this.g = ☃;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1165 */       if (!this.g.bq()) {
/* 1166 */         return false;
/*      */       }
/*      */       
/* 1169 */       fx ☃ = a(this.a.l, this.a, 5, 4);
/* 1170 */       if (☃ != null) {
/* 1171 */         this.c = ☃.u();
/* 1172 */         this.d = ☃.v();
/* 1173 */         this.e = ☃.w();
/*      */         
/* 1175 */         return true;
/*      */       } 
/*      */       
/* 1178 */       return g();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1183 */       if (this.g.eM()) {
/* 1184 */         this.g.x().o();
/* 1185 */         return false;
/*      */       } 
/* 1187 */       return super.b();
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
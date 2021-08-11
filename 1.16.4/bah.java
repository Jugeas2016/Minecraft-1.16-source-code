/*      */ import com.google.common.collect.Lists;
/*      */ import java.util.Arrays;
/*      */ import java.util.Comparator;
/*      */ import java.util.EnumSet;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Optional;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
/*      */ import java.util.function.Predicate;
/*      */ import java.util.stream.Collectors;
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
/*      */ public class bah
/*      */   extends azz
/*      */ {
/*   92 */   private static final us<Integer> bo = uv.a((Class)bah.class, uu.b);
/*   93 */   private static final us<Byte> bp = uv.a((Class)bah.class, uu.a);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  103 */   private static final us<Optional<UUID>> bq = uv.a((Class)bah.class, uu.o);
/*  104 */   private static final us<Optional<UUID>> br = uv.a((Class)bah.class, uu.o);
/*      */   static {
/*  106 */     bs = (☃ -> (!☃.p() && ☃.aX()));
/*      */     
/*  108 */     bt = (☃ -> {
/*      */         if (☃ instanceof aqm) {
/*      */           aqm aqm = (aqm)☃;
/*  111 */           return (aqm.db() != null && aqm.dc() < aqm.K + 600);
/*      */         } 
/*      */         
/*      */         return false;
/*      */       });
/*  116 */     bu = (☃ -> (☃ instanceof bac || ☃ instanceof baq));
/*      */     
/*  118 */     bv = (☃ -> (!☃.bx() && aqd.e.test(☃)));
/*      */   }
/*      */   
/*      */   private static final Predicate<bcv> bs;
/*      */   private static final Predicate<aqa> bt;
/*      */   private static final Predicate<aqa> bu;
/*      */   private static final Predicate<aqa> bv;
/*      */   private avv bw;
/*      */   private avv bx;
/*      */   private avv by;
/*      */   private float bz;
/*      */   private float bA;
/*      */   private float bB;
/*      */   private float bC;
/*      */   private int bD;
/*      */   
/*      */   public enum v { private static final v[] c;
/*  135 */     a(0, "red", new vj[] { btb.f, btb.t, btb.ae, btb.G, btb.an, btb.H, btb.ao }),
/*  136 */     b(1, "snow", new vj[] { btb.E, btb.F, btb.am }); private static final Map<String, v> d;
/*      */     static {
/*  138 */       c = (v[])Arrays.<v>stream(values()).sorted(Comparator.comparingInt(v::b)).toArray(☃ -> new v[☃]);
/*  139 */       d = (Map<String, v>)Arrays.<v>stream(values()).collect(Collectors.toMap(v::a, ☃ -> ☃));
/*      */     }
/*      */     private final int e;
/*      */     private final String f;
/*      */     private final List<vj<bsv>> g;
/*      */     
/*      */     v(int ☃, String str1, vj<bsv>... arrayOfVj) {
/*  146 */       this.e = ☃;
/*  147 */       this.f = str1;
/*  148 */       this.g = Arrays.asList(arrayOfVj);
/*      */     }
/*      */     
/*      */     public String a() {
/*  152 */       return this.f;
/*      */     }
/*      */     
/*      */     public int b() {
/*  156 */       return this.e;
/*      */     }
/*      */     
/*      */     public static v a(String ☃) {
/*  160 */       return d.getOrDefault(☃, a);
/*      */     }
/*      */     
/*      */     public static v a(int ☃) {
/*  164 */       if (☃ < 0 || ☃ > c.length) {
/*  165 */         ☃ = 0;
/*      */       }
/*  167 */       return c[☃];
/*      */     }
/*      */     
/*      */     public static v a(Optional<vj<bsv>> ☃) {
/*  171 */       return (☃.isPresent() && b.g.contains(☃.get())) ? b : a;
/*      */     } }
/*      */ 
/*      */   
/*      */   public bah(aqe<? extends bah> ☃, brx brx1) {
/*  176 */     super((aqe)☃, brx1);
/*      */     
/*  178 */     this.g = new k(this);
/*  179 */     this.bh = new m(this);
/*      */     
/*  181 */     a(cwz.p, 0.0F);
/*  182 */     a(cwz.q, 0.0F);
/*      */     
/*  184 */     p(true);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void e() {
/*  189 */     super.e();
/*  190 */     this.R.a(bq, Optional.empty());
/*  191 */     this.R.a(br, Optional.empty());
/*  192 */     this.R.a(bo, Integer.valueOf(0));
/*  193 */     this.R.a(bp, Byte.valueOf((byte)0));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void o() {
/*  198 */     this.bw = new axq<>(this, azz.class, 10, false, false, ☃ -> (☃ instanceof bac || ☃ instanceof baq));
/*  199 */     this.bx = new axq<>(this, bax.class, 10, false, false, bax.bo);
/*  200 */     this.by = new axq<>(this, azw.class, 20, false, false, ☃ -> ☃ instanceof azy);
/*      */     
/*  202 */     this.bk.a(0, new g(this));
/*  203 */     this.bk.a(1, new b(this));
/*  204 */     this.bk.a(2, new n(this, 2.2D));
/*  205 */     this.bk.a(3, new e(this, 1.0D));
/*  206 */     this.bk.a(4, new avd<>(this, bfw.class, 16.0F, 1.6D, 1.4D, ☃ -> (bv.test(☃) && !c(☃.bS()) && !fb())));
/*  207 */     this.bk.a(4, new avd<>(this, baz.class, 8.0F, 1.6D, 1.4D, ☃ -> (!((baz)☃).eK() && !fb())));
/*  208 */     this.bk.a(4, new avd<>(this, bao.class, 8.0F, 1.6D, 1.4D, ☃ -> !fb()));
/*  209 */     this.bk.a(5, new u(this));
/*  210 */     this.bk.a(6, new o(this));
/*  211 */     this.bk.a(6, new s(this, 1.25D));
/*  212 */     this.bk.a(7, new l(this, 1.2000000476837158D, true));
/*  213 */     this.bk.a(7, new t(this));
/*  214 */     this.bk.a(8, new h(this, this, 1.25D));
/*  215 */     this.bk.a(9, new q(this, 32, 200));
/*  216 */     this.bk.a(10, new f(this, 1.2000000476837158D, 12, 2));
/*  217 */     this.bk.a(10, new awb(this, 0.4F));
/*  218 */     this.bk.a(11, new axk(this, 1.0D));
/*  219 */     this.bk.a(11, new p(this));
/*  220 */     this.bk.a(12, new j(this, this, (Class)bfw.class, 24.0F));
/*  221 */     this.bk.a(13, new r(this));
/*      */     
/*  223 */     this.bl.a(3, new a(this, aqm.class, false, false, ☃ -> (bt.test(☃) && !c(☃.bS()))));
/*      */   }
/*      */ 
/*      */   
/*      */   public adp d(bmb ☃) {
/*  228 */     return adq.et;
/*      */   }
/*      */ 
/*      */   
/*      */   public void k() {
/*  233 */     if (!this.l.v && aX() && dS()) {
/*      */       
/*  235 */       this.bD++;
/*  236 */       bmb ☃ = b(aqf.a);
/*  237 */       if (l(☃)) {
/*  238 */         if (this.bD > 600) {
/*  239 */           bmb bmb = ☃.a(this.l, this);
/*  240 */           if (!bmb.a()) {
/*  241 */             a(aqf.a, bmb);
/*      */           }
/*  243 */           this.bD = 0;
/*  244 */         } else if (this.bD > 560 && 
/*  245 */           this.J.nextFloat() < 0.1F) {
/*  246 */           a(d(☃), 1.0F, 1.0F);
/*  247 */           this.l.a(this, (byte)45);
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  253 */       aqm aqm = A();
/*  254 */       if (aqm == null || !aqm.aX()) {
/*  255 */         v(false);
/*  256 */         w(false);
/*      */       } 
/*      */     } 
/*      */     
/*  260 */     if (em() || dI()) {
/*  261 */       this.aQ = false;
/*  262 */       this.aR = 0.0F;
/*  263 */       this.aT = 0.0F;
/*      */     } 
/*      */     
/*  266 */     super.k();
/*      */     
/*  268 */     if (fb() && this.J.nextFloat() < 0.05F) {
/*  269 */       a(adq.ep, 1.0F, 1.0F);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected boolean dI() {
/*  275 */     return dl();
/*      */   }
/*      */   
/*      */   private boolean l(bmb ☃) {
/*  279 */     return (☃.b().s() && A() == null && this.t && !em());
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(aos ☃) {
/*  284 */     if (this.J.nextFloat() < 0.2F) {
/*  285 */       bmb bmb; float f = this.J.nextFloat();
/*      */       
/*  287 */       if (f < 0.05F) {
/*  288 */         bmb = new bmb(bmd.oV);
/*  289 */       } else if (f < 0.2F) {
/*  290 */         bmb = new bmb(bmd.mg);
/*  291 */       } else if (f < 0.4F) {
/*  292 */         bmb = this.J.nextBoolean() ? new bmb(bmd.pA) : new bmb(bmd.pB);
/*  293 */       } else if (f < 0.6F) {
/*  294 */         bmb = new bmb(bmd.kW);
/*  295 */       } else if (f < 0.8F) {
/*  296 */         bmb = new bmb(bmd.lS);
/*      */       } else {
/*  298 */         bmb = new bmb(bmd.kT);
/*      */       } 
/*  300 */       a(aqf.a, bmb);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(byte ☃) {
/*  306 */     if (☃ == 45) {
/*  307 */       bmb bmb = b(aqf.a);
/*  308 */       if (!bmb.a()) {
/*  309 */         for (int i = 0; i < 8; i++) {
/*      */ 
/*      */           
/*  312 */           dcn dcn = (new dcn((this.J.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D)).a(-this.q * 0.017453292F).b(-this.p * 0.017453292F);
/*      */           
/*  314 */           this.l.a(new he(hh.I, bmb), cD() + (bh()).b / 2.0D, cE(), cH() + (bh()).d / 2.0D, dcn.b, dcn.c + 0.05D, dcn.d);
/*      */         } 
/*      */       }
/*      */     } else {
/*  318 */       super.a(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public static ark.a eK() {
/*  323 */     return aqn.p()
/*  324 */       .a(arl.d, 0.30000001192092896D)
/*  325 */       .a(arl.a, 10.0D)
/*  326 */       .a(arl.b, 32.0D)
/*  327 */       .a(arl.f, 2.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   public bah b(aag ☃, apy apy1) {
/*  332 */     bah bah1 = aqe.C.a(☃);
/*  333 */     bah1.a(this.J.nextBoolean() ? eL() : ((bah)apy1).eL());
/*  334 */     return bah1;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*  340 */     Optional<vj<bsv>> optional = ☃.i(cB());
/*  341 */     v v = v.a(optional);
/*  342 */     boolean bool = false;
/*  343 */     if (arc1 instanceof i) {
/*      */       
/*  345 */       v = ((i)arc1).a;
/*  346 */       if (((i)arc1).a() >= 2) {
/*  347 */         bool = true;
/*      */       }
/*      */     } else {
/*  350 */       arc1 = new i(v);
/*      */     } 
/*      */     
/*  353 */     a(v);
/*  354 */     if (bool) {
/*  355 */       c_(-24000);
/*      */     }
/*      */     
/*  358 */     if (☃ instanceof aag) {
/*  359 */       eZ();
/*      */     }
/*      */     
/*  362 */     a(aos1);
/*      */     
/*  364 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*      */   }
/*      */ 
/*      */   
/*      */   private void eZ() {
/*  369 */     if (eL() == v.a) {
/*  370 */       this.bl.a(4, this.bw);
/*  371 */       this.bl.a(4, this.bx);
/*  372 */       this.bl.a(6, this.by);
/*      */     } else {
/*  374 */       this.bl.a(4, this.by);
/*  375 */       this.bl.a(6, this.bw);
/*  376 */       this.bl.a(6, this.bx);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(bfw ☃, bmb bmb1) {
/*  382 */     if (k(bmb1)) {
/*  383 */       a(d(bmb1), 1.0F, 1.0F);
/*      */     }
/*  385 */     super.a(☃, bmb1);
/*      */   }
/*      */ 
/*      */   
/*      */   protected float b(aqx ☃, aqb aqb1) {
/*  390 */     if (w_()) {
/*  391 */       return aqb1.b * 0.85F;
/*      */     }
/*  393 */     return 0.4F;
/*      */   }
/*      */   
/*      */   public v eL() {
/*  397 */     return v.a(((Integer)this.R.<Integer>a(bo)).intValue());
/*      */   }
/*      */   
/*      */   private void a(v ☃) {
/*  401 */     this.R.b(bo, Integer.valueOf(☃.b()));
/*      */   }
/*      */   
/*      */   private List<UUID> fa() {
/*  405 */     List<UUID> ☃ = Lists.newArrayList();
/*  406 */     ☃.add(((Optional<UUID>)this.R.<Optional<UUID>>a(bq)).orElse(null));
/*  407 */     ☃.add(((Optional<UUID>)this.R.<Optional<UUID>>a(br)).orElse(null));
/*  408 */     return ☃;
/*      */   }
/*      */   
/*      */   private void b(@Nullable UUID ☃) {
/*  412 */     if (((Optional)this.R.<Optional>a((us)bq)).isPresent()) {
/*  413 */       this.R.b(br, Optional.ofNullable(☃));
/*      */     } else {
/*  415 */       this.R.b(bq, Optional.ofNullable(☃));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(md ☃) {
/*  421 */     super.b(☃);
/*  422 */     List<UUID> list = fa();
/*  423 */     mj mj = new mj();
/*  424 */     for (UUID uUID : list) {
/*  425 */       if (uUID != null) {
/*  426 */         mj.add(mp.a(uUID));
/*      */       }
/*      */     } 
/*  429 */     ☃.a("Trusted", mj);
/*  430 */     ☃.a("Sleeping", em());
/*  431 */     ☃.a("Type", eL().a());
/*  432 */     ☃.a("Sitting", eM());
/*  433 */     ☃.a("Crouching", bz());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(md ☃) {
/*  438 */     super.a(☃);
/*  439 */     mj mj = ☃.d("Trusted", 11);
/*  440 */     for (int i = 0; i < mj.size(); i++) {
/*  441 */       b(mp.a(mj.k(i)));
/*      */     }
/*  443 */     z(☃.q("Sleeping"));
/*  444 */     a(v.a(☃.l("Type")));
/*  445 */     t(☃.q("Sitting"));
/*  446 */     v(☃.q("Crouching"));
/*      */ 
/*      */     
/*  449 */     if (this.l instanceof aag) {
/*  450 */       eZ();
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean eM() {
/*  455 */     return t(1);
/*      */   }
/*      */   
/*      */   public void t(boolean ☃) {
/*  459 */     d(1, ☃);
/*      */   }
/*      */   
/*      */   public boolean eN() {
/*  463 */     return t(64);
/*      */   }
/*      */   
/*      */   private void x(boolean ☃) {
/*  467 */     d(64, ☃);
/*      */   }
/*      */   
/*      */   private boolean fb() {
/*  471 */     return t(128);
/*      */   }
/*      */   
/*      */   private void y(boolean ☃) {
/*  475 */     d(128, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean em() {
/*  480 */     return t(32);
/*      */   }
/*      */   
/*      */   private void z(boolean ☃) {
/*  484 */     d(32, ☃);
/*      */   }
/*      */   
/*      */   private void d(int ☃, boolean bool) {
/*  488 */     if (bool) {
/*  489 */       this.R.b(bp, Byte.valueOf((byte)(((Byte)this.R.<Byte>a(bp)).byteValue() | ☃)));
/*      */     } else {
/*  491 */       this.R.b(bp, Byte.valueOf((byte)(((Byte)this.R.<Byte>a(bp)).byteValue() & (☃ ^ 0xFFFFFFFF))));
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean t(int ☃) {
/*  496 */     return ((((Byte)this.R.<Byte>a(bp)).byteValue() & ☃) != 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean e(bmb ☃) {
/*  501 */     aqf aqf = aqn.j(☃);
/*  502 */     if (!b(aqf).a()) {
/*  503 */       return false;
/*      */     }
/*  505 */     return (aqf == aqf.a && super.e(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean h(bmb ☃) {
/*  510 */     blx blx = ☃.b();
/*  511 */     bmb bmb1 = b(aqf.a);
/*      */     
/*  513 */     return (bmb1.a() || (this.bD > 0 && blx.s() && !bmb1.b().s()));
/*      */   }
/*      */   
/*      */   private void m(bmb ☃) {
/*  517 */     if (☃.a() || this.l.v) {
/*      */       return;
/*      */     }
/*      */     
/*  521 */     bcv bcv = new bcv(this.l, cD() + (bh()).b, cE() + 1.0D, cH() + (bh()).d, ☃);
/*  522 */     bcv.a(40);
/*  523 */     bcv.c(bS());
/*      */     
/*  525 */     a(adq.ey, 1.0F, 1.0F);
/*  526 */     this.l.c(bcv);
/*      */   }
/*      */   
/*      */   private void n(bmb ☃) {
/*  530 */     bcv bcv = new bcv(this.l, cD(), cE(), cH(), ☃);
/*  531 */     this.l.c(bcv);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(bcv ☃) {
/*  536 */     bmb bmb = ☃.g();
/*  537 */     if (h(bmb)) {
/*  538 */       int i = bmb.E();
/*  539 */       if (i > 1) {
/*  540 */         n(bmb.a(i - 1));
/*      */       }
/*      */       
/*  543 */       m(b(aqf.a));
/*      */       
/*  545 */       a(☃);
/*      */       
/*  547 */       a(aqf.a, bmb.a(1));
/*  548 */       this.bm[aqf.a.b()] = 2.0F;
/*  549 */       a(☃, bmb.E());
/*  550 */       ☃.ad();
/*  551 */       this.bD = 0;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {
/*  557 */     super.j();
/*      */     
/*  559 */     if (dS()) {
/*  560 */       boolean ☃ = aE();
/*  561 */       if (☃ || A() != null || this.l.W()) {
/*  562 */         fc();
/*      */       }
/*      */       
/*  565 */       if (☃ || em()) {
/*  566 */         t(false);
/*      */       }
/*      */       
/*  569 */       if (eN() && this.l.t.nextFloat() < 0.2F) {
/*  570 */         fx fx = cB();
/*  571 */         ceh ceh = this.l.d_(fx);
/*  572 */         this.l.c(2001, fx, buo.i(ceh));
/*      */       } 
/*      */     } 
/*      */     
/*  576 */     this.bA = this.bz;
/*  577 */     if (eW()) {
/*  578 */       this.bz += (1.0F - this.bz) * 0.4F;
/*      */     } else {
/*  580 */       this.bz += (0.0F - this.bz) * 0.4F;
/*      */     } 
/*      */     
/*  583 */     this.bC = this.bB;
/*  584 */     if (bz()) {
/*  585 */       this.bB += 0.2F;
/*  586 */       if (this.bB > 3.0F) {
/*  587 */         this.bB = 3.0F;
/*      */       }
/*      */     } else {
/*  590 */       this.bB = 0.0F;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean k(bmb ☃) {
/*  596 */     return (☃.b() == bmd.rm);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(bfw ☃, aqn aqn1) {
/*  601 */     ((bah)aqn1).b(☃.bS());
/*      */   }
/*      */   
/*      */   public boolean eO() {
/*  605 */     return t(16);
/*      */   }
/*      */   
/*      */   public void u(boolean ☃) {
/*  609 */     d(16, ☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean eV() {
/*  617 */     return (this.bB == 3.0F);
/*      */   }
/*      */   
/*      */   public void v(boolean ☃) {
/*  621 */     d(4, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bz() {
/*  626 */     return t(4);
/*      */   }
/*      */   
/*      */   public void w(boolean ☃) {
/*  630 */     d(8, ☃);
/*      */   }
/*      */   
/*      */   public boolean eW() {
/*  634 */     return t(8);
/*      */   }
/*      */   
/*      */   public float y(float ☃) {
/*  638 */     return afm.g(☃, this.bA, this.bz) * 0.11F * 3.1415927F;
/*      */   }
/*      */   
/*      */   public float z(float ☃) {
/*  642 */     return afm.g(☃, this.bC, this.bB);
/*      */   }
/*      */ 
/*      */   
/*      */   public void h(@Nullable aqm ☃) {
/*  647 */     if (fb() && ☃ == null) {
/*  648 */       y(false);
/*      */     }
/*  650 */     super.h(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   protected int e(float ☃, float f1) {
/*  655 */     return afm.f((☃ - 5.0F) * f1);
/*      */   }
/*      */   
/*      */   private void fc() {
/*  659 */     z(false);
/*      */   }
/*      */   
/*      */   private void fd() {
/*  663 */     w(false);
/*  664 */     v(false);
/*  665 */     t(false);
/*  666 */     z(false);
/*  667 */     y(false);
/*  668 */     x(false);
/*      */   }
/*      */   
/*      */   private boolean fe() {
/*  672 */     return (!em() && !eM() && !eN());
/*      */   }
/*      */ 
/*      */   
/*      */   public void F() {
/*  677 */     adp ☃ = I();
/*      */     
/*  679 */     if (☃ == adq.ev) {
/*  680 */       a(☃, 2.0F, dH());
/*      */     } else {
/*  682 */       super.F();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp I() {
/*  689 */     if (em()) {
/*  690 */       return adq.ew;
/*      */     }
/*  692 */     if (!this.l.M() && this.J.nextFloat() < 0.1F) {
/*  693 */       List<bfw> ☃ = (List)this.l.a((Class)bfw.class, cc().c(16.0D, 16.0D, 16.0D), aqd.g);
/*  694 */       if (☃.isEmpty()) {
/*  695 */         return adq.ev;
/*      */       }
/*      */     } 
/*  698 */     return adq.eq;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp e(apk ☃) {
/*  704 */     return adq.eu;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp dq() {
/*  710 */     return adq.es;
/*      */   }
/*      */   
/*      */   private boolean c(UUID ☃) {
/*  714 */     return fa().contains(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void d(apk ☃) {
/*  719 */     bmb bmb = b(aqf.a);
/*      */     
/*  721 */     if (!bmb.a()) {
/*  722 */       a(bmb);
/*  723 */       a(aqf.a, bmb.b);
/*      */     } 
/*      */     
/*  726 */     super.d(☃);
/*      */   }
/*      */   
/*      */   public static boolean a(bah ☃, aqm aqm1) {
/*  730 */     double d1 = aqm1.cH() - ☃.cH();
/*  731 */     double d2 = aqm1.cD() - ☃.cD();
/*  732 */     double d3 = d1 / d2;
/*      */     
/*  734 */     int i = 6;
/*  735 */     for (int j = 0; j < 6; j++) {
/*  736 */       double d4 = (d3 == 0.0D) ? 0.0D : (d1 * (j / 6.0F));
/*  737 */       double d5 = (d3 == 0.0D) ? (d2 * (j / 6.0F)) : (d4 / d3);
/*  738 */       for (int k = 1; k < 4; k++) {
/*  739 */         if (!☃.l.d_(new fx(☃.cD() + d5, ☃.cE() + k, ☃.cH() + d4)).c().e()) {
/*  740 */           return false;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  745 */     return true;
/*      */   }
/*      */   
/*      */   class p extends avv {
/*      */     public p(bah this$0) {
/*  750 */       a(EnumSet.of(avv.a.a));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  755 */       if (!this.a.b(aqf.a).a()) {
/*  756 */         return false;
/*      */       }
/*      */       
/*  759 */       if (this.a.A() != null || this.a.cZ() != null) {
/*  760 */         return false;
/*      */       }
/*      */       
/*  763 */       if (!bah.a(this.a)) {
/*  764 */         return false;
/*      */       }
/*      */       
/*  767 */       if (this.a.cY().nextInt(10) != 0) {
/*  768 */         return false;
/*      */       }
/*  770 */       List<bcv> ☃ = this.a.l.a(bcv.class, this.a.cc().c(8.0D, 8.0D, 8.0D), bah.eX());
/*  771 */       return (!☃.isEmpty() && this.a.b(aqf.a).a());
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/*  776 */       List<bcv> ☃ = this.a.l.a(bcv.class, this.a.cc().c(8.0D, 8.0D, 8.0D), bah.eX());
/*  777 */       bmb bmb = this.a.b(aqf.a);
/*      */       
/*  779 */       if (bmb.a() && !☃.isEmpty()) {
/*  780 */         this.a.x().a(☃.get(0), 1.2000000476837158D);
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/*  786 */       List<bcv> ☃ = this.a.l.a(bcv.class, this.a.cc().c(8.0D, 8.0D, 8.0D), bah.eX());
/*  787 */       if (!☃.isEmpty())
/*  788 */         this.a.x().a(☃.get(0), 1.2000000476837158D); 
/*      */     }
/*      */   }
/*      */   
/*      */   class m
/*      */     extends avb {
/*      */     public m(bah this$0) {
/*  795 */       super(this$0);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a() {
/*  800 */       if (bah.a(this.i))
/*  801 */         super.a(); 
/*      */     }
/*      */   }
/*      */   
/*      */   class u
/*      */     extends avv {
/*      */     public u(bah this$0) {
/*  808 */       a(EnumSet.of(avv.a.a, avv.a.b));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  813 */       if (this.a.em()) {
/*  814 */         return false;
/*      */       }
/*      */       
/*  817 */       aqm ☃ = this.a.A();
/*  818 */       return (☃ != null && ☃.aX() && bah.eY().test(☃) && this.a.h(☃) > 36.0D && !this.a.bz() && !this.a.eW() && !bah.b(this.a));
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/*  823 */       this.a.t(false);
/*  824 */       bah.a(this.a, false);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void d() {
/*  830 */       aqm ☃ = this.a.A();
/*  831 */       if (☃ != null && bah.a(this.a, ☃)) {
/*  832 */         this.a.w(true);
/*  833 */         this.a.v(true);
/*  834 */         this.a.x().o();
/*  835 */         this.a.t().a(☃, this.a.Q(), this.a.O());
/*      */       } else {
/*  837 */         this.a.w(false);
/*  838 */         this.a.v(false);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/*  844 */       aqm ☃ = this.a.A();
/*  845 */       this.a.t().a(☃, this.a.Q(), this.a.O());
/*  846 */       if (this.a.h(☃) <= 36.0D) {
/*  847 */         this.a.w(true);
/*  848 */         this.a.v(true);
/*  849 */         this.a.x().o();
/*      */       } else {
/*  851 */         this.a.x().a(☃, 1.5D);
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   class l extends awf {
/*      */     public l(bah this$0, double ☃, boolean bool) {
/*  858 */       super(this$0, ☃, bool);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void a(aqm ☃, double d) {
/*  863 */       double d1 = a(☃);
/*  864 */       if (d <= d1 && h()) {
/*  865 */         g();
/*  866 */         this.a.B(☃);
/*  867 */         this.b.a(adq.er, 1.0F, 1.0F);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/*  873 */       this.b.w(false);
/*  874 */       super.c();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  879 */       return (!this.b.eM() && !this.b.em() && !this.b.bz() && !this.b.eN() && super.a());
/*      */     }
/*      */   }
/*      */   
/*      */   class e extends avi {
/*      */     public e(bah this$0, double ☃) {
/*  885 */       super(this$0, ☃);
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/*  890 */       bah.c((bah)this.a);
/*  891 */       bah.c((bah)this.c);
/*  892 */       super.c();
/*      */     }
/*      */ 
/*      */     
/*      */     protected void g() {
/*  897 */       aag ☃ = (aag)this.b;
/*  898 */       bah bah1 = (bah)this.a.a(☃, this.c);
/*  899 */       if (bah1 == null) {
/*      */         return;
/*      */       }
/*      */       
/*  903 */       aah aah1 = this.a.eR();
/*  904 */       aah aah2 = this.c.eR();
/*  905 */       aah aah3 = aah1;
/*      */       
/*  907 */       if (aah1 != null) {
/*  908 */         bah.a(bah1, aah1.bS());
/*      */       } else {
/*  910 */         aah3 = aah2;
/*      */       } 
/*      */       
/*  913 */       if (aah2 != null && aah1 != aah2) {
/*  914 */         bah.a(bah1, aah2.bS());
/*      */       }
/*      */       
/*  917 */       if (aah3 != null) {
/*  918 */         aah3.a(aea.O);
/*  919 */         ac.o.a(aah3, this.a, this.c, bah1);
/*      */       } 
/*      */       
/*  922 */       this.a.c_(6000);
/*  923 */       this.c.c_(6000);
/*  924 */       this.a.eT();
/*  925 */       this.c.eT();
/*  926 */       bah1.c_(-24000);
/*  927 */       bah1.b(this.a.cD(), this.a.cE(), this.a.cH(), 0.0F, 0.0F);
/*  928 */       ☃.l(bah1);
/*      */       
/*  930 */       this.b.a(this.a, (byte)18);
/*      */       
/*  932 */       if (this.b.V().b(brt.e))
/*  933 */         this.b.c(new aqg(this.b, this.a.cD(), this.a.cE(), this.a.cH(), this.a.cY().nextInt(7) + 1)); 
/*      */     }
/*      */   }
/*      */   
/*      */   class a
/*      */     extends axq<aqm> {
/*      */     @Nullable
/*      */     private aqm j;
/*      */     private aqm k;
/*      */     private int l;
/*      */     
/*      */     public a(bah this$0, Class<aqm> ☃, boolean bool1, boolean bool2, @Nullable Predicate<aqm> predicate) {
/*  945 */       super(this$0, ☃, 10, bool1, bool2, predicate);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/*  950 */       if (this.b > 0 && this.e.cY().nextInt(this.b) != 0) {
/*  951 */         return false;
/*      */       }
/*      */       
/*  954 */       for (UUID ☃ : bah.d(this.i)) {
/*  955 */         if (☃ == null || !(this.i.l instanceof aag)) {
/*      */           continue;
/*      */         }
/*      */         
/*  959 */         aqa aqa = ((aag)this.i.l).a(☃);
/*  960 */         if (!(aqa instanceof aqm)) {
/*      */           continue;
/*      */         }
/*  963 */         aqm aqm1 = (aqm)aqa;
/*  964 */         this.k = aqm1;
/*  965 */         this.j = aqm1.cZ();
/*  966 */         int i = aqm1.da();
/*  967 */         return (i != this.l && a(this.j, this.d));
/*      */       } 
/*  969 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/*  974 */       a(this.j);
/*  975 */       this.c = this.j;
/*      */       
/*  977 */       if (this.k != null) {
/*  978 */         this.l = this.k.da();
/*      */       }
/*      */       
/*  981 */       this.i.a(adq.ep, 1.0F, 1.0F);
/*      */       
/*  983 */       bah.b(this.i, true);
/*      */ 
/*      */       
/*  986 */       bah.e(this.i);
/*      */       
/*  988 */       super.c();
/*      */     }
/*      */   }
/*      */   
/*      */   class s extends avo {
/*      */     private int c;
/*      */     
/*      */     public s(bah this$0, double ☃) {
/*  996 */       super(this$0, ☃);
/*  997 */       this.c = 100;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1002 */       if (this.b.em() || this.a.A() != null) {
/* 1003 */         return false;
/*      */       }
/* 1005 */       if (this.b.l.W()) {
/* 1006 */         return true;
/*      */       }
/* 1008 */       if (this.c > 0) {
/* 1009 */         this.c--;
/* 1010 */         return false;
/*      */       } 
/* 1012 */       this.c = 100;
/*      */       
/* 1014 */       fx ☃ = this.a.cB();
/*      */       
/* 1016 */       return (this.b.l.M() && this.b.l
/* 1017 */         .e(☃) && 
/* 1018 */         !((aag)this.b.l).a_(☃) && 
/* 1019 */         g());
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1024 */       bah.c(this.b);
/* 1025 */       super.c();
/*      */     } }
/*      */   
/*      */   public class c implements Predicate<aqm> {
/*      */     public c(bah ☃) {}
/*      */     
/*      */     public boolean a(aqm ☃) {
/* 1032 */       if (☃ instanceof bah) {
/* 1033 */         return false;
/*      */       }
/*      */ 
/*      */       
/* 1037 */       if (☃ instanceof bac || ☃ instanceof baq || ☃ instanceof bdq) {
/* 1038 */         return true;
/*      */       }
/*      */ 
/*      */       
/* 1042 */       if (☃ instanceof are) {
/* 1043 */         return !((are)☃).eK();
/*      */       }
/*      */ 
/*      */       
/* 1047 */       if (☃ instanceof bfw && (☃.a_() || ((bfw)☃).b_())) {
/* 1048 */         return false;
/*      */       }
/*      */ 
/*      */       
/* 1052 */       if (bah.b(this.a, ☃.bS())) {
/* 1053 */         return false;
/*      */       }
/*      */ 
/*      */       
/* 1057 */       return (!☃.em() && !☃.bx());
/*      */     }
/*      */   }
/*      */   
/*      */   abstract class d extends avv {
/* 1062 */     private final azg b = (new azg()).a(12.0D).c().a(new bah.c(this.a));
/*      */     
/*      */     protected boolean g() {
/* 1065 */       fx ☃ = new fx(this.a.cD(), (this.a.cc()).e, this.a.cH());
/* 1066 */       return (!this.a.l.e(☃) && this.a.f(☃) >= 0.0F);
/*      */     }
/*      */     
/*      */     protected boolean h() {
/* 1070 */       return !this.a.l.<aqm>a(aqm.class, this.b, this.a, this.a.cc().c(12.0D, 6.0D, 12.0D)).isEmpty();
/*      */     }
/*      */     
/*      */     private d(bah this$0) {} }
/*      */   
/*      */   class t extends d { private int c;
/*      */     
/*      */     public t(bah this$0) {
/* 1078 */       super(this$0);
/* 1079 */       this.c = bah.f(this$0).nextInt(140);
/* 1080 */       a(EnumSet.of(avv.a.a, avv.a.b, avv.a.c));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1085 */       if (this.b.aR != 0.0F || this.b.aS != 0.0F || this.b.aT != 0.0F) {
/* 1086 */         return false;
/*      */       }
/* 1088 */       return (j() || this.b.em());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1093 */       return j();
/*      */     }
/*      */     
/*      */     private boolean j() {
/* 1097 */       if (this.c > 0) {
/* 1098 */         this.c--;
/* 1099 */         return false;
/*      */       } 
/* 1101 */       return (this.b.l.M() && g() && !h());
/*      */     }
/*      */ 
/*      */     
/*      */     public void d() {
/* 1106 */       this.c = bah.g(this.b).nextInt(140);
/* 1107 */       bah.c(this.b);
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1112 */       this.b.t(false);
/* 1113 */       this.b.v(false);
/* 1114 */       this.b.w(false);
/* 1115 */       this.b.o(false);
/* 1116 */       bah.c(this.b, true);
/* 1117 */       this.b.x().o();
/* 1118 */       this.b.u().a(this.b.cD(), this.b.cE(), this.b.cH(), 0.0D);
/*      */     } }
/*      */   
/*      */   class r extends d {
/*      */     private double c;
/*      */     private double d;
/*      */     private int e;
/*      */     private int f;
/*      */     
/*      */     public r(bah this$0) {
/* 1128 */       super(this$0);
/* 1129 */       a(EnumSet.of(avv.a.a, avv.a.b));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1134 */       return (this.b.cZ() == null && this.b.cY().nextFloat() < 0.02F && !this.b.em() && this.b.A() == null && this.b.x().m() && !h() && !this.b.eO() && !this.b.bz());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1139 */       return (this.f > 0);
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1144 */       j();
/* 1145 */       this.f = 2 + this.b.cY().nextInt(3);
/* 1146 */       this.b.t(true);
/* 1147 */       this.b.x().o();
/*      */     }
/*      */ 
/*      */     
/*      */     public void d() {
/* 1152 */       this.b.t(false);
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/* 1157 */       this.e--;
/* 1158 */       if (this.e <= 0) {
/* 1159 */         this.f--;
/* 1160 */         j();
/*      */       } 
/* 1162 */       this.b.t().a(this.b.cD() + this.c, this.b.cG(), this.b.cH() + this.d, this.b.Q(), this.b.O());
/*      */     }
/*      */     
/*      */     private void j() {
/* 1166 */       double ☃ = 6.283185307179586D * this.b.cY().nextDouble();
/* 1167 */       this.c = Math.cos(☃);
/* 1168 */       this.d = Math.sin(☃);
/* 1169 */       this.e = 80 + this.b.cY().nextInt(20);
/*      */     }
/*      */   }
/*      */   
/*      */   public class f
/*      */     extends awj
/*      */   {
/*      */     protected int g;
/*      */     
/*      */     public f(bah ☃, double d, int i, int j) {
/* 1179 */       super(☃, d, i, j);
/*      */     }
/*      */ 
/*      */     
/*      */     public double h() {
/* 1184 */       return 2.0D;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean k() {
/* 1189 */       return (this.d % 100 == 0);
/*      */     }
/*      */ 
/*      */     
/*      */     protected boolean a(brz ☃, fx fx1) {
/* 1194 */       ceh ceh = ☃.d_(fx1);
/* 1195 */       return (ceh.a(bup.mg) && ((Integer)ceh.c(cau.a)).intValue() >= 2);
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/* 1200 */       if (l()) {
/* 1201 */         if (this.g >= 40) {
/* 1202 */           n();
/*      */         } else {
/* 1204 */           this.g++;
/*      */         } 
/* 1206 */       } else if (!l() && bah.h(this.h).nextFloat() < 0.05F) {
/* 1207 */         this.h.a(adq.ex, 1.0F, 1.0F);
/*      */       } 
/*      */       
/* 1210 */       super.e();
/*      */     }
/*      */     
/*      */     protected void n() {
/* 1214 */       if (!this.h.l.V().b(brt.b)) {
/*      */         return;
/*      */       }
/*      */       
/* 1218 */       ceh ☃ = this.h.l.d_(this.e);
/*      */       
/* 1220 */       if (!☃.a(bup.mg)) {
/*      */         return;
/*      */       }
/*      */       
/* 1224 */       int i = ((Integer)☃.c(cau.a)).intValue();
/* 1225 */       ☃.a(cau.a, Integer.valueOf(1));
/* 1226 */       int j = 1 + this.h.l.t.nextInt(2) + ((i == 3) ? 1 : 0);
/* 1227 */       bmb bmb = this.h.b(aqf.a);
/* 1228 */       if (bmb.a()) {
/* 1229 */         this.h.a(aqf.a, new bmb(bmd.rm));
/* 1230 */         j--;
/*      */       } 
/* 1232 */       if (j > 0) {
/* 1233 */         buo.a(this.h.l, this.e, new bmb(bmd.rm, j));
/*      */       }
/* 1235 */       this.h.a(adq.oZ, 1.0F, 1.0F);
/* 1236 */       this.h.l.a(this.e, ☃.a(cau.a, Integer.valueOf(1)), 2);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1241 */       return (!this.h.em() && super.a());
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1246 */       this.g = 0;
/* 1247 */       this.h.t(false);
/* 1248 */       super.c();
/*      */     }
/*      */   }
/*      */   
/*      */   public static class i extends apy.a {
/*      */     public final bah.v a;
/*      */     
/*      */     public i(bah.v ☃) {
/* 1256 */       super(false);
/* 1257 */       this.a = ☃;
/*      */     }
/*      */   }
/*      */   
/*      */   class b extends avv {
/*      */     int a;
/*      */     
/*      */     public b(bah this$0) {
/* 1265 */       a(EnumSet.of(avv.a.b, avv.a.c, avv.a.a));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1270 */       return this.b.eN();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1275 */       return (a() && this.a > 0);
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1280 */       this.a = 40;
/*      */     }
/*      */ 
/*      */     
/*      */     public void d() {
/* 1285 */       bah.a(this.b, false);
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/* 1290 */       this.a--;
/*      */     }
/*      */   }
/*      */   
/*      */   class n extends awp {
/*      */     public n(bah this$0, double ☃) {
/* 1296 */       super(this$0, ☃);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1301 */       return (!bah.i(this.g) && super.a());
/*      */     }
/*      */   }
/*      */   
/*      */   class q extends axc {
/*      */     public q(bah this$0, int ☃, int i) {
/* 1307 */       super(this$0, i);
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1312 */       bah.c(this.a);
/* 1313 */       super.c();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1318 */       return (super.a() && g());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1323 */       return (super.b() && g());
/*      */     }
/*      */     
/*      */     private boolean g() {
/* 1327 */       return (!this.a.em() && !this.a.eM() && !bah.i(this.a) && this.a.A() == null);
/*      */     }
/*      */   }
/*      */   
/*      */   class g extends avp {
/*      */     public g(bah this$0) {
/* 1333 */       super(this$0);
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1338 */       super.c();
/* 1339 */       bah.c(this.a);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1344 */       return ((this.a.aE() && this.a.b(aef.b) > 0.25D) || this.a.aQ());
/*      */     } }
/*      */   
/*      */   public class o extends avz {
/*      */     public o(bah ☃) {}
/*      */     
/*      */     public boolean a() {
/* 1351 */       if (!this.a.eV()) {
/* 1352 */         return false;
/*      */       }
/*      */       
/* 1355 */       aqm ☃ = this.a.A();
/*      */       
/* 1357 */       if (☃ == null || !☃.aX()) {
/* 1358 */         return false;
/*      */       }
/*      */       
/* 1361 */       if (☃.ca() != ☃.bZ()) {
/* 1362 */         return false;
/*      */       }
/*      */       
/* 1365 */       boolean bool = bah.a(this.a, ☃);
/* 1366 */       if (!bool) {
/* 1367 */         this.a.x().a(☃, 0);
/* 1368 */         this.a.v(false);
/* 1369 */         this.a.w(false);
/*      */       } 
/*      */       
/* 1372 */       return bool;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1377 */       aqm ☃ = this.a.A();
/*      */       
/* 1379 */       if (☃ == null || !☃.aX()) {
/* 1380 */         return false;
/*      */       }
/*      */       
/* 1383 */       double d = (this.a.cC()).c;
/* 1384 */       return ((d * d >= 0.05000000074505806D || Math.abs(this.a.q) >= 15.0F || !bah.j(this.a)) && !this.a.eN());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean C_() {
/* 1389 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1394 */       this.a.o(true);
/* 1395 */       this.a.u(true);
/* 1396 */       this.a.w(false);
/*      */       
/* 1398 */       aqm ☃ = this.a.A();
/* 1399 */       this.a.t().a(☃, 60.0F, 30.0F);
/*      */       
/* 1401 */       dcn dcn = (new dcn(☃.cD() - this.a.cD(), ☃.cE() - this.a.cE(), ☃.cH() - this.a.cH())).d();
/* 1402 */       this.a.f(this.a.cC().b(dcn.b * 0.8D, 0.9D, dcn.d * 0.8D));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1408 */       this.a.x().o();
/*      */     }
/*      */ 
/*      */     
/*      */     public void d() {
/* 1413 */       this.a.v(false);
/* 1414 */       bah.a(this.a, 0.0F);
/* 1415 */       bah.b(this.a, 0.0F);
/* 1416 */       this.a.w(false);
/* 1417 */       this.a.u(false);
/*      */     }
/*      */ 
/*      */     
/*      */     public void e() {
/* 1422 */       aqm ☃ = this.a.A();
/*      */       
/* 1424 */       if (☃ != null) {
/* 1425 */         this.a.t().a(☃, 60.0F, 30.0F);
/*      */       }
/*      */       
/* 1428 */       if (!this.a.eN()) {
/* 1429 */         dcn dcn = this.a.cC();
/* 1430 */         if (dcn.c * dcn.c < 0.029999999329447746D && this.a.q != 0.0F) {
/* 1431 */           this.a.q = afm.j(this.a.q, 0.0F, 0.2F);
/*      */         } else {
/* 1433 */           double d1 = Math.sqrt(aqa.c(dcn));
/* 1434 */           double d2 = Math.signum(-dcn.c) * Math.acos(d1 / dcn.f()) * 57.2957763671875D;
/* 1435 */           this.a.q = (float)d2;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1440 */       if (☃ != null && this.a.g(☃) <= 2.0F) {
/* 1441 */         this.a.B(☃);
/*      */       }
/* 1443 */       else if (this.a.q > 0.0F && bah.k(this.a) && (float)(this.a.cC()).c != 0.0F && 
/* 1444 */         this.a.l.d_(this.a.cB()).a(bup.cC)) {
/* 1445 */         this.a.q = 60.0F;
/* 1446 */         this.a.h((aqm)null);
/* 1447 */         bah.a(this.a, true);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public dcn cf() {
/* 1456 */     return new dcn(0.0D, (0.55F * ce()), (cy() * 0.4F));
/*      */   }
/*      */   
/*      */   public class k extends ava {
/*      */     public k(bah ☃) {
/* 1461 */       super(☃);
/*      */     }
/*      */ 
/*      */     
/*      */     public void a() {
/* 1466 */       if (!this.h.em()) {
/* 1467 */         super.a();
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     protected boolean b() {
/* 1473 */       if (!this.h.eO() && !this.h.bz()) if (((!this.h.eW() ? 1 : 0) & (!this.h.eN() ? 1 : 0)) != 0);  return false;
/*      */     }
/*      */   }
/*      */   
/*      */   class h extends avu {
/*      */     private final bah b;
/*      */     
/*      */     public h(bah this$0, bah ☃, double d) {
/* 1481 */       super(☃, d);
/* 1482 */       this.b = ☃;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1487 */       return (!bah.i(this.b) && super.a());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1492 */       return (!bah.i(this.b) && super.b());
/*      */     }
/*      */ 
/*      */     
/*      */     public void c() {
/* 1497 */       bah.c(this.b);
/* 1498 */       super.c();
/*      */     }
/*      */   }
/*      */   
/*      */   class j extends awd {
/*      */     public j(bah this$0, aqn ☃, Class<? extends aqm> clazz, float f) {
/* 1504 */       super(☃, clazz, f);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean a() {
/* 1509 */       return (super.a() && !this.g.eN() && !this.g.eW());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean b() {
/* 1514 */       return (super.b() && !this.g.eN() && !this.g.eW());
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
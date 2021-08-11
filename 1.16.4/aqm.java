/*      */ import com.google.common.base.Objects;
/*      */ import com.google.common.collect.ImmutableList;
/*      */ import com.google.common.collect.ImmutableMap;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.mojang.datafixers.util.Pair;
/*      */ import com.mojang.serialization.DataResult;
/*      */ import com.mojang.serialization.Dynamic;
/*      */ import java.util.Collection;
/*      */ import java.util.ConcurrentModificationException;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Optional;
/*      */ import java.util.Random;
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
/*      */ public abstract class aqm
/*      */   extends aqa
/*      */ {
/*  115 */   private static final UUID b = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
/*  116 */   private static final UUID c = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
/*  117 */   private static final arj d = new arj(b, "Sprinting speed boost", 0.30000001192092896D, arj.a.c);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  134 */   protected static final us<Byte> ag = uv.a((Class)aqm.class, uu.a);
/*  135 */   private static final us<Float> e = uv.a((Class)aqm.class, uu.c);
/*  136 */   private static final us<Integer> f = uv.a((Class)aqm.class, uu.b);
/*  137 */   private static final us<Boolean> g = uv.a((Class)aqm.class, uu.i);
/*  138 */   private static final us<Integer> bh = uv.a((Class)aqm.class, uu.b);
/*  139 */   private static final us<Integer> bi = uv.a((Class)aqm.class, uu.b);
/*  140 */   private static final us<Optional<fx>> bj = uv.a((Class)aqm.class, uu.m);
/*      */   
/*  142 */   protected static final aqb ah = aqb.c(0.2F, 0.2F);
/*      */   
/*      */   private final ari bk;
/*      */   
/*  146 */   private final apj bl = new apj(this);
/*  147 */   private final Map<aps, apu> bm = Maps.newHashMap();
/*  148 */   private final gj<bmb> bn = gj.a(2, bmb.b);
/*  149 */   private final gj<bmb> bo = gj.a(4, bmb.b);
/*      */   public boolean ai;
/*      */   public aot aj;
/*      */   public int ak;
/*      */   public int al;
/*      */   public int am;
/*      */   public int an;
/*      */   public int ao;
/*      */   public float ap;
/*      */   public int aq;
/*      */   public float ar;
/*      */   public float as;
/*      */   protected int at;
/*      */   public float au;
/*      */   public float av;
/*      */   public float aw;
/*  165 */   public final int ax = 20;
/*      */   public final float ay;
/*      */   public final float az;
/*      */   public float aA;
/*      */   public float aB;
/*      */   public float aC;
/*      */   public float aD;
/*  172 */   public float aE = 0.02F;
/*      */   @Nullable
/*      */   protected bfw aF;
/*      */   protected int aG;
/*      */   protected boolean aH;
/*      */   protected int aI;
/*      */   protected float aJ;
/*      */   protected float aK;
/*      */   protected float aL;
/*      */   protected float aM;
/*      */   protected float aN;
/*      */   protected int aO;
/*      */   protected float aP;
/*      */   protected boolean aQ;
/*      */   public float aR;
/*      */   public float aS;
/*      */   public float aT;
/*      */   protected int aU;
/*      */   protected double aV;
/*      */   protected double aW;
/*      */   protected double aX;
/*      */   protected double aY;
/*      */   protected double aZ;
/*      */   protected double ba;
/*      */   protected int bb;
/*      */   private boolean bp = true;
/*      */   @Nullable
/*      */   private aqm bq;
/*      */   private int br;
/*      */   private aqm bs;
/*      */   private int bt;
/*      */   private float bu;
/*      */   private int bv;
/*      */   private float bw;
/*  206 */   protected bmb bc = bmb.b;
/*      */   protected int bd;
/*      */   protected int be;
/*      */   private fx bx;
/*  210 */   private Optional<fx> by = Optional.empty();
/*      */   private apk bz;
/*      */   private long bA;
/*      */   protected int bf;
/*      */   private float bB;
/*      */   private float bC;
/*      */   protected arf<?> bg;
/*      */   
/*      */   protected aqm(aqe<? extends aqm> ☃, brx brx1) {
/*  219 */     super(☃, brx1);
/*      */     
/*  221 */     this.bk = new ari(arm.a(☃));
/*  222 */     c(dx());
/*      */     
/*  224 */     this.i = true;
/*  225 */     this.az = (float)((Math.random() + 1.0D) * 0.009999999776482582D);
/*  226 */     af();
/*  227 */     this.ay = (float)Math.random() * 12398.0F;
/*  228 */     this.p = (float)(Math.random() * 6.2831854820251465D);
/*  229 */     this.aC = this.p;
/*  230 */     this.G = 0.6F;
/*      */     
/*  232 */     mo mo = mo.a;
/*  233 */     this.bg = a(new Dynamic(mo, mo.createMap((Map)ImmutableMap.of(mo.a("memories"), mo.emptyMap()))));
/*      */   }
/*      */   
/*      */   public arf<?> cJ() {
/*  237 */     return this.bg;
/*      */   }
/*      */   
/*      */   protected arf.b<?> cK() {
/*  241 */     return arf.a((Collection<? extends ayd<?>>)ImmutableList.of(), (Collection<? extends azc<? extends azb<?>>>)ImmutableList.of());
/*      */   }
/*      */   
/*      */   protected arf<?> a(Dynamic<?> ☃) {
/*  245 */     return cK().a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void aa() {
/*  250 */     a(apk.m, Float.MAX_VALUE);
/*      */   }
/*      */   
/*      */   public boolean a(aqe<?> ☃) {
/*  254 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void e() {
/*  259 */     this.R.a(ag, Byte.valueOf((byte)0));
/*  260 */     this.R.a(f, Integer.valueOf(0));
/*  261 */     this.R.a(g, Boolean.valueOf(false));
/*  262 */     this.R.a(bh, Integer.valueOf(0));
/*  263 */     this.R.a(bi, Integer.valueOf(0));
/*  264 */     this.R.a(e, Float.valueOf(1.0F));
/*  265 */     this.R.a(bj, Optional.empty());
/*      */   }
/*      */   
/*      */   public static ark.a cL() {
/*  269 */     return ark.a()
/*  270 */       .a(arl.a)
/*  271 */       .a(arl.c)
/*  272 */       .a(arl.d)
/*  273 */       .a(arl.i)
/*  274 */       .a(arl.j);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(double ☃, boolean bool, ceh ceh1, fx fx1) {
/*  279 */     if (!aE())
/*      */     {
/*  281 */       aL();
/*      */     }
/*      */     
/*  284 */     if (!this.l.v && bool && this.C > 0.0F) {
/*      */ 
/*      */       
/*  287 */       cQ();
/*  288 */       cR();
/*      */     } 
/*      */     
/*  291 */     if (!this.l.v && this.C > 3.0F && bool) {
/*  292 */       float f = afm.f(this.C - 3.0F);
/*  293 */       if (!ceh1.g()) {
/*  294 */         double d = Math.min((0.2F + f / 15.0F), 2.5D);
/*  295 */         int i = (int)(150.0D * d);
/*  296 */         ((aag)this.l).a(new hc(hh.d, ceh1), cD(), cE(), cH(), i, 0.0D, 0.0D, 0.0D, 0.15000000596046448D);
/*      */       } 
/*      */     } 
/*      */     
/*  300 */     super.a(☃, bool, ceh1, fx1);
/*      */   }
/*      */   
/*      */   public boolean cM() {
/*  304 */     return (dC() == aqq.b);
/*      */   }
/*      */   
/*      */   public float a(float ☃) {
/*  308 */     return afm.g(☃, this.bC, this.bB);
/*      */   }
/*      */ 
/*      */   
/*      */   public void ag() {
/*  313 */     this.ar = this.as;
/*      */     
/*  315 */     if (this.Q) {
/*  316 */       ek().ifPresent(this::a);
/*      */     }
/*      */ 
/*      */     
/*  320 */     if (cN()) {
/*  321 */       cO();
/*      */     }
/*      */     
/*  324 */     super.ag();
/*      */     
/*  326 */     this.l.Z().a("livingEntityBaseTick");
/*      */     
/*  328 */     boolean ☃ = this instanceof bfw;
/*  329 */     if (aX()) {
/*  330 */       if (aY()) {
/*  331 */         a(apk.f, 1.0F);
/*  332 */       } else if (☃ && !this.l.f().a(cc())) {
/*  333 */         double d = this.l.f().a(this) + this.l.f().n();
/*  334 */         if (d < 0.0D) {
/*  335 */           double d1 = this.l.f().o();
/*  336 */           if (d1 > 0.0D) {
/*  337 */             a(apk.f, Math.max(1, afm.c(-d * d1)));
/*      */           }
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*  343 */     if (aD() || this.l.v) {
/*  344 */       am();
/*      */     }
/*  346 */     boolean bool1 = (☃ && ((bfw)this).bC.a);
/*      */     
/*  348 */     if (aX()) {
/*  349 */       if (a(aef.b) && !this.l.d_(new fx(cD(), cG(), cH())).a(bup.lc)) {
/*  350 */         if (!cM() && !apv.c(this) && !bool1) {
/*  351 */           j(l(bI()));
/*  352 */           if (bI() == -20) {
/*  353 */             j(0);
/*  354 */             dcn dcn = cC();
/*  355 */             for (int i = 0; i < 8; i++) {
/*  356 */               double d1 = this.J.nextDouble() - this.J.nextDouble();
/*  357 */               double d2 = this.J.nextDouble() - this.J.nextDouble();
/*  358 */               double d3 = this.J.nextDouble() - this.J.nextDouble();
/*  359 */               this.l.a(hh.e, cD() + d1, cE() + d2, cH() + d3, dcn.b, dcn.c, dcn.d);
/*      */             } 
/*  361 */             a(apk.h, 2.0F);
/*      */           } 
/*      */         } 
/*      */         
/*  365 */         if (!this.l.v && br() && ct() != null && !ct().bt()) {
/*  366 */           l();
/*      */         }
/*  368 */       } else if (bI() < bH()) {
/*  369 */         j(m(bI()));
/*      */       } 
/*      */       
/*  372 */       if (!this.l.v) {
/*  373 */         fx fx1 = cB();
/*  374 */         if (!Objects.equal(this.bx, fx1)) {
/*  375 */           this.bx = fx1;
/*  376 */           c(fx1);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  381 */     if (aX() && aG()) {
/*  382 */       am();
/*      */     }
/*      */     
/*  385 */     if (this.an > 0) {
/*  386 */       this.an--;
/*      */     }
/*  388 */     if (this.P > 0 && !(this instanceof aah)) {
/*  389 */       this.P--;
/*      */     }
/*  391 */     if (dl()) {
/*  392 */       cU();
/*      */     }
/*  394 */     if (this.aG > 0) {
/*  395 */       this.aG--;
/*      */     } else {
/*  397 */       this.aF = null;
/*      */     } 
/*  399 */     if (this.bs != null && !this.bs.aX()) {
/*  400 */       this.bs = null;
/*      */     }
/*      */     
/*  403 */     if (this.bq != null) {
/*  404 */       if (!this.bq.aX()) {
/*  405 */         a((aqm)null);
/*  406 */       } else if (this.K - this.br > 100) {
/*  407 */         a((aqm)null);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  412 */     de();
/*      */     
/*  414 */     this.aM = this.aL;
/*      */     
/*  416 */     this.aB = this.aA;
/*  417 */     this.aD = this.aC;
/*  418 */     this.r = this.p;
/*  419 */     this.s = this.q;
/*      */     
/*  421 */     this.l.Z().c();
/*      */   }
/*      */   
/*      */   public boolean cN() {
/*  425 */     return (this.K % 5 == 0 && (cC()).b != 0.0D && (cC()).d != 0.0D && !a_() && bpu.j(this) && cP());
/*      */   }
/*      */   
/*      */   protected void cO() {
/*  429 */     dcn ☃ = cC();
/*  430 */     this.l.a(hh.C, cD() + (this.J.nextDouble() - 0.5D) * cy(), cE() + 0.1D, cH() + (this.J.nextDouble() - 0.5D) * cy(), ☃.b * -0.2D, 0.1D, ☃.d * -0.2D);
/*      */     
/*  432 */     float f = (this.J.nextFloat() * 0.4F + this.J.nextFloat() > 0.9F) ? 0.6F : 0.0F;
/*  433 */     a(adq.nZ, f, 0.6F + this.J.nextFloat() * 0.4F);
/*      */   }
/*      */   
/*      */   protected boolean cP() {
/*  437 */     return this.l.d_(as()).a(aed.ar);
/*      */   }
/*      */ 
/*      */   
/*      */   protected float ar() {
/*  442 */     if (cP() && bpu.a(bpw.l, this) > 0) {
/*  443 */       return 1.0F;
/*      */     }
/*      */     
/*  446 */     return super.ar();
/*      */   }
/*      */   
/*      */   protected boolean b(ceh ☃) {
/*  450 */     return (!☃.g() || ef());
/*      */   }
/*      */   
/*      */   protected void cQ() {
/*  454 */     arh ☃ = a(arl.d);
/*      */     
/*  456 */     if (☃ == null) {
/*      */       return;
/*      */     }
/*      */     
/*  460 */     if (☃.a(c) != null) {
/*  461 */       ☃.b(c);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void cR() {
/*  466 */     if (!aN().g()) {
/*  467 */       int ☃ = bpu.a(bpw.l, this);
/*      */       
/*  469 */       if (☃ > 0 && 
/*  470 */         cP()) {
/*  471 */         arh arh = a(arl.d);
/*      */         
/*  473 */         if (arh == null) {
/*      */           return;
/*      */         }
/*      */         
/*  477 */         arh.b(new arj(c, "Soul speed boost", (0.03F * (1.0F + ☃ * 0.35F)), arj.a.a));
/*      */         
/*  479 */         if (cY().nextFloat() < 0.04F) {
/*  480 */           bmb bmb1 = b(aqf.c);
/*      */ 
/*      */           
/*  483 */           bmb1.a(1, this, ☃ -> ☃.c(aqf.c));
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void c(fx ☃) {
/*  491 */     int i = bpu.a(bpw.j, this);
/*  492 */     if (i > 0) {
/*  493 */       bpz.a(this, this.l, ☃, i);
/*      */     }
/*      */     
/*  496 */     if (b(aN())) {
/*  497 */       cQ();
/*      */     }
/*      */     
/*  500 */     cR();
/*      */   }
/*      */   
/*      */   public boolean w_() {
/*  504 */     return false;
/*      */   }
/*      */   
/*      */   public float cS() {
/*  508 */     return w_() ? 0.5F : 1.0F;
/*      */   }
/*      */   
/*      */   protected boolean cT() {
/*  512 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bt() {
/*  517 */     return false;
/*      */   }
/*      */   
/*      */   protected void cU() {
/*  521 */     this.aq++;
/*  522 */     if (this.aq == 20) {
/*  523 */       ad();
/*  524 */       for (int ☃ = 0; ☃ < 20; ☃++) {
/*  525 */         double d1 = this.J.nextGaussian() * 0.02D;
/*  526 */         double d2 = this.J.nextGaussian() * 0.02D;
/*  527 */         double d3 = this.J.nextGaussian() * 0.02D;
/*  528 */         this.l.a(hh.P, d(1.0D), cF(), g(1.0D), d1, d2, d3);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean cV() {
/*  534 */     return !w_();
/*      */   }
/*      */   
/*      */   protected boolean cW() {
/*  538 */     return !w_();
/*      */   }
/*      */   
/*      */   protected int l(int ☃) {
/*  542 */     int i = bpu.d(this);
/*  543 */     if (i > 0 && 
/*  544 */       this.J.nextInt(i + 1) > 0)
/*      */     {
/*  546 */       return ☃;
/*      */     }
/*      */     
/*  549 */     return ☃ - 1;
/*      */   }
/*      */   
/*      */   protected int m(int ☃) {
/*  553 */     return Math.min(☃ + 4, bH());
/*      */   }
/*      */   
/*      */   protected int d(bfw ☃) {
/*  557 */     return 0;
/*      */   }
/*      */   
/*      */   protected boolean cX() {
/*  561 */     return false;
/*      */   }
/*      */   
/*      */   public Random cY() {
/*  565 */     return this.J;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aqm cZ() {
/*  570 */     return this.bq;
/*      */   }
/*      */   
/*      */   public int da() {
/*  574 */     return this.br;
/*      */   }
/*      */   
/*      */   public void e(@Nullable bfw ☃) {
/*  578 */     this.aF = ☃;
/*  579 */     this.aG = this.K;
/*      */   }
/*      */   
/*      */   public void a(@Nullable aqm ☃) {
/*  583 */     this.bq = ☃;
/*  584 */     this.br = this.K;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aqm db() {
/*  589 */     return this.bs;
/*      */   }
/*      */   
/*      */   public int dc() {
/*  593 */     return this.bt;
/*      */   }
/*      */   
/*      */   public void z(aqa ☃) {
/*  597 */     if (☃ instanceof aqm) {
/*  598 */       this.bs = (aqm)☃;
/*      */     } else {
/*  600 */       this.bs = null;
/*      */     } 
/*  602 */     this.bt = this.K;
/*      */   }
/*      */   
/*      */   public int dd() {
/*  606 */     return this.aI;
/*      */   }
/*      */   
/*      */   public void n(int ☃) {
/*  610 */     this.aI = ☃;
/*      */   }
/*      */   
/*      */   protected void b(bmb ☃) {
/*  614 */     if (☃.a()) {
/*      */       return;
/*      */     }
/*      */     
/*  618 */     adp adp = adq.M;
/*  619 */     blx blx = ☃.b();
/*  620 */     if (blx instanceof bjy) {
/*  621 */       adp = ((bjy)blx).ab_().b();
/*  622 */     } else if (blx == bmd.qo) {
/*  623 */       adp = adq.L;
/*      */     } 
/*      */     
/*  626 */     a(adp, 1.0F, 1.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(md ☃) {
/*  631 */     ☃.a("Health", dk());
/*  632 */     ☃.a("HurtTime", (short)this.an);
/*  633 */     ☃.b("HurtByTimestamp", this.br);
/*  634 */     ☃.a("DeathTime", (short)this.aq);
/*  635 */     ☃.a("AbsorptionAmount", dT());
/*      */     
/*  637 */     ☃.a("Attributes", dB().c());
/*      */     
/*  639 */     if (!this.bm.isEmpty()) {
/*  640 */       mj mj = new mj();
/*      */       
/*  642 */       for (apu apu : this.bm.values()) {
/*  643 */         mj.add(apu.a(new md()));
/*      */       }
/*  645 */       ☃.a("ActiveEffects", mj);
/*      */     } 
/*      */     
/*  648 */     ☃.a("FallFlying", ef());
/*      */     
/*  650 */     ek().ifPresent(fx1 -> {
/*      */           ☃.b("SleepingX", fx1.u());
/*      */           
/*      */           ☃.b("SleepingY", fx1.v());
/*      */           ☃.b("SleepingZ", fx1.w());
/*      */         });
/*  656 */     DataResult<mt> dataResult = this.bg.a(mo.a);
/*  657 */     dataResult.resultOrPartial(h::error).ifPresent(mt1 -> ☃.a("Brain", mt1));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(md ☃) {
/*  662 */     s(☃.j("AbsorptionAmount"));
/*      */     
/*  664 */     if (☃.c("Attributes", 9) && this.l != null && !this.l.v) {
/*  665 */       dB().a(☃.d("Attributes", 10));
/*      */     }
/*      */     
/*  668 */     if (☃.c("ActiveEffects", 9)) {
/*  669 */       mj mj = ☃.d("ActiveEffects", 10);
/*  670 */       for (int i = 0; i < mj.size(); i++) {
/*  671 */         md md1 = mj.a(i);
/*  672 */         apu apu = apu.b(md1);
/*  673 */         if (apu != null) {
/*  674 */           this.bm.put(apu.a(), apu);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  679 */     if (☃.c("Health", 99)) {
/*  680 */       c(☃.j("Health"));
/*      */     }
/*      */     
/*  683 */     this.an = ☃.g("HurtTime");
/*  684 */     this.aq = ☃.g("DeathTime");
/*  685 */     this.br = ☃.h("HurtByTimestamp");
/*      */ 
/*      */     
/*  688 */     if (☃.c("Team", 8)) {
/*  689 */       String str = ☃.l("Team");
/*  690 */       ddl ddl = this.l.G().f(str);
/*  691 */       boolean bool = (ddl != null && this.l.G().a(bT(), ddl));
/*  692 */       if (!bool) {
/*  693 */         h.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", str);
/*      */       }
/*      */     } 
/*      */     
/*  697 */     if (☃.q("FallFlying")) {
/*  698 */       b(7, true);
/*      */     }
/*      */     
/*  701 */     if (☃.c("SleepingX", 99) && ☃
/*  702 */       .c("SleepingY", 99) && ☃
/*  703 */       .c("SleepingZ", 99)) {
/*      */       
/*  705 */       fx fx1 = new fx(☃.h("SleepingX"), ☃.h("SleepingY"), ☃.h("SleepingZ"));
/*  706 */       e(fx1);
/*  707 */       this.R.b(T, aqx.c);
/*      */       
/*  709 */       if (!this.Q)
/*      */       {
/*  711 */         a(fx1);
/*      */       }
/*      */     } 
/*      */     
/*  715 */     if (☃.c("Brain", 10)) {
/*  716 */       this.bg = a(new Dynamic(mo.a, ☃.c("Brain")));
/*      */     }
/*      */   }
/*      */   
/*      */   protected void de() {
/*  721 */     Iterator<aps> ☃ = this.bm.keySet().iterator();
/*      */     try {
/*  723 */       while (☃.hasNext()) {
/*  724 */         aps aps = ☃.next();
/*  725 */         apu apu = this.bm.get(aps);
/*      */         
/*  727 */         if (!apu.a(this, () -> a(☃, true))) {
/*  728 */           if (!this.l.v) {
/*  729 */             ☃.remove();
/*  730 */             b(apu);
/*      */           }  continue;
/*  732 */         }  if (apu.b() % 600 == 0)
/*      */         {
/*  734 */           a(apu, false);
/*      */         }
/*      */       } 
/*  737 */     } catch (ConcurrentModificationException concurrentModificationException) {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  742 */     if (this.bp) {
/*  743 */       if (!this.l.v) {
/*  744 */         C();
/*      */       }
/*  746 */       this.bp = false;
/*      */     } 
/*  748 */     int i = ((Integer)this.R.<Integer>a(f)).intValue();
/*  749 */     boolean bool = ((Boolean)this.R.<Boolean>a(g)).booleanValue();
/*      */     
/*  751 */     if (i > 0) {
/*      */       boolean bool1; int j;
/*  753 */       if (bF()) {
/*      */         
/*  755 */         bool1 = (this.J.nextInt(15) == 0);
/*      */       } else {
/*  757 */         bool1 = this.J.nextBoolean();
/*      */       } 
/*      */       
/*  760 */       if (bool) {
/*  761 */         j = bool1 & ((this.J.nextInt(5) == 0) ? 1 : 0);
/*      */       }
/*      */       
/*  764 */       if (j != 0 && 
/*  765 */         i > 0) {
/*  766 */         double d1 = (i >> 16 & 0xFF) / 255.0D;
/*  767 */         double d2 = (i >> 8 & 0xFF) / 255.0D;
/*  768 */         double d3 = (i >> 0 & 0xFF) / 255.0D;
/*  769 */         this.l.a(bool ? hh.a : hh.u, d(0.5D), cF(), g(0.5D), d1, d2, d3);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void C() {
/*  776 */     if (this.bm.isEmpty()) {
/*  777 */       df();
/*  778 */       j(false);
/*      */     } else {
/*  780 */       Collection<apu> ☃ = this.bm.values();
/*  781 */       this.R.b(g, Boolean.valueOf(c(☃)));
/*  782 */       this.R.b(f, Integer.valueOf(bnv.a(☃)));
/*  783 */       j(a(apw.n));
/*      */     } 
/*      */   }
/*      */   
/*      */   public double A(@Nullable aqa ☃) {
/*  788 */     double d = 1.0D;
/*      */     
/*  790 */     if (bx()) {
/*  791 */       d *= 0.8D;
/*      */     }
/*  793 */     if (bF()) {
/*  794 */       float f = dF();
/*  795 */       if (f < 0.1F) {
/*  796 */         f = 0.1F;
/*      */       }
/*  798 */       d *= 0.7D * f;
/*      */     } 
/*  800 */     if (☃ != null) {
/*  801 */       bmb bmb1 = b(aqf.f);
/*  802 */       blx blx = bmb1.b();
/*  803 */       aqe<?> aqe = ☃.X();
/*      */       
/*  805 */       if ((aqe == aqe.av && blx == bmd.pe) || (aqe == aqe.aY && blx == bmd.ph) || (aqe == aqe.m && blx == bmd.pi))
/*      */       {
/*      */ 
/*      */         
/*  809 */         d *= 0.5D;
/*      */       }
/*      */     } 
/*      */     
/*  813 */     return d;
/*      */   }
/*      */   
/*      */   public boolean c(aqm ☃) {
/*  817 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(aqm ☃, azg azg1) {
/*  821 */     return azg1.a(this, ☃);
/*      */   }
/*      */   
/*      */   public static boolean c(Collection<apu> ☃) {
/*  825 */     for (apu apu : ☃) {
/*  826 */       if (!apu.d()) {
/*  827 */         return false;
/*      */       }
/*      */     } 
/*      */     
/*  831 */     return true;
/*      */   }
/*      */   
/*      */   protected void df() {
/*  835 */     this.R.b(g, Boolean.valueOf(false));
/*  836 */     this.R.b(f, Integer.valueOf(0));
/*      */   }
/*      */   
/*      */   public boolean dg() {
/*  840 */     if (this.l.v) {
/*  841 */       return false;
/*      */     }
/*      */     
/*  844 */     Iterator<apu> ☃ = this.bm.values().iterator();
/*  845 */     boolean bool = false;
/*  846 */     while (☃.hasNext()) {
/*  847 */       b(☃.next());
/*  848 */       ☃.remove();
/*  849 */       bool = true;
/*      */     } 
/*  851 */     return bool;
/*      */   }
/*      */   
/*      */   public Collection<apu> dh() {
/*  855 */     return this.bm.values();
/*      */   }
/*      */   
/*      */   public Map<aps, apu> di() {
/*  859 */     return this.bm;
/*      */   }
/*      */   
/*      */   public boolean a(aps ☃) {
/*  863 */     return this.bm.containsKey(☃);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public apu b(aps ☃) {
/*  868 */     return this.bm.get(☃);
/*      */   }
/*      */   
/*      */   public boolean c(apu ☃) {
/*  872 */     if (!d(☃)) {
/*  873 */       return false;
/*      */     }
/*      */     
/*  876 */     apu apu1 = this.bm.get(☃.a());
/*  877 */     if (apu1 == null) {
/*  878 */       this.bm.put(☃.a(), ☃);
/*  879 */       a(☃);
/*  880 */       return true;
/*      */     } 
/*      */     
/*  883 */     if (apu1.b(☃)) {
/*  884 */       a(apu1, true);
/*  885 */       return true;
/*      */     } 
/*      */ 
/*      */     
/*  889 */     return false;
/*      */   }
/*      */   
/*      */   public boolean d(apu ☃) {
/*  893 */     if (dC() == aqq.b) {
/*  894 */       aps aps = ☃.a();
/*  895 */       if (aps == apw.j || aps == apw.s) {
/*  896 */         return false;
/*      */       }
/*      */     } 
/*      */     
/*  900 */     return true;
/*      */   }
/*      */   
/*      */   public void e(apu ☃) {
/*  904 */     if (!d(☃)) {
/*      */       return;
/*      */     }
/*      */     
/*  908 */     apu apu1 = this.bm.put(☃.a(), ☃);
/*  909 */     if (apu1 == null) {
/*  910 */       a(☃);
/*      */     } else {
/*  912 */       a(☃, true);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean dj() {
/*  917 */     return (dC() == aqq.b);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public apu c(@Nullable aps ☃) {
/*  922 */     return this.bm.remove(☃);
/*      */   }
/*      */   
/*      */   public boolean d(aps ☃) {
/*  926 */     apu apu = c(☃);
/*  927 */     if (apu != null) {
/*  928 */       b(apu);
/*  929 */       return true;
/*      */     } 
/*  931 */     return false;
/*      */   }
/*      */   
/*      */   protected void a(apu ☃) {
/*  935 */     this.bp = true;
/*  936 */     if (!this.l.v) {
/*  937 */       ☃.a().b(this, dB(), ☃.c());
/*      */     }
/*      */   }
/*      */   
/*      */   protected void a(apu ☃, boolean bool) {
/*  942 */     this.bp = true;
/*  943 */     if (bool && !this.l.v) {
/*  944 */       aps aps = ☃.a();
/*  945 */       aps.a(this, dB(), ☃.c());
/*  946 */       aps.b(this, dB(), ☃.c());
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void b(apu ☃) {
/*  951 */     this.bp = true;
/*  952 */     if (!this.l.v) {
/*  953 */       ☃.a().a(this, dB(), ☃.c());
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(float ☃) {
/*  958 */     float f = dk();
/*  959 */     if (f > 0.0F) {
/*  960 */       c(f + ☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public float dk() {
/*  965 */     return ((Float)this.R.<Float>a(e)).floatValue();
/*      */   }
/*      */   
/*      */   public void c(float ☃) {
/*  969 */     this.R.b(e, Float.valueOf(afm.a(☃, 0.0F, dx())));
/*      */   }
/*      */   
/*      */   public boolean dl() {
/*  973 */     return (dk() <= 0.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(apk ☃, float f) {
/*  978 */     if (b(☃)) {
/*  979 */       return false;
/*      */     }
/*  981 */     if (this.l.v) {
/*  982 */       return false;
/*      */     }
/*      */     
/*  985 */     if (dl()) {
/*  986 */       return false;
/*      */     }
/*      */     
/*  989 */     if (☃.p() && a(apw.l)) {
/*  990 */       return false;
/*      */     }
/*      */     
/*  993 */     if (em() && !this.l.v) {
/*  994 */       en();
/*      */     }
/*      */     
/*  997 */     this.aI = 0;
/*  998 */     float f1 = f;
/*      */     
/* 1000 */     if ((☃ == apk.q || ☃ == apk.r) && !b(aqf.f).a()) {
/* 1001 */       b(aqf.f).a((int)(f * 4.0F + this.J.nextFloat() * f * 2.0F), this, ☃ -> ☃.c(aqf.f));
/* 1002 */       f *= 0.75F;
/*      */     } 
/*      */     
/* 1005 */     boolean bool1 = false;
/* 1006 */     float f2 = 0.0F;
/* 1007 */     if (f > 0.0F && g(☃)) {
/* 1008 */       p(f);
/*      */       
/* 1010 */       f2 = f;
/* 1011 */       f = 0.0F;
/* 1012 */       if (!☃.b()) {
/* 1013 */         aqa aqa2 = ☃.j();
/* 1014 */         if (aqa2 instanceof aqm) {
/* 1015 */           d((aqm)aqa2);
/*      */         }
/*      */       } 
/*      */       
/* 1019 */       bool1 = true;
/*      */     } 
/*      */     
/* 1022 */     this.av = 1.5F;
/*      */     
/* 1024 */     boolean bool2 = true;
/* 1025 */     if (this.P > 10.0F) {
/* 1026 */       if (f <= this.aP) {
/* 1027 */         return false;
/*      */       }
/* 1029 */       e(☃, f - this.aP);
/* 1030 */       this.aP = f;
/* 1031 */       bool2 = false;
/*      */     } else {
/* 1033 */       this.aP = f;
/* 1034 */       this.P = 20;
/* 1035 */       e(☃, f);
/* 1036 */       this.ao = 10;
/* 1037 */       this.an = this.ao;
/*      */     } 
/*      */     
/* 1040 */     this.ap = 0.0F;
/*      */     
/* 1042 */     aqa aqa1 = ☃.k();
/* 1043 */     if (aqa1 != null) {
/* 1044 */       if (aqa1 instanceof aqm) {
/* 1045 */         a((aqm)aqa1);
/*      */       }
/* 1047 */       if (aqa1 instanceof bfw) {
/* 1048 */         this.aG = 100;
/* 1049 */         this.aF = (bfw)aqa1;
/* 1050 */       } else if (aqa1 instanceof baz) {
/* 1051 */         baz baz = (baz)aqa1;
/* 1052 */         if (baz.eK()) {
/* 1053 */           this.aG = 100;
/* 1054 */           aqm aqm1 = baz.eN();
/* 1055 */           if (aqm1 != null && aqm1.X() == aqe.bc) {
/* 1056 */             this.aF = (bfw)aqm1;
/*      */           } else {
/* 1058 */             this.aF = null;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/* 1063 */     if (bool2) {
/* 1064 */       if (bool1) {
/* 1065 */         this.l.a(this, (byte)29);
/*      */       }
/* 1067 */       else if (☃ instanceof apl && ((apl)☃).y()) {
/* 1068 */         this.l.a(this, (byte)33);
/*      */       } else {
/*      */         byte b;
/* 1071 */         if (☃ == apk.h) {
/* 1072 */           b = 36;
/* 1073 */         } else if (☃.p()) {
/* 1074 */           b = 37;
/* 1075 */         } else if (☃ == apk.u) {
/* 1076 */           b = 44;
/*      */         } else {
/* 1078 */           b = 2;
/*      */         } 
/* 1080 */         this.l.a(this, b);
/*      */       } 
/*      */       
/* 1083 */       if (☃ != apk.h && (!bool1 || f > 0.0F)) {
/* 1084 */         aS();
/*      */       }
/* 1086 */       if (aqa1 != null) {
/* 1087 */         double d1 = aqa1.cD() - cD();
/* 1088 */         double d2 = aqa1.cH() - cH();
/* 1089 */         while (d1 * d1 + d2 * d2 < 1.0E-4D) {
/* 1090 */           d1 = (Math.random() - Math.random()) * 0.01D;
/* 1091 */           d2 = (Math.random() - Math.random()) * 0.01D;
/*      */         } 
/* 1093 */         this.ap = (float)(afm.d(d2, d1) * 57.2957763671875D - this.p);
/* 1094 */         a(0.4F, d1, d2);
/*      */       } else {
/* 1096 */         this.ap = ((int)(Math.random() * 2.0D) * 180);
/*      */       } 
/*      */     } 
/*      */     
/* 1100 */     if (dl()) {
/* 1101 */       if (!f(☃)) {
/* 1102 */         adp adp = dq();
/* 1103 */         if (bool2 && adp != null) {
/* 1104 */           a(adp, dG(), dH());
/*      */         }
/* 1106 */         a(☃);
/*      */       }
/*      */     
/* 1109 */     } else if (bool2) {
/* 1110 */       c(☃);
/*      */     } 
/*      */ 
/*      */     
/* 1114 */     boolean bool3 = (!bool1 || f > 0.0F);
/* 1115 */     if (bool3) {
/* 1116 */       this.bz = ☃;
/* 1117 */       this.bA = this.l.T();
/*      */     } 
/* 1119 */     if (this instanceof aah) {
/* 1120 */       ac.h.a((aah)this, ☃, f1, f, bool1);
/*      */       
/* 1122 */       if (f2 > 0.0F && f2 < 3.4028235E37F) {
/* 1123 */         ((aah)this).a(aea.J, Math.round(f2 * 10.0F));
/*      */       }
/*      */     } 
/* 1126 */     if (aqa1 instanceof aah) {
/* 1127 */       ac.g.a((aah)aqa1, this, ☃, f1, f, bool1);
/*      */     }
/* 1129 */     return bool3;
/*      */   }
/*      */   
/*      */   protected void d(aqm ☃) {
/* 1133 */     ☃.e(this);
/*      */   }
/*      */   
/*      */   protected void e(aqm ☃) {
/* 1137 */     ☃.a(0.5F, ☃.cD() - cD(), ☃.cH() - cH());
/*      */   }
/*      */   
/*      */   private boolean f(apk ☃) {
/* 1141 */     if (☃.h()) {
/* 1142 */       return false;
/*      */     }
/*      */     
/* 1145 */     bmb bmb1 = null;
/*      */     
/* 1147 */     for (aot aot1 : aot.values()) {
/* 1148 */       bmb bmb2 = b(aot1);
/* 1149 */       if (bmb2.b() == bmd.qu) {
/* 1150 */         bmb1 = bmb2.i();
/* 1151 */         bmb2.g(1);
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/* 1156 */     if (bmb1 != null) {
/*      */       
/* 1158 */       if (this instanceof aah) {
/* 1159 */         aah aah = (aah)this;
/* 1160 */         aah.b(aea.c.b(bmd.qu));
/* 1161 */         ac.B.a(aah, bmb1);
/*      */       } 
/* 1163 */       c(1.0F);
/* 1164 */       dg();
/* 1165 */       c(new apu(apw.j, 900, 1));
/* 1166 */       c(new apu(apw.v, 100, 1));
/* 1167 */       c(new apu(apw.l, 800, 0));
/* 1168 */       this.l.a(this, (byte)35);
/*      */     } 
/* 1170 */     return (bmb1 != null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public apk dm() {
/* 1178 */     if (this.l.T() - this.bA > 40L) {
/* 1179 */       this.bz = null;
/*      */     }
/* 1181 */     return this.bz;
/*      */   }
/*      */   
/*      */   protected void c(apk ☃) {
/* 1185 */     adp adp = e(☃);
/* 1186 */     if (adp != null) {
/* 1187 */       a(adp, dG(), dH());
/*      */     }
/*      */   }
/*      */   
/*      */   private boolean g(apk ☃) {
/* 1192 */     aqa aqa1 = ☃.j();
/* 1193 */     boolean bool = false;
/* 1194 */     if (aqa1 instanceof bga) {
/* 1195 */       bga bga = (bga)aqa1;
/* 1196 */       if (bga.r() > 0) {
/* 1197 */         bool = true;
/*      */       }
/*      */     } 
/* 1200 */     if (!☃.f() && ed() && !bool) {
/* 1201 */       dcn dcn = ☃.w();
/* 1202 */       if (dcn != null) {
/* 1203 */         dcn dcn1 = f(1.0F);
/* 1204 */         dcn dcn2 = dcn.a(cA()).d();
/* 1205 */         dcn2 = new dcn(dcn2.b, 0.0D, dcn2.d);
/*      */ 
/*      */ 
/*      */         
/* 1209 */         if (dcn2.b(dcn1) < 0.0D) {
/* 1210 */           return true;
/*      */         }
/*      */       } 
/*      */     } 
/* 1214 */     return false;
/*      */   }
/*      */   
/*      */   private void g(bmb ☃) {
/* 1218 */     if (!☃.a()) {
/* 1219 */       if (!aA()) {
/* 1220 */         this.l.a(cD(), cE(), cH(), adq.gK, cu(), 0.8F, 0.8F + this.l.t.nextFloat() * 0.4F, false);
/*      */       }
/* 1222 */       a(☃, 5);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(apk ☃) {
/* 1227 */     if (this.y || this.aH) {
/*      */       return;
/*      */     }
/* 1230 */     aqa aqa1 = ☃.k();
/* 1231 */     aqm aqm1 = dw();
/* 1232 */     if (this.aO >= 0 && aqm1 != null) {
/* 1233 */       aqm1.a(this, this.aO, ☃);
/*      */     }
/*      */     
/* 1236 */     if (em()) {
/* 1237 */       en();
/*      */     }
/*      */     
/* 1240 */     this.aH = true;
/* 1241 */     dv().g();
/*      */     
/* 1243 */     if (this.l instanceof aag) {
/* 1244 */       if (aqa1 != null) {
/* 1245 */         aqa1.a((aag)this.l, this);
/*      */       }
/*      */       
/* 1248 */       d(☃);
/*      */       
/* 1250 */       f(aqm1);
/*      */     } 
/*      */     
/* 1253 */     this.l.a(this, (byte)3);
/* 1254 */     b(aqx.g);
/*      */   }
/*      */   
/*      */   protected void f(@Nullable aqm ☃) {
/* 1258 */     if (this.l.v) {
/*      */       return;
/*      */     }
/*      */     
/* 1262 */     boolean bool = false;
/* 1263 */     if (☃ instanceof bcl) {
/* 1264 */       if (this.l.V().b(brt.b)) {
/* 1265 */         fx fx1 = cB();
/* 1266 */         ceh ceh = bup.bA.n();
/* 1267 */         if (this.l.d_(fx1).g() && ceh.a(this.l, fx1)) {
/* 1268 */           this.l.a(fx1, ceh, 3);
/* 1269 */           bool = true;
/*      */         } 
/*      */       } 
/*      */       
/* 1273 */       if (!bool) {
/* 1274 */         bcv bcv = new bcv(this.l, cD(), cE(), cH(), new bmb(bmd.bt));
/* 1275 */         this.l.c(bcv);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   protected void d(apk ☃) {
/*      */     int i;
/* 1281 */     aqa aqa1 = ☃.k();
/*      */ 
/*      */     
/* 1284 */     if (aqa1 instanceof bfw) {
/* 1285 */       i = bpu.g((aqm)aqa1);
/*      */     } else {
/* 1287 */       i = 0;
/*      */     } 
/*      */     
/* 1290 */     boolean bool = (this.aG > 0);
/*      */     
/* 1292 */     if (cW() && this.l.V().b(brt.e)) {
/* 1293 */       a(☃, bool);
/* 1294 */       a(☃, i, bool);
/*      */     } 
/* 1296 */     dn();
/* 1297 */     do();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void dn() {}
/*      */   
/*      */   protected void do() {
/* 1304 */     if (!this.l.v && (cX() || (this.aG > 0 && cV() && this.l.V().b(brt.e)))) {
/* 1305 */       int ☃ = d(this.aF);
/* 1306 */       while (☃ > 0) {
/* 1307 */         int i = aqg.a(☃);
/* 1308 */         ☃ -= i;
/* 1309 */         this.l.c(new aqg(this.l, cD(), cE(), cH(), i));
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(apk ☃, int i, boolean bool) {}
/*      */   
/*      */   public vk dp() {
/* 1318 */     return X().i();
/*      */   }
/*      */   
/*      */   protected void a(apk ☃, boolean bool) {
/* 1322 */     vk vk = dp();
/*      */     
/* 1324 */     cyy cyy = this.l.l().aJ().a(vk);
/*      */     
/* 1326 */     cyv.a a = a(bool, ☃);
/* 1327 */     cyy.b(a.a(dbb.f), this::a);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected cyv.a a(boolean ☃, apk apk1) {
/* 1337 */     cyv.a a = (new cyv.a((aag)this.l)).a(this.J).<aqa>a(dbc.a, this).<dcn>a(dbc.f, cA()).<apk>a(dbc.c, apk1).<aqa>b(dbc.d, apk1.k()).b(dbc.e, apk1.j());
/*      */     
/* 1339 */     if (☃ && this.aF != null) {
/* 1340 */       a = a.<bfw>a(dbc.b, this.aF).a(this.aF.eU());
/*      */     }
/* 1342 */     return a;
/*      */   }
/*      */   
/*      */   public void a(float ☃, double d1, double d2) {
/* 1346 */     ☃ = (float)(☃ * (1.0D - b(arl.c)));
/* 1347 */     if (☃ <= 0.0F) {
/*      */       return;
/*      */     }
/*      */     
/* 1351 */     this.Z = true;
/*      */     
/* 1353 */     dcn dcn1 = cC();
/*      */     
/* 1355 */     dcn dcn2 = (new dcn(d1, 0.0D, d2)).d().a(☃);
/*      */     
/* 1357 */     n(dcn1.b / 2.0D - dcn2.b, this.t ? 
/*      */         
/* 1359 */         Math.min(0.4D, dcn1.c / 2.0D + ☃) : dcn1.c, dcn1.d / 2.0D - dcn2.d);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp e(apk ☃) {
/* 1366 */     return adq.eN;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected adp dq() {
/* 1371 */     return adq.eI;
/*      */   }
/*      */   
/*      */   protected adp o(int ☃) {
/* 1375 */     if (☃ > 4) {
/* 1376 */       return adq.eG;
/*      */     }
/* 1378 */     return adq.eO;
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp c(bmb ☃) {
/* 1383 */     return ☃.G();
/*      */   }
/*      */   
/*      */   public adp d(bmb ☃) {
/* 1387 */     return ☃.H();
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(boolean ☃) {
/* 1392 */     super.c(☃);
/* 1393 */     if (☃) {
/* 1394 */       this.by = Optional.empty();
/*      */     }
/*      */   }
/*      */   
/*      */   public Optional<fx> dr() {
/* 1399 */     return this.by;
/*      */   }
/*      */   
/*      */   public boolean c_() {
/* 1403 */     if (a_()) {
/* 1404 */       return false;
/*      */     }
/*      */     
/* 1407 */     fx ☃ = cB();
/*      */     
/* 1409 */     ceh ceh = ds();
/* 1410 */     buo buo = ceh.b();
/* 1411 */     if (buo.a(aed.at)) {
/* 1412 */       this.by = Optional.of(☃);
/* 1413 */       return true;
/*      */     } 
/*      */     
/* 1416 */     if (buo instanceof cbb && c(☃, ceh)) {
/* 1417 */       this.by = Optional.of(☃);
/* 1418 */       return true;
/*      */     } 
/* 1420 */     return false;
/*      */   }
/*      */   
/*      */   public ceh ds() {
/* 1424 */     return this.l.d_(cB());
/*      */   }
/*      */   
/*      */   private boolean c(fx ☃, ceh ceh1) {
/* 1428 */     if (((Boolean)ceh1.c(cbb.a)).booleanValue()) {
/* 1429 */       ceh ceh2 = this.l.d_(☃.c());
/* 1430 */       if (ceh2.a(bup.cg) && ceh2.c(bxv.a) == ceh1.c(cbb.aq)) {
/* 1431 */         return true;
/*      */       }
/*      */     } 
/* 1434 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean aX() {
/* 1442 */     return (!this.y && dk() > 0.0F);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b(float ☃, float f1) {
/* 1447 */     boolean bool = super.b(☃, f1);
/* 1448 */     int i = e(☃, f1);
/*      */     
/* 1450 */     if (i > 0) {
/* 1451 */       a(o(i), 1.0F, 1.0F);
/* 1452 */       dt();
/* 1453 */       a(apk.k, i);
/* 1454 */       return true;
/*      */     } 
/* 1456 */     return bool;
/*      */   }
/*      */   
/*      */   protected int e(float ☃, float f1) {
/* 1460 */     apu apu = b(apw.h);
/* 1461 */     float f = (apu == null) ? 0.0F : (apu.c() + 1);
/* 1462 */     return afm.f((☃ - 3.0F - f) * f1);
/*      */   }
/*      */   
/*      */   protected void dt() {
/* 1466 */     if (aA()) {
/*      */       return;
/*      */     }
/* 1469 */     int ☃ = afm.c(cD());
/* 1470 */     int i = afm.c(cE() - 0.20000000298023224D);
/* 1471 */     int j = afm.c(cH());
/*      */     
/* 1473 */     ceh ceh = this.l.d_(new fx(☃, i, j));
/* 1474 */     if (!ceh.g()) {
/* 1475 */       cae cae = ceh.o();
/* 1476 */       a(cae.g(), cae.a() * 0.5F, cae.b() * 0.75F);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void bm() {
/* 1482 */     this.ao = 10;
/* 1483 */     this.an = this.ao;
/* 1484 */     this.ap = 0.0F;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int du() {
/* 1493 */     return afm.c(b(arl.i));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(apk ☃, float f) {}
/*      */ 
/*      */   
/*      */   protected void p(float ☃) {}
/*      */   
/*      */   protected float c(apk ☃, float f) {
/* 1503 */     if (!☃.f()) {
/* 1504 */       b(☃, f);
/* 1505 */       f = api.a(f, du(), (float)b(arl.j));
/*      */     } 
/* 1507 */     return f;
/*      */   }
/*      */   
/*      */   protected float d(apk ☃, float f) {
/* 1511 */     if (☃.i()) {
/* 1512 */       return f;
/*      */     }
/*      */     
/* 1515 */     if (a(apw.k) && ☃ != apk.m) {
/* 1516 */       int j = (b(apw.k).c() + 1) * 5;
/* 1517 */       int k = 25 - j;
/* 1518 */       float f1 = f * k;
/* 1519 */       float f2 = f;
/* 1520 */       f = Math.max(f1 / 25.0F, 0.0F);
/*      */       
/* 1522 */       float f3 = f2 - f;
/* 1523 */       if (f3 > 0.0F && f3 < 3.4028235E37F) {
/* 1524 */         if (this instanceof aah) {
/* 1525 */           ((aah)this).a(aea.L, Math.round(f3 * 10.0F));
/* 1526 */         } else if (☃.k() instanceof aah) {
/* 1527 */           ((aah)☃.k()).a(aea.H, Math.round(f3 * 10.0F));
/*      */         } 
/*      */       }
/*      */     } 
/*      */     
/* 1532 */     if (f <= 0.0F) {
/* 1533 */       return 0.0F;
/*      */     }
/*      */     
/* 1536 */     int i = bpu.a(bo(), ☃);
/* 1537 */     if (i > 0) {
/* 1538 */       f = api.a(f, i);
/*      */     }
/*      */     
/* 1541 */     return f;
/*      */   }
/*      */   
/*      */   protected void e(apk ☃, float f) {
/* 1545 */     if (b(☃)) {
/*      */       return;
/*      */     }
/* 1548 */     f = c(☃, f);
/* 1549 */     f = d(☃, f);
/*      */     
/* 1551 */     float f1 = f;
/* 1552 */     f = Math.max(f - dT(), 0.0F);
/* 1553 */     s(dT() - f1 - f);
/*      */     
/* 1555 */     float f2 = f1 - f;
/* 1556 */     if (f2 > 0.0F && f2 < 3.4028235E37F && ☃.k() instanceof aah) {
/* 1557 */       ((aah)☃.k()).a(aea.G, Math.round(f2 * 10.0F));
/*      */     }
/*      */     
/* 1560 */     if (f == 0.0F) {
/*      */       return;
/*      */     }
/*      */     
/* 1564 */     float f3 = dk();
/* 1565 */     c(f3 - f);
/* 1566 */     dv().a(☃, f3, f);
/* 1567 */     s(dT() - f);
/*      */   }
/*      */   
/*      */   public apj dv() {
/* 1571 */     return this.bl;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aqm dw() {
/* 1576 */     if (this.bl.c() != null) {
/* 1577 */       return this.bl.c();
/*      */     }
/* 1579 */     if (this.aF != null) {
/* 1580 */       return this.aF;
/*      */     }
/* 1582 */     if (this.bq != null) {
/* 1583 */       return this.bq;
/*      */     }
/* 1585 */     return null;
/*      */   }
/*      */   
/*      */   public final float dx() {
/* 1589 */     return (float)b(arl.a);
/*      */   }
/*      */   
/*      */   public final int dy() {
/* 1593 */     return ((Integer)this.R.<Integer>a(bh)).intValue();
/*      */   }
/*      */   
/*      */   public final void p(int ☃) {
/* 1597 */     this.R.b(bh, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   public final int dz() {
/* 1601 */     return ((Integer)this.R.<Integer>a(bi)).intValue();
/*      */   }
/*      */   
/*      */   public final void q(int ☃) {
/* 1605 */     this.R.b(bi, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   private int m() {
/* 1609 */     if (apv.a(this)) {
/* 1610 */       return 6 - 1 + apv.b(this);
/*      */     }
/* 1612 */     if (a(apw.d)) {
/* 1613 */       return 6 + (1 + b(apw.d).c()) * 2;
/*      */     }
/* 1615 */     return 6;
/*      */   }
/*      */   
/*      */   public void a(aot ☃) {
/* 1619 */     a(☃, false);
/*      */   }
/*      */   
/*      */   public void a(aot ☃, boolean bool) {
/* 1623 */     if (!this.ai || this.ak >= m() / 2 || this.ak < 0) {
/* 1624 */       this.ak = -1;
/* 1625 */       this.ai = true;
/* 1626 */       this.aj = ☃;
/*      */       
/* 1628 */       if (this.l instanceof aag) {
/* 1629 */         os os = new os(this, (☃ == aot.a) ? 0 : 3);
/* 1630 */         aae aae = ((aag)this.l).i();
/*      */         
/* 1632 */         if (bool) {
/* 1633 */           aae.a(this, os);
/*      */         } else {
/* 1635 */           aae.b(this, os);
/*      */         } 
/*      */       } 
/*      */     }  } public void a(byte ☃) { boolean bool1; adp adp1; int i; boolean bool2;
/*      */     int j;
/*      */     boolean bool3, bool4;
/*      */     apk apk1;
/*      */     adp adp2;
/* 1643 */     switch (☃) {
/*      */       case 2:
/*      */       case 33:
/*      */       case 36:
/*      */       case 37:
/*      */       case 44:
/* 1649 */         bool1 = (☃ == 33);
/* 1650 */         bool2 = (☃ == 36);
/* 1651 */         bool3 = (☃ == 37);
/* 1652 */         bool4 = (☃ == 44);
/*      */         
/* 1654 */         this.av = 1.5F;
/*      */         
/* 1656 */         this.P = 20;
/* 1657 */         this.ao = 10;
/* 1658 */         this.an = this.ao;
/* 1659 */         this.ap = 0.0F;
/*      */         
/* 1661 */         if (bool1) {
/* 1662 */           a(adq.pa, dG(), (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/*      */         }
/*      */ 
/*      */         
/* 1666 */         if (bool3) {
/* 1667 */           apk1 = apk.c;
/* 1668 */         } else if (bool2) {
/* 1669 */           apk1 = apk.h;
/* 1670 */         } else if (bool4) {
/* 1671 */           apk1 = apk.u;
/*      */         } else {
/* 1673 */           apk1 = apk.n;
/*      */         } 
/*      */         
/* 1676 */         adp2 = e(apk1);
/* 1677 */         if (adp2 != null) {
/* 1678 */           a(adp2, dG(), (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/*      */         }
/* 1680 */         a(apk.n, 0.0F);
/*      */         return;
/*      */       
/*      */       case 3:
/* 1684 */         adp1 = dq();
/* 1685 */         if (adp1 != null) {
/* 1686 */           a(adp1, dG(), (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/*      */         }
/*      */         
/* 1689 */         if (!(this instanceof bfw)) {
/* 1690 */           c(0.0F);
/* 1691 */           a(apk.n);
/*      */         } 
/*      */         return;
/*      */       
/*      */       case 30:
/* 1696 */         a(adq.mV, 0.8F, 0.8F + this.l.t.nextFloat() * 0.4F);
/*      */         return;
/*      */       case 29:
/* 1699 */         a(adq.mU, 1.0F, 0.8F + this.l.t.nextFloat() * 0.4F);
/*      */         return;
/*      */       case 46:
/* 1702 */         i = 128;
/*      */         
/* 1704 */         for (j = 0; j < 128; j++) {
/* 1705 */           double d1 = j / 127.0D;
/* 1706 */           float f1 = (this.J.nextFloat() - 0.5F) * 0.2F;
/* 1707 */           float f2 = (this.J.nextFloat() - 0.5F) * 0.2F;
/* 1708 */           float f3 = (this.J.nextFloat() - 0.5F) * 0.2F;
/*      */           
/* 1710 */           double d2 = afm.d(d1, this.m, cD()) + (this.J.nextDouble() - 0.5D) * cy() * 2.0D;
/* 1711 */           double d3 = afm.d(d1, this.n, cE()) + this.J.nextDouble() * cz();
/* 1712 */           double d4 = afm.d(d1, this.o, cH()) + (this.J.nextDouble() - 0.5D) * cy() * 2.0D;
/* 1713 */           this.l.a(hh.Q, d2, d3, d4, f1, f2, f3);
/*      */         } 
/*      */         return;
/*      */       
/*      */       case 47:
/* 1718 */         g(b(aqf.a));
/*      */         return;
/*      */       case 48:
/* 1721 */         g(b(aqf.b));
/*      */         return;
/*      */       case 49:
/* 1724 */         g(b(aqf.f));
/*      */         return;
/*      */       case 50:
/* 1727 */         g(b(aqf.e));
/*      */         return;
/*      */       case 51:
/* 1730 */         g(b(aqf.d));
/*      */         return;
/*      */       case 52:
/* 1733 */         g(b(aqf.c));
/*      */         return;
/*      */       case 54:
/* 1736 */         bxk.b(this);
/*      */         return;
/*      */       case 55:
/* 1739 */         o();
/*      */         return;
/*      */     } 
/* 1742 */     super.a(☃); }
/*      */ 
/*      */ 
/*      */   
/*      */   private void o() {
/* 1747 */     bmb ☃ = b(aqf.b);
/* 1748 */     a(aqf.b, b(aqf.a));
/* 1749 */     a(aqf.a, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void an() {
/* 1754 */     a(apk.m, 4.0F);
/*      */   }
/*      */   
/*      */   protected void dA() {
/* 1758 */     int ☃ = m();
/* 1759 */     if (this.ai) {
/* 1760 */       this.ak++;
/* 1761 */       if (this.ak >= ☃) {
/* 1762 */         this.ak = 0;
/* 1763 */         this.ai = false;
/*      */       } 
/*      */     } else {
/* 1766 */       this.ak = 0;
/*      */     } 
/*      */     
/* 1769 */     this.as = this.ak / ☃;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public arh a(arg ☃) {
/* 1774 */     return dB().a(☃);
/*      */   }
/*      */   
/*      */   public double b(arg ☃) {
/* 1778 */     return dB().c(☃);
/*      */   }
/*      */   
/*      */   public double c(arg ☃) {
/* 1782 */     return dB().d(☃);
/*      */   }
/*      */   
/*      */   public ari dB() {
/* 1786 */     return this.bk;
/*      */   }
/*      */   
/*      */   public aqq dC() {
/* 1790 */     return aqq.a;
/*      */   }
/*      */   
/*      */   public bmb dD() {
/* 1794 */     return b(aqf.a);
/*      */   }
/*      */   
/*      */   public bmb dE() {
/* 1798 */     return b(aqf.b);
/*      */   }
/*      */   
/*      */   public boolean a(blx ☃) {
/* 1802 */     return a(blx1 -> (blx1 == ☃));
/*      */   }
/*      */   
/*      */   public boolean a(Predicate<blx> ☃) {
/* 1806 */     return (☃.test(dD().b()) || ☃.test(dE().b()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public bmb b(aot ☃) {
/* 1813 */     if (☃ == aot.a)
/* 1814 */       return b(aqf.a); 
/* 1815 */     if (☃ == aot.b) {
/* 1816 */       return b(aqf.b);
/*      */     }
/* 1818 */     throw new IllegalArgumentException("Invalid hand " + ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aot ☃, bmb bmb1) {
/* 1823 */     if (☃ == aot.a) {
/* 1824 */       a(aqf.a, bmb1);
/* 1825 */     } else if (☃ == aot.b) {
/* 1826 */       a(aqf.b, bmb1);
/*      */     } else {
/* 1828 */       throw new IllegalArgumentException("Invalid hand " + ☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean a(aqf ☃) {
/* 1833 */     return !b(☃).a();
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
/*      */   public float dF() {
/* 1845 */     Iterable<bmb> ☃ = bo();
/*      */     
/* 1847 */     int i = 0;
/* 1848 */     int j = 0;
/* 1849 */     for (bmb bmb1 : ☃) {
/* 1850 */       if (!bmb1.a()) {
/* 1851 */         j++;
/*      */       }
/* 1853 */       i++;
/*      */     } 
/* 1855 */     return (i > 0) ? (j / i) : 0.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void g(boolean ☃) {
/* 1860 */     super.g(☃);
/*      */     
/* 1862 */     arh arh = a(arl.d);
/* 1863 */     if (arh.a(b) != null) {
/* 1864 */       arh.d(d);
/*      */     }
/* 1866 */     if (☃) {
/* 1867 */       arh.b(d);
/*      */     }
/*      */   }
/*      */   
/*      */   protected float dG() {
/* 1872 */     return 1.0F;
/*      */   }
/*      */   
/*      */   protected float dH() {
/* 1876 */     if (w_()) {
/* 1877 */       return (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.5F;
/*      */     }
/* 1879 */     return (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F;
/*      */   }
/*      */   
/*      */   protected boolean dI() {
/* 1883 */     return dl();
/*      */   }
/*      */ 
/*      */   
/*      */   public void i(aqa ☃) {
/* 1888 */     if (!em()) {
/* 1889 */       super.i(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(aqa ☃) {
/*      */     dcn dcn;
/* 1895 */     if (☃.y || this.l.d_(☃.cB()).b().a(aed.am)) {
/* 1896 */       dcn = new dcn(☃.cD(), ☃.cE() + ☃.cz(), ☃.cH());
/*      */     } else {
/* 1898 */       dcn = ☃.b(this);
/*      */     } 
/*      */     
/* 1901 */     a(dcn.b, dcn.c, dcn.d);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bY() {
/* 1906 */     return bX();
/*      */   }
/*      */   
/*      */   protected float dJ() {
/* 1910 */     return 0.42F * aq();
/*      */   }
/*      */   
/*      */   protected void dK() {
/* 1914 */     float ☃ = dJ();
/*      */     
/* 1916 */     if (a(apw.h)) {
/* 1917 */       ☃ += 0.1F * (b(apw.h).c() + 1);
/*      */     }
/*      */     
/* 1920 */     dcn dcn = cC();
/* 1921 */     n(dcn.b, ☃, dcn.d);
/*      */     
/* 1923 */     if (bA()) {
/* 1924 */       float f = this.p * 0.017453292F;
/*      */       
/* 1926 */       f(cC().b((
/* 1927 */             -afm.a(f) * 0.2F), 0.0D, (
/*      */             
/* 1929 */             afm.b(f) * 0.2F)));
/*      */     } 
/*      */     
/* 1932 */     this.Z = true;
/*      */   }
/*      */   
/*      */   protected void dL() {
/* 1936 */     f(cC().b(0.0D, -0.03999999910593033D, 0.0D));
/*      */   }
/*      */   
/*      */   protected void c(ael<cuw> ☃) {
/* 1940 */     f(cC().b(0.0D, 0.03999999910593033D, 0.0D));
/*      */   }
/*      */   
/*      */   protected float dM() {
/* 1944 */     return 0.8F;
/*      */   }
/*      */   
/*      */   public boolean a(cuw ☃) {
/* 1948 */     return false;
/*      */   }
/*      */   
/*      */   public void g(dcn ☃) {
/* 1952 */     if (dS() || cs()) {
/* 1953 */       double d = 0.08D;
/* 1954 */       boolean bool = ((cC()).c <= 0.0D);
/* 1955 */       if (bool && a(apw.B)) {
/* 1956 */         d = 0.01D;
/* 1957 */         this.C = 0.0F;
/*      */       } 
/*      */       
/* 1960 */       cux cux = this.l.b(cB());
/*      */       
/* 1962 */       if (aE() && cT() && !a(cux.a())) {
/* 1963 */         double d1 = cE();
/*      */         
/* 1965 */         float f1 = bA() ? 0.9F : dM();
/* 1966 */         float f2 = 0.02F;
/*      */         
/* 1968 */         float f3 = bpu.e(this);
/* 1969 */         if (f3 > 3.0F) {
/* 1970 */           f3 = 3.0F;
/*      */         }
/* 1972 */         if (!this.t) {
/* 1973 */           f3 *= 0.5F;
/*      */         }
/* 1975 */         if (f3 > 0.0F) {
/*      */           
/* 1977 */           f1 += (0.54600006F - f1) * f3 / 3.0F;
/*      */           
/* 1979 */           f2 += (dN() - f2) * f3 / 3.0F;
/*      */         } 
/*      */         
/* 1982 */         if (a(apw.D)) {
/* 1983 */           f1 = 0.96F;
/*      */         }
/*      */         
/* 1986 */         a(f2, ☃);
/* 1987 */         a(aqr.a, cC());
/*      */         
/* 1989 */         dcn dcn1 = cC();
/* 1990 */         if (this.u && c_()) {
/* 1991 */           dcn1 = new dcn(dcn1.b, 0.2D, dcn1.d);
/*      */         }
/*      */         
/* 1994 */         f(dcn1.d(f1, 0.800000011920929D, f1));
/* 1995 */         dcn dcn2 = a(d, bool, cC());
/* 1996 */         f(dcn2);
/*      */         
/* 1998 */         if (this.u && e(dcn2.b, dcn2.c + 0.6000000238418579D - cE() + d1, dcn2.d)) {
/* 1999 */           n(dcn2.b, 0.30000001192092896D, dcn2.d);
/*      */         }
/* 2001 */       } else if (aQ() && cT() && !a(cux.a())) {
/* 2002 */         double d1 = cE();
/* 2003 */         a(0.02F, ☃);
/* 2004 */         a(aqr.a, cC());
/*      */ 
/*      */ 
/*      */         
/* 2008 */         if (b(aef.c) <= cx()) {
/* 2009 */           f(cC().d(0.5D, 0.800000011920929D, 0.5D));
/* 2010 */           dcn dcn2 = a(d, bool, cC());
/* 2011 */           f(dcn2);
/*      */         } else {
/* 2013 */           f(cC().a(0.5D));
/*      */         } 
/*      */         
/* 2016 */         if (!aB()) {
/* 2017 */           f(cC().b(0.0D, -d / 4.0D, 0.0D));
/*      */         }
/*      */         
/* 2020 */         dcn dcn1 = cC();
/* 2021 */         if (this.u && e(dcn1.b, dcn1.c + 0.6000000238418579D - cE() + d1, dcn1.d)) {
/* 2022 */           n(dcn1.b, 0.30000001192092896D, dcn1.d);
/*      */         }
/* 2024 */       } else if (ef()) {
/*      */         
/* 2026 */         dcn dcn1 = cC();
/* 2027 */         if (dcn1.c > -0.5D) {
/* 2028 */           this.C = 1.0F;
/*      */         }
/*      */         
/* 2031 */         dcn dcn2 = bh();
/* 2032 */         float f1 = this.q * 0.017453292F;
/* 2033 */         double d1 = Math.sqrt(dcn2.b * dcn2.b + dcn2.d * dcn2.d);
/* 2034 */         double d2 = Math.sqrt(c(dcn1));
/* 2035 */         double d3 = dcn2.f();
/*      */ 
/*      */         
/* 2038 */         float f2 = afm.b(f1);
/* 2039 */         f2 = (float)(f2 * f2 * Math.min(1.0D, d3 / 0.4D));
/* 2040 */         dcn1 = cC().b(0.0D, d * (-1.0D + f2 * 0.75D), 0.0D);
/*      */ 
/*      */         
/* 2043 */         if (dcn1.c < 0.0D && d1 > 0.0D) {
/* 2044 */           double d4 = dcn1.c * -0.1D * f2;
/* 2045 */           dcn1 = dcn1.b(dcn2.b * d4 / d1, d4, dcn2.d * d4 / d1);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2052 */         if (f1 < 0.0F && d1 > 0.0D) {
/* 2053 */           double d4 = d2 * -afm.a(f1) * 0.04D;
/*      */           
/* 2055 */           dcn1 = dcn1.b(-dcn2.b * d4 / d1, d4 * 3.2D, -dcn2.d * d4 / d1);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2063 */         if (d1 > 0.0D) {
/* 2064 */           dcn1 = dcn1.b((dcn2.b / d1 * d2 - dcn1.b) * 0.1D, 0.0D, (dcn2.d / d1 * d2 - dcn1.d) * 0.1D);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2071 */         f(dcn1.d(0.9900000095367432D, 0.9800000190734863D, 0.9900000095367432D));
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2076 */         a(aqr.a, cC());
/*      */         
/* 2078 */         if (this.u && !this.l.v) {
/* 2079 */           double d4 = Math.sqrt(c(cC()));
/* 2080 */           double d5 = d2 - d4;
/* 2081 */           float f = (float)(d5 * 10.0D - 3.0D);
/*      */           
/* 2083 */           if (f > 0.0F) {
/* 2084 */             a(o((int)f), 1.0F, 1.0F);
/* 2085 */             a(apk.l, f);
/*      */           } 
/*      */         } 
/*      */         
/* 2089 */         if (this.t && !this.l.v) {
/* 2090 */           b(7, false);
/*      */         }
/*      */       } else {
/* 2093 */         fx fx1 = as();
/*      */         
/* 2095 */         float f1 = this.l.d_(fx1).b().j();
/* 2096 */         float f2 = this.t ? (f1 * 0.91F) : 0.91F;
/*      */         
/* 2098 */         dcn dcn1 = a(☃, f1);
/*      */         
/* 2100 */         double d1 = dcn1.c;
/* 2101 */         if (a(apw.y)) {
/* 2102 */           d1 += (0.05D * (b(apw.y).c() + 1) - dcn1.c) * 0.2D;
/* 2103 */           this.C = 0.0F;
/*      */         }
/* 2105 */         else if (!this.l.v || this.l.C(fx1)) {
/* 2106 */           if (!aB()) {
/* 2107 */             d1 -= d;
/*      */           }
/* 2109 */         } else if (cE() > 0.0D) {
/* 2110 */           d1 = -0.1D;
/*      */         } else {
/* 2112 */           d1 = 0.0D;
/*      */         } 
/*      */ 
/*      */         
/* 2116 */         n(dcn1.b * f2, d1 * 0.9800000190734863D, dcn1.d * f2);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2123 */     a(this, this instanceof bag);
/*      */   }
/*      */   
/*      */   public void a(aqm ☃, boolean bool) {
/* 2127 */     ☃.au = ☃.av;
/* 2128 */     double d1 = ☃.cD() - ☃.m;
/* 2129 */     double d2 = bool ? (☃.cE() - ☃.n) : 0.0D;
/* 2130 */     double d3 = ☃.cH() - ☃.o;
/* 2131 */     float f = afm.a(d1 * d1 + d2 * d2 + d3 * d3) * 4.0F;
/*      */     
/* 2133 */     if (f > 1.0F) {
/* 2134 */       f = 1.0F;
/*      */     }
/*      */     
/* 2137 */     ☃.av += (f - ☃.av) * 0.4F;
/* 2138 */     ☃.aw += ☃.av;
/*      */   }
/*      */   
/*      */   public dcn a(dcn ☃, float f) {
/* 2142 */     a(t(f), ☃);
/*      */     
/* 2144 */     f(i(cC()));
/* 2145 */     a(aqr.a, cC());
/*      */     
/* 2147 */     dcn dcn1 = cC();
/* 2148 */     if ((this.u || this.aQ) && c_()) {
/* 2149 */       dcn1 = new dcn(dcn1.b, 0.2D, dcn1.d);
/*      */     }
/* 2151 */     return dcn1;
/*      */   }
/*      */   
/*      */   public dcn a(double ☃, boolean bool, dcn dcn1) {
/* 2155 */     if (!aB() && !bA()) {
/*      */       double d;
/* 2157 */       if (bool && Math.abs(dcn1.c - 0.005D) >= 0.003D && Math.abs(dcn1.c - ☃ / 16.0D) < 0.003D) {
/*      */         
/* 2159 */         d = -0.003D;
/*      */       } else {
/* 2161 */         d = dcn1.c - ☃ / 16.0D;
/*      */       } 
/* 2163 */       return new dcn(dcn1.b, d, dcn1.d);
/*      */     } 
/* 2165 */     return dcn1;
/*      */   }
/*      */   
/*      */   private dcn i(dcn ☃) {
/* 2169 */     if (c_()) {
/* 2170 */       this.C = 0.0F;
/*      */       
/* 2172 */       float f = 0.15F;
/* 2173 */       double d1 = afm.a(☃.b, -0.15000000596046448D, 0.15000000596046448D);
/* 2174 */       double d2 = afm.a(☃.d, -0.15000000596046448D, 0.15000000596046448D);
/*      */       
/* 2176 */       double d3 = Math.max(☃.c, -0.15000000596046448D);
/* 2177 */       if (d3 < 0.0D && !ds().a(bup.lQ) && ee() && this instanceof bfw) {
/* 2178 */         d3 = 0.0D;
/*      */       }
/*      */       
/* 2181 */       ☃ = new dcn(d1, d3, d2);
/*      */     } 
/* 2183 */     return ☃;
/*      */   }
/*      */   
/*      */   private float t(float ☃) {
/* 2187 */     if (this.t) {
/* 2188 */       return dN() * 0.21600002F / ☃ * ☃ * ☃;
/*      */     }
/* 2190 */     return this.aE;
/*      */   }
/*      */ 
/*      */   
/*      */   public float dN() {
/* 2195 */     return this.bu;
/*      */   }
/*      */   
/*      */   public void q(float ☃) {
/* 2199 */     this.bu = ☃;
/*      */   }
/*      */   
/*      */   public boolean B(aqa ☃) {
/* 2203 */     z(☃);
/* 2204 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {
/* 2209 */     super.j();
/* 2210 */     t();
/* 2211 */     v();
/*      */     
/* 2213 */     if (!this.l.v) {
/* 2214 */       int i = dy();
/* 2215 */       if (i > 0) {
/* 2216 */         if (this.al <= 0) {
/* 2217 */           this.al = 20 * (30 - i);
/*      */         }
/* 2219 */         this.al--;
/* 2220 */         if (this.al <= 0) {
/* 2221 */           p(i - 1);
/*      */         }
/*      */       } 
/*      */       
/* 2225 */       int j = dz();
/* 2226 */       if (j > 0) {
/* 2227 */         if (this.am <= 0) {
/* 2228 */           this.am = 20 * (30 - j);
/*      */         }
/* 2230 */         this.am--;
/* 2231 */         if (this.am <= 0) {
/* 2232 */           q(j - 1);
/*      */         }
/*      */       } 
/*      */       
/* 2236 */       p();
/*      */       
/* 2238 */       if (this.K % 20 == 0) {
/* 2239 */         dv().g();
/*      */       }
/*      */       
/* 2242 */       if (!this.af) {
/* 2243 */         boolean bool = a(apw.x);
/* 2244 */         if (i(6) != bool) {
/* 2245 */           b(6, bool);
/*      */         }
/*      */       } 
/*      */       
/* 2249 */       if (em() && !x()) {
/* 2250 */         en();
/*      */       }
/*      */     } 
/*      */     
/* 2254 */     k();
/*      */     
/* 2256 */     double ☃ = cD() - this.m;
/* 2257 */     double d1 = cH() - this.o;
/*      */     
/* 2259 */     float f1 = (float)(☃ * ☃ + d1 * d1);
/*      */     
/* 2261 */     float f2 = this.aA;
/*      */     
/* 2263 */     float f3 = 0.0F;
/* 2264 */     this.aJ = this.aK;
/* 2265 */     float f4 = 0.0F;
/* 2266 */     if (f1 > 0.0025000002F) {
/* 2267 */       f4 = 1.0F;
/* 2268 */       f3 = (float)Math.sqrt(f1) * 3.0F;
/*      */       
/* 2270 */       float f5 = (float)afm.d(d1, ☃) * 57.295776F - 90.0F;
/* 2271 */       float f6 = afm.e(afm.g(this.p) - f5);
/* 2272 */       if (95.0F < f6 && f6 < 265.0F) {
/* 2273 */         f2 = f5 - 180.0F;
/*      */       } else {
/* 2275 */         f2 = f5;
/*      */       } 
/*      */     } 
/* 2278 */     if (this.as > 0.0F) {
/* 2279 */       f2 = this.p;
/*      */     }
/* 2281 */     if (!this.t) {
/* 2282 */       f4 = 0.0F;
/*      */     }
/* 2284 */     this.aK += (f4 - this.aK) * 0.3F;
/*      */     
/* 2286 */     this.l.Z().a("headTurn");
/*      */     
/* 2288 */     f3 = f(f2, f3);
/*      */     
/* 2290 */     this.l.Z().c();
/*      */     
/* 2292 */     this.l.Z().a("rangeChecks");
/* 2293 */     while (this.p - this.r < -180.0F) {
/* 2294 */       this.r -= 360.0F;
/*      */     }
/* 2296 */     while (this.p - this.r >= 180.0F) {
/* 2297 */       this.r += 360.0F;
/*      */     }
/*      */     
/* 2300 */     while (this.aA - this.aB < -180.0F) {
/* 2301 */       this.aB -= 360.0F;
/*      */     }
/* 2303 */     while (this.aA - this.aB >= 180.0F) {
/* 2304 */       this.aB += 360.0F;
/*      */     }
/*      */     
/* 2307 */     while (this.q - this.s < -180.0F) {
/* 2308 */       this.s -= 360.0F;
/*      */     }
/* 2310 */     while (this.q - this.s >= 180.0F) {
/* 2311 */       this.s += 360.0F;
/*      */     }
/*      */     
/* 2314 */     while (this.aC - this.aD < -180.0F) {
/* 2315 */       this.aD -= 360.0F;
/*      */     }
/* 2317 */     while (this.aC - this.aD >= 180.0F) {
/* 2318 */       this.aD += 360.0F;
/*      */     }
/* 2320 */     this.l.Z().c();
/*      */     
/* 2322 */     this.aL += f3;
/*      */     
/* 2324 */     if (ef()) {
/* 2325 */       this.be++;
/*      */     } else {
/* 2327 */       this.be = 0;
/*      */     } 
/*      */     
/* 2330 */     if (em()) {
/* 2331 */       this.q = 0.0F;
/*      */     }
/*      */   }
/*      */   
/*      */   private void p() {
/* 2336 */     Map<aqf, bmb> ☃ = q();
/*      */     
/* 2338 */     if (☃ != null) {
/* 2339 */       a(☃);
/*      */       
/* 2341 */       if (!☃.isEmpty()) {
/* 2342 */         b(☃);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private Map<aqf, bmb> q() {
/* 2349 */     Map<aqf, bmb> ☃ = null; aqf[] arrayOfAqf; int i; byte b;
/* 2350 */     for (arrayOfAqf = aqf.values(), i = arrayOfAqf.length, b = 0; b < i; ) { bmb bmb1; aqf aqf = arrayOfAqf[b];
/*      */       
/* 2352 */       switch (null.a[aqf.a().ordinal()]) {
/*      */         case 1:
/* 2354 */           bmb1 = e(aqf);
/*      */           break;
/*      */         case 2:
/* 2357 */           bmb1 = d(aqf); break;
/*      */         default:
/*      */           b++;
/*      */           continue;
/*      */       } 
/* 2362 */       bmb bmb2 = b(aqf);
/*      */       
/* 2364 */       if (!bmb.b(bmb2, bmb1)) {
/* 2365 */         if (☃ == null) {
/* 2366 */           ☃ = Maps.newEnumMap(aqf.class);
/*      */         }
/* 2368 */         ☃.put(aqf, bmb2);
/*      */         
/* 2370 */         if (!bmb1.a()) {
/* 2371 */           dB().a(bmb1.a(aqf));
/*      */         }
/* 2373 */         if (!bmb2.a()) {
/* 2374 */           dB().b(bmb2.a(aqf));
/*      */         }
/*      */       }  }
/*      */     
/* 2378 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   private void a(Map<aqf, bmb> ☃) {
/* 2383 */     bmb bmb1 = ☃.get(aqf.a);
/* 2384 */     bmb bmb2 = ☃.get(aqf.b);
/*      */     
/* 2386 */     if (bmb1 != null && bmb2 != null && 
/* 2387 */       bmb.b(bmb1, e(aqf.b)) && 
/* 2388 */       bmb.b(bmb2, e(aqf.a))) {
/* 2389 */       ((aag)this.l).i().b(this, new pn(this, (byte)55));
/* 2390 */       ☃.remove(aqf.a);
/* 2391 */       ☃.remove(aqf.b);
/* 2392 */       c(aqf.a, bmb1.i());
/* 2393 */       c(aqf.b, bmb2.i());
/*      */     } 
/*      */   }
/*      */   
/*      */   private void b(Map<aqf, bmb> ☃) {
/* 2398 */     List<Pair<aqf, bmb>> list = Lists.newArrayListWithCapacity(☃.size());
/* 2399 */     ☃.forEach((aqf1, bmb1) -> {
/*      */           bmb bmb2 = bmb1.i();
/*      */           ☃.add(Pair.of(aqf1, bmb2));
/*      */           switch (null.a[aqf1.a().ordinal()]) {
/*      */             case 1:
/*      */               c(aqf1, bmb2);
/*      */               break;
/*      */             
/*      */             case 2:
/*      */               b(aqf1, bmb2);
/*      */               break;
/*      */           } 
/*      */         });
/* 2412 */     ((aag)this.l).i().b(this, new rd(Y(), list));
/*      */   }
/*      */   
/*      */   private bmb d(aqf ☃) {
/* 2416 */     return this.bo.get(☃.b());
/*      */   }
/*      */   
/*      */   private void b(aqf ☃, bmb bmb1) {
/* 2420 */     this.bo.set(☃.b(), bmb1);
/*      */   }
/*      */   
/*      */   private bmb e(aqf ☃) {
/* 2424 */     return this.bn.get(☃.b());
/*      */   }
/*      */   
/*      */   private void c(aqf ☃, bmb bmb1) {
/* 2428 */     this.bn.set(☃.b(), bmb1);
/*      */   }
/*      */   
/*      */   protected float f(float ☃, float f1) {
/* 2432 */     float f2 = afm.g(☃ - this.aA);
/* 2433 */     this.aA += f2 * 0.3F;
/*      */     
/* 2435 */     float f3 = afm.g(this.p - this.aA);
/* 2436 */     boolean bool = (f3 < -90.0F || f3 >= 90.0F);
/* 2437 */     if (f3 < -75.0F) {
/* 2438 */       f3 = -75.0F;
/*      */     }
/* 2440 */     if (f3 >= 75.0F) {
/* 2441 */       f3 = 75.0F;
/*      */     }
/* 2443 */     this.aA = this.p - f3;
/* 2444 */     if (f3 * f3 > 2500.0F) {
/* 2445 */       this.aA += f3 * 0.2F;
/*      */     }
/*      */     
/* 2448 */     if (bool) {
/* 2449 */       f1 *= -1.0F;
/*      */     }
/*      */     
/* 2452 */     return f1;
/*      */   }
/*      */   
/*      */   public void k() {
/* 2456 */     if (this.bv > 0) {
/* 2457 */       this.bv--;
/*      */     }
/* 2459 */     if (cs()) {
/* 2460 */       this.aU = 0;
/* 2461 */       c(cD(), cE(), cH());
/*      */     } 
/* 2463 */     if (this.aU > 0) {
/* 2464 */       double d4 = cD() + (this.aV - cD()) / this.aU;
/* 2465 */       double d5 = cE() + (this.aW - cE()) / this.aU;
/* 2466 */       double d6 = cH() + (this.aX - cH()) / this.aU;
/*      */       
/* 2468 */       double d7 = afm.g(this.aY - this.p);
/*      */       
/* 2470 */       this.p = (float)(this.p + d7 / this.aU);
/* 2471 */       this.q = (float)(this.q + (this.aZ - this.q) / this.aU);
/*      */       
/* 2473 */       this.aU--;
/* 2474 */       d(d4, d5, d6);
/* 2475 */       a(this.p, this.q);
/* 2476 */     } else if (!dS()) {
/*      */       
/* 2478 */       f(cC().a(0.98D));
/*      */     } 
/* 2480 */     if (this.bb > 0) {
/* 2481 */       this.aC = (float)(this.aC + afm.g(this.ba - this.aC) / this.bb);
/* 2482 */       this.bb--;
/*      */     } 
/*      */     
/* 2485 */     dcn ☃ = cC();
/* 2486 */     double d1 = ☃.b;
/* 2487 */     double d2 = ☃.c;
/* 2488 */     double d3 = ☃.d;
/* 2489 */     if (Math.abs(☃.b) < 0.003D) {
/* 2490 */       d1 = 0.0D;
/*      */     }
/* 2492 */     if (Math.abs(☃.c) < 0.003D) {
/* 2493 */       d2 = 0.0D;
/*      */     }
/* 2495 */     if (Math.abs(☃.d) < 0.003D) {
/* 2496 */       d3 = 0.0D;
/*      */     }
/* 2498 */     n(d1, d2, d3);
/*      */     
/* 2500 */     this.l.Z().a("ai");
/* 2501 */     if (dI()) {
/* 2502 */       this.aQ = false;
/* 2503 */       this.aR = 0.0F;
/* 2504 */       this.aT = 0.0F;
/*      */     }
/* 2506 */     else if (dS()) {
/* 2507 */       this.l.Z().a("newAi");
/* 2508 */       dP();
/* 2509 */       this.l.Z().c();
/*      */     } 
/*      */     
/* 2512 */     this.l.Z().c();
/*      */     
/* 2514 */     this.l.Z().a("jump");
/* 2515 */     if (this.aQ && cT()) {
/*      */       double d4;
/*      */ 
/*      */       
/* 2519 */       if (aQ()) {
/* 2520 */         d4 = b(aef.c);
/*      */       } else {
/* 2522 */         d4 = b(aef.b);
/*      */       } 
/* 2524 */       boolean bool = (aE() && d4 > 0.0D);
/* 2525 */       double d5 = cx();
/* 2526 */       if (bool && (!this.t || d4 > d5)) {
/* 2527 */         c(aef.b);
/* 2528 */       } else if (aQ() && (!this.t || d4 > d5)) {
/* 2529 */         c(aef.c);
/* 2530 */       } else if ((this.t || (bool && d4 <= d5)) && 
/* 2531 */         this.bv == 0) {
/* 2532 */         dK();
/* 2533 */         this.bv = 10;
/*      */       } 
/*      */     } else {
/*      */       
/* 2537 */       this.bv = 0;
/*      */     } 
/* 2539 */     this.l.Z().c();
/*      */     
/* 2541 */     this.l.Z().a("travel");
/* 2542 */     this.aR *= 0.98F;
/* 2543 */     this.aT *= 0.98F;
/*      */     
/* 2545 */     r();
/* 2546 */     dci dci = cc();
/* 2547 */     g(new dcn(this.aR, this.aS, this.aT));
/* 2548 */     this.l.Z().c();
/*      */     
/* 2550 */     this.l.Z().a("push");
/* 2551 */     if (this.bf > 0) {
/* 2552 */       this.bf--;
/* 2553 */       a(dci, cc());
/*      */     } 
/* 2555 */     dQ();
/* 2556 */     this.l.Z().c();
/*      */ 
/*      */     
/* 2559 */     if (!this.l.v && dO() && aG()) {
/* 2560 */       a(apk.h, 1.0F);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dO() {
/* 2568 */     return false;
/*      */   }
/*      */   
/*      */   private void r() {
/* 2572 */     boolean ☃ = i(7);
/* 2573 */     if (☃ && !this.t && !br() && !a(apw.y)) {
/* 2574 */       bmb bmb1 = b(aqf.e);
/* 2575 */       if (bmb1.b() == bmd.qo && bld.d(bmb1)) {
/* 2576 */         ☃ = true;
/* 2577 */         if (!this.l.v && (this.be + 1) % 20 == 0)
/*      */         {
/* 2579 */           bmb1.a(1, this, ☃ -> ☃.c(aqf.e));
/*      */         }
/*      */       } else {
/* 2582 */         ☃ = false;
/*      */       } 
/*      */     } else {
/* 2585 */       ☃ = false;
/*      */     } 
/* 2587 */     if (!this.l.v) {
/* 2588 */       b(7, ☃);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected void dP() {}
/*      */   
/*      */   protected void dQ() {
/* 2596 */     List<aqa> ☃ = this.l.a(this, cc(), aqd.a(this));
/*      */     
/* 2598 */     if (!☃.isEmpty()) {
/* 2599 */       int i = this.l.V().c(brt.s);
/* 2600 */       if (i > 0 && ☃.size() > i - 1 && this.J.nextInt(4) == 0) {
/* 2601 */         int k = 0;
/* 2602 */         for (int m = 0; m < ☃.size(); m++) {
/* 2603 */           if (!((aqa)☃.get(m)).br()) {
/* 2604 */             k++;
/*      */           }
/*      */         } 
/* 2607 */         if (k > i - 1) {
/* 2608 */           a(apk.g, 6.0F);
/*      */         }
/*      */       } 
/* 2611 */       for (int j = 0; j < ☃.size(); j++) {
/* 2612 */         aqa aqa1 = ☃.get(j);
/* 2613 */         C(aqa1);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void a(dci ☃, dci dci1) {
/* 2619 */     dci dci2 = ☃.b(dci1);
/* 2620 */     List<aqa> list = this.l.a(this, dci2);
/* 2621 */     if (!list.isEmpty()) {
/* 2622 */       for (int i = 0; i < list.size(); i++) {
/* 2623 */         aqa aqa1 = list.get(i);
/* 2624 */         if (aqa1 instanceof aqm) {
/* 2625 */           g((aqm)aqa1);
/* 2626 */           this.bf = 0;
/* 2627 */           f(cC().a(-0.2D));
/*      */           break;
/*      */         } 
/*      */       } 
/* 2631 */     } else if (this.u) {
/* 2632 */       this.bf = 0;
/*      */     } 
/* 2634 */     if (!this.l.v && this.bf <= 0) {
/* 2635 */       c(4, false);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void C(aqa ☃) {
/* 2640 */     ☃.i(this);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void g(aqm ☃) {}
/*      */   
/*      */   public void r(int ☃) {
/* 2647 */     this.bf = ☃;
/* 2648 */     if (!this.l.v) {
/* 2649 */       c(4, true);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean dR() {
/* 2654 */     return ((((Byte)this.R.<Byte>a(ag)).byteValue() & 0x4) != 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public void l() {
/* 2659 */     aqa ☃ = ct();
/* 2660 */     super.l();
/* 2661 */     if (☃ != null && ☃ != ct() && !this.l.v) {
/* 2662 */       a(☃);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void ba() {
/* 2668 */     super.ba();
/* 2669 */     this.aJ = this.aK;
/* 2670 */     this.aK = 0.0F;
/* 2671 */     this.C = 0.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(double ☃, double d1, double d2, float f1, float f2, int i, boolean bool) {
/* 2676 */     this.aV = ☃;
/* 2677 */     this.aW = d1;
/* 2678 */     this.aX = d2;
/* 2679 */     this.aY = f1;
/* 2680 */     this.aZ = f2;
/*      */     
/* 2682 */     this.aU = i;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(float ☃, int i) {
/* 2687 */     this.ba = ☃;
/*      */     
/* 2689 */     this.bb = i;
/*      */   }
/*      */   
/*      */   public void o(boolean ☃) {
/* 2693 */     this.aQ = ☃;
/*      */   }
/*      */   
/*      */   public void a(bcv ☃) {
/* 2697 */     bfw bfw1 = (☃.i() != null) ? this.l.b(☃.i()) : null;
/* 2698 */     if (bfw1 instanceof aah) {
/* 2699 */       ac.O.a((aah)bfw1, ☃.g(), this);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(aqa ☃, int i) {
/* 2704 */     if (!☃.y && !this.l.v && (
/* 2705 */       ☃ instanceof bcv || ☃ instanceof bga || ☃ instanceof aqg)) {
/* 2706 */       ((aag)this.l).i().b(☃, new rr(☃.Y(), Y(), i));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean D(aqa ☃) {
/* 2715 */     dcn dcn1 = new dcn(cD(), cG(), cH());
/* 2716 */     dcn dcn2 = new dcn(☃.cD(), ☃.cG(), ☃.cH());
/* 2717 */     return (this.l.a(new brf(dcn1, dcn2, brf.a.a, brf.b.a, this)).c() == dcl.a.a);
/*      */   }
/*      */ 
/*      */   
/*      */   public float h(float ☃) {
/* 2722 */     if (☃ == 1.0F) {
/* 2723 */       return this.aC;
/*      */     }
/* 2725 */     return afm.g(☃, this.aD, this.aC);
/*      */   }
/*      */   
/*      */   public float r(float ☃) {
/* 2729 */     float f = this.as - this.ar;
/* 2730 */     if (f < 0.0F) {
/* 2731 */       f++;
/*      */     }
/* 2733 */     return this.ar + f * ☃;
/*      */   }
/*      */   
/*      */   public boolean dS() {
/* 2737 */     return !this.l.v;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aT() {
/* 2742 */     return !this.y;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aU() {
/* 2747 */     return (aX() && !a_() && !c_());
/*      */   }
/*      */ 
/*      */   
/*      */   protected void aS() {
/* 2752 */     this.w = (this.J.nextDouble() >= b(arl.c));
/*      */   }
/*      */ 
/*      */   
/*      */   public float bK() {
/* 2757 */     return this.aC;
/*      */   }
/*      */ 
/*      */   
/*      */   public void m(float ☃) {
/* 2762 */     this.aC = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void n(float ☃) {
/* 2767 */     this.aA = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   protected dcn a(gc.a ☃, i.a a1) {
/* 2772 */     return h(super.a(☃, a1));
/*      */   }
/*      */ 
/*      */   
/*      */   public static dcn h(dcn ☃) {
/* 2777 */     return new dcn(☃.b, ☃.c, 0.0D);
/*      */   }
/*      */   
/*      */   public float dT() {
/* 2781 */     return this.bw;
/*      */   }
/*      */   
/*      */   public void s(float ☃) {
/* 2785 */     if (☃ < 0.0F) {
/* 2786 */       ☃ = 0.0F;
/*      */     }
/* 2788 */     this.bw = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void g() {}
/*      */ 
/*      */   
/*      */   public void h() {}
/*      */   
/*      */   protected void dU() {
/* 2798 */     this.bp = true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean dW() {
/* 2804 */     return ((((Byte)this.R.<Byte>a(ag)).byteValue() & 0x1) > 0);
/*      */   }
/*      */   
/*      */   public aot dX() {
/* 2808 */     return ((((Byte)this.R.<Byte>a(ag)).byteValue() & 0x2) > 0) ? aot.b : aot.a;
/*      */   }
/*      */   
/*      */   private void t() {
/* 2812 */     if (dW())
/*      */     {
/* 2814 */       if (bmb.d(b(dX()), this.bc)) {
/* 2815 */         this.bc = b(dX());
/* 2816 */         this.bc.b(this.l, this, dZ());
/* 2817 */         if (u()) {
/* 2818 */           b(this.bc, 5);
/*      */         }
/* 2820 */         if (--this.bd == 0 && !this.l.v && !this.bc.m()) {
/* 2821 */           s();
/*      */         }
/*      */       } else {
/* 2824 */         ec();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   private boolean u() {
/* 2830 */     int ☃ = dZ();
/* 2831 */     bhz bhz = this.bc.b().t();
/* 2832 */     boolean bool = (bhz != null && bhz.e());
/* 2833 */     int i = bool | ((☃ <= this.bc.k() - 7) ? 1 : 0);
/*      */     
/* 2835 */     return (i != 0 && ☃ % 4 == 0);
/*      */   }
/*      */   
/*      */   private void v() {
/* 2839 */     this.bC = this.bB;
/* 2840 */     if (bC()) {
/* 2841 */       this.bB = Math.min(1.0F, this.bB + 0.09F);
/*      */     } else {
/* 2843 */       this.bB = Math.max(0.0F, this.bB - 0.09F);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void c(int ☃, boolean bool) {
/* 2848 */     int i = ((Byte)this.R.<Byte>a(ag)).byteValue();
/* 2849 */     if (bool) {
/* 2850 */       i |= ☃;
/*      */     } else {
/* 2852 */       i &= ☃ ^ 0xFFFFFFFF;
/*      */     } 
/* 2854 */     this.R.b(ag, Byte.valueOf((byte)i));
/*      */   }
/*      */   
/*      */   public void c(aot ☃) {
/* 2858 */     bmb bmb1 = b(☃);
/* 2859 */     if (bmb1.a() || dW()) {
/*      */       return;
/*      */     }
/*      */     
/* 2863 */     this.bc = bmb1;
/* 2864 */     this.bd = bmb1.k();
/*      */     
/* 2866 */     if (!this.l.v) {
/* 2867 */       c(1, true);
/* 2868 */       c(2, (☃ == aot.b));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(us<?> ☃) {
/* 2874 */     super.a(☃);
/*      */     
/* 2876 */     if (bj.equals(☃)) {
/* 2877 */       if (this.l.v)
/*      */       {
/* 2879 */         ek().ifPresent(this::a);
/*      */       }
/* 2881 */     } else if (ag.equals(☃) && this.l.v) {
/* 2882 */       if (dW() && this.bc.a()) {
/* 2883 */         this.bc = b(dX());
/* 2884 */         if (!this.bc.a()) {
/* 2885 */           this.bd = this.bc.k();
/*      */         }
/* 2887 */       } else if (!dW() && !this.bc.a()) {
/* 2888 */         this.bc = bmb.b;
/* 2889 */         this.bd = 0;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(dj.a ☃, dcn dcn1) {
/* 2896 */     super.a(☃, dcn1);
/* 2897 */     this.aD = this.aC;
/* 2898 */     this.aA = this.aC;
/* 2899 */     this.aB = this.aA;
/*      */   }
/*      */   
/*      */   protected void b(bmb ☃, int i) {
/* 2903 */     if (☃.a() || !dW()) {
/*      */       return;
/*      */     }
/*      */     
/* 2907 */     if (☃.l() == bnn.c) {
/* 2908 */       a(c(☃), 0.5F, this.l.t.nextFloat() * 0.1F + 0.9F);
/*      */     }
/*      */     
/* 2911 */     if (☃.l() == bnn.b) {
/* 2912 */       a(☃, i);
/* 2913 */       a(d(☃), 0.5F + 0.5F * this.J.nextInt(2), (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void a(bmb ☃, int i) {
/* 2918 */     for (int j = 0; j < i; j++) {
/* 2919 */       dcn dcn1 = new dcn((this.J.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
/* 2920 */       dcn1 = dcn1.a(-this.q * 0.017453292F);
/* 2921 */       dcn1 = dcn1.b(-this.p * 0.017453292F);
/*      */       
/* 2923 */       double d = -this.J.nextFloat() * 0.6D - 0.3D;
/* 2924 */       dcn dcn2 = new dcn((this.J.nextFloat() - 0.5D) * 0.3D, d, 0.6D);
/* 2925 */       dcn2 = dcn2.a(-this.q * 0.017453292F);
/* 2926 */       dcn2 = dcn2.b(-this.p * 0.017453292F);
/* 2927 */       dcn2 = dcn2.b(cD(), cG(), cH());
/* 2928 */       this.l.a(new he(hh.I, ☃), dcn2.b, dcn2.c, dcn2.d, dcn1.b, dcn1.c + 0.05D, dcn1.d);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void s() {
/* 2933 */     aot ☃ = dX();
/* 2934 */     if (!this.bc.equals(b(☃))) {
/* 2935 */       eb();
/*      */       
/*      */       return;
/*      */     } 
/* 2939 */     if (!this.bc.a() && dW()) {
/* 2940 */       b(this.bc, 16);
/* 2941 */       bmb bmb1 = this.bc.a(this.l, this);
/* 2942 */       if (bmb1 != this.bc) {
/* 2943 */         a(☃, bmb1);
/*      */       }
/* 2945 */       ec();
/*      */     } 
/*      */   }
/*      */   
/*      */   public bmb dY() {
/* 2950 */     return this.bc;
/*      */   }
/*      */   
/*      */   public int dZ() {
/* 2954 */     return this.bd;
/*      */   }
/*      */   
/*      */   public int ea() {
/* 2958 */     if (dW()) {
/* 2959 */       return this.bc.k() - dZ();
/*      */     }
/* 2961 */     return 0;
/*      */   }
/*      */   
/*      */   public void eb() {
/* 2965 */     if (!this.bc.a()) {
/* 2966 */       this.bc.a(this.l, this, dZ());
/* 2967 */       if (this.bc.m()) {
/* 2968 */         t();
/*      */       }
/*      */     } 
/* 2971 */     ec();
/*      */   }
/*      */   
/*      */   public void ec() {
/* 2975 */     if (!this.l.v) {
/* 2976 */       c(1, false);
/*      */     }
/* 2978 */     this.bc = bmb.b;
/* 2979 */     this.bd = 0;
/*      */   }
/*      */   
/*      */   public boolean ed() {
/* 2983 */     if (!dW() || this.bc.a()) {
/* 2984 */       return false;
/*      */     }
/* 2986 */     blx ☃ = this.bc.b();
/* 2987 */     if (☃.d_(this.bc) != bnn.d) {
/* 2988 */       return false;
/*      */     }
/* 2990 */     if (☃.e_(this.bc) - this.bd < 5) {
/* 2991 */       return false;
/*      */     }
/* 2993 */     return true;
/*      */   }
/*      */   
/*      */   public boolean ee() {
/* 2997 */     return bu();
/*      */   }
/*      */   
/*      */   public boolean ef() {
/* 3001 */     return i(7);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bC() {
/* 3008 */     return (super.bC() || (!ef() && ae() == aqx.b));
/*      */   }
/*      */   
/*      */   public int eg() {
/* 3012 */     return this.be;
/*      */   }
/*      */   
/*      */   public boolean a(double ☃, double d1, double d2, boolean bool) {
/* 3016 */     double d3 = cD();
/* 3017 */     double d4 = cE();
/* 3018 */     double d5 = cH();
/*      */     
/* 3020 */     double d6 = d1;
/* 3021 */     boolean bool1 = false;
/* 3022 */     fx fx1 = new fx(☃, d6, d2);
/* 3023 */     brx brx = this.l;
/*      */     
/* 3025 */     if (brx.C(fx1)) {
/* 3026 */       boolean bool2 = false;
/* 3027 */       while (!bool2 && fx1.v() > 0) {
/* 3028 */         fx fx2 = fx1.c();
/* 3029 */         ceh ceh = brx.d_(fx2);
/* 3030 */         if (ceh.c().c()) {
/* 3031 */           bool2 = true; continue;
/*      */         } 
/* 3033 */         d6--;
/* 3034 */         fx1 = fx2;
/*      */       } 
/*      */       
/* 3037 */       if (bool2) {
/* 3038 */         a(☃, d6, d2);
/* 3039 */         if (brx.k(this) && !brx.d(cc())) {
/* 3040 */           bool1 = true;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 3045 */     if (!bool1) {
/* 3046 */       a(d3, d4, d5);
/* 3047 */       return false;
/*      */     } 
/*      */     
/* 3050 */     if (bool) {
/* 3051 */       brx.a(this, (byte)46);
/*      */     }
/*      */     
/* 3054 */     if (this instanceof aqu) {
/* 3055 */       ((aqu)this).x().o();
/*      */     }
/*      */     
/* 3058 */     return true;
/*      */   }
/*      */   
/*      */   public boolean eh() {
/* 3062 */     return true;
/*      */   }
/*      */   
/*      */   public boolean ei() {
/* 3066 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fx ☃, boolean bool) {}
/*      */   
/*      */   public boolean e(bmb ☃) {
/* 3073 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public oj<?> P() {
/* 3078 */     return new op(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public aqb a(aqx ☃) {
/* 3083 */     return (☃ == aqx.c) ? ah : super.a(☃).a(cS());
/*      */   }
/*      */   
/*      */   public ImmutableList<aqx> ej() {
/* 3087 */     return ImmutableList.of(aqx.a);
/*      */   }
/*      */   
/*      */   public dci f(aqx ☃) {
/* 3091 */     aqb aqb1 = a(☃);
/* 3092 */     return new dci((-aqb1.a / 2.0F), 0.0D, (-aqb1.a / 2.0F), (aqb1.a / 2.0F), aqb1.b, (aqb1.a / 2.0F));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Optional<fx> ek() {
/* 3099 */     return this.R.<Optional<fx>>a(bj);
/*      */   }
/*      */   
/*      */   public void e(fx ☃) {
/* 3103 */     this.R.b(bj, Optional.of(☃));
/*      */   }
/*      */   
/*      */   public void el() {
/* 3107 */     this.R.b(bj, Optional.empty());
/*      */   }
/*      */   
/*      */   public boolean em() {
/* 3111 */     return ek().isPresent();
/*      */   }
/*      */   
/*      */   public void b(fx ☃) {
/* 3115 */     if (br()) {
/* 3116 */       l();
/*      */     }
/*      */     
/* 3119 */     ceh ceh = this.l.d_(☃);
/* 3120 */     if (ceh.b() instanceof buj) {
/* 3121 */       this.l.a(☃, ceh.a(buj.b, Boolean.valueOf(true)), 3);
/*      */     }
/*      */     
/* 3124 */     b(aqx.c);
/* 3125 */     a(☃);
/* 3126 */     e(☃);
/* 3127 */     f(dcn.a);
/* 3128 */     this.Z = true;
/*      */   }
/*      */   
/*      */   private void a(fx ☃) {
/* 3132 */     d(☃.u() + 0.5D, ☃.v() + 0.6875D, ☃.w() + 0.5D);
/*      */   }
/*      */   
/*      */   private boolean x() {
/* 3136 */     return ((Boolean)ek().<Boolean>map(☃ -> Boolean.valueOf(this.l.d_(☃).b() instanceof buj)).orElse(Boolean.valueOf(false))).booleanValue();
/*      */   }
/*      */   
/*      */   public void en() {
/* 3140 */     ek().filter(this.l::C).ifPresent(☃ -> {
/*      */           ceh ceh = this.l.d_(☃);
/*      */           
/*      */           if (ceh.b() instanceof buj) {
/*      */             this.l.a(☃, ceh.a(buj.b, Boolean.valueOf(false)), 3);
/*      */             
/*      */             dcn dcn1 = buj.a(X(), this.l, ☃, this.p).orElseGet(());
/*      */             
/*      */             dcn dcn2 = dcn.c(☃).d(dcn1).d();
/*      */             
/*      */             float f = (float)afm.g(afm.d(dcn2.d, dcn2.b) * 57.2957763671875D - 90.0D);
/*      */             
/*      */             d(dcn1.b, dcn1.c, dcn1.d);
/*      */             
/*      */             this.p = f;
/*      */             
/*      */             this.q = 0.0F;
/*      */           } 
/*      */         });
/* 3159 */     dcn ☃ = cA();
/* 3160 */     b(aqx.a);
/* 3161 */     d(☃.b, ☃.c, ☃.d);
/* 3162 */     el();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public gc eo() {
/* 3167 */     fx ☃ = ek().orElse(null);
/* 3168 */     return (☃ != null) ? buj.a(this.l, ☃) : null;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean aY() {
/* 3173 */     return (!em() && super.aY());
/*      */   }
/*      */ 
/*      */   
/*      */   protected final float a(aqx ☃, aqb aqb1) {
/* 3178 */     return (☃ == aqx.c) ? 0.2F : b(☃, aqb1);
/*      */   }
/*      */   
/*      */   protected float b(aqx ☃, aqb aqb1) {
/* 3182 */     return super.a(☃, aqb1);
/*      */   }
/*      */   
/*      */   public bmb f(bmb ☃) {
/* 3186 */     return bmb.b;
/*      */   }
/*      */   
/*      */   public bmb a(brx ☃, bmb bmb1) {
/* 3190 */     if (bmb1.F()) {
/* 3191 */       ☃.a((bfw)null, cD(), cE(), cH(), d(bmb1), adr.g, 1.0F, 1.0F + (☃.t.nextFloat() - ☃.t.nextFloat()) * 0.4F);
/* 3192 */       a(bmb1, ☃, this);
/*      */       
/* 3194 */       if (!(this instanceof bfw) || !((bfw)this).bC.d) {
/* 3195 */         bmb1.g(1);
/*      */       }
/*      */     } 
/* 3198 */     return bmb1;
/*      */   }
/*      */   
/*      */   private void a(bmb ☃, brx brx1, aqm aqm1) {
/* 3202 */     blx blx = ☃.b();
/* 3203 */     if (blx.s()) {
/* 3204 */       List<Pair<apu, Float>> list = blx.t().f();
/* 3205 */       for (Pair<apu, Float> pair : list) {
/* 3206 */         if (!brx1.v && pair.getFirst() != null && brx1.t.nextFloat() < ((Float)pair.getSecond()).floatValue()) {
/* 3207 */           aqm1.c(new apu((apu)pair.getFirst()));
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private static byte f(aqf ☃) {
/* 3214 */     switch (null.b[☃.ordinal()]) {
/*      */       case 1:
/* 3216 */         return 47;
/*      */       case 2:
/* 3218 */         return 48;
/*      */       case 3:
/* 3220 */         return 49;
/*      */       case 4:
/* 3222 */         return 50;
/*      */       case 5:
/* 3224 */         return 52;
/*      */       case 6:
/* 3226 */         return 51;
/*      */     } 
/* 3228 */     return 47;
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(aqf ☃) {
/* 3233 */     this.l.a(this, f(☃));
/*      */   }
/*      */   
/*      */   public void d(aot ☃) {
/* 3237 */     c((☃ == aot.a) ? aqf.a : aqf.b);
/*      */   }
/*      */ 
/*      */   
/*      */   public dci cd() {
/* 3242 */     if (b(aqf.f).b() == bmd.pj) {
/* 3243 */       float ☃ = 0.5F;
/* 3244 */       return cc().c(0.5D, 0.5D, 0.5D);
/*      */     } 
/* 3246 */     return super.cd();
/*      */   }
/*      */   
/*      */   public abstract Iterable<bmb> bo();
/*      */   
/*      */   public abstract bmb b(aqf paramaqf);
/*      */   
/*      */   public abstract void a(aqf paramaqf, bmb parambmb);
/*      */   
/*      */   public abstract aqi dV();
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
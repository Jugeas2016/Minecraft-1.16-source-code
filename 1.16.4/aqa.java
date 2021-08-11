/*      */ import com.google.common.collect.Iterables;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Sets;
/*      */ import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
/*      */ import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.Collections;
/*      */ import java.util.List;
/*      */ import java.util.Locale;
/*      */ import java.util.Optional;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ import java.util.concurrent.atomic.AtomicInteger;
/*      */ import java.util.stream.Stream;
/*      */ import javax.annotation.Nullable;
/*      */ import net.minecraft.server.MinecraftServer;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class aqa
/*      */   implements aoy, da
/*      */ {
/*  112 */   protected static final Logger h = LogManager.getLogger();
/*      */ 
/*      */   
/*  115 */   private static final AtomicInteger b = new AtomicInteger();
/*  116 */   private static final List<bmb> c = Collections.emptyList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  124 */   private static final dci d = new dci(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  133 */   private static double e = 1.0D;
/*      */   
/*      */   private final aqe<?> f;
/*  136 */   private int g = b.incrementAndGet();
/*      */   
/*      */   public boolean i;
/*  139 */   private final List<aqa> ag = Lists.newArrayList();
/*      */   
/*      */   protected int j;
/*      */   @Nullable
/*      */   private aqa ah;
/*      */   public boolean k;
/*      */   public brx l;
/*      */   public double m;
/*      */   public double n;
/*      */   public double o;
/*      */   private dcn ai;
/*      */   private fx aj;
/*  151 */   private dcn ak = dcn.a;
/*      */   public float p;
/*      */   public float q;
/*      */   public float r;
/*      */   public float s;
/*  156 */   private dci al = d;
/*      */   protected boolean t;
/*      */   public boolean u;
/*      */   public boolean v;
/*      */   public boolean w;
/*  161 */   protected dcn x = dcn.a;
/*      */   
/*      */   public boolean y;
/*      */   
/*      */   public float z;
/*      */   
/*      */   public float A;
/*      */   
/*      */   public float B;
/*      */   
/*      */   public float C;
/*      */   
/*  173 */   private float am = 1.0F;
/*  174 */   private float an = 1.0F;
/*      */   
/*      */   public double D;
/*      */   public double E;
/*      */   public double F;
/*      */   public float G;
/*      */   public boolean H;
/*      */   public float I;
/*  182 */   protected final Random J = new Random();
/*      */   
/*      */   public int K;
/*  185 */   private int ao = -cv();
/*      */   
/*      */   protected boolean L;
/*  188 */   protected Object2DoubleMap<ael<cuw>> M = (Object2DoubleMap<ael<cuw>>)new Object2DoubleArrayMap(2);
/*      */   
/*      */   protected boolean N;
/*      */   
/*      */   @Nullable
/*      */   protected ael<cuw> O;
/*      */   
/*      */   public int P;
/*      */   
/*      */   protected boolean Q = true;
/*      */   
/*      */   protected final uv R;
/*      */   
/*  201 */   protected static final us<Byte> S = uv.a(aqa.class, uu.a);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  210 */   private static final us<Integer> ap = uv.a(aqa.class, uu.b);
/*  211 */   private static final us<Optional<nr>> aq = uv.a(aqa.class, uu.f);
/*  212 */   private static final us<Boolean> ar = uv.a(aqa.class, uu.i);
/*  213 */   private static final us<Boolean> as = uv.a(aqa.class, uu.i);
/*  214 */   private static final us<Boolean> at = uv.a(aqa.class, uu.i);
/*  215 */   protected static final us<aqx> T = uv.a(aqa.class, uu.s);
/*      */   
/*      */   public boolean U;
/*      */   public int V;
/*      */   public int W;
/*      */   public int X;
/*      */   private boolean au;
/*      */   private dcn av;
/*      */   public boolean Y;
/*      */   public boolean Z;
/*      */   private int aw;
/*      */   protected boolean aa;
/*      */   protected int ab;
/*      */   protected fx ac;
/*      */   private boolean ax;
/*  230 */   protected UUID ad = afm.a(this.J);
/*  231 */   protected String ae = this.ad.toString();
/*      */   protected boolean af;
/*  233 */   private final Set<String> ay = Sets.newHashSet();
/*      */   
/*      */   private boolean az;
/*  236 */   private final double[] aA = new double[] { 0.0D, 0.0D, 0.0D };
/*      */   
/*      */   private long aB;
/*      */   private aqb aC;
/*      */   private float aD;
/*      */   
/*      */   public aqa(aqe<?> ☃, brx brx1) {
/*  243 */     this.f = ☃;
/*  244 */     this.l = brx1;
/*      */     
/*  246 */     this.aC = ☃.l();
/*  247 */     this.ai = dcn.a;
/*  248 */     this.aj = fx.b;
/*  249 */     this.av = dcn.a;
/*  250 */     d(0.0D, 0.0D, 0.0D);
/*      */     
/*  252 */     this.R = new uv(this);
/*  253 */     this.R.a(S, Byte.valueOf((byte)0));
/*  254 */     this.R.a(ap, Integer.valueOf(bH()));
/*  255 */     this.R.a(ar, Boolean.valueOf(false));
/*  256 */     this.R.a(aq, Optional.empty());
/*  257 */     this.R.a(as, Boolean.valueOf(false));
/*  258 */     this.R.a(at, Boolean.valueOf(false));
/*  259 */     this.R.a(T, aqx.a);
/*  260 */     e();
/*      */     
/*  262 */     this.aD = a(aqx.a, this.aC);
/*      */   }
/*      */   
/*      */   public boolean a(fx ☃, ceh ceh1) {
/*  266 */     ddh ddh1 = ceh1.b(this.l, ☃, dcs.a(this));
/*  267 */     ddh ddh2 = ddh1.a(☃.u(), ☃.v(), ☃.w());
/*  268 */     return dde.c(ddh2, dde.a(cc()), dcr.i);
/*      */   }
/*      */   
/*      */   public int U() {
/*  272 */     ddp ☃ = bG();
/*  273 */     if (☃ != null && ☃.n().e() != null) {
/*  274 */       return ☃.n().e().intValue();
/*      */     }
/*  276 */     return 16777215;
/*      */   }
/*      */   
/*      */   public boolean a_() {
/*  280 */     return false;
/*      */   }
/*      */   
/*      */   public final void V() {
/*  284 */     if (bs()) {
/*  285 */       be();
/*      */     }
/*  287 */     if (br()) {
/*  288 */       l();
/*      */     }
/*      */   }
/*      */   
/*      */   public void c(double ☃, double d1, double d2) {
/*  293 */     a(new dcn(☃, d1, d2));
/*      */   }
/*      */   
/*      */   public void a(dcn ☃) {
/*  297 */     this.av = ☃;
/*      */   }
/*      */   
/*      */   public dcn W() {
/*  301 */     return this.av;
/*      */   }
/*      */   
/*      */   public aqe<?> X() {
/*  305 */     return this.f;
/*      */   }
/*      */   
/*      */   public int Y() {
/*  309 */     return this.g;
/*      */   }
/*      */   
/*      */   public void e(int ☃) {
/*  313 */     this.g = ☃;
/*      */   }
/*      */   
/*      */   public Set<String> Z() {
/*  317 */     return this.ay;
/*      */   }
/*      */   
/*      */   public boolean a(String ☃) {
/*  321 */     if (this.ay.size() >= 1024) {
/*  322 */       return false;
/*      */     }
/*  324 */     return this.ay.add(☃);
/*      */   }
/*      */   
/*      */   public boolean b(String ☃) {
/*  328 */     return this.ay.remove(☃);
/*      */   }
/*      */   
/*      */   public void aa() {
/*  332 */     ad();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public uv ab() {
/*  338 */     return this.R;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean equals(Object ☃) {
/*  343 */     if (☃ instanceof aqa) {
/*  344 */       return (((aqa)☃).g == this.g);
/*      */     }
/*  346 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public int hashCode() {
/*  351 */     return this.g;
/*      */   }
/*      */   
/*      */   protected void ac() {
/*  355 */     if (this.l == null) {
/*      */       return;
/*      */     }
/*  358 */     double ☃ = cE();
/*  359 */     while (☃ > 0.0D && ☃ < 256.0D) {
/*  360 */       d(cD(), ☃, cH());
/*  361 */       if (this.l.k(this)) {
/*      */         break;
/*      */       }
/*  364 */       ☃++;
/*      */     } 
/*      */     
/*  367 */     f(dcn.a);
/*  368 */     this.q = 0.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void ad() {
/*  373 */     this.y = true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(aqx ☃) {
/*  380 */     this.R.b(T, ☃);
/*      */   }
/*      */   
/*      */   public aqx ae() {
/*  384 */     return this.R.<aqx>a(T);
/*      */   }
/*      */   
/*      */   public boolean a(aqa ☃, double d) {
/*  388 */     double d1 = ☃.ai.b - this.ai.b;
/*  389 */     double d2 = ☃.ai.c - this.ai.c;
/*  390 */     double d3 = ☃.ai.d - this.ai.d;
/*  391 */     return (d1 * d1 + d2 * d2 + d3 * d3 < d * d);
/*      */   }
/*      */   
/*      */   protected void a(float ☃, float f1) {
/*  395 */     this.p = ☃ % 360.0F;
/*  396 */     this.q = f1 % 360.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void d(double ☃, double d1, double d2) {
/*  401 */     o(☃, d1, d2);
/*  402 */     a(this.aC.a(☃, d1, d2));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void af() {
/*  407 */     d(this.ai.b, this.ai.c, this.ai.d);
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1) {
/*  411 */     double d2 = d1 * 0.15D;
/*  412 */     double d3 = ☃ * 0.15D;
/*      */     
/*  414 */     this.q = (float)(this.q + d2);
/*  415 */     this.p = (float)(this.p + d3);
/*  416 */     this.q = afm.a(this.q, -90.0F, 90.0F);
/*      */     
/*  418 */     this.s = (float)(this.s + d2);
/*  419 */     this.r = (float)(this.r + d3);
/*  420 */     this.s = afm.a(this.s, -90.0F, 90.0F);
/*      */     
/*  422 */     if (this.ah != null) {
/*  423 */       this.ah.l(this);
/*      */     }
/*      */   }
/*      */   
/*      */   public void j() {
/*  428 */     if (!this.l.v) {
/*  429 */       b(6, bE());
/*      */     }
/*  431 */     ag();
/*      */   }
/*      */   
/*      */   public void ag() {
/*  435 */     this.l.Z().a("entityBaseTick");
/*      */     
/*  437 */     if (br() && (ct()).y) {
/*  438 */       l();
/*      */     }
/*      */     
/*  441 */     if (this.j > 0) {
/*  442 */       this.j--;
/*      */     }
/*      */     
/*  445 */     this.z = this.A;
/*  446 */     this.s = this.q;
/*  447 */     this.r = this.p;
/*      */     
/*  449 */     bk();
/*      */ 
/*      */     
/*  452 */     if (aO()) {
/*  453 */       aP();
/*      */     }
/*      */     
/*  456 */     aK();
/*  457 */     m();
/*  458 */     aJ();
/*      */     
/*  460 */     if (this.l.v) {
/*  461 */       am();
/*      */     }
/*  463 */     else if (this.ao > 0) {
/*  464 */       if (aD()) {
/*  465 */         g(this.ao - 4);
/*  466 */         if (this.ao < 0) {
/*  467 */           am();
/*      */         }
/*      */       } else {
/*  470 */         if (this.ao % 20 == 0 && !aQ()) {
/*  471 */           a(apk.c, 1.0F);
/*      */         }
/*  473 */         g(this.ao - 1);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  478 */     if (aQ()) {
/*  479 */       ak();
/*  480 */       this.C *= 0.5F;
/*      */     } 
/*      */     
/*  483 */     if (cE() < -64.0D) {
/*  484 */       an();
/*      */     }
/*      */     
/*  487 */     if (!this.l.v) {
/*  488 */       b(0, (this.ao > 0));
/*      */     }
/*      */     
/*  491 */     this.Q = false;
/*      */     
/*  493 */     this.l.Z().c();
/*      */   }
/*      */   
/*      */   public void ah() {
/*  497 */     this.aw = bl();
/*      */   }
/*      */   
/*      */   public boolean ai() {
/*  501 */     return (this.aw > 0);
/*      */   }
/*      */   
/*      */   protected void E() {
/*  505 */     if (ai()) {
/*  506 */       this.aw--;
/*      */     }
/*      */   }
/*      */   
/*      */   public int aj() {
/*  511 */     return 0;
/*      */   }
/*      */   
/*      */   protected void ak() {
/*  515 */     if (aD()) {
/*      */       return;
/*      */     }
/*      */     
/*  519 */     f(15);
/*  520 */     a(apk.d, 4.0F);
/*      */   }
/*      */   
/*      */   public void f(int ☃) {
/*  524 */     int i = ☃ * 20;
/*  525 */     if (this instanceof aqm) {
/*  526 */       i = bqf.a((aqm)this, i);
/*      */     }
/*  528 */     if (this.ao < i) {
/*  529 */       g(i);
/*      */     }
/*      */   }
/*      */   
/*      */   public void g(int ☃) {
/*  534 */     this.ao = ☃;
/*      */   }
/*      */   
/*      */   public int al() {
/*  538 */     return this.ao;
/*      */   }
/*      */   
/*      */   public void am() {
/*  542 */     g(0);
/*      */   }
/*      */   
/*      */   protected void an() {
/*  546 */     ad();
/*      */   }
/*      */   
/*      */   public boolean e(double ☃, double d1, double d2) {
/*  550 */     return b(cc().d(☃, d1, d2));
/*      */   }
/*      */   
/*      */   private boolean b(dci ☃) {
/*  554 */     return (this.l.a_(this, ☃) && !this.l.d(☃));
/*      */   }
/*      */   
/*      */   public void c(boolean ☃) {
/*  558 */     this.t = ☃;
/*      */   }
/*      */   
/*      */   public boolean ao() {
/*  562 */     return this.t;
/*      */   }
/*      */   
/*      */   public void a(aqr ☃, dcn dcn1) {
/*  566 */     if (this.H) {
/*  567 */       a(cc().c(dcn1));
/*  568 */       au();
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  573 */     if (☃ == aqr.c) {
/*  574 */       dcn1 = b(dcn1);
/*  575 */       if (dcn1.equals(dcn.a)) {
/*      */         return;
/*      */       }
/*      */     } 
/*      */     
/*  580 */     this.l.Z().a("move");
/*      */     
/*  582 */     if (this.x.g() > 1.0E-7D) {
/*  583 */       dcn1 = dcn1.h(this.x);
/*  584 */       this.x = dcn.a;
/*  585 */       f(dcn.a);
/*      */     } 
/*      */     
/*  588 */     dcn1 = a(dcn1, ☃);
/*      */     
/*  590 */     dcn dcn2 = g(dcn1);
/*  591 */     if (dcn2.g() > 1.0E-7D) {
/*  592 */       a(cc().c(dcn2));
/*  593 */       au();
/*      */     } 
/*      */     
/*  596 */     this.l.Z().c();
/*  597 */     this.l.Z().a("rest");
/*      */ 
/*      */     
/*  600 */     this.u = (!afm.b(dcn1.b, dcn2.b) || !afm.b(dcn1.d, dcn2.d));
/*  601 */     this.v = (dcn1.c != dcn2.c);
/*      */     
/*  603 */     this.t = (this.v && dcn1.c < 0.0D);
/*      */     
/*  605 */     fx fx1 = ap();
/*  606 */     ceh ceh = this.l.d_(fx1);
/*      */     
/*  608 */     a(dcn2.c, this.t, ceh, fx1);
/*      */     
/*  610 */     dcn dcn3 = cC();
/*  611 */     if (dcn1.b != dcn2.b) {
/*  612 */       n(0.0D, dcn3.c, dcn3.d);
/*      */     }
/*  614 */     if (dcn1.d != dcn2.d) {
/*  615 */       n(dcn3.b, dcn3.c, 0.0D);
/*      */     }
/*      */     
/*  618 */     buo buo = ceh.b();
/*  619 */     if (dcn1.c != dcn2.c) {
/*  620 */       buo.a(this.l, this);
/*      */     }
/*      */     
/*  623 */     if (this.t && !bv())
/*      */     {
/*  625 */       buo.a(this.l, fx1, this);
/*      */     }
/*      */     
/*  628 */     if (aC() && !br()) {
/*  629 */       double d1 = dcn2.b;
/*  630 */       double d2 = dcn2.c;
/*  631 */       double d3 = dcn2.d;
/*      */       
/*  633 */       if (!buo.a(aed.at)) {
/*  634 */         d2 = 0.0D;
/*      */       }
/*      */       
/*  637 */       this.A = (float)(this.A + afm.a(c(dcn2)) * 0.6D);
/*  638 */       this.B = (float)(this.B + afm.a(d1 * d1 + d2 * d2 + d3 * d3) * 0.6D);
/*      */       
/*  640 */       if (this.B > this.am && !ceh.g()) {
/*  641 */         this.am = at();
/*  642 */         if (aE()) {
/*  643 */           aqa aqa1 = (bs() && cm() != null) ? cm() : this;
/*  644 */           float f1 = (aqa1 == this) ? 0.35F : 0.4F;
/*      */           
/*  646 */           dcn dcn4 = aqa1.cC();
/*      */           
/*  648 */           float f2 = afm.a(dcn4.b * dcn4.b * 0.20000000298023224D + dcn4.c * dcn4.c + dcn4.d * dcn4.d * 0.20000000298023224D) * f1;
/*  649 */           if (f2 > 1.0F) {
/*  650 */             f2 = 1.0F;
/*      */           }
/*  652 */           d(f2);
/*      */         } else {
/*  654 */           b(fx1, ceh);
/*      */         } 
/*  656 */       } else if (this.B > this.an && az() && ceh.g()) {
/*  657 */         this.an = e(this.B);
/*      */       } 
/*      */     } 
/*      */     
/*      */     try {
/*  662 */       ay();
/*  663 */     } catch (Throwable throwable) {
/*  664 */       l l = l.a(throwable, "Checking entity block collision");
/*  665 */       m m = l.a("Entity being checked for collision");
/*      */       
/*  667 */       a(m);
/*      */       
/*  669 */       throw new u(l);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  675 */     float f = ar();
/*  676 */     f(cC().d(f, 1.0D, f));
/*      */     
/*  678 */     if (this.l.c(cc().h(0.001D)).noneMatch(☃ -> (☃.a(aed.an) || ☃.a(bup.B))) && 
/*  679 */       this.ao <= 0) {
/*  680 */       g(-cv());
/*      */     }
/*      */ 
/*      */     
/*  684 */     if (aG() && bq()) {
/*  685 */       a(adq.eM, 0.7F, 1.6F + (this.J.nextFloat() - this.J.nextFloat()) * 0.4F);
/*  686 */       g(-cv());
/*      */     } 
/*      */     
/*  689 */     this.l.Z().c();
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
/*      */   protected fx ap() {
/*  703 */     int ☃ = afm.c(this.ai.b);
/*  704 */     int i = afm.c(this.ai.c - 0.20000000298023224D);
/*  705 */     int j = afm.c(this.ai.d);
/*      */     
/*  707 */     fx fx1 = new fx(☃, i, j);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  713 */     if (this.l.d_(fx1).g()) {
/*  714 */       fx fx2 = fx1.c();
/*  715 */       ceh ceh = this.l.d_(fx2);
/*  716 */       buo buo = ceh.b();
/*      */       
/*  718 */       if (buo.a(aed.M) || buo.a(aed.F) || buo instanceof bwr) {
/*  719 */         return fx2;
/*      */       }
/*      */     } 
/*  722 */     return fx1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float aq() {
/*  731 */     float ☃ = this.l.d_(cB()).b().l();
/*  732 */     float f1 = this.l.d_(as()).b().l();
/*  733 */     return (☃ == 1.0D) ? f1 : ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected float ar() {
/*  742 */     buo ☃ = this.l.d_(cB()).b();
/*  743 */     float f = ☃.k();
/*  744 */     if (☃ == bup.A || ☃ == bup.lc) {
/*  745 */       return f;
/*      */     }
/*  747 */     return (f == 1.0D) ? this.l.d_(as()).b().k() : f;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected fx as() {
/*  758 */     return new fx(this.ai.b, (cc()).b - 0.5000001D, this.ai.d);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected dcn a(dcn ☃, aqr aqr1) {
/*  765 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   protected dcn b(dcn ☃) {
/*  770 */     if (☃.g() <= 1.0E-7D) {
/*  771 */       return ☃;
/*      */     }
/*      */     
/*  774 */     long l = this.l.T();
/*  775 */     if (l != this.aB) {
/*  776 */       Arrays.fill(this.aA, 0.0D);
/*  777 */       this.aB = l;
/*      */     } 
/*      */     
/*  780 */     if (☃.b != 0.0D) {
/*  781 */       double d = a(gc.a.a, ☃.b);
/*  782 */       return (Math.abs(d) <= 9.999999747378752E-6D) ? dcn.a : new dcn(d, 0.0D, 0.0D);
/*      */     } 
/*  784 */     if (☃.c != 0.0D) {
/*  785 */       double d = a(gc.a.b, ☃.c);
/*  786 */       return (Math.abs(d) <= 9.999999747378752E-6D) ? dcn.a : new dcn(0.0D, d, 0.0D);
/*      */     } 
/*  788 */     if (☃.d != 0.0D) {
/*  789 */       double d = a(gc.a.c, ☃.d);
/*  790 */       return (Math.abs(d) <= 9.999999747378752E-6D) ? dcn.a : new dcn(0.0D, 0.0D, d);
/*      */     } 
/*      */     
/*  793 */     return dcn.a;
/*      */   }
/*      */   
/*      */   private double a(gc.a ☃, double d) {
/*  797 */     int i = ☃.ordinal();
/*  798 */     double d1 = afm.a(d + this.aA[i], -0.51D, 0.51D);
/*  799 */     d = d1 - this.aA[i];
/*  800 */     this.aA[i] = d1;
/*  801 */     return d;
/*      */   }
/*      */   
/*      */   private dcn g(dcn ☃) {
/*  805 */     dci dci1 = cc();
/*  806 */     dcs dcs = dcs.a(this);
/*      */     
/*  808 */     ddh ddh = this.l.f().c();
/*  809 */     Stream<ddh> stream1 = dde.c(ddh, dde.a(dci1.h(1.0E-7D)), dcr.i) ? Stream.<ddh>empty() : Stream.<ddh>of(ddh);
/*      */ 
/*      */     
/*  812 */     Stream<ddh> stream2 = this.l.c(this, dci1.b(☃), ☃ -> true);
/*      */     
/*  814 */     afo<ddh> afo = new afo<>(Stream.concat(stream2, stream1));
/*      */     
/*  816 */     dcn dcn1 = (☃.g() == 0.0D) ? ☃ : a(this, ☃, dci1, this.l, dcs, afo);
/*      */ 
/*      */     
/*  819 */     boolean bool1 = (☃.b != dcn1.b);
/*  820 */     boolean bool2 = (☃.c != dcn1.c);
/*  821 */     boolean bool3 = (☃.d != dcn1.d);
/*      */     
/*  823 */     boolean bool4 = (this.t || (bool2 && ☃.c < 0.0D));
/*  824 */     if (this.G > 0.0F && bool4 && (bool1 || bool3)) {
/*  825 */       dcn dcn2 = a(this, new dcn(☃.b, this.G, ☃.d), dci1, this.l, dcs, afo);
/*      */ 
/*      */       
/*  828 */       dcn dcn3 = a(this, new dcn(0.0D, this.G, 0.0D), dci1.b(☃.b, 0.0D, ☃.d), this.l, dcs, afo);
/*  829 */       if (dcn3.c < this.G) {
/*  830 */         dcn dcn4 = a(this, new dcn(☃.b, 0.0D, ☃.d), dci1.c(dcn3), this.l, dcs, afo).e(dcn3);
/*      */         
/*  832 */         if (c(dcn4) > c(dcn2)) {
/*  833 */           dcn2 = dcn4;
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*  838 */       if (c(dcn2) > c(dcn1)) {
/*  839 */         return dcn2.e(a(this, new dcn(0.0D, -dcn2.c + ☃.c, 0.0D), dci1.c(dcn2), this.l, dcs, afo));
/*      */       }
/*      */     } 
/*  842 */     return dcn1;
/*      */   }
/*      */   
/*      */   public static double c(dcn ☃) {
/*  846 */     return ☃.b * ☃.b + ☃.d * ☃.d;
/*      */   }
/*      */   
/*      */   public static dcn a(@Nullable aqa ☃, dcn dcn1, dci dci1, brx brx1, dcs dcs1, afo<ddh> afo1) {
/*  850 */     boolean bool1 = (dcn1.b == 0.0D);
/*  851 */     boolean bool2 = (dcn1.c == 0.0D);
/*  852 */     boolean bool3 = (dcn1.d == 0.0D);
/*      */     
/*  854 */     if ((bool1 && bool2) || (bool1 && bool3) || (bool2 && bool3)) {
/*  855 */       return a(dcn1, dci1, brx1, dcs1, afo1);
/*      */     }
/*  857 */     afo<ddh> afo2 = new afo<>(Stream.concat(afo1
/*  858 */           .a(), brx1
/*  859 */           .b(☃, dci1.b(dcn1))));
/*      */ 
/*      */     
/*  862 */     return a(dcn1, dci1, afo2);
/*      */   }
/*      */ 
/*      */   
/*      */   public static dcn a(dcn ☃, dci dci1, afo<ddh> afo1) {
/*  867 */     double d1 = ☃.b;
/*  868 */     double d2 = ☃.c;
/*  869 */     double d3 = ☃.d;
/*      */ 
/*      */     
/*  872 */     if (d2 != 0.0D) {
/*  873 */       d2 = dde.a(gc.a.b, dci1, afo1.a(), d2);
/*  874 */       if (d2 != 0.0D) {
/*  875 */         dci1 = dci1.d(0.0D, d2, 0.0D);
/*      */       }
/*      */     } 
/*      */     
/*  879 */     boolean bool = (Math.abs(d1) < Math.abs(d3));
/*      */     
/*  881 */     if (bool && d3 != 0.0D) {
/*  882 */       d3 = dde.a(gc.a.c, dci1, afo1.a(), d3);
/*  883 */       if (d3 != 0.0D) {
/*  884 */         dci1 = dci1.d(0.0D, 0.0D, d3);
/*      */       }
/*      */     } 
/*      */     
/*  888 */     if (d1 != 0.0D) {
/*  889 */       d1 = dde.a(gc.a.a, dci1, afo1.a(), d1);
/*  890 */       if (!bool && d1 != 0.0D) {
/*  891 */         dci1 = dci1.d(d1, 0.0D, 0.0D);
/*      */       }
/*      */     } 
/*      */     
/*  895 */     if (!bool && d3 != 0.0D) {
/*  896 */       d3 = dde.a(gc.a.c, dci1, afo1.a(), d3);
/*      */     }
/*      */     
/*  899 */     return new dcn(d1, d2, d3);
/*      */   }
/*      */   
/*      */   public static dcn a(dcn ☃, dci dci1, brz brz1, dcs dcs1, afo<ddh> afo1) {
/*  903 */     double d1 = ☃.b;
/*  904 */     double d2 = ☃.c;
/*  905 */     double d3 = ☃.d;
/*      */ 
/*      */     
/*  908 */     if (d2 != 0.0D) {
/*  909 */       d2 = dde.a(gc.a.b, dci1, brz1, d2, dcs1, afo1.a());
/*  910 */       if (d2 != 0.0D) {
/*  911 */         dci1 = dci1.d(0.0D, d2, 0.0D);
/*      */       }
/*      */     } 
/*      */     
/*  915 */     boolean bool = (Math.abs(d1) < Math.abs(d3));
/*      */     
/*  917 */     if (bool && d3 != 0.0D) {
/*  918 */       d3 = dde.a(gc.a.c, dci1, brz1, d3, dcs1, afo1.a());
/*  919 */       if (d3 != 0.0D) {
/*  920 */         dci1 = dci1.d(0.0D, 0.0D, d3);
/*      */       }
/*      */     } 
/*      */     
/*  924 */     if (d1 != 0.0D) {
/*  925 */       d1 = dde.a(gc.a.a, dci1, brz1, d1, dcs1, afo1.a());
/*  926 */       if (!bool && d1 != 0.0D) {
/*  927 */         dci1 = dci1.d(d1, 0.0D, 0.0D);
/*      */       }
/*      */     } 
/*      */     
/*  931 */     if (!bool && d3 != 0.0D) {
/*  932 */       d3 = dde.a(gc.a.c, dci1, brz1, d3, dcs1, afo1.a());
/*      */     }
/*      */     
/*  935 */     return new dcn(d1, d2, d3);
/*      */   }
/*      */   
/*      */   protected float at() {
/*  939 */     return ((int)this.B + 1);
/*      */   }
/*      */   
/*      */   public void au() {
/*  943 */     dci ☃ = cc();
/*  944 */     o((☃.a + ☃.d) / 2.0D, ☃.b, (☃.c + ☃.f) / 2.0D);
/*      */   }
/*      */   
/*      */   protected adp av() {
/*  948 */     return adq.eQ;
/*      */   }
/*      */   
/*      */   protected adp aw() {
/*  952 */     return adq.eP;
/*      */   }
/*      */   
/*      */   protected adp ax() {
/*  956 */     return adq.eP;
/*      */   }
/*      */   
/*      */   protected void ay() {
/*  960 */     dci ☃ = cc();
/*  961 */     fx fx1 = new fx(☃.a + 0.001D, ☃.b + 0.001D, ☃.c + 0.001D);
/*  962 */     fx fx2 = new fx(☃.d - 0.001D, ☃.e - 0.001D, ☃.f - 0.001D);
/*  963 */     fx.a a = new fx.a();
/*      */     
/*  965 */     if (this.l.a(fx1, fx2)) {
/*  966 */       for (int i = fx1.u(); i <= fx2.u(); i++) {
/*  967 */         for (int j = fx1.v(); j <= fx2.v(); j++) {
/*  968 */           for (int k = fx1.w(); k <= fx2.w(); k++) {
/*  969 */             a.d(i, j, k);
/*  970 */             ceh ceh = this.l.d_(a);
/*      */             
/*      */             try {
/*  973 */               ceh.a(this.l, a, this);
/*  974 */               a(ceh);
/*  975 */             } catch (Throwable throwable) {
/*  976 */               l l = l.a(throwable, "Colliding entity with block");
/*  977 */               m m = l.a("Block being collided with");
/*      */               
/*  979 */               m.a(m, a, ceh);
/*      */               
/*  981 */               throw new u(l);
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(ceh ☃) {}
/*      */   
/*      */   protected void b(fx ☃, ceh ceh1) {
/*  993 */     if (ceh1.c().a()) {
/*      */       return;
/*      */     }
/*      */     
/*  997 */     ceh ceh2 = this.l.d_(☃.b());
/*  998 */     cae cae = ceh2.a(bup.cC) ? ceh2.o() : ceh1.o();
/*  999 */     a(cae.d(), cae.a() * 0.15F, cae.b());
/*      */   }
/*      */   
/*      */   protected void d(float ☃) {
/* 1003 */     a(av(), ☃, 1.0F + (this.J.nextFloat() - this.J.nextFloat()) * 0.4F);
/*      */   }
/*      */   
/*      */   protected float e(float ☃) {
/* 1007 */     return 0.0F;
/*      */   }
/*      */   
/*      */   protected boolean az() {
/* 1011 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(adp ☃, float f1, float f2) {
/* 1019 */     if (!aA()) {
/* 1020 */       this.l.a((bfw)null, cD(), cE(), cH(), ☃, cu(), f1, f2);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean aA() {
/* 1025 */     return ((Boolean)this.R.<Boolean>a(as)).booleanValue();
/*      */   }
/*      */   
/*      */   public void d(boolean ☃) {
/* 1029 */     this.R.b(as, Boolean.valueOf(☃));
/*      */   }
/*      */   
/*      */   public boolean aB() {
/* 1033 */     return ((Boolean)this.R.<Boolean>a(at)).booleanValue();
/*      */   }
/*      */   
/*      */   public void e(boolean ☃) {
/* 1037 */     this.R.b(at, Boolean.valueOf(☃));
/*      */   }
/*      */   
/*      */   protected boolean aC() {
/* 1041 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void a(double ☃, boolean bool, ceh ceh1, fx fx1) {
/* 1046 */     if (bool) {
/*      */       
/* 1048 */       if (this.C > 0.0F) {
/* 1049 */         ceh1.b().a(this.l, fx1, this, this.C);
/*      */       }
/* 1051 */       this.C = 0.0F;
/* 1052 */     } else if (☃ < 0.0D) {
/* 1053 */       this.C = (float)(this.C - ☃);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean aD() {
/* 1064 */     return X().c();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean b(float ☃, float f1) {
/* 1071 */     if (bs()) {
/* 1072 */       for (aqa aqa1 : cn()) {
/* 1073 */         aqa1.b(☃, f1);
/*      */       }
/*      */     }
/* 1076 */     return false;
/*      */   }
/*      */   
/*      */   public boolean aE() {
/* 1080 */     return this.L;
/*      */   }
/*      */   
/*      */   private boolean i() {
/* 1084 */     fx ☃ = cB();
/* 1085 */     return (this.l.t(☃) || this.l.t(new fx(☃.u(), (cc()).e, ☃.w())));
/*      */   }
/*      */   
/*      */   private boolean k() {
/* 1089 */     return this.l.d_(cB()).a(bup.lc);
/*      */   }
/*      */   
/*      */   public boolean aF() {
/* 1093 */     return (aE() || i());
/*      */   }
/*      */   
/*      */   public boolean aG() {
/* 1097 */     return (aE() || i() || k());
/*      */   }
/*      */   
/*      */   public boolean aH() {
/* 1101 */     return (aE() || k());
/*      */   }
/*      */   
/*      */   public boolean aI() {
/* 1105 */     return (this.N && aE());
/*      */   }
/*      */   
/*      */   public void aJ() {
/* 1109 */     if (bB()) {
/* 1110 */       h((bA() && aE() && !br()));
/*      */     } else {
/* 1112 */       h((bA() && aI() && !br()));
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean aK() {
/* 1120 */     this.M.clear();
/* 1121 */     aL();
/* 1122 */     double ☃ = this.l.k().d() ? 0.007D : 0.0023333333333333335D;
/* 1123 */     boolean bool = a(aef.c, ☃);
/* 1124 */     return (aE() || bool);
/*      */   }
/*      */   
/*      */   void aL() {
/* 1128 */     if (ct() instanceof bhn) {
/* 1129 */       this.L = false;
/* 1130 */     } else if (a(aef.b, 0.014D)) {
/* 1131 */       if (!this.L && !this.Q) {
/* 1132 */         aM();
/*      */       }
/* 1134 */       this.C = 0.0F;
/* 1135 */       this.L = true;
/* 1136 */       am();
/*      */     } else {
/* 1138 */       this.L = false;
/*      */     } 
/*      */   }
/*      */   
/*      */   private void m() {
/* 1143 */     this.N = a(aef.b);
/*      */     
/* 1145 */     this.O = null;
/* 1146 */     double ☃ = cG() - 0.1111111119389534D;
/* 1147 */     aqa aqa1 = ct();
/* 1148 */     if (aqa1 instanceof bhn) {
/* 1149 */       bhn bhn = (bhn)aqa1;
/* 1150 */       if (!bhn.aI() && (bhn.cc()).e >= ☃ && (bhn.cc()).b <= ☃) {
/*      */         return;
/*      */       }
/*      */     } 
/* 1154 */     fx fx1 = new fx(cD(), ☃, cH());
/* 1155 */     cux cux = this.l.b(fx1);
/* 1156 */     for (ael<cuw> ael1 : aef.b()) {
/* 1157 */       if (cux.a(ael1)) {
/* 1158 */         double d = (fx1.v() + cux.a(this.l, fx1));
/* 1159 */         if (d > ☃) {
/* 1160 */           this.O = ael1;
/*      */         }
/*      */         return;
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void aM() {
/* 1168 */     aqa ☃ = (bs() && cm() != null) ? cm() : this;
/* 1169 */     float f1 = (☃ == this) ? 0.2F : 0.9F;
/* 1170 */     dcn dcn1 = ☃.cC();
/*      */ 
/*      */     
/* 1173 */     float f2 = afm.a(dcn1.b * dcn1.b * 0.20000000298023224D + dcn1.c * dcn1.c + dcn1.d * dcn1.d * 0.20000000298023224D) * f1;
/*      */     
/* 1175 */     if (f2 > 1.0F) {
/* 1176 */       f2 = 1.0F;
/*      */     }
/*      */     
/* 1179 */     if (f2 < 0.25D) {
/* 1180 */       a(aw(), f2, 1.0F + (this.J.nextFloat() - this.J.nextFloat()) * 0.4F);
/*      */     } else {
/* 1182 */       a(ax(), f2, 1.0F + (this.J.nextFloat() - this.J.nextFloat()) * 0.4F);
/*      */     } 
/*      */     
/* 1185 */     float f3 = afm.c(cE()); int i;
/* 1186 */     for (i = 0; i < 1.0F + this.aC.a * 20.0F; i++) {
/* 1187 */       double d1 = (this.J.nextDouble() * 2.0D - 1.0D) * this.aC.a;
/* 1188 */       double d2 = (this.J.nextDouble() * 2.0D - 1.0D) * this.aC.a;
/* 1189 */       this.l.a(hh.e, cD() + d1, (f3 + 1.0F), cH() + d2, dcn1.b, dcn1.c - this.J.nextDouble() * 0.20000000298023224D, dcn1.d);
/*      */     } 
/* 1191 */     for (i = 0; i < 1.0F + this.aC.a * 20.0F; i++) {
/* 1192 */       double d1 = (this.J.nextDouble() * 2.0D - 1.0D) * this.aC.a;
/* 1193 */       double d2 = (this.J.nextDouble() * 2.0D - 1.0D) * this.aC.a;
/* 1194 */       this.l.a(hh.Z, cD() + d1, (f3 + 1.0F), cH() + d2, dcn1.b, dcn1.c, dcn1.d);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected ceh aN() {
/* 1199 */     return this.l.d_(ap());
/*      */   }
/*      */   
/*      */   public boolean aO() {
/* 1203 */     return (bA() && !aE() && !a_() && !bz() && !aQ() && aX());
/*      */   }
/*      */   
/*      */   protected void aP() {
/* 1207 */     int ☃ = afm.c(cD());
/* 1208 */     int i = afm.c(cE() - 0.20000000298023224D);
/* 1209 */     int j = afm.c(cH());
/* 1210 */     fx fx1 = new fx(☃, i, j);
/*      */     
/* 1212 */     ceh ceh = this.l.d_(fx1);
/* 1213 */     if (ceh.h() != bzh.a) {
/* 1214 */       dcn dcn1 = cC();
/* 1215 */       this.l.a(new hc(hh.d, ceh), cD() + (this.J.nextDouble() - 0.5D) * this.aC.a, cE() + 0.1D, cH() + (this.J.nextDouble() - 0.5D) * this.aC.a, dcn1.b * -4.0D, 1.5D, dcn1.d * -4.0D);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean a(ael<cuw> ☃) {
/* 1220 */     return (this.O == ☃);
/*      */   }
/*      */   
/*      */   public boolean aQ() {
/* 1224 */     return (!this.Q && this.M.getDouble(aef.c) > 0.0D);
/*      */   }
/*      */   
/*      */   public void a(float ☃, dcn dcn1) {
/* 1228 */     dcn dcn2 = a(dcn1, ☃, this.p);
/*      */     
/* 1230 */     f(cC().e(dcn2));
/*      */   }
/*      */   
/*      */   private static dcn a(dcn ☃, float f1, float f2) {
/* 1234 */     double d = ☃.g();
/* 1235 */     if (d < 1.0E-7D) {
/* 1236 */       return dcn.a;
/*      */     }
/*      */     
/* 1239 */     dcn dcn1 = ((d > 1.0D) ? ☃.d() : ☃).a(f1);
/*      */     
/* 1241 */     float f3 = afm.a(f2 * 0.017453292F);
/* 1242 */     float f4 = afm.b(f2 * 0.017453292F);
/* 1243 */     return new dcn(dcn1.b * f4 - dcn1.d * f3, dcn1.c, dcn1.d * f4 + dcn1.b * f3);
/*      */   }
/*      */ 
/*      */   
/*      */   public float aR() {
/* 1248 */     fx.a ☃ = new fx.a(cD(), 0.0D, cH());
/* 1249 */     if (this.l.C(☃)) {
/* 1250 */       ☃.p(afm.c(cG()));
/* 1251 */       return this.l.y(☃);
/*      */     } 
/* 1253 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public void a_(brx ☃) {
/* 1257 */     this.l = ☃;
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1, double d2, float f1, float f2) {
/* 1261 */     f(☃, d1, d2);
/*      */     
/* 1263 */     this.p = f1 % 360.0F;
/* 1264 */     this.q = afm.a(f2, -90.0F, 90.0F) % 360.0F;
/*      */     
/* 1266 */     this.r = this.p;
/* 1267 */     this.s = this.q;
/*      */   }
/*      */   
/*      */   public void f(double ☃, double d1, double d2) {
/* 1271 */     double d3 = afm.a(☃, -3.0E7D, 3.0E7D);
/* 1272 */     double d4 = afm.a(d2, -3.0E7D, 3.0E7D);
/*      */     
/* 1274 */     this.m = d3;
/* 1275 */     this.n = d1;
/* 1276 */     this.o = d4;
/*      */     
/* 1278 */     d(d3, d1, d4);
/*      */   }
/*      */   
/*      */   public void d(dcn ☃) {
/* 1282 */     b(☃.b, ☃.c, ☃.d);
/*      */   }
/*      */   
/*      */   public void b(double ☃, double d1, double d2) {
/* 1286 */     b(☃, d1, d2, this.p, this.q);
/*      */   }
/*      */   
/*      */   public void a(fx ☃, float f1, float f2) {
/* 1290 */     b(☃.u() + 0.5D, ☃.v(), ☃.w() + 0.5D, f1, f2);
/*      */   }
/*      */   
/*      */   public void b(double ☃, double d1, double d2, float f1, float f2) {
/* 1294 */     g(☃, d1, d2);
/*      */     
/* 1296 */     this.p = f1;
/* 1297 */     this.q = f2;
/* 1298 */     af();
/*      */   }
/*      */   
/*      */   public void g(double ☃, double d1, double d2) {
/* 1302 */     o(☃, d1, d2);
/* 1303 */     this.m = ☃;
/* 1304 */     this.n = d1;
/* 1305 */     this.o = d2;
/* 1306 */     this.D = ☃;
/* 1307 */     this.E = d1;
/* 1308 */     this.F = d2;
/*      */   }
/*      */   
/*      */   public float g(aqa ☃) {
/* 1312 */     float f1 = (float)(cD() - ☃.cD());
/* 1313 */     float f2 = (float)(cE() - ☃.cE());
/* 1314 */     float f3 = (float)(cH() - ☃.cH());
/* 1315 */     return afm.c(f1 * f1 + f2 * f2 + f3 * f3);
/*      */   }
/*      */   
/*      */   public double h(double ☃, double d1, double d2) {
/* 1319 */     double d3 = cD() - ☃;
/* 1320 */     double d4 = cE() - d1;
/* 1321 */     double d5 = cH() - d2;
/* 1322 */     return d3 * d3 + d4 * d4 + d5 * d5;
/*      */   }
/*      */   
/*      */   public double h(aqa ☃) {
/* 1326 */     return e(☃.cA());
/*      */   }
/*      */   
/*      */   public double e(dcn ☃) {
/* 1330 */     double d1 = cD() - ☃.b;
/* 1331 */     double d2 = cE() - ☃.c;
/* 1332 */     double d3 = cH() - ☃.d;
/* 1333 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a_(bfw ☃) {}
/*      */   
/*      */   public void i(aqa ☃) {
/* 1340 */     if (x(☃)) {
/*      */       return;
/*      */     }
/* 1343 */     if (☃.H || this.H) {
/*      */       return;
/*      */     }
/*      */     
/* 1347 */     double d1 = ☃.cD() - cD();
/* 1348 */     double d2 = ☃.cH() - cH();
/*      */     
/* 1350 */     double d3 = afm.a(d1, d2);
/*      */     
/* 1352 */     if (d3 >= 0.009999999776482582D) {
/* 1353 */       d3 = afm.a(d3);
/* 1354 */       d1 /= d3;
/* 1355 */       d2 /= d3;
/*      */       
/* 1357 */       double d = 1.0D / d3;
/* 1358 */       if (d > 1.0D) {
/* 1359 */         d = 1.0D;
/*      */       }
/* 1361 */       d1 *= d;
/* 1362 */       d2 *= d;
/*      */       
/* 1364 */       d1 *= 0.05000000074505806D;
/* 1365 */       d2 *= 0.05000000074505806D;
/*      */       
/* 1367 */       d1 *= (1.0F - this.I);
/* 1368 */       d2 *= (1.0F - this.I);
/*      */       
/* 1370 */       if (!bs()) {
/* 1371 */         i(-d1, 0.0D, -d2);
/*      */       }
/* 1373 */       if (!☃.bs()) {
/* 1374 */         ☃.i(d1, 0.0D, d2);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public void i(double ☃, double d1, double d2) {
/* 1380 */     f(cC().b(☃, d1, d2));
/* 1381 */     this.Z = true;
/*      */   }
/*      */   
/*      */   protected void aS() {
/* 1385 */     this.w = true;
/*      */   }
/*      */   
/*      */   public boolean a(apk ☃, float f) {
/* 1389 */     if (b(☃)) {
/* 1390 */       return false;
/*      */     }
/* 1392 */     aS();
/* 1393 */     return false;
/*      */   }
/*      */   
/*      */   public final dcn f(float ☃) {
/* 1397 */     return c(g(☃), h(☃));
/*      */   }
/*      */   
/*      */   public float g(float ☃) {
/* 1401 */     if (☃ == 1.0F) {
/* 1402 */       return this.q;
/*      */     }
/* 1404 */     return afm.g(☃, this.s, this.q);
/*      */   }
/*      */   
/*      */   public float h(float ☃) {
/* 1408 */     if (☃ == 1.0F) {
/* 1409 */       return this.p;
/*      */     }
/* 1411 */     return afm.g(☃, this.r, this.p);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected final dcn c(float ☃, float f1) {
/* 1417 */     float f2 = ☃ * 0.017453292F;
/* 1418 */     float f3 = -f1 * 0.017453292F;
/*      */     
/* 1420 */     float f4 = afm.b(f3);
/* 1421 */     float f5 = afm.a(f3);
/* 1422 */     float f6 = afm.b(f2);
/* 1423 */     float f7 = afm.a(f2);
/*      */     
/* 1425 */     return new dcn((f5 * f6), -f7, (f4 * f6));
/*      */   }
/*      */   
/*      */   public final dcn i(float ☃) {
/* 1429 */     return d(g(☃), h(☃));
/*      */   }
/*      */   
/*      */   protected final dcn d(float ☃, float f1) {
/* 1433 */     return c(☃ - 90.0F, f1);
/*      */   }
/*      */   
/*      */   public final dcn j(float ☃) {
/* 1437 */     if (☃ == 1.0F) {
/* 1438 */       return new dcn(cD(), cG(), cH());
/*      */     }
/* 1440 */     double d1 = afm.d(☃, this.m, cD());
/* 1441 */     double d2 = afm.d(☃, this.n, cE()) + ce();
/* 1442 */     double d3 = afm.d(☃, this.o, cH());
/*      */     
/* 1444 */     return new dcn(d1, d2, d3);
/*      */   }
/*      */   
/*      */   public dcn k(float ☃) {
/* 1448 */     return j(☃);
/*      */   }
/*      */   
/*      */   public final dcn l(float ☃) {
/* 1452 */     double d1 = afm.d(☃, this.m, cD());
/* 1453 */     double d2 = afm.d(☃, this.n, cE());
/* 1454 */     double d3 = afm.d(☃, this.o, cH());
/* 1455 */     return new dcn(d1, d2, d3);
/*      */   }
/*      */   
/*      */   public dcl a(double ☃, float f, boolean bool) {
/* 1459 */     dcn dcn1 = j(f);
/* 1460 */     dcn dcn2 = f(f);
/* 1461 */     dcn dcn3 = dcn1.b(dcn2.b * ☃, dcn2.c * ☃, dcn2.d * ☃);
/* 1462 */     return this.l.a(new brf(dcn1, dcn3, brf.a.b, bool ? brf.b.c : brf.b.a, this));
/*      */   }
/*      */   
/*      */   public boolean aT() {
/* 1466 */     return false;
/*      */   }
/*      */   
/*      */   public boolean aU() {
/* 1470 */     return false;
/*      */   }
/*      */   
/*      */   public void a(aqa ☃, int i, apk apk1) {
/* 1474 */     if (☃ instanceof aah) {
/* 1475 */       ac.c.a((aah)☃, this, apk1);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean j(double ☃, double d1, double d2) {
/* 1480 */     double d3 = cD() - ☃;
/* 1481 */     double d4 = cE() - d1;
/* 1482 */     double d5 = cH() - d2;
/* 1483 */     double d6 = d3 * d3 + d4 * d4 + d5 * d5;
/* 1484 */     return a(d6);
/*      */   }
/*      */   
/*      */   public boolean a(double ☃) {
/* 1488 */     double d = cc().a();
/* 1489 */     if (Double.isNaN(d)) {
/* 1490 */       d = 1.0D;
/*      */     }
/* 1492 */     d *= 64.0D * e;
/* 1493 */     return (☃ < d * d);
/*      */   }
/*      */   
/*      */   public boolean a_(md ☃) {
/* 1497 */     String str = aW();
/* 1498 */     if (this.y || str == null) {
/* 1499 */       return false;
/*      */     }
/* 1501 */     ☃.a("id", str);
/* 1502 */     e(☃);
/* 1503 */     return true;
/*      */   }
/*      */   
/*      */   public boolean d(md ☃) {
/* 1507 */     if (br()) {
/* 1508 */       return false;
/*      */     }
/* 1510 */     return a_(☃);
/*      */   }
/*      */   
/*      */   public md e(md ☃) {
/*      */     try {
/* 1515 */       if (this.ah != null) {
/*      */         
/* 1517 */         ☃.a("Pos", a(new double[] { this.ah.cD(), cE(), this.ah.cH() }));
/*      */       } else {
/* 1519 */         ☃.a("Pos", a(new double[] { cD(), cE(), cH() }));
/*      */       } 
/*      */       
/* 1522 */       dcn dcn1 = cC();
/* 1523 */       ☃.a("Motion", a(new double[] { dcn1.b, dcn1.c, dcn1.d }));
/* 1524 */       ☃.a("Rotation", a(new float[] { this.p, this.q }));
/*      */       
/* 1526 */       ☃.a("FallDistance", this.C);
/* 1527 */       ☃.a("Fire", (short)this.ao);
/* 1528 */       ☃.a("Air", (short)bI());
/* 1529 */       ☃.a("OnGround", this.t);
/* 1530 */       ☃.a("Invulnerable", this.ax);
/* 1531 */       ☃.b("PortalCooldown", this.aw);
/*      */       
/* 1533 */       ☃.a("UUID", bS());
/*      */       
/* 1535 */       nr nr = T();
/* 1536 */       if (nr != null) {
/* 1537 */         ☃.a("CustomName", nr.a.a(nr));
/*      */       }
/* 1539 */       if (bX()) {
/* 1540 */         ☃.a("CustomNameVisible", bX());
/*      */       }
/* 1542 */       if (aA()) {
/* 1543 */         ☃.a("Silent", aA());
/*      */       }
/* 1545 */       if (aB()) {
/* 1546 */         ☃.a("NoGravity", aB());
/*      */       }
/* 1548 */       if (this.af) {
/* 1549 */         ☃.a("Glowing", this.af);
/*      */       }
/* 1551 */       if (!this.ay.isEmpty()) {
/* 1552 */         mj mj = new mj();
/* 1553 */         for (String str : this.ay) {
/* 1554 */           mj.add(ms.a(str));
/*      */         }
/* 1556 */         ☃.a("Tags", mj);
/*      */       } 
/*      */       
/* 1559 */       b(☃);
/*      */       
/* 1561 */       if (bs()) {
/* 1562 */         mj mj = new mj();
/* 1563 */         for (aqa aqa1 : cn()) {
/* 1564 */           md md1 = new md();
/* 1565 */           if (aqa1.a_(md1)) {
/* 1566 */             mj.add(md1);
/*      */           }
/*      */         } 
/* 1569 */         if (!mj.isEmpty()) {
/* 1570 */           ☃.a("Passengers", mj);
/*      */         }
/*      */       } 
/* 1573 */     } catch (Throwable throwable) {
/* 1574 */       l l = l.a(throwable, "Saving entity NBT");
/* 1575 */       m m = l.a("Entity being saved");
/* 1576 */       a(m);
/* 1577 */       throw new u(l);
/*      */     } 
/*      */     
/* 1580 */     return ☃;
/*      */   }
/*      */   
/*      */   public void f(md ☃) {
/*      */     try {
/* 1585 */       mj mj1 = ☃.d("Pos", 6);
/* 1586 */       mj mj2 = ☃.d("Motion", 6);
/* 1587 */       mj mj3 = ☃.d("Rotation", 5);
/*      */       
/* 1589 */       double d1 = mj2.h(0);
/* 1590 */       double d2 = mj2.h(1);
/* 1591 */       double d3 = mj2.h(2);
/*      */ 
/*      */       
/* 1594 */       n(
/* 1595 */           (Math.abs(d1) > 10.0D) ? 0.0D : d1, 
/* 1596 */           (Math.abs(d2) > 10.0D) ? 0.0D : d2, 
/* 1597 */           (Math.abs(d3) > 10.0D) ? 0.0D : d3);
/*      */ 
/*      */       
/* 1600 */       g(mj1.h(0), mj1.h(1), mj1.h(2));
/*      */       
/* 1602 */       this.p = mj3.i(0);
/* 1603 */       this.q = mj3.i(1);
/* 1604 */       this.r = this.p;
/* 1605 */       this.s = this.q;
/*      */       
/* 1607 */       m(this.p);
/* 1608 */       n(this.p);
/*      */       
/* 1610 */       this.C = ☃.j("FallDistance");
/* 1611 */       this.ao = ☃.g("Fire");
/* 1612 */       j(☃.g("Air"));
/* 1613 */       this.t = ☃.q("OnGround");
/* 1614 */       this.ax = ☃.q("Invulnerable");
/* 1615 */       this.aw = ☃.h("PortalCooldown");
/*      */       
/* 1617 */       if (☃.b("UUID")) {
/* 1618 */         this.ad = ☃.a("UUID");
/* 1619 */         this.ae = this.ad.toString();
/*      */       } 
/*      */       
/* 1622 */       if (!Double.isFinite(cD()) || !Double.isFinite(cE()) || !Double.isFinite(cH())) {
/* 1623 */         throw new IllegalStateException("Entity has invalid position");
/*      */       }
/* 1625 */       if (!Double.isFinite(this.p) || !Double.isFinite(this.q)) {
/* 1626 */         throw new IllegalStateException("Entity has invalid rotation");
/*      */       }
/*      */       
/* 1629 */       af();
/* 1630 */       a(this.p, this.q);
/*      */       
/* 1632 */       if (☃.c("CustomName", 8)) {
/* 1633 */         String str = ☃.l("CustomName");
/*      */         try {
/* 1635 */           a(nr.a.a(str));
/* 1636 */         } catch (Exception exception) {
/* 1637 */           h.warn("Failed to parse entity custom name {}", str, exception);
/*      */         } 
/*      */       } 
/* 1640 */       n(☃.q("CustomNameVisible"));
/* 1641 */       d(☃.q("Silent"));
/* 1642 */       e(☃.q("NoGravity"));
/* 1643 */       i(☃.q("Glowing"));
/*      */       
/* 1645 */       if (☃.c("Tags", 9)) {
/* 1646 */         this.ay.clear();
/* 1647 */         mj mj = ☃.d("Tags", 8);
/* 1648 */         int i = Math.min(mj.size(), 1024);
/* 1649 */         for (int j = 0; j < i; j++) {
/* 1650 */           this.ay.add(mj.j(j));
/*      */         }
/*      */       } 
/*      */       
/* 1654 */       a(☃);
/*      */       
/* 1656 */       if (aV()) {
/* 1657 */         af();
/*      */       }
/* 1659 */     } catch (Throwable throwable) {
/* 1660 */       l l = l.a(throwable, "Loading entity NBT");
/* 1661 */       m m = l.a("Entity being loaded");
/* 1662 */       a(m);
/* 1663 */       throw new u(l);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected boolean aV() {
/* 1668 */     return true;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected final String aW() {
/* 1673 */     aqe<?> ☃ = X();
/* 1674 */     vk vk = aqe.a(☃);
/* 1675 */     return (!☃.a() || vk == null) ? null : vk.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected mj a(double... ☃) {
/* 1683 */     mj mj = new mj();
/* 1684 */     for (double d : ☃) {
/* 1685 */       mj.add(me.a(d));
/*      */     }
/* 1687 */     return mj;
/*      */   }
/*      */   
/*      */   protected mj a(float... ☃) {
/* 1691 */     mj mj = new mj();
/* 1692 */     for (float f : ☃) {
/* 1693 */       mj.add(mg.a(f));
/*      */     }
/* 1695 */     return mj;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public bcv a(brw ☃) {
/* 1700 */     return a(☃, 0);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public bcv a(brw ☃, int i) {
/* 1705 */     return a(new bmb(☃), i);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public bcv a(bmb ☃) {
/* 1710 */     return a(☃, 0.0F);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public bcv a(bmb ☃, float f) {
/* 1715 */     if (☃.a()) {
/* 1716 */       return null;
/*      */     }
/*      */     
/* 1719 */     if (this.l.v) {
/* 1720 */       return null;
/*      */     }
/* 1722 */     bcv bcv = new bcv(this.l, cD(), cE() + f, cH(), ☃);
/* 1723 */     bcv.m();
/* 1724 */     this.l.c(bcv);
/* 1725 */     return bcv;
/*      */   }
/*      */   
/*      */   public boolean aX() {
/* 1729 */     return !this.y;
/*      */   }
/*      */   
/*      */   public boolean aY() {
/* 1733 */     if (this.H) {
/* 1734 */       return false;
/*      */     }
/*      */     
/* 1737 */     float ☃ = 0.1F;
/* 1738 */     float f1 = this.aC.a * 0.8F;
/* 1739 */     dci dci1 = dci.g(f1, 0.10000000149011612D, f1).d(cD(), cG(), cH());
/* 1740 */     return this.l.b(this, dci1, (☃, fx1) -> ☃.o(this.l, fx1)).findAny().isPresent();
/*      */   }
/*      */ 
/*      */   
/*      */   public aou a(bfw ☃, aot aot1) {
/* 1745 */     return aou.c;
/*      */   }
/*      */   
/*      */   public boolean j(aqa ☃) {
/* 1749 */     return (☃.aZ() && !x(☃));
/*      */   }
/*      */   
/*      */   public boolean aZ() {
/* 1753 */     return false;
/*      */   }
/*      */   
/*      */   public void ba() {
/* 1757 */     f(dcn.a);
/* 1758 */     j();
/* 1759 */     if (!br()) {
/*      */       return;
/*      */     }
/*      */     
/* 1763 */     ct().k(this);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void k(aqa ☃) {
/* 1771 */     a(☃, aqa::d);
/*      */   }
/*      */   
/*      */   private void a(aqa ☃, a a1) {
/* 1775 */     if (!w(☃)) {
/*      */       return;
/*      */     }
/* 1778 */     double d = cE() + bc() + ☃.bb();
/* 1779 */     a1.accept(☃, cD(), d, cH());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void l(aqa ☃) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double bb() {
/* 1791 */     return 0.0D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double bc() {
/* 1799 */     return this.aC.b * 0.75D;
/*      */   }
/*      */   
/*      */   public boolean m(aqa ☃) {
/* 1803 */     return a(☃, false);
/*      */   }
/*      */   
/*      */   public boolean bd() {
/* 1807 */     return this instanceof aqm;
/*      */   }
/*      */   
/*      */   public boolean a(aqa ☃, boolean bool) {
/* 1811 */     aqa aqa1 = ☃;
/* 1812 */     while (aqa1.ah != null) {
/* 1813 */       if (aqa1.ah == this) {
/* 1814 */         return false;
/*      */       }
/*      */       
/* 1817 */       aqa1 = aqa1.ah;
/*      */     } 
/*      */     
/* 1820 */     if (!bool && (!n(☃) || !☃.q(this))) {
/* 1821 */       return false;
/*      */     }
/*      */     
/* 1824 */     if (br()) {
/* 1825 */       l();
/*      */     }
/*      */     
/* 1828 */     b(aqx.a);
/* 1829 */     this.ah = ☃;
/* 1830 */     this.ah.o(this);
/*      */     
/* 1832 */     return true;
/*      */   }
/*      */   
/*      */   protected boolean n(aqa ☃) {
/* 1836 */     return (!bu() && this.j <= 0);
/*      */   }
/*      */   
/*      */   protected boolean c(aqx ☃) {
/* 1840 */     return this.l.a_(this, d(☃).h(1.0E-7D));
/*      */   }
/*      */   
/*      */   public void be() {
/* 1844 */     for (int ☃ = this.ag.size() - 1; ☃ >= 0; ☃--) {
/* 1845 */       ((aqa)this.ag.get(☃)).l();
/*      */     }
/*      */   }
/*      */   
/*      */   public void bf() {
/* 1850 */     if (this.ah != null) {
/* 1851 */       aqa ☃ = this.ah;
/* 1852 */       this.ah = null;
/* 1853 */       ☃.p(this);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void l() {
/* 1858 */     bf();
/*      */   }
/*      */   
/*      */   protected void o(aqa ☃) {
/* 1862 */     if (☃.ct() != this) {
/* 1863 */       throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
/*      */     }
/*      */     
/* 1866 */     if (!this.l.v && ☃ instanceof bfw && !(cm() instanceof bfw)) {
/* 1867 */       this.ag.add(0, ☃);
/*      */     } else {
/* 1869 */       this.ag.add(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void p(aqa ☃) {
/* 1874 */     if (☃.ct() == this) {
/* 1875 */       throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
/*      */     }
/*      */     
/* 1878 */     this.ag.remove(☃);
/* 1879 */     ☃.j = 60;
/*      */   }
/*      */   
/*      */   protected boolean q(aqa ☃) {
/* 1883 */     return (cn().size() < 1);
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1, double d2, float f1, float f2, int i, boolean bool) {
/* 1887 */     d(☃, d1, d2);
/* 1888 */     a(f1, f2);
/*      */   }
/*      */   
/*      */   public void a(float ☃, int i) {
/* 1892 */     m(☃);
/*      */   }
/*      */   
/*      */   public float bg() {
/* 1896 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public dcn bh() {
/* 1900 */     return c(this.q, this.p);
/*      */   }
/*      */   
/*      */   public dcm bi() {
/* 1904 */     return new dcm(this.q, this.p);
/*      */   }
/*      */   
/*      */   public dcn bj() {
/* 1908 */     return dcn.a(bi());
/*      */   }
/*      */   
/*      */   public void d(fx ☃) {
/* 1912 */     if (ai()) {
/* 1913 */       ah();
/*      */       
/*      */       return;
/*      */     } 
/* 1917 */     if (!this.l.v && !☃.equals(this.ac)) {
/* 1918 */       this.ac = ☃.h();
/*      */     }
/*      */     
/* 1921 */     this.aa = true;
/*      */   }
/*      */   
/*      */   protected void bk() {
/* 1925 */     if (!(this.l instanceof aag)) {
/*      */       return;
/*      */     }
/* 1928 */     int ☃ = aj();
/* 1929 */     aag aag = (aag)this.l;
/*      */     
/* 1931 */     if (this.aa) {
/* 1932 */       MinecraftServer minecraftServer = aag.l();
/* 1933 */       vj<brx> vj = (this.l.Y() == brx.h) ? brx.g : brx.h;
/* 1934 */       aag aag1 = minecraftServer.a(vj);
/*      */       
/* 1936 */       if (aag1 != null && minecraftServer.C() && !br() && this.ab++ >= ☃) {
/* 1937 */         this.l.Z().a("portal");
/*      */         
/* 1939 */         this.ab = ☃;
/* 1940 */         ah();
/*      */         
/* 1942 */         b(aag1);
/*      */         
/* 1944 */         this.l.Z().c();
/*      */       } 
/* 1946 */       this.aa = false;
/*      */     } else {
/* 1948 */       if (this.ab > 0) {
/* 1949 */         this.ab -= 4;
/*      */       }
/* 1951 */       if (this.ab < 0) {
/* 1952 */         this.ab = 0;
/*      */       }
/*      */     } 
/* 1955 */     E();
/*      */   }
/*      */   
/*      */   public int bl() {
/* 1959 */     return 300;
/*      */   }
/*      */   
/*      */   public void k(double ☃, double d1, double d2) {
/* 1963 */     n(☃, d1, d2);
/*      */   }
/*      */   
/*      */   public void a(byte ☃) {
/* 1967 */     switch (☃) {
/*      */       case 53:
/* 1969 */         bxk.a(this);
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void bm() {}
/*      */   
/*      */   public Iterable<bmb> bn() {
/* 1978 */     return c;
/*      */   }
/*      */   
/*      */   public Iterable<bmb> bo() {
/* 1982 */     return c;
/*      */   }
/*      */   
/*      */   public Iterable<bmb> bp() {
/* 1986 */     return Iterables.concat(bn(), bo());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqf ☃, bmb bmb1) {}
/*      */ 
/*      */   
/*      */   public boolean bq() {
/* 1994 */     boolean ☃ = (this.l != null && this.l.v);
/*      */     
/* 1996 */     return (!aD() && (this.ao > 0 || (☃ && i(0))));
/*      */   }
/*      */   
/*      */   public boolean br() {
/* 2000 */     return (ct() != null);
/*      */   }
/*      */   
/*      */   public boolean bs() {
/* 2004 */     return !cn().isEmpty();
/*      */   }
/*      */   
/*      */   public boolean bt() {
/* 2008 */     return true;
/*      */   }
/*      */   
/*      */   public void f(boolean ☃) {
/* 2012 */     b(1, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean bu() {
/* 2017 */     return i(1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bv() {
/* 2024 */     return bu();
/*      */   }
/*      */   
/*      */   public boolean bw() {
/* 2028 */     return bu();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bx() {
/* 2035 */     return bu();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean by() {
/* 2042 */     return bu();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bz() {
/* 2049 */     return (ae() == aqx.f);
/*      */   }
/*      */   
/*      */   public boolean bA() {
/* 2053 */     return i(3);
/*      */   }
/*      */   
/*      */   public void g(boolean ☃) {
/* 2057 */     b(3, ☃);
/*      */   }
/*      */   
/*      */   public boolean bB() {
/* 2061 */     return i(4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean bC() {
/* 2071 */     return (ae() == aqx.d);
/*      */   }
/*      */   
/*      */   public boolean bD() {
/* 2075 */     return (bC() && !aE());
/*      */   }
/*      */   
/*      */   public void h(boolean ☃) {
/* 2079 */     b(4, ☃);
/*      */   }
/*      */   
/*      */   public boolean bE() {
/* 2083 */     return (this.af || (this.l.v && i(6)));
/*      */   }
/*      */   
/*      */   public void i(boolean ☃) {
/* 2087 */     this.af = ☃;
/* 2088 */     if (!this.l.v) {
/* 2089 */       b(6, this.af);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean bF() {
/* 2094 */     return i(5);
/*      */   }
/*      */   
/*      */   public boolean c(bfw ☃) {
/* 2098 */     if (☃.a_()) {
/* 2099 */       return false;
/*      */     }
/* 2101 */     ddp ddp = bG();
/* 2102 */     if (ddp != null && ☃ != null && ☃.bG() == ddp && ddp.i()) {
/* 2103 */       return false;
/*      */     }
/* 2105 */     return bF();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public ddp bG() {
/* 2110 */     return this.l.G().i(bU());
/*      */   }
/*      */   
/*      */   public boolean r(aqa ☃) {
/* 2114 */     return a(☃.bG());
/*      */   }
/*      */   
/*      */   public boolean a(ddp ☃) {
/* 2118 */     if (bG() != null) {
/* 2119 */       return bG().a(☃);
/*      */     }
/* 2121 */     return false;
/*      */   }
/*      */   
/*      */   public void j(boolean ☃) {
/* 2125 */     b(5, ☃);
/*      */   }
/*      */   
/*      */   protected boolean i(int ☃) {
/* 2129 */     return ((((Byte)this.R.<Byte>a(S)).byteValue() & 1 << ☃) != 0);
/*      */   }
/*      */   
/*      */   protected void b(int ☃, boolean bool) {
/* 2133 */     byte b = ((Byte)this.R.<Byte>a(S)).byteValue();
/* 2134 */     if (bool) {
/* 2135 */       this.R.b(S, Byte.valueOf((byte)(b | 1 << ☃)));
/*      */     } else {
/* 2137 */       this.R.b(S, Byte.valueOf((byte)(b & (1 << ☃ ^ 0xFFFFFFFF))));
/*      */     } 
/*      */   }
/*      */   
/*      */   public int bH() {
/* 2142 */     return 300;
/*      */   }
/*      */   
/*      */   public int bI() {
/* 2146 */     return ((Integer)this.R.<Integer>a(ap)).intValue();
/*      */   }
/*      */   
/*      */   public void j(int ☃) {
/* 2150 */     this.R.b(ap, Integer.valueOf(☃));
/*      */   }
/*      */   
/*      */   public void a(aag ☃, aql aql1) {
/* 2154 */     g(this.ao + 1);
/* 2155 */     if (this.ao == 0) {
/* 2156 */       f(8);
/*      */     }
/* 2158 */     a(apk.b, 5.0F);
/*      */   }
/*      */   public void k(boolean ☃) {
/*      */     double d;
/* 2162 */     dcn dcn1 = cC();
/*      */     
/* 2164 */     if (☃) {
/* 2165 */       d = Math.max(-0.9D, dcn1.c - 0.03D);
/*      */     } else {
/* 2167 */       d = Math.min(1.8D, dcn1.c + 0.1D);
/*      */     } 
/* 2169 */     n(dcn1.b, d, dcn1.d);
/*      */   }
/*      */   public void l(boolean ☃) {
/*      */     double d;
/* 2173 */     dcn dcn1 = cC();
/*      */     
/* 2175 */     if (☃) {
/* 2176 */       d = Math.max(-0.3D, dcn1.c - 0.03D);
/*      */     } else {
/* 2178 */       d = Math.min(0.7D, dcn1.c + 0.06D);
/*      */     } 
/* 2180 */     n(dcn1.b, d, dcn1.d);
/* 2181 */     this.C = 0.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aag ☃, aqm aqm1) {}
/*      */   
/*      */   protected void l(double ☃, double d1, double d2) {
/* 2188 */     fx fx1 = new fx(☃, d1, d2);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2193 */     dcn dcn1 = new dcn(☃ - fx1.u(), d1 - fx1.v(), d2 - fx1.w());
/*      */ 
/*      */     
/* 2196 */     fx.a a = new fx.a();
/* 2197 */     gc gc = gc.b;
/* 2198 */     double d = Double.MAX_VALUE;
/* 2199 */     for (gc gc1 : new gc[] { gc.c, gc.d, gc.e, gc.f, gc.b }) {
/* 2200 */       a.a(fx1, gc1);
/* 2201 */       if (!this.l.d_(a).r(this.l, a)) {
/* 2202 */         double d3 = dcn1.a(gc1.n());
/* 2203 */         double d4 = (gc1.e() == gc.b.a) ? (1.0D - d3) : d3;
/* 2204 */         if (d4 < d) {
/* 2205 */           d = d4;
/* 2206 */           gc = gc1;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2211 */     float f1 = this.J.nextFloat() * 0.2F + 0.1F;
/* 2212 */     float f2 = gc.e().a();
/*      */     
/* 2214 */     dcn dcn2 = cC().a(0.75D);
/* 2215 */     if (gc.n() == gc.a.a) {
/* 2216 */       n((f2 * f1), dcn2.c, dcn2.d);
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 2221 */     else if (gc.n() == gc.a.b) {
/* 2222 */       n(dcn2.b, (f2 * f1), dcn2.d);
/*      */ 
/*      */ 
/*      */     
/*      */     }
/* 2227 */     else if (gc.n() == gc.a.c) {
/* 2228 */       n(dcn2.b, dcn2.c, (f2 * f1));
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ceh ☃, dcn dcn1) {
/* 2237 */     this.C = 0.0F;
/* 2238 */     this.x = dcn1;
/*      */   }
/*      */   
/*      */   private static nr b(nr ☃) {
/* 2242 */     nx nx = ☃.g().a(☃.c().a((np)null));
/* 2243 */     for (nr nr1 : ☃.b()) {
/* 2244 */       nx.a(b(nr1));
/*      */     }
/* 2246 */     return nx;
/*      */   }
/*      */ 
/*      */   
/*      */   public nr R() {
/* 2251 */     nr ☃ = T();
/* 2252 */     if (☃ != null) {
/* 2253 */       return b(☃);
/*      */     }
/* 2255 */     return bJ();
/*      */   }
/*      */   
/*      */   protected nr bJ() {
/* 2259 */     return this.f.g();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean s(aqa ☃) {
/* 2264 */     return (this == ☃);
/*      */   }
/*      */   
/*      */   public float bK() {
/* 2268 */     return 0.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   public void m(float ☃) {}
/*      */ 
/*      */   
/*      */   public void n(float ☃) {}
/*      */   
/*      */   public boolean bL() {
/* 2278 */     return true;
/*      */   }
/*      */   
/*      */   public boolean t(aqa ☃) {
/* 2282 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/* 2287 */     return String.format(Locale.ROOT, "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", new Object[] { getClass().getSimpleName(), R().getString(), Integer.valueOf(this.g), (this.l == null) ? "~NULL~" : this.l.toString(), Double.valueOf(cD()), Double.valueOf(cE()), Double.valueOf(cH()) });
/*      */   }
/*      */   
/*      */   public boolean b(apk ☃) {
/* 2291 */     return (this.ax && ☃ != apk.m && !☃.v());
/*      */   }
/*      */   
/*      */   public boolean bM() {
/* 2295 */     return this.ax;
/*      */   }
/*      */   
/*      */   public void m(boolean ☃) {
/* 2299 */     this.ax = ☃;
/*      */   }
/*      */   
/*      */   public void u(aqa ☃) {
/* 2303 */     b(☃.cD(), ☃.cE(), ☃.cH(), ☃.p, ☃.q);
/*      */   }
/*      */   
/*      */   public void v(aqa ☃) {
/* 2307 */     md md = ☃.e(new md());
/* 2308 */     md.r("Dimension");
/* 2309 */     f(md);
/* 2310 */     this.aw = ☃.aw;
/* 2311 */     this.ac = ☃.ac;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aqa b(aag ☃) {
/* 2316 */     if (!(this.l instanceof aag) || this.y) {
/* 2317 */       return null;
/*      */     }
/* 2319 */     this.l.Z().a("changeDimension");
/*      */     
/* 2321 */     V();
/* 2322 */     this.l.Z().a("reposition");
/*      */     
/* 2324 */     cxm cxm = a(☃);
/* 2325 */     if (cxm == null) {
/* 2326 */       return null;
/*      */     }
/*      */     
/* 2329 */     this.l.Z().b("reloading");
/* 2330 */     aqa aqa1 = (aqa)X().a(☃);
/*      */     
/* 2332 */     if (aqa1 != null) {
/* 2333 */       aqa1.v(this);
/*      */       
/* 2335 */       aqa1.b(cxm.a.b, cxm.a.c, cxm.a.d, cxm.c, aqa1.q);
/* 2336 */       aqa1.f(cxm.b);
/*      */       
/* 2338 */       ☃.e(aqa1);
/*      */       
/* 2340 */       if (☃.Y() == brx.i) {
/* 2341 */         aag.a(☃);
/*      */       }
/*      */     } 
/* 2344 */     bN();
/* 2345 */     this.l.Z().c();
/*      */     
/* 2347 */     ((aag)this.l).p_();
/* 2348 */     ☃.p_();
/* 2349 */     this.l.Z().c();
/* 2350 */     return aqa1;
/*      */   }
/*      */   
/*      */   protected void bN() {
/* 2354 */     this.y = true;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   protected cxm a(aag ☃) {
/* 2359 */     boolean bool1 = (this.l.Y() == brx.i && ☃.Y() == brx.g);
/* 2360 */     boolean bool2 = (☃.Y() == brx.i);
/*      */     
/* 2362 */     if (bool1 || bool2) {
/*      */       fx fx2;
/* 2364 */       if (bool2) {
/* 2365 */         fx2 = aag.a;
/*      */       } else {
/* 2367 */         fx2 = ☃.a(chn.a.f, ☃.u());
/*      */       } 
/*      */       
/* 2370 */       return new cxm(new dcn(fx2
/* 2371 */             .u() + 0.5D, fx2.v(), fx2.w() + 0.5D), 
/* 2372 */           cC(), this.p, this.q);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2379 */     boolean bool3 = (☃.Y() == brx.h);
/* 2380 */     if (this.l.Y() != brx.h && !bool3) {
/* 2381 */       return null;
/*      */     }
/*      */     
/* 2384 */     cfu cfu = ☃.f();
/* 2385 */     double d1 = Math.max(-2.9999872E7D, cfu.e() + 16.0D);
/* 2386 */     double d2 = Math.max(-2.9999872E7D, cfu.f() + 16.0D);
/* 2387 */     double d3 = Math.min(2.9999872E7D, cfu.g() - 16.0D);
/* 2388 */     double d4 = Math.min(2.9999872E7D, cfu.h() - 16.0D);
/*      */     
/* 2390 */     double d5 = chd.a(this.l.k(), ☃.k());
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2395 */     fx fx1 = new fx(afm.a(cD() * d5, d1, d3), cE(), afm.a(cH() * d5, d2, d4));
/*      */ 
/*      */     
/* 2398 */     return a(☃, fx1, bool3)
/* 2399 */       .<cxm>map(a1 -> {
/*      */           gc.a a2;
/*      */           
/*      */           dcn dcn1;
/*      */           
/*      */           ceh ceh = this.l.d_(this.ac);
/*      */           
/*      */           if (ceh.b(cex.E)) {
/*      */             a2 = (gc.a)ceh.c(cex.E);
/*      */             
/*      */             i.a a3 = i.a(this.ac, a2, 21, gc.a.b, 21, ());
/*      */             
/*      */             dcn1 = a(a2, a3);
/*      */           } else {
/*      */             a2 = gc.a.a;
/*      */             dcn1 = new dcn(0.5D, 0.0D, 0.0D);
/*      */           } 
/*      */           return cxn.a(☃, a1, a2, dcn1, a(ae()), cC(), this.p, this.q);
/* 2417 */         }).orElse(null);
/*      */   }
/*      */ 
/*      */   
/*      */   protected dcn a(gc.a ☃, i.a a1) {
/* 2422 */     return cxn.a(a1, ☃, cA(), a(ae()));
/*      */   }
/*      */   
/*      */   protected Optional<i.a> a(aag ☃, fx fx1, boolean bool) {
/* 2426 */     return ☃.m().a(fx1, bool);
/*      */   }
/*      */   
/*      */   public boolean bO() {
/* 2430 */     return true;
/*      */   }
/*      */   
/*      */   public float a(brp ☃, brc brc1, fx fx1, ceh ceh1, cux cux1, float f) {
/* 2434 */     return f;
/*      */   }
/*      */   
/*      */   public boolean a(brp ☃, brc brc1, fx fx1, ceh ceh1, float f) {
/* 2438 */     return true;
/*      */   }
/*      */   
/*      */   public int bP() {
/* 2442 */     return 3;
/*      */   }
/*      */   
/*      */   public boolean bQ() {
/* 2446 */     return false;
/*      */   }
/*      */   
/*      */   public void a(m ☃) {
/* 2450 */     ☃.a("Entity Type", () -> aqe.a(X()) + " (" + getClass().getCanonicalName() + ")");
/* 2451 */     ☃.a("Entity ID", Integer.valueOf(this.g));
/* 2452 */     ☃.a("Entity Name", () -> R().getString());
/* 2453 */     ☃.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", new Object[] { Double.valueOf(cD()), Double.valueOf(cE()), Double.valueOf(cH()) }));
/* 2454 */     ☃.a("Entity's Block location", m.a(afm.c(cD()), afm.c(cE()), afm.c(cH())));
/* 2455 */     dcn dcn1 = cC();
/* 2456 */     ☃.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", new Object[] { Double.valueOf(dcn1.b), Double.valueOf(dcn1.c), Double.valueOf(dcn1.d) }));
/* 2457 */     ☃.a("Entity's Passengers", () -> cn().toString());
/* 2458 */     ☃.a("Entity's Vehicle", () -> ct().toString());
/*      */   }
/*      */   
/*      */   public boolean bR() {
/* 2462 */     return (bq() && !a_());
/*      */   }
/*      */   
/*      */   public void a_(UUID ☃) {
/* 2466 */     this.ad = ☃;
/* 2467 */     this.ae = this.ad.toString();
/*      */   }
/*      */   
/*      */   public UUID bS() {
/* 2471 */     return this.ad;
/*      */   }
/*      */   
/*      */   public String bT() {
/* 2475 */     return this.ae;
/*      */   }
/*      */   
/*      */   public String bU() {
/* 2479 */     return this.ae;
/*      */   }
/*      */   
/*      */   public boolean bV() {
/* 2483 */     return true;
/*      */   }
/*      */   
/*      */   public static double bW() {
/* 2487 */     return e;
/*      */   }
/*      */   
/*      */   public static void b(double ☃) {
/* 2491 */     e = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public nr d() {
/* 2496 */     return ddl.a(bG(), R()).a(☃ -> ☃.a(cb()).a(bT()));
/*      */   }
/*      */   
/*      */   public void a(@Nullable nr ☃) {
/* 2500 */     this.R.b(aq, Optional.ofNullable(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public nr T() {
/* 2506 */     return ((Optional<nr>)this.R.<Optional<nr>>a(aq)).orElse(null);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean S() {
/* 2511 */     return ((Optional)this.R.<Optional>a((us)aq)).isPresent();
/*      */   }
/*      */   
/*      */   public void n(boolean ☃) {
/* 2515 */     this.R.b(ar, Boolean.valueOf(☃));
/*      */   }
/*      */   
/*      */   public boolean bX() {
/* 2519 */     return ((Boolean)this.R.<Boolean>a(ar)).booleanValue();
/*      */   }
/*      */   
/*      */   public final void m(double ☃, double d1, double d2) {
/* 2523 */     if (!(this.l instanceof aag)) {
/*      */       return;
/*      */     }
/* 2526 */     brd brd = new brd(new fx(☃, d1, d2));
/* 2527 */     ((aag)this.l).i().a(aal.g, brd, 0, Integer.valueOf(Y()));
/*      */     
/* 2529 */     this.l.d(brd.b, brd.c);
/*      */     
/* 2531 */     a(☃, d1, d2);
/*      */   }
/*      */   
/*      */   public void a(double ☃, double d1, double d2) {
/* 2535 */     if (!(this.l instanceof aag)) {
/*      */       return;
/*      */     }
/* 2538 */     aag aag = (aag)this.l;
/* 2539 */     b(☃, d1, d2, this.p, this.q);
/* 2540 */     cp().forEach(aqa1 -> {
/*      */           ☃.b(aqa1);
/*      */           aqa1.az = true;
/*      */           for (aqa aqa2 : aqa1.ag) {
/*      */             aqa1.a(aqa2, aqa::b);
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public boolean bY() {
/* 2550 */     return bX();
/*      */   }
/*      */   
/*      */   public void a(us<?> ☃) {
/* 2554 */     if (T.equals(☃)) {
/* 2555 */       x_();
/*      */     }
/*      */   }
/*      */   
/*      */   public void x_() {
/* 2560 */     aqb ☃ = this.aC;
/* 2561 */     aqx aqx = ae();
/* 2562 */     aqb aqb1 = a(aqx);
/*      */     
/* 2564 */     this.aC = aqb1;
/* 2565 */     this.aD = a(aqx, aqb1);
/*      */     
/* 2567 */     if (aqb1.a < ☃.a) {
/* 2568 */       double d = aqb1.a / 2.0D;
/* 2569 */       a(new dci(cD() - d, cE(), cH() - d, cD() + d, cE() + aqb1.b, cH() + d));
/*      */       
/*      */       return;
/*      */     } 
/* 2573 */     dci dci1 = cc();
/* 2574 */     a(new dci(dci1.a, dci1.b, dci1.c, dci1.a + aqb1.a, dci1.b + aqb1.b, dci1.c + aqb1.a));
/*      */     
/* 2576 */     if (aqb1.a > ☃.a && !this.Q && !this.l.v) {
/* 2577 */       float f = ☃.a - aqb1.a;
/* 2578 */       a(aqr.a, new dcn(f, 0.0D, f));
/*      */     } 
/*      */   }
/*      */   
/*      */   public gc bZ() {
/* 2583 */     return gc.a(this.p);
/*      */   }
/*      */   
/*      */   public gc ca() {
/* 2587 */     return bZ();
/*      */   }
/*      */   
/*      */   protected nv cb() {
/* 2591 */     return new nv((nv.a)nv.a.c, (T)new nv.b(X(), bS(), R()));
/*      */   }
/*      */   
/*      */   public boolean a(aah ☃) {
/* 2595 */     return true;
/*      */   }
/*      */   
/*      */   public dci cc() {
/* 2599 */     return this.al;
/*      */   }
/*      */   
/*      */   public dci cd() {
/* 2603 */     return cc();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected dci d(aqx ☃) {
/* 2610 */     aqb aqb1 = a(☃);
/*      */     
/* 2612 */     float f = aqb1.a / 2.0F;
/* 2613 */     dcn dcn1 = new dcn(cD() - f, cE(), cH() - f);
/* 2614 */     dcn dcn2 = new dcn(cD() + f, cE() + aqb1.b, cH() + f);
/* 2615 */     return new dci(dcn1, dcn2);
/*      */   }
/*      */   
/*      */   public void a(dci ☃) {
/* 2619 */     this.al = ☃;
/*      */   }
/*      */   
/*      */   protected float a(aqx ☃, aqb aqb1) {
/* 2623 */     return aqb1.b * 0.85F;
/*      */   }
/*      */   
/*      */   public float e(aqx ☃) {
/* 2627 */     return a(☃, a(☃));
/*      */   }
/*      */   
/*      */   public final float ce() {
/* 2631 */     return this.aD;
/*      */   }
/*      */   
/*      */   public dcn cf() {
/* 2635 */     return new dcn(0.0D, ce(), (cy() * 0.4F));
/*      */   }
/*      */   
/*      */   public boolean a_(int ☃, bmb bmb1) {
/* 2639 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nr ☃, UUID uUID) {}
/*      */ 
/*      */   
/*      */   public brx cg() {
/* 2647 */     return this.l;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public MinecraftServer ch() {
/* 2652 */     return this.l.l();
/*      */   }
/*      */   
/*      */   public aou a(bfw ☃, dcn dcn1, aot aot1) {
/* 2656 */     return aou.c;
/*      */   }
/*      */   
/*      */   public boolean ci() {
/* 2660 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(aqm ☃, aqa aqa1) {
/* 2667 */     if (aqa1 instanceof aqm) {
/* 2668 */       bpu.a((aqm)aqa1, ☃);
/*      */     }
/* 2670 */     bpu.b(☃, aqa1);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(aah ☃) {}
/*      */ 
/*      */   
/*      */   public void c(aah ☃) {}
/*      */   
/*      */   public float a(bzm ☃) {
/* 2680 */     float f = afm.g(this.p);
/* 2681 */     switch (null.a[☃.ordinal()]) {
/*      */       case 1:
/* 2683 */         return f + 180.0F;
/*      */       case 2:
/* 2685 */         return f + 270.0F;
/*      */       case 3:
/* 2687 */         return f + 90.0F;
/*      */     } 
/* 2689 */     return f;
/*      */   }
/*      */ 
/*      */   
/*      */   public float a(byg ☃) {
/* 2694 */     float f = afm.g(this.p);
/* 2695 */     switch (null.b[☃.ordinal()]) {
/*      */       case 1:
/* 2697 */         return -f;
/*      */       case 2:
/* 2699 */         return 180.0F - f;
/*      */     } 
/* 2701 */     return f;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean cj() {
/* 2706 */     return false;
/*      */   }
/*      */   
/*      */   public boolean ck() {
/* 2710 */     boolean ☃ = this.az;
/* 2711 */     this.az = false;
/* 2712 */     return ☃;
/*      */   }
/*      */   
/*      */   public boolean cl() {
/* 2716 */     boolean ☃ = this.au;
/* 2717 */     this.au = false;
/* 2718 */     return ☃;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aqa cm() {
/* 2723 */     return null;
/*      */   }
/*      */   
/*      */   public List<aqa> cn() {
/* 2727 */     if (this.ag.isEmpty()) {
/* 2728 */       return Collections.emptyList();
/*      */     }
/* 2730 */     return Lists.newArrayList(this.ag);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean w(aqa ☃) {
/* 2735 */     for (aqa aqa1 : cn()) {
/* 2736 */       if (aqa1.equals(☃)) {
/* 2737 */         return true;
/*      */       }
/*      */     } 
/* 2740 */     return false;
/*      */   }
/*      */   
/*      */   public boolean a(Class<? extends aqa> ☃) {
/* 2744 */     for (aqa aqa1 : cn()) {
/* 2745 */       if (☃.isAssignableFrom(aqa1.getClass())) {
/* 2746 */         return true;
/*      */       }
/*      */     } 
/* 2749 */     return false;
/*      */   }
/*      */   
/*      */   public Collection<aqa> co() {
/* 2753 */     Set<aqa> ☃ = Sets.newHashSet();
/* 2754 */     for (aqa aqa1 : cn()) {
/* 2755 */       ☃.add(aqa1);
/* 2756 */       aqa1.a(false, ☃);
/*      */     } 
/* 2758 */     return ☃;
/*      */   }
/*      */   
/*      */   public Stream<aqa> cp() {
/* 2762 */     return Stream.concat(Stream.of(this), this.ag.stream().flatMap(aqa::cp));
/*      */   }
/*      */   
/*      */   public boolean cq() {
/* 2766 */     Set<aqa> ☃ = Sets.newHashSet();
/* 2767 */     a(true, ☃);
/* 2768 */     return (☃.size() == 1);
/*      */   }
/*      */   
/*      */   private void a(boolean ☃, Set<aqa> set) {
/* 2772 */     for (aqa aqa1 : cn()) {
/*      */       
/* 2774 */       if (!☃ || aah.class.isAssignableFrom(aqa1.getClass())) {
/* 2775 */         set.add(aqa1);
/*      */       }
/* 2777 */       aqa1.a(☃, set);
/*      */     } 
/*      */   }
/*      */   
/*      */   public aqa cr() {
/* 2782 */     aqa ☃ = this;
/* 2783 */     while (☃.br()) {
/* 2784 */       ☃ = ☃.ct();
/*      */     }
/* 2786 */     return ☃;
/*      */   }
/*      */   
/*      */   public boolean x(aqa ☃) {
/* 2790 */     return (cr() == ☃.cr());
/*      */   }
/*      */   
/*      */   public boolean y(aqa ☃) {
/* 2794 */     for (aqa aqa1 : cn()) {
/* 2795 */       if (aqa1.equals(☃)) {
/* 2796 */         return true;
/*      */       }
/* 2798 */       if (aqa1.y(☃)) {
/* 2799 */         return true;
/*      */       }
/*      */     } 
/* 2802 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean cs() {
/* 2807 */     aqa ☃ = cm();
/* 2808 */     if (☃ instanceof bfw) {
/* 2809 */       return ((bfw)☃).ez();
/*      */     }
/* 2811 */     return !this.l.v;
/*      */   }
/*      */ 
/*      */   
/*      */   protected static dcn a(double ☃, double d1, float f) {
/* 2816 */     double d = (☃ + d1 + 9.999999747378752E-6D) / 2.0D;
/*      */     
/* 2818 */     float f1 = -afm.a(f * 0.017453292F);
/* 2819 */     float f2 = afm.b(f * 0.017453292F);
/*      */     
/* 2821 */     float f3 = Math.max(Math.abs(f1), Math.abs(f2));
/*      */     
/* 2823 */     return new dcn(f1 * d / f3, 0.0D, f2 * d / f3);
/*      */   }
/*      */   
/*      */   public dcn b(aqm ☃) {
/* 2827 */     return new dcn(cD(), (cc()).e, cH());
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aqa ct() {
/* 2832 */     return this.ah;
/*      */   }
/*      */   
/*      */   public cvc y_() {
/* 2836 */     return cvc.a;
/*      */   }
/*      */   
/*      */   public adr cu() {
/* 2840 */     return adr.g;
/*      */   }
/*      */   
/*      */   protected int cv() {
/* 2844 */     return 1;
/*      */   }
/*      */ 
/*      */   
/*      */   public db cw() {
/* 2849 */     return new db(this, cA(), bi(), (this.l instanceof aag) ? (aag)this.l : null, y(), R().getString(), d(), this.l.l(), this);
/*      */   }
/*      */   
/*      */   protected int y() {
/* 2853 */     return 0;
/*      */   }
/*      */   
/*      */   public boolean k(int ☃) {
/* 2857 */     return (y() >= ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a() {
/* 2862 */     return this.l.V().b(brt.n);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean b() {
/* 2867 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean R_() {
/* 2872 */     return true;
/*      */   }
/*      */   
/*      */   public void a(dj.a ☃, dcn dcn1) {
/* 2876 */     dcn dcn2 = ☃.a(this);
/* 2877 */     double d1 = dcn1.b - dcn2.b;
/* 2878 */     double d2 = dcn1.c - dcn2.c;
/* 2879 */     double d3 = dcn1.d - dcn2.d;
/* 2880 */     double d4 = afm.a(d1 * d1 + d3 * d3);
/*      */     
/* 2882 */     this.q = afm.g((float)-(afm.d(d2, d4) * 57.2957763671875D));
/* 2883 */     this.p = afm.g((float)(afm.d(d3, d1) * 57.2957763671875D) - 90.0F);
/* 2884 */     m(this.p);
/* 2885 */     this.s = this.q;
/* 2886 */     this.r = this.p;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(ael<cuw> ☃, double d) {
/* 2894 */     dci dci1 = cc().h(0.001D);
/* 2895 */     int i = afm.c(dci1.a);
/* 2896 */     int j = afm.f(dci1.d);
/* 2897 */     int k = afm.c(dci1.b);
/* 2898 */     int m = afm.f(dci1.e);
/* 2899 */     int n = afm.c(dci1.c);
/* 2900 */     int i1 = afm.f(dci1.f);
/*      */     
/* 2902 */     if (!this.l.a(i, k, n, j, m, i1)) {
/* 2903 */       return false;
/*      */     }
/*      */     
/* 2906 */     double d1 = 0.0D;
/* 2907 */     boolean bool1 = bV();
/*      */     
/* 2909 */     boolean bool2 = false;
/* 2910 */     dcn dcn1 = dcn.a;
/* 2911 */     int i2 = 0;
/* 2912 */     fx.a a = new fx.a();
/* 2913 */     for (int i3 = i; i3 < j; i3++) {
/* 2914 */       for (int i4 = k; i4 < m; i4++) {
/* 2915 */         for (int i5 = n; i5 < i1; i5++) {
/* 2916 */           a.d(i3, i4, i5);
/* 2917 */           cux cux = this.l.b(a);
/* 2918 */           if (cux.a(☃)) {
/* 2919 */             double d2 = (i4 + cux.a(this.l, a));
/* 2920 */             if (d2 >= dci1.b) {
/* 2921 */               bool2 = true;
/* 2922 */               d1 = Math.max(d2 - dci1.b, d1);
/* 2923 */               if (bool1) {
/* 2924 */                 dcn dcn2 = cux.c(this.l, a);
/* 2925 */                 if (d1 < 0.4D) {
/* 2926 */                   dcn2 = dcn2.a(d1);
/*      */                 }
/*      */                 
/* 2929 */                 dcn1 = dcn1.e(dcn2);
/* 2930 */                 i2++;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2938 */     if (dcn1.f() > 0.0D) {
/* 2939 */       if (i2 > 0) {
/* 2940 */         dcn1 = dcn1.a(1.0D / i2);
/*      */       }
/*      */       
/* 2943 */       if (!(this instanceof bfw)) {
/* 2944 */         dcn1 = dcn1.d();
/*      */       }
/*      */       
/* 2947 */       dcn dcn2 = cC();
/* 2948 */       dcn1 = dcn1.a(d * 1.0D);
/*      */ 
/*      */       
/* 2951 */       double d2 = 0.003D;
/* 2952 */       if (Math.abs(dcn2.b) < 0.003D && Math.abs(dcn2.d) < 0.003D && dcn1.f() < 0.0045000000000000005D) {
/* 2953 */         dcn1 = dcn1.d().a(0.0045000000000000005D);
/*      */       }
/*      */       
/* 2956 */       f(cC().e(dcn1));
/*      */     } 
/* 2958 */     this.M.put(☃, d1);
/* 2959 */     return bool2;
/*      */   }
/*      */   
/*      */   public double b(ael<cuw> ☃) {
/* 2963 */     return this.M.getDouble(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double cx() {
/* 2970 */     return (ce() < 0.4D) ? 0.0D : 0.4D;
/*      */   }
/*      */   
/*      */   public final float cy() {
/* 2974 */     return this.aC.a;
/*      */   }
/*      */   
/*      */   public final float cz() {
/* 2978 */     return this.aC.b;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public aqb a(aqx ☃) {
/* 2984 */     return this.f.l();
/*      */   }
/*      */   
/*      */   public dcn cA() {
/* 2988 */     return this.ai;
/*      */   }
/*      */   
/*      */   public fx cB() {
/* 2992 */     return this.aj;
/*      */   }
/*      */   
/*      */   public dcn cC() {
/* 2996 */     return this.ak;
/*      */   }
/*      */   
/*      */   public void f(dcn ☃) {
/* 3000 */     this.ak = ☃;
/*      */   }
/*      */   
/*      */   public void n(double ☃, double d1, double d2) {
/* 3004 */     f(new dcn(☃, d1, d2));
/*      */   }
/*      */   
/*      */   public final double cD() {
/* 3008 */     return this.ai.b;
/*      */   }
/*      */   
/*      */   public double c(double ☃) {
/* 3012 */     return this.ai.b + cy() * ☃;
/*      */   }
/*      */   
/*      */   public double d(double ☃) {
/* 3016 */     return c((2.0D * this.J.nextDouble() - 1.0D) * ☃);
/*      */   }
/*      */   
/*      */   public final double cE() {
/* 3020 */     return this.ai.c;
/*      */   }
/*      */   
/*      */   public double e(double ☃) {
/* 3024 */     return this.ai.c + cz() * ☃;
/*      */   }
/*      */   
/*      */   public double cF() {
/* 3028 */     return e(this.J.nextDouble());
/*      */   }
/*      */   
/*      */   public double cG() {
/* 3032 */     return this.ai.c + this.aD;
/*      */   }
/*      */   
/*      */   public final double cH() {
/* 3036 */     return this.ai.d;
/*      */   }
/*      */   
/*      */   public double f(double ☃) {
/* 3040 */     return this.ai.d + cy() * ☃;
/*      */   }
/*      */   
/*      */   public double g(double ☃) {
/* 3044 */     return f((2.0D * this.J.nextDouble() - 1.0D) * ☃);
/*      */   }
/*      */   
/*      */   public void o(double ☃, double d1, double d2) {
/* 3048 */     if (this.ai.b != ☃ || this.ai.c != d1 || this.ai.d != d2) {
/* 3049 */       this.ai = new dcn(☃, d1, d2);
/*      */       
/* 3051 */       int i = afm.c(☃);
/* 3052 */       int j = afm.c(d1);
/* 3053 */       int k = afm.c(d2);
/* 3054 */       if (i != this.aj.u() || j != this.aj.v() || k != this.aj.w()) {
/* 3055 */         this.aj = new fx(i, j, k);
/*      */       }
/* 3057 */       this.au = true;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void cI() {}
/*      */   
/*      */   public dcn o(float ☃) {
/* 3065 */     return l(☃).b(0.0D, this.aD * 0.7D, 0.0D);
/*      */   }
/*      */   
/*      */   protected abstract void e();
/*      */   
/*      */   protected abstract void a(md parammd);
/*      */   
/*      */   protected abstract void b(md parammd);
/*      */   
/*      */   public abstract oj<?> P();
/*      */   
/*      */   @FunctionalInterface
/*      */   public static interface a {
/*      */     void accept(aqa param1aqa, double param1Double1, double param1Double2, double param1Double3);
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
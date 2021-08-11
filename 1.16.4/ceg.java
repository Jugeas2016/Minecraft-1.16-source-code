/*      */ import com.google.common.collect.ImmutableMap;
/*      */ import com.mojang.serialization.MapCodec;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collections;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.function.Function;
/*      */ import java.util.function.Predicate;
/*      */ import java.util.function.ToIntFunction;
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
/*      */ public abstract class ceg
/*      */ {
/*   67 */   protected static final gc[] ar = new gc[] { gc.e, gc.f, gc.c, gc.d, gc.a, gc.b };
/*      */   
/*      */   protected final cva as;
/*      */   
/*      */   protected final boolean at;
/*      */   protected final float au;
/*      */   protected final boolean av;
/*      */   protected final cae aw;
/*      */   protected final float ax;
/*      */   protected final float ay;
/*      */   protected final float az;
/*      */   protected final boolean aA;
/*      */   protected final c aB;
/*      */   @Nullable
/*      */   protected vk aC;
/*      */   
/*      */   public ceg(c ☃) {
/*   84 */     this.as = c.a(☃);
/*   85 */     this.at = c.b(☃);
/*   86 */     this.aC = c.c(☃);
/*   87 */     this.au = c.d(☃);
/*   88 */     this.av = c.e(☃);
/*   89 */     this.aw = c.f(☃);
/*   90 */     this.ax = c.g(☃);
/*   91 */     this.ay = c.h(☃);
/*   92 */     this.az = c.i(☃);
/*   93 */     this.aA = c.j(☃);
/*   94 */     this.aB = ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(ceh ☃, bry bry1, fx fx1, int i, int j) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/*  108 */     switch (null.a[cxe1.ordinal()]) {
/*      */       case 1:
/*  110 */         return !☃.r(brc1, fx1);
/*      */       case 2:
/*  112 */         return brc1.b(fx1).a(aef.b);
/*      */       case 3:
/*  114 */         return !☃.r(brc1, fx1);
/*      */     } 
/*  116 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  128 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(ceh ☃, ceh ceh1, gc gc1) {
/*  134 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  143 */     rz.a(brx1, fx1);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {}
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  154 */     if (q() && !☃.a(ceh1.b())) {
/*  155 */       brx1.o(fx1);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  162 */     return aou.c;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(ceh ☃, brx brx1, fx fx1, int i, int j) {
/*  168 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public bzh b(ceh ☃) {
/*  176 */     return bzh.c;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean c_(ceh ☃) {
/*  182 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean b_(ceh ☃) {
/*  188 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public cvc f(ceh ☃) {
/*  194 */     return this.as.g();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public cux d(ceh ☃) {
/*  200 */     return cuy.a.h();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(ceh ☃) {
/*  206 */     return false;
/*      */   }
/*      */   
/*      */   public b ah_() {
/*  210 */     return b.a;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public ceh a(ceh ☃, bzm bzm1) {
/*  218 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public ceh a(ceh ☃, byg byg1) {
/*  224 */     return ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(ceh ☃, bny bny1) {
/*  230 */     return (this.as.e() && (bny1.m().a() || bny1.m().b() != h()));
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(ceh ☃, cuw cuw1) {
/*  236 */     return (this.as.e() || !this.as.b());
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public List<bmb> a(ceh ☃, cyv.a a1) {
/*  242 */     vk vk1 = r();
/*  243 */     if (vk1 == cyq.a) {
/*  244 */       return Collections.emptyList();
/*      */     }
/*  246 */     cyv cyv = a1.<ceh>a(dbc.g, ☃).a(dbb.l);
/*  247 */     aag aag = cyv.c();
/*  248 */     cyy cyy = aag.l().aJ().a(vk1);
/*  249 */     return cyy.a(cyv);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public long a(ceh ☃, fx fx1) {
/*  256 */     return afm.a(fx1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public ddh d(ceh ☃, brc brc1, fx fx1) {
/*  264 */     return ☃.j(brc1, fx1);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public ddh e(ceh ☃, brc brc1, fx fx1) {
/*  270 */     return c(☃, brc1, fx1, dcs.a());
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public ddh a_(ceh ☃, brc brc1, fx fx1) {
/*  276 */     return dde.a();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int f(ceh ☃, brc brc1, fx fx1) {
/*  282 */     if (☃.i(brc1, fx1)) {
/*  283 */       return brc1.K();
/*      */     }
/*  285 */     return ☃.a(brc1, fx1) ? 0 : 1;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   @Deprecated
/*      */   public aox b(ceh ☃, brx brx1, fx fx1) {
/*  292 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  298 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public float a(ceh ☃, brc brc1, fx fx1) {
/*  304 */     return ☃.r(brc1, fx1) ? 0.2F : 1.0F;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int a(ceh ☃, brx brx1, fx fx1) {
/*  310 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  318 */     return dde.b();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  324 */     return this.at ? ☃.j(brc1, fx1) : dde.a();
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public ddh a(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  330 */     return c(☃, brc1, fx1, dcs1);
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  336 */     a(☃, aag1, fx1, random);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {}
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public float a(ceh ☃, bfw bfw1, brc brc1, fx fx1) {
/*  347 */     float f = ☃.h(brc1, fx1);
/*  348 */     if (f == -1.0F) {
/*  349 */       return 0.0F;
/*      */     }
/*  351 */     int i = bfw1.d(☃) ? 30 : 100;
/*  352 */     return bfw1.c(☃) / f / i;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(ceh ☃, aag aag1, fx fx1, bmb bmb1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(ceh ☃, brx brx1, fx fx1, bfw bfw1) {}
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  368 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {}
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  379 */     return 0;
/*      */   }
/*      */   
/*      */   public final boolean q() {
/*  383 */     return this instanceof bwm;
/*      */   }
/*      */   
/*      */   public final vk r() {
/*  387 */     if (this.aC == null) {
/*  388 */       vk ☃ = gm.Q.b(p());
/*      */       
/*  390 */       this.aC = new vk(☃.b(), "blocks/" + ☃.a());
/*      */     } 
/*  392 */     return this.aC;
/*      */   }
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void a(brx ☃, ceh ceh1, dcj dcj1, bgm bgm1) {}
/*      */   
/*      */   public abstract blx h();
/*      */   
/*      */   protected abstract buo p();
/*      */   
/*      */   public enum b
/*      */   {
/*  405 */     a,
/*  406 */     b,
/*  407 */     c;
/*      */   }
/*      */   
/*      */   public cvb s() {
/*  411 */     return c.k(this.aB).apply(p().n());
/*      */   }
/*      */   
/*      */   public static class c
/*      */   {
/*      */     private cva a;
/*      */     private Function<ceh, cvb> b;
/*      */     private boolean c = true;
/*  419 */     private cae d = cae.e;
/*      */     private ToIntFunction<ceh> e = ☃ -> 0;
/*      */     private float f;
/*      */     private float g;
/*      */     private boolean h;
/*      */     private boolean i;
/*  425 */     private float j = 0.6F;
/*  426 */     private float k = 1.0F; private vk m; private boolean n = true; private boolean o; private ceg.d<aqe<?>> p; private ceg.e q;
/*  427 */     private float l = 1.0F; private ceg.e r; private ceg.e s; private ceg.e t; private ceg.e u;
/*      */     private boolean v;
/*      */     
/*      */     private c(cva ☃, Function<ceh, cvb> function) {
/*  431 */       this.p = ((☃, brc1, fx1, aqe1) -> 
/*  432 */         (☃.d(brc1, fx1, gc.b) && ☃.f() < 14));
/*      */       
/*  434 */       this.q = ((☃, brc1, fx1) -> 
/*  435 */         (☃.c().f() && ☃.r(brc1, fx1)));
/*      */       
/*  437 */       this.r = ((☃, brc1, fx1) -> 
/*  438 */         (this.a.c() && ☃.r(brc1, fx1)));
/*      */       
/*  440 */       this.s = this.r;
/*  441 */       this.t = ((☃, brc1, fx1) -> false);
/*  442 */       this.u = ((☃, brc1, fx1) -> false);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  451 */       this.a = ☃;
/*  452 */       this.b = function;
/*      */     } private c(cva ☃, cvb cvb1) {
/*      */       this(☃, ceh1 -> ☃);
/*      */     } public static c a(cva ☃) {
/*  456 */       return a(☃, ☃.h());
/*      */     }
/*      */     
/*      */     public static c a(cva ☃, bkx bkx1) {
/*  460 */       return a(☃, bkx1.f());
/*      */     }
/*      */     
/*      */     public static c a(cva ☃, cvb cvb1) {
/*  464 */       return new c(☃, cvb1);
/*      */     }
/*      */     
/*      */     public static c a(cva ☃, Function<ceh, cvb> function) {
/*  468 */       return new c(☃, function);
/*      */     }
/*      */     
/*      */     public static c a(ceg ☃) {
/*  472 */       c c1 = new c(☃.as, ☃.aB.b);
/*      */       
/*  474 */       c1.a = ☃.aB.a;
/*  475 */       c1.g = ☃.aB.g;
/*  476 */       c1.f = ☃.aB.f;
/*  477 */       c1.c = ☃.aB.c;
/*  478 */       c1.i = ☃.aB.i;
/*  479 */       c1.e = ☃.aB.e;
/*  480 */       c1.b = ☃.aB.b;
/*  481 */       c1.d = ☃.aB.d;
/*  482 */       c1.j = ☃.aB.j;
/*  483 */       c1.k = ☃.aB.k;
/*  484 */       c1.v = ☃.aB.v;
/*  485 */       c1.n = ☃.aB.n;
/*  486 */       c1.o = ☃.aB.o;
/*  487 */       c1.h = ☃.aB.h;
/*      */       
/*  489 */       return c1;
/*      */     }
/*      */     
/*      */     public c a() {
/*  493 */       this.c = false;
/*  494 */       this.n = false;
/*  495 */       return this;
/*      */     }
/*      */     
/*      */     public c b() {
/*  499 */       this.n = false;
/*  500 */       return this;
/*      */     }
/*      */     
/*      */     public c a(float ☃) {
/*  504 */       this.j = ☃;
/*  505 */       return this;
/*      */     }
/*      */     
/*      */     public c b(float ☃) {
/*  509 */       this.k = ☃;
/*  510 */       return this;
/*      */     }
/*      */     
/*      */     public c c(float ☃) {
/*  514 */       this.l = ☃;
/*  515 */       return this;
/*      */     }
/*      */     
/*      */     public c a(cae ☃) {
/*  519 */       this.d = ☃;
/*  520 */       return this;
/*      */     }
/*      */     
/*      */     public c a(ToIntFunction<ceh> ☃) {
/*  524 */       this.e = ☃;
/*  525 */       return this;
/*      */     }
/*      */     
/*      */     public c a(float ☃, float f1) {
/*  529 */       this.g = ☃;
/*  530 */       this.f = Math.max(0.0F, f1);
/*  531 */       return this;
/*      */     }
/*      */     
/*      */     public c c() {
/*  535 */       return d(0.0F);
/*      */     }
/*      */     
/*      */     public c d(float ☃) {
/*  539 */       a(☃, ☃);
/*  540 */       return this;
/*      */     }
/*      */     
/*      */     public c d() {
/*  544 */       this.i = true;
/*  545 */       return this;
/*      */     }
/*      */     
/*      */     public c e() {
/*  549 */       this.v = true;
/*  550 */       return this;
/*      */     }
/*      */     
/*      */     public c f() {
/*  554 */       this.m = cyq.a;
/*  555 */       return this;
/*      */     }
/*      */     
/*      */     public c a(buo ☃) {
/*  559 */       this.m = ☃.r();
/*  560 */       return this;
/*      */     }
/*      */     
/*      */     public c g() {
/*  564 */       this.o = true;
/*  565 */       return this;
/*      */     }
/*      */     
/*      */     public c a(ceg.d<aqe<?>> ☃) {
/*  569 */       this.p = ☃;
/*  570 */       return this;
/*      */     }
/*      */     
/*      */     public c a(ceg.e ☃) {
/*  574 */       this.q = ☃;
/*  575 */       return this;
/*      */     }
/*      */     
/*      */     public c b(ceg.e ☃) {
/*  579 */       this.r = ☃;
/*  580 */       return this;
/*      */     }
/*      */     
/*      */     public c c(ceg.e ☃) {
/*  584 */       this.s = ☃;
/*  585 */       return this;
/*      */     }
/*      */     
/*      */     public c d(ceg.e ☃) {
/*  589 */       this.t = ☃;
/*  590 */       return this;
/*      */     }
/*      */     
/*      */     public c e(ceg.e ☃) {
/*  594 */       this.u = ☃;
/*  595 */       return this;
/*      */     }
/*      */     
/*      */     public c h() {
/*  599 */       this.h = true;
/*  600 */       return this;
/*      */     }
/*      */   }
/*      */   
/*      */   public static abstract class a
/*      */     extends cej<buo, ceh> {
/*      */     private final int b;
/*      */     private final boolean e;
/*      */     private final boolean f;
/*      */     private final cva g;
/*      */     private final cvb h;
/*      */     private final float i;
/*      */     private final boolean j;
/*      */     private final boolean k;
/*      */     private final ceg.e l;
/*      */     private final ceg.e m;
/*      */     private final ceg.e n;
/*      */     private final ceg.e o;
/*      */     private final ceg.e p;
/*      */     @Nullable
/*      */     protected a a;
/*      */     
/*      */     protected a(buo ☃, ImmutableMap<cfj<?>, Comparable<?>> immutableMap, MapCodec<ceh> mapCodec) {
/*  623 */       super(☃, immutableMap, mapCodec);
/*  624 */       ceg.c c = ☃.aB;
/*      */       
/*  626 */       this.b = ceg.c.l(c).applyAsInt(p());
/*  627 */       this.e = ☃.c_(p());
/*  628 */       this.f = ceg.c.m(c);
/*  629 */       this.g = ceg.c.a(c);
/*  630 */       this.h = ceg.c.k(c).apply(p());
/*  631 */       this.i = ceg.c.n(c);
/*  632 */       this.j = ceg.c.o(c);
/*  633 */       this.k = ceg.c.p(c);
/*  634 */       this.l = ceg.c.q(c);
/*  635 */       this.m = ceg.c.r(c);
/*  636 */       this.n = ceg.c.s(c);
/*  637 */       this.o = ceg.c.t(c);
/*  638 */       this.p = ceg.c.u(c);
/*      */     }
/*      */     
/*      */     public void a() {
/*  642 */       if (!b().o()) {
/*  643 */         this.a = new a(p());
/*      */       }
/*      */     }
/*      */     
/*      */     public buo b() {
/*  648 */       return this.c;
/*      */     }
/*      */     
/*      */     public cva c() {
/*  652 */       return this.g;
/*      */     }
/*      */     
/*      */     public boolean a(brc ☃, fx fx1, aqe<?> aqe1) {
/*  656 */       return ceg.c.v((b()).aB).test(p(), ☃, fx1, aqe1);
/*      */     }
/*      */     
/*      */     public boolean a(brc ☃, fx fx1) {
/*  660 */       if (this.a != null) {
/*  661 */         return a.a(this.a);
/*      */       }
/*  663 */       return b().b(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public int b(brc ☃, fx fx1) {
/*  667 */       if (this.a != null) {
/*  668 */         return a.b(this.a);
/*      */       }
/*  670 */       return b().f(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public ddh a(brc ☃, fx fx1, gc gc1) {
/*  674 */       if (this.a != null && a.c(this.a) != null) {
/*  675 */         return a.c(this.a)[gc1.ordinal()];
/*      */       }
/*      */       
/*  678 */       return dde.a(c(☃, fx1), gc1);
/*      */     }
/*      */     
/*      */     public ddh c(brc ☃, fx fx1) {
/*  682 */       return b().d(p(), ☃, fx1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean d() {
/*  687 */       return (this.a == null || this.a.c);
/*      */     }
/*      */     
/*      */     public boolean e() {
/*  691 */       return this.e;
/*      */     }
/*      */     
/*      */     public int f() {
/*  695 */       return this.b;
/*      */     }
/*      */     
/*      */     public boolean g() {
/*  699 */       return this.f;
/*      */     }
/*      */     
/*      */     public cvb d(brc ☃, fx fx1) {
/*  703 */       return this.h;
/*      */     }
/*      */     
/*      */     public ceh a(bzm ☃) {
/*  707 */       return b().a(p(), ☃);
/*      */     }
/*      */     
/*      */     public ceh a(byg ☃) {
/*  711 */       return b().a(p(), ☃);
/*      */     }
/*      */     
/*      */     public bzh h() {
/*  715 */       return b().b(p());
/*      */     }
/*      */     
/*      */     public boolean e(brc ☃, fx fx1) {
/*  719 */       return this.p.test(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public float f(brc ☃, fx fx1) {
/*  723 */       return b().a(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public boolean g(brc ☃, fx fx1) {
/*  727 */       return this.l.test(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public boolean i() {
/*  731 */       return b().b_(p());
/*      */     }
/*      */     
/*      */     public int b(brc ☃, fx fx1, gc gc1) {
/*  735 */       return b().a(p(), ☃, fx1, gc1);
/*      */     }
/*      */     
/*      */     public boolean j() {
/*  739 */       return b().a(p());
/*      */     }
/*      */     
/*      */     public int a(brx ☃, fx fx1) {
/*  743 */       return b().a(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public float h(brc ☃, fx fx1) {
/*  747 */       return this.i;
/*      */     }
/*      */     
/*      */     public float a(bfw ☃, brc brc1, fx fx1) {
/*  751 */       return b().a(p(), ☃, brc1, fx1);
/*      */     }
/*      */     
/*      */     public int c(brc ☃, fx fx1, gc gc1) {
/*  755 */       return b().b(p(), ☃, fx1, gc1);
/*      */     }
/*      */     
/*      */     public cvc k() {
/*  759 */       return b().f(p());
/*      */     }
/*      */     
/*      */     public boolean i(brc ☃, fx fx1) {
/*  763 */       if (this.a != null) {
/*  764 */         return this.a.a;
/*      */       }
/*  766 */       ceh ceh = p();
/*  767 */       if (ceh.l()) {
/*  768 */         return buo.a(ceh.c(☃, fx1));
/*      */       }
/*  770 */       return false;
/*      */     }
/*      */     
/*      */     public boolean l() {
/*  774 */       return this.k;
/*      */     }
/*      */     
/*      */     public boolean a(ceh ☃, gc gc1) {
/*  778 */       return b().a(p(), ☃, gc1);
/*      */     }
/*      */     
/*      */     public ddh j(brc ☃, fx fx1) {
/*  782 */       return a(☃, fx1, dcs.a());
/*      */     }
/*      */     
/*      */     public ddh a(brc ☃, fx fx1, dcs dcs1) {
/*  786 */       return b().b(p(), ☃, fx1, dcs1);
/*      */     }
/*      */     
/*      */     public ddh k(brc ☃, fx fx1) {
/*  790 */       if (this.a != null) {
/*  791 */         return this.a.b;
/*      */       }
/*  793 */       return b(☃, fx1, dcs.a());
/*      */     }
/*      */     
/*      */     public ddh b(brc ☃, fx fx1, dcs dcs1) {
/*  797 */       return b().c(p(), ☃, fx1, dcs1);
/*      */     }
/*      */     
/*      */     public ddh l(brc ☃, fx fx1) {
/*  801 */       return b().e(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public ddh c(brc ☃, fx fx1, dcs dcs1) {
/*  805 */       return b().a(p(), ☃, fx1, dcs1);
/*      */     }
/*      */     
/*      */     public ddh m(brc ☃, fx fx1) {
/*  809 */       return b().a_(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public final boolean a(brc ☃, fx fx1, aqa aqa1) {
/*  813 */       return a(☃, fx1, aqa1, gc.b);
/*      */     }
/*      */     
/*      */     public final boolean a(brc ☃, fx fx1, aqa aqa1, gc gc1) {
/*  817 */       return buo.a(b(☃, fx1, dcs.a(aqa1)), gc1);
/*      */     }
/*      */     
/*      */     public dcn n(brc ☃, fx fx1) {
/*  821 */       ceg.b b = b().ah_();
/*  822 */       if (b == ceg.b.a) {
/*  823 */         return dcn.a;
/*      */       }
/*      */       
/*  826 */       long l = afm.c(fx1.u(), 0, fx1.w());
/*  827 */       return new dcn((((float)(l & 0xFL) / 15.0F) - 0.5D) * 0.5D, (b == ceg.b.c) ? ((((float)(l >> 4L & 0xFL) / 15.0F) - 1.0D) * 0.2D) : 0.0D, (((float)(l >> 8L & 0xFL) / 15.0F) - 0.5D) * 0.5D);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean a(brx ☃, fx fx1, int i, int j) {
/*  835 */       return b().a(p(), ☃, fx1, i, j);
/*      */     }
/*      */     
/*      */     public void a(brx ☃, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  839 */       b().a(p(), ☃, fx1, buo1, fx2, bool);
/*      */     }
/*      */     
/*      */     public final void a(bry ☃, fx fx1, int i) {
/*  843 */       a(☃, fx1, i, 512);
/*      */     }
/*      */     
/*      */     public final void a(bry ☃, fx fx1, int i, int j) {
/*  847 */       b();
/*  848 */       fx.a a1 = new fx.a();
/*  849 */       for (gc gc : ceg.ar) {
/*  850 */         a1.a(fx1, gc);
/*  851 */         ceh ceh1 = ☃.d_(a1);
/*  852 */         ceh ceh2 = ceh1.a(gc.f(), p(), ☃, a1, fx1);
/*  853 */         buo.a(ceh1, ceh2, ☃, a1, i, j);
/*      */       } 
/*      */     }
/*      */     
/*      */     public final void b(bry ☃, fx fx1, int i) {
/*  858 */       b(☃, fx1, i, 512);
/*      */     }
/*      */     
/*      */     public void b(bry ☃, fx fx1, int i, int j) {
/*  862 */       b().a(p(), ☃, fx1, i, j);
/*      */     }
/*      */     
/*      */     public void a(brx ☃, fx fx1, ceh ceh1, boolean bool) {
/*  866 */       b().b(p(), ☃, fx1, ceh1, bool);
/*      */     }
/*      */     
/*      */     public void b(brx ☃, fx fx1, ceh ceh1, boolean bool) {
/*  870 */       b().a(p(), ☃, fx1, ceh1, bool);
/*      */     }
/*      */     
/*      */     public void a(aag ☃, fx fx1, Random random) {
/*  874 */       b().a(p(), ☃, fx1, random);
/*      */     }
/*      */     
/*      */     public void b(aag ☃, fx fx1, Random random) {
/*  878 */       b().b(p(), ☃, fx1, random);
/*      */     }
/*      */     
/*      */     public void a(brx ☃, fx fx1, aqa aqa1) {
/*  882 */       b().a(p(), ☃, fx1, aqa1);
/*      */     }
/*      */     
/*      */     public void a(aag ☃, fx fx1, bmb bmb1) {
/*  886 */       b().a(p(), ☃, fx1, bmb1);
/*      */     }
/*      */     
/*      */     public List<bmb> a(cyv.a ☃) {
/*  890 */       return b().a(p(), ☃);
/*      */     }
/*      */     
/*      */     public aou a(brx ☃, bfw bfw1, aot aot1, dcj dcj1) {
/*  894 */       return b().a(p(), ☃, dcj1.a(), bfw1, aot1, dcj1);
/*      */     }
/*      */     
/*      */     public void a(brx ☃, fx fx1, bfw bfw1) {
/*  898 */       b().a(p(), ☃, fx1, bfw1);
/*      */     }
/*      */     
/*      */     public boolean o(brc ☃, fx fx1) {
/*  902 */       return this.m.test(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public boolean p(brc ☃, fx fx1) {
/*  906 */       return this.n.test(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public ceh a(gc ☃, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  910 */       return b().a(p(), ☃, ceh1, bry1, fx1, fx2);
/*      */     }
/*      */     
/*      */     public boolean a(brc ☃, fx fx1, cxe cxe1) {
/*  914 */       return b().a(p(), ☃, fx1, cxe1);
/*      */     }
/*      */     
/*      */     public boolean a(bny ☃) {
/*  918 */       return b().a(p(), ☃);
/*      */     }
/*      */     
/*      */     public boolean a(cuw ☃) {
/*  922 */       return b().a(p(), ☃);
/*      */     }
/*      */     
/*      */     public boolean a(brz ☃, fx fx1) {
/*  926 */       return b().a(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public boolean q(brc ☃, fx fx1) {
/*  930 */       return this.o.test(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public aox b(brx ☃, fx fx1) {
/*  935 */       return b().b(p(), ☃, fx1);
/*      */     }
/*      */     
/*      */     public boolean a(ael<buo> ☃) {
/*  939 */       return b().a(☃);
/*      */     }
/*      */     
/*      */     public boolean a(ael<buo> ☃, Predicate<a> predicate) {
/*  943 */       return (b().a(☃) && predicate.test(this));
/*      */     }
/*      */     
/*      */     public boolean a(buo ☃) {
/*  947 */       return b().a(☃);
/*      */     }
/*      */     
/*      */     public cux m() {
/*  951 */       return b().d(p());
/*      */     }
/*      */     
/*      */     public boolean n() {
/*  955 */       return b().a_(p());
/*      */     }
/*      */     
/*      */     public long a(fx ☃) {
/*  959 */       return b().a(p(), ☃);
/*      */     }
/*      */     
/*      */     public cae o() {
/*  963 */       return b().k(p());
/*      */     }
/*      */     
/*      */     public void a(brx ☃, ceh ceh1, dcj dcj1, bgm bgm1) {
/*  967 */       b().a(☃, ceh1, dcj1, bgm1);
/*      */     }
/*      */     
/*      */     public boolean d(brc ☃, fx fx1, gc gc1) {
/*  971 */       return a(☃, fx1, gc1, cat.a);
/*      */     }
/*      */     
/*      */     public boolean a(brc ☃, fx fx1, gc gc1, cat cat1) {
/*  975 */       if (this.a != null) {
/*  976 */         return this.a.a(gc1, cat1);
/*      */       }
/*  978 */       return cat1.a(p(), ☃, fx1, gc1);
/*      */     }
/*      */     
/*      */     public boolean r(brc ☃, fx fx1) {
/*  982 */       if (this.a != null) {
/*  983 */         return this.a.d;
/*      */       }
/*  985 */       return buo.a(k(☃, fx1));
/*      */     }
/*      */     
/*      */     protected abstract ceh p();
/*      */     
/*      */     public boolean q() {
/*  991 */       return this.j;
/*      */     }
/*      */     
/*      */     static final class a {
/*  995 */       private static final gc[] e = gc.values();
/*  996 */       private static final int f = (cat.values()).length;
/*      */       protected final boolean a;
/*      */       private final boolean g;
/*      */       private final int h;
/*      */       @Nullable
/*      */       private final ddh[] i;
/*      */       protected final ddh b;
/*      */       protected final boolean c;
/*      */       private final boolean[] j;
/*      */       protected final boolean d;
/*      */       
/*      */       private a(ceh ☃) {
/* 1008 */         buo buo = ☃.b();
/* 1009 */         this.a = ☃.i(brl.a, fx.b);
/* 1010 */         this.g = buo.b(☃, brl.a, fx.b);
/* 1011 */         this.h = buo.f(☃, brl.a, fx.b);
/* 1012 */         if (!☃.l()) {
/* 1013 */           this.i = null;
/*      */         } else {
/* 1015 */           this.i = new ddh[e.length];
/* 1016 */           ddh ddh1 = buo.d(☃, brl.a, fx.b);
/* 1017 */           for (gc gc1 : e) {
/* 1018 */             this.i[gc1.ordinal()] = dde.a(ddh1, gc1);
/*      */           }
/*      */         } 
/*      */         
/* 1022 */         this.b = buo.c(☃, brl.a, fx.b, dcs.a());
/* 1023 */         this.c = Arrays.<gc.a>stream(gc.a.values()).anyMatch(☃ -> (this.b.b(☃) < 0.0D || this.b.c(☃) > 1.0D));
/* 1024 */         this.j = new boolean[e.length * f];
/* 1025 */         for (gc gc1 : e) {
/* 1026 */           for (cat cat : cat.values()) {
/* 1027 */             this.j[b(gc1, cat)] = cat.a(☃, brl.a, fx.b, gc1);
/*      */           }
/*      */         } 
/* 1030 */         this.d = buo.a(☃.k(brl.a, fx.b));
/*      */       }
/*      */       
/*      */       public boolean a(gc ☃, cat cat1) {
/* 1034 */         return this.j[b(☃, cat1)];
/*      */       }
/*      */       
/*      */       private static int b(gc ☃, cat cat1) {
/* 1038 */         return ☃.ordinal() * f + cat1.ordinal();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public static interface d<A> {
/*      */     boolean test(ceh param1ceh, brc param1brc, fx param1fx, A param1A);
/*      */   }
/*      */   
/*      */   public static interface e {
/*      */     boolean test(ceh param1ceh, brc param1brc, fx param1fx);
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ceg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
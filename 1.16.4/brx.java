/*      */ import com.google.common.collect.Lists;
/*      */ import com.mojang.serialization.Codec;
/*      */ import java.io.IOException;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.function.Consumer;
/*      */ import java.util.function.Predicate;
/*      */ import java.util.function.Supplier;
/*      */ import javax.annotation.Nullable;
/*      */ import net.minecraft.server.MinecraftServer;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import org.apache.logging.log4j.util.Supplier;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class brx
/*      */   implements bry, AutoCloseable
/*      */ {
/*   72 */   protected static final Logger e = LogManager.getLogger();
/*      */   
/*   74 */   public static final Codec<vj<brx>> f = vk.a.xmap(vj.b(gm.L), vj::a);
/*      */   
/*   76 */   public static final vj<brx> g = vj.a(gm.L, new vk("overworld"));
/*   77 */   public static final vj<brx> h = vj.a(gm.L, new vk("the_nether"));
/*   78 */   public static final vj<brx> i = vj.a(gm.L, new vk("the_end"));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   89 */   private static final gc[] a = gc.values();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   99 */   public final List<ccj> j = Lists.newArrayList();
/*  100 */   public final List<ccj> k = Lists.newArrayList();
/*  101 */   protected final List<ccj> l = Lists.newArrayList();
/*  102 */   protected final List<ccj> m = Lists.newArrayList();
/*      */   
/*      */   private final Thread b;
/*      */   
/*      */   private final boolean c;
/*      */   
/*      */   private int d;
/*  109 */   protected int n = (new Random()).nextInt();
/*  110 */   protected final int o = 1013904223;
/*      */   
/*      */   protected float p;
/*      */   protected float q;
/*      */   protected float r;
/*      */   protected float s;
/*  116 */   public final Random t = new Random();
/*      */   
/*      */   private final chd x;
/*      */   
/*      */   protected final cyo u;
/*      */   
/*      */   private final Supplier<anw> y;
/*      */   public final boolean v;
/*      */   protected boolean w;
/*      */   private final cfu z;
/*      */   private final bsx A;
/*      */   private final vj<brx> B;
/*      */   
/*      */   protected brx(cyo ☃, vj<brx> vj1, chd chd1, Supplier<anw> supplier, boolean bool1, boolean bool2, long l) {
/*  130 */     this.y = supplier;
/*  131 */     this.u = ☃;
/*  132 */     this.x = chd1;
/*  133 */     this.B = vj1;
/*  134 */     this.v = bool1;
/*  135 */     if (chd1.f() != 1.0D) {
/*  136 */       this.z = new cfu(this, chd1)
/*      */         {
/*      */           public double a() {
/*  139 */             return super.a() / this.a.f();
/*      */           }
/*      */ 
/*      */           
/*      */           public double b() {
/*  144 */             return super.b() / this.a.f();
/*      */           }
/*      */         };
/*      */     } else {
/*  148 */       this.z = new cfu();
/*      */     } 
/*  150 */     this.b = Thread.currentThread();
/*  151 */     this.A = new bsx(this, l, chd1.m());
/*  152 */     this.c = bool2;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean s_() {
/*  157 */     return this.v;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public MinecraftServer l() {
/*  163 */     return null;
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
/*      */   public static boolean k(fx ☃) {
/*  175 */     return (!m(☃) && D(☃));
/*      */   }
/*      */   
/*      */   public static boolean l(fx ☃) {
/*  179 */     return (!d(☃.v()) && D(☃));
/*      */   }
/*      */   
/*      */   private static boolean D(fx ☃) {
/*  183 */     return (☃.u() >= -30000000 && ☃.w() >= -30000000 && ☃.u() < 30000000 && ☃.w() < 30000000);
/*      */   }
/*      */   
/*      */   private static boolean d(int ☃) {
/*  187 */     return (☃ < -20000000 || ☃ >= 20000000);
/*      */   }
/*      */   
/*      */   public static boolean m(fx ☃) {
/*  191 */     return b(☃.v());
/*      */   }
/*      */   
/*      */   public static boolean b(int ☃) {
/*  195 */     return (☃ < 0 || ☃ >= 256);
/*      */   }
/*      */   
/*      */   public cgh n(fx ☃) {
/*  199 */     return d(☃.u() >> 4, ☃.w() >> 4);
/*      */   }
/*      */ 
/*      */   
/*      */   public cgh d(int ☃, int i) {
/*  204 */     return (cgh)a(☃, i, cga.m);
/*      */   }
/*      */ 
/*      */   
/*      */   public cfw a(int ☃, int i, cga cga1, boolean bool) {
/*  209 */     cfw cfw = H().a(☃, i, cga1, bool);
/*  210 */     if (cfw == null && bool) {
/*  211 */       throw new IllegalStateException("Should always be able to create a chunk!");
/*      */     }
/*  213 */     return cfw;
/*      */   }
/*      */   
/*      */   public boolean a(fx ☃, ceh ceh1, int i) {
/*  217 */     return a(☃, ceh1, i, 512);
/*      */   }
/*      */   
/*      */   public boolean a(fx ☃, ceh ceh1, int i, int j) {
/*  221 */     if (m(☃)) {
/*  222 */       return false;
/*      */     }
/*      */     
/*  225 */     if (!this.v && ab()) {
/*  226 */       return false;
/*      */     }
/*      */     
/*  229 */     cgh cgh = n(☃);
/*  230 */     buo buo = ceh1.b();
/*  231 */     ceh ceh2 = cgh.a(☃, ceh1, ((i & 0x40) != 0));
/*      */ 
/*      */     
/*  234 */     if (ceh2 != null) {
/*      */       
/*  236 */       ceh ceh3 = d_(☃);
/*      */       
/*  238 */       if ((i & 0x80) == 0 && ceh3 != ceh2 && (ceh3.b(this, ☃) != ceh2.b(this, ☃) || ceh3.f() != ceh2.f() || ceh3.e() || ceh2.e())) {
/*  239 */         Z().a("queueCheckLight");
/*  240 */         H().l().a(☃);
/*  241 */         Z().c();
/*      */       } 
/*      */ 
/*      */       
/*  245 */       if (ceh3 == ceh1) {
/*  246 */         if (ceh2 != ceh3) {
/*  247 */           b(☃, ceh2, ceh3);
/*      */         }
/*      */         
/*  250 */         if ((i & 0x2) != 0 && (!this.v || (i & 0x4) == 0) && (this.v || (cgh.u() != null && cgh.u().a(zr.b.c)))) {
/*  251 */           a(☃, ceh2, ceh1, i);
/*      */         }
/*      */         
/*  254 */         if ((i & 0x1) != 0) {
/*  255 */           a(☃, ceh2.b());
/*  256 */           if (!this.v && ceh1.j()) {
/*  257 */             c(☃, buo);
/*      */           }
/*      */         } 
/*      */ 
/*      */         
/*  262 */         if ((i & 0x10) == 0 && j > 0) {
/*  263 */           int k = i & 0xFFFFFFDE;
/*  264 */           ceh2.b(this, ☃, k, j - 1);
/*  265 */           ceh1.a(this, ☃, k, j - 1);
/*  266 */           ceh1.b(this, ☃, k, j - 1);
/*      */         } 
/*      */         
/*  269 */         a(☃, ceh2, ceh3);
/*      */       } 
/*      */       
/*  272 */       return true;
/*      */     } 
/*      */     
/*  275 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(fx ☃, ceh ceh1, ceh ceh2) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(fx ☃, boolean bool) {
/*  290 */     cux cux = b(☃);
/*  291 */     return a(☃, cux.g(), 0x3 | (bool ? 64 : 0));
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
/*      */   public boolean a(fx ☃, boolean bool, @Nullable aqa aqa1, int i) {
/*  304 */     ceh ceh = d_(☃);
/*  305 */     if (ceh.g()) {
/*  306 */       return false;
/*      */     }
/*      */     
/*  309 */     cux cux = b(☃);
/*  310 */     if (!(ceh.b() instanceof bue)) {
/*  311 */       c(2001, ☃, buo.i(ceh));
/*      */     }
/*  313 */     if (bool) {
/*  314 */       ccj ccj = ceh.b().q() ? c(☃) : null;
/*  315 */       buo.a(ceh, this, ☃, ccj, aqa1, bmb.b);
/*      */     } 
/*  317 */     return a(☃, cux.g(), 3, i);
/*      */   }
/*      */   
/*      */   public boolean a(fx ☃, ceh ceh1) {
/*  321 */     return a(☃, ceh1, 3);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(fx ☃, ceh ceh1, ceh ceh2) {}
/*      */ 
/*      */   
/*      */   public void b(fx ☃, buo buo1) {
/*  330 */     a(☃.f(), buo1, ☃);
/*  331 */     a(☃.g(), buo1, ☃);
/*  332 */     a(☃.c(), buo1, ☃);
/*  333 */     a(☃.b(), buo1, ☃);
/*  334 */     a(☃.d(), buo1, ☃);
/*  335 */     a(☃.e(), buo1, ☃);
/*      */   }
/*      */   
/*      */   public void a(fx ☃, buo buo1, gc gc1) {
/*  339 */     if (gc1 != gc.e) {
/*  340 */       a(☃.f(), buo1, ☃);
/*      */     }
/*  342 */     if (gc1 != gc.f) {
/*  343 */       a(☃.g(), buo1, ☃);
/*      */     }
/*  345 */     if (gc1 != gc.a) {
/*  346 */       a(☃.c(), buo1, ☃);
/*      */     }
/*  348 */     if (gc1 != gc.b) {
/*  349 */       a(☃.b(), buo1, ☃);
/*      */     }
/*  351 */     if (gc1 != gc.c) {
/*  352 */       a(☃.d(), buo1, ☃);
/*      */     }
/*  354 */     if (gc1 != gc.d) {
/*  355 */       a(☃.e(), buo1, ☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(fx ☃, buo buo1, fx fx1) {
/*  360 */     if (this.v) {
/*      */       return;
/*      */     }
/*  363 */     ceh ceh = d_(☃);
/*      */     
/*      */     try {
/*  366 */       ceh.a(this, ☃, buo1, fx1, false);
/*  367 */     } catch (Throwable throwable) {
/*  368 */       l l = l.a(throwable, "Exception while updating neighbours");
/*  369 */       m m = l.a("Block being updated");
/*      */       
/*  371 */       m.a("Source block type", () -> {
/*      */             try {
/*      */               return String.format("ID #%s (%s // %s)", new Object[] { gm.Q.b(☃), ☃.i(), ☃.getClass().getCanonicalName() });
/*  374 */             } catch (Throwable throwable) {
/*      */               return "ID #" + gm.Q.b(☃);
/*      */             } 
/*      */           });
/*      */       
/*  379 */       m.a(m, ☃, ceh);
/*      */       
/*  381 */       throw new u(l);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public int a(chn.a ☃, int i, int j) {
/*      */     int k;
/*  388 */     if (i < -30000000 || j < -30000000 || i >= 30000000 || j >= 30000000) {
/*  389 */       k = t_() + 1;
/*  390 */     } else if (b(i >> 4, j >> 4)) {
/*  391 */       k = d(i >> 4, j >> 4).a(☃, i & 0xF, j & 0xF) + 1;
/*      */     } else {
/*  393 */       k = 0;
/*      */     } 
/*  395 */     return k;
/*      */   }
/*      */ 
/*      */   
/*      */   public cuo e() {
/*  400 */     return H().l();
/*      */   }
/*      */ 
/*      */   
/*      */   public ceh d_(fx ☃) {
/*  405 */     if (m(☃)) {
/*  406 */       return bup.la.n();
/*      */     }
/*  408 */     cgh cgh = d(☃.u() >> 4, ☃.w() >> 4);
/*  409 */     return cgh.d_(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public cux b(fx ☃) {
/*  414 */     if (m(☃)) {
/*  415 */       return cuy.a.h();
/*      */     }
/*  417 */     cgh cgh = n(☃);
/*  418 */     return cgh.b(☃);
/*      */   }
/*      */   
/*      */   public boolean M() {
/*  422 */     return (!k().n() && this.d < 4);
/*      */   }
/*      */   
/*      */   public boolean N() {
/*  426 */     return (!k().n() && !M());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(@Nullable bfw ☃, fx fx1, adp adp1, adr adr1, float f1, float f2) {
/*  432 */     a(☃, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, adp1, adr1, f1, f2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(double ☃, double d1, double d2, adp adp1, adr adr1, float f1, float f2, boolean bool) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(hf ☃, double d1, double d2, double d3, double d4, double d5, double d6) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(hf ☃, boolean bool, double d1, double d2, double d3, double d4, double d5, double d6) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(hf ☃, double d1, double d2, double d3, double d4, double d5, double d6) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(hf ☃, boolean bool, double d1, double d2, double d3, double d4, double d5, double d6) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public float a(float ☃) {
/*  460 */     float f = f(☃);
/*  461 */     return f * 6.2831855F;
/*      */   }
/*      */   
/*      */   public boolean a(ccj ☃) {
/*  465 */     if (this.w) {
/*  466 */       e.error("Adding block entity while ticking: {} @ {}", new Supplier[] { () -> gm.W.b(☃.u()), ☃::o });
/*      */     }
/*  468 */     boolean bool = this.j.add(☃);
/*  469 */     if (bool && ☃ instanceof cdm) {
/*  470 */       this.k.add(☃);
/*      */     }
/*      */     
/*  473 */     if (this.v) {
/*  474 */       fx fx = ☃.o();
/*  475 */       ceh ceh = d_(fx);
/*  476 */       a(fx, ceh, ceh, 2);
/*      */     } 
/*      */     
/*  479 */     return bool;
/*      */   }
/*      */   
/*      */   public void a(Collection<ccj> ☃) {
/*  483 */     if (this.w) {
/*  484 */       this.l.addAll(☃);
/*      */     } else {
/*  486 */       for (ccj ccj : ☃) {
/*  487 */         a(ccj);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public void O() {
/*  493 */     anw ☃ = Z();
/*  494 */     ☃.a("blockEntities");
/*  495 */     if (!this.m.isEmpty()) {
/*  496 */       this.k.removeAll(this.m);
/*  497 */       this.j.removeAll(this.m);
/*  498 */       this.m.clear();
/*      */     } 
/*  500 */     this.w = true;
/*  501 */     Iterator<ccj> iterator = this.k.iterator();
/*  502 */     while (iterator.hasNext()) {
/*  503 */       ccj ccj = iterator.next();
/*  504 */       if (!ccj.q() && ccj.n()) {
/*  505 */         fx fx = ccj.o();
/*  506 */         if (H().a(fx) && f().a(fx)) {
/*      */           try {
/*  508 */             ☃.a(() -> String.valueOf(cck.a(☃.u())));
/*  509 */             if (ccj.u().a(d_(fx).b())) {
/*  510 */               ((cdm)ccj).aj_();
/*      */             } else {
/*  512 */               ccj.w();
/*      */             } 
/*  514 */             ☃.c();
/*  515 */           } catch (Throwable throwable) {
/*  516 */             l l = l.a(throwable, "Ticking block entity");
/*  517 */             m m = l.a("Block entity being ticked");
/*      */             
/*  519 */             ccj.a(m);
/*      */             
/*  521 */             throw new u(l);
/*      */           } 
/*      */         }
/*      */       } 
/*      */       
/*  526 */       if (ccj.q()) {
/*  527 */         iterator.remove();
/*  528 */         this.j.remove(ccj);
/*      */         
/*  530 */         if (C(ccj.o())) {
/*  531 */           n(ccj.o()).d(ccj.o());
/*      */         }
/*      */       } 
/*      */     } 
/*  535 */     this.w = false;
/*      */     
/*  537 */     ☃.b("pendingBlockEntities");
/*  538 */     if (!this.l.isEmpty()) {
/*  539 */       for (int i = 0; i < this.l.size(); i++) {
/*  540 */         ccj ccj = this.l.get(i);
/*  541 */         if (!ccj.q()) {
/*  542 */           if (!this.j.contains(ccj)) {
/*  543 */             a(ccj);
/*      */           }
/*      */           
/*  546 */           if (C(ccj.o())) {
/*  547 */             cgh cgh = n(ccj.o());
/*  548 */             ceh ceh = cgh.d_(ccj.o());
/*  549 */             cgh.a(ccj.o(), ccj);
/*  550 */             a(ccj.o(), ceh, ceh, 3);
/*      */           } 
/*      */         } 
/*      */       } 
/*  554 */       this.l.clear();
/*      */     } 
/*  556 */     ☃.c();
/*      */   }
/*      */   
/*      */   public void a(Consumer<aqa> ☃, aqa aqa1) {
/*      */     try {
/*  561 */       ☃.accept(aqa1);
/*  562 */     } catch (Throwable throwable) {
/*  563 */       l l = l.a(throwable, "Ticking entity");
/*  564 */       m m = l.a("Entity being ticked");
/*      */       
/*  566 */       aqa1.a(m);
/*      */       
/*  568 */       throw new u(l);
/*      */     } 
/*      */   }
/*      */   
/*      */   public brp a(@Nullable aqa ☃, double d1, double d2, double d3, float f, brp.a a1) {
/*  573 */     return a(☃, (apk)null, (brq)null, d1, d2, d3, f, false, a1);
/*      */   }
/*      */   
/*      */   public brp a(@Nullable aqa ☃, double d1, double d2, double d3, float f, boolean bool, brp.a a1) {
/*  577 */     return a(☃, (apk)null, (brq)null, d1, d2, d3, f, bool, a1);
/*      */   }
/*      */   
/*      */   public brp a(@Nullable aqa ☃, @Nullable apk apk1, @Nullable brq brq1, double d1, double d2, double d3, float f, boolean bool, brp.a a1) {
/*  581 */     brp brp = new brp(this, ☃, apk1, brq1, d1, d2, d3, f, bool, a1);
/*  582 */     brp.a();
/*  583 */     brp.a(true);
/*  584 */     return brp;
/*      */   }
/*      */   
/*      */   public String P() {
/*  588 */     return H().e();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public ccj c(fx ☃) {
/*  594 */     if (m(☃)) {
/*  595 */       return null;
/*      */     }
/*      */ 
/*      */     
/*  599 */     if (!this.v && Thread.currentThread() != this.b) {
/*  600 */       return null;
/*      */     }
/*      */     
/*  603 */     ccj ccj = null;
/*      */     
/*  605 */     if (this.w) {
/*  606 */       ccj = E(☃);
/*      */     }
/*      */     
/*  609 */     if (ccj == null) {
/*  610 */       ccj = n(☃).a(☃, cgh.a.a);
/*      */     }
/*      */     
/*  613 */     if (ccj == null) {
/*  614 */       ccj = E(☃);
/*      */     }
/*  616 */     return ccj;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private ccj E(fx ☃) {
/*  621 */     for (int i = 0; i < this.l.size(); i++) {
/*  622 */       ccj ccj = this.l.get(i);
/*  623 */       if (!ccj.q() && ccj.o().equals(☃)) {
/*  624 */         return ccj;
/*      */       }
/*      */     } 
/*  627 */     return null;
/*      */   }
/*      */   
/*      */   public void a(fx ☃, @Nullable ccj ccj1) {
/*  631 */     if (m(☃)) {
/*      */       return;
/*      */     }
/*      */     
/*  635 */     if (ccj1 != null && !ccj1.q()) {
/*  636 */       if (this.w) {
/*  637 */         ccj1.a(this, ☃);
/*      */ 
/*      */         
/*  640 */         Iterator<ccj> iterator = this.l.iterator();
/*  641 */         while (iterator.hasNext()) {
/*  642 */           ccj ccj2 = iterator.next();
/*  643 */           if (ccj2.o().equals(☃)) {
/*  644 */             ccj2.al_();
/*  645 */             iterator.remove();
/*      */           } 
/*      */         } 
/*      */         
/*  649 */         this.l.add(ccj1);
/*      */       } else {
/*  651 */         n(☃).a(☃, ccj1);
/*  652 */         a(ccj1);
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public void o(fx ☃) {
/*  658 */     ccj ccj = c(☃);
/*  659 */     if (ccj != null && this.w) {
/*  660 */       ccj.al_();
/*  661 */       this.l.remove(ccj);
/*      */     } else {
/*  663 */       if (ccj != null) {
/*  664 */         this.l.remove(ccj);
/*  665 */         this.j.remove(ccj);
/*  666 */         this.k.remove(ccj);
/*      */       } 
/*      */       
/*  669 */       n(☃).d(☃);
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean p(fx ☃) {
/*  674 */     if (m(☃)) {
/*  675 */       return false;
/*      */     }
/*  677 */     return H().b(☃.u() >> 4, ☃.w() >> 4);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean a(fx ☃, aqa aqa1, gc gc1) {
/*  686 */     if (m(☃)) {
/*  687 */       return false;
/*      */     }
/*      */     
/*  690 */     cfw cfw = a(☃.u() >> 4, ☃.w() >> 4, cga.m, false);
/*  691 */     if (cfw == null) {
/*  692 */       return false;
/*      */     }
/*      */     
/*  695 */     return cfw.d_(☃).a(this, ☃, aqa1, gc1);
/*      */   }
/*      */   
/*      */   public boolean a(fx ☃, aqa aqa1) {
/*  699 */     return a(☃, aqa1, gc.b);
/*      */   }
/*      */   
/*      */   public void Q() {
/*  703 */     double ☃ = 1.0D - (d(1.0F) * 5.0F) / 16.0D;
/*  704 */     double d1 = 1.0D - (b(1.0F) * 5.0F) / 16.0D;
/*      */     
/*  706 */     double d2 = 0.5D + 2.0D * afm.a(afm.b(f(1.0F) * 6.2831855F), -0.25D, 0.25D);
/*      */     
/*  708 */     this.d = (int)((1.0D - d2 * ☃ * d1) * 11.0D);
/*      */   }
/*      */   
/*      */   public void b(boolean ☃, boolean bool1) {
/*  712 */     H().a(☃, bool1);
/*      */   }
/*      */   
/*      */   protected void R() {
/*  716 */     if (this.u.k()) {
/*  717 */       this.q = 1.0F;
/*  718 */       if (this.u.i()) {
/*  719 */         this.s = 1.0F;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void close() throws IOException {
/*  726 */     H().close();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public brc c(int ☃, int i) {
/*  732 */     return a(☃, i, cga.m, false);
/*      */   }
/*      */ 
/*      */   
/*      */   public List<aqa> a(@Nullable aqa ☃, dci dci1, @Nullable Predicate<? super aqa> predicate) {
/*  737 */     Z().c("getEntities");
/*  738 */     List<aqa> list = Lists.newArrayList();
/*  739 */     int i = afm.c((dci1.a - 2.0D) / 16.0D);
/*  740 */     int j = afm.c((dci1.d + 2.0D) / 16.0D);
/*  741 */     int k = afm.c((dci1.c - 2.0D) / 16.0D);
/*  742 */     int m = afm.c((dci1.f + 2.0D) / 16.0D);
/*  743 */     cfz cfz = H();
/*  744 */     for (int n = i; n <= j; n++) {
/*  745 */       for (int i1 = k; i1 <= m; i1++) {
/*  746 */         cgh cgh = cfz.a(n, i1, false);
/*  747 */         if (cgh != null) {
/*  748 */           cgh.a(☃, dci1, list, predicate);
/*      */         }
/*      */       } 
/*      */     } 
/*  752 */     return list;
/*      */   }
/*      */   
/*      */   public <T extends aqa> List<T> a(@Nullable aqe<T> ☃, dci dci1, Predicate<? super T> predicate) {
/*  756 */     Z().c("getEntities");
/*  757 */     int i = afm.c((dci1.a - 2.0D) / 16.0D);
/*  758 */     int j = afm.f((dci1.d + 2.0D) / 16.0D);
/*  759 */     int k = afm.c((dci1.c - 2.0D) / 16.0D);
/*  760 */     int m = afm.f((dci1.f + 2.0D) / 16.0D);
/*  761 */     List<T> list = Lists.newArrayList();
/*      */     
/*  763 */     for (int n = i; n < j; n++) {
/*  764 */       for (int i1 = k; i1 < m; i1++) {
/*  765 */         cgh cgh = H().a(n, i1, false);
/*  766 */         if (cgh != null) {
/*  767 */           cgh.a(☃, dci1, list, predicate);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  772 */     return list;
/*      */   }
/*      */ 
/*      */   
/*      */   public <T extends aqa> List<T> a(Class<? extends T> ☃, dci dci1, @Nullable Predicate<? super T> predicate) {
/*  777 */     Z().c("getEntities");
/*  778 */     int i = afm.c((dci1.a - 2.0D) / 16.0D);
/*  779 */     int j = afm.f((dci1.d + 2.0D) / 16.0D);
/*  780 */     int k = afm.c((dci1.c - 2.0D) / 16.0D);
/*  781 */     int m = afm.f((dci1.f + 2.0D) / 16.0D);
/*  782 */     List<T> list = Lists.newArrayList();
/*      */     
/*  784 */     cfz cfz = H();
/*  785 */     for (int n = i; n < j; n++) {
/*  786 */       for (int i1 = k; i1 < m; i1++) {
/*  787 */         cgh cgh = cfz.a(n, i1, false);
/*  788 */         if (cgh != null) {
/*  789 */           cgh.a(☃, dci1, list, predicate);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  794 */     return list;
/*      */   }
/*      */ 
/*      */   
/*      */   public <T extends aqa> List<T> b(Class<? extends T> ☃, dci dci1, @Nullable Predicate<? super T> predicate) {
/*  799 */     Z().c("getLoadedEntities");
/*  800 */     int i = afm.c((dci1.a - 2.0D) / 16.0D);
/*  801 */     int j = afm.f((dci1.d + 2.0D) / 16.0D);
/*  802 */     int k = afm.c((dci1.c - 2.0D) / 16.0D);
/*  803 */     int m = afm.f((dci1.f + 2.0D) / 16.0D);
/*  804 */     List<T> list = Lists.newArrayList();
/*      */     
/*  806 */     cfz cfz = H();
/*  807 */     for (int n = i; n < j; n++) {
/*  808 */       for (int i1 = k; i1 < m; i1++) {
/*  809 */         cgh cgh = cfz.a(n, i1);
/*  810 */         if (cgh != null) {
/*  811 */           cgh.a(☃, dci1, list, predicate);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  816 */     return list;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(fx ☃, ccj ccj1) {
/*  823 */     if (C(☃)) {
/*  824 */       n(☃).s();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public int t_() {
/*  830 */     return 63;
/*      */   }
/*      */   
/*      */   public int q(fx ☃) {
/*  834 */     int i = 0;
/*  835 */     i = Math.max(i, c(☃.c(), gc.a));
/*  836 */     if (i >= 15) {
/*  837 */       return i;
/*      */     }
/*  839 */     i = Math.max(i, c(☃.b(), gc.b));
/*  840 */     if (i >= 15) {
/*  841 */       return i;
/*      */     }
/*  843 */     i = Math.max(i, c(☃.d(), gc.c));
/*  844 */     if (i >= 15) {
/*  845 */       return i;
/*      */     }
/*  847 */     i = Math.max(i, c(☃.e(), gc.d));
/*  848 */     if (i >= 15) {
/*  849 */       return i;
/*      */     }
/*  851 */     i = Math.max(i, c(☃.f(), gc.e));
/*  852 */     if (i >= 15) {
/*  853 */       return i;
/*      */     }
/*  855 */     i = Math.max(i, c(☃.g(), gc.f));
/*  856 */     if (i >= 15) {
/*  857 */       return i;
/*      */     }
/*  859 */     return i;
/*      */   }
/*      */   
/*      */   public boolean a(fx ☃, gc gc1) {
/*  863 */     return (b(☃, gc1) > 0);
/*      */   }
/*      */   
/*      */   public int b(fx ☃, gc gc1) {
/*  867 */     ceh ceh = d_(☃);
/*      */     
/*  869 */     int i = ceh.b(this, ☃, gc1);
/*  870 */     if (ceh.g(this, ☃)) {
/*  871 */       return Math.max(i, q(☃));
/*      */     }
/*  873 */     return i;
/*      */   }
/*      */   
/*      */   public boolean r(fx ☃) {
/*  877 */     if (b(☃.c(), gc.a) > 0) {
/*  878 */       return true;
/*      */     }
/*  880 */     if (b(☃.b(), gc.b) > 0) {
/*  881 */       return true;
/*      */     }
/*  883 */     if (b(☃.d(), gc.c) > 0) {
/*  884 */       return true;
/*      */     }
/*  886 */     if (b(☃.e(), gc.d) > 0) {
/*  887 */       return true;
/*      */     }
/*  889 */     if (b(☃.f(), gc.e) > 0) {
/*  890 */       return true;
/*      */     }
/*  892 */     if (b(☃.g(), gc.f) > 0) {
/*  893 */       return true;
/*      */     }
/*  895 */     return false;
/*      */   }
/*      */   
/*      */   public int s(fx ☃) {
/*  899 */     int i = 0;
/*      */     
/*  901 */     for (gc gc1 : a) {
/*  902 */       int j = b(☃.a(gc1), gc1);
/*      */       
/*  904 */       if (j >= 15) {
/*  905 */         return 15;
/*      */       }
/*  907 */       if (j > i) {
/*  908 */         i = j;
/*      */       }
/*      */     } 
/*      */     
/*  912 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void S() {}
/*      */ 
/*      */ 
/*      */   
/*      */   public long T() {
/*  922 */     return this.u.e();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long U() {
/*  930 */     return this.u.f();
/*      */   }
/*      */   
/*      */   public boolean a(bfw ☃, fx fx1) {
/*  934 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqa ☃, byte b) {}
/*      */   
/*      */   public void a(fx ☃, buo buo1, int i, int j) {
/*  941 */     d_(☃).a(this, ☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public cyd h() {
/*  946 */     return this.u;
/*      */   }
/*      */   
/*      */   public brt V() {
/*  950 */     return this.u.q();
/*      */   }
/*      */   
/*      */   public float b(float ☃) {
/*  954 */     return afm.g(☃, this.r, this.s) * d(☃);
/*      */   }
/*      */   
/*      */   public void c(float ☃) {
/*  958 */     this.r = ☃;
/*  959 */     this.s = ☃;
/*      */   }
/*      */   
/*      */   public float d(float ☃) {
/*  963 */     return afm.g(☃, this.p, this.q);
/*      */   }
/*      */   
/*      */   public void e(float ☃) {
/*  967 */     this.p = ☃;
/*  968 */     this.q = ☃;
/*      */   }
/*      */   
/*      */   public boolean W() {
/*  972 */     if (!k().b() || k().c()) {
/*  973 */       return false;
/*      */     }
/*  975 */     return (b(1.0F) > 0.9D);
/*      */   }
/*      */   
/*      */   public boolean X() {
/*  979 */     return (d(1.0F) > 0.2D);
/*      */   }
/*      */   
/*      */   public boolean t(fx ☃) {
/*  983 */     if (!X()) {
/*  984 */       return false;
/*      */     }
/*  986 */     if (!e(☃)) {
/*  987 */       return false;
/*      */     }
/*  989 */     if (a(chn.a.e, ☃).v() > ☃.v()) {
/*  990 */       return false;
/*      */     }
/*      */     
/*  993 */     bsv bsv = v(☃);
/*      */     
/*  995 */     return (bsv.c() == bsv.e.b && bsv.a(☃) >= 0.15F);
/*      */   }
/*      */   
/*      */   public boolean u(fx ☃) {
/*  999 */     bsv bsv = v(☃);
/* 1000 */     return bsv.d();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void b(int ☃, fx fx1, int i) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public m a(l ☃) {
/* 1014 */     m m = ☃.a("Affected level", 1);
/*      */     
/* 1016 */     m.a("All players", () -> x().size() + " total; " + x());
/* 1017 */     m.a("Chunk stats", H()::e);
/* 1018 */     m.a("Level dimension", () -> Y().a().toString());
/*      */     
/*      */     try {
/* 1021 */       this.u.a(m);
/* 1022 */     } catch (Throwable throwable) {
/* 1023 */       m.a("Level Data Unobtainable", throwable);
/*      */     } 
/*      */     
/* 1026 */     return m;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(double ☃, double d1, double d2, double d3, double d4, double d5, @Nullable md md1) {}
/*      */ 
/*      */ 
/*      */   
/*      */   public void c(fx ☃, buo buo1) {
/* 1037 */     for (gc gc1 : gc.c.a) {
/* 1038 */       fx fx1 = ☃.a(gc1);
/*      */       
/* 1040 */       if (C(fx1)) {
/* 1041 */         ceh ceh = d_(fx1);
/* 1042 */         if (ceh.a(bup.fu)) {
/* 1043 */           ceh.a(this, fx1, buo1, ☃, false); continue;
/* 1044 */         }  if (ceh.g(this, fx1)) {
/* 1045 */           fx1 = fx1.a(gc1);
/* 1046 */           ceh = d_(fx1);
/*      */           
/* 1048 */           if (ceh.a(bup.fu)) {
/* 1049 */             ceh.a(this, fx1, buo1, ☃, false);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public aos d(fx ☃) {
/* 1058 */     long l = 0L;
/* 1059 */     float f = 0.0F;
/* 1060 */     if (C(☃)) {
/* 1061 */       f = af();
/* 1062 */       l = n(☃).q();
/*      */     } 
/*      */     
/* 1065 */     return new aos(ad(), U(), l, f);
/*      */   }
/*      */ 
/*      */   
/*      */   public int c() {
/* 1070 */     return this.d;
/*      */   }
/*      */ 
/*      */   
/*      */   public void c(int ☃) {}
/*      */ 
/*      */   
/*      */   public cfu f() {
/* 1078 */     return this.z;
/*      */   }
/*      */   
/*      */   public void a(oj<?> ☃) {
/* 1082 */     throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
/*      */   }
/*      */ 
/*      */   
/*      */   public chd k() {
/* 1087 */     return this.x;
/*      */   }
/*      */   
/*      */   public vj<brx> Y() {
/* 1091 */     return this.B;
/*      */   }
/*      */ 
/*      */   
/*      */   public Random u_() {
/* 1096 */     return this.t;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(fx ☃, Predicate<ceh> predicate) {
/* 1101 */     return predicate.test(d_(☃));
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
/*      */   public fx a(int ☃, int i, int j, int k) {
/* 1114 */     this.n = this.n * 3 + 1013904223;
/* 1115 */     int m = this.n >> 2;
/*      */     
/* 1117 */     return new fx(☃ + (m & 0xF), i + (m >> 16 & k), j + (m >> 8 & 0xF));
/*      */   }
/*      */   
/*      */   public boolean q() {
/* 1121 */     return false;
/*      */   }
/*      */   
/*      */   public anw Z() {
/* 1125 */     return this.y.get();
/*      */   }
/*      */   
/*      */   public Supplier<anw> aa() {
/* 1129 */     return this.y;
/*      */   }
/*      */ 
/*      */   
/*      */   public bsx d() {
/* 1134 */     return this.A;
/*      */   }
/*      */   
/*      */   public final boolean ab() {
/* 1138 */     return this.c;
/*      */   }
/*      */   
/*      */   public abstract void a(fx paramfx, ceh paramceh1, ceh paramceh2, int paramInt);
/*      */   
/*      */   public abstract void a(@Nullable bfw parambfw, double paramDouble1, double paramDouble2, double paramDouble3, adp paramadp, adr paramadr, float paramFloat1, float paramFloat2);
/*      */   
/*      */   public abstract void a(@Nullable bfw parambfw, aqa paramaqa, adp paramadp, adr paramadr, float paramFloat1, float paramFloat2);
/*      */   
/*      */   @Nullable
/*      */   public abstract aqa a(int paramInt);
/*      */   
/*      */   @Nullable
/*      */   public abstract cxx a(String paramString);
/*      */   
/*      */   public abstract void a(cxx paramcxx);
/*      */   
/*      */   public abstract int t();
/*      */   
/*      */   public abstract void a(int paramInt1, fx paramfx, int paramInt2);
/*      */   
/*      */   public abstract ddn G();
/*      */   
/*      */   public abstract bor o();
/*      */   
/*      */   public abstract aen p();
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
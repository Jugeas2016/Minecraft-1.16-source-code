/*      */ import com.google.common.collect.ImmutableList;
/*      */ import com.google.common.collect.ImmutableMap;
/*      */ import com.google.common.collect.ImmutableSet;
/*      */ import com.mojang.datafixers.util.Pair;
/*      */ import com.mojang.serialization.DataResult;
/*      */ import com.mojang.serialization.Dynamic;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*      */ import java.util.Collection;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Optional;
/*      */ import java.util.Set;
/*      */ import java.util.function.BiPredicate;
/*      */ import java.util.stream.Collectors;
/*      */ import javax.annotation.Nullable;
/*      */ import net.minecraft.server.MinecraftServer;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class bfj
/*      */   extends bfe
/*      */   implements aqz, bfl
/*      */ {
/*   92 */   private static final us<bfk> br = uv.a((Class)bfj.class, uu.q);
/*      */ 
/*      */   
/*   95 */   public static final Map<blx, Integer> bp = (Map<blx, Integer>)ImmutableMap.of(bmd.kX, 
/*   96 */       Integer.valueOf(4), bmd.oZ, 
/*   97 */       Integer.valueOf(1), bmd.oY, 
/*   98 */       Integer.valueOf(1), bmd.qf, 
/*   99 */       Integer.valueOf(1));
/*      */ 
/*      */ 
/*      */   
/*  103 */   private static final Set<blx> bs = (Set<blx>)ImmutableSet.of(bmd.kX, bmd.oZ, bmd.oY, bmd.kW, bmd.kV, bmd.qf, (Object[])new blx[] { bmd.qg });
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int bt;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean bu;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   private bfw bv;
/*      */ 
/*      */ 
/*      */   
/*      */   private byte bx;
/*      */ 
/*      */ 
/*      */   
/*  127 */   private final axz by = new axz();
/*      */   
/*      */   private long bz;
/*      */   
/*      */   private long bA;
/*      */   
/*      */   private int bB;
/*      */   private long bC;
/*      */   private int bD;
/*      */   private long bE;
/*      */   private boolean bF;
/*  138 */   private static final ImmutableList<ayd<?>> bG = ImmutableList.of(ayd.b, ayd.c, ayd.d, ayd.e, ayd.g, ayd.h, ayd.i, ayd.j, ayd.k, ayd.l, ayd.J, ayd.m, (Object[])new ayd[] { ayd.n, ayd.q, ayd.r, ayd.t, ayd.v, ayd.w, ayd.x, ayd.y, ayd.A, ayd.f, ayd.B, ayd.C, ayd.D, ayd.F, ayd.G, ayd.H, ayd.E });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  170 */   private static final ImmutableList<azc<? extends azb<? super bfj>>> bH = ImmutableList.of(azc.c, azc.d, azc.b, azc.e, azc.f, azc.g, azc.h, azc.i, azc.j);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final Map<ayd<gf>, BiPredicate<bfj, azr>> bq;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static {
/*  182 */     bq = (Map<ayd<gf>, BiPredicate<bfj, azr>>)ImmutableMap.of(ayd.b, (☃, azr1) -> (azr1 == azr.r), ayd.c, (☃, azr1) -> (☃.eX().b().b() == azr1), ayd.d, (☃, azr1) -> azr.a.test(azr1), ayd.e, (☃, azr1) -> (azr1 == azr.s));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public bfj(aqe<? extends bfj> ☃, brx brx1) {
/*  190 */     this(☃, brx1, bfo.c);
/*      */   }
/*      */   
/*      */   public bfj(aqe<? extends bfj> ☃, brx brx1, bfo bfo1) {
/*  194 */     super((aqe)☃, brx1);
/*  195 */     ((ayi)x()).a(true);
/*  196 */     x().d(true);
/*  197 */     p(true);
/*  198 */     a(eX().a(bfo1).a(bfm.a));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public arf<bfj> cJ() {
/*  204 */     return (arf)super.cJ();
/*      */   }
/*      */ 
/*      */   
/*      */   protected arf.b<bfj> cK() {
/*  209 */     return arf.a((Collection<? extends ayd<?>>)bG, (Collection<? extends azc<? extends azb<? super bfj>>>)bH);
/*      */   }
/*      */ 
/*      */   
/*      */   protected arf<?> a(Dynamic<?> ☃) {
/*  214 */     arf<bfj> arf = cK().a(☃);
/*  215 */     a(arf);
/*  216 */     return arf;
/*      */   }
/*      */   
/*      */   public void c(aag ☃) {
/*  220 */     arf<bfj> arf = cJ();
/*  221 */     arf.b(☃, this);
/*  222 */     this.bg = arf.h();
/*  223 */     a(cJ());
/*      */   }
/*      */   
/*      */   private void a(arf<bfj> ☃) {
/*  227 */     bfm bfm = eX().b();
/*      */     
/*  229 */     if (w_()) {
/*  230 */       ☃.a(bhh.c);
/*  231 */       ☃.a(bhf.d, aul.a(0.5F));
/*      */     } else {
/*  233 */       ☃.a(bhh.d);
/*  234 */       ☃.a(bhf.c, aul.b(bfm, 0.5F), (Set<Pair<ayd<?>, aye>>)ImmutableSet.of(Pair.of(ayd.c, aye.a)));
/*      */     } 
/*      */     
/*  237 */     ☃.a(bhf.a, aul.a(bfm, 0.5F));
/*  238 */     ☃.a(bhf.f, aul.d(bfm, 0.5F), (Set<Pair<ayd<?>, aye>>)ImmutableSet.of(Pair.of(ayd.e, aye.a)));
/*  239 */     ☃.a(bhf.e, aul.c(bfm, 0.5F));
/*  240 */     ☃.a(bhf.b, aul.e(bfm, 0.5F));
/*  241 */     ☃.a(bhf.g, aul.f(bfm, 0.5F));
/*  242 */     ☃.a(bhf.i, aul.g(bfm, 0.5F));
/*  243 */     ☃.a(bhf.h, aul.h(bfm, 0.5F));
/*  244 */     ☃.a(bhf.j, aul.i(bfm, 0.5F));
/*  245 */     ☃.a((Set<bhf>)ImmutableSet.of(bhf.a));
/*  246 */     ☃.b(bhf.b);
/*  247 */     ☃.a(bhf.b);
/*  248 */     ☃.a(this.l.U(), this.l.T());
/*      */   }
/*      */ 
/*      */   
/*      */   protected void m() {
/*  253 */     super.m();
/*  254 */     if (this.l instanceof aag) {
/*  255 */       c((aag)this.l);
/*      */     }
/*      */   }
/*      */   
/*      */   public static ark.a eY() {
/*  260 */     return aqn.p()
/*  261 */       .a(arl.d, 0.5D)
/*  262 */       .a(arl.b, 48.0D);
/*      */   }
/*      */   
/*      */   public boolean eZ() {
/*  266 */     return this.bF;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void N() {
/*  271 */     this.l.Z().a("villagerBrain");
/*  272 */     cJ().a((aag)this.l, this);
/*  273 */     this.l.Z().c();
/*      */     
/*  275 */     if (this.bF) {
/*  276 */       this.bF = false;
/*      */     }
/*      */     
/*  279 */     if (!eN() && this.bt > 0) {
/*  280 */       this.bt--;
/*  281 */       if (this.bt <= 0) {
/*  282 */         if (this.bu) {
/*  283 */           fu();
/*  284 */           this.bu = false;
/*      */         } 
/*  286 */         c(new apu(apw.j, 200, 0));
/*      */       } 
/*      */     } 
/*      */     
/*  290 */     if (this.bv != null && this.l instanceof aag) {
/*  291 */       ((aag)this.l).a(azl.e, this.bv, this);
/*  292 */       this.l.a(this, (byte)14);
/*  293 */       this.bv = null;
/*      */     } 
/*      */ 
/*      */     
/*  297 */     if (!eD() && this.J.nextInt(100) == 0) {
/*  298 */       bhb ☃ = ((aag)this.l).b_(cB());
/*  299 */       if (☃ != null && ☃.v() && !☃.a()) {
/*  300 */         this.l.a(this, (byte)42);
/*      */       }
/*      */     } 
/*      */     
/*  304 */     if (eX().b() == bfm.a && eN()) {
/*  305 */       eT();
/*      */     }
/*      */     
/*  308 */     super.N();
/*      */   }
/*      */ 
/*      */   
/*      */   public void j() {
/*  313 */     super.j();
/*      */     
/*  315 */     if (eK() > 0) {
/*  316 */       s(eK() - 1);
/*      */     }
/*      */     
/*  319 */     fw();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public aou b(bfw ☃, aot aot1) {
/*  325 */     bmb bmb = ☃.b(aot1);
/*  326 */     if (bmb.b() != bmd.oG && aX() && !eN() && !em()) {
/*  327 */       if (w_()) {
/*  328 */         fk();
/*  329 */         return aou.a(this.l.v);
/*      */       } 
/*      */       
/*  332 */       boolean bool = eO().isEmpty();
/*      */ 
/*      */       
/*  335 */       if (aot1 == aot.a) {
/*  336 */         if (bool && 
/*  337 */           !this.l.v) {
/*  338 */           fk();
/*      */         }
/*      */         
/*  341 */         ☃.a(aea.R);
/*      */       } 
/*      */       
/*  344 */       if (bool) {
/*  345 */         return aou.a(this.l.v);
/*      */       }
/*      */       
/*  348 */       if (!this.l.v && !this.bo.isEmpty())
/*      */       {
/*  350 */         h(☃);
/*      */       }
/*      */       
/*  353 */       return aou.a(this.l.v);
/*      */     } 
/*  355 */     return super.b(☃, aot1);
/*      */   }
/*      */   
/*      */   private void fk() {
/*  359 */     s(40);
/*  360 */     if (!this.l.s_()) {
/*  361 */       a(adq.pW, dG(), dH());
/*      */     }
/*      */   }
/*      */   
/*      */   private void h(bfw ☃) {
/*  366 */     i(☃);
/*  367 */     f(☃);
/*  368 */     a(☃, d(), eX().c());
/*      */   }
/*      */ 
/*      */   
/*      */   public void f(@Nullable bfw ☃) {
/*  373 */     boolean bool = (eM() != null && ☃ == null);
/*  374 */     super.f(☃);
/*  375 */     if (bool) {
/*  376 */       eT();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected void eT() {
/*  382 */     super.eT();
/*  383 */     fl();
/*      */   }
/*      */   
/*      */   private void fl() {
/*  387 */     for (bqv ☃ : eO()) {
/*  388 */       ☃.l();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean fa() {
/*  394 */     return true;
/*      */   }
/*      */   
/*      */   public void fb() {
/*  398 */     fp();
/*  399 */     for (bqv ☃ : eO()) {
/*  400 */       ☃.h();
/*      */     }
/*      */     
/*  403 */     this.bC = this.l.T();
/*  404 */     this.bD++;
/*      */   }
/*      */   
/*      */   private boolean fm() {
/*  408 */     for (bqv ☃ : eO()) {
/*  409 */       if (☃.r()) {
/*  410 */         return true;
/*      */       }
/*      */     } 
/*  413 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean fn() {
/*  418 */     return (this.bD == 0 || (this.bD < 2 && this.l.T() > this.bC + 2400L));
/*      */   }
/*      */   public boolean fc() {
/*      */     int i;
/*  422 */     long ☃ = this.bC + 12000L;
/*  423 */     long l1 = this.l.T();
/*  424 */     boolean bool = (l1 > ☃);
/*      */ 
/*      */ 
/*      */     
/*  428 */     long l2 = this.l.U();
/*  429 */     if (this.bE > 0L) {
/*  430 */       long l3 = this.bE / 24000L;
/*  431 */       long l4 = l2 / 24000L;
/*  432 */       i = bool | ((l4 > l3) ? 1 : 0);
/*      */     } 
/*  434 */     this.bE = l2;
/*      */     
/*  436 */     if (i != 0) {
/*  437 */       this.bC = l1;
/*  438 */       fx();
/*      */     } 
/*      */     
/*  441 */     return (fn() && fm());
/*      */   }
/*      */ 
/*      */   
/*      */   private void fo() {
/*  446 */     int ☃ = 2 - this.bD;
/*  447 */     if (☃ > 0) {
/*  448 */       for (bqv bqv : eO()) {
/*  449 */         bqv.h();
/*      */       }
/*      */     }
/*  452 */     for (int i = 0; i < ☃; i++) {
/*  453 */       fp();
/*      */     }
/*      */   }
/*      */   
/*      */   private void fp() {
/*  458 */     for (bqv ☃ : eO()) {
/*  459 */       ☃.e();
/*      */     }
/*      */   }
/*      */   
/*      */   private void i(bfw ☃) {
/*  464 */     int i = g(☃);
/*  465 */     if (i != 0) {
/*  466 */       for (bqv bqv : eO()) {
/*  467 */         bqv.a(-afm.d(i * bqv.n()));
/*      */       }
/*      */     }
/*      */     
/*  471 */     if (☃.a(apw.F)) {
/*  472 */       apu apu = ☃.b(apw.F);
/*  473 */       int j = apu.c();
/*  474 */       for (bqv bqv : eO()) {
/*  475 */         double d = 0.3D + 0.0625D * j;
/*  476 */         int k = (int)Math.floor(d * bqv.a().E());
/*  477 */         bqv.a(-Math.max(k, 1));
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void e() {
/*  484 */     super.e();
/*  485 */     this.R.a(br, new bfk(bfo.c, bfm.a, 1));
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(md ☃) {
/*  490 */     super.b(☃);
/*  491 */     bfk.a.encodeStart(mo.a, eX())
/*  492 */       .resultOrPartial(h::error)
/*  493 */       .ifPresent(mt1 -> ☃.a("VillagerData", mt1));
/*      */     
/*  495 */     ☃.a("FoodLevel", this.bx);
/*  496 */     ☃.a("Gossips", (mt)this.by.<T>a(mo.a).getValue());
/*  497 */     ☃.b("Xp", this.bB);
/*  498 */     ☃.a("LastRestock", this.bC);
/*  499 */     ☃.a("LastGossipDecay", this.bA);
/*  500 */     ☃.b("RestocksToday", this.bD);
/*  501 */     if (this.bF) {
/*  502 */       ☃.a("AssignProfessionWhenSpawned", true);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(md ☃) {
/*  508 */     super.a(☃);
/*      */     
/*  510 */     if (☃.c("VillagerData", 10)) {
/*  511 */       DataResult<bfk> dataResult = bfk.a.parse(new Dynamic(mo.a, ☃.c("VillagerData")));
/*  512 */       dataResult.resultOrPartial(h::error).ifPresent(this::a);
/*      */     } 
/*      */ 
/*      */     
/*  516 */     if (☃.c("Offers", 10)) {
/*  517 */       this.bo = new bqw(☃.p("Offers"));
/*      */     }
/*      */     
/*  520 */     if (☃.c("FoodLevel", 1)) {
/*  521 */       this.bx = ☃.f("FoodLevel");
/*      */     }
/*      */     
/*  524 */     mj mj = ☃.d("Gossips", 10);
/*  525 */     this.by.a(new Dynamic(mo.a, mj));
/*      */     
/*  527 */     if (☃.c("Xp", 3)) {
/*  528 */       this.bB = ☃.h("Xp");
/*      */     }
/*      */     
/*  531 */     this.bC = ☃.i("LastRestock");
/*      */     
/*  533 */     this.bA = ☃.i("LastGossipDecay");
/*      */     
/*  535 */     p(true);
/*      */ 
/*      */     
/*  538 */     if (this.l instanceof aag) {
/*  539 */       c((aag)this.l);
/*      */     }
/*      */     
/*  542 */     this.bD = ☃.h("RestocksToday");
/*      */     
/*  544 */     if (☃.e("AssignProfessionWhenSpawned")) {
/*  545 */       this.bF = ☃.q("AssignProfessionWhenSpawned");
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean h(double ☃) {
/*  551 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   protected adp I() {
/*  557 */     if (em()) {
/*  558 */       return null;
/*      */     }
/*      */     
/*  561 */     if (eN()) {
/*  562 */       return adq.pX;
/*      */     }
/*  564 */     return adq.pS;
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp e(apk ☃) {
/*  569 */     return adq.pV;
/*      */   }
/*      */ 
/*      */   
/*      */   protected adp dq() {
/*  574 */     return adq.pU;
/*      */   }
/*      */   
/*      */   public void fd() {
/*  578 */     adp ☃ = eX().b().e();
/*  579 */     if (☃ != null) {
/*  580 */       a(☃, dG(), dH());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(bfk ☃) {
/*  586 */     bfk bfk1 = eX();
/*  587 */     if (bfk1.b() != ☃.b()) {
/*  588 */       this.bo = null;
/*      */     }
/*      */     
/*  591 */     this.R.b(br, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public bfk eX() {
/*  596 */     return this.R.<bfk>a(br);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(bqv ☃) {
/*  601 */     int i = 3 + this.J.nextInt(4);
/*      */     
/*  603 */     this.bB += ☃.o();
/*  604 */     this.bv = eM();
/*      */     
/*  606 */     if (ft()) {
/*  607 */       this.bt = 40;
/*  608 */       this.bu = true;
/*  609 */       i += 5;
/*      */     } 
/*      */     
/*  612 */     if (☃.s()) {
/*  613 */       this.l.c(new aqg(this.l, cD(), cE() + 0.5D, cH(), i));
/*      */     }
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
/*      */   public void a(@Nullable aqm ☃) {
/*  628 */     if (☃ != null && this.l instanceof aag) {
/*  629 */       ((aag)this.l).a(azl.c, ☃, this);
/*  630 */       if (aX() && ☃ instanceof bfw) {
/*  631 */         this.l.a(this, (byte)13);
/*      */       }
/*      */     } 
/*  634 */     super.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(apk ☃) {
/*  639 */     h.info("Villager {} died, message: '{}'", this, ☃.a(this).getString());
/*  640 */     aqa aqa = ☃.k();
/*  641 */     if (aqa != null) {
/*  642 */       a(aqa);
/*      */     }
/*      */     
/*  645 */     fq();
/*  646 */     super.a(☃);
/*      */   }
/*      */   
/*      */   private void fq() {
/*  650 */     a(ayd.b);
/*  651 */     a(ayd.c);
/*  652 */     a(ayd.d);
/*  653 */     a(ayd.e);
/*      */   }
/*      */   
/*      */   private void a(aqa ☃) {
/*  657 */     if (!(this.l instanceof aag)) {
/*      */       return;
/*      */     }
/*      */     
/*  661 */     Optional<List<aqm>> optional = this.bg.c(ayd.h);
/*  662 */     if (!optional.isPresent()) {
/*      */       return;
/*      */     }
/*      */     
/*  666 */     aag aag = (aag)this.l;
/*  667 */     ((List)optional.get()).stream()
/*  668 */       .filter(☃ -> ☃ instanceof aqz)
/*  669 */       .forEach(aqm1 -> ☃.a(azl.d, aqa1, (aqz)aqm1));
/*      */   }
/*      */   
/*      */   public void a(ayd<gf> ☃) {
/*  673 */     if (!(this.l instanceof aag)) {
/*      */       return;
/*      */     }
/*  676 */     MinecraftServer minecraftServer = ((aag)this.l).l();
/*  677 */     this.bg.<gf>c(☃).ifPresent(gf1 -> {
/*      */           aag aag = ☃.a(gf1.a());
/*      */           if (aag == null) {
/*      */             return;
/*      */           }
/*      */           azo azo = aag.y();
/*      */           Optional<azr> optional = azo.c(gf1.b());
/*      */           BiPredicate<bfj, azr> biPredicate = bq.get(ayd1);
/*      */           if (optional.isPresent() && biPredicate.test(this, optional.get())) {
/*      */             azo.b(gf1.b());
/*      */             rz.c(aag, gf1.b());
/*      */           } 
/*      */         });
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean f() {
/*  694 */     return (this.bx + fv() >= 12 && i() == 0);
/*      */   }
/*      */   
/*      */   private boolean fr() {
/*  698 */     return (this.bx < 12);
/*      */   }
/*      */   
/*      */   private void fs() {
/*  702 */     if (!fr() || fv() == 0) {
/*      */       return;
/*      */     }
/*      */     
/*  706 */     for (int ☃ = 0; ☃ < eU().Z_(); ☃++) {
/*  707 */       bmb bmb = eU().a(☃);
/*      */       
/*  709 */       if (!bmb.a()) {
/*  710 */         Integer integer = bp.get(bmb.b());
/*  711 */         if (integer != null) {
/*  712 */           int i = bmb.E();
/*  713 */           for (int j = i; j > 0; j--) {
/*  714 */             this.bx = (byte)(this.bx + integer.intValue());
/*  715 */             eU().a(☃, 1);
/*      */             
/*  717 */             if (!fr()) {
/*      */               return;
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public int g(bfw ☃) {
/*  727 */     return this.by.a(☃.bS(), ☃ -> true);
/*      */   }
/*      */   
/*      */   private void v(int ☃) {
/*  731 */     this.bx = (byte)(this.bx - ☃);
/*      */   }
/*      */   
/*      */   public void ff() {
/*  735 */     fs();
/*  736 */     v(12);
/*      */   }
/*      */   
/*      */   public void b(bqw ☃) {
/*  740 */     this.bo = ☃;
/*      */   }
/*      */   
/*      */   private boolean ft() {
/*  744 */     int ☃ = eX().c();
/*  745 */     return (bfk.d(☃) && this.bB >= bfk.c(☃));
/*      */   }
/*      */   
/*      */   private void fu() {
/*  749 */     a(eX().a(eX().c() + 1));
/*      */     
/*  751 */     eW();
/*      */   }
/*      */ 
/*      */   
/*      */   protected nr bJ() {
/*  756 */     return new of(X().f() + '.' + gm.ai.b(eX().b()).a());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(byte ☃) {
/*  761 */     if (☃ == 12) {
/*  762 */       a(hh.G);
/*  763 */     } else if (☃ == 13) {
/*  764 */       a(hh.b);
/*  765 */     } else if (☃ == 14) {
/*  766 */       a(hh.E);
/*  767 */     } else if (☃ == 42) {
/*  768 */       a(hh.Z);
/*      */     } else {
/*  770 */       super.a(☃);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*  777 */     if (aqp1 == aqp.e) {
/*  778 */       a(eX().a(bfm.a));
/*      */     }
/*  780 */     if (aqp1 == aqp.n || aqp1 == aqp.m || aqp1 == aqp.c || aqp1 == aqp.o) {
/*  781 */       a(eX().a(bfo.a(☃.i(cB()))));
/*      */     }
/*      */     
/*  784 */     if (aqp1 == aqp.d) {
/*  785 */       this.bF = true;
/*      */     }
/*      */     
/*  788 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*      */   }
/*      */ 
/*      */   
/*      */   public bfj b(aag ☃, apy apy1) {
/*      */     bfo bfo;
/*  794 */     double d = this.J.nextDouble();
/*  795 */     if (d < 0.5D) {
/*  796 */       bfo = bfo.a(☃.i(cB()));
/*  797 */     } else if (d < 0.75D) {
/*  798 */       bfo = eX().a();
/*      */     } else {
/*  800 */       bfo = ((bfj)apy1).eX().a();
/*      */     } 
/*      */     
/*  803 */     bfj bfj1 = new bfj(aqe.aP, ☃, bfo);
/*  804 */     bfj1.a(☃, ☃.d(bfj1.cB()), aqp.e, (arc)null, (md)null);
/*  805 */     return bfj1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aag ☃, aql aql1) {
/*  810 */     if (☃.ad() != aor.a) {
/*  811 */       h.info("Villager {} was struck by lightning {}.", this, aql1);
/*  812 */       beg beg = aqe.aS.a(☃);
/*  813 */       beg.b(cD(), cE(), cH(), this.p, this.q);
/*  814 */       beg.a(☃, ☃.d(beg.cB()), aqp.i, (arc)null, (md)null);
/*  815 */       beg.q(eD());
/*  816 */       if (S()) {
/*  817 */         beg.a(T());
/*  818 */         beg.n(bX());
/*      */       } 
/*  820 */       beg.es();
/*  821 */       ☃.l(beg);
/*  822 */       fq();
/*  823 */       ad();
/*      */     } else {
/*  825 */       super.a(☃, aql1);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void b(bcv ☃) {
/*  831 */     bmb bmb = ☃.g();
/*      */     
/*  833 */     if (i(bmb)) {
/*  834 */       apa apa = eU();
/*      */       
/*  836 */       boolean bool = apa.b(bmb);
/*  837 */       if (!bool) {
/*      */         return;
/*      */       }
/*      */       
/*  841 */       a(☃);
/*  842 */       a(☃, bmb.E());
/*  843 */       bmb bmb1 = apa.a(bmb);
/*  844 */       if (bmb1.a()) {
/*  845 */         ☃.ad();
/*      */       } else {
/*  847 */         bmb.e(bmb1.E());
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean i(bmb ☃) {
/*  854 */     blx blx = ☃.b();
/*  855 */     return ((bs.contains(blx) || eX().b().c().contains(blx)) && eU().b(☃));
/*      */   }
/*      */   
/*      */   public boolean fg() {
/*  859 */     return (fv() >= 24);
/*      */   }
/*      */   
/*      */   public boolean fh() {
/*  863 */     return (fv() < 12);
/*      */   }
/*      */   
/*      */   private int fv() {
/*  867 */     apa ☃ = eU();
/*  868 */     return bp.entrySet().stream().mapToInt(entry -> ☃.a((blx)entry.getKey()) * ((Integer)entry.getValue()).intValue()).sum();
/*      */   }
/*      */   
/*      */   public boolean fi() {
/*  872 */     return eU().a((Set<blx>)ImmutableSet.of(bmd.kV, bmd.oZ, bmd.oY, bmd.qg));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void eW() {
/*  877 */     bfk ☃ = eX();
/*      */     
/*  879 */     Int2ObjectMap<bfn.f[]> int2ObjectMap = bfn.a.get(☃.b());
/*  880 */     if (int2ObjectMap == null || int2ObjectMap.isEmpty()) {
/*      */       return;
/*      */     }
/*      */     
/*  884 */     bfn.f[] arrayOfF = (bfn.f[])int2ObjectMap.get(☃.c());
/*      */     
/*  886 */     if (arrayOfF == null) {
/*      */       return;
/*      */     }
/*      */     
/*  890 */     bqw bqw = eO();
/*  891 */     a(bqw, arrayOfF, 2);
/*      */   }
/*      */   
/*      */   public void a(aag ☃, bfj bfj1, long l) {
/*  895 */     if ((l >= this.bz && l < this.bz + 1200L) || (l >= bfj1.bz && l < bfj1.bz + 1200L)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  900 */     this.by.a(bfj1.by, this.J, 10);
/*      */     
/*  902 */     this.bz = l;
/*  903 */     bfj1.bz = l;
/*      */     
/*  905 */     a(☃, l, 5);
/*      */   }
/*      */   
/*      */   private void fw() {
/*  909 */     long ☃ = this.l.T();
/*      */     
/*  911 */     if (this.bA == 0L) {
/*  912 */       this.bA = ☃;
/*      */       
/*      */       return;
/*      */     } 
/*  916 */     if (☃ < this.bA + 24000L) {
/*      */       return;
/*      */     }
/*      */     
/*  920 */     this.by.b();
/*  921 */     this.bA = ☃;
/*      */   }
/*      */   
/*      */   public void a(aag ☃, long l, int i) {
/*  925 */     if (!a(l)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  930 */     dci dci = cc().c(10.0D, 10.0D, 10.0D);
/*      */     
/*  932 */     List<bfj> list1 = ☃.a(bfj.class, dci);
/*      */ 
/*      */ 
/*      */     
/*  936 */     List<bfj> list2 = (List<bfj>)list1.stream().filter(bfj1 -> bfj1.a(☃)).limit(5L).collect(Collectors.toList());
/*      */     
/*  938 */     if (list2.size() < i) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  944 */     bai bai = d(☃);
/*  945 */     if (bai == null) {
/*      */       return;
/*      */     }
/*      */     
/*  949 */     list1.forEach(ayq::b);
/*      */   }
/*      */   
/*      */   public boolean a(long ☃) {
/*  953 */     if (!b(this.l.T())) {
/*  954 */       return false;
/*      */     }
/*  956 */     if (this.bg.a(ayd.E)) {
/*  957 */       return false;
/*      */     }
/*  959 */     return true;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private bai d(aag ☃) {
/*  964 */     fx fx = cB();
/*  965 */     for (int i = 0; i < 10; i++) {
/*  966 */       double d1 = (☃.t.nextInt(16) - 8);
/*  967 */       double d2 = (☃.t.nextInt(16) - 8);
/*  968 */       fx fx1 = a(fx, d1, d2);
/*  969 */       if (fx1 != null) {
/*      */ 
/*      */ 
/*      */         
/*  973 */         bai bai = aqe.K.b(☃, null, null, null, fx1, aqp.f, false, false);
/*  974 */         if (bai != null) {
/*  975 */           if (bai.a(☃, aqp.f) && bai.a(☃)) {
/*  976 */             ☃.l(bai);
/*  977 */             return bai;
/*      */           } 
/*  979 */           bai.ad();
/*      */         } 
/*      */       } 
/*      */     } 
/*  983 */     return null;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private fx a(fx ☃, double d1, double d2) {
/*  988 */     int i = 6;
/*      */     
/*  990 */     fx fx1 = ☃.a(d1, 6.0D, d2);
/*  991 */     ceh ceh = this.l.d_(fx1);
/*      */     
/*  993 */     for (int j = 6; j >= -6; j--) {
/*  994 */       fx fx2 = fx1;
/*  995 */       ceh ceh1 = ceh;
/*  996 */       fx1 = fx2.c();
/*  997 */       ceh = this.l.d_(fx1);
/*  998 */       if ((ceh1.g() || ceh1.c().a()) && ceh.c().f()) {
/*  999 */         return fx2;
/*      */       }
/*      */     } 
/* 1002 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(azl ☃, aqa aqa1) {
/* 1007 */     if (☃ == azl.a) {
/* 1008 */       this.by.a(aqa1.bS(), aya.d, 20);
/* 1009 */       this.by.a(aqa1.bS(), aya.c, 25);
/* 1010 */     } else if (☃ == azl.e) {
/* 1011 */       this.by.a(aqa1.bS(), aya.e, 2);
/* 1012 */     } else if (☃ == azl.c) {
/* 1013 */       this.by.a(aqa1.bS(), aya.b, 25);
/* 1014 */     } else if (☃ == azl.d) {
/* 1015 */       this.by.a(aqa1.bS(), aya.a, 25);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public int eL() {
/* 1021 */     return this.bB;
/*      */   }
/*      */   
/*      */   public void u(int ☃) {
/* 1025 */     this.bB = ☃;
/*      */   }
/*      */   
/*      */   private void fx() {
/* 1029 */     fo();
/* 1030 */     this.bD = 0;
/*      */   }
/*      */   
/*      */   public axz fj() {
/* 1034 */     return this.by;
/*      */   }
/*      */   
/*      */   public void a(mt ☃) {
/* 1038 */     this.by.a(new Dynamic(mo.a, ☃));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void M() {
/* 1043 */     super.M();
/*      */     
/* 1045 */     rz.a(this);
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(fx ☃) {
/* 1050 */     super.b(☃);
/* 1051 */     this.bg.a(ayd.F, Long.valueOf(this.l.T()));
/* 1052 */     this.bg.b(ayd.m);
/* 1053 */     this.bg.b(ayd.D);
/*      */   }
/*      */ 
/*      */   
/*      */   public void en() {
/* 1058 */     super.en();
/* 1059 */     this.bg.a(ayd.G, Long.valueOf(this.l.T()));
/*      */   }
/*      */   
/*      */   private boolean b(long ☃) {
/* 1063 */     Optional<Long> optional = this.bg.c(ayd.F);
/* 1064 */     if (optional.isPresent()) {
/* 1065 */       return (☃ - ((Long)optional.get()).longValue() < 24000L);
/*      */     }
/* 1067 */     return false;
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
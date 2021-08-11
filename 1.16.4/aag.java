/*      */ import com.google.common.annotations.VisibleForTesting;
/*      */ import com.google.common.collect.Iterables;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Queues;
/*      */ import com.google.common.collect.Sets;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
/*      */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*      */ import it.unimi.dsi.fastutil.longs.LongSet;
/*      */ import it.unimi.dsi.fastutil.longs.LongSets;
/*      */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*      */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*      */ import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
/*      */ import java.io.IOException;
/*      */ import java.io.Writer;
/*      */ import java.nio.file.Files;
/*      */ import java.nio.file.Path;
/*      */ import java.util.Collection;
/*      */ import java.util.Comparator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Objects;
/*      */ import java.util.Optional;
/*      */ import java.util.Queue;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ import java.util.concurrent.Executor;
/*      */ import java.util.function.BooleanSupplier;
/*      */ import java.util.function.Function;
/*      */ import java.util.function.Predicate;
/*      */ import java.util.function.Supplier;
/*      */ import java.util.stream.Collectors;
/*      */ import java.util.stream.Stream;
/*      */ import javax.annotation.Nonnull;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class aag
/*      */   extends brx
/*      */   implements bsr
/*      */ {
/*  147 */   public static final fx a = new fx(100, 50, 0);
/*      */   
/*  149 */   private static final Logger x = LogManager.getLogger();
/*      */ 
/*      */ 
/*      */   
/*  153 */   private final Int2ObjectMap<aqa> y = (Int2ObjectMap<aqa>)new Int2ObjectLinkedOpenHashMap();
/*  154 */   private final Map<UUID, aqa> z = Maps.newHashMap();
/*  155 */   private final Queue<aqa> A = Queues.newArrayDeque();
/*  156 */   private final List<aah> B = Lists.newArrayList();
/*      */   
/*      */   private final aae C;
/*      */   
/*      */   boolean b;
/*      */   
/*      */   private final MinecraftServer D;
/*      */   
/*      */   private final cym E;
/*      */   
/*      */   public boolean c;
/*      */   
/*      */   private boolean F;
/*      */   
/*      */   private int G;
/*      */   
/*      */   private final cxl H;
/*      */   private final bsl<buo> I;
/*      */   private final bsl<cuw> J;
/*      */   private final Set<ayj> K;
/*      */   protected final bhd d;
/*      */   private final ObjectLinkedOpenHashSet<brb> L;
/*      */   private boolean M;
/*      */   private final List<brj> N;
/*      */   @Nullable
/*      */   private final chg O;
/*      */   private final bsn P;
/*      */   private final boolean Q;
/*      */   
/*      */   public aag(MinecraftServer ☃, Executor executor, cyg.a a1, cym cym1, vj<brx> vj1, chd chd1, aap aap1, cfy cfy1, boolean bool1, long l, List<brj> list, boolean bool2) {
/*  186 */     super(cym1, vj1, chd1, ☃::aQ, false, bool1, l); this.I = new bsl<>(this, ☃ -> (☃ == null || ☃.n().g()), gm.Q::b, this::b); this.J = new bsl<>(this, ☃ -> (☃ == null || ☃ == cuy.a), gm.O::b, this::a); this.K = Sets.newHashSet(); this.L = new ObjectLinkedOpenHashSet();
/*  187 */     this.Q = bool2;
/*  188 */     this.D = ☃;
/*  189 */     this.N = list;
/*  190 */     this.E = cym1;
/*  191 */     this.C = new aae(this, a1, ☃.az(), ☃.aW(), executor, cfy1, ☃.ae().p(), ☃.aV(), aap1, () -> ☃.E().s());
/*      */     
/*  193 */     this.H = new cxl(this);
/*      */     
/*  195 */     Q();
/*  196 */     R();
/*      */     
/*  198 */     f().a(☃.au());
/*      */     
/*  200 */     this.d = s().<bhd>a(() -> new bhd(this), bhd.a(k()));
/*      */     
/*  202 */     if (!☃.O()) {
/*  203 */       cym1.a(☃.s());
/*      */     }
/*      */     
/*  206 */     this.P = new bsn(this, ☃.aX().A());
/*      */     
/*  208 */     if (k().l()) {
/*  209 */       this.O = new chg(this, ☃.aX().A().a(), ☃.aX().C());
/*      */     } else {
/*  211 */       this.O = null;
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(int ☃, int i, boolean bool1, boolean bool2) {
/*  216 */     this.E.a(☃);
/*  217 */     this.E.f(i);
/*  218 */     this.E.e(i);
/*  219 */     this.E.b(bool1);
/*  220 */     this.E.a(bool2);
/*      */   }
/*      */ 
/*      */   
/*      */   public bsv a(int ☃, int i, int j) {
/*  225 */     return i().g().d().b(☃, i, j);
/*      */   }
/*      */   
/*      */   public bsn a() {
/*  229 */     return this.P;
/*      */   }
/*      */   
/*      */   public void a(BooleanSupplier ☃) {
/*  233 */     anw anw = Z();
/*      */     
/*  235 */     this.M = true;
/*  236 */     anw.a("world border");
/*  237 */     f().s();
/*  238 */     anw.b("weather");
/*  239 */     boolean bool1 = X();
/*  240 */     if (k().b()) {
/*  241 */       if (V().b(brt.t)) {
/*  242 */         int i = this.E.h();
/*  243 */         int j = this.E.j();
/*  244 */         int k = this.E.l();
/*  245 */         boolean bool3 = this.u.i();
/*  246 */         boolean bool4 = this.u.k();
/*      */ 
/*      */         
/*  249 */         if (i > 0) {
/*  250 */           i--;
/*  251 */           j = bool3 ? 0 : 1;
/*  252 */           k = bool4 ? 0 : 1;
/*  253 */           bool3 = false;
/*  254 */           bool4 = false;
/*      */         } else {
/*      */           
/*  257 */           if (j > 0) {
/*  258 */             j--;
/*  259 */             if (j == 0)
/*      */             {
/*  261 */               bool3 = !bool3;
/*      */             
/*      */             }
/*      */           }
/*  265 */           else if (bool3) {
/*      */             
/*  267 */             j = this.t.nextInt(12000) + 3600;
/*      */           } else {
/*      */             
/*  270 */             j = this.t.nextInt(168000) + 12000;
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/*  275 */           if (k > 0) {
/*  276 */             k--;
/*  277 */             if (k == 0) {
/*  278 */               bool4 = !bool4;
/*      */             }
/*      */           }
/*  281 */           else if (bool4) {
/*      */             
/*  283 */             k = this.t.nextInt(12000) + 12000;
/*      */           } else {
/*      */             
/*  286 */             k = this.t.nextInt(168000) + 12000;
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  291 */         this.E.e(j);
/*  292 */         this.E.f(k);
/*  293 */         this.E.a(i);
/*  294 */         this.E.a(bool3);
/*  295 */         this.E.b(bool4);
/*      */       } 
/*      */       
/*  298 */       this.r = this.s;
/*  299 */       if (this.u.i()) {
/*  300 */         this.s = (float)(this.s + 0.01D);
/*      */       } else {
/*  302 */         this.s = (float)(this.s - 0.01D);
/*      */       } 
/*  304 */       this.s = afm.a(this.s, 0.0F, 1.0F);
/*      */       
/*  306 */       this.p = this.q;
/*  307 */       if (this.u.k()) {
/*  308 */         this.q = (float)(this.q + 0.01D);
/*      */       } else {
/*  310 */         this.q = (float)(this.q - 0.01D);
/*      */       } 
/*  312 */       this.q = afm.a(this.q, 0.0F, 1.0F);
/*      */     } 
/*      */     
/*  315 */     if (this.p != this.q) {
/*  316 */       this.D.ae().a(new pq(pq.h, this.q), Y());
/*      */     }
/*  318 */     if (this.r != this.s) {
/*  319 */       this.D.ae().a(new pq(pq.i, this.s), Y());
/*      */     }
/*      */     
/*  322 */     if (bool1 != X()) {
/*  323 */       if (bool1) {
/*  324 */         this.D.ae().a(new pq(pq.c, 0.0F));
/*      */       } else {
/*  326 */         this.D.ae().a(new pq(pq.b, 0.0F));
/*      */       } 
/*  328 */       this.D.ae().a(new pq(pq.h, this.q));
/*  329 */       this.D.ae().a(new pq(pq.i, this.s));
/*      */     } 
/*      */ 
/*      */     
/*  333 */     if (this.F && this.B.stream().noneMatch(☃ -> (!☃.a_() && !☃.eB()))) {
/*  334 */       this.F = false;
/*  335 */       if (V().b(brt.j)) {
/*      */         
/*  337 */         long l = this.u.f() + 24000L;
/*  338 */         a(l - l % 24000L);
/*      */       } 
/*      */       
/*  341 */       ah();
/*      */       
/*  343 */       if (V().b(brt.t)) {
/*  344 */         ai();
/*      */       }
/*      */     } 
/*      */     
/*  348 */     Q();
/*      */     
/*  350 */     b();
/*      */     
/*  352 */     anw.b("chunkSource");
/*  353 */     i().a(☃);
/*      */     
/*  355 */     anw.b("tickPending");
/*  356 */     if (!ab()) {
/*  357 */       this.I.b();
/*  358 */       this.J.b();
/*      */     } 
/*      */     
/*  361 */     anw.b("raid");
/*  362 */     this.d.a();
/*      */     
/*  364 */     anw.b("blockEvents");
/*      */     
/*  366 */     ak();
/*  367 */     this.M = false;
/*      */     
/*  369 */     anw.b("entities");
/*      */ 
/*      */     
/*  372 */     boolean bool2 = (!this.B.isEmpty() || !w().isEmpty());
/*      */     
/*  374 */     if (bool2) {
/*  375 */       p_();
/*      */     }
/*  377 */     if (bool2 || this.G++ < 300) {
/*  378 */       if (this.O != null) {
/*  379 */         this.O.b();
/*      */       }
/*  381 */       this.b = true;
/*  382 */       ObjectIterator<Int2ObjectMap.Entry<aqa>> objectIterator = this.y.int2ObjectEntrySet().iterator();
/*  383 */       while (objectIterator.hasNext()) {
/*  384 */         Int2ObjectMap.Entry<aqa> entry = (Int2ObjectMap.Entry<aqa>)objectIterator.next();
/*  385 */         aqa aqa1 = (aqa)entry.getValue();
/*  386 */         aqa aqa2 = aqa1.ct();
/*  387 */         if (!this.D.X() && (aqa1 instanceof azz || aqa1 instanceof bay)) {
/*  388 */           aqa1.ad();
/*      */         }
/*  390 */         if (!this.D.Y() && aqa1 instanceof bfi) {
/*  391 */           aqa1.ad();
/*      */         }
/*      */         
/*  394 */         anw.a("checkDespawn");
/*  395 */         if (!aqa1.y) {
/*  396 */           aqa1.cI();
/*      */         }
/*  398 */         anw.c();
/*      */         
/*  400 */         if (aqa2 != null) {
/*  401 */           if (aqa2.y || !aqa2.w(aqa1)) {
/*  402 */             aqa1.l();
/*      */           } else {
/*      */             continue;
/*      */           } 
/*      */         }
/*      */         
/*  408 */         anw.a("tick");
/*      */         
/*  410 */         if (!aqa1.y && !(aqa1 instanceof bbp)) {
/*  411 */           a(this::a, aqa1);
/*      */         }
/*  413 */         anw.c();
/*      */         
/*  415 */         anw.a("remove");
/*  416 */         if (aqa1.y) {
/*  417 */           p(aqa1);
/*  418 */           objectIterator.remove();
/*  419 */           h(aqa1);
/*      */         } 
/*  421 */         anw.c();
/*      */       } 
/*  423 */       this.b = false;
/*      */       aqa aqa;
/*  425 */       while ((aqa = this.A.poll()) != null) {
/*  426 */         o(aqa);
/*      */       }
/*      */       
/*  429 */       O();
/*      */     } 
/*      */     
/*  432 */     anw.c();
/*      */   }
/*      */   
/*      */   protected void b() {
/*  436 */     if (!this.Q) {
/*      */       return;
/*      */     }
/*  439 */     long ☃ = this.u.e() + 1L;
/*  440 */     this.E.a(☃);
/*  441 */     this.E.u().a(this.D, ☃);
/*  442 */     if (this.u.q().b(brt.j)) {
/*  443 */       a(this.u.f() + 1L);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(long ☃) {
/*  448 */     this.E.b(☃);
/*      */   }
/*      */   
/*      */   public void a(boolean ☃, boolean bool1) {
/*  452 */     for (brj brj : this.N) {
/*  453 */       brj.a(this, ☃, bool1);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private void ah() {
/*  459 */     ((List)this.B.stream().filter(aqm::em).collect(Collectors.toList())).forEach(☃ -> ☃.a(false, false));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(cgh ☃, int i) {
/*  465 */     brd brd = ☃.g();
/*  466 */     boolean bool = X();
/*  467 */     int j = brd.d();
/*  468 */     int k = brd.e();
/*      */     
/*  470 */     anw anw = Z();
/*  471 */     anw.a("thunder");
/*  472 */     if (bool && W() && this.t.nextInt(100000) == 0) {
/*  473 */       fx fx1 = a(a(j, 0, k, 15));
/*  474 */       if (t(fx1)) {
/*  475 */         aos aos = d(fx1);
/*      */         
/*  477 */         boolean bool1 = (V().b(brt.d) && this.t.nextDouble() < aos.b() * 0.01D);
/*  478 */         if (bool1) {
/*  479 */           bbh bbh = aqe.aw.a(this);
/*  480 */           bbh.t(true);
/*  481 */           bbh.c_(0);
/*  482 */           bbh.d(fx1.u(), fx1.v(), fx1.w());
/*  483 */           c(bbh);
/*      */         } 
/*  485 */         aql aql = aqe.P.a(this);
/*  486 */         aql.d(dcn.c(fx1));
/*  487 */         aql.a(bool1);
/*  488 */         c(aql);
/*      */       } 
/*      */     } 
/*      */     
/*  492 */     anw.b("iceandsnow");
/*  493 */     if (this.t.nextInt(16) == 0) {
/*  494 */       fx fx1 = a(chn.a.e, a(j, 0, k, 15));
/*  495 */       fx fx2 = fx1.c();
/*  496 */       bsv bsv = v(fx1);
/*      */       
/*  498 */       if (bsv.a(this, fx2)) {
/*  499 */         a(fx2, bup.cD.n());
/*      */       }
/*      */       
/*  502 */       if (bool && bsv.b(this, fx1)) {
/*  503 */         a(fx1, bup.cC.n());
/*      */       }
/*      */       
/*  506 */       if (bool && v(fx2).c() == bsv.e.b) {
/*  507 */         d_(fx2).b().c(this, fx2);
/*      */       }
/*      */     } 
/*      */     
/*  511 */     anw.b("tickBlocks");
/*  512 */     if (i > 0) {
/*  513 */       for (cgi cgi : ☃.d()) {
/*  514 */         if (cgi != cgh.a && cgi.d()) {
/*  515 */           int m = cgi.g();
/*  516 */           for (int n = 0; n < i; n++) {
/*  517 */             fx fx1 = a(j, m, k, 15);
/*      */             
/*  519 */             anw.a("randomTick");
/*  520 */             ceh ceh = cgi.a(fx1.u() - j, fx1.v() - m, fx1.w() - k);
/*  521 */             if (ceh.n()) {
/*  522 */               ceh.b(this, fx1, this.t);
/*      */             }
/*  524 */             cux cux = ceh.m();
/*  525 */             if (cux.f()) {
/*  526 */               cux.b(this, fx1, this.t);
/*      */             }
/*  528 */             anw.c();
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*  533 */     anw.c();
/*      */   }
/*      */   
/*      */   protected fx a(fx ☃) {
/*  537 */     fx fx1 = a(chn.a.e, ☃);
/*  538 */     dci dci = (new dci(fx1, new fx(fx1.u(), L(), fx1.w()))).g(3.0D);
/*      */     
/*  540 */     List<aqm> list = a(aqm.class, dci, ☃ -> (☃ != null && ☃.aX() && e(☃.cB())));
/*      */     
/*  542 */     if (!list.isEmpty()) {
/*  543 */       return ((aqm)list.get(this.t.nextInt(list.size()))).cB();
/*      */     }
/*      */     
/*  546 */     if (fx1.v() == -1) {
/*  547 */       fx1 = fx1.b(2);
/*      */     }
/*      */     
/*  550 */     return fx1;
/*      */   }
/*      */   
/*      */   public boolean m_() {
/*  554 */     return this.M;
/*      */   }
/*      */   
/*      */   public void n_() {
/*  558 */     this.F = false;
/*      */     
/*  560 */     if (!this.B.isEmpty()) {
/*  561 */       int ☃ = 0;
/*  562 */       int i = 0;
/*      */       
/*  564 */       for (aah aah : this.B) {
/*  565 */         if (aah.a_()) {
/*  566 */           ☃++; continue;
/*  567 */         }  if (aah.em()) {
/*  568 */           i++;
/*      */         }
/*      */       } 
/*      */       
/*  572 */       this.F = (i > 0 && i >= this.B.size() - ☃);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public wa o_() {
/*  578 */     return this.D.aH();
/*      */   }
/*      */   
/*      */   private void ai() {
/*  582 */     this.E.f(0);
/*  583 */     this.E.b(false);
/*  584 */     this.E.e(0);
/*  585 */     this.E.a(false);
/*      */   }
/*      */   
/*      */   public void p_() {
/*  589 */     this.G = 0;
/*      */   }
/*      */   
/*      */   private void a(bsp<cuw> ☃) {
/*  593 */     cux cux = b(☃.a);
/*  594 */     if (cux.a() == ☃.b()) {
/*  595 */       cux.a(this, ☃.a);
/*      */     }
/*      */   }
/*      */   
/*      */   private void b(bsp<buo> ☃) {
/*  600 */     ceh ceh = d_(☃.a);
/*  601 */     if (ceh.a(☃.b())) {
/*  602 */       ceh.a(this, ☃.a, this.t);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(aqa ☃) {
/*  607 */     if (!(☃ instanceof bfw) && !i().a(☃)) {
/*  608 */       b(☃);
/*      */       
/*      */       return;
/*      */     } 
/*  612 */     ☃.g(☃.cD(), ☃.cE(), ☃.cH());
/*  613 */     ☃.r = ☃.p;
/*  614 */     ☃.s = ☃.q;
/*      */     
/*  616 */     if (☃.U) {
/*  617 */       ☃.K++;
/*  618 */       anw anw = Z();
/*  619 */       anw.a(() -> gm.S.b(☃.X()).toString());
/*  620 */       anw.c("tickNonPassenger");
/*  621 */       ☃.j();
/*  622 */       anw.c();
/*      */     } 
/*      */     
/*  625 */     b(☃);
/*      */     
/*  627 */     if (☃.U) {
/*  628 */       for (aqa aqa1 : ☃.cn()) {
/*  629 */         a(☃, aqa1);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(aqa ☃, aqa aqa1) {
/*  635 */     if (aqa1.y || aqa1.ct() != ☃) {
/*  636 */       aqa1.l();
/*      */       return;
/*      */     } 
/*  639 */     if (!(aqa1 instanceof bfw) && !i().a(aqa1)) {
/*      */       return;
/*      */     }
/*      */     
/*  643 */     aqa1.g(aqa1.cD(), aqa1.cE(), aqa1.cH());
/*  644 */     aqa1.r = aqa1.p;
/*  645 */     aqa1.s = aqa1.q;
/*      */     
/*  647 */     if (aqa1.U) {
/*  648 */       aqa1.K++;
/*  649 */       anw anw = Z();
/*  650 */       anw.a(() -> gm.S.b(☃.X()).toString());
/*  651 */       anw.c("tickPassenger");
/*  652 */       aqa1.ba();
/*  653 */       anw.c();
/*      */     } 
/*      */     
/*  656 */     b(aqa1);
/*      */     
/*  658 */     if (aqa1.U) {
/*  659 */       for (aqa aqa2 : aqa1.cn()) {
/*  660 */         a(aqa1, aqa2);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(aqa ☃) {
/*  666 */     if (!☃.cl()) {
/*      */       return;
/*      */     }
/*  669 */     Z().a("chunkCheck");
/*  670 */     int i = afm.c(☃.cD() / 16.0D);
/*  671 */     int j = afm.c(☃.cE() / 16.0D);
/*  672 */     int k = afm.c(☃.cH() / 16.0D);
/*      */     
/*  674 */     if (!☃.U || ☃.V != i || ☃.W != j || ☃.X != k) {
/*  675 */       if (☃.U && b(☃.V, ☃.X)) {
/*  676 */         d(☃.V, ☃.X).a(☃, ☃.W);
/*      */       }
/*      */       
/*  679 */       if (☃.ck() || b(i, k)) {
/*  680 */         d(i, k).a(☃);
/*      */       } else {
/*  682 */         if (☃.U) {
/*  683 */           x.warn("Entity {} left loaded chunk area", ☃);
/*      */         }
/*  685 */         ☃.U = false;
/*      */       } 
/*      */     } 
/*  688 */     Z().c();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean a(bfw ☃, fx fx1) {
/*  693 */     return (!this.D.a(this, fx1, ☃) && f().a(fx1));
/*      */   }
/*      */   
/*      */   public void a(@Nullable afn ☃, boolean bool1, boolean bool2) {
/*  697 */     aae aae1 = i();
/*  698 */     if (bool2) {
/*      */       return;
/*      */     }
/*      */     
/*  702 */     if (☃ != null) {
/*  703 */       ☃.a(new of("menu.savingLevel"));
/*      */     }
/*  705 */     aj();
/*      */     
/*  707 */     if (☃ != null) {
/*  708 */       ☃.c(new of("menu.savingChunks"));
/*      */     }
/*  710 */     aae1.a(bool1);
/*      */   }
/*      */   
/*      */   private void aj() {
/*  714 */     if (this.O != null) {
/*  715 */       this.D.aX().a(this.O.a());
/*      */     }
/*  717 */     i().i().a();
/*      */   }
/*      */   
/*      */   public List<aqa> a(@Nullable aqe<?> ☃, Predicate<? super aqa> predicate) {
/*  721 */     List<aqa> list = Lists.newArrayList();
/*  722 */     aae aae1 = i();
/*  723 */     for (ObjectIterator<aqa> objectIterator = this.y.values().iterator(); objectIterator.hasNext(); ) { aqa aqa = objectIterator.next();
/*  724 */       if ((☃ == null || aqa.X() == ☃) && aae1.b(afm.c(aqa.cD()) >> 4, afm.c(aqa.cH()) >> 4) && predicate.test(aqa)) {
/*  725 */         list.add(aqa);
/*      */       } }
/*      */     
/*  728 */     return list;
/*      */   }
/*      */   
/*      */   public List<bbr> g() {
/*  732 */     List<bbr> ☃ = Lists.newArrayList();
/*  733 */     for (ObjectIterator<aqa> objectIterator = this.y.values().iterator(); objectIterator.hasNext(); ) { aqa aqa = objectIterator.next();
/*  734 */       if (aqa instanceof bbr && aqa.aX()) {
/*  735 */         ☃.add((bbr)aqa);
/*      */       } }
/*      */     
/*  738 */     return ☃;
/*      */   }
/*      */   
/*      */   public List<aah> a(Predicate<? super aah> ☃) {
/*  742 */     List<aah> list = Lists.newArrayList();
/*  743 */     for (aah aah : this.B) {
/*  744 */       if (☃.test(aah)) {
/*  745 */         list.add(aah);
/*      */       }
/*      */     } 
/*  748 */     return list;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aah q_() {
/*  753 */     List<aah> ☃ = a(aqm::aX);
/*  754 */     if (☃.isEmpty()) {
/*  755 */       return null;
/*      */     }
/*  757 */     return ☃.get(this.t.nextInt(☃.size()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean c(aqa ☃) {
/*  765 */     return m(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean d(aqa ☃) {
/*  772 */     return m(☃);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void e(aqa ☃) {
/*  780 */     boolean bool = ☃.k;
/*  781 */     ☃.k = true;
/*  782 */     d(☃);
/*  783 */     ☃.k = bool;
/*  784 */     b(☃);
/*      */   }
/*      */   
/*      */   public void a(aah ☃) {
/*  788 */     f(☃);
/*  789 */     b(☃);
/*      */   }
/*      */   
/*      */   public void b(aah ☃) {
/*  793 */     f(☃);
/*  794 */     b(☃);
/*      */   }
/*      */   
/*      */   public void c(aah ☃) {
/*  798 */     f(☃);
/*      */   }
/*      */   
/*      */   public void d(aah ☃) {
/*  802 */     f(☃);
/*      */   }
/*      */   
/*      */   private void f(aah ☃) {
/*  806 */     aqa aqa = this.z.get(☃.bS());
/*  807 */     if (aqa != null) {
/*  808 */       x.warn("Force-added player with duplicate UUID {}", ☃.bS().toString());
/*  809 */       aqa.V();
/*  810 */       e((aah)aqa);
/*      */     } 
/*  812 */     this.B.add(☃);
/*  813 */     n_();
/*      */     
/*  815 */     cfw cfw = a(afm.c(☃.cD() / 16.0D), afm.c(☃.cH() / 16.0D), cga.m, true);
/*  816 */     if (cfw instanceof cgh) {
/*  817 */       cfw.a(☃);
/*      */     }
/*  819 */     o(☃);
/*      */   }
/*      */   
/*      */   private boolean m(aqa ☃) {
/*  823 */     if (☃.y) {
/*  824 */       x.warn("Tried to add entity {} but it was marked as removed already", aqe.a(☃.X()));
/*  825 */       return false;
/*      */     } 
/*  827 */     if (n(☃)) {
/*  828 */       return false;
/*      */     }
/*  830 */     cfw cfw = a(afm.c(☃.cD() / 16.0D), afm.c(☃.cH() / 16.0D), cga.m, ☃.k);
/*  831 */     if (!(cfw instanceof cgh)) {
/*  832 */       return false;
/*      */     }
/*  834 */     cfw.a(☃);
/*  835 */     o(☃);
/*  836 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean f(aqa ☃) {
/*  843 */     if (n(☃)) {
/*  844 */       return false;
/*      */     }
/*  846 */     o(☃);
/*  847 */     return true;
/*      */   }
/*      */   
/*      */   private boolean n(aqa ☃) {
/*  851 */     UUID uUID = ☃.bS();
/*  852 */     aqa aqa1 = c(uUID);
/*  853 */     if (aqa1 == null) {
/*  854 */       return false;
/*      */     }
/*  856 */     x.warn("Trying to add entity with duplicated UUID {}. Existing {}#{}, new: {}#{}", uUID, 
/*      */         
/*  858 */         aqe.a(aqa1.X()), Integer.valueOf(aqa1.Y()), 
/*  859 */         aqe.a(☃.X()), Integer.valueOf(☃.Y()));
/*  860 */     return true;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private aqa c(UUID ☃) {
/*  865 */     aqa aqa = this.z.get(☃);
/*  866 */     if (aqa != null) {
/*  867 */       return aqa;
/*      */     }
/*  869 */     if (this.b) {
/*  870 */       for (aqa aqa1 : this.A) {
/*  871 */         if (aqa1.bS().equals(☃)) {
/*  872 */           return aqa1;
/*      */         }
/*      */       } 
/*      */     }
/*  876 */     return null;
/*      */   }
/*      */   
/*      */   public boolean g(aqa ☃) {
/*  880 */     if (☃.cp().anyMatch(this::n)) {
/*  881 */       return false;
/*      */     }
/*      */     
/*  884 */     l(☃);
/*  885 */     return true;
/*      */   }
/*      */   
/*      */   public void a(cgh ☃) {
/*  889 */     this.m.addAll(☃.y().values());
/*  890 */     for (aes<aqa> aes : ☃.z()) {
/*  891 */       for (aqa aqa : aes) {
/*  892 */         if (aqa instanceof aah) {
/*      */           continue;
/*      */         }
/*  895 */         if (this.b) {
/*  896 */           throw (IllegalStateException)x.c(new IllegalStateException("Removing entity while ticking!"));
/*      */         }
/*  898 */         this.y.remove(aqa.Y());
/*  899 */         h(aqa);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void h(aqa ☃) {
/*  905 */     if (☃ instanceof bbr) {
/*  906 */       for (bbp bbp : ((bbr)☃).eJ()) {
/*  907 */         bbp.ad();
/*      */       }
/*      */     }
/*  910 */     this.z.remove(☃.bS());
/*  911 */     i().b(☃);
/*  912 */     if (☃ instanceof aah) {
/*  913 */       aah aah = (aah)☃;
/*  914 */       this.B.remove(aah);
/*      */     } 
/*  916 */     o_().a(☃);
/*  917 */     if (☃ instanceof aqn) {
/*  918 */       this.K.remove(((aqn)☃).x());
/*      */     }
/*      */   }
/*      */   
/*      */   private void o(aqa ☃) {
/*  923 */     if (this.b) {
/*  924 */       this.A.add(☃);
/*      */     } else {
/*  926 */       this.y.put(☃.Y(), ☃);
/*  927 */       if (☃ instanceof bbr) {
/*  928 */         for (bbp bbp : ((bbr)☃).eJ()) {
/*  929 */           this.y.put(bbp.Y(), bbp);
/*      */         }
/*      */       }
/*  932 */       this.z.put(☃.bS(), ☃);
/*  933 */       i().c(☃);
/*  934 */       if (☃ instanceof aqn) {
/*  935 */         this.K.add(((aqn)☃).x());
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public void i(aqa ☃) {
/*  941 */     if (this.b) {
/*  942 */       throw (IllegalStateException)x.c(new IllegalStateException("Removing entity while ticking!"));
/*      */     }
/*  944 */     p(☃);
/*  945 */     this.y.remove(☃.Y());
/*  946 */     h(☃);
/*      */   }
/*      */   
/*      */   private void p(aqa ☃) {
/*  950 */     cfw cfw = a(☃.V, ☃.X, cga.m, false);
/*  951 */     if (cfw instanceof cgh) {
/*  952 */       ((cgh)cfw).b(☃);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e(aah ☃) {
/*  957 */     ☃.ad();
/*  958 */     i(☃);
/*  959 */     n_();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(int ☃, fx fx1, int i) {
/*  964 */     for (aah aah : this.D.ae().s()) {
/*  965 */       if (aah == null || aah.l != this || aah.Y() == ☃) {
/*      */         continue;
/*      */       }
/*  968 */       double d1 = fx1.u() - aah.cD();
/*  969 */       double d2 = fx1.v() - aah.cE();
/*  970 */       double d3 = fx1.w() - aah.cH();
/*      */       
/*  972 */       if (d1 * d1 + d2 * d2 + d3 * d3 < 1024.0D) {
/*  973 */         aah.b.a(new ov(☃, fx1, i));
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(@Nullable bfw ☃, double d1, double d2, double d3, adp adp1, adr adr1, float f1, float f2) {
/*  980 */     this.D.ae().a(☃, d1, d2, d3, (f1 > 1.0F) ? (16.0F * f1) : 16.0D, Y(), new rn(adp1, adr1, d1, d2, d3, f1, f2));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(@Nullable bfw ☃, aqa aqa1, adp adp1, adr adr1, float f1, float f2) {
/*  985 */     this.D.ae().a(☃, aqa1.cD(), aqa1.cE(), aqa1.cH(), (f1 > 1.0F) ? (16.0F * f1) : 16.0D, Y(), new rm(adp1, adr1, aqa1, f1, f2));
/*      */   }
/*      */ 
/*      */   
/*      */   public void b(int ☃, fx fx1, int i) {
/*  990 */     this.D.ae().a(new pu(☃, fx1, i, true));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(@Nullable bfw ☃, int i, fx fx1, int j) {
/*  995 */     this.D.ae().a(☃, fx1.u(), fx1.v(), fx1.w(), 64.0D, Y(), new pu(i, fx1, j, false));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fx ☃, ceh ceh1, ceh ceh2, int i) {
/* 1000 */     i().b(☃);
/* 1001 */     ddh ddh1 = ceh1.k(this, ☃);
/* 1002 */     ddh ddh2 = ceh2.k(this, ☃);
/* 1003 */     if (!dde.c(ddh1, ddh2, dcr.g)) {
/*      */       return;
/*      */     }
/*      */     
/* 1007 */     for (ayj ayj : this.K) {
/* 1008 */       if (ayj.i()) {
/*      */         continue;
/*      */       }
/*      */       
/* 1012 */       ayj.b(☃);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(aqa ☃, byte b) {
/* 1018 */     i().a(☃, new pn(☃, b));
/*      */   }
/*      */ 
/*      */   
/*      */   public aae i() {
/* 1023 */     return this.C;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public brp a(@Nullable aqa ☃, @Nullable apk apk1, @Nullable brq brq1, double d1, double d2, double d3, float f, boolean bool, brp.a a1) {
/* 1030 */     brp brp = new brp(this, ☃, apk1, brq1, d1, d2, d3, f, bool, a1);
/* 1031 */     brp.a();
/* 1032 */     brp.a(false);
/*      */     
/* 1034 */     if (a1 == brp.a.a) {
/* 1035 */       brp.e();
/*      */     }
/*      */     
/* 1038 */     for (aah aah : this.B) {
/* 1039 */       if (aah.h(d1, d2, d3) < 4096.0D) {
/* 1040 */         aah.b.a(new po(d1, d2, d3, f, brp.f(), brp.c().get(aah)));
/*      */       }
/*      */     } 
/*      */     
/* 1044 */     return brp;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fx ☃, buo buo1, int i, int j) {
/* 1049 */     this.L.add(new brb(☃, buo1, i, j));
/*      */   }
/*      */   
/*      */   private void ak() {
/* 1053 */     while (!this.L.isEmpty()) {
/* 1054 */       brb ☃ = (brb)this.L.removeFirst();
/* 1055 */       if (a(☃)) {
/* 1056 */         this.D.ae().a(null, ☃.a().u(), ☃.a().v(), ☃.a().w(), 64.0D, Y(), new ox(☃.a(), ☃.b(), ☃.c(), ☃.d()));
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean a(brb ☃) {
/* 1062 */     ceh ceh = d_(☃.a());
/* 1063 */     if (ceh.a(☃.b())) {
/* 1064 */       return ceh.a(this, ☃.a(), ☃.c(), ☃.d());
/*      */     }
/* 1066 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public bsl<buo> j() {
/* 1071 */     return this.I;
/*      */   }
/*      */ 
/*      */   
/*      */   public bsl<cuw> r_() {
/* 1076 */     return this.J;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nonnull
/*      */   public MinecraftServer l() {
/* 1082 */     return this.D;
/*      */   }
/*      */   
/*      */   public cxl m() {
/* 1086 */     return this.H;
/*      */   }
/*      */   
/*      */   public csw n() {
/* 1090 */     return this.D.aW();
/*      */   }
/*      */   
/*      */   public <T extends hf> int a(T ☃, double d1, double d2, double d3, int i, double d4, double d5, double d6, double d7) {
/* 1094 */     pv pv = new pv(☃, false, d1, d2, d3, (float)d4, (float)d5, (float)d6, (float)d7, i);
/* 1095 */     int j = 0;
/*      */     
/* 1097 */     for (int k = 0; k < this.B.size(); k++) {
/* 1098 */       aah aah = this.B.get(k);
/*      */       
/* 1100 */       if (a(aah, false, d1, d2, d3, pv)) {
/* 1101 */         j++;
/*      */       }
/*      */     } 
/*      */     
/* 1105 */     return j;
/*      */   }
/*      */   
/*      */   public <T extends hf> boolean a(aah ☃, T t, boolean bool, double d1, double d2, double d3, int i, double d4, double d5, double d6, double d7) {
/* 1109 */     oj<?> oj = new pv(t, bool, d1, d2, d3, (float)d4, (float)d5, (float)d6, (float)d7, i);
/*      */     
/* 1111 */     return a(☃, bool, d1, d2, d3, oj);
/*      */   }
/*      */   
/*      */   private boolean a(aah ☃, boolean bool, double d1, double d2, double d3, oj<?> oj1) {
/* 1115 */     if (☃.u() != this) {
/* 1116 */       return false;
/*      */     }
/*      */     
/* 1119 */     fx fx1 = ☃.cB();
/*      */     
/* 1121 */     if (fx1.a(new dcn(d1, d2, d3), bool ? 512.0D : 32.0D)) {
/* 1122 */       ☃.b.a(oj1);
/* 1123 */       return true;
/*      */     } 
/*      */     
/* 1126 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public aqa a(int ☃) {
/* 1132 */     return (aqa)this.y.get(☃);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public aqa a(UUID ☃) {
/* 1137 */     return this.z.get(☃);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public fx a(cla<?> ☃, fx fx1, int i, boolean bool) {
/* 1142 */     if (!this.D.aX().A().b()) {
/* 1143 */       return null;
/*      */     }
/* 1145 */     return i().g().a(this, ☃, fx1, i, bool);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public fx a(bsv ☃, fx fx1, int i, int j) {
/* 1150 */     return i().g().d().a(fx1.u(), fx1.v(), fx1.w(), i, j, bsv1 -> (bsv1 == ☃), this.t, true);
/*      */   }
/*      */ 
/*      */   
/*      */   public bor o() {
/* 1155 */     return this.D.aF();
/*      */   }
/*      */ 
/*      */   
/*      */   public aen p() {
/* 1160 */     return this.D.aG();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean q() {
/* 1165 */     return this.c;
/*      */   }
/*      */ 
/*      */   
/*      */   public gn r() {
/* 1170 */     return this.D.aY();
/*      */   }
/*      */   
/*      */   public cyc s() {
/* 1174 */     return i().i();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public cxx a(String ☃) {
/* 1180 */     return l().E().s().<cxx>b(() -> new cxx(☃), ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(cxx ☃) {
/* 1185 */     l().E().s().a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int t() {
/* 1190 */     return ((cxw)l().E().s().<cxw>a(cxw::new, "idcounts")).a();
/*      */   }
/*      */   
/*      */   public void a(fx ☃, float f) {
/* 1194 */     brd brd = new brd(new fx(this.u.a(), 0, this.u.c()));
/* 1195 */     this.u.a(☃, f);
/* 1196 */     i().b(aal.a, brd, 11, afx.a);
/* 1197 */     i().a(aal.a, new brd(☃), 11, afx.a);
/* 1198 */     l().ae().a(new qy(☃, f));
/*      */   }
/*      */   
/*      */   public fx u() {
/* 1202 */     fx ☃ = new fx(this.u.a(), this.u.b(), this.u.c());
/* 1203 */     if (!f().a(☃)) {
/* 1204 */       ☃ = a(chn.a.e, new fx(f().a(), 0.0D, f().b()));
/*      */     }
/* 1206 */     return ☃;
/*      */   }
/*      */   
/*      */   public float v() {
/* 1210 */     return this.u.d();
/*      */   }
/*      */   
/*      */   public LongSet w() {
/* 1214 */     brs ☃ = s().<brs>b(brs::new, "chunks");
/* 1215 */     return (☃ != null) ? LongSets.unmodifiable(☃.a()) : (LongSet)LongSets.EMPTY_SET;
/*      */   }
/*      */   public boolean a(int ☃, int i, boolean bool) {
/*      */     boolean bool1;
/* 1219 */     brs brs = s().<brs>a(brs::new, "chunks");
/*      */     
/* 1221 */     brd brd = new brd(☃, i);
/* 1222 */     long l = brd.a();
/*      */     
/* 1224 */     if (bool) {
/* 1225 */       bool1 = brs.a().add(l);
/* 1226 */       if (bool1) {
/* 1227 */         d(☃, i);
/*      */       }
/*      */     } else {
/* 1230 */       bool1 = brs.a().remove(l);
/*      */     } 
/* 1232 */     brs.a(bool1);
/* 1233 */     if (bool1) {
/* 1234 */       i().a(brd, bool);
/*      */     }
/* 1236 */     return bool1;
/*      */   }
/*      */ 
/*      */   
/*      */   public List<aah> x() {
/* 1241 */     return this.B;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fx ☃, ceh ceh1, ceh ceh2) {
/* 1246 */     Optional<azr> optional1 = azr.b(ceh1);
/* 1247 */     Optional<azr> optional2 = azr.b(ceh2);
/*      */     
/* 1249 */     if (Objects.equals(optional1, optional2)) {
/*      */       return;
/*      */     }
/*      */     
/* 1253 */     fx fx1 = ☃.h();
/* 1254 */     optional1.ifPresent(azr1 -> l().execute(()));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1259 */     optional2.ifPresent(azr1 -> l().execute(()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public azo y() {
/* 1266 */     return i().j();
/*      */   }
/*      */   
/*      */   public boolean a_(fx ☃) {
/* 1270 */     return a(☃, 1);
/*      */   }
/*      */   
/*      */   public boolean a(gp ☃) {
/* 1274 */     return a_(☃.q());
/*      */   }
/*      */   
/*      */   public boolean a(fx ☃, int i) {
/* 1278 */     if (i > 6) {
/* 1279 */       return false;
/*      */     }
/* 1281 */     return (b(gp.a(☃)) <= i);
/*      */   }
/*      */   
/*      */   public int b(gp ☃) {
/* 1285 */     return y().a(☃);
/*      */   }
/*      */   
/*      */   public bhd z() {
/* 1289 */     return this.d;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public bhb b_(fx ☃) {
/* 1297 */     return this.d.a(☃, 9216);
/*      */   }
/*      */   
/*      */   public boolean c_(fx ☃) {
/* 1301 */     return (b_(☃) != null);
/*      */   }
/*      */   
/*      */   public void a(azl ☃, aqa aqa1, aqz aqz1) {
/* 1305 */     aqz1.a(☃, aqa1);
/*      */   }
/*      */   
/*      */   public void a(Path ☃) throws IOException {
/* 1309 */     zs zs = (i()).a;
/*      */     
/* 1311 */     try (Writer ☃ = Files.newBufferedWriter(☃.resolve("stats.txt"), new java.nio.file.OpenOption[0])) {
/* 1312 */       writer1.write(String.format("spawning_chunks: %d\n", new Object[] { Integer.valueOf(zs.e().b()) }));
/* 1313 */       bsg.d d = i().k();
/* 1314 */       if (d != null) {
/* 1315 */         for (ObjectIterator<Object2IntMap.Entry<aqo>> objectIterator = d.b().object2IntEntrySet().iterator(); objectIterator.hasNext(); ) { Object2IntMap.Entry<aqo> entry = objectIterator.next();
/* 1316 */           writer1.write(String.format("spawn_count.%s: %d\n", new Object[] { ((aqo)entry.getKey()).b(), Integer.valueOf(entry.getIntValue()) })); }
/*      */       
/*      */       }
/* 1319 */       writer1.write(String.format("entities: %d\n", new Object[] { Integer.valueOf(this.y.size()) }));
/* 1320 */       writer1.write(String.format("block_entities: %d\n", new Object[] { Integer.valueOf(this.j.size()) }));
/* 1321 */       writer1.write(String.format("block_ticks: %d\n", new Object[] { Integer.valueOf(j().a()) }));
/* 1322 */       writer1.write(String.format("fluid_ticks: %d\n", new Object[] { Integer.valueOf(r_().a()) }));
/* 1323 */       writer1.write("distance_manager: " + zs.e().c() + "\n");
/* 1324 */       writer1.write(String.format("pending_tasks: %d\n", new Object[] { Integer.valueOf(i().f()) }));
/*      */     } 
/*      */     
/* 1327 */     l l = new l("Level dump", new Exception("dummy"));
/* 1328 */     a(l);
/* 1329 */     try (Writer ☃ = Files.newBufferedWriter(☃.resolve("example_crash.txt"), new java.nio.file.OpenOption[0])) {
/* 1330 */       writer2.write(l.e());
/*      */     } 
/*      */     
/* 1333 */     Path path1 = ☃.resolve("chunks.csv");
/* 1334 */     try (Writer ☃ = Files.newBufferedWriter(path1, new java.nio.file.OpenOption[0])) {
/* 1335 */       zs.a(writer3);
/*      */     } 
/*      */     
/* 1338 */     Path path2 = ☃.resolve("entities.csv");
/* 1339 */     try (Writer ☃ = Files.newBufferedWriter(path2, new java.nio.file.OpenOption[0])) {
/* 1340 */       a(writer4, (Iterable<aqa>)this.y.values());
/*      */     } 
/*      */     
/* 1343 */     Path path3 = ☃.resolve("block_entities.csv");
/* 1344 */     try (Writer ☃ = Files.newBufferedWriter(path3, new java.nio.file.OpenOption[0])) {
/* 1345 */       a(writer5);
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
/*      */   private static void a(Writer ☃, Iterable<aqa> iterable) throws IOException {
/* 1359 */     aew aew = aew.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a(☃);
/*      */     
/* 1361 */     for (aqa aqa : iterable) {
/* 1362 */       nr nr1 = aqa.T();
/* 1363 */       nr nr2 = aqa.d();
/* 1364 */       aew.a(new Object[] {
/* 1365 */             Double.valueOf(aqa.cD()), 
/* 1366 */             Double.valueOf(aqa.cE()), 
/* 1367 */             Double.valueOf(aqa.cH()), aqa
/* 1368 */             .bS(), gm.S
/* 1369 */             .b(aqa.X()), 
/* 1370 */             Boolean.valueOf(aqa.aX()), nr2
/* 1371 */             .getString(), (nr1 != null) ? nr1
/* 1372 */             .getString() : null
/*      */           });
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void a(Writer ☃) throws IOException {
/* 1383 */     aew aew = aew.a().a("x").a("y").a("z").a("type").a(☃);
/*      */     
/* 1385 */     for (ccj ccj : this.j) {
/* 1386 */       fx fx1 = ccj.o();
/* 1387 */       aew.a(new Object[] {
/* 1388 */             Integer.valueOf(fx1.u()), 
/* 1389 */             Integer.valueOf(fx1.v()), 
/* 1390 */             Integer.valueOf(fx1.w()), gm.W
/* 1391 */             .b(ccj.u())
/*      */           });
/*      */     } 
/*      */   }
/*      */   
/*      */   @VisibleForTesting
/*      */   public void a(cra ☃) {
/* 1398 */     this.L.removeIf(brb1 -> ☃.b(brb1.a()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(fx ☃, buo buo1) {
/* 1403 */     if (!ab()) {
/* 1404 */       b(☃, buo1);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public float a(gc ☃, boolean bool) {
/* 1410 */     return 1.0F;
/*      */   }
/*      */   
/*      */   public Iterable<aqa> A() {
/* 1414 */     return Iterables.unmodifiableIterable((Iterable)this.y.values());
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/* 1419 */     return "ServerLevel[" + this.E.g() + "]";
/*      */   }
/*      */   
/*      */   public boolean B() {
/* 1423 */     return this.D.aX().A().h();
/*      */   }
/*      */ 
/*      */   
/*      */   public long C() {
/* 1428 */     return this.D.aX().A().a();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public chg D() {
/* 1433 */     return this.O;
/*      */   }
/*      */ 
/*      */   
/*      */   public Stream<? extends crv<?>> a(gp ☃, cla<?> cla1) {
/* 1438 */     return a().a(☃, cla1);
/*      */   }
/*      */ 
/*      */   
/*      */   public aag E() {
/* 1443 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   @VisibleForTesting
/*      */   public String F() {
/* 1449 */     return String.format("players: %s, entities: %d [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s", new Object[] {
/* 1450 */           Integer.valueOf(this.B.size()), 
/* 1451 */           Integer.valueOf(this.y.size()), 
/* 1452 */           a((Collection<?>)this.y.values(), ☃ -> gm.S.b(☃.X())), 
/* 1453 */           Integer.valueOf(this.k.size()), 
/* 1454 */           a(this.k, ☃ -> gm.W.b(☃.u())), 
/* 1455 */           Integer.valueOf(j().a()), 
/* 1456 */           Integer.valueOf(r_().a()), 
/* 1457 */           P()
/*      */         });
/*      */   }
/*      */   
/*      */   private static <T> String a(Collection<T> ☃, Function<T, vk> function) {
/*      */     try {
/* 1463 */       Object2IntOpenHashMap<vk> object2IntOpenHashMap = new Object2IntOpenHashMap();
/* 1464 */       for (T t : ☃) {
/* 1465 */         vk vk = function.apply(t);
/* 1466 */         object2IntOpenHashMap.addTo(vk, 1);
/*      */       } 
/* 1468 */       return object2IntOpenHashMap.object2IntEntrySet().stream()
/* 1469 */         .sorted(Comparator.comparing(Object2IntMap.Entry::getIntValue).reversed())
/* 1470 */         .limit(5L)
/* 1471 */         .map(☃ -> ☃.getKey() + ":" + ☃.getIntValue())
/* 1472 */         .collect(Collectors.joining(","));
/* 1473 */     } catch (Exception exception) {
/* 1474 */       return "";
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void a(aag ☃) {
/* 1479 */     fx fx1 = a;
/* 1480 */     int i = fx1.u();
/* 1481 */     int j = fx1.v() - 2;
/* 1482 */     int k = fx1.w();
/* 1483 */     fx.b(i - 2, j + 1, k - 2, i + 2, j + 3, k + 2)
/* 1484 */       .forEach(fx1 -> ☃.a(fx1, bup.a.n()));
/* 1485 */     fx.b(i - 2, j, k - 2, i + 2, j, k + 2)
/* 1486 */       .forEach(fx1 -> ☃.a(fx1, bup.bK.n()));
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
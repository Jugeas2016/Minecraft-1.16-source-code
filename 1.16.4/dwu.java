/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Maps;
/*      */ import com.google.common.collect.Multimap;
/*      */ import com.google.common.collect.Sets;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import com.mojang.brigadier.CommandDispatcher;
/*      */ import com.mojang.datafixers.util.Pair;
/*      */ import io.netty.buffer.Unpooled;
/*      */ import java.io.File;
/*      */ import java.io.UnsupportedEncodingException;
/*      */ import java.net.URI;
/*      */ import java.net.URISyntaxException;
/*      */ import java.net.URLDecoder;
/*      */ import java.nio.charset.StandardCharsets;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collection;
/*      */ import java.util.Collections;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ import java.util.concurrent.CompletableFuture;
/*      */ import javax.annotation.Nullable;
/*      */ import net.minecraft.client.ClientBrandRetriever;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class dwu
/*      */   implements om
/*      */ {
/*  310 */   private static final Logger a = LogManager.getLogger();
/*      */   
/*  312 */   private static final nr b = new of("disconnect.lost");
/*      */   
/*      */   private final nd c;
/*      */   private final GameProfile d;
/*      */   private final dot e;
/*      */   private djz f;
/*      */   private dwt g;
/*      */   private dwt.a h;
/*      */   private boolean i;
/*  321 */   private final Map<UUID, dwx> j = Maps.newHashMap();
/*      */   private final dwq k;
/*      */   private final dwv l;
/*  324 */   private aen m = aen.a;
/*  325 */   private final djq n = new djq(this);
/*  326 */   private int o = 3;
/*      */   
/*  328 */   private final Random p = new Random();
/*  329 */   private CommandDispatcher<dd> q = new CommandDispatcher();
/*  330 */   private final bor r = new bor();
/*  331 */   private final UUID s = UUID.randomUUID();
/*      */   
/*      */   private Set<vj<brx>> t;
/*  334 */   private gn u = gn.b();
/*      */   
/*      */   public dwu(djz ☃, dot dot1, nd nd1, GameProfile gameProfile) {
/*  337 */     this.f = ☃;
/*  338 */     this.e = dot1;
/*  339 */     this.c = nd1;
/*  340 */     this.d = gameProfile;
/*  341 */     this.k = new dwq(☃);
/*  342 */     this.l = new dwv(this, ☃);
/*      */   }
/*      */   
/*      */   public dwv b() {
/*  346 */     return this.l;
/*      */   }
/*      */   
/*      */   public void c() {
/*  350 */     this.g = null;
/*      */   }
/*      */   
/*      */   public bor d() {
/*  354 */     return this.r;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(px ☃) {
/*  359 */     ol.a(☃, this, this.f);
/*  360 */     this.f.q = new dww(this.f, this);
/*      */     
/*  362 */     if (!this.c.d())
/*      */     {
/*  364 */       aek.a();
/*      */     }
/*      */     
/*  367 */     ArrayList<vj<brx>> arrayList = Lists.newArrayList(☃.g());
/*  368 */     Collections.shuffle(arrayList);
/*      */     
/*  370 */     this.t = Sets.newLinkedHashSet(arrayList);
/*  371 */     this.u = ☃.h();
/*  372 */     vj<brx> vj = ☃.j();
/*  373 */     chd chd = ☃.i();
/*      */     
/*  375 */     this.o = ☃.l();
/*      */     
/*  377 */     boolean bool1 = ☃.o();
/*  378 */     boolean bool2 = ☃.p();
/*  379 */     dwt.a a1 = new dwt.a(aor.c, ☃.d(), bool2);
/*  380 */     this.h = a1;
/*  381 */     this.g = new dwt(this, a1, vj, chd, this.o, this.f::au, this.f.e, bool1, ☃.c());
/*  382 */     this.f.a(this.g);
/*      */ 
/*      */     
/*  385 */     if (this.f.s == null) {
/*  386 */       this.f.s = this.f.q.a(this.g, new aeb(), new djm());
/*  387 */       this.f.s.p = -180.0F;
/*  388 */       if (this.f.H() != null) {
/*  389 */         this.f.H().a(this.f.s.bS());
/*      */       }
/*      */     } 
/*      */     
/*  393 */     this.f.i.a();
/*      */     
/*  395 */     this.f.s.ac();
/*  396 */     int i = ☃.b();
/*  397 */     this.g.a(i, this.f.s);
/*  398 */     this.f.s.f = new dzl(this.f.k);
/*  399 */     this.f.q.a(this.f.s);
/*  400 */     this.f.t = this.f.s;
/*  401 */     this.f.a(new dos());
/*  402 */     this.f.s.e(i);
/*  403 */     this.f.s.r(☃.m());
/*  404 */     this.f.s.b(☃.n());
/*      */     
/*  406 */     this.f.q.b(☃.e());
/*  407 */     this.f.q.a(☃.f());
/*  408 */     this.f.k.c();
/*  409 */     this.c.a(new sm(sm.a, (new nf(Unpooled.buffer())).a(ClientBrandRetriever.getClientModName())));
/*  410 */     this.f.ax().a();
/*      */   }
/*      */   
/*      */   public void a(on ☃) {
/*      */     aqa aqa;
/*  415 */     ol.a(☃, this, this.f);
/*  416 */     double d1 = ☃.d();
/*  417 */     double d2 = ☃.e();
/*  418 */     double d3 = ☃.f();
/*      */     
/*  420 */     aqe<?> aqe = ☃.l();
/*      */ 
/*      */     
/*  423 */     if (aqe == aqe.U) {
/*  424 */       aqa = new bhq(this.g, d1, d2, d3);
/*  425 */     } else if (aqe == aqe.W) {
/*  426 */       aqa = new bhs(this.g, d1, d2, d3);
/*  427 */     } else if (aqe == aqe.Z) {
/*  428 */       aqa = new bhv(this.g, d1, d2, d3);
/*  429 */     } else if (aqe == aqe.Y) {
/*  430 */       aqa = new bhu(this.g, d1, d2, d3);
/*  431 */     } else if (aqe == aqe.X) {
/*  432 */       aqa = new bht(this.g, d1, d2, d3);
/*  433 */     } else if (aqe == aqe.V) {
/*  434 */       aqa = new bhr(this.g, d1, d2, d3);
/*  435 */     } else if (aqe == aqe.T) {
/*  436 */       aqa = new bhp(this.g, d1, d2, d3);
/*  437 */     } else if (aqe == aqe.bd) {
/*  438 */       aqa aqa1 = this.g.a(☃.m());
/*  439 */       if (aqa1 instanceof bfw) {
/*  440 */         aqa = new bgi(this.g, (bfw)aqa1, d1, d2, d3);
/*      */       } else {
/*  442 */         aqa = null;
/*      */       } 
/*  444 */     } else if (aqe == aqe.c) {
/*  445 */       aqa = new bgc(this.g, d1, d2, d3);
/*  446 */       aqa aqa1 = this.g.a(☃.m());
/*  447 */       if (aqa1 != null) {
/*  448 */         ((bga)aqa).b(aqa1);
/*      */       }
/*  450 */     } else if (aqe == aqe.aB) {
/*  451 */       aqa = new bgr(this.g, d1, d2, d3);
/*  452 */       aqa aqa1 = this.g.a(☃.m());
/*  453 */       if (aqa1 != null) {
/*  454 */         ((bga)aqa).b(aqa1);
/*      */       }
/*  456 */     } else if (aqe == aqe.aK) {
/*  457 */       aqa = new bgy(this.g, d1, d2, d3);
/*  458 */       aqa aqa1 = this.g.a(☃.m());
/*  459 */       if (aqa1 != null) {
/*  460 */         ((bga)aqa).b(aqa1);
/*      */       }
/*  462 */     } else if (aqe == aqe.aA) {
/*  463 */       aqa = new bgq(this.g, d1, d2, d3);
/*  464 */     } else if (aqe == aqe.R) {
/*  465 */       aqa = new bgl(this.g, d1, d2, d3, ☃.g(), ☃.h(), ☃.i());
/*  466 */     } else if (aqe == aqe.M) {
/*  467 */       aqa = new bcp(this.g, new fx(d1, d2, d3), gc.a(☃.m()));
/*  468 */     } else if (aqe == aqe.O) {
/*  469 */       aqa = new bcq(this.g, new fx(d1, d2, d3));
/*  470 */     } else if (aqe == aqe.aH) {
/*  471 */       aqa = new bgv(this.g, d1, d2, d3);
/*  472 */     } else if (aqe == aqe.z) {
/*  473 */       aqa = new bgf(this.g, d1, d2, d3);
/*  474 */     } else if (aqe == aqe.B) {
/*  475 */       aqa = new bgh(this.g, d1, d2, d3, bmb.b);
/*  476 */     } else if (aqe == aqe.N) {
/*  477 */       aqa = new bgk(this.g, d1, d2, d3, ☃.g(), ☃.h(), ☃.i());
/*  478 */     } else if (aqe == aqe.p) {
/*  479 */       aqa = new bgd(this.g, d1, d2, d3, ☃.g(), ☃.h(), ☃.i());
/*  480 */     } else if (aqe == aqe.ay) {
/*  481 */       aqa = new bgp(this.g, d1, d2, d3, ☃.g(), ☃.h(), ☃.i());
/*  482 */     } else if (aqe == aqe.aV) {
/*  483 */       aqa = new bgz(this.g, d1, d2, d3, ☃.g(), ☃.h(), ☃.i());
/*  484 */     } else if (aqe == aqe.at) {
/*  485 */       aqa = new bgo(this.g, d1, d2, d3, ☃.g(), ☃.h(), ☃.i());
/*  486 */     } else if (aqe == aqe.aG) {
/*  487 */       aqa = new bgu(this.g, d1, d2, d3);
/*  488 */     } else if (aqe == aqe.x) {
/*  489 */       aqa = new bge(this.g, d1, d2, d3, 0.0F, 0, null);
/*  490 */     } else if (aqe == aqe.aJ) {
/*  491 */       aqa = new bgx(this.g, d1, d2, d3);
/*  492 */     } else if (aqe == aqe.aI) {
/*  493 */       aqa = new bgw(this.g, d1, d2, d3);
/*  494 */     } else if (aqe == aqe.g) {
/*  495 */       aqa = new bhn(this.g, d1, d2, d3);
/*  496 */     } else if (aqe == aqe.am) {
/*  497 */       aqa = new bcw(this.g, d1, d2, d3, null);
/*  498 */     } else if (aqe == aqe.b) {
/*  499 */       aqa = new bcn(this.g, d1, d2, d3);
/*  500 */     } else if (aqe == aqe.s) {
/*  501 */       aqa = new bbq(this.g, d1, d2, d3);
/*  502 */     } else if (aqe == aqe.L) {
/*  503 */       aqa = new bcv(this.g, d1, d2, d3);
/*  504 */     } else if (aqe == aqe.A) {
/*  505 */       aqa = new bcu(this.g, d1, d2, d3, buo.a(☃.m()));
/*  506 */     } else if (aqe == aqe.a) {
/*  507 */       aqa = new apz(this.g, d1, d2, d3);
/*  508 */     } else if (aqe == aqe.P) {
/*  509 */       aqa = new aql(aqe.P, this.g);
/*      */     } else {
/*  511 */       aqa = null;
/*      */     } 
/*      */     
/*  514 */     if (aqa != null) {
/*  515 */       int i = ☃.b();
/*  516 */       aqa.c(d1, d2, d3);
/*  517 */       aqa.b(d1, d2, d3);
/*  518 */       aqa.q = (☃.j() * 360) / 256.0F;
/*  519 */       aqa.p = (☃.k() * 360) / 256.0F;
/*  520 */       aqa.e(i);
/*  521 */       aqa.a_(☃.c());
/*  522 */       this.g.a(i, aqa);
/*  523 */       if (aqa instanceof bhl) {
/*  524 */         this.f.W().a(new emn((bhl)aqa));
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(oo ☃) {
/*  531 */     ol.a(☃, this, this.f);
/*  532 */     double d1 = ☃.c();
/*  533 */     double d2 = ☃.d();
/*  534 */     double d3 = ☃.e();
/*      */     
/*  536 */     aqa aqa = new aqg(this.g, d1, d2, d3, ☃.f());
/*  537 */     aqa.c(d1, d2, d3);
/*  538 */     aqa.p = 0.0F;
/*  539 */     aqa.q = 0.0F;
/*  540 */     aqa.e(☃.b());
/*  541 */     this.g.a(☃.b(), aqa);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(oq ☃) {
/*  546 */     ol.a(☃, this, this.f);
/*  547 */     bcs bcs = new bcs(this.g, ☃.d(), ☃.e(), ☃.f());
/*  548 */     bcs.e(☃.b());
/*  549 */     bcs.a_(☃.c());
/*  550 */     this.g.a(☃.b(), bcs);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rc ☃) {
/*  555 */     ol.a(☃, this, this.f);
/*  556 */     aqa aqa = this.g.a(☃.b());
/*  557 */     if (aqa == null) {
/*      */       return;
/*      */     }
/*  560 */     aqa.k(☃.c() / 8000.0D, ☃.d() / 8000.0D, ☃.e() / 8000.0D);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ra ☃) {
/*  565 */     ol.a(☃, this, this.f);
/*  566 */     aqa aqa = this.g.a(☃.c());
/*  567 */     if (aqa != null && ☃.b() != null) {
/*  568 */       aqa.ab().a(☃.b());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(or ☃) {
/*  574 */     ol.a(☃, this, this.f);
/*  575 */     double d1 = ☃.d();
/*  576 */     double d2 = ☃.e();
/*  577 */     double d3 = ☃.f();
/*  578 */     float f1 = (☃.g() * 360) / 256.0F;
/*  579 */     float f2 = (☃.h() * 360) / 256.0F;
/*  580 */     int i = ☃.b();
/*  581 */     dzn dzn = new dzn(this.f.r, a(☃.c()).a());
/*  582 */     dzn.e(i);
/*  583 */     dzn.g(d1, d2, d3);
/*      */     
/*  585 */     dzn.c(d1, d2, d3);
/*      */     
/*  587 */     dzn.a(d1, d2, d3, f1, f2);
/*  588 */     this.g.a(i, dzn);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rs ☃) {
/*  593 */     ol.a(☃, this, this.f);
/*  594 */     aqa aqa = this.g.a(☃.b());
/*  595 */     if (aqa == null) {
/*      */       return;
/*      */     }
/*  598 */     double d1 = ☃.c();
/*  599 */     double d2 = ☃.d();
/*  600 */     double d3 = ☃.e();
/*  601 */     aqa.c(d1, d2, d3);
/*      */     
/*  603 */     if (!aqa.cs()) {
/*  604 */       float f1 = (☃.f() * 360) / 256.0F;
/*  605 */       float f2 = (☃.g() * 360) / 256.0F;
/*  606 */       aqa.a(d1, d2, d3, f1, f2, 3, true);
/*  607 */       aqa.c(☃.h());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qv ☃) {
/*  613 */     ol.a(☃, this, this.f);
/*  614 */     if (bfv.d(☃.b())) {
/*  615 */       this.f.s.bm.d = ☃.b();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qa ☃) {
/*  621 */     ol.a(☃, this, this.f);
/*  622 */     aqa aqa = ☃.a(this.g);
/*  623 */     if (aqa == null) {
/*      */       return;
/*      */     }
/*  626 */     if (!aqa.cs()) {
/*  627 */       if (☃.h()) {
/*  628 */         dcn dcn = ☃.a(aqa.W());
/*  629 */         aqa.a(dcn);
/*  630 */         float f1 = ☃.g() ? ((☃.e() * 360) / 256.0F) : aqa.p;
/*  631 */         float f2 = ☃.g() ? ((☃.f() * 360) / 256.0F) : aqa.q;
/*  632 */         aqa.a(dcn.a(), dcn.b(), dcn.c(), f1, f2, 3, false);
/*  633 */       } else if (☃.g()) {
/*  634 */         float f1 = (☃.e() * 360) / 256.0F;
/*  635 */         float f2 = (☃.f() * 360) / 256.0F;
/*  636 */         aqa.a(aqa.cD(), aqa.cE(), aqa.cH(), f1, f2, 3, false);
/*      */       } 
/*  638 */       aqa.c(☃.i());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qq ☃) {
/*  644 */     ol.a(☃, this, this.f);
/*  645 */     aqa aqa = ☃.a(this.g);
/*  646 */     if (aqa == null) {
/*      */       return;
/*      */     }
/*  649 */     float f = (☃.b() * 360) / 256.0F;
/*  650 */     aqa.a(f, 3);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qm ☃) {
/*  655 */     ol.a(☃, this, this.f);
/*  656 */     for (int i = 0; i < (☃.b()).length; i++) {
/*  657 */       int j = ☃.b()[i];
/*  658 */       this.g.d(j);
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
/*      */   
/*      */   public void a(qk ☃) {
/*      */     double d1, d2, d3, d4, d5, d6;
/*  675 */     ol.a(☃, this, this.f);
/*  676 */     bfw bfw = this.f.s;
/*      */     
/*  678 */     dcn dcn = bfw.cC();
/*      */     
/*  680 */     boolean bool1 = ☃.h().contains(qk.a.a);
/*  681 */     boolean bool2 = ☃.h().contains(qk.a.b);
/*  682 */     boolean bool3 = ☃.h().contains(qk.a.c);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  690 */     if (bool1) {
/*  691 */       d1 = dcn.a();
/*  692 */       d2 = bfw.cD() + ☃.b();
/*  693 */       bfw.D += ☃.b();
/*      */     } else {
/*  695 */       d1 = 0.0D;
/*  696 */       d2 = ☃.b();
/*  697 */       bfw.D = d2;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  703 */     if (bool2) {
/*  704 */       d3 = dcn.b();
/*  705 */       d4 = bfw.cE() + ☃.c();
/*  706 */       bfw.E += ☃.c();
/*      */     } else {
/*  708 */       d3 = 0.0D;
/*  709 */       d4 = ☃.c();
/*  710 */       bfw.E = d4;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  716 */     if (bool3) {
/*  717 */       d5 = dcn.c();
/*  718 */       d6 = bfw.cH() + ☃.d();
/*  719 */       bfw.F += ☃.d();
/*      */     } else {
/*  721 */       d5 = 0.0D;
/*  722 */       d6 = ☃.d();
/*  723 */       bfw.F = d6;
/*      */     } 
/*      */     
/*  726 */     if (bfw.K > 0 && bfw.ct() != null) {
/*  727 */       bfw.bf();
/*      */     }
/*      */     
/*  730 */     bfw.o(d2, d4, d6);
/*  731 */     bfw.m = d2;
/*  732 */     bfw.n = d4;
/*  733 */     bfw.o = d6;
/*  734 */     bfw.n(d1, d3, d5);
/*      */     
/*  736 */     float f1 = ☃.e();
/*  737 */     float f2 = ☃.f();
/*      */     
/*  739 */     if (☃.h().contains(qk.a.e)) {
/*  740 */       f2 += bfw.q;
/*      */     }
/*  742 */     if (☃.h().contains(qk.a.d)) {
/*  743 */       f1 += bfw.p;
/*      */     }
/*      */     
/*  746 */     bfw.a(d2, d4, d6, f1, f2);
/*      */     
/*  748 */     this.c.a(new sb(☃.g()));
/*  749 */     this.c.a(new st.b(bfw.cD(), bfw.cE(), bfw.cH(), bfw.p, bfw.q, false));
/*      */     
/*  751 */     if (!this.i) {
/*  752 */       this.i = true;
/*  753 */       this.f.a((dot)null);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qr ☃) {
/*  759 */     ol.a(☃, this, this.f);
/*      */     
/*  761 */     int i = 0x13 | (☃.b() ? 128 : 0);
/*  762 */     ☃.a((fx1, ceh1) -> this.g.a(fx1, ceh1, ☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pt ☃) {
/*  767 */     ol.a(☃, this, this.f);
/*      */     
/*  769 */     int i = ☃.c();
/*  770 */     int j = ☃.d();
/*  771 */     cfx cfx = (☃.i() == null) ? null : new cfx(this.u.b(gm.ay), ☃.i());
/*  772 */     cgh cgh = this.g.n().a(i, j, cfx, ☃.b(), ☃.g(), ☃.e(), ☃.f());
/*  773 */     if (cgh != null && ☃.f()) {
/*  774 */       this.g.b(cgh);
/*      */     }
/*      */     
/*  777 */     for (int k = 0; k < 16; k++) {
/*  778 */       this.g.d(i, k, j);
/*      */     }
/*      */     
/*  781 */     for (md md : ☃.h()) {
/*  782 */       fx fx = new fx(md.h("x"), md.h("y"), md.h("z"));
/*  783 */       ccj ccj = this.g.c(fx);
/*      */ 
/*      */       
/*  786 */       if (ccj != null) {
/*  787 */         ccj.a(this.g.d_(fx), md);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pp ☃) {
/*  794 */     ol.a(☃, this, this.f);
/*      */     
/*  796 */     int i = ☃.b();
/*  797 */     int j = ☃.c();
/*  798 */     dwr dwr = this.g.n();
/*  799 */     dwr.d(i, j);
/*  800 */     cuo cuo = dwr.l();
/*  801 */     for (int k = 0; k < 16; k++) {
/*  802 */       this.g.d(i, k, j);
/*  803 */       cuo.a(gp.a(i, k, j), true);
/*      */     } 
/*  805 */     cuo.a(new brd(i, j), false);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(oy ☃) {
/*  810 */     ol.a(☃, this, this.f);
/*  811 */     this.g.b(☃.c(), ☃.b());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pm ☃) {
/*  816 */     this.c.a(☃.b());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(nr ☃) {
/*  821 */     this.f.r();
/*  822 */     if (this.e != null) {
/*  823 */       if (this.e instanceof eoo) {
/*  824 */         this.f.a(new eoi(this.e, b, ☃));
/*      */       } else {
/*  826 */         this.f.a(new doa(this.e, b, ☃));
/*      */       } 
/*      */     } else {
/*  829 */       this.f.a(new doa(new drc(new doy()), b, ☃));
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(oj<?> ☃) {
/*  834 */     this.c.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rr ☃) {
/*  839 */     ol.a(☃, this, this.f);
/*  840 */     aqa aqa = this.g.a(☃.b());
/*  841 */     aqm aqm = (aqm)this.g.a(☃.c());
/*  842 */     if (aqm == null) {
/*  843 */       aqm = this.f.s;
/*      */     }
/*  845 */     if (aqa != null) {
/*  846 */       if (aqa instanceof aqg) {
/*  847 */         this.g.a(aqa.cD(), aqa.cE(), aqa.cH(), adq.dW, adr.h, 0.1F, (this.p.nextFloat() - this.p.nextFloat()) * 0.35F + 0.9F, false);
/*      */       } else {
/*  849 */         this.g.a(aqa.cD(), aqa.cE(), aqa.cH(), adq.gL, adr.h, 0.2F, (this.p.nextFloat() - this.p.nextFloat()) * 1.4F + 2.0F, false);
/*      */       } 
/*      */       
/*  852 */       this.f.f.a(new dya(this.f.ac(), this.f.aE(), this.g, aqa, aqm));
/*  853 */       if (aqa instanceof bcv) {
/*      */         
/*  855 */         bcv bcv = (bcv)aqa;
/*  856 */         bmb bmb = bcv.g();
/*  857 */         bmb.g(☃.d());
/*  858 */         if (bmb.a()) {
/*  859 */           this.g.d(☃.b());
/*      */         }
/*      */       } else {
/*  862 */         this.g.d(☃.b());
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pb ☃) {
/*  869 */     ol.a(☃, this, this.f);
/*  870 */     this.f.j.a(☃.d(), ☃.b(), ☃.e());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(os ☃) {
/*  875 */     ol.a(☃, this, this.f);
/*  876 */     aqa aqa = this.g.a(☃.b());
/*  877 */     if (aqa == null) {
/*      */       return;
/*      */     }
/*  880 */     if (☃.c() == 0) {
/*  881 */       aqm aqm = (aqm)aqa;
/*  882 */       aqm.a(aot.a);
/*  883 */     } else if (☃.c() == 3) {
/*  884 */       aqm aqm = (aqm)aqa;
/*  885 */       aqm.a(aot.b);
/*  886 */     } else if (☃.c() == 1) {
/*  887 */       aqa.bm();
/*  888 */     } else if (☃.c() == 2) {
/*  889 */       bfw bfw = (bfw)aqa;
/*  890 */       bfw.a(false, false);
/*  891 */     } else if (☃.c() == 4) {
/*  892 */       this.f.f.a(aqa, hh.g);
/*  893 */     } else if (☃.c() == 5) {
/*  894 */       this.f.f.a(aqa, hh.r);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(op ☃) {
/*  900 */     ol.a(☃, this, this.f);
/*  901 */     double d1 = ☃.e();
/*  902 */     double d2 = ☃.f();
/*  903 */     double d3 = ☃.g();
/*  904 */     float f1 = (☃.k() * 360) / 256.0F;
/*  905 */     float f2 = (☃.l() * 360) / 256.0F;
/*  906 */     aqm aqm = (aqm)aqe.a(☃.d(), this.f.r);
/*  907 */     if (aqm != null) {
/*  908 */       aqm.c(d1, d2, d3);
/*  909 */       aqm.aA = (☃.m() * 360) / 256.0F;
/*  910 */       aqm.aC = (☃.m() * 360) / 256.0F;
/*  911 */       if (aqm instanceof bbr) {
/*  912 */         bbp[] arrayOfBbp = ((bbr)aqm).eJ();
/*  913 */         for (int i = 0; i < arrayOfBbp.length; i++) {
/*  914 */           arrayOfBbp[i].e(i + ☃.b());
/*      */         }
/*      */       } 
/*      */       
/*  918 */       aqm.e(☃.b());
/*  919 */       aqm.a_(☃.c());
/*  920 */       aqm.a(d1, d2, d3, f1, f2);
/*  921 */       aqm.n((☃
/*  922 */           .h() / 8000.0F), (☃
/*  923 */           .i() / 8000.0F), (☃
/*  924 */           .j() / 8000.0F));
/*      */       
/*  926 */       this.g.a(☃.b(), aqm);
/*      */       
/*  928 */       if (aqm instanceof baa) {
/*  929 */         emh emh; boolean bool = ((baa)aqm).H_();
/*      */         
/*  931 */         if (bool) {
/*  932 */           emh = new emf((baa)aqm);
/*      */         } else {
/*  934 */           emh = new emg((baa)aqm);
/*      */         } 
/*  936 */         this.f.W().a(emh);
/*      */       } 
/*      */     } else {
/*  939 */       a.warn("Skipping Entity with id {}", Integer.valueOf(☃.d()));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rk ☃) {
/*  945 */     ol.a(☃, this, this.f);
/*  946 */     this.f.r.a(☃.b());
/*  947 */     this.f.r.b(☃.c());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qy ☃) {
/*  952 */     ol.a(☃, this, this.f);
/*  953 */     this.f.r.b(☃.b(), ☃.c());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rh ☃) {
/*  958 */     ol.a(☃, this, this.f);
/*  959 */     aqa aqa = this.g.a(☃.c());
/*  960 */     if (aqa == null) {
/*  961 */       a.warn("Received passengers for unknown entity");
/*      */       
/*      */       return;
/*      */     } 
/*  965 */     boolean bool = aqa.y(this.f.s);
/*  966 */     aqa.be();
/*      */     
/*  968 */     for (int i : ☃.b()) {
/*  969 */       aqa aqa1 = this.g.a(i);
/*  970 */       if (aqa1 != null) {
/*  971 */         aqa1.a(aqa, true);
/*  972 */         if (aqa1 == this.f.s && !bool) {
/*  973 */           this.f.j.a(new of("mount.onboard", new Object[] { this.f.k.ak.j() }), false);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rb ☃) {
/*  981 */     ol.a(☃, this, this.f);
/*  982 */     aqa aqa = this.g.a(☃.b());
/*  983 */     if (aqa instanceof aqn) {
/*  984 */       ((aqn)aqa).d(☃.c());
/*      */     }
/*      */   }
/*      */   
/*      */   private static bmb a(bfw ☃) {
/*  989 */     for (aot aot : aot.values()) {
/*  990 */       bmb bmb = ☃.b(aot);
/*  991 */       if (bmb.b() == bmd.qu) {
/*  992 */         return bmb;
/*      */       }
/*      */     } 
/*  995 */     return new bmb(bmd.qu);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pn ☃) {
/* 1000 */     ol.a(☃, this, this.f);
/* 1001 */     aqa aqa = ☃.a(this.g);
/* 1002 */     if (aqa != null)
/*      */     {
/* 1004 */       if (☃.b() == 21) {
/* 1005 */         this.f.W().a(new emm((bdm)aqa));
/* 1006 */       } else if (☃.b() == 35) {
/* 1007 */         int i = 40;
/* 1008 */         this.f.f.a(aqa, hh.X, 30);
/* 1009 */         this.g.a(aqa.cD(), aqa.cE(), aqa.cH(), adq.pc, aqa.cu(), 1.0F, 1.0F, false);
/* 1010 */         if (aqa == this.f.s) {
/* 1011 */           this.f.h.a(a(this.f.s));
/*      */         }
/*      */       } else {
/* 1014 */         aqa.a(☃.b());
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rf ☃) {
/* 1021 */     ol.a(☃, this, this.f);
/* 1022 */     this.f.s.v(☃.b());
/* 1023 */     this.f.s.eI().a(☃.c());
/* 1024 */     this.f.s.eI().b(☃.d());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(re ☃) {
/* 1029 */     ol.a(☃, this, this.f);
/* 1030 */     this.f.s.a(☃.b(), ☃.c(), ☃.d());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qp ☃) {
/* 1035 */     ol.a(☃, this, this.f);
/* 1036 */     vj<brx> vj = ☃.c();
/* 1037 */     chd chd = ☃.b();
/* 1038 */     dzm dzm1 = this.f.s;
/* 1039 */     int i = dzm1.Y();
/* 1040 */     this.i = false;
/* 1041 */     if (vj != dzm1.l.Y()) {
/* 1042 */       ddn ddn = this.g.G();
/* 1043 */       boolean bool1 = ☃.g();
/* 1044 */       boolean bool2 = ☃.h();
/* 1045 */       dwt.a a1 = new dwt.a(this.h.s(), this.h.n(), bool2);
/* 1046 */       this.h = a1;
/* 1047 */       this.g = new dwt(this, a1, vj, chd, this.o, this.f::au, this.f.e, bool1, ☃.d());
/* 1048 */       this.g.a(ddn);
/* 1049 */       this.f.a(this.g);
/* 1050 */       this.f.a(new dos());
/*      */     } 
/*      */     
/* 1053 */     this.g.m();
/*      */     
/* 1055 */     String str = dzm1.B();
/*      */     
/* 1057 */     this.f.t = null;
/*      */     
/* 1059 */     dzm dzm2 = this.f.q.a(this.g, dzm1.D(), dzm1.F(), dzm1.bu(), dzm1.bA());
/* 1060 */     dzm2.e(i);
/* 1061 */     this.f.s = dzm2;
/* 1062 */     if (vj != dzm1.l.Y()) {
/* 1063 */       this.f.p().b();
/*      */     }
/* 1065 */     this.f.t = dzm2;
/*      */     
/* 1067 */     dzm2.ab().a(dzm1.ab().c());
/* 1068 */     if (☃.i()) {
/* 1069 */       dzm2.dB().a(dzm1.dB());
/*      */     }
/* 1071 */     dzm2.ac();
/* 1072 */     dzm2.g(str);
/* 1073 */     this.g.a(i, dzm2);
/* 1074 */     dzm2.p = -180.0F;
/* 1075 */     dzm2.f = new dzl(this.f.k);
/* 1076 */     this.f.q.a(dzm2);
/* 1077 */     dzm2.r(dzm1.eO());
/* 1078 */     dzm2.b(dzm1.G());
/*      */     
/* 1080 */     if (this.f.y instanceof dnx) {
/* 1081 */       this.f.a((dot)null);
/*      */     }
/* 1083 */     this.f.q.b(☃.e());
/* 1084 */     this.f.q.a(☃.f());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(po ☃) {
/* 1089 */     ol.a(☃, this, this.f);
/* 1090 */     brp brp = new brp(this.f.r, null, ☃.e(), ☃.f(), ☃.g(), ☃.h(), ☃.i());
/* 1091 */     brp.a(true);
/*      */     
/* 1093 */     this.f.s.f(this.f.s.cC().b(☃
/* 1094 */           .b(), ☃
/* 1095 */           .c(), ☃
/* 1096 */           .d()));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(pr ☃) {
/* 1102 */     ol.a(☃, this, this.f);
/* 1103 */     aqa aqa = this.g.a(☃.d());
/* 1104 */     if (aqa instanceof bbb) {
/* 1105 */       dzm dzm = this.f.s;
/* 1106 */       bbb bbb = (bbb)aqa;
/* 1107 */       apa apa = new apa(☃.c());
/* 1108 */       biy biy = new biy(☃.b(), dzm.bm, apa, bbb);
/* 1109 */       dzm.bp = biy;
/* 1110 */       this.f.a(new dqk(biy, dzm.bm, bbb));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qd ☃) {
/* 1116 */     ol.a(☃, this, this.f);
/* 1117 */     doi.a(☃.c(), this.f, ☃.b(), ☃.d());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pi ☃) {
/* 1122 */     ol.a(☃, this, this.f);
/* 1123 */     bfw bfw = this.f.s;
/* 1124 */     bmb bmb = ☃.d();
/* 1125 */     int i = ☃.c();
/*      */     
/* 1127 */     this.f.ao().a(bmb);
/*      */     
/* 1129 */     if (☃.b() == -1) {
/*      */       
/* 1131 */       if (!(this.f.y instanceof dqc)) {
/* 1132 */         bfw.bm.g(bmb);
/*      */       }
/* 1134 */     } else if (☃.b() == -2) {
/* 1135 */       bfw.bm.a(i, bmb);
/*      */     } else {
/* 1137 */       boolean bool = false;
/*      */       
/* 1139 */       if (this.f.y instanceof dqc) {
/* 1140 */         dqc dqc = (dqc)this.f.y;
/*      */         
/* 1142 */         bool = (dqc.k() != bks.n.a());
/*      */       } 
/*      */       
/* 1145 */       if (☃.b() == 0 && ☃.c() >= 36 && i < 45) {
/* 1146 */         if (!bmb.a()) {
/* 1147 */           bmb bmb1 = bfw.bo.a(i).e();
/* 1148 */           if (bmb1.a() || bmb1.E() < bmb.E()) {
/* 1149 */             bmb.d(5);
/*      */           }
/*      */         } 
/* 1152 */         bfw.bo.a(i, bmb);
/* 1153 */       } else if (☃.b() == bfw.bp.b && (☃.b() != 0 || !bool)) {
/* 1154 */         bfw.bp.a(i, bmb);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pe ☃) {
/* 1161 */     ol.a(☃, this, this.f);
/* 1162 */     bic bic = null;
/* 1163 */     bfw bfw = this.f.s;
/* 1164 */     if (☃.b() == 0) {
/* 1165 */       bic = bfw.bo;
/* 1166 */     } else if (☃.b() == bfw.bp.b) {
/* 1167 */       bic = bfw.bp;
/*      */     } 
/* 1169 */     if (bic != null && 
/* 1170 */       !☃.d()) {
/* 1171 */       a(new si(☃.b(), ☃.c(), true));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(pg ☃) {
/* 1178 */     ol.a(☃, this, this.f);
/* 1179 */     bfw bfw = this.f.s;
/* 1180 */     if (☃.b() == 0) {
/* 1181 */       bfw.bo.a(☃.c());
/* 1182 */     } else if (☃.b() == bfw.bp.b) {
/* 1183 */       bfw.bp.a(☃.c());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qe ☃) {
/* 1189 */     ol.a(☃, this, this.f);
/* 1190 */     ccj ccj = this.g.c(☃.b());
/*      */     
/* 1192 */     if (!(ccj instanceof cdf)) {
/* 1193 */       ccj = new cdf();
/* 1194 */       ccj.a(this.g, ☃.b());
/*      */     } 
/*      */     
/* 1197 */     this.f.s.a((cdf)ccj);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ow ☃) {
/* 1202 */     ol.a(☃, this, this.f);
/* 1203 */     fx fx = ☃.b();
/* 1204 */     ccj ccj = this.f.r.c(fx);
/* 1205 */     int i = ☃.c();
/*      */     
/* 1207 */     boolean bool = (i == 2 && ccj instanceof cco);
/* 1208 */     if ((i == 1 && ccj instanceof cdi) || bool || (i == 3 && ccj instanceof cce) || (i == 4 && ccj instanceof cdg) || (i == 6 && ccj instanceof cca) || (i == 7 && ccj instanceof cdj) || (i == 8 && ccj instanceof cdk) || (i == 9 && ccj instanceof cdf) || (i == 11 && ccj instanceof ccf) || (i == 5 && ccj instanceof ccq) || (i == 12 && ccj instanceof ccz) || (i == 13 && ccj instanceof ccm) || (i == 14 && ccj instanceof ccg))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1222 */       ccj.a(this.f.r.d_(fx), ☃.d());
/*      */     }
/* 1224 */     if (bool && this.f.y instanceof dpy) {
/* 1225 */       ((dpy)this.f.y).m();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ph ☃) {
/* 1231 */     ol.a(☃, this, this.f);
/* 1232 */     bfw bfw = this.f.s;
/* 1233 */     if (bfw.bp != null && bfw.bp.b == ☃.b()) {
/* 1234 */       bfw.bp.a(☃.c(), ☃.d());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rd ☃) {
/* 1240 */     ol.a(☃, this, this.f);
/* 1241 */     aqa aqa = this.g.a(☃.b());
/* 1242 */     if (aqa != null) {
/* 1243 */       ☃.c().forEach(pair -> ☃.a((aqf)pair.getFirst(), (bmb)pair.getSecond()));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pf ☃) {
/* 1249 */     ol.a(☃, this, this.f);
/* 1250 */     this.f.s.x();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ox ☃) {
/* 1255 */     ol.a(☃, this, this.f);
/* 1256 */     this.f.r.a(☃.b(), ☃.e(), ☃.c(), ☃.d());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ov ☃) {
/* 1261 */     ol.a(☃, this, this.f);
/* 1262 */     this.f.r.a(☃.b(), ☃.c(), ☃.d());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pq ☃) {
/* 1267 */     ol.a(☃, this, this.f);
/* 1268 */     bfw bfw = this.f.s;
/* 1269 */     pq.a a1 = ☃.b();
/* 1270 */     float f = ☃.c();
/* 1271 */     int i = afm.d(f + 0.5F);
/* 1272 */     if (a1 == pq.a) {
/* 1273 */       bfw.a(new of("block.minecraft.spawn.not_valid"), false);
/* 1274 */     } else if (a1 == pq.b) {
/* 1275 */       this.g.w().b(true);
/* 1276 */       this.g.e(0.0F);
/* 1277 */     } else if (a1 == pq.c) {
/* 1278 */       this.g.w().b(false);
/* 1279 */       this.g.e(1.0F);
/* 1280 */     } else if (a1 == pq.d) {
/* 1281 */       this.f.q.b(bru.a(i));
/* 1282 */     } else if (a1 == pq.e) {
/* 1283 */       if (i == 0) {
/* 1284 */         this.f.s.e.a(new sf(sf.a.a));
/* 1285 */         this.f.a(new dos());
/* 1286 */       } else if (i == 1) {
/* 1287 */         this.f.a(new dpa(true, () -> this.f.s.e.a(new sf(sf.a.a))));
/*      */       } 
/* 1289 */     } else if (a1 == pq.f) {
/* 1290 */       dkd dkd = this.f.k;
/* 1291 */       if (f == 0.0F) {
/* 1292 */         this.f.a(new dny());
/* 1293 */       } else if (f == 101.0F) {
/* 1294 */         this.f.j.c().a(new of("demo.help.movement", new Object[] { dkd.af.j(), dkd.ag.j(), dkd.ah.j(), dkd.ai.j() }));
/* 1295 */       } else if (f == 102.0F) {
/* 1296 */         this.f.j.c().a(new of("demo.help.jump", new Object[] { dkd.aj.j() }));
/* 1297 */       } else if (f == 103.0F) {
/* 1298 */         this.f.j.c().a(new of("demo.help.inventory", new Object[] { dkd.am.j() }));
/* 1299 */       } else if (f == 104.0F) {
/* 1300 */         this.f.j.c().a(new of("demo.day.6", new Object[] { dkd.aw.j() }));
/*      */       } 
/* 1302 */     } else if (a1 == pq.g) {
/* 1303 */       this.g.a(bfw, bfw.cD(), bfw.cG(), bfw.cH(), adq.X, adr.h, 0.18F, 0.45F);
/* 1304 */     } else if (a1 == pq.h) {
/* 1305 */       this.g.e(f);
/* 1306 */     } else if (a1 == pq.i) {
/* 1307 */       this.g.c(f);
/* 1308 */     } else if (a1 == pq.j) {
/* 1309 */       this.g.a(bfw, bfw.cD(), bfw.cE(), bfw.cH(), adq.lW, adr.g, 1.0F, 1.0F);
/* 1310 */     } else if (a1 == pq.k) {
/* 1311 */       this.g.a(hh.q, bfw.cD(), bfw.cE(), bfw.cH(), 0.0D, 0.0D, 0.0D);
/*      */       
/* 1313 */       if (i == 1) {
/* 1314 */         this.g.a(bfw, bfw.cD(), bfw.cE(), bfw.cH(), adq.df, adr.f, 1.0F, 1.0F);
/*      */       }
/* 1316 */     } else if (a1 == pq.l) {
/* 1317 */       this.f.s.b((f == 0.0F));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(py ☃) {
/* 1323 */     ol.a(☃, this, this.f);
/* 1324 */     dkx dkx = this.f.h.h();
/* 1325 */     String str = bmh.a(☃.b());
/* 1326 */     cxx cxx = this.f.r.a(str);
/*      */     
/* 1328 */     if (cxx == null) {
/*      */       
/* 1330 */       cxx = new cxx(str);
/*      */       
/* 1332 */       if (dkx.a(str) != null) {
/* 1333 */         cxx cxx1 = dkx.a(dkx.a(str));
/* 1334 */         if (cxx1 != null) {
/* 1335 */           cxx = cxx1;
/*      */         }
/*      */       } 
/* 1338 */       this.f.r.a(cxx);
/*      */     } 
/*      */     
/* 1341 */     ☃.a(cxx);
/* 1342 */     dkx.a(cxx);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pu ☃) {
/* 1347 */     ol.a(☃, this, this.f);
/* 1348 */     if (☃.b()) {
/* 1349 */       this.f.r.b(☃.c(), ☃.e(), ☃.d());
/*      */     } else {
/* 1351 */       this.f.r.c(☃.c(), ☃.e(), ☃.d());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rt ☃) {
/* 1357 */     ol.a(☃, this, this.f);
/* 1358 */     this.k.a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qs ☃) {
/* 1363 */     ol.a(☃, this, this.f);
/* 1364 */     vk vk = ☃.b();
/* 1365 */     if (vk == null) {
/* 1366 */       this.k.a(null, false);
/*      */     } else {
/* 1368 */       y y = this.k.a().a(vk);
/* 1369 */       this.k.a(y, false);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pd ☃) {
/* 1375 */     ol.a(☃, this, this.f);
/* 1376 */     this.q = new CommandDispatcher(☃.b());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ro ☃) {
/* 1381 */     ol.a(☃, this, this.f);
/* 1382 */     this.f.W().a(☃.b(), ☃.c());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pc ☃) {
/* 1387 */     ol.a(☃, this, this.f);
/* 1388 */     this.l.a(☃.b(), ☃.c());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rw ☃) {
/* 1393 */     ol.a(☃, this, this.f);
/* 1394 */     this.r.a(☃.b());
/*      */     
/* 1396 */     emy<drt> emy = this.f.a(enb.c);
/* 1397 */     emy.a();
/* 1398 */     djm djm = this.f.s.F();
/* 1399 */     djm.a(this.r.b());
/* 1400 */     djm.b().forEach(emy::a);
/* 1401 */     emy.b();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qj ☃) {
/* 1406 */     ol.a(☃, this, this.f);
/* 1407 */     dcn dcn = ☃.a(this.g);
/* 1408 */     if (dcn != null) {
/* 1409 */       this.f.s.a(☃.b(), dcn);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rq ☃) {
/* 1415 */     ol.a(☃, this, this.f);
/*      */     
/* 1417 */     if (!this.n.a(☃.b(), ☃.c())) {
/* 1418 */       a.debug("Got unhandled response to tag query {}", Integer.valueOf(☃.b()));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ot ☃) {
/* 1424 */     ol.a(☃, this, this.f);
/*      */     
/* 1426 */     for (Map.Entry<adx<?>, Integer> entry : ☃.b().entrySet()) {
/* 1427 */       adx<?> adx = entry.getKey();
/* 1428 */       int i = ((Integer)entry.getValue()).intValue();
/*      */       
/* 1430 */       this.f.s.D().a(this.f.s, adx, i);
/*      */     } 
/*      */     
/* 1433 */     if (this.f.y instanceof dpc) {
/* 1434 */       ((dpc)this.f.y).k();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ql ☃) {
/* 1440 */     ol.a(☃, this, this.f);
/*      */     
/* 1442 */     djm djm = this.f.s.F();
/* 1443 */     djm.a(☃.d());
/*      */     
/* 1445 */     ql.a a1 = ☃.e();
/* 1446 */     switch (null.a[a1.ordinal()]) {
/*      */       case 1:
/* 1448 */         for (vk vk : ☃.b()) {
/* 1449 */           this.r.a(vk).ifPresent(djm::c);
/*      */         }
/*      */         break;
/*      */       case 2:
/* 1453 */         for (vk vk : ☃.b()) {
/* 1454 */           this.r.a(vk).ifPresent(djm::a);
/*      */         }
/* 1456 */         for (vk vk : ☃.c()) {
/* 1457 */           this.r.a(vk).ifPresent(djm::f);
/*      */         }
/*      */         break;
/*      */       case 3:
/* 1461 */         for (vk vk : ☃.b()) {
/* 1462 */           this.r.a(vk).ifPresent(boq1 -> {
/*      */                 ☃.a(boq1);
/*      */                 ☃.f(boq1);
/*      */                 dmo.a(this.f.an(), boq1);
/*      */               });
/*      */         } 
/*      */         break;
/*      */     } 
/*      */     
/* 1471 */     djm.b().forEach(drt1 -> drt1.a(☃));
/*      */     
/* 1473 */     if (this.f.y instanceof drv) {
/* 1474 */       ((drv)this.f.y).az_();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rv ☃) {
/* 1480 */     ol.a(☃, this, this.f);
/* 1481 */     aqa aqa = this.g.a(☃.c());
/* 1482 */     if (!(aqa instanceof aqm)) {
/*      */       return;
/*      */     }
/*      */     
/* 1486 */     aps aps = aps.a(☃.d());
/* 1487 */     if (aps == null) {
/*      */       return;
/*      */     }
/*      */     
/* 1491 */     apu apu = new apu(aps, ☃.f(), ☃.e(), ☃.h(), ☃.g(), ☃.i());
/* 1492 */     apu.b(☃.b());
/* 1493 */     ((aqm)aqa).e(apu);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rx ☃) {
/* 1498 */     ol.a(☃, this, this.f);
/*      */     
/* 1500 */     aen aen1 = ☃.b();
/* 1501 */     Multimap<vk, vk> multimap = aek.b(aen1);
/* 1502 */     if (!multimap.isEmpty()) {
/* 1503 */       a.warn("Incomplete server tags, disconnecting. Missing: {}", multimap);
/* 1504 */       this.c.a(new of("multiplayer.disconnect.missing_tags"));
/*      */       
/*      */       return;
/*      */     } 
/* 1508 */     this.m = aen1;
/*      */     
/* 1510 */     if (!this.c.d()) {
/* 1511 */       aen1.e();
/*      */     }
/*      */     
/* 1514 */     this.f.<bmb>a(enb.b).b();
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qh ☃) {
/* 1519 */     ol.a(☃, this, this.f);
/*      */     
/* 1521 */     if (☃.a == qh.a.c) {
/* 1522 */       aqa aqa = this.g.a(☃.b);
/* 1523 */       if (aqa == this.f.s) {
/* 1524 */         if (this.f.s.G()) {
/* 1525 */           this.f.a(new dnx(☃.e, this.g.w().n()));
/*      */         } else {
/* 1527 */           this.f.s.ey();
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pa ☃) {
/* 1535 */     ol.a(☃, this, this.f);
/* 1536 */     this.h.a(☃.c());
/* 1537 */     this.h.a(☃.b());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qu ☃) {
/* 1542 */     ol.a(☃, this, this.f);
/* 1543 */     aqa aqa = ☃.a(this.g);
/* 1544 */     if (aqa != null) {
/* 1545 */       this.f.a(aqa);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qt ☃) {
/* 1551 */     ol.a(☃, this, this.f);
/* 1552 */     ☃.a(this.g.f());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rl ☃) {
/* 1557 */     ol.a(☃, this, this.f);
/* 1558 */     rl.a a1 = ☃.b();
/* 1559 */     nr nr1 = null;
/* 1560 */     nr nr2 = null;
/* 1561 */     nr nr3 = (☃.c() != null) ? ☃.c() : oe.d;
/* 1562 */     switch (null.b[a1.ordinal()]) {
/*      */       case 1:
/* 1564 */         nr1 = nr3;
/*      */         break;
/*      */       case 2:
/* 1567 */         nr2 = nr3;
/*      */         break;
/*      */       case 3:
/* 1570 */         this.f.j.a(nr3, false);
/*      */         return;
/*      */       case 4:
/* 1573 */         this.f.j.a((nr)null, (nr)null, -1, -1, -1);
/* 1574 */         this.f.j.a();
/*      */         return;
/*      */     } 
/*      */ 
/*      */     
/* 1579 */     this.f.j.a(nr1, nr2, ☃.d(), ☃.e(), ☃.f());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rp ☃) {
/* 1584 */     this.f.j.g().b(☃.b().getString().isEmpty() ? null : ☃.b());
/* 1585 */     this.f.j.g().a(☃.c().getString().isEmpty() ? null : ☃.c());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qn ☃) {
/* 1590 */     ol.a(☃, this, this.f);
/* 1591 */     aqa aqa = ☃.a(this.g);
/* 1592 */     if (aqa instanceof aqm) {
/* 1593 */       ((aqm)aqa).c(☃.b());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qi ☃) {
/* 1599 */     ol.a(☃, this, this.f);
/*      */     
/* 1601 */     for (qi.b b : ☃.b()) {
/* 1602 */       if (☃.c() == qi.a.e) {
/* 1603 */         this.f.aB().f(b.a().getId());
/* 1604 */         this.j.remove(b.a().getId()); continue;
/*      */       } 
/* 1606 */       dwx dwx = this.j.get(b.a().getId());
/*      */       
/* 1608 */       if (☃.c() == qi.a.a) {
/* 1609 */         dwx = new dwx(b);
/* 1610 */         this.j.put(dwx.a().getId(), dwx);
/* 1611 */         this.f.aB().a(dwx);
/*      */       } 
/*      */       
/* 1614 */       if (dwx != null) {
/* 1615 */         switch (null.c[☃.c().ordinal()]) {
/*      */           case 1:
/* 1617 */             dwx.a(b.c());
/* 1618 */             dwx.a(b.b());
/* 1619 */             dwx.a(b.d());
/*      */           
/*      */           case 2:
/* 1622 */             dwx.a(b.c());
/*      */           
/*      */           case 3:
/* 1625 */             dwx.a(b.b());
/*      */           
/*      */           case 4:
/* 1628 */             dwx.a(b.d());
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(ps ☃) {
/* 1638 */     a(new sr(☃.b()));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qg ☃) {
/* 1643 */     ol.a(☃, this, this.f);
/* 1644 */     bfw bfw = this.f.s;
/* 1645 */     bfw.bC.b = ☃.c();
/* 1646 */     bfw.bC.d = ☃.e();
/* 1647 */     bfw.bC.a = ☃.b();
/* 1648 */     bfw.bC.c = ☃.d();
/* 1649 */     bfw.bC.a(☃.f());
/* 1650 */     bfw.bC.b(☃.g());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rn ☃) {
/* 1655 */     ol.a(☃, this, this.f);
/* 1656 */     this.f.r.a(this.f.s, ☃.d(), ☃.e(), ☃.f(), ☃.b(), ☃.c(), ☃.g(), ☃.h());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rm ☃) {
/* 1661 */     ol.a(☃, this, this.f);
/* 1662 */     aqa aqa = this.g.a(☃.d());
/* 1663 */     if (aqa == null) {
/*      */       return;
/*      */     }
/* 1666 */     this.f.r.a(this.f.s, aqa, ☃.b(), ☃.c(), ☃.e(), ☃.f());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pl ☃) {
/* 1671 */     ol.a(☃, this, this.f);
/* 1672 */     this.f.W().a(new emp(☃
/* 1673 */           .b(), ☃
/* 1674 */           .c(), ☃
/* 1675 */           .g(), ☃
/* 1676 */           .h(), false, 0, emt.a.b, ☃
/*      */           
/* 1678 */           .d(), ☃
/* 1679 */           .e(), ☃
/* 1680 */           .f(), false));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(qo ☃) {
/* 1687 */     String str1 = ☃.b();
/* 1688 */     String str2 = ☃.c();
/*      */     
/* 1690 */     if (!b(str1)) {
/*      */       return;
/*      */     }
/*      */     
/* 1694 */     if (str1.startsWith("level://")) {
/*      */       try {
/* 1696 */         String str = URLDecoder.decode(str1.substring("level://".length()), StandardCharsets.UTF_8.toString());
/* 1697 */         File file1 = new File(this.f.n, "saves");
/* 1698 */         File file2 = new File(file1, str);
/* 1699 */         if (file2.isFile()) {
/* 1700 */           a(tf.a.d);
/* 1701 */           CompletableFuture<?> completableFuture = this.f.P().a(file2, abx.c);
/* 1702 */           a(completableFuture);
/*      */           return;
/*      */         } 
/* 1705 */       } catch (UnsupportedEncodingException unsupportedEncodingException) {}
/*      */       
/* 1707 */       a(tf.a.c);
/*      */       
/*      */       return;
/*      */     } 
/* 1711 */     dwz dwz = this.f.E();
/* 1712 */     if (dwz != null && dwz.b() == dwz.a.a) {
/* 1713 */       a(tf.a.d);
/* 1714 */       a(this.f.P().a(str1, str2));
/* 1715 */     } else if (dwz == null || dwz.b() == dwz.a.c) {
/* 1716 */       this.f.execute(() -> this.f.a(new dns((), new of("multiplayer.texturePrompt.line1"), new of("multiplayer.texturePrompt.line2"))));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1739 */       a(tf.a.b);
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean b(String ☃) {
/*      */     try {
/* 1745 */       URI uRI = new URI(☃);
/* 1746 */       String str = uRI.getScheme();
/*      */       
/* 1748 */       boolean bool = "level".equals(str);
/* 1749 */       if (!"http".equals(str) && !"https".equals(str) && !bool) {
/* 1750 */         throw new URISyntaxException(☃, "Wrong protocol");
/*      */       }
/*      */       
/* 1753 */       if (bool)
/*      */       {
/* 1755 */         if (☃.contains("..") || !☃.endsWith("/resources.zip")) {
/* 1756 */           throw new URISyntaxException(☃, "Invalid levelstorage resourcepack path");
/*      */         }
/*      */       }
/* 1759 */     } catch (URISyntaxException uRISyntaxException) {
/* 1760 */       a(tf.a.c);
/* 1761 */       return false;
/*      */     } 
/*      */     
/* 1764 */     return true;
/*      */   }
/*      */   
/*      */   private void a(CompletableFuture<?> ☃) {
/* 1768 */     ☃.thenRun(() -> a(tf.a.a)).exceptionally(☃ -> {
/*      */           a(tf.a.c);
/*      */           return null;
/*      */         });
/*      */   }
/*      */   
/*      */   private void a(tf.a ☃) {
/* 1775 */     this.c.a(new tf(☃));
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(oz ☃) {
/* 1780 */     ol.a(☃, this, this.f);
/* 1781 */     this.f.j.i().a(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pj ☃) {
/* 1786 */     ol.a(☃, this, this.f);
/* 1787 */     if (☃.c() == 0) {
/* 1788 */       this.f.s.eT().b(☃.b());
/*      */     } else {
/* 1790 */       this.f.s.eT().a(☃.b(), ☃.c());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qb ☃) {
/* 1796 */     ol.a(☃, this, this.f);
/* 1797 */     aqa aqa = this.f.s.cr();
/* 1798 */     if (aqa != this.f.s && aqa.cs()) {
/* 1799 */       aqa.a(☃.b(), ☃.c(), ☃.d(), ☃.e(), ☃.f());
/* 1800 */       this.c.a(new su(aqa));
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qc ☃) {
/* 1806 */     ol.a(☃, this, this.f);
/* 1807 */     bmb bmb = this.f.s.b(☃.b());
/* 1808 */     if (bmb.b() == bmd.oU) {
/* 1809 */       this.f.a(new dpv(new dpv.c(bmb)));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pk ☃) {
/* 1815 */     ol.a(☃, this, this.f);
/* 1816 */     vk vk = ☃.b();
/* 1817 */     nf nf = null;
/*      */     try {
/* 1819 */       nf = ☃.c();
/* 1820 */       if (pk.a.equals(vk)) {
/* 1821 */         this.f.s.g(nf.e(32767));
/* 1822 */       } else if (pk.b.equals(vk)) {
/* 1823 */         int i = nf.readInt();
/* 1824 */         float f = nf.readFloat();
/* 1825 */         cxd cxd = cxd.b(nf);
/* 1826 */         this.f.i.a.a(i, cxd, f);
/* 1827 */       } else if (pk.c.equals(vk)) {
/* 1828 */         long l = nf.j();
/* 1829 */         fx fx = nf.e();
/* 1830 */         ((edm)this.f.i.f).a(l, fx);
/* 1831 */       } else if (pk.d.equals(vk)) {
/* 1832 */         fx fx = nf.e();
/* 1833 */         int i = nf.readInt();
/* 1834 */         List<fx> list = Lists.newArrayList();
/* 1835 */         List<Float> list1 = Lists.newArrayList();
/* 1836 */         for (int j = 0; j < i; j++) {
/* 1837 */           list.add(nf.e());
/* 1838 */           list1.add(Float.valueOf(nf.readFloat()));
/*      */         } 
/* 1840 */         this.f.i.g.a(fx, list, list1);
/* 1841 */       } else if (pk.e.equals(vk)) {
/* 1842 */         chd chd = this.u.a().a(nf.p());
/* 1843 */         cra cra = new cra(nf.readInt(), nf.readInt(), nf.readInt(), nf.readInt(), nf.readInt(), nf.readInt());
/* 1844 */         int i = nf.readInt();
/* 1845 */         List<cra> list = Lists.newArrayList();
/* 1846 */         List<Boolean> list1 = Lists.newArrayList();
/* 1847 */         for (int j = 0; j < i; j++) {
/* 1848 */           list.add(new cra(nf.readInt(), nf.readInt(), nf.readInt(), nf.readInt(), nf.readInt(), nf.readInt()));
/* 1849 */           list1.add(Boolean.valueOf(nf.readBoolean()));
/*      */         } 
/* 1851 */         this.f.i.h.a(cra, list, list1, chd);
/* 1852 */       } else if (pk.f.equals(vk)) {
/* 1853 */         ((edt)this.f.i.j).a(nf.e(), nf.readFloat(), nf.readFloat(), nf.readFloat(), nf.readFloat(), nf.readFloat());
/* 1854 */       } else if (pk.j.equals(vk)) {
/* 1855 */         int i = nf.readInt(); int j;
/* 1856 */         for (j = 0; j < i; j++) {
/* 1857 */           this.f.i.n.a(nf.g());
/*      */         }
/*      */         
/* 1860 */         j = nf.readInt();
/* 1861 */         for (int k = 0; k < j; k++) {
/* 1862 */           this.f.i.n.b(nf.g());
/*      */         }
/* 1864 */       } else if (pk.h.equals(vk)) {
/* 1865 */         fx fx = nf.e();
/* 1866 */         String str = nf.o();
/* 1867 */         int i = nf.readInt();
/* 1868 */         edc.b b = new edc.b(fx, str, i);
/* 1869 */         this.f.i.m.a(b);
/* 1870 */       } else if (pk.i.equals(vk)) {
/* 1871 */         fx fx = nf.e();
/* 1872 */         this.f.i.m.a(fx);
/* 1873 */       } else if (pk.g.equals(vk)) {
/* 1874 */         fx fx = nf.e();
/* 1875 */         int i = nf.readInt();
/* 1876 */         this.f.i.m.a(fx, i);
/* 1877 */       } else if (pk.k.equals(vk)) {
/* 1878 */         fx fx = nf.e();
/* 1879 */         int i = nf.readInt();
/* 1880 */         int j = nf.readInt();
/* 1881 */         List<edj.a> list = Lists.newArrayList();
/* 1882 */         for (int k = 0; k < j; k++) {
/* 1883 */           int m = nf.readInt();
/* 1884 */           boolean bool = nf.readBoolean();
/* 1885 */           String str = nf.e(255);
/* 1886 */           list.add(new edj.a(fx, m, str, bool));
/*      */         } 
/* 1888 */         this.f.i.q.a(i, list);
/* 1889 */       } else if (pk.q.equals(vk)) {
/* 1890 */         int i = nf.readInt();
/* 1891 */         Collection<fx> collection = Lists.newArrayList();
/* 1892 */         for (int j = 0; j < i; j++) {
/* 1893 */           collection.add(nf.e());
/*      */         }
/* 1895 */         this.f.i.p.a(collection);
/* 1896 */       } else if (pk.l.equals(vk)) {
/*      */         cxd cxd;
/*      */ 
/*      */         
/* 1900 */         double d1 = nf.readDouble();
/* 1901 */         double d2 = nf.readDouble();
/* 1902 */         double d3 = nf.readDouble();
/* 1903 */         gk gk = new gl(d1, d2, d3);
/* 1904 */         UUID uUID = nf.k();
/* 1905 */         int i = nf.readInt();
/* 1906 */         String str1 = nf.o();
/* 1907 */         String str2 = nf.o();
/* 1908 */         int j = nf.readInt();
/* 1909 */         float f1 = nf.readFloat();
/* 1910 */         float f2 = nf.readFloat();
/*      */ 
/*      */         
/* 1913 */         String str3 = nf.o();
/*      */ 
/*      */         
/* 1916 */         boolean bool1 = nf.readBoolean();
/*      */         
/* 1918 */         if (bool1) {
/* 1919 */           cxd = cxd.b(nf);
/*      */         } else {
/* 1921 */           cxd = null;
/*      */         } 
/*      */ 
/*      */         
/* 1925 */         boolean bool2 = nf.readBoolean();
/*      */         
/* 1927 */         edc.a a1 = new edc.a(uUID, i, str1, str2, j, f1, f2, gk, str3, cxd, bool2);
/*      */ 
/*      */         
/* 1930 */         int k = nf.readInt(); int m;
/* 1931 */         for (m = 0; m < k; m++) {
/* 1932 */           String str = nf.o();
/* 1933 */           a1.l.add(str);
/*      */         } 
/*      */ 
/*      */         
/* 1937 */         m = nf.readInt(); int n;
/* 1938 */         for (n = 0; n < m; n++) {
/* 1939 */           String str = nf.o();
/* 1940 */           a1.m.add(str);
/*      */         } 
/*      */ 
/*      */         
/* 1944 */         n = nf.readInt(); int i1;
/* 1945 */         for (i1 = 0; i1 < n; i1++) {
/* 1946 */           String str = nf.o();
/* 1947 */           a1.n.add(str);
/*      */         } 
/*      */ 
/*      */         
/* 1951 */         i1 = nf.readInt(); int i2;
/* 1952 */         for (i2 = 0; i2 < i1; i2++) {
/* 1953 */           fx fx = nf.e();
/* 1954 */           a1.p.add(fx);
/*      */         } 
/*      */ 
/*      */         
/* 1958 */         i2 = nf.readInt(); int i3;
/* 1959 */         for (i3 = 0; i3 < i2; i3++) {
/* 1960 */           fx fx = nf.e();
/* 1961 */           a1.q.add(fx);
/*      */         } 
/*      */ 
/*      */         
/* 1965 */         i3 = nf.readInt();
/* 1966 */         for (int i4 = 0; i4 < i3; i4++) {
/* 1967 */           String str = nf.o();
/* 1968 */           a1.o.add(str);
/*      */         } 
/*      */         
/* 1971 */         this.f.i.m.a(a1);
/* 1972 */       } else if (pk.m.equals(vk)) {
/*      */ 
/*      */ 
/*      */         
/* 1976 */         double d1 = nf.readDouble();
/* 1977 */         double d2 = nf.readDouble();
/* 1978 */         double d3 = nf.readDouble();
/* 1979 */         gk gk = new gl(d1, d2, d3);
/*      */ 
/*      */         
/* 1982 */         UUID uUID = nf.k();
/* 1983 */         int i = nf.readInt();
/*      */ 
/*      */         
/* 1986 */         boolean bool1 = nf.readBoolean();
/* 1987 */         fx fx1 = null;
/* 1988 */         if (bool1) {
/* 1989 */           fx1 = nf.e();
/*      */         }
/*      */         
/* 1992 */         boolean bool2 = nf.readBoolean();
/* 1993 */         fx fx2 = null;
/* 1994 */         if (bool2) {
/* 1995 */           fx2 = nf.e();
/*      */         }
/*      */ 
/*      */         
/* 1999 */         int j = nf.readInt();
/*      */ 
/*      */         
/* 2002 */         boolean bool3 = nf.readBoolean();
/* 2003 */         cxd cxd = null;
/* 2004 */         if (bool3) {
/* 2005 */           cxd = cxd.b(nf);
/*      */         }
/*      */         
/* 2008 */         edb.a a1 = new edb.a(uUID, i, gk, cxd, fx1, fx2, j);
/*      */ 
/*      */         
/* 2011 */         int k = nf.readInt(); int m;
/* 2012 */         for (m = 0; m < k; m++) {
/* 2013 */           String str = nf.o();
/* 2014 */           a1.h.add(str);
/*      */         } 
/*      */ 
/*      */         
/* 2018 */         m = nf.readInt();
/* 2019 */         for (int n = 0; n < m; n++) {
/* 2020 */           fx fx = nf.e();
/* 2021 */           a1.i.add(fx);
/*      */         } 
/*      */         
/* 2024 */         this.f.i.o.a(a1);
/* 2025 */       } else if (pk.n.equals(vk)) {
/*      */ 
/*      */ 
/*      */         
/* 2029 */         fx fx = nf.e();
/*      */ 
/*      */         
/* 2032 */         String str = nf.o();
/*      */ 
/*      */         
/* 2035 */         int i = nf.readInt();
/*      */ 
/*      */         
/* 2038 */         int j = nf.readInt();
/*      */ 
/*      */         
/* 2041 */         boolean bool = nf.readBoolean();
/*      */         
/* 2043 */         edb.b b = new edb.b(fx, str, i, j, bool, this.g.T());
/*      */         
/* 2045 */         this.f.i.o.a(b);
/* 2046 */       } else if (pk.p.equals(vk)) {
/* 2047 */         this.f.i.r.a();
/* 2048 */       } else if (pk.o.equals(vk)) {
/* 2049 */         fx fx = nf.e();
/* 2050 */         int i = nf.readInt();
/* 2051 */         String str = nf.o();
/* 2052 */         int j = nf.readInt();
/* 2053 */         this.f.i.r.a(fx, i, str, j);
/*      */       } else {
/* 2055 */         a.warn("Unknown custom packed identifier: {}", vk);
/*      */       } 
/*      */     } finally {
/* 2058 */       if (nf != null) {
/* 2059 */         nf.release();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(rg ☃) {
/* 2066 */     ol.a(☃, this, this.f);
/* 2067 */     ddn ddn = this.g.G();
/*      */     
/* 2069 */     String str = ☃.b();
/* 2070 */     if (☃.d() == 0) {
/* 2071 */       ddn.a(str, ddq.b, ☃.c(), ☃.e());
/*      */     }
/* 2073 */     else if (ddn.b(str)) {
/* 2074 */       ddk ddk = ddn.d(str);
/* 2075 */       if (☃.d() == 1) {
/* 2076 */         ddn.j(ddk);
/* 2077 */       } else if (☃.d() == 2) {
/* 2078 */         ddk.a(☃.e());
/* 2079 */         ddk.a(☃.c());
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void a(rj ☃) {
/*      */     ddk ddk;
/*      */     ddm ddm;
/* 2087 */     ol.a(☃, this, this.f);
/* 2088 */     ddn ddn = this.g.G();
/* 2089 */     String str = ☃.c();
/*      */     
/* 2091 */     switch (null.d[☃.e().ordinal()]) {
/*      */       
/*      */       case 1:
/* 2094 */         ddk = ddn.c(str);
/* 2095 */         ddm = ddn.c(☃.b(), ddk);
/*      */         
/* 2097 */         ddm.c(☃.d());
/*      */         break;
/*      */       case 2:
/* 2100 */         ddn.d(☃.b(), ddn.d(str));
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qz ☃) {
/* 2107 */     ol.a(☃, this, this.f);
/* 2108 */     ddn ddn = this.g.G();
/*      */     
/* 2110 */     String str = ☃.c();
/* 2111 */     ddk ddk = (str == null) ? null : ddn.c(str);
/* 2112 */     ddn.a(☃.b(), ddk);
/*      */   }
/*      */   
/*      */   public void a(ri ☃) {
/*      */     ddl ddl;
/* 2117 */     ol.a(☃, this, this.f);
/* 2118 */     ddn ddn = this.g.G();
/*      */ 
/*      */     
/* 2121 */     if (☃.e() == 0) {
/* 2122 */       ddl = ddn.g(☃.b());
/*      */     } else {
/* 2124 */       ddl = ddn.f(☃.b());
/*      */     } 
/*      */     
/* 2127 */     if (☃.e() == 0 || ☃.e() == 2) {
/* 2128 */       ddl.a(☃.c());
/* 2129 */       ddl.a(☃.g());
/* 2130 */       ddl.a(☃.f());
/* 2131 */       ddp.b b = ddp.b.a(☃.h());
/* 2132 */       if (b != null) {
/* 2133 */         ddl.a(b);
/*      */       }
/* 2135 */       ddp.a a1 = ddp.a.a(☃.i());
/* 2136 */       if (a1 != null) {
/* 2137 */         ddl.a(a1);
/*      */       }
/* 2139 */       ddl.b(☃.j());
/* 2140 */       ddl.c(☃.k());
/*      */     } 
/*      */     
/* 2143 */     if (☃.e() == 0 || ☃.e() == 3) {
/* 2144 */       for (String str : ☃.d()) {
/* 2145 */         ddn.a(str, ddl);
/*      */       }
/*      */     }
/*      */     
/* 2149 */     if (☃.e() == 4) {
/* 2150 */       for (String str : ☃.d()) {
/* 2151 */         ddn.b(str, ddl);
/*      */       }
/*      */     }
/*      */     
/* 2155 */     if (☃.e() == 1) {
/* 2156 */       ddn.d(ddl);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pv ☃) {
/* 2162 */     ol.a(☃, this, this.f);
/* 2163 */     if (☃.j() == 0) {
/* 2164 */       double d1 = (☃.i() * ☃.f());
/* 2165 */       double d2 = (☃.i() * ☃.g());
/* 2166 */       double d3 = (☃.i() * ☃.h());
/*      */       try {
/* 2168 */         this.g.a(☃.k(), ☃.b(), ☃.c(), ☃.d(), ☃.e(), d1, d2, d3);
/* 2169 */       } catch (Throwable throwable) {
/* 2170 */         a.warn("Could not spawn particle effect {}", ☃.k());
/*      */       } 
/*      */     } else {
/* 2173 */       for (int i = 0; i < ☃.j(); i++) {
/* 2174 */         double d1 = this.p.nextGaussian() * ☃.f();
/* 2175 */         double d2 = this.p.nextGaussian() * ☃.g();
/* 2176 */         double d3 = this.p.nextGaussian() * ☃.h();
/* 2177 */         double d4 = this.p.nextGaussian() * ☃.i();
/* 2178 */         double d5 = this.p.nextGaussian() * ☃.i();
/* 2179 */         double d6 = this.p.nextGaussian() * ☃.i();
/*      */         try {
/* 2181 */           this.g.a(☃.k(), ☃.b(), ☃.c() + d1, ☃.d() + d2, ☃.e() + d3, d4, d5, d6);
/* 2182 */         } catch (Throwable throwable) {
/* 2183 */           a.warn("Could not spawn particle effect {}", ☃.k());
/*      */           return;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ru ☃) {
/* 2192 */     ol.a(☃, this, this.f);
/* 2193 */     aqa aqa = this.g.a(☃.b());
/* 2194 */     if (aqa == null) {
/*      */       return;
/*      */     }
/* 2197 */     if (!(aqa instanceof aqm)) {
/* 2198 */       throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + aqa + ")");
/*      */     }
/*      */     
/* 2201 */     ari ari = ((aqm)aqa).dB();
/* 2202 */     for (ru.a a1 : ☃.c()) {
/* 2203 */       arh arh = ari.a(a1.a());
/*      */       
/* 2205 */       if (arh == null) {
/* 2206 */         a.warn("Entity {} does not have attribute {}", aqa, gm.af.b(a1.a()));
/*      */         continue;
/*      */       } 
/* 2209 */       arh.a(a1.b());
/* 2210 */       arh.e();
/*      */       
/* 2212 */       for (arj arj : a1.c()) {
/* 2213 */         arh.b(arj);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qf ☃) {
/* 2220 */     ol.a(☃, this, this.f);
/*      */     
/* 2222 */     bic bic = this.f.s.bp;
/* 2223 */     if (bic.b != ☃.c() || !bic.c(this.f.s)) {
/*      */       return;
/*      */     }
/*      */     
/* 2227 */     this.r.a(☃.b()).ifPresent(boq1 -> {
/*      */           if (this.f.y instanceof drv) {
/*      */             drp drp = ((drv)this.f.y).k();
/*      */             drp.a(boq1, ☃.a);
/*      */           } 
/*      */         });
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pw ☃) {
/* 2237 */     ol.a(☃, this, this.f);
/*      */     
/* 2239 */     int i = ☃.b();
/* 2240 */     int j = ☃.c();
/* 2241 */     cuo cuo = this.g.n().l();
/*      */     
/* 2243 */     int k = ☃.d();
/* 2244 */     int m = ☃.e();
/* 2245 */     Iterator<byte[]> iterator1 = (Iterator)☃.f().iterator();
/*      */     
/* 2247 */     a(i, j, cuo, bsf.a, k, m, iterator1, ☃.j());
/*      */     
/* 2249 */     int n = ☃.g();
/* 2250 */     int i1 = ☃.h();
/* 2251 */     Iterator<byte[]> iterator2 = (Iterator)☃.i().iterator();
/* 2252 */     a(i, j, cuo, bsf.b, n, i1, iterator2, ☃.j());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(pz ☃) {
/* 2257 */     ol.a(☃, this, this.f);
/* 2258 */     bic bic = this.f.s.bp;
/* 2259 */     if (☃.b() == bic.b && bic instanceof bjg) {
/* 2260 */       ((bjg)bic).a(new bqw(☃.c().a()));
/* 2261 */       ((bjg)bic).e(☃.e());
/* 2262 */       ((bjg)bic).f(☃.d());
/* 2263 */       ((bjg)bic).a(☃.f());
/* 2264 */       ((bjg)bic).b(☃.g());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qx ☃) {
/* 2270 */     ol.a(☃, this, this.f);
/* 2271 */     this.o = ☃.b();
/* 2272 */     this.g.n().a(☃.b());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(qw ☃) {
/* 2277 */     ol.a(☃, this, this.f);
/* 2278 */     this.g.n().e(☃.b(), ☃.c());
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(ou ☃) {
/* 2283 */     ol.a(☃, this, this.f);
/* 2284 */     this.f.q.a(this.g, ☃.c(), ☃.b(), ☃.e(), ☃.d());
/*      */   }
/*      */   
/*      */   private void a(int ☃, int i, cuo cuo1, bsf bsf1, int j, int k, Iterator<byte[]> iterator, boolean bool) {
/* 2288 */     for (int m = 0; m < 18; m++) {
/* 2289 */       int n = -1 + m;
/* 2290 */       boolean bool1 = ((j & 1 << m) != 0);
/* 2291 */       boolean bool2 = ((k & 1 << m) != 0);
/* 2292 */       if (bool1 || bool2) {
/* 2293 */         cuo1.a(bsf1, gp.a(☃, n, i), bool1 ? new cgb((byte[])((byte[])iterator.next()).clone()) : new cgb(), bool);
/* 2294 */         this.g.d(☃, n, i);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public nd a() {
/* 2301 */     return this.c;
/*      */   }
/*      */   
/*      */   public Collection<dwx> e() {
/* 2305 */     return this.j.values();
/*      */   }
/*      */   
/*      */   public Collection<UUID> f() {
/* 2309 */     return this.j.keySet();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public dwx a(UUID ☃) {
/* 2314 */     return this.j.get(☃);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public dwx a(String ☃) {
/* 2319 */     for (dwx dwx : this.j.values()) {
/* 2320 */       if (dwx.a().getName().equals(☃)) {
/* 2321 */         return dwx;
/*      */       }
/*      */     } 
/*      */     
/* 2325 */     return null;
/*      */   }
/*      */   
/*      */   public GameProfile g() {
/* 2329 */     return this.d;
/*      */   }
/*      */   
/*      */   public dwq h() {
/* 2333 */     return this.k;
/*      */   }
/*      */   
/*      */   public CommandDispatcher<dd> i() {
/* 2337 */     return this.q;
/*      */   }
/*      */   
/*      */   public dwt j() {
/* 2341 */     return this.g;
/*      */   }
/*      */   
/*      */   public aen k() {
/* 2345 */     return this.m;
/*      */   }
/*      */   
/*      */   public djq l() {
/* 2349 */     return this.n;
/*      */   }
/*      */   
/*      */   public UUID m() {
/* 2353 */     return this.s;
/*      */   }
/*      */   
/*      */   public Set<vj<brx>> n() {
/* 2357 */     return this.t;
/*      */   }
/*      */   
/*      */   public gn o() {
/* 2361 */     return this.u;
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
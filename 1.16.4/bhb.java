/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bhb
/*     */ {
/*     */   enum a
/*     */   {
/*  65 */     a,
/*  66 */     b,
/*  67 */     c,
/*  68 */     d;
/*     */     
/*  70 */     private static final a[] e = values();
/*     */     
/*     */     private static a b(String ☃) {
/*  73 */       for (a a1 : e) {
/*  74 */         if (☃.equalsIgnoreCase(a1.name())) {
/*  75 */           return a1;
/*     */         }
/*     */       } 
/*  78 */       return a;
/*     */     } static {
/*     */     
/*     */     } public String a() {
/*  82 */       return name().toLowerCase(Locale.ROOT);
/*     */     }
/*     */   }
/*     */   
/*     */   enum b {
/*  87 */     a((String)aqe.aQ, new int[] { 0, 0, 2, 0, 1, 4, 2, 5 }),
/*  88 */     b((String)aqe.w, new int[] { 0, 0, 0, 0, 0, 1, 1, 2
/*     */       }),
/*  90 */     c((String)aqe.ak, new int[] { 0, 4, 3, 3, 4, 4, 4, 2 }),
/*  91 */     d((String)aqe.aS, new int[] { 0, 0, 0, 0, 3, 0, 0, 1 }),
/*  92 */     e((String)aqe.ap, new int[] { 0, 0, 0, 1, 0, 1, 0, 2 });
/*     */ 
/*     */     
/*  95 */     private static final b[] f = values(); private final aqe<? extends bhc> g; private final int[] h;
/*     */     static {
/*     */     
/*     */     }
/*     */     
/*     */     b(aqe<? extends bhc> ☃, int[] arrayOfInt) {
/* 101 */       this.g = ☃;
/* 102 */       this.h = arrayOfInt;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 126 */   private static final nr a = new of("event.minecraft.raid");
/* 127 */   private static final nr b = new of("event.minecraft.raid.victory");
/* 128 */   private static final nr c = new of("event.minecraft.raid.defeat");
/* 129 */   private static final nr d = a.e().c(" - ").a(b);
/* 130 */   private static final nr e = a.e().c(" - ").a(c);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 138 */   private final Map<Integer, bhc> f = Maps.newHashMap();
/* 139 */   private final Map<Integer, Set<bhc>> g = Maps.newHashMap();
/*     */   
/* 141 */   private final Set<UUID> h = Sets.newHashSet();
/*     */   
/*     */   private long i;
/*     */   private fx j;
/*     */   private final aag k;
/*     */   private boolean l;
/*     */   private final int m;
/*     */   private float n;
/*     */   private int o;
/*     */   private boolean p;
/*     */   private int q;
/* 152 */   private final aad r = new aad(a, aok.a.c, aok.b.c);
/*     */   private int s;
/*     */   private int t;
/* 155 */   private final Random u = new Random();
/*     */   private final int v;
/*     */   private a w;
/*     */   private int x;
/* 159 */   private Optional<fx> y = Optional.empty();
/*     */   
/*     */   public bhb(int ☃, aag aag1, fx fx1) {
/* 162 */     this.m = ☃;
/* 163 */     this.k = aag1;
/* 164 */     this.p = true;
/* 165 */     this.t = 300;
/* 166 */     this.r.a(0.0F);
/* 167 */     this.j = fx1;
/* 168 */     this.v = a(aag1.ad());
/* 169 */     this.w = a.a;
/*     */   }
/*     */   
/*     */   public bhb(aag ☃, md md1) {
/* 173 */     this.k = ☃;
/* 174 */     this.m = md1.h("Id");
/* 175 */     this.l = md1.q("Started");
/* 176 */     this.p = md1.q("Active");
/* 177 */     this.i = md1.i("TicksActive");
/* 178 */     this.o = md1.h("BadOmenLevel");
/* 179 */     this.q = md1.h("GroupsSpawned");
/* 180 */     this.t = md1.h("PreRaidTicks");
/* 181 */     this.s = md1.h("PostRaidTicks");
/* 182 */     this.n = md1.j("TotalHealth");
/* 183 */     this.j = new fx(md1.h("CX"), md1.h("CY"), md1.h("CZ"));
/* 184 */     this.v = md1.h("NumGroups");
/* 185 */     this.w = a.a(md1.l("Status"));
/*     */     
/* 187 */     this.h.clear();
/* 188 */     if (md1.c("HeroesOfTheVillage", 9)) {
/* 189 */       mj mj = md1.d("HeroesOfTheVillage", 11);
/* 190 */       for (int i = 0; i < mj.size(); i++) {
/* 191 */         this.h.add(mp.a(mj.k(i)));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 197 */     return (e() || f());
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 201 */     return (c() && r() == 0 && this.t > 0);
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 205 */     return (this.q > 0);
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 209 */     return (this.w == a.d);
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 213 */     return (this.w == a.b);
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 217 */     return (this.w == a.c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public brx i() {
/* 233 */     return this.k;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 237 */     return this.l;
/*     */   }
/*     */   
/*     */   public int k() {
/* 241 */     return this.q;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Predicate<aah> x() {
/* 248 */     return ☃ -> {
/*     */         fx fx1 = ☃.cB();
/* 250 */         return (☃.aX() && this.k.b_(fx1) == this);
/*     */       };
/*     */   }
/*     */   
/*     */   private void y() {
/* 255 */     Set<aah> ☃ = Sets.newHashSet(this.r.h());
/* 256 */     List<aah> list = this.k.a(x());
/*     */     
/* 258 */     for (aah aah : list) {
/* 259 */       if (!☃.contains(aah)) {
/* 260 */         this.r.a(aah);
/*     */       }
/*     */     } 
/*     */     
/* 264 */     for (aah aah : ☃) {
/* 265 */       if (!list.contains(aah)) {
/* 266 */         this.r.b(aah);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int l() {
/* 272 */     return 5;
/*     */   }
/*     */   
/*     */   public int m() {
/* 276 */     return this.o;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bfw ☃) {
/* 284 */     if (☃.a(apw.E)) {
/* 285 */       this.o += ☃.b(apw.E).c() + 1;
/* 286 */       this.o = afm.a(this.o, 0, l());
/*     */     } 
/* 288 */     ☃.d(apw.E);
/*     */   }
/*     */   
/*     */   public void n() {
/* 292 */     this.p = false;
/* 293 */     this.r.b();
/* 294 */     this.w = a.d;
/*     */   }
/*     */   
/*     */   public void o() {
/* 298 */     if (d()) {
/*     */       return;
/*     */     }
/*     */     
/* 302 */     if (this.w == a.a) {
/* 303 */       boolean ☃ = this.p;
/* 304 */       this.p = this.k.C(this.j);
/*     */       
/* 306 */       if (this.k.ad() == aor.a) {
/* 307 */         n();
/*     */         
/*     */         return;
/*     */       } 
/* 311 */       if (☃ != this.p) {
/* 312 */         this.r.d(this.p);
/*     */       }
/*     */ 
/*     */       
/* 316 */       if (!this.p) {
/*     */         return;
/*     */       }
/*     */       
/* 320 */       if (!this.k.a_(this.j))
/*     */       {
/*     */         
/* 323 */         z();
/*     */       }
/*     */ 
/*     */       
/* 327 */       if (!this.k.a_(this.j))
/*     */       {
/* 329 */         if (this.q > 0) {
/* 330 */           this.w = a.c;
/*     */         } else {
/* 332 */           n();
/*     */         } 
/*     */       }
/*     */       
/* 336 */       this.i++;
/*     */       
/* 338 */       if (this.i >= 48000L) {
/* 339 */         n();
/*     */         
/*     */         return;
/*     */       } 
/* 343 */       int i = r();
/*     */ 
/*     */       
/* 346 */       if (i == 0 && A()) {
/* 347 */         if (this.t > 0) {
/* 348 */           boolean bool2 = this.y.isPresent();
/* 349 */           boolean bool3 = (!bool2 && this.t % 5 == 0);
/*     */ 
/*     */           
/* 352 */           if (bool2 && !this.k.i().a(new brd(this.y.get()))) {
/* 353 */             bool3 = true;
/*     */           }
/*     */ 
/*     */           
/* 357 */           if (bool3) {
/*     */             
/* 359 */             int k = 0;
/* 360 */             if (this.t < 100) {
/* 361 */               k = 1;
/* 362 */             } else if (this.t < 40) {
/* 363 */               k = 2;
/*     */             } 
/* 365 */             this.y = d(k);
/*     */           } 
/*     */           
/* 368 */           if (this.t == 300 || this.t % 20 == 0) {
/* 369 */             y();
/*     */           }
/* 371 */           this.t--;
/* 372 */           this.r.a(afm.a((300 - this.t) / 300.0F, 0.0F, 1.0F));
/* 373 */         } else if (this.t == 0 && this.q > 0) {
/* 374 */           this.t = 300;
/* 375 */           this.r.a(a);
/*     */           
/*     */           return;
/*     */         } 
/*     */       }
/*     */       
/* 381 */       if (this.i % 20L == 0L) {
/* 382 */         y();
/* 383 */         F();
/*     */         
/* 385 */         if (i > 0) {
/*     */           
/* 387 */           if (i <= 2) {
/* 388 */             this.r.a(a.e().c(" - ").a(new of("event.minecraft.raid.raiders_remaining", new Object[] { Integer.valueOf(i) })));
/*     */           } else {
/* 390 */             this.r.a(a);
/*     */           } 
/*     */         } else {
/* 393 */           this.r.a(a);
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 403 */       boolean bool1 = false;
/* 404 */       int j = 0;
/* 405 */       while (G()) {
/*     */         
/* 407 */         fx fx1 = this.y.isPresent() ? this.y.get() : a(j, 20);
/* 408 */         if (fx1 != null) {
/* 409 */           this.l = true;
/* 410 */           b(fx1);
/* 411 */           if (!bool1) {
/* 412 */             a(fx1);
/* 413 */             bool1 = true;
/*     */           } 
/*     */         } else {
/* 416 */           j++;
/*     */         } 
/*     */         
/* 419 */         if (j > 3) {
/* 420 */           n();
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */       
/* 426 */       if (j() && !A() && i == 0) {
/* 427 */         if (this.s < 40) {
/* 428 */           this.s++;
/*     */         } else {
/* 430 */           this.w = a.b;
/* 431 */           for (UUID uUID : this.h) {
/* 432 */             aqa aqa = this.k.a(uUID);
/* 433 */             if (aqa instanceof aqm && !aqa.a_()) {
/* 434 */               aqm aqm = (aqm)aqa;
/* 435 */               aqm.c(new apu(apw.F, 48000, this.o - 1, false, false, true));
/* 436 */               if (aqm instanceof aah) {
/* 437 */                 aah aah = (aah)aqm;
/* 438 */                 aah.a(aea.aA);
/* 439 */                 ac.H.a(aah);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */       
/* 446 */       H();
/* 447 */     } else if (a()) {
/* 448 */       this.x++;
/* 449 */       if (this.x >= 600) {
/* 450 */         n();
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 455 */       if (this.x % 20 == 0) {
/* 456 */         y();
/* 457 */         this.r.d(true);
/* 458 */         if (e()) {
/* 459 */           this.r.a(0.0F);
/* 460 */           this.r.a(d);
/*     */         } else {
/* 462 */           this.r.a(e);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void z() {
/* 469 */     Stream<gp> ☃ = gp.a(gp.a(this.j), 2);
/*     */     
/* 471 */     ☃
/* 472 */       .filter(this.k::a)
/* 473 */       .map(gp::q)
/* 474 */       .min(Comparator.comparingDouble(☃ -> ☃.j(this.j)))
/* 475 */       .ifPresent(this::c);
/*     */   }
/*     */   
/*     */   private Optional<fx> d(int ☃) {
/* 479 */     for (int i = 0; i < 3; i++) {
/* 480 */       fx fx1 = a(☃, 1);
/* 481 */       if (fx1 != null) {
/* 482 */         return Optional.of(fx1);
/*     */       }
/*     */     } 
/* 485 */     return Optional.empty();
/*     */   }
/*     */   
/*     */   private boolean A() {
/* 489 */     if (C()) {
/* 490 */       return !D();
/*     */     }
/* 492 */     return !B();
/*     */   }
/*     */   
/*     */   private boolean B() {
/* 496 */     return (k() == this.v);
/*     */   }
/*     */   
/*     */   private boolean C() {
/* 500 */     return (this.o > 1);
/*     */   }
/*     */   
/*     */   private boolean D() {
/* 504 */     return (k() > this.v);
/*     */   }
/*     */   
/*     */   private boolean E() {
/* 508 */     return (B() && r() == 0 && C());
/*     */   }
/*     */   
/*     */   private void F() {
/* 512 */     Iterator<Set<bhc>> ☃ = this.g.values().iterator();
/* 513 */     Set<bhc> set = Sets.newHashSet();
/*     */     
/* 515 */     while (☃.hasNext()) {
/* 516 */       Set<bhc> set1 = ☃.next();
/* 517 */       for (bhc bhc : set1) {
/* 518 */         fx fx1 = bhc.cB();
/*     */ 
/*     */ 
/*     */         
/* 522 */         if (bhc.y || bhc.l.Y() != this.k.Y() || this.j.j(fx1) >= 12544.0D) {
/* 523 */           set.add(bhc); continue;
/*     */         } 
/* 525 */         if (bhc.K <= 600) {
/*     */           continue;
/*     */         }
/*     */ 
/*     */         
/* 530 */         if (this.k.a(bhc.bS()) == null) {
/* 531 */           set.add(bhc);
/*     */         }
/*     */ 
/*     */         
/* 535 */         if (!this.k.a_(fx1) && bhc.dd() > 2400) {
/* 536 */           bhc.b(bhc.fe() + 1);
/*     */         }
/*     */         
/* 539 */         if (bhc.fe() >= 30) {
/* 540 */           set.add(bhc);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 545 */     for (bhc bhc : set) {
/* 546 */       a(bhc, true);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(fx ☃) {
/* 551 */     float f = 13.0F;
/* 552 */     int i = 64;
/*     */     
/* 554 */     Collection<aah> collection = this.r.h();
/* 555 */     for (aah aah : this.k.x()) {
/* 556 */       dcn dcn1 = aah.cA();
/* 557 */       dcn dcn2 = dcn.a(☃);
/* 558 */       float f1 = afm.a((dcn2.b - dcn1.b) * (dcn2.b - dcn1.b) + (dcn2.d - dcn1.d) * (dcn2.d - dcn1.d));
/*     */       
/* 560 */       double d1 = dcn1.b + (13.0F / f1) * (dcn2.b - dcn1.b);
/* 561 */       double d2 = dcn1.d + (13.0F / f1) * (dcn2.d - dcn1.d);
/*     */       
/* 563 */       if (f1 <= 64.0F || collection.contains(aah)) {
/* 564 */         aah.b.a(new rn(adq.md, adr.g, d1, aah.cE(), d2, 64.0F, 1.0F));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(fx ☃) {
/* 570 */     boolean bool1 = false;
/* 571 */     int i = this.q + 1;
/* 572 */     this.n = 0.0F;
/* 573 */     aos aos = this.k.d(☃);
/* 574 */     boolean bool2 = E();
/*     */     
/* 576 */     for (b b : b.a()) {
/* 577 */       int j = a(b, i, bool2) + a(b, this.u, i, aos, bool2);
/* 578 */       int k = 0;
/*     */       
/* 580 */       for (int m = 0; m < j; m++) {
/* 581 */         bhc bhc = b.a(b).a(this.k);
/*     */         
/* 583 */         if (!bool1 && bhc.eN()) {
/* 584 */           bhc.t(true);
/* 585 */           a(i, bhc);
/* 586 */           bool1 = true;
/*     */         } 
/*     */         
/* 589 */         a(i, bhc, ☃, false);
/*     */         
/* 591 */         if (b.a(b) == aqe.ap) {
/* 592 */           bhc bhc1 = null;
/* 593 */           if (i == a(aor.c)) {
/* 594 */             bhc1 = aqe.ak.a(this.k);
/* 595 */           } else if (i >= a(aor.d)) {
/*     */             
/* 597 */             if (k == 0) {
/* 598 */               bhc1 = aqe.w.a(this.k);
/*     */             } else {
/* 600 */               bhc1 = aqe.aQ.a(this.k);
/*     */             } 
/*     */           } 
/* 603 */           k++;
/*     */           
/* 605 */           if (bhc1 != null) {
/* 606 */             a(i, bhc1, ☃, false);
/* 607 */             bhc1.a(☃, 0.0F, 0.0F);
/* 608 */             bhc1.m(bhc);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 614 */     this.y = Optional.empty();
/* 615 */     this.q++;
/* 616 */     p();
/* 617 */     H();
/*     */   }
/*     */   
/*     */   public void a(int ☃, bhc bhc1, @Nullable fx fx1, boolean bool) {
/* 621 */     boolean bool1 = b(☃, bhc1);
/*     */     
/* 623 */     if (bool1) {
/* 624 */       bhc1.a(this);
/* 625 */       bhc1.a(☃);
/* 626 */       bhc1.w(true);
/* 627 */       bhc1.b(0);
/*     */       
/* 629 */       if (!bool && fx1 != null) {
/* 630 */         bhc1.d(fx1.u() + 0.5D, fx1.v() + 1.0D, fx1.w() + 0.5D);
/* 631 */         bhc1.a(this.k, this.k.d(fx1), aqp.h, (arc)null, (md)null);
/* 632 */         bhc1.a(☃, false);
/* 633 */         bhc1.c(true);
/* 634 */         this.k.l(bhc1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void p() {
/* 640 */     this.r.a(afm.a(q() / this.n, 0.0F, 1.0F));
/*     */   }
/*     */   
/*     */   public float q() {
/* 644 */     float ☃ = 0.0F;
/* 645 */     for (Set<bhc> set : this.g.values()) {
/* 646 */       for (bhc bhc : set) {
/* 647 */         ☃ += bhc.dk();
/*     */       }
/*     */     } 
/* 650 */     return ☃;
/*     */   }
/*     */   
/*     */   private boolean G() {
/* 654 */     return (this.t == 0 && (this.q < this.v || E()) && r() == 0);
/*     */   }
/*     */   
/*     */   public int r() {
/* 658 */     return this.g.values().stream().mapToInt(Set::size).sum();
/*     */   }
/*     */   
/*     */   public void a(bhc ☃, boolean bool) {
/* 662 */     Set<bhc> set = this.g.get(Integer.valueOf(☃.fc()));
/* 663 */     if (set != null) {
/* 664 */       boolean bool1 = set.remove(☃);
/* 665 */       if (bool1) {
/*     */ 
/*     */         
/* 668 */         if (bool) {
/* 669 */           this.n -= ☃.dk();
/*     */         }
/* 671 */         ☃.a((bhb)null);
/* 672 */         p();
/* 673 */         H();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void H() {
/* 679 */     this.k.z().b();
/*     */   }
/*     */   
/*     */   public static bmb s() {
/* 683 */     bmb ☃ = new bmb(bmd.pM);
/* 684 */     md md = ☃.a("BlockEntityTag");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 695 */     mj mj = (new ccb.a()).a(ccb.z, bkx.j).a(ccb.f, bkx.i).a(ccb.j, bkx.h).a(ccb.E, bkx.i).a(ccb.k, bkx.p).a(ccb.B, bkx.i).a(ccb.y, bkx.i).a(ccb.E, bkx.p).a();
/*     */     
/* 697 */     md.a("Patterns", mj);
/*     */     
/* 699 */     ☃.a(bmb.a.f);
/* 700 */     ☃.a((new of("block.minecraft.ominous_banner")).a(k.g));
/*     */     
/* 702 */     return ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bhc b(int ☃) {
/* 707 */     return this.f.get(Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private fx a(int ☃, int i) {
/* 712 */     int j = (☃ == 0) ? 2 : (2 - ☃);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 717 */     fx.a a1 = new fx.a();
/*     */     
/* 719 */     for (int k = 0; k < i; k++) {
/* 720 */       float f = this.k.t.nextFloat() * 6.2831855F;
/* 721 */       int m = this.j.u() + afm.d(afm.b(f) * 32.0F * j) + this.k.t.nextInt(5);
/* 722 */       int i1 = this.j.w() + afm.d(afm.a(f) * 32.0F * j) + this.k.t.nextInt(5);
/* 723 */       int n = this.k.a(chn.a.b, m, i1);
/* 724 */       a1.d(m, n, i1);
/*     */ 
/*     */       
/* 727 */       if (!this.k.a_(a1) || ☃ >= 2)
/*     */       {
/*     */ 
/*     */         
/* 731 */         if (this.k.a(a1.u() - 10, a1.v() - 10, a1.w() - 10, a1.u() + 10, a1.v() + 10, a1.w() + 10))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 737 */           if (this.k.i().a(new brd(a1)))
/*     */           {
/*     */ 
/*     */ 
/*     */             
/* 742 */             if (bsg.a(ard.c.a, this.k, a1, aqe.ap) || (this.k
/* 743 */               .d_(a1.c()).a(bup.cC) && this.k.d_(a1).g()))
/*     */             {
/* 745 */               return a1; }  } 
/*     */         }
/*     */       }
/*     */     } 
/* 749 */     return null;
/*     */   }
/*     */   
/*     */   private boolean b(int ☃, bhc bhc1) {
/* 753 */     return a(☃, bhc1, true);
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, bhc bhc1, boolean bool) {
/* 757 */     this.g.computeIfAbsent(Integer.valueOf(☃), ☃ -> Sets.newHashSet());
/* 758 */     Set<bhc> set = this.g.get(Integer.valueOf(☃));
/* 759 */     bhc bhc2 = null;
/*     */ 
/*     */ 
/*     */     
/* 763 */     for (bhc bhc3 : set) {
/* 764 */       if (bhc3.bS().equals(bhc1.bS())) {
/* 765 */         bhc2 = bhc3;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 770 */     if (bhc2 != null) {
/* 771 */       set.remove(bhc2);
/* 772 */       set.add(bhc1);
/*     */     } 
/*     */     
/* 775 */     set.add(bhc1);
/* 776 */     if (bool) {
/* 777 */       this.n += bhc1.dk();
/*     */     }
/* 779 */     p();
/* 780 */     H();
/* 781 */     return true;
/*     */   }
/*     */   
/*     */   public void a(int ☃, bhc bhc1) {
/* 785 */     this.f.put(Integer.valueOf(☃), bhc1);
/* 786 */     bhc1.a(aqf.f, s());
/* 787 */     bhc1.a(aqf.f, 2.0F);
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 791 */     this.f.remove(Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public fx t() {
/* 795 */     return this.j;
/*     */   }
/*     */   
/*     */   private void c(fx ☃) {
/* 799 */     this.j = ☃;
/*     */   }
/*     */   
/*     */   public int u() {
/* 803 */     return this.m;
/*     */   }
/*     */   
/*     */   private int a(b ☃, int i, boolean bool) {
/* 807 */     return bool ? b.b(☃)[this.v] : b.b(☃)[i];
/*     */   }
/*     */   
/*     */   private int a(b ☃, Random random, int i, aos aos1, boolean bool) {
/*     */     int j;
/* 812 */     aor aor = aos1.a();
/* 813 */     boolean bool1 = (aor == aor.b);
/* 814 */     boolean bool2 = (aor == aor.c);
/*     */     
/* 816 */     switch (null.a[☃.ordinal()]) {
/*     */       
/*     */       case 1:
/* 819 */         if (!bool1 && i > 2 && i != 4) {
/* 820 */           int k = 1;
/*     */           break;
/*     */         } 
/* 823 */         return 0;
/*     */       
/*     */       case 2:
/*     */       case 3:
/* 827 */         if (bool1) {
/* 828 */           int k = random.nextInt(2); break;
/* 829 */         }  if (bool2) {
/* 830 */           int k = 1; break;
/*     */         } 
/* 832 */         j = 2;
/*     */         break;
/*     */       
/*     */       case 4:
/* 836 */         j = (!bool1 && bool) ? 1 : 0;
/*     */         break;
/*     */       default:
/* 839 */         return 0;
/*     */     } 
/*     */     
/* 842 */     return (j > 0) ? random.nextInt(j + 1) : 0;
/*     */   }
/*     */   
/*     */   public boolean v() {
/* 846 */     return this.p;
/*     */   }
/*     */   
/*     */   public md a(md ☃) {
/* 850 */     ☃.b("Id", this.m);
/* 851 */     ☃.a("Started", this.l);
/* 852 */     ☃.a("Active", this.p);
/* 853 */     ☃.a("TicksActive", this.i);
/* 854 */     ☃.b("BadOmenLevel", this.o);
/* 855 */     ☃.b("GroupsSpawned", this.q);
/* 856 */     ☃.b("PreRaidTicks", this.t);
/* 857 */     ☃.b("PostRaidTicks", this.s);
/* 858 */     ☃.a("TotalHealth", this.n);
/* 859 */     ☃.b("NumGroups", this.v);
/* 860 */     ☃.a("Status", this.w.a());
/*     */     
/* 862 */     ☃.b("CX", this.j.u());
/* 863 */     ☃.b("CY", this.j.v());
/* 864 */     ☃.b("CZ", this.j.w());
/*     */     
/* 866 */     mj mj = new mj();
/* 867 */     for (UUID uUID : this.h) {
/* 868 */       mj.add(mp.a(uUID));
/*     */     }
/* 870 */     ☃.a("HeroesOfTheVillage", mj);
/*     */     
/* 872 */     return ☃;
/*     */   }
/*     */   
/*     */   public int a(aor ☃) {
/* 876 */     switch (null.b[☃.ordinal()]) {
/*     */       case 1:
/* 878 */         return 3;
/*     */       case 2:
/* 880 */         return 5;
/*     */       case 3:
/* 882 */         return 7;
/*     */     } 
/* 884 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public float w() {
/* 889 */     int ☃ = m();
/* 890 */     if (☃ == 2) {
/* 891 */       return 0.1F;
/*     */     }
/* 893 */     if (☃ == 3) {
/* 894 */       return 0.25F;
/*     */     }
/* 896 */     if (☃ == 4) {
/* 897 */       return 0.5F;
/*     */     }
/* 899 */     if (☃ == 5) {
/* 900 */       return 0.75F;
/*     */     }
/* 902 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void a(aqa ☃) {
/* 906 */     this.h.add(☃.bS());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
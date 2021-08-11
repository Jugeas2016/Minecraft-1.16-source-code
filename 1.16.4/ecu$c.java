/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.common.primitives.Doubles;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import java.util.concurrent.atomic.AtomicReference;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class c
/*     */ {
/*     */   public final AtomicReference<ecu.b> a;
/*     */   @Nullable
/*     */   private b d;
/*     */   @Nullable
/*     */   private c e;
/*     */   private final Set<ccj> f;
/*     */   private final Map<eao, dfp> g;
/*     */   public dci b;
/*     */   private int h;
/*     */   private boolean i;
/*     */   private final fx.a j;
/*     */   private final fx.a[] k;
/*     */   private boolean l;
/*     */   
/*     */   public c(ecu ☃) {
/* 228 */     this.a = new AtomicReference<>(ecu.b.a);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     this.f = Sets.newHashSet();
/*     */     
/* 235 */     this.g = (Map<eao, dfp>)eao.u().stream().collect(Collectors.toMap(☃ -> ☃, ☃ -> new dfp(dfk.h)));
/*     */ 
/*     */ 
/*     */     
/* 239 */     this.h = -1;
/* 240 */     this.i = true;
/*     */     
/* 242 */     this.j = new fx.a(-1, -1, -1);
/* 243 */     this.k = x.<fx.a[]>a(new fx.a[6], ☃ -> {
/*     */           for (int i = 0; i < ☃.length; i++) {
/*     */             ☃[i] = new fx.a();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean a(fx ☃) {
/* 252 */     return (ecu.a(this.c).a(☃.u() >> 4, ☃.w() >> 4, cga.m, false) != null);
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 256 */     int ☃ = 24;
/*     */     
/* 258 */     if (b() > 576.0D) {
/* 259 */       return (a(this.k[gc.e.ordinal()]) && 
/* 260 */         a(this.k[gc.c.ordinal()]) && 
/* 261 */         a(this.k[gc.f.ordinal()]) && 
/* 262 */         a(this.k[gc.d.ordinal()]));
/*     */     }
/* 264 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(int ☃) {
/* 268 */     if (this.h == ☃) {
/* 269 */       return false;
/*     */     }
/* 271 */     this.h = ☃;
/* 272 */     return true;
/*     */   }
/*     */   
/*     */   public dfp a(eao ☃) {
/* 276 */     return this.g.get(☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 280 */     if (☃ == this.j.u() && i == this.j.v() && j == this.j.w()) {
/*     */       return;
/*     */     }
/*     */     
/* 284 */     l();
/* 285 */     this.j.d(☃, i, j);
/* 286 */     this.b = new dci(☃, i, j, (☃ + 16), (i + 16), (j + 16));
/*     */     
/* 288 */     for (gc gc : gc.values()) {
/* 289 */       this.k[gc.ordinal()].g(this.j).c(gc, 16);
/*     */     }
/*     */   }
/*     */   
/*     */   protected double b() {
/* 294 */     djk ☃ = (djz.C()).h.k();
/* 295 */     double d1 = this.b.a + 8.0D - (☃.b()).b;
/* 296 */     double d2 = this.b.b + 8.0D - (☃.b()).c;
/* 297 */     double d3 = this.b.c + 8.0D - (☃.b()).d;
/* 298 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*     */   }
/*     */   
/*     */   private void a(dfh ☃) {
/* 302 */     ☃.a(7, dfk.h);
/*     */   }
/*     */   
/*     */   public ecu.b c() {
/* 306 */     return this.a.get();
/*     */   }
/*     */   
/*     */   private void l() {
/* 310 */     i();
/* 311 */     this.a.set(ecu.b.a);
/* 312 */     this.i = true;
/*     */   }
/*     */   
/*     */   public void d() {
/* 316 */     l();
/* 317 */     this.g.values().forEach(dfp::close);
/*     */   }
/*     */   
/*     */   public fx e() {
/* 321 */     return this.j;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 325 */     boolean bool = this.i;
/* 326 */     this.i = true;
/* 327 */     this.l = ☃ | ((bool && this.l));
/*     */   }
/*     */   
/*     */   public void f() {
/* 331 */     this.i = false;
/* 332 */     this.l = false;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 336 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 340 */     return (this.i && this.l);
/*     */   }
/*     */   
/*     */   public fx a(gc ☃) {
/* 344 */     return this.k[☃.ordinal()];
/*     */   }
/*     */   
/*     */   public boolean a(eao ☃, ecu ecu1) {
/* 348 */     ecu.b b1 = c();
/* 349 */     if (this.e != null) {
/* 350 */       this.e.a();
/*     */     }
/* 352 */     if (!ecu.b.a(b1).contains(☃)) {
/* 353 */       return false;
/*     */     }
/* 355 */     this.e = new c(this, b(), b1);
/* 356 */     ecu1.a(this.e);
/* 357 */     return true;
/*     */   }
/*     */   
/*     */   protected void i() {
/* 361 */     if (this.d != null) {
/* 362 */       this.d.a();
/* 363 */       this.d = null;
/*     */     } 
/* 365 */     if (this.e != null) {
/* 366 */       this.e.a();
/* 367 */       this.e = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public a j() {
/* 372 */     i();
/* 373 */     fx ☃ = this.j.h();
/* 374 */     int i = 1;
/* 375 */     ecv ecv = ecv.a(ecu.a(this.c), ☃.b(-1, -1, -1), ☃.b(16, 16, 16), 1);
/* 376 */     this.d = new b(this, b(), ecv);
/*     */     
/* 378 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(ecu ☃) {
/* 382 */     a a1 = j();
/* 383 */     ☃.a(a1);
/*     */   }
/*     */   
/*     */   private void a(Set<ccj> ☃) {
/* 387 */     Set<ccj> set1 = Sets.newHashSet(☃);
/* 388 */     Set<ccj> set2 = Sets.newHashSet(this.f);
/* 389 */     set1.removeAll(this.f);
/* 390 */     set2.removeAll(☃);
/* 391 */     this.f.clear();
/* 392 */     this.f.addAll(☃);
/* 393 */     ecu.b(this.c).a(set2, set1);
/*     */   }
/*     */   
/*     */   public void k() {
/* 397 */     a ☃ = j();
/*     */     
/* 399 */     ☃.a(ecu.c(this.c));
/*     */   }
/*     */   
/*     */   class b extends a {
/*     */     @Nullable
/*     */     protected ecv d;
/*     */     
/*     */     public b(ecu.c this$0, double ☃, @Nullable ecv ecv1) {
/* 407 */       super(this$0, ☃);
/* 408 */       this.d = ecv1;
/*     */     }
/*     */ 
/*     */     
/*     */     public CompletableFuture<ecu.a> a(dzt ☃) {
/* 413 */       if (this.b.get()) {
/* 414 */         return CompletableFuture.completedFuture(ecu.a.b);
/*     */       }
/*     */       
/* 417 */       if (!this.e.a()) {
/* 418 */         this.d = null;
/* 419 */         this.e.a(false);
/* 420 */         this.b.set(true);
/* 421 */         return CompletableFuture.completedFuture(ecu.a.b);
/*     */       } 
/*     */       
/* 424 */       if (this.b.get()) {
/* 425 */         return CompletableFuture.completedFuture(ecu.a.b);
/*     */       }
/*     */       
/* 428 */       dcn dcn = this.e.c.c();
/* 429 */       float f1 = (float)dcn.b;
/* 430 */       float f2 = (float)dcn.c;
/* 431 */       float f3 = (float)dcn.d;
/*     */       
/* 433 */       ecu.b b1 = new ecu.b();
/* 434 */       Set<ccj> set = a(f1, f2, f3, b1, ☃);
/* 435 */       ecu.c.a(this.e, set);
/*     */       
/* 437 */       if (this.b.get()) {
/* 438 */         return CompletableFuture.completedFuture(ecu.a.b);
/*     */       }
/*     */       
/* 441 */       List<CompletableFuture<Void>> list = Lists.newArrayList();
/*     */       
/* 443 */       ecu.b.a(b1).forEach(eao1 -> ☃.add(this.e.c.a(dzt1.a(eao1), this.e.a(eao1))));
/*     */       
/* 445 */       return x.<Void>b(list).handle((list, throwable) -> {
/*     */             if (throwable != null && !(throwable instanceof java.util.concurrent.CancellationException) && !(throwable instanceof InterruptedException)) {
/*     */               djz.C().a(l.a(throwable, "Rendering chunk"));
/*     */             }
/*     */             if (this.b.get()) {
/*     */               return ecu.a.b;
/*     */             }
/*     */             this.e.a.set(☃);
/*     */             return ecu.a.a;
/*     */           });
/*     */     }
/*     */ 
/*     */     
/*     */     private Set<ccj> a(float ☃, float f1, float f2, ecu.b b1, dzt dzt1) {
/* 459 */       int i = 1;
/*     */       
/* 461 */       fx fx1 = ecu.c.a(this.e).h();
/* 462 */       fx fx2 = fx1.b(15, 15, 15);
/*     */       
/* 464 */       ecw ecw = new ecw();
/* 465 */       Set<ccj> set = Sets.newHashSet();
/* 466 */       ecv ecv1 = this.d;
/* 467 */       this.d = null;
/* 468 */       dfm dfm = new dfm();
/*     */       
/* 470 */       if (ecv1 != null) {
/* 471 */         eaz.a();
/*     */         
/* 473 */         Random random = new Random();
/* 474 */         eax eax = djz.C().ab();
/* 475 */         for (fx fx : fx.a(fx1, fx2)) {
/* 476 */           ceh ceh = ecv1.d_(fx);
/* 477 */           buo buo = ceh.b();
/* 478 */           if (ceh.i(ecv1, fx)) {
/* 479 */             ecw.a(fx);
/*     */           }
/*     */           
/* 482 */           if (buo.q()) {
/* 483 */             ccj ccj = ecv1.a(fx, cgh.a.c);
/* 484 */             if (ccj != null) {
/* 485 */               a(b1, set, ccj);
/*     */             }
/*     */           } 
/*     */           
/* 489 */           cux cux = ecv1.b(fx);
/*     */           
/* 491 */           if (!cux.c()) {
/* 492 */             eao eao = eab.a(cux);
/* 493 */             dfh dfh = dzt1.a(eao);
/* 494 */             if (ecu.b.a(b1).add(eao)) {
/* 495 */               ecu.c.a(this.e, dfh);
/*     */             }
/* 497 */             if (eax.a(fx, ecv1, dfh, cux)) {
/* 498 */               ecu.b.a(b1, false);
/* 499 */               ecu.b.b(b1).add(eao);
/*     */             } 
/*     */           } 
/*     */           
/* 503 */           if (ceh.h() != bzh.a) {
/* 504 */             eao eao = eab.a(ceh);
/* 505 */             dfh dfh = dzt1.a(eao);
/* 506 */             if (ecu.b.a(b1).add(eao)) {
/* 507 */               ecu.c.a(this.e, dfh);
/*     */             }
/*     */             
/* 510 */             dfm.a();
/* 511 */             dfm.a((fx.u() & 0xF), (fx.v() & 0xF), (fx.w() & 0xF));
/* 512 */             if (eax.a(ceh, fx, ecv1, dfm, dfh, true, random)) {
/* 513 */               ecu.b.a(b1, false);
/* 514 */               ecu.b.b(b1).add(eao);
/*     */             } 
/* 516 */             dfm.b();
/*     */           } 
/*     */         } 
/*     */         
/* 520 */         if (ecu.b.b(b1).contains(eao.f())) {
/* 521 */           dfh dfh = dzt1.a(eao.f());
/* 522 */           dfh.a(☃ - fx1.u(), f1 - fx1.v(), f2 - fx1.w());
/* 523 */           ecu.b.a(b1, dfh.b());
/*     */         } 
/*     */         
/* 526 */         ecu.b.a(b1).stream().map(dzt1::a).forEach(dfh::c);
/*     */         
/* 528 */         eaz.b();
/*     */       } 
/*     */       
/* 531 */       ecu.b.a(b1, ecw.a());
/*     */       
/* 533 */       return set;
/*     */     }
/*     */     
/*     */     private <E extends ccj> void a(ecu.b ☃, Set<ccj> set, E e) {
/* 537 */       ece<E> ece = ecd.a.a(e);
/* 538 */       if (ece != null) {
/* 539 */         ecu.b.c(☃).add(e);
/* 540 */         if (ece.a(e)) {
/* 541 */           set.add((ccj)e);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 548 */       this.d = null;
/* 549 */       if (this.b.compareAndSet(false, true))
/* 550 */         this.e.a(false); 
/*     */     }
/*     */   }
/*     */   
/*     */   class c
/*     */     extends a {
/*     */     private final ecu.b e;
/*     */     
/*     */     public c(ecu.c this$0, double ☃, ecu.b b1) {
/* 559 */       super(this$0, ☃);
/* 560 */       this.e = b1;
/*     */     }
/*     */ 
/*     */     
/*     */     public CompletableFuture<ecu.a> a(dzt ☃) {
/* 565 */       if (this.b.get()) {
/* 566 */         return CompletableFuture.completedFuture(ecu.a.b);
/*     */       }
/*     */       
/* 569 */       if (!this.d.a()) {
/* 570 */         this.b.set(true);
/* 571 */         return CompletableFuture.completedFuture(ecu.a.b);
/*     */       } 
/*     */       
/* 574 */       if (this.b.get()) {
/* 575 */         return CompletableFuture.completedFuture(ecu.a.b);
/*     */       }
/*     */       
/* 578 */       dcn dcn = this.d.c.c();
/* 579 */       float f1 = (float)dcn.b;
/* 580 */       float f2 = (float)dcn.c;
/* 581 */       float f3 = (float)dcn.d;
/*     */       
/* 583 */       dfh.b b1 = ecu.b.d(this.e);
/* 584 */       if (b1 == null || !ecu.b.b(this.e).contains(eao.f())) {
/* 585 */         return CompletableFuture.completedFuture(ecu.a.b);
/*     */       }
/*     */       
/* 588 */       dfh dfh = ☃.a(eao.f());
/* 589 */       ecu.c.a(this.d, dfh);
/* 590 */       dfh.a(b1);
/* 591 */       dfh.a(f1 - ecu.c.a(this.d).u(), f2 - ecu.c.a(this.d).v(), f3 - ecu.c.a(this.d).w());
/* 592 */       ecu.b.a(this.e, dfh.b());
/* 593 */       dfh.c();
/*     */       
/* 595 */       if (this.b.get()) {
/* 596 */         return CompletableFuture.completedFuture(ecu.a.b);
/*     */       }
/*     */       
/* 599 */       CompletableFuture<ecu.a> completableFuture = this.d.c.a(☃.a(eao.f()), this.d.a(eao.f())).thenApply(☃ -> ecu.a.b);
/*     */       
/* 601 */       return completableFuture.handle((☃, throwable) -> {
/*     */             if (throwable != null && !(throwable instanceof java.util.concurrent.CancellationException) && !(throwable instanceof InterruptedException)) {
/*     */               djz.C().a(l.a(throwable, "Rendering chunk"));
/*     */             }
/*     */             return this.b.get() ? ecu.a.b : ecu.a.a;
/*     */           });
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 611 */       this.b.set(true);
/*     */     }
/*     */   }
/*     */   
/*     */   abstract class a implements Comparable<a> {
/*     */     protected final double a;
/* 617 */     protected final AtomicBoolean b = new AtomicBoolean(false);
/*     */     
/*     */     public a(ecu.c this$0, double ☃) {
/* 620 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int a(a ☃) {
/* 629 */       return Doubles.compare(this.a, ☃.a);
/*     */     }
/*     */     
/*     */     public abstract CompletableFuture<ecu.a> a(dzt param2dzt);
/*     */     
/*     */     public abstract void a();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecu$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
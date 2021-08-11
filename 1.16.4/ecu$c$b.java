/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
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
/*     */ class b
/*     */   extends ecu.c.a
/*     */ {
/*     */   @Nullable
/*     */   protected ecv d;
/*     */   
/*     */   public b(ecu.c paramc, double ☃, @Nullable ecv ecv1) {
/* 407 */     super(paramc, ☃);
/* 408 */     this.d = ecv1;
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<ecu.a> a(dzt ☃) {
/* 413 */     if (this.b.get()) {
/* 414 */       return CompletableFuture.completedFuture(ecu.a.b);
/*     */     }
/*     */     
/* 417 */     if (!this.e.a()) {
/* 418 */       this.d = null;
/* 419 */       this.e.a(false);
/* 420 */       this.b.set(true);
/* 421 */       return CompletableFuture.completedFuture(ecu.a.b);
/*     */     } 
/*     */     
/* 424 */     if (this.b.get()) {
/* 425 */       return CompletableFuture.completedFuture(ecu.a.b);
/*     */     }
/*     */     
/* 428 */     dcn dcn = this.e.c.c();
/* 429 */     float f1 = (float)dcn.b;
/* 430 */     float f2 = (float)dcn.c;
/* 431 */     float f3 = (float)dcn.d;
/*     */     
/* 433 */     ecu.b b1 = new ecu.b();
/* 434 */     Set<ccj> set = a(f1, f2, f3, b1, ☃);
/* 435 */     ecu.c.a(this.e, set);
/*     */     
/* 437 */     if (this.b.get()) {
/* 438 */       return CompletableFuture.completedFuture(ecu.a.b);
/*     */     }
/*     */     
/* 441 */     List<CompletableFuture<Void>> list = Lists.newArrayList();
/*     */     
/* 443 */     ecu.b.a(b1).forEach(eao1 -> ☃.add(this.e.c.a(dzt1.a(eao1), this.e.a(eao1))));
/*     */     
/* 445 */     return x.<Void>b(list).handle((list, throwable) -> {
/*     */           if (throwable != null && !(throwable instanceof java.util.concurrent.CancellationException) && !(throwable instanceof InterruptedException)) {
/*     */             djz.C().a(l.a(throwable, "Rendering chunk"));
/*     */           }
/*     */           if (this.b.get()) {
/*     */             return ecu.a.b;
/*     */           }
/*     */           this.e.a.set(☃);
/*     */           return ecu.a.a;
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private Set<ccj> a(float ☃, float f1, float f2, ecu.b b1, dzt dzt1) {
/* 459 */     int i = 1;
/*     */     
/* 461 */     fx fx1 = ecu.c.a(this.e).h();
/* 462 */     fx fx2 = fx1.b(15, 15, 15);
/*     */     
/* 464 */     ecw ecw = new ecw();
/* 465 */     Set<ccj> set = Sets.newHashSet();
/* 466 */     ecv ecv1 = this.d;
/* 467 */     this.d = null;
/* 468 */     dfm dfm = new dfm();
/*     */     
/* 470 */     if (ecv1 != null) {
/* 471 */       eaz.a();
/*     */       
/* 473 */       Random random = new Random();
/* 474 */       eax eax = djz.C().ab();
/* 475 */       for (fx fx : fx.a(fx1, fx2)) {
/* 476 */         ceh ceh = ecv1.d_(fx);
/* 477 */         buo buo = ceh.b();
/* 478 */         if (ceh.i(ecv1, fx)) {
/* 479 */           ecw.a(fx);
/*     */         }
/*     */         
/* 482 */         if (buo.q()) {
/* 483 */           ccj ccj = ecv1.a(fx, cgh.a.c);
/* 484 */           if (ccj != null) {
/* 485 */             a(b1, set, ccj);
/*     */           }
/*     */         } 
/*     */         
/* 489 */         cux cux = ecv1.b(fx);
/*     */         
/* 491 */         if (!cux.c()) {
/* 492 */           eao eao = eab.a(cux);
/* 493 */           dfh dfh = dzt1.a(eao);
/* 494 */           if (ecu.b.a(b1).add(eao)) {
/* 495 */             ecu.c.a(this.e, dfh);
/*     */           }
/* 497 */           if (eax.a(fx, ecv1, dfh, cux)) {
/* 498 */             ecu.b.a(b1, false);
/* 499 */             ecu.b.b(b1).add(eao);
/*     */           } 
/*     */         } 
/*     */         
/* 503 */         if (ceh.h() != bzh.a) {
/* 504 */           eao eao = eab.a(ceh);
/* 505 */           dfh dfh = dzt1.a(eao);
/* 506 */           if (ecu.b.a(b1).add(eao)) {
/* 507 */             ecu.c.a(this.e, dfh);
/*     */           }
/*     */           
/* 510 */           dfm.a();
/* 511 */           dfm.a((fx.u() & 0xF), (fx.v() & 0xF), (fx.w() & 0xF));
/* 512 */           if (eax.a(ceh, fx, ecv1, dfm, dfh, true, random)) {
/* 513 */             ecu.b.a(b1, false);
/* 514 */             ecu.b.b(b1).add(eao);
/*     */           } 
/* 516 */           dfm.b();
/*     */         } 
/*     */       } 
/*     */       
/* 520 */       if (ecu.b.b(b1).contains(eao.f())) {
/* 521 */         dfh dfh = dzt1.a(eao.f());
/* 522 */         dfh.a(☃ - fx1.u(), f1 - fx1.v(), f2 - fx1.w());
/* 523 */         ecu.b.a(b1, dfh.b());
/*     */       } 
/*     */       
/* 526 */       ecu.b.a(b1).stream().map(dzt1::a).forEach(dfh::c);
/*     */       
/* 528 */       eaz.b();
/*     */     } 
/*     */     
/* 531 */     ecu.b.a(b1, ecw.a());
/*     */     
/* 533 */     return set;
/*     */   }
/*     */   
/*     */   private <E extends ccj> void a(ecu.b ☃, Set<ccj> set, E e) {
/* 537 */     ece<E> ece = ecd.a.a(e);
/* 538 */     if (ece != null) {
/* 539 */       ecu.b.c(☃).add(e);
/* 540 */       if (ece.a(e)) {
/* 541 */         set.add((ccj)e);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 548 */     this.d = null;
/* 549 */     if (this.b.compareAndSet(false, true))
/* 550 */       this.e.a(false); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecu$c$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
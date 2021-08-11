/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.suggestion.Suggestion;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   private final eal b;
/*     */   private final String c;
/*     */   private final List<Suggestion> d;
/*     */   private int e;
/*     */   private int f;
/* 359 */   private dcm g = dcm.a;
/*     */   private boolean h;
/*     */   private int i;
/*     */   
/*     */   private a(dlm ☃, int i, int j, int k, List<Suggestion> list, boolean bool) {
/* 364 */     int m = i - 1;
/* 365 */     int n = dlm.a(☃) ? (j - 3 - Math.min(list.size(), dlm.b(☃)) * 12) : j;
/* 366 */     this.b = new eal(m, n, k + 1, Math.min(list.size(), dlm.b(☃)) * 12);
/* 367 */     this.c = dlm.c(☃).b();
/* 368 */     this.i = bool ? -1 : 0;
/* 369 */     this.d = list;
/* 370 */     b(0);
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i, int j) {
/* 374 */     int k = Math.min(this.d.size(), dlm.b(this.a));
/* 375 */     int m = -5592406;
/* 376 */     boolean bool1 = (this.e > 0);
/* 377 */     boolean bool2 = (this.d.size() > this.e + k);
/* 378 */     boolean bool3 = (bool1 || bool2);
/* 379 */     boolean bool4 = (this.g.i != i || this.g.j != j);
/*     */     
/* 381 */     if (bool4) {
/* 382 */       this.g = new dcm(i, j);
/*     */     }
/*     */     
/* 385 */     if (bool3) {
/* 386 */       dkw.a(☃, this.b.a(), this.b.b() - 1, this.b.a() + this.b.c(), this.b.b(), dlm.d(this.a));
/* 387 */       dkw.a(☃, this.b.a(), this.b.b() + this.b.d(), this.b.a() + this.b.c(), this.b.b() + this.b.d() + 1, dlm.d(this.a));
/* 388 */       if (bool1) {
/* 389 */         for (int i1 = 0; i1 < this.b.c(); i1++) {
/* 390 */           if (i1 % 2 == 0) {
/* 391 */             dkw.a(☃, this.b.a() + i1, this.b.b() - 1, this.b.a() + i1 + 1, this.b.b(), -1);
/*     */           }
/*     */         } 
/*     */       }
/* 395 */       if (bool2) {
/* 396 */         for (int i1 = 0; i1 < this.b.c(); i1++) {
/* 397 */           if (i1 % 2 == 0) {
/* 398 */             dkw.a(☃, this.b.a() + i1, this.b.b() + this.b.d(), this.b.a() + i1 + 1, this.b.b() + this.b.d() + 1, -1);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 404 */     boolean bool5 = false;
/* 405 */     for (int n = 0; n < k; n++) {
/* 406 */       Suggestion suggestion = this.d.get(n + this.e);
/* 407 */       dkw.a(☃, this.b.a(), this.b.b() + 12 * n, this.b.a() + this.b.c(), this.b.b() + 12 * n + 12, dlm.d(this.a));
/* 408 */       if (i > this.b.a() && i < this.b.a() + this.b.c() && j > this.b.b() + 12 * n && j < this.b.b() + 12 * n + 12) {
/* 409 */         if (bool4) {
/* 410 */           b(n + this.e);
/*     */         }
/* 412 */         bool5 = true;
/*     */       } 
/* 414 */       dlm.e(this.a).a(☃, suggestion.getText(), (this.b.a() + 1), (this.b.b() + 2 + 12 * n), (n + this.e == this.f) ? -256 : -5592406);
/*     */     } 
/*     */     
/* 417 */     if (bool5) {
/* 418 */       Message message = ((Suggestion)this.d.get(this.f)).getTooltip();
/* 419 */       if (message != null) {
/* 420 */         dlm.f(this.a).b(☃, ns.a(message), i, j);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 426 */     if (!this.b.b(☃, i)) {
/* 427 */       return false;
/*     */     }
/*     */     
/* 430 */     int k = (i - this.b.b()) / 12 + this.e;
/* 431 */     if (k >= 0 && k < this.d.size()) {
/* 432 */       b(k);
/* 433 */       a();
/*     */     } 
/*     */     
/* 436 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(double ☃) {
/* 440 */     int i = (int)((dlm.g(this.a)).l.e() * dlm.g(this.a).aD().o() / dlm.g(this.a).aD().m());
/* 441 */     int j = (int)((dlm.g(this.a)).l.f() * dlm.g(this.a).aD().p() / dlm.g(this.a).aD().n());
/*     */     
/* 443 */     if (this.b.b(i, j)) {
/* 444 */       this.e = afm.a((int)(this.e - ☃), 0, Math.max(this.d.size() - dlm.b(this.a), 0));
/* 445 */       return true;
/*     */     } 
/*     */     
/* 448 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(int ☃, int i, int j) {
/* 452 */     if (☃ == 265) {
/* 453 */       a(-1);
/* 454 */       this.h = false;
/* 455 */       return true;
/* 456 */     }  if (☃ == 264) {
/* 457 */       a(1);
/* 458 */       this.h = false;
/* 459 */       return true;
/* 460 */     }  if (☃ == 258) {
/* 461 */       if (this.h) {
/* 462 */         a(dot.y() ? -1 : 1);
/*     */       }
/* 464 */       a();
/* 465 */       return true;
/* 466 */     }  if (☃ == 256) {
/* 467 */       b();
/* 468 */       return true;
/*     */     } 
/*     */     
/* 471 */     return false;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 475 */     b(this.f + ☃);
/* 476 */     int i = this.e;
/* 477 */     int j = this.e + dlm.b(this.a) - 1;
/* 478 */     if (this.f < i) {
/* 479 */       this.e = afm.a(this.f, 0, Math.max(this.d.size() - dlm.b(this.a), 0));
/* 480 */     } else if (this.f > j) {
/* 481 */       this.e = afm.a(this.f + dlm.h(this.a) - dlm.b(this.a), 0, Math.max(this.d.size() - dlm.b(this.a), 0));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 486 */     this.f = ☃;
/*     */     
/* 488 */     if (this.f < 0) {
/* 489 */       this.f += this.d.size();
/*     */     }
/* 491 */     if (this.f >= this.d.size()) {
/* 492 */       this.f -= this.d.size();
/*     */     }
/*     */     
/* 495 */     Suggestion suggestion = this.d.get(this.f);
/* 496 */     dlm.c(this.a).c(dlm.a(dlm.c(this.a).b(), suggestion.apply(this.c)));
/*     */     
/* 498 */     if (dkz.b.a() && this.i != this.f) {
/* 499 */       dkz.b.a(c());
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/* 504 */     Suggestion ☃ = this.d.get(this.f);
/* 505 */     dlm.a(this.a, true);
/* 506 */     dlm.c(this.a).a(☃.apply(this.c));
/* 507 */     int i = ☃.getRange().getStart() + ☃.getText().length();
/* 508 */     dlm.c(this.a).j(i);
/* 509 */     dlm.c(this.a).n(i);
/* 510 */     b(this.f);
/* 511 */     dlm.a(this.a, false);
/* 512 */     this.h = true;
/*     */   }
/*     */   
/*     */   private String c() {
/* 516 */     this.i = this.f;
/* 517 */     Suggestion ☃ = this.d.get(this.f);
/* 518 */     Message message = ☃.getTooltip();
/* 519 */     if (message != null) {
/* 520 */       return ekx.a("narration.suggestion.tooltip", new Object[] { Integer.valueOf(this.f + 1), Integer.valueOf(this.d.size()), ☃.getText(), message.getString() });
/*     */     }
/* 522 */     return ekx.a("narration.suggestion", new Object[] { Integer.valueOf(this.f + 1), Integer.valueOf(this.d.size()), ☃.getText() });
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/* 527 */     dlm.a(this.a, (a)null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
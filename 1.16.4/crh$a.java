/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends crh.c
/*     */ {
/*     */   private final boolean b;
/*     */   private final boolean c;
/*     */   private boolean d;
/*     */   private final int e;
/*     */   
/*     */   public a(csw ☃, md md1) {
/* 262 */     super(clb.a, md1);
/*     */     
/* 264 */     this.b = md1.q("hr");
/* 265 */     this.c = md1.q("sc");
/* 266 */     this.d = md1.q("hps");
/* 267 */     this.e = md1.h("Num");
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 272 */     super.a(☃);
/* 273 */     ☃.a("hr", this.b);
/* 274 */     ☃.a("sc", this.c);
/* 275 */     ☃.a("hps", this.d);
/* 276 */     ☃.b("Num", this.e);
/*     */   }
/*     */   
/*     */   public a(int ☃, Random random, cra cra1, gc gc1, ckb.b b1) {
/* 280 */     super(clb.a, ☃, b1);
/* 281 */     a(gc1);
/* 282 */     this.n = cra1;
/* 283 */     this.b = (random.nextInt(3) == 0);
/* 284 */     this.c = (!this.b && random.nextInt(23) == 0);
/*     */     
/* 286 */     if (i().n() == gc.a.c) {
/* 287 */       this.e = cra1.f() / 5;
/*     */     } else {
/* 289 */       this.e = cra1.d() / 5;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static cra a(List<cru> ☃, Random random, int i, int j, int k, gc gc1) {
/* 294 */     cra cra = new cra(i, j, k, i, j + 3 - 1, k);
/*     */     
/* 296 */     int m = random.nextInt(3) + 2;
/* 297 */     while (m > 0) {
/* 298 */       int n = m * 5;
/*     */       
/* 300 */       switch (crh.null.b[gc1.ordinal()]) {
/*     */         
/*     */         default:
/* 303 */           cra.d = i + 3 - 1;
/* 304 */           cra.c = k - n - 1;
/*     */           break;
/*     */         case 2:
/* 307 */           cra.d = i + 3 - 1;
/* 308 */           cra.f = k + n - 1;
/*     */           break;
/*     */         case 3:
/* 311 */           cra.a = i - n - 1;
/* 312 */           cra.f = k + 3 - 1;
/*     */           break;
/*     */         case 4:
/* 315 */           cra.d = i + n - 1;
/* 316 */           cra.f = k + 3 - 1;
/*     */           break;
/*     */       } 
/*     */       
/* 320 */       if (cru.a(☃, cra) != null) {
/* 321 */         m--;
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 327 */     if (m > 0) {
/* 328 */       return cra;
/*     */     }
/*     */     
/* 331 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cru ☃, List<cru> list, Random random) {
/* 336 */     int i = h();
/* 337 */     int j = random.nextInt(4);
/* 338 */     gc gc = i();
/* 339 */     if (gc != null) {
/* 340 */       switch (crh.null.b[gc.ordinal()]) {
/*     */         
/*     */         default:
/* 343 */           if (j <= 1) {
/* 344 */             crh.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.c - 1, gc, i); break;
/* 345 */           }  if (j == 2) {
/* 346 */             crh.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.c, gc.e, i); break;
/*     */           } 
/* 348 */           crh.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.c, gc.f, i);
/*     */           break;
/*     */         
/*     */         case 2:
/* 352 */           if (j <= 1) {
/* 353 */             crh.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.f + 1, gc, i); break;
/* 354 */           }  if (j == 2) {
/* 355 */             crh.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.f - 3, gc.e, i); break;
/*     */           } 
/* 357 */           crh.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.f - 3, gc.f, i);
/*     */           break;
/*     */         
/*     */         case 3:
/* 361 */           if (j <= 1) {
/* 362 */             crh.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.c, gc, i); break;
/* 363 */           }  if (j == 2) {
/* 364 */             crh.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.c - 1, gc.c, i); break;
/*     */           } 
/* 366 */           crh.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.f + 1, gc.d, i);
/*     */           break;
/*     */         
/*     */         case 4:
/* 370 */           if (j <= 1) {
/* 371 */             crh.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.c, gc, i); break;
/* 372 */           }  if (j == 2) {
/* 373 */             crh.a(☃, list, random, this.n.d - 3, this.n.b - 1 + random.nextInt(3), this.n.c - 1, gc.c, i); break;
/*     */           } 
/* 375 */           crh.a(☃, list, random, this.n.d - 3, this.n.b - 1 + random.nextInt(3), this.n.f + 1, gc.d, i);
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 382 */     if (i < 8) {
/* 383 */       if (gc == gc.c || gc == gc.d) {
/* 384 */         for (int k = this.n.c + 3; k + 3 <= this.n.f; k += 5) {
/* 385 */           int m = random.nextInt(5);
/* 386 */           if (m == 0) {
/* 387 */             crh.a(☃, list, random, this.n.a - 1, this.n.b, k, gc.e, i + 1);
/* 388 */           } else if (m == 1) {
/* 389 */             crh.a(☃, list, random, this.n.d + 1, this.n.b, k, gc.f, i + 1);
/*     */           } 
/*     */         } 
/*     */       } else {
/* 393 */         for (int k = this.n.a + 3; k + 3 <= this.n.d; k += 5) {
/* 394 */           int m = random.nextInt(5);
/* 395 */           if (m == 0) {
/* 396 */             crh.a(☃, list, random, k, this.n.b, this.n.c - 1, gc.c, i + 1);
/* 397 */           } else if (m == 1) {
/* 398 */             crh.a(☃, list, random, k, this.n.b, this.n.f + 1, gc.d, i + 1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(bsr ☃, cra cra1, Random random, int i, int j, int k, vk vk1) {
/* 407 */     fx fx = new fx(a(i, k), d(j), b(i, k));
/* 408 */     if (cra1.b(fx) && 
/* 409 */       ☃.d_(fx).g() && !☃.d_(fx.c()).g()) {
/* 410 */       ceh ceh = bup.ch.n().a(bza.c, random.nextBoolean() ? cfk.a : cfk.b);
/* 411 */       a(☃, ceh, i, j, k, cra1);
/* 412 */       bhq bhq = new bhq(☃.E(), fx.u() + 0.5D, fx.v() + 0.5D, fx.w() + 0.5D);
/* 413 */       bhq.a(vk1, random.nextLong());
/* 414 */       ☃.c(bhq);
/* 415 */       return true;
/*     */     } 
/*     */ 
/*     */     
/* 419 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 424 */     if (a(☃, cra1)) {
/* 425 */       return false;
/*     */     }
/*     */     
/* 428 */     int i = 0;
/* 429 */     int j = 2;
/* 430 */     int k = 0;
/* 431 */     int m = 2;
/* 432 */     int n = this.e * 5 - 1;
/*     */     
/* 434 */     ceh ceh = a();
/*     */ 
/*     */     
/* 437 */     a(☃, cra1, 0, 0, 0, 2, 1, n, m, m, false);
/* 438 */     a(☃, cra1, random, 0.8F, 0, 2, 0, 2, 2, n, m, m, false, false);
/*     */     
/* 440 */     if (this.c) {
/* 441 */       a(☃, cra1, random, 0.6F, 0, 0, 0, 2, 1, n, bup.aQ.n(), m, false, true);
/*     */     }
/*     */     
/*     */     int i1;
/* 445 */     for (i1 = 0; i1 < this.e; i1++) {
/* 446 */       int i2 = 2 + i1 * 5;
/*     */       
/* 448 */       a(☃, cra1, 0, 0, i2, 2, 2, random);
/*     */       
/* 450 */       a(☃, cra1, random, 0.1F, 0, 2, i2 - 1);
/* 451 */       a(☃, cra1, random, 0.1F, 2, 2, i2 - 1);
/* 452 */       a(☃, cra1, random, 0.1F, 0, 2, i2 + 1);
/* 453 */       a(☃, cra1, random, 0.1F, 2, 2, i2 + 1);
/* 454 */       a(☃, cra1, random, 0.05F, 0, 2, i2 - 2);
/* 455 */       a(☃, cra1, random, 0.05F, 2, 2, i2 - 2);
/* 456 */       a(☃, cra1, random, 0.05F, 0, 2, i2 + 2);
/* 457 */       a(☃, cra1, random, 0.05F, 2, 2, i2 + 2);
/*     */       
/* 459 */       if (random.nextInt(100) == 0) {
/* 460 */         a(☃, cra1, random, 2, 0, i2 - 1, cyq.u);
/*     */       }
/* 462 */       if (random.nextInt(100) == 0) {
/* 463 */         a(☃, cra1, random, 0, 0, i2 + 1, cyq.u);
/*     */       }
/* 465 */       if (this.c && !this.d) {
/* 466 */         int i3 = d(0);
/* 467 */         int i4 = i2 - 1 + random.nextInt(3);
/* 468 */         int i5 = a(1, i4);
/* 469 */         int i6 = b(1, i4);
/* 470 */         fx fx2 = new fx(i5, i3, i6);
/*     */         
/* 472 */         if (cra1.b(fx2) && a(☃, 1, 0, i4, cra1)) {
/* 473 */           this.d = true;
/* 474 */           ☃.a(fx2, bup.bP.n(), 2);
/*     */           
/* 476 */           ccj ccj = ☃.c(fx2);
/* 477 */           if (ccj instanceof cdi) {
/* 478 */             ((cdi)ccj).d().a(aqe.i);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 485 */     for (i1 = 0; i1 <= 2; i1++) {
/* 486 */       for (int i2 = 0; i2 <= n; i2++) {
/* 487 */         int i3 = -1;
/* 488 */         ceh ceh1 = a(☃, i1, -1, i2, cra1);
/* 489 */         if (ceh1.g() && a(☃, i1, -1, i2, cra1)) {
/* 490 */           int i4 = -1;
/* 491 */           a(☃, ceh, i1, -1, i2, cra1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 496 */     if (this.b) {
/* 497 */       ceh ceh1 = bup.ch.n().a(bza.c, cfk.a);
/* 498 */       for (int i2 = 0; i2 <= n; i2++) {
/* 499 */         ceh ceh2 = a(☃, 1, -1, i2, cra1);
/* 500 */         if (!ceh2.g() && ceh2.i(☃, new fx(a(1, i2), d(-1), b(1, i2)))) {
/* 501 */           float f = a(☃, 1, 0, i2, cra1) ? 0.7F : 0.9F;
/* 502 */           a(☃, cra1, random, f, 1, 0, i2, ceh1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 507 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(bsr ☃, cra cra1, int i, int j, int k, int m, int n, Random random) {
/* 512 */     if (!a(☃, cra1, i, n, m, k)) {
/*     */       return;
/*     */     }
/*     */     
/* 516 */     ceh ceh1 = a();
/* 517 */     ceh ceh2 = b();
/*     */     
/* 519 */     a(☃, cra1, i, j, k, i, m - 1, k, ceh2.a(bwq.d, Boolean.valueOf(true)), m, false);
/* 520 */     a(☃, cra1, n, j, k, n, m - 1, k, ceh2.a(bwq.b, Boolean.valueOf(true)), m, false);
/* 521 */     if (random.nextInt(4) == 0) {
/* 522 */       a(☃, cra1, i, m, k, i, m, k, ceh1, m, false);
/* 523 */       a(☃, cra1, n, m, k, n, m, k, ceh1, m, false);
/*     */     } else {
/* 525 */       a(☃, cra1, i, m, k, n, m, k, ceh1, m, false);
/* 526 */       a(☃, cra1, random, 0.05F, i + 1, m, k - 1, bup.bM.n().a(cbn.a, gc.c));
/* 527 */       a(☃, cra1, random, 0.05F, i + 1, m, k + 1, bup.bM.n().a(cbn.a, gc.d));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bsr ☃, cra cra1, Random random, float f, int i, int j, int k) {
/* 532 */     if (a(☃, i, j, k, cra1))
/* 533 */       a(☃, cra1, random, f, i, j, k, bup.aQ.n()); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crh$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
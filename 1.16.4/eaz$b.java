/*     */ import java.util.BitSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ {
/* 385 */   private final float[] b = new float[4];
/* 386 */   private final int[] c = new int[4];
/*     */ 
/*     */   
/*     */   public void a(bra ☃, ceh ceh1, fx fx1, gc gc1, float[] arrayOfFloat, BitSet bitSet, boolean bool) {
/*     */     float f5, f6, f7, f8;
/*     */     int n, i1, i2, i3;
/* 392 */     fx fx2 = bitSet.get(0) ? fx1.a(gc1) : fx1;
/* 393 */     eaz.a a = eaz.a.a(gc1);
/*     */     
/* 395 */     fx.a a1 = new fx.a();
/*     */     
/* 397 */     eaz.d d = eaz.c().get();
/*     */     
/* 399 */     a1.a(fx2, eaz.a.a(a)[0]);
/* 400 */     ceh ceh2 = ☃.d_(a1);
/* 401 */     int i = d.a(ceh2, ☃, a1);
/* 402 */     float f1 = d.b(ceh2, ☃, a1);
/*     */     
/* 404 */     a1.a(fx2, eaz.a.a(a)[1]);
/* 405 */     ceh ceh3 = ☃.d_(a1);
/* 406 */     int j = d.a(ceh3, ☃, a1);
/* 407 */     float f2 = d.b(ceh3, ☃, a1);
/*     */     
/* 409 */     a1.a(fx2, eaz.a.a(a)[2]);
/* 410 */     ceh ceh4 = ☃.d_(a1);
/* 411 */     int k = d.a(ceh4, ☃, a1);
/* 412 */     float f3 = d.b(ceh4, ☃, a1);
/*     */     
/* 414 */     a1.a(fx2, eaz.a.a(a)[3]);
/* 415 */     ceh ceh5 = ☃.d_(a1);
/* 416 */     int m = d.a(ceh5, ☃, a1);
/* 417 */     float f4 = d.b(ceh5, ☃, a1);
/*     */     
/* 419 */     a1.a(fx2, eaz.a.a(a)[0]).c(gc1);
/* 420 */     boolean bool1 = (☃.d_(a1).b(☃, a1) == 0);
/* 421 */     a1.a(fx2, eaz.a.a(a)[1]).c(gc1);
/* 422 */     boolean bool2 = (☃.d_(a1).b(☃, a1) == 0);
/* 423 */     a1.a(fx2, eaz.a.a(a)[2]).c(gc1);
/* 424 */     boolean bool3 = (☃.d_(a1).b(☃, a1) == 0);
/* 425 */     a1.a(fx2, eaz.a.a(a)[3]).c(gc1);
/* 426 */     boolean bool4 = (☃.d_(a1).b(☃, a1) == 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 437 */     if (bool3 || bool1) {
/* 438 */       a1.a(fx2, eaz.a.a(a)[0]).c(eaz.a.a(a)[2]);
/* 439 */       ceh ceh7 = ☃.d_(a1);
/* 440 */       f5 = d.b(ceh7, ☃, a1);
/* 441 */       n = d.a(ceh7, ☃, a1);
/*     */     } else {
/* 443 */       f5 = f1;
/* 444 */       n = i;
/*     */     } 
/* 446 */     if (bool4 || bool1) {
/* 447 */       a1.a(fx2, eaz.a.a(a)[0]).c(eaz.a.a(a)[3]);
/* 448 */       ceh ceh7 = ☃.d_(a1);
/* 449 */       f6 = d.b(ceh7, ☃, a1);
/* 450 */       i1 = d.a(ceh7, ☃, a1);
/*     */     } else {
/* 452 */       f6 = f1;
/* 453 */       i1 = i;
/*     */     } 
/* 455 */     if (bool3 || bool2) {
/* 456 */       a1.a(fx2, eaz.a.a(a)[1]).c(eaz.a.a(a)[2]);
/* 457 */       ceh ceh7 = ☃.d_(a1);
/* 458 */       f7 = d.b(ceh7, ☃, a1);
/* 459 */       i2 = d.a(ceh7, ☃, a1);
/*     */     } else {
/* 461 */       f7 = f1;
/* 462 */       i2 = i;
/*     */     } 
/* 464 */     if (bool4 || bool2) {
/* 465 */       a1.a(fx2, eaz.a.a(a)[1]).c(eaz.a.a(a)[3]);
/* 466 */       ceh ceh7 = ☃.d_(a1);
/* 467 */       f8 = d.b(ceh7, ☃, a1);
/* 468 */       i3 = d.a(ceh7, ☃, a1);
/*     */     } else {
/* 470 */       f8 = f1;
/* 471 */       i3 = i;
/*     */     } 
/*     */     
/* 474 */     int i4 = d.a(ceh1, ☃, fx1);
/* 475 */     a1.a(fx1, gc1);
/* 476 */     ceh ceh6 = ☃.d_(a1);
/* 477 */     if (bitSet.get(0) || !ceh6.i(☃, a1)) {
/* 478 */       i4 = d.a(ceh6, ☃, a1);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 483 */     float f9 = bitSet.get(0) ? d.b(☃.d_(fx2), ☃, fx2) : d.b(☃.d_(fx1), ☃, fx1);
/*     */     
/* 485 */     eaz.c c = eaz.c.a(gc1);
/*     */     
/* 487 */     if (!bitSet.get(1) || !eaz.a.b(a)) {
/* 488 */       float f11 = (f4 + f1 + f6 + f9) * 0.25F;
/* 489 */       float f12 = (f3 + f1 + f5 + f9) * 0.25F;
/* 490 */       float f13 = (f3 + f2 + f7 + f9) * 0.25F;
/* 491 */       float f14 = (f4 + f2 + f8 + f9) * 0.25F;
/*     */       
/* 493 */       this.c[eaz.c.a(c)] = a(m, i, i1, i4);
/* 494 */       this.c[eaz.c.b(c)] = a(k, i, n, i4);
/* 495 */       this.c[eaz.c.c(c)] = a(k, j, i2, i4);
/* 496 */       this.c[eaz.c.d(c)] = a(m, j, i3, i4);
/*     */       
/* 498 */       this.b[eaz.c.a(c)] = f11;
/* 499 */       this.b[eaz.c.b(c)] = f12;
/* 500 */       this.b[eaz.c.c(c)] = f13;
/* 501 */       this.b[eaz.c.d(c)] = f14;
/*     */     } else {
/* 503 */       float f11 = (f4 + f1 + f6 + f9) * 0.25F;
/* 504 */       float f12 = (f3 + f1 + f5 + f9) * 0.25F;
/* 505 */       float f13 = (f3 + f2 + f7 + f9) * 0.25F;
/* 506 */       float f14 = (f4 + f2 + f8 + f9) * 0.25F;
/*     */       
/* 508 */       float f15 = arrayOfFloat[eaz.e.a(eaz.a.c(a)[0])] * arrayOfFloat[eaz.e.a(eaz.a.c(a)[1])];
/* 509 */       float f16 = arrayOfFloat[eaz.e.a(eaz.a.c(a)[2])] * arrayOfFloat[eaz.e.a(eaz.a.c(a)[3])];
/* 510 */       float f17 = arrayOfFloat[eaz.e.a(eaz.a.c(a)[4])] * arrayOfFloat[eaz.e.a(eaz.a.c(a)[5])];
/* 511 */       float f18 = arrayOfFloat[eaz.e.a(eaz.a.c(a)[6])] * arrayOfFloat[eaz.e.a(eaz.a.c(a)[7])];
/*     */       
/* 513 */       float f19 = arrayOfFloat[eaz.e.a(eaz.a.d(a)[0])] * arrayOfFloat[eaz.e.a(eaz.a.d(a)[1])];
/* 514 */       float f20 = arrayOfFloat[eaz.e.a(eaz.a.d(a)[2])] * arrayOfFloat[eaz.e.a(eaz.a.d(a)[3])];
/* 515 */       float f21 = arrayOfFloat[eaz.e.a(eaz.a.d(a)[4])] * arrayOfFloat[eaz.e.a(eaz.a.d(a)[5])];
/* 516 */       float f22 = arrayOfFloat[eaz.e.a(eaz.a.d(a)[6])] * arrayOfFloat[eaz.e.a(eaz.a.d(a)[7])];
/*     */       
/* 518 */       float f23 = arrayOfFloat[eaz.e.a(eaz.a.e(a)[0])] * arrayOfFloat[eaz.e.a(eaz.a.e(a)[1])];
/* 519 */       float f24 = arrayOfFloat[eaz.e.a(eaz.a.e(a)[2])] * arrayOfFloat[eaz.e.a(eaz.a.e(a)[3])];
/* 520 */       float f25 = arrayOfFloat[eaz.e.a(eaz.a.e(a)[4])] * arrayOfFloat[eaz.e.a(eaz.a.e(a)[5])];
/* 521 */       float f26 = arrayOfFloat[eaz.e.a(eaz.a.e(a)[6])] * arrayOfFloat[eaz.e.a(eaz.a.e(a)[7])];
/*     */       
/* 523 */       float f27 = arrayOfFloat[eaz.e.a(eaz.a.f(a)[0])] * arrayOfFloat[eaz.e.a(eaz.a.f(a)[1])];
/* 524 */       float f28 = arrayOfFloat[eaz.e.a(eaz.a.f(a)[2])] * arrayOfFloat[eaz.e.a(eaz.a.f(a)[3])];
/* 525 */       float f29 = arrayOfFloat[eaz.e.a(eaz.a.f(a)[4])] * arrayOfFloat[eaz.e.a(eaz.a.f(a)[5])];
/* 526 */       float f30 = arrayOfFloat[eaz.e.a(eaz.a.f(a)[6])] * arrayOfFloat[eaz.e.a(eaz.a.f(a)[7])];
/*     */       
/* 528 */       this.b[eaz.c.a(c)] = f11 * f15 + f12 * f16 + f13 * f17 + f14 * f18;
/* 529 */       this.b[eaz.c.b(c)] = f11 * f19 + f12 * f20 + f13 * f21 + f14 * f22;
/* 530 */       this.b[eaz.c.c(c)] = f11 * f23 + f12 * f24 + f13 * f25 + f14 * f26;
/* 531 */       this.b[eaz.c.d(c)] = f11 * f27 + f12 * f28 + f13 * f29 + f14 * f30;
/*     */       
/* 533 */       int i6 = a(m, i, i1, i4);
/* 534 */       int i7 = a(k, i, n, i4);
/* 535 */       int i8 = a(k, j, i2, i4);
/* 536 */       int i9 = a(m, j, i3, i4);
/*     */       
/* 538 */       this.c[eaz.c.a(c)] = a(i6, i7, i8, i9, f15, f16, f17, f18);
/* 539 */       this.c[eaz.c.b(c)] = a(i6, i7, i8, i9, f19, f20, f21, f22);
/* 540 */       this.c[eaz.c.c(c)] = a(i6, i7, i8, i9, f23, f24, f25, f26);
/* 541 */       this.c[eaz.c.d(c)] = a(i6, i7, i8, i9, f27, f28, f29, f30);
/*     */     } 
/*     */     
/* 544 */     float f10 = ☃.a(gc1, bool);
/* 545 */     for (int i5 = 0; i5 < this.b.length; i5++) {
/* 546 */       this.b[i5] = this.b[i5] * f10;
/*     */     }
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i, int j, int k) {
/* 551 */     if (☃ == 0) {
/* 552 */       ☃ = k;
/*     */     }
/* 554 */     if (i == 0) {
/* 555 */       i = k;
/*     */     }
/* 557 */     if (j == 0) {
/* 558 */       j = k;
/*     */     }
/* 560 */     return ☃ + i + j + k >> 2 & 0xFF00FF;
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i, int j, int k, float f1, float f2, float f3, float f4) {
/* 564 */     int m = (int)((☃ >> 16 & 0xFF) * f1 + (i >> 16 & 0xFF) * f2 + (j >> 16 & 0xFF) * f3 + (k >> 16 & 0xFF) * f4) & 0xFF;
/* 565 */     int n = (int)((☃ & 0xFF) * f1 + (i & 0xFF) * f2 + (j & 0xFF) * f3 + (k & 0xFF) * f4) & 0xFF;
/* 566 */     return m << 16 | n;
/*     */   }
/*     */   
/*     */   public b(eaz parameaz) {}
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eaz$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
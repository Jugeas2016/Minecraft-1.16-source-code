/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class crh
/*     */ {
/*     */   static abstract class c
/*     */     extends cru
/*     */   {
/*     */     protected ckb.b a;
/*     */     
/*     */     public c(clb ☃, int i, ckb.b b1) {
/*  47 */       super(☃, i);
/*  48 */       this.a = b1;
/*     */     }
/*     */     
/*     */     public c(clb ☃, md md1) {
/*  52 */       super(☃, md1);
/*  53 */       this.a = ckb.b.a(md1.h("MST"));
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(md ☃) {
/*  58 */       ☃.b("MST", this.a.ordinal());
/*     */     }
/*     */     
/*     */     protected ceh a() {
/*  62 */       switch (crh.null.a[this.a.ordinal()])
/*     */       
/*     */       { default:
/*  65 */           return bup.n.n();
/*     */         case 2:
/*  67 */           break; }  return bup.s.n();
/*     */     }
/*     */ 
/*     */     
/*     */     protected ceh b() {
/*  72 */       switch (crh.null.a[this.a.ordinal()])
/*     */       
/*     */       { default:
/*  75 */           return bup.cJ.n();
/*     */         case 2:
/*  77 */           break; }  return bup.iq.n();
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(brc ☃, cra cra1, int i, int j, int k, int m) {
/*  82 */       for (int n = i; n <= j; n++) {
/*  83 */         if (a(☃, n, k + 1, m, cra1).g()) {
/*  84 */           return false;
/*     */         }
/*     */       } 
/*  87 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   private static c a(List<cru> ☃, Random random, int i, int j, int k, @Nullable gc gc1, int m, ckb.b b1) {
/*  92 */     int n = random.nextInt(100);
/*  93 */     if (n >= 80) {
/*  94 */       cra cra = b.a(☃, random, i, j, k, gc1);
/*  95 */       if (cra != null) {
/*  96 */         return new b(m, cra, gc1, b1);
/*     */       }
/*  98 */     } else if (n >= 70) {
/*  99 */       cra cra = e.a(☃, random, i, j, k, gc1);
/* 100 */       if (cra != null) {
/* 101 */         return new e(m, cra, gc1, b1);
/*     */       }
/*     */     } else {
/* 104 */       cra cra = a.a(☃, random, i, j, k, gc1);
/* 105 */       if (cra != null) {
/* 106 */         return new a(m, random, cra, gc1, b1);
/*     */       }
/*     */     } 
/*     */     
/* 110 */     return null;
/*     */   }
/*     */   
/*     */   private static c b(cru ☃, List<cru> list, Random random, int i, int j, int k, gc gc1, int m) {
/* 114 */     if (m > 8) {
/* 115 */       return null;
/*     */     }
/* 117 */     if (Math.abs(i - (☃.g()).a) > 80 || Math.abs(k - (☃.g()).c) > 80) {
/* 118 */       return null;
/*     */     }
/*     */     
/* 121 */     ckb.b b = ((c)☃).a;
/* 122 */     c c = a(list, random, i, j, k, gc1, m + 1, b);
/* 123 */     if (c != null) {
/* 124 */       list.add(c);
/* 125 */       c.a(☃, list, random);
/*     */     } 
/* 127 */     return c;
/*     */   }
/*     */   
/*     */   public static class d extends c {
/* 131 */     private final List<cra> b = Lists.newLinkedList();
/*     */     
/*     */     public d(int ☃, Random random, int i, int j, ckb.b b1) {
/* 134 */       super(clb.c, ☃, b1);
/* 135 */       this.a = b1;
/*     */       
/* 137 */       this.n = new cra(i, 50, j, i + 7 + random.nextInt(6), 54 + random.nextInt(6), j + 7 + random.nextInt(6));
/*     */     }
/*     */     
/*     */     public d(csw ☃, md md1) {
/* 141 */       super(clb.c, md1);
/* 142 */       mj mj = md1.d("Entrances", 11);
/* 143 */       for (int i = 0; i < mj.size(); i++) {
/* 144 */         this.b.add(new cra(mj.f(i)));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(cru ☃, List<cru> list, Random random) {
/* 150 */       int i = h();
/*     */ 
/*     */ 
/*     */       
/* 154 */       int k = this.n.e() - 3 - 1;
/* 155 */       if (k <= 0) {
/* 156 */         k = 1;
/*     */       }
/*     */ 
/*     */       
/* 160 */       int j = 0;
/* 161 */       while (j < this.n.d()) {
/* 162 */         j += random.nextInt(this.n.d());
/* 163 */         if (j + 3 > this.n.d()) {
/*     */           break;
/*     */         }
/* 166 */         crh.c c1 = crh.a(☃, list, random, this.n.a + j, this.n.b + random.nextInt(k) + 1, this.n.c - 1, gc.c, i);
/* 167 */         if (c1 != null) {
/* 168 */           cra cra = c1.g();
/* 169 */           this.b.add(new cra(cra.a, cra.b, this.n.c, cra.d, cra.e, this.n.c + 1));
/*     */         } 
/* 171 */         j += 4;
/*     */       } 
/*     */       
/* 174 */       j = 0;
/* 175 */       while (j < this.n.d()) {
/* 176 */         j += random.nextInt(this.n.d());
/* 177 */         if (j + 3 > this.n.d()) {
/*     */           break;
/*     */         }
/* 180 */         crh.c c1 = crh.a(☃, list, random, this.n.a + j, this.n.b + random.nextInt(k) + 1, this.n.f + 1, gc.d, i);
/* 181 */         if (c1 != null) {
/* 182 */           cra cra = c1.g();
/* 183 */           this.b.add(new cra(cra.a, cra.b, this.n.f - 1, cra.d, cra.e, this.n.f));
/*     */         } 
/* 185 */         j += 4;
/*     */       } 
/*     */       
/* 188 */       j = 0;
/* 189 */       while (j < this.n.f()) {
/* 190 */         j += random.nextInt(this.n.f());
/* 191 */         if (j + 3 > this.n.f()) {
/*     */           break;
/*     */         }
/* 194 */         crh.c c1 = crh.a(☃, list, random, this.n.a - 1, this.n.b + random.nextInt(k) + 1, this.n.c + j, gc.e, i);
/* 195 */         if (c1 != null) {
/* 196 */           cra cra = c1.g();
/* 197 */           this.b.add(new cra(this.n.a, cra.b, cra.c, this.n.a + 1, cra.e, cra.f));
/*     */         } 
/* 199 */         j += 4;
/*     */       } 
/*     */       
/* 202 */       j = 0;
/* 203 */       while (j < this.n.f()) {
/* 204 */         j += random.nextInt(this.n.f());
/* 205 */         if (j + 3 > this.n.f()) {
/*     */           break;
/*     */         }
/* 208 */         cru cru1 = crh.a(☃, list, random, this.n.d + 1, this.n.b + random.nextInt(k) + 1, this.n.c + j, gc.f, i);
/* 209 */         if (cru1 != null) {
/* 210 */           cra cra = cru1.g();
/* 211 */           this.b.add(new cra(this.n.d - 1, cra.b, cra.c, this.n.d, cra.e, cra.f));
/*     */         } 
/* 213 */         j += 4;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 219 */       if (a(☃, cra1)) {
/* 220 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 224 */       a(☃, cra1, this.n.a, this.n.b, this.n.c, this.n.d, this.n.b, this.n.f, bup.j.n(), m, true);
/*     */ 
/*     */       
/* 227 */       a(☃, cra1, this.n.a, this.n.b + 1, this.n.c, this.n.d, Math.min(this.n.b + 3, this.n.e), this.n.f, m, m, false);
/* 228 */       for (cra cra2 : this.b) {
/* 229 */         a(☃, cra1, cra2.a, cra2.e - 2, cra2.c, cra2.d, cra2.e, cra2.f, m, m, false);
/*     */       }
/* 231 */       a(☃, cra1, this.n.a, this.n.b + 4, this.n.c, this.n.d, this.n.e, this.n.f, m, false);
/*     */       
/* 233 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃, int i, int j) {
/* 238 */       super.a(☃, i, j);
/* 239 */       for (cra cra : this.b) {
/* 240 */         cra.a(☃, i, j);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(md ☃) {
/* 246 */       super.a(☃);
/* 247 */       mj mj = new mj();
/* 248 */       for (cra cra : this.b) {
/* 249 */         mj.add(cra.h());
/*     */       }
/* 251 */       ☃.a("Entrances", mj);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a extends c {
/*     */     private final boolean b;
/*     */     private final boolean c;
/*     */     private boolean d;
/*     */     private final int e;
/*     */     
/*     */     public a(csw ☃, md md1) {
/* 262 */       super(clb.a, md1);
/*     */       
/* 264 */       this.b = md1.q("hr");
/* 265 */       this.c = md1.q("sc");
/* 266 */       this.d = md1.q("hps");
/* 267 */       this.e = md1.h("Num");
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(md ☃) {
/* 272 */       super.a(☃);
/* 273 */       ☃.a("hr", this.b);
/* 274 */       ☃.a("sc", this.c);
/* 275 */       ☃.a("hps", this.d);
/* 276 */       ☃.b("Num", this.e);
/*     */     }
/*     */     
/*     */     public a(int ☃, Random random, cra cra1, gc gc1, ckb.b b1) {
/* 280 */       super(clb.a, ☃, b1);
/* 281 */       a(gc1);
/* 282 */       this.n = cra1;
/* 283 */       this.b = (random.nextInt(3) == 0);
/* 284 */       this.c = (!this.b && random.nextInt(23) == 0);
/*     */       
/* 286 */       if (i().n() == gc.a.c) {
/* 287 */         this.e = cra1.f() / 5;
/*     */       } else {
/* 289 */         this.e = cra1.d() / 5;
/*     */       } 
/*     */     }
/*     */     
/*     */     public static cra a(List<cru> ☃, Random random, int i, int j, int k, gc gc1) {
/* 294 */       cra cra = new cra(i, j, k, i, j + 3 - 1, k);
/*     */       
/* 296 */       int m = random.nextInt(3) + 2;
/* 297 */       while (m > 0) {
/* 298 */         int n = m * 5;
/*     */         
/* 300 */         switch (crh.null.b[gc1.ordinal()]) {
/*     */           
/*     */           default:
/* 303 */             cra.d = i + 3 - 1;
/* 304 */             cra.c = k - n - 1;
/*     */             break;
/*     */           case 2:
/* 307 */             cra.d = i + 3 - 1;
/* 308 */             cra.f = k + n - 1;
/*     */             break;
/*     */           case 3:
/* 311 */             cra.a = i - n - 1;
/* 312 */             cra.f = k + 3 - 1;
/*     */             break;
/*     */           case 4:
/* 315 */             cra.d = i + n - 1;
/* 316 */             cra.f = k + 3 - 1;
/*     */             break;
/*     */         } 
/*     */         
/* 320 */         if (cru.a(☃, cra) != null) {
/* 321 */           m--;
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 327 */       if (m > 0) {
/* 328 */         return cra;
/*     */       }
/*     */       
/* 331 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(cru ☃, List<cru> list, Random random) {
/* 336 */       int i = h();
/* 337 */       int j = random.nextInt(4);
/* 338 */       gc gc = i();
/* 339 */       if (gc != null) {
/* 340 */         switch (crh.null.b[gc.ordinal()]) {
/*     */           
/*     */           default:
/* 343 */             if (j <= 1) {
/* 344 */               crh.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.c - 1, gc, i); break;
/* 345 */             }  if (j == 2) {
/* 346 */               crh.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.c, gc.e, i); break;
/*     */             } 
/* 348 */             crh.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.c, gc.f, i);
/*     */             break;
/*     */           
/*     */           case 2:
/* 352 */             if (j <= 1) {
/* 353 */               crh.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.f + 1, gc, i); break;
/* 354 */             }  if (j == 2) {
/* 355 */               crh.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.f - 3, gc.e, i); break;
/*     */             } 
/* 357 */             crh.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.f - 3, gc.f, i);
/*     */             break;
/*     */           
/*     */           case 3:
/* 361 */             if (j <= 1) {
/* 362 */               crh.a(☃, list, random, this.n.a - 1, this.n.b - 1 + random.nextInt(3), this.n.c, gc, i); break;
/* 363 */             }  if (j == 2) {
/* 364 */               crh.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.c - 1, gc.c, i); break;
/*     */             } 
/* 366 */             crh.a(☃, list, random, this.n.a, this.n.b - 1 + random.nextInt(3), this.n.f + 1, gc.d, i);
/*     */             break;
/*     */           
/*     */           case 4:
/* 370 */             if (j <= 1) {
/* 371 */               crh.a(☃, list, random, this.n.d + 1, this.n.b - 1 + random.nextInt(3), this.n.c, gc, i); break;
/* 372 */             }  if (j == 2) {
/* 373 */               crh.a(☃, list, random, this.n.d - 3, this.n.b - 1 + random.nextInt(3), this.n.c - 1, gc.c, i); break;
/*     */             } 
/* 375 */             crh.a(☃, list, random, this.n.d - 3, this.n.b - 1 + random.nextInt(3), this.n.f + 1, gc.d, i);
/*     */             break;
/*     */         } 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 382 */       if (i < 8) {
/* 383 */         if (gc == gc.c || gc == gc.d) {
/* 384 */           for (int k = this.n.c + 3; k + 3 <= this.n.f; k += 5) {
/* 385 */             int m = random.nextInt(5);
/* 386 */             if (m == 0) {
/* 387 */               crh.a(☃, list, random, this.n.a - 1, this.n.b, k, gc.e, i + 1);
/* 388 */             } else if (m == 1) {
/* 389 */               crh.a(☃, list, random, this.n.d + 1, this.n.b, k, gc.f, i + 1);
/*     */             } 
/*     */           } 
/*     */         } else {
/* 393 */           for (int k = this.n.a + 3; k + 3 <= this.n.d; k += 5) {
/* 394 */             int m = random.nextInt(5);
/* 395 */             if (m == 0) {
/* 396 */               crh.a(☃, list, random, k, this.n.b, this.n.c - 1, gc.c, i + 1);
/* 397 */             } else if (m == 1) {
/* 398 */               crh.a(☃, list, random, k, this.n.b, this.n.f + 1, gc.d, i + 1);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a(bsr ☃, cra cra1, Random random, int i, int j, int k, vk vk1) {
/* 407 */       fx fx = new fx(a(i, k), d(j), b(i, k));
/* 408 */       if (cra1.b(fx) && 
/* 409 */         ☃.d_(fx).g() && !☃.d_(fx.c()).g()) {
/* 410 */         ceh ceh = bup.ch.n().a(bza.c, random.nextBoolean() ? cfk.a : cfk.b);
/* 411 */         a(☃, ceh, i, j, k, cra1);
/* 412 */         bhq bhq = new bhq(☃.E(), fx.u() + 0.5D, fx.v() + 0.5D, fx.w() + 0.5D);
/* 413 */         bhq.a(vk1, random.nextLong());
/* 414 */         ☃.c(bhq);
/* 415 */         return true;
/*     */       } 
/*     */ 
/*     */       
/* 419 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 424 */       if (a(☃, cra1)) {
/* 425 */         return false;
/*     */       }
/*     */       
/* 428 */       int i = 0;
/* 429 */       int j = 2;
/* 430 */       int k = 0;
/* 431 */       int m = 2;
/* 432 */       int n = this.e * 5 - 1;
/*     */       
/* 434 */       ceh ceh = a();
/*     */ 
/*     */       
/* 437 */       a(☃, cra1, 0, 0, 0, 2, 1, n, m, m, false);
/* 438 */       a(☃, cra1, random, 0.8F, 0, 2, 0, 2, 2, n, m, m, false, false);
/*     */       
/* 440 */       if (this.c) {
/* 441 */         a(☃, cra1, random, 0.6F, 0, 0, 0, 2, 1, n, bup.aQ.n(), m, false, true);
/*     */       }
/*     */       
/*     */       int i1;
/* 445 */       for (i1 = 0; i1 < this.e; i1++) {
/* 446 */         int i2 = 2 + i1 * 5;
/*     */         
/* 448 */         a(☃, cra1, 0, 0, i2, 2, 2, random);
/*     */         
/* 450 */         a(☃, cra1, random, 0.1F, 0, 2, i2 - 1);
/* 451 */         a(☃, cra1, random, 0.1F, 2, 2, i2 - 1);
/* 452 */         a(☃, cra1, random, 0.1F, 0, 2, i2 + 1);
/* 453 */         a(☃, cra1, random, 0.1F, 2, 2, i2 + 1);
/* 454 */         a(☃, cra1, random, 0.05F, 0, 2, i2 - 2);
/* 455 */         a(☃, cra1, random, 0.05F, 2, 2, i2 - 2);
/* 456 */         a(☃, cra1, random, 0.05F, 0, 2, i2 + 2);
/* 457 */         a(☃, cra1, random, 0.05F, 2, 2, i2 + 2);
/*     */         
/* 459 */         if (random.nextInt(100) == 0) {
/* 460 */           a(☃, cra1, random, 2, 0, i2 - 1, cyq.u);
/*     */         }
/* 462 */         if (random.nextInt(100) == 0) {
/* 463 */           a(☃, cra1, random, 0, 0, i2 + 1, cyq.u);
/*     */         }
/* 465 */         if (this.c && !this.d) {
/* 466 */           int i3 = d(0);
/* 467 */           int i4 = i2 - 1 + random.nextInt(3);
/* 468 */           int i5 = a(1, i4);
/* 469 */           int i6 = b(1, i4);
/* 470 */           fx fx2 = new fx(i5, i3, i6);
/*     */           
/* 472 */           if (cra1.b(fx2) && a(☃, 1, 0, i4, cra1)) {
/* 473 */             this.d = true;
/* 474 */             ☃.a(fx2, bup.bP.n(), 2);
/*     */             
/* 476 */             ccj ccj = ☃.c(fx2);
/* 477 */             if (ccj instanceof cdi) {
/* 478 */               ((cdi)ccj).d().a(aqe.i);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 485 */       for (i1 = 0; i1 <= 2; i1++) {
/* 486 */         for (int i2 = 0; i2 <= n; i2++) {
/* 487 */           int i3 = -1;
/* 488 */           ceh ceh1 = a(☃, i1, -1, i2, cra1);
/* 489 */           if (ceh1.g() && a(☃, i1, -1, i2, cra1)) {
/* 490 */             int i4 = -1;
/* 491 */             a(☃, ceh, i1, -1, i2, cra1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 496 */       if (this.b) {
/* 497 */         ceh ceh1 = bup.ch.n().a(bza.c, cfk.a);
/* 498 */         for (int i2 = 0; i2 <= n; i2++) {
/* 499 */           ceh ceh2 = a(☃, 1, -1, i2, cra1);
/* 500 */           if (!ceh2.g() && ceh2.i(☃, new fx(a(1, i2), d(-1), b(1, i2)))) {
/* 501 */             float f = a(☃, 1, 0, i2, cra1) ? 0.7F : 0.9F;
/* 502 */             a(☃, cra1, random, f, 1, 0, i2, ceh1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 507 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     private void a(bsr ☃, cra cra1, int i, int j, int k, int m, int n, Random random) {
/* 512 */       if (!a(☃, cra1, i, n, m, k)) {
/*     */         return;
/*     */       }
/*     */       
/* 516 */       ceh ceh1 = a();
/* 517 */       ceh ceh2 = b();
/*     */       
/* 519 */       a(☃, cra1, i, j, k, i, m - 1, k, ceh2.a(bwq.d, Boolean.valueOf(true)), m, false);
/* 520 */       a(☃, cra1, n, j, k, n, m - 1, k, ceh2.a(bwq.b, Boolean.valueOf(true)), m, false);
/* 521 */       if (random.nextInt(4) == 0) {
/* 522 */         a(☃, cra1, i, m, k, i, m, k, ceh1, m, false);
/* 523 */         a(☃, cra1, n, m, k, n, m, k, ceh1, m, false);
/*     */       } else {
/* 525 */         a(☃, cra1, i, m, k, n, m, k, ceh1, m, false);
/* 526 */         a(☃, cra1, random, 0.05F, i + 1, m, k - 1, bup.bM.n().a(cbn.a, gc.c));
/* 527 */         a(☃, cra1, random, 0.05F, i + 1, m, k + 1, bup.bM.n().a(cbn.a, gc.d));
/*     */       } 
/*     */     }
/*     */     
/*     */     private void a(bsr ☃, cra cra1, Random random, float f, int i, int j, int k) {
/* 532 */       if (a(☃, i, j, k, cra1))
/* 533 */         a(☃, cra1, random, f, i, j, k, bup.aQ.n()); 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends c {
/*     */     private final gc b;
/*     */     private final boolean c;
/*     */     
/*     */     public b(csw ☃, md md1) {
/* 543 */       super(clb.b, md1);
/* 544 */       this.c = md1.q("tf");
/* 545 */       this.b = gc.b(md1.h("D"));
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(md ☃) {
/* 550 */       super.a(☃);
/* 551 */       ☃.a("tf", this.c);
/* 552 */       ☃.b("D", this.b.d());
/*     */     }
/*     */     
/*     */     public b(int ☃, cra cra1, @Nullable gc gc1, ckb.b b1) {
/* 556 */       super(clb.b, ☃, b1);
/*     */       
/* 558 */       this.b = gc1;
/* 559 */       this.n = cra1;
/* 560 */       this.c = (cra1.e() > 3);
/*     */     }
/*     */     
/*     */     public static cra a(List<cru> ☃, Random random, int i, int j, int k, gc gc1) {
/* 564 */       cra cra = new cra(i, j, k, i, j + 3 - 1, k);
/*     */       
/* 566 */       if (random.nextInt(4) == 0) {
/* 567 */         cra.e += 4;
/*     */       }
/*     */       
/* 570 */       switch (crh.null.b[gc1.ordinal()]) {
/*     */         
/*     */         default:
/* 573 */           cra.a = i - 1;
/* 574 */           cra.d = i + 3;
/* 575 */           cra.c = k - 4;
/*     */           break;
/*     */         case 2:
/* 578 */           cra.a = i - 1;
/* 579 */           cra.d = i + 3;
/* 580 */           cra.f = k + 3 + 1;
/*     */           break;
/*     */         case 3:
/* 583 */           cra.a = i - 4;
/* 584 */           cra.c = k - 1;
/* 585 */           cra.f = k + 3;
/*     */           break;
/*     */         case 4:
/* 588 */           cra.d = i + 3 + 1;
/* 589 */           cra.c = k - 1;
/* 590 */           cra.f = k + 3;
/*     */           break;
/*     */       } 
/*     */       
/* 594 */       if (cru.a(☃, cra) != null) {
/* 595 */         return null;
/*     */       }
/*     */       
/* 598 */       return cra;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(cru ☃, List<cru> list, Random random) {
/* 603 */       int i = h();
/*     */ 
/*     */       
/* 606 */       switch (crh.null.b[this.b.ordinal()]) {
/*     */         
/*     */         default:
/* 609 */           crh.a(☃, list, random, this.n.a + 1, this.n.b, this.n.c - 1, gc.c, i);
/* 610 */           crh.a(☃, list, random, this.n.a - 1, this.n.b, this.n.c + 1, gc.e, i);
/* 611 */           crh.a(☃, list, random, this.n.d + 1, this.n.b, this.n.c + 1, gc.f, i);
/*     */           break;
/*     */         case 2:
/* 614 */           crh.a(☃, list, random, this.n.a + 1, this.n.b, this.n.f + 1, gc.d, i);
/* 615 */           crh.a(☃, list, random, this.n.a - 1, this.n.b, this.n.c + 1, gc.e, i);
/* 616 */           crh.a(☃, list, random, this.n.d + 1, this.n.b, this.n.c + 1, gc.f, i);
/*     */           break;
/*     */         case 3:
/* 619 */           crh.a(☃, list, random, this.n.a + 1, this.n.b, this.n.c - 1, gc.c, i);
/* 620 */           crh.a(☃, list, random, this.n.a + 1, this.n.b, this.n.f + 1, gc.d, i);
/* 621 */           crh.a(☃, list, random, this.n.a - 1, this.n.b, this.n.c + 1, gc.e, i);
/*     */           break;
/*     */         case 4:
/* 624 */           crh.a(☃, list, random, this.n.a + 1, this.n.b, this.n.c - 1, gc.c, i);
/* 625 */           crh.a(☃, list, random, this.n.a + 1, this.n.b, this.n.f + 1, gc.d, i);
/* 626 */           crh.a(☃, list, random, this.n.d + 1, this.n.b, this.n.c + 1, gc.f, i);
/*     */           break;
/*     */       } 
/*     */       
/* 630 */       if (this.c) {
/* 631 */         if (random.nextBoolean()) {
/* 632 */           crh.a(☃, list, random, this.n.a + 1, this.n.b + 3 + 1, this.n.c - 1, gc.c, i);
/*     */         }
/* 634 */         if (random.nextBoolean()) {
/* 635 */           crh.a(☃, list, random, this.n.a - 1, this.n.b + 3 + 1, this.n.c + 1, gc.e, i);
/*     */         }
/* 637 */         if (random.nextBoolean()) {
/* 638 */           crh.a(☃, list, random, this.n.d + 1, this.n.b + 3 + 1, this.n.c + 1, gc.f, i);
/*     */         }
/* 640 */         if (random.nextBoolean()) {
/* 641 */           crh.a(☃, list, random, this.n.a + 1, this.n.b + 3 + 1, this.n.f + 1, gc.d, i);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 648 */       if (a(☃, cra1)) {
/* 649 */         return false;
/*     */       }
/*     */       
/* 652 */       ceh ceh = a();
/*     */ 
/*     */       
/* 655 */       if (this.c) {
/* 656 */         a(☃, cra1, this.n.a + 1, this.n.b, this.n.c, this.n.d - 1, this.n.b + 3 - 1, this.n.f, m, m, false);
/* 657 */         a(☃, cra1, this.n.a, this.n.b, this.n.c + 1, this.n.d, this.n.b + 3 - 1, this.n.f - 1, m, m, false);
/* 658 */         a(☃, cra1, this.n.a + 1, this.n.e - 2, this.n.c, this.n.d - 1, this.n.e, this.n.f, m, m, false);
/* 659 */         a(☃, cra1, this.n.a, this.n.e - 2, this.n.c + 1, this.n.d, this.n.e, this.n.f - 1, m, m, false);
/* 660 */         a(☃, cra1, this.n.a + 1, this.n.b + 3, this.n.c + 1, this.n.d - 1, this.n.b + 3, this.n.f - 1, m, m, false);
/*     */       } else {
/* 662 */         a(☃, cra1, this.n.a + 1, this.n.b, this.n.c, this.n.d - 1, this.n.e, this.n.f, m, m, false);
/* 663 */         a(☃, cra1, this.n.a, this.n.b, this.n.c + 1, this.n.d, this.n.e, this.n.f - 1, m, m, false);
/*     */       } 
/*     */ 
/*     */       
/* 667 */       a(☃, cra1, this.n.a + 1, this.n.b, this.n.c + 1, this.n.e);
/* 668 */       a(☃, cra1, this.n.a + 1, this.n.b, this.n.f - 1, this.n.e);
/* 669 */       a(☃, cra1, this.n.d - 1, this.n.b, this.n.c + 1, this.n.e);
/* 670 */       a(☃, cra1, this.n.d - 1, this.n.b, this.n.f - 1, this.n.e);
/*     */ 
/*     */ 
/*     */       
/* 674 */       for (int i = this.n.a; i <= this.n.d; i++) {
/* 675 */         for (int j = this.n.c; j <= this.n.f; j++) {
/* 676 */           if (a(☃, i, this.n.b - 1, j, cra1).g() && a(☃, i, this.n.b - 1, j, cra1)) {
/* 677 */             a(☃, ceh, i, this.n.b - 1, j, cra1);
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 682 */       return true;
/*     */     }
/*     */     
/*     */     private void a(bsr ☃, cra cra1, int i, int j, int k, int m) {
/* 686 */       if (!a(☃, i, m + 1, k, cra1).g())
/* 687 */         a(☃, cra1, i, j, k, i, m, k, a(), m, false); 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class e
/*     */     extends c {
/*     */     public e(int ☃, cra cra1, gc gc1, ckb.b b1) {
/* 694 */       super(clb.d, ☃, b1);
/* 695 */       a(gc1);
/* 696 */       this.n = cra1;
/*     */     }
/*     */     
/*     */     public e(csw ☃, md md1) {
/* 700 */       super(clb.d, md1);
/*     */     }
/*     */ 
/*     */     
/*     */     public static cra a(List<cru> ☃, Random random, int i, int j, int k, gc gc1) {
/* 705 */       cra cra = new cra(i, j - 5, k, i, j + 3 - 1, k);
/*     */       
/* 707 */       switch (crh.null.b[gc1.ordinal()]) {
/*     */         
/*     */         default:
/* 710 */           cra.d = i + 3 - 1;
/* 711 */           cra.c = k - 8;
/*     */           break;
/*     */         case 2:
/* 714 */           cra.d = i + 3 - 1;
/* 715 */           cra.f = k + 8;
/*     */           break;
/*     */         case 3:
/* 718 */           cra.a = i - 8;
/* 719 */           cra.f = k + 3 - 1;
/*     */           break;
/*     */         case 4:
/* 722 */           cra.d = i + 8;
/* 723 */           cra.f = k + 3 - 1;
/*     */           break;
/*     */       } 
/*     */       
/* 727 */       if (cru.a(☃, cra) != null) {
/* 728 */         return null;
/*     */       }
/*     */       
/* 731 */       return cra;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(cru ☃, List<cru> list, Random random) {
/* 736 */       int i = h();
/*     */ 
/*     */       
/* 739 */       gc gc = i();
/* 740 */       if (gc != null) {
/* 741 */         switch (crh.null.b[gc.ordinal()]) {
/*     */           
/*     */           default:
/* 744 */             crh.a(☃, list, random, this.n.a, this.n.b, this.n.c - 1, gc.c, i);
/*     */             return;
/*     */           case 2:
/* 747 */             crh.a(☃, list, random, this.n.a, this.n.b, this.n.f + 1, gc.d, i);
/*     */             return;
/*     */           case 3:
/* 750 */             crh.a(☃, list, random, this.n.a - 1, this.n.b, this.n.c, gc.e, i); return;
/*     */           case 4:
/*     */             break;
/* 753 */         }  crh.a(☃, list, random, this.n.d + 1, this.n.b, this.n.c, gc.f, i);
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 761 */       if (a(☃, cra1)) {
/* 762 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 766 */       a(☃, cra1, 0, 5, 0, 2, 7, 1, m, m, false);
/*     */       
/* 768 */       a(☃, cra1, 0, 0, 7, 2, 2, 8, m, m, false);
/*     */       
/* 770 */       for (int i = 0; i < 5; i++) {
/* 771 */         a(☃, cra1, 0, 5 - i - ((i < 4) ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, m, m, false);
/*     */       }
/*     */       
/* 774 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ public abstract class bic
/*     */ {
/*  35 */   private final gj<bmb> c = gj.a();
/*  36 */   public final List<bjr> a = Lists.newArrayList();
/*  37 */   private final List<biq> d = Lists.newArrayList();
/*     */   
/*     */   @Nullable
/*     */   private final bje<?> e;
/*     */   
/*     */   public final int b;
/*     */   private short f;
/*  44 */   private int g = -1;
/*     */   private int h;
/*  46 */   private final Set<bjr> i = Sets.newHashSet();
/*     */   
/*  48 */   private final List<bin> j = Lists.newArrayList();
/*     */ 
/*     */   
/*     */   private final Set<bfw> k;
/*     */ 
/*     */ 
/*     */   
/*     */   protected static boolean a(bim ☃, bfw bfw1, buo buo1) {
/*  56 */     return ((Boolean)☃.<Boolean>a((brx1, fx1) -> !brx1.d_(fx1).a(☃) ? Boolean.valueOf(false) : Boolean.valueOf((bfw1.h(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D) <= 64.0D)), 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  61 */         Boolean.valueOf(true))).booleanValue();
/*     */   }
/*     */   
/*     */   public bje<?> a() {
/*  65 */     if (this.e == null) {
/*  66 */       throw new UnsupportedOperationException("Unable to construct this menu by type");
/*     */     }
/*  68 */     return this.e;
/*     */   }
/*     */   
/*     */   protected static void a(aon ☃, int i) {
/*  72 */     int j = ☃.Z_();
/*  73 */     if (j < i) {
/*  74 */       throw new IllegalArgumentException("Container size " + j + " is smaller than expected " + i);
/*     */     }
/*     */   }
/*     */   
/*     */   protected static void a(bil ☃, int i) {
/*  79 */     int j = ☃.a();
/*  80 */     if (j < i) {
/*  81 */       throw new IllegalArgumentException("Container data count " + j + " is smaller than expected " + i);
/*     */     }
/*     */   }
/*     */   
/*     */   protected bjr a(bjr ☃) {
/*  86 */     ☃.d = this.a.size();
/*  87 */     this.a.add(☃);
/*  88 */     this.c.add(bmb.b);
/*  89 */     return ☃;
/*     */   }
/*     */   
/*     */   protected biq a(biq ☃) {
/*  93 */     this.d.add(☃);
/*  94 */     return ☃;
/*     */   }
/*     */   
/*     */   protected void a(bil ☃) {
/*  98 */     for (int i = 0; i < ☃.a(); i++) {
/*  99 */       a(biq.a(☃, i));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bin ☃) {
/* 104 */     if (this.j.contains(☃)) {
/*     */       return;
/*     */     }
/* 107 */     this.j.add(☃);
/*     */     
/* 109 */     ☃.a(this, b());
/* 110 */     c();
/*     */   }
/*     */   
/*     */   public void b(bin ☃) {
/* 114 */     this.j.remove(☃);
/*     */   }
/*     */   
/*     */   public gj<bmb> b() {
/* 118 */     gj<bmb> ☃ = gj.a();
/* 119 */     for (int i = 0; i < this.a.size(); i++) {
/* 120 */       ☃.add(((bjr)this.a.get(i)).e());
/*     */     }
/* 122 */     return ☃;
/*     */   }
/*     */   public void c() {
/*     */     int ☃;
/* 126 */     for (☃ = 0; ☃ < this.a.size(); ☃++) {
/* 127 */       bmb bmb1 = ((bjr)this.a.get(☃)).e();
/* 128 */       bmb bmb2 = this.c.get(☃);
/* 129 */       if (!bmb.b(bmb2, bmb1)) {
/* 130 */         bmb bmb = bmb1.i();
/* 131 */         this.c.set(☃, bmb);
/* 132 */         for (bin bin : this.j) {
/* 133 */           bin.a(this, ☃, bmb);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 138 */     for (☃ = 0; ☃ < this.d.size(); ☃++) {
/* 139 */       biq biq = this.d.get(☃);
/* 140 */       if (biq.c()) {
/* 141 */         for (bin bin : this.j) {
/* 142 */           bin.a(this, ☃, biq.b());
/*     */         }
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(bfw ☃, int i) {
/* 149 */     return false;
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
/*     */   public bjr a(int ☃) {
/* 164 */     return this.a.get(☃);
/*     */   }
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 168 */     bjr bjr = this.a.get(i);
/* 169 */     if (bjr != null) {
/* 170 */       return bjr.e();
/*     */     }
/* 172 */     return bmb.b;
/*     */   }
/*     */   
/*     */   public bmb a(int ☃, int i, bik bik1, bfw bfw1) {
/*     */     try {
/* 177 */       return b(☃, i, bik1, bfw1);
/* 178 */     } catch (Exception exception) {
/* 179 */       l l = l.a(exception, "Container click");
/* 180 */       m m = l.a("Click info");
/* 181 */       m.a("Menu Type", () -> (this.e != null) ? gm.ac.b(this.e).toString() : "<no type>");
/* 182 */       m.a("Menu Class", () -> getClass().getCanonicalName());
/* 183 */       m.a("Slot Count", Integer.valueOf(this.a.size()));
/* 184 */       m.a("Slot", Integer.valueOf(☃));
/* 185 */       m.a("Button", Integer.valueOf(i));
/* 186 */       m.a("Type", bik1);
/* 187 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private bmb b(int ☃, int i, bik bik1, bfw bfw1) {
/* 193 */     bmb bmb = bmb.b;
/* 194 */     bfv bfv = bfw1.bm;
/*     */     
/* 196 */     if (bik1 == bik.f) {
/* 197 */       int j = this.h;
/* 198 */       this.h = c(i);
/*     */       
/* 200 */       if ((j != 1 || this.h != 2) && j != this.h) {
/* 201 */         d();
/* 202 */       } else if (bfv.m().a()) {
/* 203 */         d();
/* 204 */       } else if (this.h == 0) {
/* 205 */         this.g = b(i);
/*     */         
/* 207 */         if (a(this.g, bfw1)) {
/* 208 */           this.h = 1;
/* 209 */           this.i.clear();
/*     */         } else {
/* 211 */           d();
/*     */         } 
/* 213 */       } else if (this.h == 1) {
/* 214 */         bjr bjr = this.a.get(☃);
/*     */         
/* 216 */         bmb bmb1 = bfv.m();
/* 217 */         if (bjr != null && a(bjr, bmb1, true) && bjr.a(bmb1) && (this.g == 2 || bmb1.E() > this.i.size()) && b(bjr)) {
/* 218 */           this.i.add(bjr);
/*     */         }
/* 220 */       } else if (this.h == 2) {
/* 221 */         if (!this.i.isEmpty()) {
/* 222 */           bmb bmb1 = bfv.m().i();
/* 223 */           int k = bfv.m().E();
/*     */           
/* 225 */           for (bjr bjr : this.i) {
/* 226 */             bmb bmb2 = bfv.m();
/* 227 */             if (bjr != null && a(bjr, bmb2, true) && bjr.a(bmb2) && (this.g == 2 || bmb2.E() >= this.i.size()) && b(bjr)) {
/* 228 */               bmb bmb3 = bmb1.i();
/* 229 */               int m = bjr.f() ? bjr.e().E() : 0;
/* 230 */               a(this.i, this.g, bmb3, m);
/*     */               
/* 232 */               int n = Math.min(bmb3.c(), bjr.b(bmb3));
/* 233 */               if (bmb3.E() > n) {
/* 234 */                 bmb3.e(n);
/*     */               }
/*     */               
/* 237 */               k -= bmb3.E() - m;
/* 238 */               bjr.d(bmb3);
/*     */             } 
/*     */           } 
/*     */           
/* 242 */           bmb1.e(k);
/* 243 */           bfv.g(bmb1);
/*     */         } 
/*     */         
/* 246 */         d();
/*     */       } else {
/* 248 */         d();
/*     */       } 
/* 250 */     } else if (this.h != 0) {
/* 251 */       d();
/* 252 */     } else if ((bik1 == bik.a || bik1 == bik.b) && (i == 0 || i == 1)) {
/* 253 */       if (☃ == -999) {
/* 254 */         if (!bfv.m().a()) {
/* 255 */           if (i == 0) {
/* 256 */             bfw1.a(bfv.m(), true);
/* 257 */             bfv.g(bmb.b);
/*     */           } 
/* 259 */           if (i == 1) {
/* 260 */             bfw1.a(bfv.m().a(1), true);
/*     */           }
/*     */         } 
/* 263 */       } else if (bik1 == bik.b) {
/* 264 */         if (☃ < 0) {
/* 265 */           return bmb.b;
/*     */         }
/* 267 */         bjr bjr = this.a.get(☃);
/* 268 */         if (bjr == null || !bjr.a(bfw1)) {
/* 269 */           return bmb.b;
/*     */         }
/*     */         
/* 272 */         bmb bmb1 = b(bfw1, ☃);
/* 273 */         while (!bmb1.a() && bmb.c(bjr.e(), bmb1)) {
/* 274 */           bmb = bmb1.i();
/* 275 */           bmb1 = b(bfw1, ☃);
/*     */         } 
/*     */       } else {
/* 278 */         if (☃ < 0) {
/* 279 */           return bmb.b;
/*     */         }
/*     */         
/* 282 */         bjr bjr = this.a.get(☃);
/* 283 */         if (bjr != null) {
/* 284 */           bmb bmb1 = bjr.e();
/* 285 */           bmb bmb2 = bfv.m();
/*     */           
/* 287 */           if (!bmb1.a()) {
/* 288 */             bmb = bmb1.i();
/*     */           }
/*     */           
/* 291 */           if (bmb1.a()) {
/* 292 */             if (!bmb2.a() && bjr.a(bmb2)) {
/* 293 */               int j = (i == 0) ? bmb2.E() : 1;
/* 294 */               if (j > bjr.b(bmb2)) {
/* 295 */                 j = bjr.b(bmb2);
/*     */               }
/*     */               
/* 298 */               bjr.d(bmb2.a(j));
/*     */             } 
/* 300 */           } else if (bjr.a(bfw1)) {
/* 301 */             if (bmb2.a()) {
/* 302 */               if (bmb1.a()) {
/* 303 */                 bjr.d(bmb.b);
/* 304 */                 bfv.g(bmb.b);
/*     */               } else {
/* 306 */                 int j = (i == 0) ? bmb1.E() : ((bmb1.E() + 1) / 2);
/*     */                 
/* 308 */                 bfv.g(bjr.a(j));
/* 309 */                 if (bmb1.a()) {
/* 310 */                   bjr.d(bmb.b);
/*     */                 }
/* 312 */                 bjr.a(bfw1, bfv.m());
/*     */               } 
/* 314 */             } else if (bjr.a(bmb2)) {
/*     */               
/* 316 */               if (a(bmb1, bmb2)) {
/*     */                 
/* 318 */                 int j = (i == 0) ? bmb2.E() : 1;
/* 319 */                 if (j > bjr.b(bmb2) - bmb1.E()) {
/* 320 */                   j = bjr.b(bmb2) - bmb1.E();
/*     */                 }
/* 322 */                 if (j > bmb2.c() - bmb1.E()) {
/* 323 */                   j = bmb2.c() - bmb1.E();
/*     */                 }
/* 325 */                 bmb2.g(j);
/* 326 */                 bmb1.f(j);
/*     */               
/*     */               }
/* 329 */               else if (bmb2.E() <= bjr.b(bmb2)) {
/* 330 */                 bjr.d(bmb2);
/* 331 */                 bfv.g(bmb1);
/*     */               }
/*     */             
/* 334 */             } else if (bmb2.c() > 1 && a(bmb1, bmb2)) {
/*     */               
/* 336 */               if (!bmb1.a()) {
/* 337 */                 int j = bmb1.E();
/* 338 */                 if (j + bmb2.E() <= bmb2.c()) {
/* 339 */                   bmb2.f(j);
/* 340 */                   bmb1 = bjr.a(j);
/* 341 */                   if (bmb1.a()) {
/* 342 */                     bjr.d(bmb.b);
/*     */                   }
/* 344 */                   bjr.a(bfw1, bfv.m());
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/* 349 */           bjr.d();
/*     */         } 
/*     */       } 
/* 352 */     } else if (bik1 == bik.c) {
/* 353 */       bjr bjr = this.a.get(☃);
/* 354 */       bmb bmb1 = bfv.a(i);
/*     */       
/* 356 */       bmb bmb2 = bjr.e();
/* 357 */       if (!bmb1.a() || !bmb2.a())
/*     */       {
/* 359 */         if (bmb1.a()) {
/*     */           
/* 361 */           if (bjr.a(bfw1)) {
/* 362 */             bfv.a(i, bmb2);
/* 363 */             bjr.b(bmb2.E());
/* 364 */             bjr.d(bmb.b);
/* 365 */             bjr.a(bfw1, bmb2);
/*     */           } 
/* 367 */         } else if (bmb2.a()) {
/* 368 */           if (bjr.a(bmb1)) {
/* 369 */             int j = bjr.b(bmb1);
/* 370 */             if (bmb1.E() > j) {
/*     */               
/* 372 */               bjr.d(bmb1.a(j));
/*     */             } else {
/*     */               
/* 375 */               bjr.d(bmb1);
/* 376 */               bfv.a(i, bmb.b);
/*     */             } 
/*     */           } 
/* 379 */         } else if (bjr.a(bfw1) && bjr.a(bmb1)) {
/*     */ 
/*     */           
/* 382 */           int j = bjr.b(bmb1);
/* 383 */           if (bmb1.E() > j) {
/* 384 */             bjr.d(bmb1.a(j));
/* 385 */             bjr.a(bfw1, bmb2);
/* 386 */             if (!bfv.e(bmb2)) {
/* 387 */               bfw1.a(bmb2, true);
/*     */             }
/*     */           } else {
/* 390 */             bjr.d(bmb1);
/* 391 */             bfv.a(i, bmb2);
/* 392 */             bjr.a(bfw1, bmb2);
/*     */           } 
/*     */         }  } 
/* 395 */     } else if (bik1 == bik.d && bfw1.bC.d && bfv.m().a() && ☃ >= 0) {
/* 396 */       bjr bjr = this.a.get(☃);
/* 397 */       if (bjr != null && bjr.f()) {
/* 398 */         bmb bmb1 = bjr.e().i();
/* 399 */         bmb1.e(bmb1.c());
/* 400 */         bfv.g(bmb1);
/*     */       } 
/* 402 */     } else if (bik1 == bik.e && bfv.m().a() && ☃ >= 0) {
/* 403 */       bjr bjr = this.a.get(☃);
/* 404 */       if (bjr != null && bjr.f() && bjr.a(bfw1)) {
/* 405 */         bmb bmb1 = bjr.a((i == 0) ? 1 : bjr.e().E());
/* 406 */         bjr.a(bfw1, bmb1);
/* 407 */         bfw1.a(bmb1, true);
/*     */       } 
/* 409 */     } else if (bik1 == bik.g && ☃ >= 0) {
/* 410 */       bjr bjr = this.a.get(☃);
/* 411 */       bmb bmb1 = bfv.m();
/*     */       
/* 413 */       if (!bmb1.a() && (bjr == null || !bjr.f() || !bjr.a(bfw1))) {
/* 414 */         int j = (i == 0) ? 0 : (this.a.size() - 1);
/* 415 */         int k = (i == 0) ? 1 : -1;
/*     */         
/* 417 */         for (int m = 0; m < 2; m++) {
/*     */           int n;
/* 419 */           for (n = j; n >= 0 && n < this.a.size() && bmb1.E() < bmb1.c(); n += k) {
/* 420 */             bjr bjr1 = this.a.get(n);
/*     */             
/* 422 */             if (bjr1.f() && a(bjr1, bmb1, true) && bjr1.a(bfw1) && a(bmb1, bjr1)) {
/* 423 */               bmb bmb2 = bjr1.e();
/* 424 */               if (m != 0 || bmb2.E() != bmb2.c()) {
/*     */ 
/*     */                 
/* 427 */                 int i1 = Math.min(bmb1.c() - bmb1.E(), bmb2.E());
/* 428 */                 bmb bmb3 = bjr1.a(i1);
/* 429 */                 bmb1.f(i1);
/*     */                 
/* 431 */                 if (bmb3.a()) {
/* 432 */                   bjr1.d(bmb.b);
/*     */                 }
/* 434 */                 bjr1.a(bfw1, bmb3);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 440 */       c();
/*     */     } 
/*     */     
/* 443 */     return bmb;
/*     */   }
/*     */   
/*     */   public static boolean a(bmb ☃, bmb bmb1) {
/* 447 */     return (☃.b() == bmb1.b() && bmb.a(☃, bmb1));
/*     */   }
/*     */   
/*     */   public boolean a(bmb ☃, bjr bjr1) {
/* 451 */     return true;
/*     */   }
/*     */   
/*     */   public void b(bfw ☃) {
/* 455 */     bfv bfv = ☃.bm;
/* 456 */     if (!bfv.m().a()) {
/* 457 */       ☃.a(bfv.m(), false);
/* 458 */       bfv.g(bmb.b);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(bfw ☃, brx brx1, aon aon1) {
/* 463 */     if (!☃.aX() || (☃ instanceof aah && ((aah)☃).q())) {
/* 464 */       for (int j = 0; j < aon1.Z_(); j++) {
/* 465 */         ☃.a(aon1.b(j), false);
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/* 470 */     for (int i = 0; i < aon1.Z_(); i++) {
/* 471 */       ☃.bm.a(brx1, aon1.b(i));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(aon ☃) {
/* 476 */     c();
/*     */   }
/*     */   
/*     */   public void a(int ☃, bmb bmb1) {
/* 480 */     a(☃).d(bmb1);
/*     */   }
/*     */   
/*     */   public void a(List<bmb> ☃) {
/* 484 */     for (int i = 0; i < ☃.size(); i++) {
/* 485 */       a(i).d(☃.get(i));
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
/*     */   public void a(int ☃, int i) {
/* 499 */     ((biq)this.d.get(☃)).a(i);
/*     */   }
/*     */   
/*     */   public short a(bfv ☃) {
/* 503 */     this.f = (short)(this.f + 1);
/* 504 */     return this.f;
/*     */   }
/*     */   
/* 507 */   protected bic(@Nullable bje<?> ☃, int i) { this.k = Sets.newHashSet();
/*     */     this.e = ☃;
/*     */     this.b = i; } public boolean c(bfw ☃) {
/* 510 */     return !this.k.contains(☃);
/*     */   }
/*     */   
/*     */   public void a(bfw ☃, boolean bool) {
/* 514 */     if (bool) {
/* 515 */       this.k.remove(☃);
/*     */     } else {
/* 517 */       this.k.add(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(bmb ☃, int i, int j, boolean bool) {
/* 524 */     boolean bool1 = false;
/*     */     
/* 526 */     int k = i;
/* 527 */     if (bool) {
/* 528 */       k = j - 1;
/*     */     }
/*     */ 
/*     */     
/* 532 */     if (☃.d()) {
/* 533 */       while (!☃.a() && (bool ? (k >= i) : (k < j))) {
/* 534 */         bjr bjr = this.a.get(k);
/* 535 */         bmb bmb1 = bjr.e();
/* 536 */         if (!bmb1.a() && a(☃, bmb1)) {
/* 537 */           int m = bmb1.E() + ☃.E();
/* 538 */           if (m <= ☃.c()) {
/* 539 */             ☃.e(0);
/* 540 */             bmb1.e(m);
/* 541 */             bjr.d();
/* 542 */             bool1 = true;
/* 543 */           } else if (bmb1.E() < ☃.c()) {
/* 544 */             ☃.g(☃.c() - bmb1.E());
/* 545 */             bmb1.e(☃.c());
/* 546 */             bjr.d();
/* 547 */             bool1 = true;
/*     */           } 
/*     */         } 
/*     */         
/* 551 */         if (bool) {
/* 552 */           k--; continue;
/*     */         } 
/* 554 */         k++;
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 560 */     if (!☃.a()) {
/* 561 */       if (bool) {
/* 562 */         k = j - 1;
/*     */       } else {
/* 564 */         k = i;
/*     */       } 
/* 566 */       while (bool ? (k >= i) : (k < j)) {
/* 567 */         bjr bjr = this.a.get(k);
/* 568 */         bmb bmb1 = bjr.e();
/*     */         
/* 570 */         if (bmb1.a() && bjr.a(☃)) {
/* 571 */           if (☃.E() > bjr.a()) {
/* 572 */             bjr.d(☃.a(bjr.a()));
/*     */           } else {
/* 574 */             bjr.d(☃.a(☃.E()));
/*     */           } 
/* 576 */           bjr.d();
/* 577 */           bool1 = true;
/*     */           
/*     */           break;
/*     */         } 
/* 581 */         if (bool) {
/* 582 */           k--; continue;
/*     */         } 
/* 584 */         k++;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 589 */     return bool1;
/*     */   }
/*     */   
/*     */   public static int b(int ☃) {
/* 593 */     return ☃ >> 2 & 0x3;
/*     */   }
/*     */   
/*     */   public static int c(int ☃) {
/* 597 */     return ☃ & 0x3;
/*     */   }
/*     */   
/*     */   public static int b(int ☃, int i) {
/* 601 */     return ☃ & 0x3 | (i & 0x3) << 2;
/*     */   }
/*     */   
/*     */   public static boolean a(int ☃, bfw bfw1) {
/* 605 */     if (☃ == 0) {
/* 606 */       return true;
/*     */     }
/* 608 */     if (☃ == 1) {
/* 609 */       return true;
/*     */     }
/* 611 */     if (☃ == 2 && bfw1.bC.d) {
/* 612 */       return true;
/*     */     }
/* 614 */     return false;
/*     */   }
/*     */   
/*     */   protected void d() {
/* 618 */     this.h = 0;
/* 619 */     this.i.clear();
/*     */   }
/*     */   
/*     */   public static boolean a(@Nullable bjr ☃, bmb bmb1, boolean bool) {
/* 623 */     boolean bool1 = (☃ == null || !☃.f());
/*     */     
/* 625 */     if (!bool1 && bmb1.a(☃.e()) && bmb.a(☃.e(), bmb1)) {
/* 626 */       return (☃.e().E() + (bool ? 0 : bmb1.E()) <= bmb1.c());
/*     */     }
/*     */     
/* 629 */     return bool1;
/*     */   }
/*     */   
/*     */   public static void a(Set<bjr> ☃, int i, bmb bmb1, int j) {
/* 633 */     switch (i) {
/*     */       case 0:
/* 635 */         bmb1.e(afm.d(bmb1.E() / ☃.size()));
/*     */         break;
/*     */       case 1:
/* 638 */         bmb1.e(1);
/*     */         break;
/*     */       case 2:
/* 641 */         bmb1.e(bmb1.b().i());
/*     */         break;
/*     */     } 
/*     */     
/* 645 */     bmb1.f(j);
/*     */   }
/*     */   
/*     */   public boolean b(bjr ☃) {
/* 649 */     return true;
/*     */   }
/*     */   
/*     */   public static int a(@Nullable ccj ☃) {
/* 653 */     if (☃ instanceof aon) {
/* 654 */       return b((aon)☃);
/*     */     }
/*     */     
/* 657 */     return 0;
/*     */   }
/*     */   
/*     */   public static int b(@Nullable aon ☃) {
/* 661 */     if (☃ == null) {
/* 662 */       return 0;
/*     */     }
/* 664 */     int i = 0;
/* 665 */     float f = 0.0F;
/*     */     
/* 667 */     for (int j = 0; j < ☃.Z_(); j++) {
/* 668 */       bmb bmb = ☃.a(j);
/*     */       
/* 670 */       if (!bmb.a()) {
/* 671 */         f += bmb.E() / Math.min(☃.V_(), bmb.c());
/* 672 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 676 */     f /= ☃.Z_();
/* 677 */     return afm.d(f * 14.0F) + ((i > 0) ? 1 : 0);
/*     */   }
/*     */   
/*     */   public abstract boolean a(bfw parambfw);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
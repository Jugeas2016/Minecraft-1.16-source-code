/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class cru
/*     */ {
/*  66 */   protected static final ceh m = bup.lb.n();
/*     */   protected cra n;
/*     */   @Nullable
/*     */   private gc a;
/*     */   private byg b;
/*     */   private bzm c;
/*     */   protected int o;
/*     */   private final clb d;
/*     */   
/*     */   protected cru(clb ☃, int i) {
/*  76 */     this.d = ☃;
/*  77 */     this.o = i;
/*     */   }
/*     */   
/*     */   public cru(clb ☃, md md1) {
/*  81 */     this(☃, md1.h("GD"));
/*     */     
/*  83 */     if (md1.e("BB")) {
/*  84 */       this.n = new cra(md1.n("BB"));
/*     */     }
/*  86 */     int i = md1.h("O");
/*  87 */     a((i == -1) ? null : gc.b(i));
/*     */   }
/*     */   
/*     */   public final md f() {
/*  91 */     md ☃ = new md();
/*     */     
/*  93 */     ☃.a("id", gm.aI.b(k()).toString());
/*  94 */     ☃.a("BB", this.n.h());
/*  95 */     gc gc1 = i();
/*  96 */     ☃.b("O", (gc1 == null) ? -1 : gc1.d());
/*  97 */     ☃.b("GD", this.o);
/*     */     
/*  99 */     a(☃);
/*     */     
/* 101 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract void a(md parammd);
/*     */   
/*     */   public void a(cru ☃, List<cru> list, Random random) {}
/*     */   
/*     */   public abstract boolean a(bsr parambsr, bsn parambsn, cfy paramcfy, Random paramRandom, cra paramcra, brd parambrd, fx paramfx);
/*     */   
/*     */   public cra g() {
/* 112 */     return this.n;
/*     */   }
/*     */   
/*     */   public int h() {
/* 116 */     return this.o;
/*     */   }
/*     */   
/*     */   public boolean a(brd ☃, int i) {
/* 120 */     int j = ☃.b << 4;
/* 121 */     int k = ☃.c << 4;
/*     */     
/* 123 */     return this.n.a(j - i, k - i, j + 15 + i, k + 15 + i);
/*     */   }
/*     */   
/*     */   public static cru a(List<cru> ☃, cra cra1) {
/* 127 */     for (cru cru1 : ☃) {
/* 128 */       if (cru1.g() != null && cru1.g().b(cra1)) {
/* 129 */         return cru1;
/*     */       }
/*     */     } 
/* 132 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(brc ☃, cra cra1) {
/* 140 */     int i = Math.max(this.n.a - 1, cra1.a);
/* 141 */     int j = Math.max(this.n.b - 1, cra1.b);
/* 142 */     int k = Math.max(this.n.c - 1, cra1.c);
/* 143 */     int m = Math.min(this.n.d + 1, cra1.d);
/* 144 */     int n = Math.min(this.n.e + 1, cra1.e);
/* 145 */     int i1 = Math.min(this.n.f + 1, cra1.f);
/*     */     
/* 147 */     fx.a a = new fx.a();
/*     */     
/*     */     int i2;
/* 150 */     for (i2 = i; i2 <= m; i2++) {
/* 151 */       for (int i3 = k; i3 <= i1; i3++) {
/* 152 */         if (☃.d_(a.d(i2, j, i3)).c().a()) {
/* 153 */           return true;
/*     */         }
/* 155 */         if (☃.d_(a.d(i2, n, i3)).c().a()) {
/* 156 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 161 */     for (i2 = i; i2 <= m; i2++) {
/* 162 */       for (int i3 = j; i3 <= n; i3++) {
/* 163 */         if (☃.d_(a.d(i2, i3, k)).c().a()) {
/* 164 */           return true;
/*     */         }
/* 166 */         if (☃.d_(a.d(i2, i3, i1)).c().a()) {
/* 167 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 172 */     for (i2 = k; i2 <= i1; i2++) {
/* 173 */       for (int i3 = j; i3 <= n; i3++) {
/* 174 */         if (☃.d_(a.d(i, i3, i2)).c().a()) {
/* 175 */           return true;
/*     */         }
/* 177 */         if (☃.d_(a.d(m, i3, i2)).c().a()) {
/* 178 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 182 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(int ☃, int i) {
/* 190 */     gc gc1 = i();
/* 191 */     if (gc1 == null) {
/* 192 */       return ☃;
/*     */     }
/*     */     
/* 195 */     switch (null.a[gc1.ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/* 198 */         return this.n.a + ☃;
/*     */       case 3:
/* 200 */         return this.n.d - i;
/*     */       case 4:
/* 202 */         return this.n.a + i;
/*     */     } 
/* 204 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(int ☃) {
/* 209 */     if (i() == null) {
/* 210 */       return ☃;
/*     */     }
/* 212 */     return ☃ + this.n.b;
/*     */   }
/*     */   
/*     */   protected int b(int ☃, int i) {
/* 216 */     gc gc1 = i();
/* 217 */     if (gc1 == null) {
/* 218 */       return i;
/*     */     }
/*     */     
/* 221 */     switch (null.a[gc1.ordinal()]) {
/*     */       case 1:
/* 223 */         return this.n.f - i;
/*     */       case 2:
/* 225 */         return this.n.c + i;
/*     */       case 3:
/*     */       case 4:
/* 228 */         return this.n.c + ☃;
/*     */     } 
/* 230 */     return i;
/*     */   }
/*     */ 
/*     */   
/* 234 */   private static final Set<buo> e = (Set<buo>)ImmutableSet.builder()
/* 235 */     .add(bup.dW)
/* 236 */     .add(bup.bL)
/* 237 */     .add(bup.bM)
/* 238 */     .add(bup.cJ)
/* 239 */     .add(bup.im)
/* 240 */     .add(bup.iq)
/* 241 */     .add(bup.ip)
/* 242 */     .add(bup.in)
/* 243 */     .add(bup.io)
/* 244 */     .add(bup.cg)
/* 245 */     .add(bup.dH)
/* 246 */     .build();
/*     */   
/*     */   protected void a(bsr ☃, ceh ceh1, int i, int j, int k, cra cra1) {
/* 249 */     fx fx = new fx(a(i, k), d(j), b(i, k));
/*     */     
/* 251 */     if (!cra1.b(fx)) {
/*     */       return;
/*     */     }
/*     */     
/* 255 */     if (this.b != byg.a) {
/* 256 */       ceh1 = ceh1.a(this.b);
/*     */     }
/* 258 */     if (this.c != bzm.a) {
/* 259 */       ceh1 = ceh1.a(this.c);
/*     */     }
/*     */     
/* 262 */     ☃.a(fx, ceh1, 2);
/* 263 */     cux cux = ☃.b(fx);
/* 264 */     if (!cux.c()) {
/* 265 */       ☃.I().a(fx, cux.a(), 0);
/*     */     }
/* 267 */     if (e.contains(ceh1.b())) {
/* 268 */       ☃.z(fx).e(fx);
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
/*     */   protected ceh a(brc ☃, int i, int j, int k, cra cra1) {
/* 285 */     int m = a(i, k);
/* 286 */     int n = d(j);
/* 287 */     int i1 = b(i, k);
/*     */     
/* 289 */     fx fx = new fx(m, n, i1);
/* 290 */     if (!cra1.b(fx)) {
/* 291 */       return bup.a.n();
/*     */     }
/*     */     
/* 294 */     return ☃.d_(fx);
/*     */   }
/*     */   
/*     */   protected boolean a(brz ☃, int i, int j, int k, cra cra1) {
/* 298 */     int m = a(i, k);
/* 299 */     int n = d(j + 1);
/* 300 */     int i1 = b(i, k);
/*     */     
/* 302 */     fx fx = new fx(m, n, i1);
/*     */     
/* 304 */     if (!cra1.b(fx)) {
/* 305 */       return false;
/*     */     }
/*     */     
/* 308 */     return (n < ☃.a(chn.a.c, m, i1));
/*     */   }
/*     */   
/*     */   protected void b(bsr ☃, cra cra1, int i, int j, int k, int m, int n, int i1) {
/* 312 */     for (int i2 = j; i2 <= n; i2++) {
/* 313 */       for (int i3 = i; i3 <= m; i3++) {
/* 314 */         for (int i4 = k; i4 <= i1; i4++) {
/* 315 */           a(☃, bup.a.n(), i3, i2, i4, cra1);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(bsr ☃, cra cra1, int i, int j, int k, int m, int n, int i1, ceh ceh1, ceh ceh2, boolean bool) {
/* 322 */     for (int i2 = j; i2 <= n; i2++) {
/* 323 */       for (int i3 = i; i3 <= m; i3++) {
/* 324 */         for (int i4 = k; i4 <= i1; i4++) {
/* 325 */           if (!bool || !a(☃, i3, i2, i4, cra1).g())
/*     */           {
/*     */             
/* 328 */             if (i2 == j || i2 == n || i3 == i || i3 == m || i4 == k || i4 == i1) {
/* 329 */               a(☃, ceh1, i3, i2, i4, cra1);
/*     */             } else {
/* 331 */               a(☃, ceh2, i3, i2, i4, cra1);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(bsr ☃, cra cra1, int i, int j, int k, int m, int n, int i1, boolean bool, Random random, a a1) {
/* 343 */     for (int i2 = j; i2 <= n; i2++) {
/* 344 */       for (int i3 = i; i3 <= m; i3++) {
/* 345 */         for (int i4 = k; i4 <= i1; i4++) {
/* 346 */           if (!bool || !a(☃, i3, i2, i4, cra1).g()) {
/*     */ 
/*     */             
/* 349 */             a1.a(random, i3, i2, i4, (i2 == j || i2 == n || i3 == i || i3 == m || i4 == k || i4 == i1));
/* 350 */             a(☃, a1.a(), i3, i2, i4, cra1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(bsr ☃, cra cra1, Random random, float f, int i, int j, int k, int m, int n, int i1, ceh ceh1, ceh ceh2, boolean bool1, boolean bool2) {
/* 361 */     for (int i2 = j; i2 <= n; i2++) {
/* 362 */       for (int i3 = i; i3 <= m; i3++) {
/* 363 */         for (int i4 = k; i4 <= i1; i4++) {
/* 364 */           if (random.nextFloat() <= f)
/*     */           {
/*     */             
/* 367 */             if (!bool1 || !a(☃, i3, i2, i4, cra1).g())
/*     */             {
/*     */               
/* 370 */               if (!bool2 || a(☃, i3, i2, i4, cra1))
/*     */               {
/*     */                 
/* 373 */                 if (i2 == j || i2 == n || i3 == i || i3 == m || i4 == k || i4 == i1) {
/* 374 */                   a(☃, ceh1, i3, i2, i4, cra1);
/*     */                 } else {
/* 376 */                   a(☃, ceh2, i3, i2, i4, cra1);
/*     */                 }  }  }  } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(bsr ☃, cra cra1, Random random, float f, int i, int j, int k, ceh ceh1) {
/* 384 */     if (random.nextFloat() < f) {
/* 385 */       a(☃, ceh1, i, j, k, cra1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(bsr ☃, cra cra1, int i, int j, int k, int m, int n, int i1, ceh ceh1, boolean bool) {
/* 390 */     float f1 = (m - i + 1);
/* 391 */     float f2 = (n - j + 1);
/* 392 */     float f3 = (i1 - k + 1);
/*     */     
/* 394 */     float f4 = i + f1 / 2.0F;
/* 395 */     float f5 = k + f3 / 2.0F;
/*     */     
/* 397 */     for (int i2 = j; i2 <= n; i2++) {
/* 398 */       float f = (i2 - j) / f2;
/*     */       
/* 400 */       for (int i3 = i; i3 <= m; i3++) {
/* 401 */         float f6 = (i3 - f4) / f1 * 0.5F;
/*     */         
/* 403 */         for (int i4 = k; i4 <= i1; i4++) {
/* 404 */           float f7 = (i4 - f5) / f3 * 0.5F;
/*     */           
/* 406 */           if (!bool || !a(☃, i3, i2, i4, cra1).g()) {
/*     */ 
/*     */ 
/*     */             
/* 410 */             float f8 = f6 * f6 + f * f + f7 * f7;
/*     */             
/* 412 */             if (f8 <= 1.05F) {
/* 413 */               a(☃, ceh1, i3, i2, i4, cra1);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
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
/*     */   protected void b(bsr ☃, ceh ceh1, int i, int j, int k, cra cra1) {
/* 434 */     int m = a(i, k);
/* 435 */     int n = d(j);
/* 436 */     int i1 = b(i, k);
/*     */     
/* 438 */     if (!cra1.b(new fx(m, n, i1))) {
/*     */       return;
/*     */     }
/*     */     
/* 442 */     while ((☃.w(new fx(m, n, i1)) || ☃.d_(new fx(m, n, i1)).c().a()) && n > 1) {
/* 443 */       ☃.a(new fx(m, n, i1), ceh1, 2);
/* 444 */       n--;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(bsr ☃, cra cra1, Random random, int i, int j, int k, vk vk1) {
/* 449 */     fx fx = new fx(a(i, k), d(j), b(i, k));
/* 450 */     return a(☃, cra1, random, fx, vk1, (ceh)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public static ceh a(brc ☃, fx fx1, ceh ceh1) {
/* 455 */     gc gc1 = null;
/* 456 */     for (gc gc3 : gc.c.a) {
/* 457 */       fx fx3 = fx1.a(gc3);
/* 458 */       ceh ceh2 = ☃.d_(fx3);
/* 459 */       if (ceh2.a(bup.bR)) {
/* 460 */         return ceh1;
/*     */       }
/* 462 */       if (ceh2.i(☃, fx3)) {
/* 463 */         if (gc1 == null) {
/* 464 */           gc1 = gc3; continue;
/*     */         } 
/* 466 */         gc1 = null;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 471 */     if (gc1 != null) {
/* 472 */       return ceh1.a(bxm.aq, gc1.f());
/*     */     }
/*     */ 
/*     */     
/* 476 */     gc gc2 = (gc)ceh1.c(bxm.aq);
/* 477 */     fx fx2 = fx1.a(gc2);
/* 478 */     if (☃.d_(fx2).i(☃, fx2)) {
/* 479 */       gc2 = gc2.f();
/* 480 */       fx2 = fx1.a(gc2);
/*     */     } 
/* 482 */     if (☃.d_(fx2).i(☃, fx2)) {
/* 483 */       gc2 = gc2.g();
/* 484 */       fx2 = fx1.a(gc2);
/*     */     } 
/* 486 */     if (☃.d_(fx2).i(☃, fx2)) {
/* 487 */       gc2 = gc2.f();
/* 488 */       fx2 = fx1.a(gc2);
/*     */     } 
/*     */     
/* 491 */     return ceh1.a(bxm.aq, gc2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(bsk ☃, cra cra1, Random random, fx fx1, vk vk1, @Nullable ceh ceh1) {
/* 498 */     if (!cra1.b(fx1) || ☃.d_(fx1).a(bup.bR)) {
/* 499 */       return false;
/*     */     }
/*     */     
/* 502 */     if (ceh1 == null) {
/* 503 */       ceh1 = a(☃, fx1, bup.bR.n());
/*     */     }
/* 505 */     ☃.a(fx1, ceh1, 2);
/*     */     
/* 507 */     ccj ccj = ☃.c(fx1);
/* 508 */     if (ccj instanceof ccn) {
/* 509 */       ((ccn)ccj).a(vk1, random.nextLong());
/*     */     }
/* 511 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean a(bsr ☃, cra cra1, Random random, int i, int j, int k, gc gc1, vk vk1) {
/* 515 */     fx fx = new fx(a(i, k), d(j), b(i, k));
/*     */     
/* 517 */     if (cra1.b(fx) && 
/* 518 */       !☃.d_(fx).a(bup.as)) {
/* 519 */       a(☃, bup.as.n().a(bwa.a, gc1), i, j, k, cra1);
/*     */       
/* 521 */       ccj ccj = ☃.c(fx);
/* 522 */       if (ccj instanceof ccs) {
/* 523 */         ((ccs)ccj).a(vk1, random.nextLong());
/*     */       }
/* 525 */       return true;
/*     */     } 
/*     */     
/* 528 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j) {
/* 537 */     this.n.a(☃, i, j);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public gc i() {
/* 542 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(@Nullable gc ☃) {
/* 546 */     this.a = ☃;
/* 547 */     if (☃ == null) {
/* 548 */       this.c = bzm.a;
/* 549 */       this.b = byg.a;
/*     */     } else {
/* 551 */       switch (null.a[☃.ordinal()]) {
/*     */         case 2:
/* 553 */           this.b = byg.b;
/* 554 */           this.c = bzm.a;
/*     */           return;
/*     */         case 3:
/* 557 */           this.b = byg.b;
/* 558 */           this.c = bzm.b;
/*     */           return;
/*     */         case 4:
/* 561 */           this.b = byg.a;
/* 562 */           this.c = bzm.b;
/*     */           return;
/*     */       } 
/* 565 */       this.b = byg.a;
/* 566 */       this.c = bzm.a;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public bzm ap_() {
/* 573 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public clb k() {
/* 581 */     return this.d;
/*     */   }
/*     */   
/*     */   public static abstract class a {
/* 585 */     protected ceh a = bup.a.n();
/*     */     
/*     */     public abstract void a(Random param1Random, int param1Int1, int param1Int2, int param1Int3, boolean param1Boolean);
/*     */     
/*     */     public ceh a() {
/* 590 */       return this.a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cru.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
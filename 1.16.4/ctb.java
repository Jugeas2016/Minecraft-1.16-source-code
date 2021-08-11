/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
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
/*     */ public class ctb
/*     */ {
/*  68 */   private final List<a> a = Lists.newArrayList();
/*  69 */   private final List<d> b = Lists.newArrayList();
/*  70 */   private fx c = fx.b;
/*  71 */   private String d = "?";
/*     */   
/*     */   public fx a() {
/*  74 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  78 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public String b() {
/*  82 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(brx ☃, fx fx1, fx fx2, boolean bool, @Nullable buo buo1) {
/*  86 */     if (fx2.u() < 1 || fx2.v() < 1 || fx2.w() < 1) {
/*     */       return;
/*     */     }
/*  89 */     fx fx3 = fx1.a(fx2).b(-1, -1, -1);
/*  90 */     List<c> list1 = Lists.newArrayList();
/*  91 */     List<c> list2 = Lists.newArrayList();
/*  92 */     List<c> list3 = Lists.newArrayList();
/*     */     
/*  94 */     fx fx4 = new fx(Math.min(fx1.u(), fx3.u()), Math.min(fx1.v(), fx3.v()), Math.min(fx1.w(), fx3.w()));
/*  95 */     fx fx5 = new fx(Math.max(fx1.u(), fx3.u()), Math.max(fx1.v(), fx3.v()), Math.max(fx1.w(), fx3.w()));
/*  96 */     this.c = fx2;
/*     */     
/*  98 */     for (fx fx6 : fx.a(fx4, fx5)) {
/*  99 */       c c; fx fx7 = fx6.b(fx4);
/* 100 */       ceh ceh = ☃.d_(fx6);
/* 101 */       if (buo1 != null && buo1 == ceh.b()) {
/*     */         continue;
/*     */       }
/* 104 */       ccj ccj = ☃.c(fx6);
/*     */ 
/*     */ 
/*     */       
/* 108 */       if (ccj != null) {
/* 109 */         md md = ccj.a(new md());
/* 110 */         md.r("x");
/* 111 */         md.r("y");
/* 112 */         md.r("z");
/* 113 */         c = new c(fx7, ceh, md.g());
/*     */       } else {
/* 115 */         c = new c(fx7, ceh, null);
/*     */       } 
/*     */       
/* 118 */       a(c, list1, list2, list3);
/*     */     } 
/* 120 */     List<c> list4 = a(list1, list2, list3);
/*     */     
/* 122 */     this.a.clear();
/* 123 */     this.a.add(new a(list4));
/*     */     
/* 125 */     if (bool) {
/* 126 */       a(☃, fx4, fx5.b(1, 1, 1));
/*     */     } else {
/* 128 */       this.b.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(c ☃, List<c> list1, List<c> list2, List<c> list3) {
/* 133 */     if (☃.c != null) {
/* 134 */       list2.add(☃);
/* 135 */     } else if (!☃.b.b().o() && ☃.b.r(brl.a, fx.b)) {
/* 136 */       list1.add(☃);
/*     */     } else {
/* 138 */       list3.add(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static List<c> a(List<c> ☃, List<c> list1, List<c> list2) {
/* 144 */     Comparator<c> comparator = Comparator.<c>comparingInt(☃ -> ☃.a.v()).thenComparingInt(☃ -> ☃.a.u()).thenComparingInt(☃ -> ☃.a.w());
/* 145 */     ☃.sort(comparator);
/* 146 */     list2.sort(comparator);
/* 147 */     list1.sort(comparator);
/*     */     
/* 149 */     List<c> list = Lists.newArrayList();
/* 150 */     list.addAll(☃);
/* 151 */     list.addAll(list2);
/* 152 */     list.addAll(list1);
/* 153 */     return list;
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, fx fx2) {
/* 157 */     List<aqa> list = ☃.a(aqa.class, new dci(fx1, fx2), ☃ -> !(☃ instanceof bfw));
/* 158 */     this.b.clear();
/* 159 */     for (aqa aqa : list) {
/* 160 */       fx fx3; dcn dcn = new dcn(aqa.cD() - fx1.u(), aqa.cE() - fx1.v(), aqa.cH() - fx1.w());
/* 161 */       md md = new md();
/* 162 */       aqa.d(md);
/*     */       
/* 164 */       if (aqa instanceof bcs) {
/* 165 */         fx3 = ((bcs)aqa).n().b(fx1);
/*     */       } else {
/* 167 */         fx3 = new fx(dcn);
/*     */       } 
/* 169 */       this.b.add(new d(dcn, fx3, md.g()));
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<c> a(fx ☃, csx csx1, buo buo1) {
/* 174 */     return a(☃, csx1, buo1, true);
/*     */   }
/*     */   
/*     */   public List<c> a(fx ☃, csx csx1, buo buo1, boolean bool) {
/* 178 */     List<c> list = Lists.newArrayList();
/* 179 */     cra cra = csx1.h();
/*     */     
/* 181 */     if (this.a.isEmpty()) {
/* 182 */       return Collections.emptyList();
/*     */     }
/* 184 */     for (c c : csx1.a(this.a, ☃).a(buo1)) {
/* 185 */       fx fx1 = bool ? a(csx1, c.a).a(☃) : c.a;
/* 186 */       if (cra != null && !cra.b(fx1)) {
/*     */         continue;
/*     */       }
/* 189 */       list.add(new c(fx1, c.b.a(csx1.d()), c.c));
/*     */     } 
/* 191 */     return list;
/*     */   }
/*     */   
/*     */   public fx a(csx ☃, fx fx1, csx csx1, fx fx2) {
/* 195 */     fx fx3 = a(☃, fx1);
/* 196 */     fx fx4 = a(csx1, fx2);
/* 197 */     return fx3.b(fx4);
/*     */   }
/*     */   
/*     */   public static fx a(csx ☃, fx fx1) {
/* 201 */     return a(fx1, ☃.c(), ☃.d(), ☃.e());
/*     */   }
/*     */   
/*     */   public void a(bsk ☃, fx fx1, csx csx1, Random random) {
/* 205 */     csx1.k();
/* 206 */     b(☃, fx1, csx1, random);
/*     */   }
/*     */   
/*     */   public void b(bsk ☃, fx fx1, csx csx1, Random random) {
/* 210 */     a(☃, fx1, fx1, csx1, random, 2);
/*     */   }
/*     */   
/*     */   public boolean a(bsk ☃, fx fx1, fx fx2, csx csx1, Random random, int i) {
/* 214 */     if (this.a.isEmpty()) {
/* 215 */       return false;
/*     */     }
/* 217 */     List<c> list1 = csx1.a(this.a, fx1).a();
/* 218 */     if ((list1.isEmpty() && (csx1.g() || this.b.isEmpty())) || this.c.u() < 1 || this.c.v() < 1 || this.c.w() < 1) {
/* 219 */       return false;
/*     */     }
/*     */     
/* 222 */     cra cra = csx1.h();
/* 223 */     List<fx> list = Lists.newArrayListWithCapacity(csx1.l() ? list1.size() : 0);
/* 224 */     List<Pair<fx, md>> list2 = Lists.newArrayListWithCapacity(list1.size());
/*     */     
/* 226 */     int j = Integer.MAX_VALUE;
/* 227 */     int k = Integer.MAX_VALUE;
/* 228 */     int m = Integer.MAX_VALUE;
/*     */     
/* 230 */     int n = Integer.MIN_VALUE;
/* 231 */     int i1 = Integer.MIN_VALUE;
/* 232 */     int i2 = Integer.MIN_VALUE;
/*     */     
/* 234 */     List<c> list3 = a(☃, fx1, fx2, csx1, list1);
/*     */     
/* 236 */     for (c c : list3) {
/* 237 */       fx fx3 = c.a;
/*     */       
/* 239 */       if (cra != null && !cra.b(fx3)) {
/*     */         continue;
/*     */       }
/*     */       
/* 243 */       cux cux = csx1.l() ? ☃.b(fx3) : null;
/* 244 */       ceh ceh = c.b.a(csx1.c()).a(csx1.d());
/*     */       
/* 246 */       if (c.c != null) {
/*     */ 
/*     */         
/* 249 */         ccj ccj = ☃.c(fx3);
/* 250 */         aol.a(ccj);
/*     */ 
/*     */         
/* 253 */         ☃.a(fx3, bup.go.n(), 20);
/*     */       } 
/* 255 */       if (☃.a(fx3, ceh, i)) {
/* 256 */         j = Math.min(j, fx3.u());
/* 257 */         k = Math.min(k, fx3.v());
/* 258 */         m = Math.min(m, fx3.w());
/*     */         
/* 260 */         n = Math.max(n, fx3.u());
/* 261 */         i1 = Math.max(i1, fx3.v());
/* 262 */         i2 = Math.max(i2, fx3.w());
/* 263 */         list2.add(Pair.of(fx3, c.c));
/*     */         
/* 265 */         if (c.c != null) {
/* 266 */           ccj ccj = ☃.c(fx3);
/* 267 */           if (ccj != null) {
/* 268 */             c.c.b("x", fx3.u());
/* 269 */             c.c.b("y", fx3.v());
/* 270 */             c.c.b("z", fx3.w());
/*     */             
/* 272 */             if (ccj instanceof cdd) {
/* 273 */               c.c.a("LootTableSeed", random.nextLong());
/*     */             }
/* 275 */             ccj.a(c.b, c.c);
/* 276 */             ccj.a(csx1.c());
/* 277 */             ccj.a(csx1.d());
/*     */           } 
/*     */         } 
/* 280 */         if (cux != null && 
/* 281 */           ceh.b() instanceof byc) {
/* 282 */           ((byc)ceh.b()).a(☃, fx3, ceh, cux);
/* 283 */           if (!cux.b()) {
/* 284 */             list.add(fx3);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 291 */     boolean bool = true;
/* 292 */     gc[] arrayOfGc = { gc.b, gc.c, gc.f, gc.d, gc.e };
/*     */     
/* 294 */     while (bool && !list.isEmpty()) {
/* 295 */       bool = false;
/* 296 */       for (Iterator<fx> iterator = list.iterator(); iterator.hasNext(); ) {
/* 297 */         fx fx3 = iterator.next();
/*     */ 
/*     */         
/* 300 */         fx fx4 = fx3;
/* 301 */         cux cux = ☃.b(fx4);
/* 302 */         for (int i3 = 0; i3 < arrayOfGc.length && !cux.b(); i3++) {
/* 303 */           fx fx5 = fx4.a(arrayOfGc[i3]);
/* 304 */           cux cux1 = ☃.b(fx5);
/* 305 */           if (cux1.a(☃, fx5) > cux.a(☃, fx4) || (cux1.b() && !cux.b())) {
/* 306 */             cux = cux1;
/* 307 */             fx4 = fx5;
/*     */           } 
/*     */         } 
/*     */         
/* 311 */         if (cux.b()) {
/* 312 */           ceh ceh = ☃.d_(fx3);
/* 313 */           buo buo = ceh.b();
/* 314 */           if (buo instanceof byc) {
/* 315 */             ((byc)buo).a(☃, fx3, ceh, cux);
/* 316 */             bool = true;
/* 317 */             iterator.remove();
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 323 */     if (j <= n) {
/* 324 */       if (!csx1.i()) {
/* 325 */         dcw dcw = new dcq(n - j + 1, i1 - k + 1, i2 - m + 1);
/*     */         
/* 327 */         int i3 = j;
/* 328 */         int i4 = k;
/* 329 */         int i5 = m;
/*     */         
/* 331 */         for (Pair<fx, md> pair : list2) {
/* 332 */           fx fx3 = (fx)pair.getFirst();
/* 333 */           dcw.a(fx3.u() - i3, fx3.v() - i4, fx3.w() - i5, true, true);
/*     */         } 
/*     */         
/* 336 */         a(☃, i, dcw, i3, i4, i5);
/*     */       } 
/*     */       
/* 339 */       for (Pair<fx, md> pair : list2) {
/* 340 */         fx fx3 = (fx)pair.getFirst();
/* 341 */         if (!csx1.i()) {
/* 342 */           ceh ceh1 = ☃.d_(fx3);
/* 343 */           ceh ceh2 = buo.b(ceh1, ☃, fx3);
/* 344 */           if (ceh1 != ceh2) {
/* 345 */             ☃.a(fx3, ceh2, i & 0xFFFFFFFE | 0x10);
/*     */           }
/* 347 */           ☃.a(fx3, ceh2.b());
/*     */         } 
/*     */         
/* 350 */         if (pair.getSecond() != null) {
/* 351 */           ccj ccj = ☃.c(fx3);
/* 352 */           if (ccj != null) {
/* 353 */             ccj.X_();
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 359 */     if (!csx1.g()) {
/* 360 */       a(☃, fx1, csx1.c(), csx1.d(), csx1.e(), cra, csx1.m());
/*     */     }
/*     */     
/* 363 */     return true;
/*     */   }
/*     */   
/*     */   public static void a(bry ☃, int i, dcw dcw1, int j, int k, int m) {
/* 367 */     dcw1.a((gc1, m, n, i1) -> {
/*     */           fx fx1 = new fx(☃ + m, i + n, j + i1);
/*     */           fx fx2 = fx1.a(gc1);
/*     */           ceh ceh1 = bry1.d_(fx1);
/*     */           ceh ceh2 = bry1.d_(fx2);
/*     */           ceh ceh3 = ceh1.a(gc1, ceh2, bry1, fx1, fx2);
/*     */           if (ceh1 != ceh3) {
/*     */             bry1.a(fx1, ceh3, k & 0xFFFFFFFE);
/*     */           }
/*     */           ceh ceh4 = ceh2.a(gc1.f(), ceh3, bry1, fx2, fx1);
/*     */           if (ceh2 != ceh4) {
/*     */             bry1.a(fx2, ceh4, k & 0xFFFFFFFE);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static List<c> a(bry ☃, fx fx1, fx fx2, csx csx1, List<c> list) {
/* 384 */     List<c> list1 = Lists.newArrayList();
/* 385 */     for (c c1 : list) {
/* 386 */       fx fx3 = a(csx1, c1.a).a(fx1);
/* 387 */       c c2 = new c(fx3, c1.b, (c1.c != null) ? c1.c.g() : null);
/*     */       
/* 389 */       Iterator<csy> iterator = csx1.j().iterator();
/* 390 */       while (c2 != null && iterator.hasNext()) {
/* 391 */         c2 = ((csy)iterator.next()).a(☃, fx1, fx2, c1, c2, csx1);
/*     */       }
/*     */       
/* 394 */       if (c2 != null) {
/* 395 */         list1.add(c2);
/*     */       }
/*     */     } 
/* 398 */     return list1;
/*     */   }
/*     */   
/*     */   private void a(bsk ☃, fx fx1, byg byg1, bzm bzm1, fx fx2, @Nullable cra cra1, boolean bool) {
/* 402 */     for (d d : this.b) {
/* 403 */       fx fx3 = a(d.b, byg1, bzm1, fx2).a(fx1);
/* 404 */       if (cra1 != null && !cra1.b(fx3)) {
/*     */         continue;
/*     */       }
/*     */       
/* 408 */       md md = d.c.g();
/* 409 */       dcn dcn1 = a(d.a, byg1, bzm1, fx2);
/* 410 */       dcn dcn2 = dcn1.b(fx1.u(), fx1.v(), fx1.w());
/*     */       
/* 412 */       mj mj = new mj();
/* 413 */       mj.add(me.a(dcn2.b));
/* 414 */       mj.add(me.a(dcn2.c));
/* 415 */       mj.add(me.a(dcn2.d));
/* 416 */       md.a("Pos", mj);
/*     */       
/* 418 */       md.r("UUID");
/*     */       
/* 420 */       a(☃, md).ifPresent(aqa1 -> {
/*     */             float f = aqa1.a(☃);
/*     */             f += aqa1.p - aqa1.a(bzm1);
/*     */             aqa1.b(dcn1.b, dcn1.c, dcn1.d, f, aqa1.q);
/*     */             if (bool && aqa1 instanceof aqn) {
/*     */               ((aqn)aqa1).a(bsk1, bsk1.d(new fx(dcn1)), aqp.d, (arc)null, md1);
/*     */             }
/*     */             bsk1.l(aqa1);
/*     */           });
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static Optional<aqa> a(bsk ☃, md md1) {
/*     */     try {
/* 435 */       return aqe.a(md1, ☃.E());
/* 436 */     } catch (Exception exception) {
/* 437 */       return Optional.empty();
/*     */     } 
/*     */   }
/*     */   
/*     */   public fx a(bzm ☃) {
/* 442 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/* 445 */         return new fx(this.c.w(), this.c.v(), this.c.u());
/*     */     } 
/* 447 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public static fx a(fx ☃, byg byg1, bzm bzm1, fx fx1) {
/* 452 */     int i = ☃.u();
/* 453 */     int j = ☃.v();
/* 454 */     int k = ☃.w();
/*     */     
/* 456 */     boolean bool = true;
/* 457 */     switch (null.b[byg1.ordinal()]) {
/*     */       case 1:
/* 459 */         k = -k;
/*     */         break;
/*     */       case 2:
/* 462 */         i = -i;
/*     */         break;
/*     */       default:
/* 465 */         bool = false;
/*     */         break;
/*     */     } 
/*     */     
/* 469 */     int m = fx1.u();
/* 470 */     int n = fx1.w();
/* 471 */     switch (null.a[bzm1.ordinal()]) {
/*     */       case 3:
/* 473 */         return new fx(m + m - i, j, n + n - k);
/*     */       case 1:
/* 475 */         return new fx(m - n + k, j, m + n - i);
/*     */       case 2:
/* 477 */         return new fx(m + n - k, j, n - m + i);
/*     */     } 
/* 479 */     return bool ? new fx(i, j, k) : ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public static dcn a(dcn ☃, byg byg1, bzm bzm1, fx fx1) {
/* 484 */     double d1 = ☃.b;
/* 485 */     double d2 = ☃.c;
/* 486 */     double d3 = ☃.d;
/*     */     
/* 488 */     boolean bool = true;
/* 489 */     switch (null.b[byg1.ordinal()]) {
/*     */       case 1:
/* 491 */         d3 = 1.0D - d3;
/*     */         break;
/*     */       case 2:
/* 494 */         d1 = 1.0D - d1;
/*     */         break;
/*     */       default:
/* 497 */         bool = false;
/*     */         break;
/*     */     } 
/*     */     
/* 501 */     int i = fx1.u();
/* 502 */     int j = fx1.w();
/* 503 */     switch (null.a[bzm1.ordinal()]) {
/*     */       case 3:
/* 505 */         return new dcn((i + i + 1) - d1, d2, (j + j + 1) - d3);
/*     */       case 1:
/* 507 */         return new dcn((i - j) + d3, d2, (i + j + 1) - d1);
/*     */       case 2:
/* 509 */         return new dcn((i + j + 1) - d3, d2, (j - i) + d1);
/*     */     } 
/* 511 */     return bool ? new dcn(d1, d2, d3) : ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public fx a(fx ☃, byg byg1, bzm bzm1) {
/* 516 */     return a(☃, byg1, bzm1, a().u(), a().w());
/*     */   }
/*     */   
/*     */   public static fx a(fx ☃, byg byg1, bzm bzm1, int i, int j) {
/* 520 */     i--;
/* 521 */     j--;
/*     */     
/* 523 */     int k = (byg1 == byg.c) ? i : 0;
/* 524 */     int m = (byg1 == byg.b) ? j : 0;
/*     */     
/* 526 */     fx fx1 = ☃;
/*     */     
/* 528 */     switch (null.a[bzm1.ordinal()]) {
/*     */       case 4:
/* 530 */         fx1 = ☃.b(k, 0, m);
/*     */         break;
/*     */       case 2:
/* 533 */         fx1 = ☃.b(j - m, 0, k);
/*     */         break;
/*     */       case 3:
/* 536 */         fx1 = ☃.b(i - k, 0, j - m);
/*     */         break;
/*     */       case 1:
/* 539 */         fx1 = ☃.b(m, 0, i - k);
/*     */         break;
/*     */     } 
/* 542 */     return fx1;
/*     */   }
/*     */   
/*     */   public cra b(csx ☃, fx fx1) {
/* 546 */     return a(fx1, ☃.d(), ☃.e(), ☃.c());
/*     */   }
/*     */   
/*     */   public cra a(fx ☃, bzm bzm1, fx fx1, byg byg1) {
/* 550 */     fx fx2 = a(bzm1);
/*     */     
/* 552 */     int i = fx1.u();
/* 553 */     int j = fx1.w();
/* 554 */     int k = fx2.u() - 1;
/* 555 */     int m = fx2.v() - 1;
/* 556 */     int n = fx2.w() - 1;
/*     */     
/* 558 */     cra cra = new cra(0, 0, 0, 0, 0, 0);
/* 559 */     switch (null.a[bzm1.ordinal()]) {
/*     */       case 4:
/* 561 */         cra = new cra(0, 0, 0, k, m, n);
/*     */         break;
/*     */       case 3:
/* 564 */         cra = new cra(i + i - k, 0, j + j - n, i + i, m, j + j);
/*     */         break;
/*     */       case 1:
/* 567 */         cra = new cra(i - j, 0, i + j - n, i - j + k, m, i + j);
/*     */         break;
/*     */       case 2:
/* 570 */         cra = new cra(i + j - k, 0, j - i, i + j, m, j - i + n);
/*     */         break;
/*     */     } 
/* 573 */     switch (null.b[byg1.ordinal()]) {
/*     */ 
/*     */       
/*     */       case 2:
/* 577 */         a(bzm1, k, n, cra, gc.e, gc.f);
/*     */         break;
/*     */       case 1:
/* 580 */         a(bzm1, n, k, cra, gc.c, gc.d);
/*     */         break;
/*     */     } 
/* 583 */     cra.a(☃.u(), ☃.v(), ☃.w());
/* 584 */     return cra;
/*     */   }
/*     */   
/*     */   private void a(bzm ☃, int i, int j, cra cra1, gc gc1, gc gc2) {
/* 588 */     fx fx1 = fx.b;
/* 589 */     if (☃ == bzm.b || ☃ == bzm.d) {
/* 590 */       fx1 = fx1.a(☃.a(gc1), j);
/* 591 */     } else if (☃ == bzm.c) {
/* 592 */       fx1 = fx1.a(gc2, i);
/*     */     } else {
/* 594 */       fx1 = fx1.a(gc1, i);
/*     */     } 
/* 596 */     cra1.a(fx1.u(), 0, fx1.w());
/*     */   }
/*     */   
/*     */   static class b implements Iterable<ceh> {
/* 600 */     public static final ceh a = bup.a.n();
/*     */     
/* 602 */     private final gh<ceh> b = new gh<>(16);
/*     */     private int c;
/*     */     
/*     */     public int a(ceh ☃) {
/* 606 */       int i = this.b.a(☃);
/* 607 */       if (i == -1) {
/* 608 */         i = this.c++;
/* 609 */         this.b.a(☃, i);
/*     */       } 
/*     */       
/* 612 */       return i;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public ceh a(int ☃) {
/* 617 */       ceh ceh1 = this.b.a(☃);
/* 618 */       return (ceh1 == null) ? a : ceh1;
/*     */     }
/*     */ 
/*     */     
/*     */     public Iterator<ceh> iterator() {
/* 623 */       return this.b.iterator();
/*     */     }
/*     */     private b() {}
/*     */     public void a(ceh ☃, int i) {
/* 627 */       this.b.a(☃, i);
/*     */     }
/*     */   }
/*     */   
/*     */   public md a(md ☃) {
/* 632 */     if (this.a.isEmpty()) {
/* 633 */       ☃.a("blocks", new mj());
/* 634 */       ☃.a("palette", new mj());
/*     */     } else {
/* 636 */       List<b> list = Lists.newArrayList();
/* 637 */       b b = new b();
/* 638 */       list.add(b);
/*     */       
/* 640 */       for (int i = 1; i < this.a.size(); i++) {
/* 641 */         list.add(new b());
/*     */       }
/*     */       
/* 644 */       mj mj1 = new mj();
/* 645 */       List<c> list1 = ((a)this.a.get(0)).a();
/* 646 */       for (int j = 0; j < list1.size(); j++) {
/* 647 */         c c = list1.get(j);
/* 648 */         md md1 = new md();
/* 649 */         md1.a("pos", a(new int[] { c.a.u(), c.a.v(), c.a.w() }));
/* 650 */         int k = b.a(c.b);
/* 651 */         md1.b("state", k);
/* 652 */         if (c.c != null) {
/* 653 */           md1.a("nbt", c.c);
/*     */         }
/* 655 */         mj1.add(md1);
/*     */         
/* 657 */         for (int m = 1; m < this.a.size(); m++) {
/* 658 */           b b1 = list.get(m);
/* 659 */           b1.a(((c)((a)this.a.get(m)).a().get(j)).b, k);
/*     */         } 
/*     */       } 
/* 662 */       ☃.a("blocks", mj1);
/*     */       
/* 664 */       if (list.size() == 1) {
/* 665 */         mj mj2 = new mj();
/* 666 */         for (ceh ceh : b) {
/* 667 */           mj2.add(mp.a(ceh));
/*     */         }
/* 669 */         ☃.a("palette", mj2);
/*     */       } else {
/* 671 */         mj mj2 = new mj();
/* 672 */         for (b b1 : list) {
/* 673 */           mj mj3 = new mj();
/* 674 */           for (ceh ceh : b1) {
/* 675 */             mj3.add(mp.a(ceh));
/*     */           }
/* 677 */           mj2.add(mj3);
/*     */         } 
/* 679 */         ☃.a("palettes", mj2);
/*     */       } 
/*     */     } 
/*     */     
/* 683 */     mj mj = new mj();
/* 684 */     for (d d : this.b) {
/* 685 */       md md1 = new md();
/* 686 */       md1.a("pos", a(new double[] { d.a.b, d.a.c, d.a.d }));
/* 687 */       md1.a("blockPos", a(new int[] { d.b.u(), d.b.v(), d.b.w() }));
/* 688 */       if (d.c != null) {
/* 689 */         md1.a("nbt", d.c);
/*     */       }
/* 691 */       mj.add(md1);
/*     */     } 
/*     */     
/* 694 */     ☃.a("entities", mj);
/* 695 */     ☃.a("size", a(new int[] { this.c.u(), this.c.v(), this.c.w() }));
/* 696 */     ☃.b("DataVersion", w.a().getWorldVersion());
/*     */     
/* 698 */     return ☃;
/*     */   }
/*     */   
/*     */   public void b(md ☃) {
/* 702 */     this.a.clear();
/* 703 */     this.b.clear();
/*     */     
/* 705 */     mj mj1 = ☃.d("size", 3);
/* 706 */     this.c = new fx(mj1.e(0), mj1.e(1), mj1.e(2));
/*     */     
/* 708 */     mj mj2 = ☃.d("blocks", 10);
/* 709 */     if (☃.c("palettes", 9)) {
/* 710 */       mj mj = ☃.d("palettes", 9);
/* 711 */       for (int j = 0; j < mj.size(); j++) {
/* 712 */         a(mj.b(j), mj2);
/*     */       }
/*     */     } else {
/* 715 */       a(☃.d("palette", 10), mj2);
/*     */     } 
/*     */     
/* 718 */     mj mj3 = ☃.d("entities", 10);
/* 719 */     for (int i = 0; i < mj3.size(); i++) {
/* 720 */       md md1 = mj3.a(i);
/* 721 */       mj mj4 = md1.d("pos", 6);
/* 722 */       dcn dcn = new dcn(mj4.h(0), mj4.h(1), mj4.h(2));
/* 723 */       mj mj5 = md1.d("blockPos", 3);
/* 724 */       fx fx1 = new fx(mj5.e(0), mj5.e(1), mj5.e(2));
/* 725 */       if (md1.e("nbt")) {
/* 726 */         md md2 = md1.p("nbt");
/* 727 */         this.b.add(new d(dcn, fx1, md2));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(mj ☃, mj mj1) {
/* 733 */     b b = new b();
/*     */     
/* 735 */     for (int i = 0; i < ☃.size(); i++) {
/* 736 */       b.a(mp.c(☃.a(i)), i);
/*     */     }
/*     */     
/* 739 */     List<c> list1 = Lists.newArrayList();
/* 740 */     List<c> list2 = Lists.newArrayList();
/* 741 */     List<c> list3 = Lists.newArrayList();
/*     */     
/* 743 */     for (int j = 0; j < mj1.size(); j++) {
/* 744 */       md md2, md1 = mj1.a(j);
/* 745 */       mj mj2 = md1.d("pos", 3);
/* 746 */       fx fx1 = new fx(mj2.e(0), mj2.e(1), mj2.e(2));
/* 747 */       ceh ceh = b.a(md1.h("state"));
/*     */       
/* 749 */       if (md1.e("nbt")) {
/* 750 */         md2 = md1.p("nbt");
/*     */       } else {
/* 752 */         md2 = null;
/*     */       } 
/* 754 */       c c = new c(fx1, ceh, md2);
/*     */       
/* 756 */       a(c, list1, list2, list3);
/*     */     } 
/*     */     
/* 759 */     List<c> list4 = a(list1, list2, list3);
/*     */     
/* 761 */     this.a.add(new a(list4));
/*     */   }
/*     */   
/*     */   private mj a(int... ☃) {
/* 765 */     mj mj = new mj();
/* 766 */     for (int i : ☃) {
/* 767 */       mj.add(mi.a(i));
/*     */     }
/* 769 */     return mj;
/*     */   }
/*     */   
/*     */   private mj a(double... ☃) {
/* 773 */     mj mj = new mj();
/* 774 */     for (double d : ☃) {
/* 775 */       mj.add(me.a(d));
/*     */     }
/* 777 */     return mj;
/*     */   }
/*     */   
/*     */   public static class c {
/*     */     public final fx a;
/*     */     public final ceh b;
/*     */     public final md c;
/*     */     
/*     */     public c(fx ☃, ceh ceh1, @Nullable md md1) {
/* 786 */       this.a = ☃;
/* 787 */       this.b = ceh1;
/* 788 */       this.c = md1;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 793 */       return String.format("<StructureBlockInfo | %s | %s | %s>", new Object[] { this.a, this.b, this.c });
/*     */     }
/*     */   }
/*     */   
/*     */   public static class d {
/*     */     public final dcn a;
/*     */     public final fx b;
/*     */     public final md c;
/*     */     
/*     */     public d(dcn ☃, fx fx1, md md1) {
/* 803 */       this.a = ☃;
/* 804 */       this.b = fx1;
/* 805 */       this.c = md1;
/*     */     }
/*     */   }
/*     */   
/*     */   public static final class a
/*     */   {
/*     */     private final List<ctb.c> a;
/* 812 */     private final Map<buo, List<ctb.c>> b = Maps.newHashMap();
/*     */     
/*     */     private a(List<ctb.c> ☃) {
/* 815 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public List<ctb.c> a() {
/* 819 */       return this.a;
/*     */     }
/*     */     
/*     */     public List<ctb.c> a(buo ☃) {
/* 823 */       return this.b.computeIfAbsent(☃, ☃ -> (List)this.a.stream().filter(()).collect(Collectors.toList()));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
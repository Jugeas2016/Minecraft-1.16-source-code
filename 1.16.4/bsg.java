/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMaps;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Random;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class bsg
/*     */ {
/*  49 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   private static final int b = (int)Math.pow(17.0D, 2.0D); private static final aqo[] c; static {
/*  55 */     c = (aqo[])Stream.<aqo>of(aqo.values()).filter(☃ -> (☃ != aqo.f)).toArray(☃ -> new aqo[☃]);
/*     */   }
/*     */   
/*     */   public static class d {
/*     */     private final int a;
/*     */     private final Object2IntOpenHashMap<aqo> b;
/*     */     private final bsj c;
/*     */     private final Object2IntMap<aqo> d;
/*     */     @Nullable
/*     */     private fx e;
/*     */     @Nullable
/*     */     private aqe<?> f;
/*     */     private double g;
/*     */     
/*     */     private d(int ☃, Object2IntOpenHashMap<aqo> object2IntOpenHashMap, bsj bsj1) {
/*  70 */       this.a = ☃;
/*  71 */       this.b = object2IntOpenHashMap;
/*  72 */       this.c = bsj1;
/*  73 */       this.d = Object2IntMaps.unmodifiable((Object2IntMap)object2IntOpenHashMap);
/*     */     }
/*     */     
/*     */     private boolean a(aqe<?> ☃, fx fx1, cfw cfw1) {
/*  77 */       this.e = fx1;
/*  78 */       this.f = ☃;
/*     */       
/*  80 */       btg.b b = bsg.a(fx1, cfw1).b().a(☃);
/*  81 */       if (b == null) {
/*  82 */         this.g = 0.0D;
/*  83 */         return true;
/*     */       } 
/*  85 */       double d1 = b.b();
/*  86 */       this.g = d1;
/*  87 */       double d2 = this.c.b(fx1, d1);
/*  88 */       return (d2 <= b.a());
/*     */     }
/*     */     private void a(aqn ☃, cfw cfw1) {
/*     */       double d1;
/*  92 */       aqe<?> aqe1 = ☃.X();
/*     */       
/*  94 */       fx fx1 = ☃.cB();
/*  95 */       if (fx1.equals(this.e) && aqe1 == this.f) {
/*  96 */         d1 = this.g;
/*     */       } else {
/*     */         
/*  99 */         btg.b b = bsg.a(fx1, cfw1).b().a(aqe1);
/* 100 */         if (b != null) {
/* 101 */           d1 = b.b();
/*     */         } else {
/* 103 */           d1 = 0.0D;
/*     */         } 
/*     */       } 
/* 106 */       this.c.a(fx1, d1);
/* 107 */       this.b.addTo(aqe1.e(), 1);
/*     */     }
/*     */     
/*     */     public int a() {
/* 111 */       return this.a;
/*     */     }
/*     */     
/*     */     public Object2IntMap<aqo> b() {
/* 115 */       return this.d;
/*     */     }
/*     */     
/*     */     private boolean a(aqo ☃) {
/* 119 */       int i = ☃.c() * this.a / bsg.a();
/* 120 */       return (this.b.getInt(☃) < i);
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
/*     */   public static d a(int ☃, Iterable<aqa> iterable, b b1) {
/* 143 */     bsj bsj = new bsj();
/* 144 */     Object2IntOpenHashMap<aqo> object2IntOpenHashMap = new Object2IntOpenHashMap();
/*     */     
/* 146 */     for (Iterator<aqa> iterator = iterable.iterator(); iterator.hasNext(); ) { aqa aqa = iterator.next();
/* 147 */       if (aqa instanceof aqn) {
/* 148 */         aqn aqn = (aqn)aqa;
/* 149 */         if (aqn.eu() || aqn.K()) {
/*     */           continue;
/*     */         }
/*     */       } 
/* 153 */       aqo aqo1 = aqa.X().e();
/* 154 */       if (aqo1 == aqo.f) {
/*     */         continue;
/*     */       }
/*     */       
/* 158 */       fx fx = aqa.cB();
/* 159 */       long l = brd.a(fx.u() >> 4, fx.w() >> 4);
/*     */       
/* 161 */       b1.query(l, cgh1 -> {
/*     */             btg.b b = b(☃, cgh1).b().a(aqa1.X());
/*     */             if (b != null) {
/*     */               bsj1.a(aqa1.cB(), b.b());
/*     */             }
/*     */             object2IntOpenHashMap.addTo(aqo1, 1);
/*     */           }); }
/*     */     
/* 169 */     return new d(☃, object2IntOpenHashMap, bsj);
/*     */   }
/*     */ 
/*     */   
/*     */   private static bsv b(fx ☃, cfw cfw1) {
/* 174 */     return bti.a.a(0L, ☃.u(), ☃.v(), ☃.w(), cfw1.i());
/*     */   }
/*     */   
/*     */   public static void a(aag ☃, cgh cgh1, d d1, boolean bool1, boolean bool2, boolean bool3) {
/* 178 */     ☃.Z().a("spawner");
/*     */     
/* 180 */     for (aqo aqo1 : c) {
/* 181 */       if ((bool1 || !aqo1.d()) && (bool2 || aqo1
/* 182 */         .d()) && (bool3 || 
/* 183 */         !aqo1.e()) && 
/* 184 */         d.a(d1, aqo1)) {
/* 185 */         a(aqo1, ☃, cgh1, (aqe1, fx1, cfw1) -> d.a(☃, aqe1, fx1, cfw1), (aqn1, cfw1) -> d.a(☃, aqn1, cfw1));
/*     */       }
/*     */     } 
/* 188 */     ☃.Z().c();
/*     */   }
/*     */   
/*     */   public static void a(aqo ☃, aag aag1, cgh cgh1, c c1, a a1) {
/* 192 */     fx fx = a(aag1, cgh1);
/*     */     
/* 194 */     if (fx.v() < 1) {
/*     */       return;
/*     */     }
/* 197 */     a(☃, aag1, cgh1, fx, c1, a1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void a(aqo ☃, aag aag1, cfw cfw1, fx fx1, c c1, a a1)
/*     */   {
/* 206 */     bsn bsn = aag1.a();
/* 207 */     cfy cfy = aag1.i().g();
/* 208 */     int i = fx1.v();
/*     */     
/* 210 */     ceh ceh = cfw1.d_(fx1);
/* 211 */     if (ceh.g(cfw1, fx1)) {
/*     */       return;
/*     */     }
/*     */     
/* 215 */     fx.a a2 = new fx.a();
/* 216 */     int j = 0;
/*     */     
/* 218 */     for (int k = 0; k < 3; k++) {
/* 219 */       int m = fx1.u();
/* 220 */       int n = fx1.w();
/* 221 */       int i1 = 6;
/*     */       
/* 223 */       btg.c c2 = null;
/* 224 */       arc arc = null;
/*     */       
/* 226 */       int i2 = afm.f(aag1.t.nextFloat() * 4.0F);
/* 227 */       int i3 = 0;
/*     */ 
/*     */       
/* 230 */       for (int i4 = 0; i4 < i2; i4++) {
/* 231 */         m += aag1.t.nextInt(6) - aag1.t.nextInt(6);
/* 232 */         n += aag1.t.nextInt(6) - aag1.t.nextInt(6);
/*     */         
/* 234 */         a2.d(m, i, n);
/*     */         
/* 236 */         double d1 = m + 0.5D;
/* 237 */         double d2 = n + 0.5D;
/*     */         
/* 239 */         bfw bfw = aag1.a(d1, i, d2, -1.0D, false);
/* 240 */         if (bfw != null) {
/*     */ 
/*     */ 
/*     */           
/* 244 */           double d = bfw.h(d1, i, d2);
/* 245 */           if (a(aag1, cfw1, a2, d)) {
/*     */ 
/*     */ 
/*     */             
/* 249 */             if (c2 == null) {
/* 250 */               c2 = a(aag1, bsn, cfy, ☃, aag1.t, a2);
/* 251 */               if (c2 == null) {
/*     */                 break;
/*     */               }
/*     */ 
/*     */               
/* 256 */               i2 = c2.d + aag1.t.nextInt(1 + c2.e - c2.d);
/*     */             } 
/*     */             
/* 259 */             if (a(aag1, ☃, bsn, cfy, c2, a2, d))
/*     */             {
/*     */ 
/*     */               
/* 263 */               if (c1.test(c2.c, a2, cfw1)) {
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 268 */                 aqn aqn = a(aag1, c2.c);
/* 269 */                 if (aqn == null) {
/*     */                   return;
/*     */                 }
/*     */                 
/* 273 */                 aqn.b(d1, i, d2, aag1.t.nextFloat() * 360.0F, 0.0F);
/*     */                 
/* 275 */                 if (a(aag1, aqn, d)) {
/*     */ 
/*     */ 
/*     */                   
/* 279 */                   arc = aqn.a(aag1, aag1.d(aqn.cB()), aqp.a, arc, (md)null);
/*     */                   
/* 281 */                   j++;
/* 282 */                   i3++;
/* 283 */                   aag1.l(aqn);
/* 284 */                   a1.run(aqn, cfw1);
/*     */                   
/* 286 */                   if (j >= aqn.eq()) {
/*     */                     return;
/*     */                   }
/* 289 */                   if (aqn.c(i3))
/*     */                     break; 
/*     */                 } 
/*     */               }  } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }  } private static boolean a(aag ☃, cfw cfw1, fx.a a1, double d) {
/* 297 */     if (d <= 576.0D) {
/* 298 */       return false;
/*     */     }
/* 300 */     if (☃.u().a(new dcn(a1.u() + 0.5D, a1.v(), a1.w() + 0.5D), 24.0D)) {
/* 301 */       return false;
/*     */     }
/*     */     
/* 304 */     brd brd = new brd(a1);
/* 305 */     if (!Objects.equals(brd, cfw1.g()) && !☃.i().a(brd)) {
/* 306 */       return false;
/*     */     }
/* 308 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean a(aag ☃, aqo aqo1, bsn bsn1, cfy cfy1, btg.c c1, fx.a a1, double d) {
/* 312 */     aqe<?> aqe = c1.c;
/*     */     
/* 314 */     if (aqe.e() == aqo.f) {
/* 315 */       return false;
/*     */     }
/*     */     
/* 318 */     if (!aqe.d() && d > (aqe.e().f() * aqe.e().f())) {
/* 319 */       return false;
/*     */     }
/*     */     
/* 322 */     if (!aqe.b() || !a(☃, bsn1, cfy1, aqo1, c1, a1)) {
/* 323 */       return false;
/*     */     }
/*     */     
/* 326 */     ard.c c2 = ard.a(aqe);
/* 327 */     if (!a(c2, ☃, a1, aqe)) {
/* 328 */       return false;
/*     */     }
/* 330 */     if (!ard.a(aqe, ☃, aqp.a, a1, ☃.t)) {
/* 331 */       return false;
/*     */     }
/* 333 */     if (!☃.b(aqe.a(a1.u() + 0.5D, a1.v(), a1.w() + 0.5D))) {
/* 334 */       return false;
/*     */     }
/* 336 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static aqn a(aag ☃, aqe<?> aqe1) {
/*     */     aqn aqn;
/*     */     try {
/* 343 */       aqa aqa = (aqa)aqe1.a(☃);
/* 344 */       if (!(aqa instanceof aqn)) {
/* 345 */         throw new IllegalStateException("Trying to spawn a non-mob: " + gm.S.b(aqe1));
/*     */       }
/* 347 */       aqn = (aqn)aqa;
/* 348 */     } catch (Exception exception) {
/* 349 */       a.warn("Failed to create mob", exception);
/* 350 */       return null;
/*     */     } 
/* 352 */     return aqn;
/*     */   }
/*     */   
/*     */   private static boolean a(aag ☃, aqn aqn1, double d) {
/* 356 */     if (d > (aqn1.X().e().f() * aqn1.X().e().f()) && aqn1.h(d)) {
/* 357 */       return false;
/*     */     }
/* 359 */     if (!aqn1.a(☃, aqp.a) || !aqn1.a(☃)) {
/* 360 */       return false;
/*     */     }
/* 362 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static btg.c a(aag ☃, bsn bsn1, cfy cfy1, aqo aqo1, Random random, fx fx1) {
/* 367 */     bsv bsv = ☃.v(fx1);
/*     */     
/* 369 */     if (aqo1 == aqo.e && bsv.t() == bsv.b.n && random.nextFloat() < 0.98F) {
/* 370 */       return null;
/*     */     }
/* 372 */     List<btg.c> list = a(☃, bsn1, cfy1, aqo1, fx1, bsv);
/* 373 */     if (list.isEmpty()) {
/* 374 */       return null;
/*     */     }
/*     */     
/* 377 */     return afz.<btg.c>a(random, list);
/*     */   }
/*     */   
/*     */   private static boolean a(aag ☃, bsn bsn1, cfy cfy1, aqo aqo1, btg.c c1, fx fx1) {
/* 381 */     return a(☃, bsn1, cfy1, aqo1, fx1, (bsv)null).contains(c1);
/*     */   }
/*     */ 
/*     */   
/*     */   private static List<btg.c> a(aag ☃, bsn bsn1, cfy cfy1, aqo aqo1, fx fx1, @Nullable bsv bsv1) {
/* 386 */     if (aqo1 == aqo.a && ☃.d_(fx1.c()).b() == bup.dV && bsn1.a(fx1, false, cla.n).e()) {
/* 387 */       return cla.n.c();
/*     */     }
/* 389 */     return cfy1.a((bsv1 != null) ? bsv1 : ☃.v(fx1), bsn1, aqo1, fx1);
/*     */   }
/*     */   
/*     */   private static fx a(brx ☃, cgh cgh1) {
/* 393 */     brd brd = cgh1.g();
/* 394 */     int i = brd.d() + ☃.t.nextInt(16);
/* 395 */     int j = brd.e() + ☃.t.nextInt(16);
/*     */     
/* 397 */     int k = cgh1.a(chn.a.b, i, j) + 1;
/* 398 */     int m = ☃.t.nextInt(k + 1);
/*     */     
/* 400 */     return new fx(i, m, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(brc ☃, fx fx1, ceh ceh1, cux cux1, aqe<?> aqe1) {
/* 405 */     if (ceh1.r(☃, fx1)) {
/* 406 */       return false;
/*     */     }
/*     */     
/* 409 */     if (ceh1.i()) {
/* 410 */       return false;
/*     */     }
/*     */     
/* 413 */     if (!cux1.c()) {
/* 414 */       return false;
/*     */     }
/*     */     
/* 417 */     if (ceh1.a(aed.aA)) {
/* 418 */       return false;
/*     */     }
/*     */     
/* 421 */     if (aqe1.a(ceh1)) {
/* 422 */       return false;
/*     */     }
/* 424 */     return true; } @FunctionalInterface
/*     */   public static interface c {
/*     */     boolean test(aqe<?> param1aqe, fx param1fx, cfw param1cfw); } @FunctionalInterface
/*     */   public static interface a {
/* 428 */     void run(aqn param1aqn, cfw param1cfw); } public static boolean a(ard.c ☃, brz brz1, fx fx1, @Nullable aqe<?> aqe1) { if (☃ == ard.c.c) {
/* 429 */       return true;
/*     */     }
/* 431 */     if (aqe1 == null || !brz1.f().a(fx1)) {
/* 432 */       return false;
/*     */     }
/* 434 */     ceh ceh1 = brz1.d_(fx1);
/* 435 */     cux cux = brz1.b(fx1);
/*     */     
/* 437 */     fx fx2 = fx1.b();
/* 438 */     fx fx3 = fx1.c();
/* 439 */     switch (null.a[☃.ordinal()]) {
/*     */       
/*     */       case 1:
/* 442 */         return (cux.a(aef.b) && brz1.b(fx3).a(aef.b) && !brz1.d_(fx2).g(brz1, fx2));
/*     */       case 2:
/* 444 */         return cux.a(aef.c);
/*     */     } 
/*     */     
/* 447 */     ceh ceh2 = brz1.d_(fx3);
/* 448 */     if (!ceh2.a(brz1, fx3, aqe1)) {
/* 449 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 453 */     return (a(brz1, fx1, ceh1, cux, aqe1) && a(brz1, fx2, brz1.d_(fx2), brz1.b(fx2), aqe1)); }
/*     */    @FunctionalInterface
/*     */   public static interface b {
/*     */     void query(long param1Long, Consumer<cgh> param1Consumer); }
/*     */   public static void a(bsk ☃, bsv bsv1, int i, int j, Random random) {
/* 458 */     btg btg = bsv1.b();
/* 459 */     List<btg.c> list = btg.a(aqo.b);
/* 460 */     if (list.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 464 */     int k = i << 4;
/* 465 */     int m = j << 4;
/*     */     
/* 467 */     while (random.nextFloat() < btg.a()) {
/* 468 */       btg.c c = afz.<btg.c>a(random, list);
/*     */       
/* 470 */       int n = c.d + random.nextInt(1 + c.e - c.d);
/* 471 */       arc arc = null;
/*     */       
/* 473 */       int i1 = k + random.nextInt(16);
/* 474 */       int i2 = m + random.nextInt(16);
/* 475 */       int i3 = i1;
/* 476 */       int i4 = i2;
/*     */       
/* 478 */       for (int i5 = 0; i5 < n; i5++) {
/* 479 */         boolean bool = false;
/* 480 */         for (int i6 = 0; !bool && i6 < 4; i6++) {
/*     */ 
/*     */           
/* 483 */           fx fx = a(☃, c.c, i1, i2);
/* 484 */           if (c.c.b() && a(ard.a(c.c), ☃, fx, c.c)) {
/* 485 */             aqa aqa; float f = c.c.j();
/* 486 */             double d1 = afm.a(i1, k + f, k + 16.0D - f);
/* 487 */             double d2 = afm.a(i2, m + f, m + 16.0D - f);
/*     */             
/* 489 */             if (!☃.b(c.c.a(d1, fx.v(), d2))) {
/*     */               continue;
/*     */             }
/*     */             
/* 493 */             if (!ard.a(c.c, ☃, aqp.b, new fx(d1, fx.v(), d2), ☃.u_())) {
/*     */               continue;
/*     */             }
/*     */ 
/*     */             
/*     */             try {
/* 499 */               aqa = (aqa)c.c.a(☃.E());
/* 500 */             } catch (Exception exception) {
/* 501 */               a.warn("Failed to create mob", exception);
/*     */             } 
/*     */ 
/*     */             
/* 505 */             aqa.b(d1, fx.v(), d2, random.nextFloat() * 360.0F, 0.0F);
/*     */             
/* 507 */             if (aqa instanceof aqn) {
/* 508 */               aqn aqn = (aqn)aqa;
/* 509 */               if (aqn.a(☃, aqp.b) && aqn.a(☃)) {
/* 510 */                 arc = aqn.a(☃, ☃.d(aqn.cB()), aqp.b, arc, (md)null);
/* 511 */                 ☃.l(aqn);
/* 512 */                 bool = true;
/*     */               } 
/*     */             } 
/*     */           } 
/*     */           
/* 517 */           i1 += random.nextInt(5) - random.nextInt(5);
/* 518 */           i2 += random.nextInt(5) - random.nextInt(5);
/* 519 */           while (i1 < k || i1 >= k + 16 || i2 < m || i2 >= m + 16) {
/* 520 */             i1 = i3 + random.nextInt(5) - random.nextInt(5);
/* 521 */             i2 = i4 + random.nextInt(5) - random.nextInt(5);
/*     */           } 
/*     */           continue;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private static fx a(brz ☃, aqe<?> aqe1, int i, int j) {
/* 529 */     int k = ☃.a(ard.b(aqe1), i, j);
/* 530 */     fx.a a = new fx.a(i, k, j);
/*     */     
/* 532 */     if (☃.k().c()) {
/*     */       
/*     */       do {
/* 535 */         a.c(gc.a);
/* 536 */       } while (!☃.d_(a).g());
/*     */       do {
/* 538 */         a.c(gc.a);
/* 539 */       } while (☃.d_(a).g() && a.v() > 0);
/*     */     } 
/*     */     
/* 542 */     if (ard.a(aqe1) == ard.c.a) {
/* 543 */       fx fx = a.c();
/* 544 */       if (☃.d_(fx).a(☃, fx, cxe.a)) {
/* 545 */         return fx;
/*     */       }
/*     */     } 
/*     */     
/* 549 */     return a.h();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
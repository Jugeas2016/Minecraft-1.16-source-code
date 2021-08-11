/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Map;
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
/*     */ public class bzd
/*     */   extends buo
/*     */ {
/*  37 */   public static final cfe<cfl> a = cex.X;
/*  38 */   public static final cfe<cfl> b = cex.W;
/*  39 */   public static final cfe<cfl> c = cex.Y;
/*  40 */   public static final cfe<cfl> d = cex.Z;
/*  41 */   public static final cfg e = cex.az;
/*     */   
/*  43 */   public static final Map<gc, cfe<cfl>> f = Maps.newEnumMap((Map)ImmutableMap.of(gc.c, a, gc.f, b, gc.d, c, gc.e, d));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  57 */   private static final ddh g = buo.a(3.0D, 0.0D, 3.0D, 13.0D, 1.0D, 13.0D);
/*  58 */   private static final Map<gc, ddh> h = Maps.newEnumMap((Map)ImmutableMap.of(gc.c, 
/*  59 */         buo.a(3.0D, 0.0D, 0.0D, 13.0D, 1.0D, 13.0D), gc.d, 
/*  60 */         buo.a(3.0D, 0.0D, 3.0D, 13.0D, 1.0D, 16.0D), gc.f, 
/*  61 */         buo.a(3.0D, 0.0D, 3.0D, 16.0D, 1.0D, 13.0D), gc.e, 
/*  62 */         buo.a(0.0D, 0.0D, 3.0D, 13.0D, 1.0D, 13.0D)));
/*     */   
/*  64 */   private static final Map<gc, ddh> i = Maps.newEnumMap((Map)ImmutableMap.of(gc.c, 
/*  65 */         dde.a(h.get(gc.c), buo.a(3.0D, 0.0D, 0.0D, 13.0D, 16.0D, 1.0D)), gc.d, 
/*  66 */         dde.a(h.get(gc.d), buo.a(3.0D, 0.0D, 15.0D, 13.0D, 16.0D, 16.0D)), gc.f, 
/*  67 */         dde.a(h.get(gc.f), buo.a(15.0D, 0.0D, 3.0D, 16.0D, 16.0D, 13.0D)), gc.e, 
/*  68 */         dde.a(h.get(gc.e), buo.a(0.0D, 0.0D, 3.0D, 1.0D, 16.0D, 13.0D))));
/*     */ 
/*     */   
/*  71 */   private final Map<ceh, ddh> j = Maps.newHashMap();
/*     */   
/*  73 */   private static final g[] k = new g[16];
/*     */   static {
/*  75 */     for (int ☃ = 0; ☃ <= 15; ☃++) {
/*  76 */       float f1 = ☃ / 15.0F;
/*  77 */       float f2 = f1 * 0.6F + ((f1 > 0.0F) ? 0.4F : 0.3F);
/*  78 */       float f3 = afm.a(f1 * f1 * 0.7F - 0.5F, 0.0F, 1.0F);
/*  79 */       float f4 = afm.a(f1 * f1 * 0.6F - 0.7F, 0.0F, 1.0F);
/*  80 */       k[☃] = new g(f2, f3, f4);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private final ceh o;
/*     */   private boolean p = true;
/*     */   
/*     */   public bzd(ceg.c ☃) {
/*  89 */     super(☃);
/*  90 */     j(((ceh)this.n.b()).a(a, cfl.c).a(b, cfl.c).a(c, cfl.c).a(d, cfl.c).a(e, Integer.valueOf(0)));
/*  91 */     this.o = n().a(a, cfl.b).a(b, cfl.b).a(c, cfl.b).a(d, cfl.b);
/*  92 */     for (UnmodifiableIterator<ceh> unmodifiableIterator = m().a().iterator(); unmodifiableIterator.hasNext(); ) { ceh ceh1 = unmodifiableIterator.next();
/*  93 */       if (((Integer)ceh1.c(e)).intValue() == 0) {
/*  94 */         this.j.put(ceh1, l(ceh1));
/*     */       } }
/*     */   
/*     */   }
/*     */   
/*     */   private ddh l(ceh ☃) {
/* 100 */     ddh ddh1 = g;
/* 101 */     for (gc gc : gc.c.a) {
/* 102 */       cfl cfl = (cfl)☃.c(f.get(gc));
/* 103 */       if (cfl == cfl.b) {
/* 104 */         ddh1 = dde.a(ddh1, h.get(gc)); continue;
/* 105 */       }  if (cfl == cfl.a) {
/* 106 */         ddh1 = dde.a(ddh1, i.get(gc));
/*     */       }
/*     */     } 
/* 109 */     return ddh1;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 114 */     return this.j.get(☃.a(e, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 119 */     return a(☃.p(), this.o, ☃.a());
/*     */   }
/*     */   
/*     */   private ceh a(brc ☃, ceh ceh1, fx fx1) {
/* 123 */     boolean bool1 = n(ceh1);
/* 124 */     ceh1 = b(☃, n().a(e, ceh1.c(e)), fx1);
/*     */ 
/*     */     
/* 127 */     if (bool1 && n(ceh1)) {
/* 128 */       return ceh1;
/*     */     }
/*     */     
/* 131 */     boolean bool2 = ((cfl)ceh1.c(a)).b();
/* 132 */     boolean bool3 = ((cfl)ceh1.c(c)).b();
/* 133 */     boolean bool4 = ((cfl)ceh1.c(b)).b();
/* 134 */     boolean bool5 = ((cfl)ceh1.c(d)).b();
/* 135 */     boolean bool6 = (!bool2 && !bool3);
/* 136 */     boolean bool7 = (!bool4 && !bool5);
/*     */     
/* 138 */     if (!bool5 && bool6) {
/* 139 */       ceh1 = ceh1.a(d, cfl.b);
/*     */     }
/* 141 */     if (!bool4 && bool6) {
/* 142 */       ceh1 = ceh1.a(b, cfl.b);
/*     */     }
/* 144 */     if (!bool2 && bool7) {
/* 145 */       ceh1 = ceh1.a(a, cfl.b);
/*     */     }
/* 147 */     if (!bool3 && bool7) {
/* 148 */       ceh1 = ceh1.a(c, cfl.b);
/*     */     }
/* 150 */     return ceh1;
/*     */   }
/*     */   
/*     */   private ceh b(brc ☃, ceh ceh1, fx fx1) {
/* 154 */     boolean bool = !☃.d_(fx1.b()).g(☃, fx1);
/* 155 */     for (gc gc : gc.c.a) {
/* 156 */       if (!((cfl)ceh1.c(f.get(gc))).b()) {
/* 157 */         cfl cfl = a(☃, fx1, gc, bool);
/* 158 */         ceh1 = ceh1.a(f.get(gc), cfl);
/*     */       } 
/*     */     } 
/* 161 */     return ceh1;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 166 */     if (gc1 == gc.a) {
/* 167 */       return ☃;
/*     */     }
/* 169 */     if (gc1 == gc.b) {
/* 170 */       return a(bry1, ☃, fx1);
/*     */     }
/*     */     
/* 173 */     cfl cfl = a(bry1, fx1, gc1);
/* 174 */     if (cfl.b() == ((cfl)☃.c(f.get(gc1))).b() && !m(☃)) {
/* 175 */       return ☃.a(f.get(gc1), cfl);
/*     */     }
/* 177 */     return a(bry1, this.o.a(e, ☃.c(e)).a(f.get(gc1), cfl), fx1);
/*     */   }
/*     */   
/*     */   private static boolean m(ceh ☃) {
/* 181 */     return (((cfl)☃.c(a)).b() && ((cfl)☃.c(c)).b() && ((cfl)☃.c(b)).b() && ((cfl)☃.c(d)).b());
/*     */   }
/*     */   
/*     */   private static boolean n(ceh ☃) {
/* 185 */     return (!((cfl)☃.c(a)).b() && !((cfl)☃.c(c)).b() && !((cfl)☃.c(b)).b() && !((cfl)☃.c(d)).b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, bry bry1, fx fx1, int i, int j) {
/* 190 */     fx.a a = new fx.a();
/* 191 */     for (gc gc : gc.c.a) {
/* 192 */       cfl cfl = (cfl)☃.c(f.get(gc));
/* 193 */       if (cfl != cfl.c && !bry1.d_(a.a(fx1, gc)).a(this)) {
/* 194 */         a.c(gc.a);
/* 195 */         ceh ceh1 = bry1.d_(a);
/* 196 */         if (!ceh1.a(bup.iO)) {
/* 197 */           fx fx2 = a.a(gc.f());
/* 198 */           ceh ceh3 = ceh1.a(gc.f(), bry1.d_(fx2), bry1, a, fx2);
/* 199 */           a(ceh1, ceh3, bry1, a, i, j);
/*     */         } 
/*     */         
/* 202 */         a.a(fx1, gc).c(gc.b);
/* 203 */         ceh ceh2 = bry1.d_(a);
/* 204 */         if (!ceh2.a(bup.iO)) {
/* 205 */           fx fx2 = a.a(gc.f());
/* 206 */           ceh ceh3 = ceh2.a(gc.f(), bry1.d_(fx2), bry1, a, fx2);
/* 207 */           a(ceh2, ceh3, bry1, a, i, j);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private cfl a(brc ☃, fx fx1, gc gc1) {
/* 214 */     return a(☃, fx1, gc1, !☃.d_(fx1.b()).g(☃, fx1));
/*     */   }
/*     */   
/*     */   private cfl a(brc ☃, fx fx1, gc gc1, boolean bool) {
/* 218 */     fx fx2 = fx1.a(gc1);
/* 219 */     ceh ceh1 = ☃.d_(fx2);
/* 220 */     if (bool) {
/* 221 */       boolean bool1 = b(☃, fx2, ceh1);
/* 222 */       if (bool1 && h(☃.d_(fx2.b()))) {
/*     */ 
/*     */         
/* 225 */         if (ceh1.d(☃, fx2, gc1.f())) {
/* 226 */           return cfl.a;
/*     */         }
/* 228 */         return cfl.b;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 233 */     if (a(ceh1, gc1) || (!ceh1.g(☃, fx2) && h(☃.d_(fx2.c())))) {
/* 234 */       return cfl.b;
/*     */     }
/* 236 */     return cfl.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 241 */     fx fx2 = fx1.c();
/* 242 */     ceh ceh1 = brz1.d_(fx2);
/* 243 */     return b(brz1, fx2, ceh1);
/*     */   }
/*     */   
/*     */   private boolean b(brc ☃, fx fx1, ceh ceh1) {
/* 247 */     return (ceh1.d(☃, fx1, gc.b) || ceh1.a(bup.fy));
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, ceh ceh1) {
/* 251 */     int i = a(☃, fx1);
/*     */     
/* 253 */     if (((Integer)ceh1.c(e)).intValue() != i) {
/* 254 */       if (☃.d_(fx1) == ceh1) {
/* 255 */         ☃.a(fx1, ceh1.a(e, Integer.valueOf(i)), 2);
/*     */       }
/*     */ 
/*     */       
/* 259 */       Set<fx> set = Sets.newHashSet();
/* 260 */       set.add(fx1);
/* 261 */       for (gc gc : gc.values()) {
/* 262 */         set.add(fx1.a(gc));
/*     */       }
/* 264 */       for (fx fx2 : set) {
/* 265 */         ☃.b(fx2, this);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private int a(brx ☃, fx fx1) {
/* 271 */     this.p = false;
/* 272 */     int i = ☃.s(fx1);
/* 273 */     this.p = true;
/*     */     
/* 275 */     int j = 0;
/* 276 */     if (i < 15) {
/* 277 */       for (gc gc : gc.c.a) {
/* 278 */         fx fx2 = fx1.a(gc);
/* 279 */         ceh ceh1 = ☃.d_(fx2);
/*     */         
/* 281 */         j = Math.max(j, o(ceh1));
/*     */         
/* 283 */         fx fx3 = fx1.b();
/* 284 */         if (ceh1.g(☃, fx2) && !☃.d_(fx3).g(☃, fx3)) {
/* 285 */           j = Math.max(j, o(☃.d_(fx2.b()))); continue;
/* 286 */         }  if (!ceh1.g(☃, fx2)) {
/* 287 */           j = Math.max(j, o(☃.d_(fx2.c())));
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 292 */     return Math.max(i, j - 1);
/*     */   }
/*     */   
/*     */   private int o(ceh ☃) {
/* 296 */     return ☃.a(this) ? ((Integer)☃.c(e)).intValue() : 0;
/*     */   }
/*     */   
/*     */   private void b(brx ☃, fx fx1) {
/* 300 */     if (!☃.d_(fx1).a(this)) {
/*     */       return;
/*     */     }
/*     */     
/* 304 */     ☃.b(fx1, this);
/* 305 */     for (gc gc : gc.values()) {
/* 306 */       ☃.b(fx1.a(gc), this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 312 */     if (ceh1.a(☃.b()) || brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/* 316 */     a(brx1, fx1, ☃);
/*     */     
/* 318 */     for (gc gc : gc.c.b) {
/* 319 */       brx1.b(fx1.a(gc), this);
/*     */     }
/*     */     
/* 322 */     d(brx1, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 327 */     if (bool || ☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 330 */     super.a(☃, brx1, fx1, ceh1, bool);
/* 331 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/* 335 */     for (gc gc : gc.values()) {
/* 336 */       brx1.b(fx1.a(gc), this);
/*     */     }
/* 338 */     a(brx1, fx1, ☃);
/*     */     
/* 340 */     d(brx1, fx1);
/*     */   }
/*     */   
/*     */   private void d(brx ☃, fx fx1) {
/* 344 */     for (gc gc : gc.c.a) {
/* 345 */       b(☃, fx1.a(gc));
/*     */     }
/*     */     
/* 348 */     for (gc gc : gc.c.a) {
/* 349 */       fx fx2 = fx1.a(gc);
/*     */       
/* 351 */       if (☃.d_(fx2).g(☃, fx2)) {
/* 352 */         b(☃, fx2.b()); continue;
/*     */       } 
/* 354 */       b(☃, fx2.c());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/* 361 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/* 365 */     if (☃.a(brx1, fx1)) {
/* 366 */       a(brx1, fx1, ☃);
/*     */     } else {
/* 368 */       c(☃, brx1, fx1);
/* 369 */       brx1.a(fx1, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 375 */     if (!this.p) {
/* 376 */       return 0;
/*     */     }
/* 378 */     return ☃.b(brc1, fx1, gc1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 383 */     if (!this.p || gc1 == gc.a) {
/* 384 */       return 0;
/*     */     }
/* 386 */     int i = ((Integer)☃.c(e)).intValue();
/* 387 */     if (i == 0) {
/* 388 */       return 0;
/*     */     }
/*     */     
/* 391 */     if (gc1 == gc.b || ((cfl)a(brc1, ☃, fx1).c(f.get(gc1.f()))).b()) {
/* 392 */       return i;
/*     */     }
/* 394 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected static boolean h(ceh ☃) {
/* 399 */     return a(☃, (gc)null);
/*     */   }
/*     */   
/*     */   protected static boolean a(ceh ☃, @Nullable gc gc1) {
/* 403 */     if (☃.a(bup.bS)) {
/* 404 */       return true;
/*     */     }
/*     */     
/* 407 */     if (☃.a(bup.cX)) {
/* 408 */       gc gc2 = (gc)☃.c(bzi.aq);
/* 409 */       return (gc2 == gc1 || gc2.f() == gc1);
/*     */     } 
/*     */     
/* 412 */     if (☃.a(bup.iO)) {
/* 413 */       return (gc1 == ☃.c(byq.a));
/*     */     }
/*     */     
/* 416 */     return (☃.i() && gc1 != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/* 421 */     return this.p;
/*     */   }
/*     */   
/*     */   public static int b(int ☃) {
/* 425 */     g g1 = k[☃];
/* 426 */     return afm.e(g1.a(), g1.b(), g1.c());
/*     */   }
/*     */   
/*     */   private void a(brx ☃, Random random, fx fx1, g g1, gc gc1, gc gc2, float f1, float f2) {
/* 430 */     float f3 = f2 - f1;
/* 431 */     if (random.nextFloat() >= 0.2F * f3) {
/*     */       return;
/*     */     }
/* 434 */     float f4 = 0.4375F;
/* 435 */     float f5 = f1 + f3 * random.nextFloat();
/* 436 */     double d1 = 0.5D + (0.4375F * gc1.i()) + (f5 * gc2.i());
/* 437 */     double d2 = 0.5D + (0.4375F * gc1.j()) + (f5 * gc2.j());
/* 438 */     double d3 = 0.5D + (0.4375F * gc1.k()) + (f5 * gc2.k());
/* 439 */     ☃.a(new hd(g1.a(), g1.b(), g1.c(), 1.0F), fx1.u() + d1, fx1.v() + d2, fx1.w() + d3, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 444 */     int i = ((Integer)☃.c(e)).intValue();
/* 445 */     if (i == 0) {
/*     */       return;
/*     */     }
/* 448 */     for (gc gc : gc.c.a) {
/* 449 */       cfl cfl = (cfl)☃.c(f.get(gc));
/* 450 */       switch (null.a[cfl.ordinal()]) {
/*     */         case 1:
/* 452 */           a(brx1, random, fx1, k[i], gc, gc.b, -0.5F, 0.5F);
/*     */         
/*     */         case 2:
/* 455 */           a(brx1, random, fx1, k[i], gc.a, gc, 0.0F, 0.5F);
/*     */           continue;
/*     */       } 
/*     */       
/* 459 */       a(brx1, random, fx1, k[i], gc.a, gc, 0.0F, 0.3F);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 466 */     switch (null.b[bzm1.ordinal()]) {
/*     */       case 1:
/* 468 */         return ☃.a(a, ☃.c(c)).a(b, ☃.c(d)).a(c, ☃.c(a)).a(d, ☃.c(b));
/*     */       case 2:
/* 470 */         return ☃.a(a, ☃.c(b)).a(b, ☃.c(c)).a(c, ☃.c(d)).a(d, ☃.c(a));
/*     */       case 3:
/* 472 */         return ☃.a(a, ☃.c(d)).a(b, ☃.c(a)).a(c, ☃.c(b)).a(d, ☃.c(c));
/*     */     } 
/* 474 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 480 */     switch (null.c[byg1.ordinal()]) {
/*     */       case 1:
/* 482 */         return ☃.a(a, ☃.c(c)).a(c, ☃.c(a));
/*     */       case 2:
/* 484 */         return ☃.a(b, ☃.c(d)).a(d, ☃.c(b));
/*     */     } 
/*     */ 
/*     */     
/* 488 */     return super.a(☃, byg1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 493 */     ☃.a((cfj<?>[])new cfj[] { a, b, c, d, e });
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 498 */     if (!bfw1.bC.e) {
/* 499 */       return aou.c;
/*     */     }
/*     */     
/* 502 */     if (m(☃) || n(☃)) {
/* 503 */       ceh ceh1 = m(☃) ? n() : this.o;
/* 504 */       ceh1 = ceh1.a(e, ☃.c(e));
/* 505 */       ceh1 = a(brx1, ceh1, fx1);
/* 506 */       if (ceh1 != ☃) {
/* 507 */         brx1.a(fx1, ceh1, 3);
/*     */         
/* 509 */         a(brx1, fx1, ☃, ceh1);
/* 510 */         return aou.a;
/*     */       } 
/*     */     } 
/* 513 */     return aou.c;
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, ceh ceh1, ceh ceh2) {
/* 517 */     for (gc gc : gc.c.a) {
/* 518 */       fx fx2 = fx1.a(gc);
/* 519 */       if (((cfl)ceh1.c(f.get(gc))).b() != ((cfl)ceh2.c(f.get(gc))).b() && ☃.d_(fx2).g(☃, fx2))
/* 520 */         ☃.a(fx2, ceh2.b(), gc.f()); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
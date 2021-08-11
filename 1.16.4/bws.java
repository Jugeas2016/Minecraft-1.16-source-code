/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bws
/*     */   extends bue
/*     */ {
/*  32 */   public static final cfg b = cex.aj;
/*     */   
/*  34 */   public static final cey c = bys.a;
/*  35 */   public static final cey d = bys.b;
/*  36 */   public static final cey e = bys.c;
/*  37 */   public static final cey f = bys.d; private static final Map<gc, cey> h;
/*  38 */   public static final cey g = bys.e;
/*     */   static {
/*  40 */     h = (Map<gc, cey>)bys.g.entrySet().stream().filter(☃ -> (☃.getKey() != gc.a)).collect(x.a());
/*     */   }
/*  42 */   private static final ddh i = buo.a(0.0D, 15.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  43 */   private static final ddh j = buo.a(0.0D, 0.0D, 0.0D, 1.0D, 16.0D, 16.0D);
/*  44 */   private static final ddh k = buo.a(15.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  45 */   private static final ddh o = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 1.0D);
/*  46 */   private static final ddh p = buo.a(0.0D, 0.0D, 15.0D, 16.0D, 16.0D, 16.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Map<ceh, ddh> q;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  61 */   private final Object2IntMap<buo> r = (Object2IntMap<buo>)new Object2IntOpenHashMap();
/*  62 */   private final Object2IntMap<buo> s = (Object2IntMap<buo>)new Object2IntOpenHashMap();
/*     */   
/*     */   public bws(ceg.c ☃) {
/*  65 */     super(☃, 1.0F);
/*  66 */     j(((ceh)this.n.b()).a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
/*     */     
/*  68 */     this.q = (Map<ceh, ddh>)ImmutableMap.copyOf((Map)this.n.a().stream().filter(☃ -> (((Integer)☃.c(b)).intValue() == 0)).collect(Collectors.toMap(Function.identity(), bws::h)));
/*     */   }
/*     */   
/*     */   private static ddh h(ceh ☃) {
/*  72 */     ddh ddh1 = dde.a();
/*  73 */     if (((Boolean)☃.c(g)).booleanValue()) {
/*  74 */       ddh1 = i;
/*     */     }
/*  76 */     if (((Boolean)☃.c(c)).booleanValue()) {
/*  77 */       ddh1 = dde.a(ddh1, o);
/*     */     }
/*  79 */     if (((Boolean)☃.c(e)).booleanValue()) {
/*  80 */       ddh1 = dde.a(ddh1, p);
/*     */     }
/*  82 */     if (((Boolean)☃.c(d)).booleanValue()) {
/*  83 */       ddh1 = dde.a(ddh1, k);
/*     */     }
/*  85 */     if (((Boolean)☃.c(f)).booleanValue()) {
/*  86 */       ddh1 = dde.a(ddh1, j);
/*     */     }
/*  88 */     return ddh1.b() ? a : ddh1;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  93 */     if (a(☃, bry1, fx1)) {
/*  94 */       return a(bry1, fx1, ((Integer)☃.c(b)).intValue());
/*     */     }
/*     */     
/*  97 */     return bup.a.n();
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 102 */     return this.q.get(☃.a(b, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 107 */     return b(☃.p(), ☃.a());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected ceh b(brc ☃, fx fx1) {
/* 113 */     fx fx2 = fx1.c();
/* 114 */     ceh ceh1 = ☃.d_(fx2);
/* 115 */     if (e(ceh1) || ceh1.d(☃, fx2, gc.b)) {
/* 116 */       return n();
/*     */     }
/*     */     
/* 119 */     ceh ceh2 = n();
/* 120 */     for (gc gc : gc.values()) {
/* 121 */       cey cey1 = h.get(gc);
/* 122 */       if (cey1 != null) {
/* 123 */         ceh2 = ceh2.a(cey1, Boolean.valueOf(e(☃.d_(fx1.a(gc)))));
/*     */       }
/*     */     } 
/*     */     
/* 127 */     return ceh2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 132 */     fx fx2 = fx1.c();
/* 133 */     return (brz1.d_(fx2).d(brz1, fx2, gc.b) || e(brz1, fx1));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 139 */     aag1.j().a(fx1, this, a(aag1.t));
/*     */     
/* 141 */     if (!aag1.V().b(brt.a)) {
/*     */       return;
/*     */     }
/*     */     
/* 145 */     if (!☃.a(aag1, fx1)) {
/* 146 */       aag1.a(fx1, false);
/*     */     }
/*     */     
/* 149 */     ceh ceh1 = aag1.d_(fx1.c());
/* 150 */     boolean bool1 = ceh1.a(aag1.k().o());
/*     */     
/* 152 */     int i = ((Integer)☃.c(b)).intValue();
/* 153 */     if (!bool1 && aag1.X() && a(aag1, fx1) && random.nextFloat() < 0.2F + i * 0.03F) {
/* 154 */       aag1.a(fx1, false);
/*     */       
/*     */       return;
/*     */     } 
/* 158 */     int j = Math.min(15, i + random.nextInt(3) / 2);
/* 159 */     if (i != j) {
/* 160 */       ☃ = ☃.a(b, Integer.valueOf(j));
/* 161 */       aag1.a(fx1, ☃, 4);
/*     */     } 
/*     */     
/* 164 */     if (!bool1) {
/* 165 */       if (!e(aag1, fx1)) {
/* 166 */         fx fx2 = fx1.c();
/* 167 */         if (!aag1.d_(fx2).d(aag1, fx2, gc.b) || i > 3) {
/* 168 */           aag1.a(fx1, false);
/*     */         }
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 174 */       if (i == 15 && random.nextInt(4) == 0 && !e(aag1.d_(fx1.c()))) {
/* 175 */         aag1.a(fx1, false);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 180 */     boolean bool2 = aag1.u(fx1);
/* 181 */     int k = bool2 ? -50 : 0;
/*     */     
/* 183 */     a(aag1, fx1.g(), 300 + k, random, i);
/* 184 */     a(aag1, fx1.f(), 300 + k, random, i);
/* 185 */     a(aag1, fx1.c(), 250 + k, random, i);
/* 186 */     a(aag1, fx1.b(), 250 + k, random, i);
/* 187 */     a(aag1, fx1.d(), 300 + k, random, i);
/* 188 */     a(aag1, fx1.e(), 300 + k, random, i);
/*     */     
/* 190 */     fx.a a = new fx.a();
/* 191 */     for (int m = -1; m <= 1; m++) {
/* 192 */       for (int n = -1; n <= 1; n++) {
/* 193 */         for (int i1 = -1; i1 <= 4; i1++) {
/* 194 */           if (m != 0 || i1 != 0 || n != 0) {
/*     */ 
/*     */ 
/*     */             
/* 198 */             int i2 = 100;
/* 199 */             if (i1 > 1) {
/* 200 */               i2 += (i1 - 1) * 100;
/*     */             }
/*     */             
/* 203 */             a.a(fx1, m, i1, n);
/* 204 */             int i3 = a(aag1, a);
/* 205 */             if (i3 > 0) {
/*     */ 
/*     */ 
/*     */               
/* 209 */               int i4 = (i3 + 40 + aag1.ad().a() * 7) / (i + 30);
/* 210 */               if (bool2) {
/* 211 */                 i4 /= 2;
/*     */               }
/* 213 */               if (i4 > 0 && random.nextInt(i2) <= i4 && (
/* 214 */                 !aag1.X() || !a(aag1, a))) {
/*     */ 
/*     */ 
/*     */                 
/* 218 */                 int i5 = Math.min(15, i + random.nextInt(5) / 4);
/* 219 */                 aag1.a(a, a(aag1, a, i5), 3);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   } protected boolean a(brx ☃, fx fx1) {
/* 227 */     return (☃.t(fx1) || ☃.t(fx1.f()) || ☃.t(fx1.g()) || ☃.t(fx1.d()) || ☃.t(fx1.e()));
/*     */   }
/*     */   
/*     */   private int l(ceh ☃) {
/* 231 */     if (☃.b(cex.C) && ((Boolean)☃.c(cex.C)).booleanValue()) {
/* 232 */       return 0;
/*     */     }
/* 234 */     return this.s.getInt(☃.b());
/*     */   }
/*     */   
/*     */   private int m(ceh ☃) {
/* 238 */     if (☃.b(cex.C) && ((Boolean)☃.c(cex.C)).booleanValue()) {
/* 239 */       return 0;
/*     */     }
/* 241 */     return this.r.getInt(☃.b());
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, int i, Random random, int j) {
/* 245 */     int k = l(☃.d_(fx1));
/* 246 */     if (random.nextInt(i) < k) {
/* 247 */       ceh ceh = ☃.d_(fx1);
/*     */       
/* 249 */       if (random.nextInt(j + 10) < 5 && !☃.t(fx1)) {
/* 250 */         int m = Math.min(j + random.nextInt(5) / 4, 15);
/* 251 */         ☃.a(fx1, a(☃, fx1, m), 3);
/*     */       } else {
/* 253 */         ☃.a(fx1, false);
/*     */       } 
/*     */       
/* 256 */       buo buo = ceh.b();
/* 257 */       if (buo instanceof caz) {
/* 258 */         (caz)buo; caz.a(☃, fx1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private ceh a(bry ☃, fx fx1, int i) {
/* 264 */     ceh ceh = a(☃, fx1);
/* 265 */     if (ceh.a(bup.bN)) {
/* 266 */       return ceh.a(b, Integer.valueOf(i));
/*     */     }
/*     */     
/* 269 */     return ceh;
/*     */   }
/*     */   
/*     */   private boolean e(brc ☃, fx fx1) {
/* 273 */     for (gc gc : gc.values()) {
/* 274 */       if (e(☃.d_(fx1.a(gc)))) {
/* 275 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 279 */     return false;
/*     */   }
/*     */   
/*     */   private int a(brz ☃, fx fx1) {
/* 283 */     if (!☃.w(fx1)) {
/* 284 */       return 0;
/*     */     }
/*     */     
/* 287 */     int i = 0;
/* 288 */     for (gc gc : gc.values()) {
/* 289 */       ceh ceh = ☃.d_(fx1.a(gc));
/* 290 */       i = Math.max(m(ceh), i);
/*     */     } 
/*     */     
/* 293 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean e(ceh ☃) {
/* 298 */     return (m(☃) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 303 */     super.b(☃, brx1, fx1, ceh1, bool);
/*     */     
/* 305 */     brx1.J().a(fx1, this, a(brx1.t));
/*     */   }
/*     */   
/*     */   private static int a(Random ☃) {
/* 309 */     return 30 + ☃.nextInt(10);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 314 */     ☃.a((cfj<?>[])new cfj[] { b, c, d, e, f, g });
/*     */   }
/*     */   
/*     */   private void a(buo ☃, int i, int j) {
/* 318 */     this.r.put(☃, i);
/* 319 */     this.s.put(☃, j);
/*     */   }
/*     */   
/*     */   public static void c() {
/* 323 */     bws ☃ = (bws)bup.bN;
/* 324 */     ☃.a(bup.n, 5, 20);
/* 325 */     ☃.a(bup.o, 5, 20);
/* 326 */     ☃.a(bup.p, 5, 20);
/* 327 */     ☃.a(bup.q, 5, 20);
/* 328 */     ☃.a(bup.r, 5, 20);
/* 329 */     ☃.a(bup.s, 5, 20);
/* 330 */     ☃.a(bup.hK, 5, 20);
/* 331 */     ☃.a(bup.hL, 5, 20);
/* 332 */     ☃.a(bup.hM, 5, 20);
/* 333 */     ☃.a(bup.hN, 5, 20);
/* 334 */     ☃.a(bup.hO, 5, 20);
/* 335 */     ☃.a(bup.hP, 5, 20);
/* 336 */     ☃.a(bup.dQ, 5, 20);
/* 337 */     ☃.a(bup.ih, 5, 20);
/* 338 */     ☃.a(bup.ii, 5, 20);
/* 339 */     ☃.a(bup.ij, 5, 20);
/* 340 */     ☃.a(bup.il, 5, 20);
/* 341 */     ☃.a(bup.ik, 5, 20);
/* 342 */     ☃.a(bup.cJ, 5, 20);
/* 343 */     ☃.a(bup.im, 5, 20);
/* 344 */     ☃.a(bup.in, 5, 20);
/* 345 */     ☃.a(bup.io, 5, 20);
/* 346 */     ☃.a(bup.iq, 5, 20);
/* 347 */     ☃.a(bup.ip, 5, 20);
/* 348 */     ☃.a(bup.bQ, 5, 20);
/* 349 */     ☃.a(bup.ep, 5, 20);
/* 350 */     ☃.a(bup.eo, 5, 20);
/* 351 */     ☃.a(bup.eq, 5, 20);
/* 352 */     ☃.a(bup.gl, 5, 20);
/* 353 */     ☃.a(bup.gm, 5, 20);
/* 354 */     ☃.a(bup.J, 5, 5);
/* 355 */     ☃.a(bup.K, 5, 5);
/* 356 */     ☃.a(bup.L, 5, 5);
/* 357 */     ☃.a(bup.M, 5, 5);
/* 358 */     ☃.a(bup.N, 5, 5);
/* 359 */     ☃.a(bup.O, 5, 5);
/* 360 */     ☃.a(bup.U, 5, 5);
/* 361 */     ☃.a(bup.P, 5, 5);
/* 362 */     ☃.a(bup.Q, 5, 5);
/* 363 */     ☃.a(bup.R, 5, 5);
/* 364 */     ☃.a(bup.S, 5, 5);
/* 365 */     ☃.a(bup.T, 5, 5);
/* 366 */     ☃.a(bup.ab, 5, 5);
/* 367 */     ☃.a(bup.ac, 5, 5);
/* 368 */     ☃.a(bup.ad, 5, 5);
/* 369 */     ☃.a(bup.ae, 5, 5);
/* 370 */     ☃.a(bup.af, 5, 5);
/* 371 */     ☃.a(bup.ag, 5, 5);
/* 372 */     ☃.a(bup.V, 5, 5);
/* 373 */     ☃.a(bup.W, 5, 5);
/* 374 */     ☃.a(bup.X, 5, 5);
/* 375 */     ☃.a(bup.Y, 5, 5);
/* 376 */     ☃.a(bup.Z, 5, 5);
/* 377 */     ☃.a(bup.aa, 5, 5);
/* 378 */     ☃.a(bup.ah, 30, 60);
/* 379 */     ☃.a(bup.ai, 30, 60);
/* 380 */     ☃.a(bup.aj, 30, 60);
/* 381 */     ☃.a(bup.ak, 30, 60);
/* 382 */     ☃.a(bup.al, 30, 60);
/* 383 */     ☃.a(bup.am, 30, 60);
/* 384 */     ☃.a(bup.bI, 30, 20);
/* 385 */     ☃.a(bup.bH, 15, 100);
/* 386 */     ☃.a(bup.aR, 60, 100);
/* 387 */     ☃.a(bup.aS, 60, 100);
/* 388 */     ☃.a(bup.aT, 60, 100);
/* 389 */     ☃.a(bup.gU, 60, 100);
/* 390 */     ☃.a(bup.gV, 60, 100);
/* 391 */     ☃.a(bup.gW, 60, 100);
/* 392 */     ☃.a(bup.gX, 60, 100);
/* 393 */     ☃.a(bup.gY, 60, 100);
/* 394 */     ☃.a(bup.gZ, 60, 100);
/* 395 */     ☃.a(bup.bp, 60, 100);
/* 396 */     ☃.a(bup.bq, 60, 100);
/* 397 */     ☃.a(bup.br, 60, 100);
/* 398 */     ☃.a(bup.bs, 60, 100);
/* 399 */     ☃.a(bup.bt, 60, 100);
/* 400 */     ☃.a(bup.bu, 60, 100);
/* 401 */     ☃.a(bup.bv, 60, 100);
/* 402 */     ☃.a(bup.bw, 60, 100);
/* 403 */     ☃.a(bup.bx, 60, 100);
/* 404 */     ☃.a(bup.by, 60, 100);
/* 405 */     ☃.a(bup.bz, 60, 100);
/* 406 */     ☃.a(bup.bB, 60, 100);
/* 407 */     ☃.a(bup.bA, 60, 100);
/* 408 */     ☃.a(bup.aY, 30, 60);
/* 409 */     ☃.a(bup.aZ, 30, 60);
/* 410 */     ☃.a(bup.ba, 30, 60);
/* 411 */     ☃.a(bup.bb, 30, 60);
/* 412 */     ☃.a(bup.bc, 30, 60);
/* 413 */     ☃.a(bup.bd, 30, 60);
/* 414 */     ☃.a(bup.be, 30, 60);
/* 415 */     ☃.a(bup.bf, 30, 60);
/* 416 */     ☃.a(bup.bg, 30, 60);
/* 417 */     ☃.a(bup.bh, 30, 60);
/* 418 */     ☃.a(bup.bi, 30, 60);
/* 419 */     ☃.a(bup.bj, 30, 60);
/* 420 */     ☃.a(bup.bk, 30, 60);
/* 421 */     ☃.a(bup.bl, 30, 60);
/* 422 */     ☃.a(bup.bm, 30, 60);
/* 423 */     ☃.a(bup.bn, 30, 60);
/* 424 */     ☃.a(bup.dP, 15, 100);
/* 425 */     ☃.a(bup.gS, 5, 5);
/* 426 */     ☃.a(bup.gA, 60, 20);
/* 427 */     ☃.a(bup.nb, 15, 20);
/* 428 */     ☃.a(bup.gB, 60, 20);
/* 429 */     ☃.a(bup.gC, 60, 20);
/* 430 */     ☃.a(bup.gD, 60, 20);
/* 431 */     ☃.a(bup.gE, 60, 20);
/* 432 */     ☃.a(bup.gF, 60, 20);
/* 433 */     ☃.a(bup.gG, 60, 20);
/* 434 */     ☃.a(bup.gH, 60, 20);
/* 435 */     ☃.a(bup.gI, 60, 20);
/* 436 */     ☃.a(bup.gJ, 60, 20);
/* 437 */     ☃.a(bup.gK, 60, 20);
/* 438 */     ☃.a(bup.gL, 60, 20);
/* 439 */     ☃.a(bup.gM, 60, 20);
/* 440 */     ☃.a(bup.gN, 60, 20);
/* 441 */     ☃.a(bup.gO, 60, 20);
/* 442 */     ☃.a(bup.gP, 60, 20);
/* 443 */     ☃.a(bup.gQ, 60, 20);
/* 444 */     ☃.a(bup.ke, 30, 60);
/* 445 */     ☃.a(bup.kY, 60, 60);
/* 446 */     ☃.a(bup.lQ, 60, 60);
/* 447 */     ☃.a(bup.lY, 30, 20);
/* 448 */     ☃.a(bup.na, 5, 20);
/* 449 */     ☃.a(bup.mg, 60, 100);
/* 450 */     ☃.a(bup.nd, 5, 20);
/* 451 */     ☃.a(bup.nc, 30, 20);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bws.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
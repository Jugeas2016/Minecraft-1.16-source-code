/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
/*     */ import java.util.EnumSet;
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
/*     */ public class cxj
/*     */   extends cxc
/*     */ {
/*     */   protected float j;
/*  37 */   private final Long2ObjectMap<cwz> k = (Long2ObjectMap<cwz>)new Long2ObjectOpenHashMap();
/*  38 */   private final Object2BooleanMap<dci> l = (Object2BooleanMap<dci>)new Object2BooleanOpenHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bsi ☃, aqn aqn1) {
/*  45 */     super.a(☃, aqn1);
/*  46 */     this.j = aqn1.a(cwz.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  51 */     this.b.a(cwz.h, this.j);
/*  52 */     this.k.clear();
/*  53 */     this.l.clear();
/*  54 */     super.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cxb b() {
/*  60 */     fx.a a = new fx.a();
/*  61 */     int ☃ = afm.c(this.b.cE());
/*  62 */     ceh ceh = this.a.d_(a.c(this.b.cD(), ☃, this.b.cH()));
/*     */     
/*  64 */     if (this.b.a(ceh.m().a())) {
/*  65 */       while (this.b.a(ceh.m().a())) {
/*  66 */         ☃++;
/*  67 */         ceh = this.a.d_(a.c(this.b.cD(), ☃, this.b.cH()));
/*     */       } 
/*  69 */       ☃--;
/*  70 */     } else if (e() && this.b.aE()) {
/*  71 */       while (ceh.b() == bup.A || ceh.m() == cuy.c.a(false)) {
/*  72 */         ☃++;
/*  73 */         ceh = this.a.d_(a.c(this.b.cD(), ☃, this.b.cH()));
/*     */       } 
/*  75 */       ☃--;
/*     */     }
/*  77 */     else if (this.b.ao()) {
/*  78 */       ☃ = afm.c(this.b.cE() + 0.5D);
/*     */     } else {
/*  80 */       fx fx1 = this.b.cB();
/*  81 */       while ((this.a.d_(fx1).g() || this.a.d_(fx1).a(this.a, fx1, cxe.a)) && fx1.v() > 0) {
/*  82 */         fx1 = fx1.c();
/*     */       }
/*  84 */       ☃ = fx1.b().v();
/*     */     } 
/*     */ 
/*     */     
/*  88 */     fx fx = this.b.cB();
/*  89 */     cwz cwz = a(this.b, fx.u(), ☃, fx.w());
/*     */     
/*  91 */     if (this.b.a(cwz) < 0.0F) {
/*  92 */       dci dci = this.b.cc();
/*     */       
/*  94 */       if (b(a.c(dci.a, ☃, dci.c)) || 
/*  95 */         b(a.c(dci.a, ☃, dci.f)) || 
/*  96 */         b(a.c(dci.d, ☃, dci.c)) || 
/*  97 */         b(a.c(dci.d, ☃, dci.f))) {
/*     */         
/*  99 */         cxb cxb1 = a(a);
/* 100 */         cxb1.l = a(this.b, cxb1.a());
/* 101 */         cxb1.k = this.b.a(cxb1.l);
/* 102 */         return cxb1;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 107 */     cxb cxb = a(fx.u(), ☃, fx.w());
/* 108 */     cxb.l = a(this.b, cxb.a());
/* 109 */     cxb.k = this.b.a(cxb.l);
/* 110 */     return cxb;
/*     */   }
/*     */   
/*     */   private boolean b(fx ☃) {
/* 114 */     cwz cwz = a(this.b, ☃);
/* 115 */     return (this.b.a(cwz) >= 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public cxh a(double ☃, double d1, double d2) {
/* 120 */     return new cxh(a(afm.c(☃), afm.c(d1), afm.c(d2)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(cxb[] ☃, cxb cxb1) {
/* 125 */     int i = 0;
/* 126 */     int j = 0;
/* 127 */     cwz cwz1 = a(this.b, cxb1.a, cxb1.b + 1, cxb1.c);
/* 128 */     cwz cwz2 = a(this.b, cxb1.a, cxb1.b, cxb1.c);
/*     */     
/* 130 */     if (this.b.a(cwz1) >= 0.0F && cwz2 != cwz.w) {
/* 131 */       j = afm.d(Math.max(1.0F, this.b.G));
/*     */     }
/*     */     
/* 134 */     double d = a(this.a, new fx(cxb1.a, cxb1.b, cxb1.c));
/*     */     
/* 136 */     cxb cxb2 = a(cxb1.a, cxb1.b, cxb1.c + 1, j, d, gc.d, cwz2);
/* 137 */     if (a(cxb2, cxb1)) {
/* 138 */       ☃[i++] = cxb2;
/*     */     }
/*     */     
/* 141 */     cxb cxb3 = a(cxb1.a - 1, cxb1.b, cxb1.c, j, d, gc.e, cwz2);
/* 142 */     if (a(cxb3, cxb1)) {
/* 143 */       ☃[i++] = cxb3;
/*     */     }
/*     */     
/* 146 */     cxb cxb4 = a(cxb1.a + 1, cxb1.b, cxb1.c, j, d, gc.f, cwz2);
/* 147 */     if (a(cxb4, cxb1)) {
/* 148 */       ☃[i++] = cxb4;
/*     */     }
/*     */     
/* 151 */     cxb cxb5 = a(cxb1.a, cxb1.b, cxb1.c - 1, j, d, gc.c, cwz2);
/* 152 */     if (a(cxb5, cxb1)) {
/* 153 */       ☃[i++] = cxb5;
/*     */     }
/*     */     
/* 156 */     cxb cxb6 = a(cxb1.a - 1, cxb1.b, cxb1.c - 1, j, d, gc.c, cwz2);
/* 157 */     if (a(cxb1, cxb3, cxb5, cxb6)) {
/* 158 */       ☃[i++] = cxb6;
/*     */     }
/*     */     
/* 161 */     cxb cxb7 = a(cxb1.a + 1, cxb1.b, cxb1.c - 1, j, d, gc.c, cwz2);
/* 162 */     if (a(cxb1, cxb4, cxb5, cxb7)) {
/* 163 */       ☃[i++] = cxb7;
/*     */     }
/*     */     
/* 166 */     cxb cxb8 = a(cxb1.a - 1, cxb1.b, cxb1.c + 1, j, d, gc.d, cwz2);
/* 167 */     if (a(cxb1, cxb3, cxb2, cxb8)) {
/* 168 */       ☃[i++] = cxb8;
/*     */     }
/*     */     
/* 171 */     cxb cxb9 = a(cxb1.a + 1, cxb1.b, cxb1.c + 1, j, d, gc.d, cwz2);
/* 172 */     if (a(cxb1, cxb4, cxb2, cxb9)) {
/* 173 */       ☃[i++] = cxb9;
/*     */     }
/*     */     
/* 176 */     return i;
/*     */   }
/*     */   
/*     */   private boolean a(cxb ☃, cxb cxb1) {
/* 180 */     return (☃ != null && !☃.i && (☃.k >= 0.0F || cxb1.k < 0.0F));
/*     */   }
/*     */   
/*     */   private boolean a(cxb ☃, @Nullable cxb cxb1, @Nullable cxb cxb2, @Nullable cxb cxb3) {
/* 184 */     if (cxb3 == null || cxb2 == null || cxb1 == null) {
/* 185 */       return false;
/*     */     }
/*     */     
/* 188 */     if (cxb3.i) {
/* 189 */       return false;
/*     */     }
/*     */     
/* 192 */     if (cxb2.b > ☃.b || cxb1.b > ☃.b) {
/* 193 */       return false;
/*     */     }
/*     */     
/* 196 */     if (cxb1.l == cwz.d || cxb2.l == cwz.d || cxb3.l == cwz.d)
/*     */     {
/* 198 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 202 */     boolean bool = (cxb2.l == cwz.f && cxb1.l == cwz.f && this.b.cy() < 0.5D);
/*     */     
/* 204 */     return (cxb3.k >= 0.0F && (cxb2.b < ☃.b || cxb2.k >= 0.0F || bool) && (cxb1.b < ☃.b || cxb1.k >= 0.0F || bool));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean a(cxb ☃) {
/* 213 */     dcn dcn = new dcn(☃.a - this.b.cD(), ☃.b - this.b.cE(), ☃.c - this.b.cH());
/*     */     
/* 215 */     dci dci = this.b.cc();
/* 216 */     int i = afm.f(dcn.f() / dci.a());
/* 217 */     dcn = dcn.a((1.0F / i));
/* 218 */     for (int j = 1; j <= i; j++) {
/* 219 */       dci = dci.c(dcn);
/* 220 */       if (a(dci)) {
/* 221 */         return false;
/*     */       }
/*     */     } 
/* 224 */     return true;
/*     */   }
/*     */   
/*     */   public static double a(brc ☃, fx fx1) {
/* 228 */     fx fx2 = fx1.c();
/* 229 */     ddh ddh = ☃.d_(fx2).k(☃, fx2);
/* 230 */     return fx2.v() + (ddh.b() ? 0.0D : ddh.c(gc.a.b));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private cxb a(int ☃, int i, int j, int k, double d, gc gc1, cwz cwz1) {
/* 235 */     cxb cxb = null;
/* 236 */     fx.a a = new fx.a();
/*     */     
/* 238 */     double d1 = a(this.a, a.d(☃, i, j));
/*     */ 
/*     */     
/* 241 */     if (d1 - d > 1.125D) {
/* 242 */       return null;
/*     */     }
/*     */     
/* 245 */     cwz cwz2 = a(this.b, ☃, i, j);
/*     */     
/* 247 */     float f = this.b.a(cwz2);
/* 248 */     double d2 = this.b.cy() / 2.0D;
/*     */     
/* 250 */     if (f >= 0.0F) {
/* 251 */       cxb = a(☃, i, j);
/* 252 */       cxb.l = cwz2;
/* 253 */       cxb.k = Math.max(cxb.k, f);
/*     */     } 
/*     */ 
/*     */     
/* 257 */     if (cwz1 == cwz.f && cxb != null && cxb.k >= 0.0F && !a(cxb)) {
/* 258 */       cxb = null;
/*     */     }
/*     */     
/* 261 */     if (cwz2 == cwz.c) {
/* 262 */       return cxb;
/*     */     }
/*     */     
/* 265 */     if ((cxb == null || cxb.k < 0.0F) && k > 0 && cwz2 != cwz.f && cwz2 != cwz.k && cwz2 != cwz.e) {
/* 266 */       cxb = a(☃, i + 1, j, k - 1, d, gc1, cwz1);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 271 */       if (cxb != null && (cxb.l == cwz.b || cxb.l == cwz.c) && this.b.cy() < 1.0F) {
/* 272 */         double d3 = (☃ - gc1.i()) + 0.5D;
/* 273 */         double d4 = (j - gc1.k()) + 0.5D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 280 */         dci dci = new dci(d3 - d2, a(this.a, a.c(d3, (i + 1), d4)) + 0.001D, d4 - d2, d3 + d2, this.b.cz() + a(this.a, a.c(cxb.a, cxb.b, cxb.c)) - 0.002D, d4 + d2);
/*     */ 
/*     */         
/* 283 */         if (a(dci)) {
/* 284 */           cxb = null;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 289 */     if (cwz2 == cwz.h && !e()) {
/* 290 */       if (a(this.b, ☃, i - 1, j) != cwz.h) {
/* 291 */         return cxb;
/*     */       }
/*     */ 
/*     */       
/* 295 */       while (i > 0) {
/* 296 */         i--;
/*     */         
/* 298 */         cwz2 = a(this.b, ☃, i, j);
/*     */         
/* 300 */         if (cwz2 == cwz.h) {
/* 301 */           cxb = a(☃, i, j);
/* 302 */           cxb.l = cwz2;
/* 303 */           cxb.k = Math.max(cxb.k, this.b.a(cwz2)); continue;
/*     */         } 
/* 305 */         return cxb;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 310 */     if (cwz2 == cwz.b) {
/*     */ 
/*     */       
/* 313 */       int m = 0;
/* 314 */       int n = i;
/* 315 */       while (cwz2 == cwz.b) {
/* 316 */         i--;
/*     */         
/* 318 */         if (i < 0) {
/* 319 */           cxb cxb1 = a(☃, n, j);
/* 320 */           cxb1.l = cwz.a;
/* 321 */           cxb1.k = -1.0F;
/* 322 */           return cxb1;
/*     */         } 
/*     */         
/* 325 */         if (m++ >= this.b.bP()) {
/* 326 */           cxb cxb1 = a(☃, i, j);
/* 327 */           cxb1.l = cwz.a;
/* 328 */           cxb1.k = -1.0F;
/* 329 */           return cxb1;
/*     */         } 
/*     */         
/* 332 */         cwz2 = a(this.b, ☃, i, j);
/* 333 */         f = this.b.a(cwz2);
/*     */         
/* 335 */         if (cwz2 != cwz.b && f >= 0.0F) {
/* 336 */           cxb = a(☃, i, j);
/* 337 */           cxb.l = cwz2;
/* 338 */           cxb.k = Math.max(cxb.k, f); break;
/*     */         } 
/* 340 */         if (f < 0.0F) {
/* 341 */           cxb cxb1 = a(☃, i, j);
/* 342 */           cxb1.l = cwz.a;
/* 343 */           cxb1.k = -1.0F;
/* 344 */           return cxb1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 349 */     if (cwz2 == cwz.f) {
/* 350 */       cxb = a(☃, i, j);
/* 351 */       cxb.i = true;
/* 352 */       cxb.l = cwz2;
/* 353 */       cxb.k = cwz2.a();
/*     */     } 
/*     */     
/* 356 */     return cxb;
/*     */   }
/*     */   
/*     */   private boolean a(dci ☃) {
/* 360 */     return ((Boolean)this.l.computeIfAbsent(☃, dci1 -> Boolean.valueOf(!this.a.a_(this.b, ☃)))).booleanValue();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cwz a(brc ☃, int i, int j, int k, aqn aqn1, int m, int n, int i1, boolean bool1, boolean bool2) {
/* 366 */     EnumSet<cwz> enumSet = EnumSet.noneOf(cwz.class);
/* 367 */     cwz cwz1 = cwz.a;
/*     */     
/* 369 */     fx fx = aqn1.cB();
/*     */     
/* 371 */     cwz1 = a(☃, i, j, k, m, n, i1, bool1, bool2, enumSet, cwz1, fx);
/*     */     
/* 373 */     if (enumSet.contains(cwz.f)) {
/* 374 */       return cwz.f;
/*     */     }
/*     */     
/* 377 */     if (enumSet.contains(cwz.k)) {
/* 378 */       return cwz.k;
/*     */     }
/*     */     
/* 381 */     cwz cwz2 = cwz.a;
/* 382 */     for (cwz cwz : enumSet) {
/*     */       
/* 384 */       if (aqn1.a(cwz) < 0.0F) {
/* 385 */         return cwz;
/*     */       }
/*     */ 
/*     */       
/* 389 */       if (aqn1.a(cwz) >= aqn1.a(cwz2)) {
/* 390 */         cwz2 = cwz;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 395 */     if (cwz1 == cwz.b && aqn1.a(cwz2) == 0.0F && m <= 1) {
/* 396 */       return cwz.b;
/*     */     }
/*     */     
/* 399 */     return cwz2;
/*     */   }
/*     */   
/*     */   public cwz a(brc ☃, int i, int j, int k, int m, int n, int i1, boolean bool1, boolean bool2, EnumSet<cwz> enumSet, cwz cwz1, fx fx1) {
/* 403 */     for (int i2 = 0; i2 < m; i2++) {
/* 404 */       for (int i3 = 0; i3 < n; i3++) {
/* 405 */         for (int i4 = 0; i4 < i1; i4++) {
/* 406 */           int i5 = i2 + i;
/* 407 */           int i6 = i3 + j;
/* 408 */           int i7 = i4 + k;
/*     */           
/* 410 */           cwz cwz2 = a(☃, i5, i6, i7);
/*     */           
/* 412 */           cwz2 = a(☃, bool1, bool2, fx1, cwz2);
/*     */           
/* 414 */           if (i2 == 0 && i3 == 0 && i4 == 0) {
/* 415 */             cwz1 = cwz2;
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 435 */           enumSet.add(cwz2);
/*     */         } 
/*     */       } 
/*     */     } 
/* 439 */     return cwz1;
/*     */   }
/*     */   
/*     */   protected cwz a(brc ☃, boolean bool1, boolean bool2, fx fx1, cwz cwz1) {
/* 443 */     if (cwz1 == cwz.s && bool1 && bool2) {
/* 444 */       cwz1 = cwz.d;
/*     */     }
/* 446 */     if (cwz1 == cwz.r && !bool2) {
/* 447 */       cwz1 = cwz.a;
/*     */     }
/* 449 */     if (cwz1 == cwz.j && !(☃.d_(fx1).b() instanceof bug) && !(☃.d_(fx1.c()).b() instanceof bug)) {
/* 450 */       cwz1 = cwz.k;
/*     */     }
/* 452 */     if (cwz1 == cwz.v) {
/* 453 */       cwz1 = cwz.a;
/*     */     }
/* 455 */     return cwz1;
/*     */   }
/*     */   
/*     */   private cwz a(aqn ☃, fx fx1) {
/* 459 */     return a(☃, fx1.u(), fx1.v(), fx1.w());
/*     */   }
/*     */   
/*     */   private cwz a(aqn ☃, int i, int j, int k) {
/* 463 */     return (cwz)this.k.computeIfAbsent(fx.a(i, j, k), l -> a(this.a, ☃, i, j, aqn1, this.d, this.e, this.f, d(), c()));
/*     */   }
/*     */ 
/*     */   
/*     */   public cwz a(brc ☃, int i, int j, int k) {
/* 468 */     return a(☃, new fx.a(i, j, k));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static cwz a(brc ☃, fx.a a1) {
/* 479 */     int i = a1.u();
/* 480 */     int j = a1.v();
/* 481 */     int k = a1.w();
/*     */     
/* 483 */     cwz cwz = b(☃, a1);
/*     */     
/* 485 */     if (cwz == cwz.b && j >= 1) {
/* 486 */       cwz cwz1 = b(☃, a1.d(i, j - 1, k));
/* 487 */       cwz = (cwz1 == cwz.c || cwz1 == cwz.b || cwz1 == cwz.h || cwz1 == cwz.g) ? cwz.b : cwz.c;
/*     */ 
/*     */       
/* 490 */       if (cwz1 == cwz.m) {
/* 491 */         cwz = cwz.m;
/*     */       }
/*     */       
/* 494 */       if (cwz1 == cwz.o) {
/* 495 */         cwz = cwz.o;
/*     */       }
/*     */       
/* 498 */       if (cwz1 == cwz.q) {
/* 499 */         cwz = cwz.q;
/*     */       }
/*     */       
/* 502 */       if (cwz1 == cwz.w) {
/* 503 */         cwz = cwz.w;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 508 */     if (cwz == cwz.c) {
/* 509 */       cwz = a(☃, a1.d(i, j, k), cwz);
/*     */     }
/* 511 */     return cwz;
/*     */   }
/*     */   
/*     */   public static cwz a(brc ☃, fx.a a1, cwz cwz1) {
/* 515 */     int i = a1.u();
/* 516 */     int j = a1.v();
/* 517 */     int k = a1.w();
/*     */     
/* 519 */     for (int m = -1; m <= 1; m++) {
/* 520 */       for (int n = -1; n <= 1; n++) {
/* 521 */         for (int i1 = -1; i1 <= 1; i1++) {
/* 522 */           if (m != 0 || i1 != 0) {
/* 523 */             a1.d(i + m, j + n, k + i1);
/* 524 */             ceh ceh = ☃.d_(a1);
/* 525 */             if (ceh.a(bup.cF))
/* 526 */               return cwz.n; 
/* 527 */             if (ceh.a(bup.mg))
/* 528 */               return cwz.p; 
/* 529 */             if (a(ceh))
/* 530 */               return cwz.l; 
/* 531 */             if (☃.b(a1).a(aef.b)) {
/* 532 */               return cwz.i;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 538 */     return cwz1;
/*     */   }
/*     */   
/*     */   protected static cwz b(brc ☃, fx fx1) {
/* 542 */     ceh ceh = ☃.d_(fx1);
/* 543 */     buo buo = ceh.b();
/* 544 */     cva cva = ceh.c();
/*     */     
/* 546 */     if (ceh.g()) {
/* 547 */       return cwz.b;
/*     */     }
/*     */     
/* 550 */     if (ceh.a(aed.J) || ceh.a(bup.dU)) {
/* 551 */       return cwz.e;
/*     */     }
/*     */     
/* 554 */     if (ceh.a(bup.cF)) {
/* 555 */       return cwz.o;
/*     */     }
/*     */     
/* 558 */     if (ceh.a(bup.mg)) {
/* 559 */       return cwz.q;
/*     */     }
/*     */     
/* 562 */     if (ceh.a(bup.ne)) {
/* 563 */       return cwz.w;
/*     */     }
/*     */     
/* 566 */     if (ceh.a(bup.eh)) {
/* 567 */       return cwz.x;
/*     */     }
/*     */     
/* 570 */     cux cux = ☃.b(fx1);
/* 571 */     if (cux.a(aef.b))
/* 572 */       return cwz.h; 
/* 573 */     if (cux.a(aef.c)) {
/* 574 */       return cwz.g;
/*     */     }
/*     */     
/* 577 */     if (a(ceh)) {
/* 578 */       return cwz.m;
/*     */     }
/*     */     
/* 581 */     if (bwb.l(ceh) && !((Boolean)ceh.c(bwb.b)).booleanValue())
/* 582 */       return cwz.s; 
/* 583 */     if (buo instanceof bwb && cva == cva.J && !((Boolean)ceh.c(bwb.b)).booleanValue())
/* 584 */       return cwz.t; 
/* 585 */     if (buo instanceof bwb && ((Boolean)ceh.c(bwb.b)).booleanValue()) {
/* 586 */       return cwz.r;
/*     */     }
/*     */     
/* 589 */     if (buo instanceof bug) {
/* 590 */       return cwz.j;
/*     */     }
/*     */     
/* 593 */     if (buo instanceof bxx) {
/* 594 */       return cwz.v;
/*     */     }
/*     */     
/* 597 */     if (buo.a(aed.M) || buo.a(aed.F) || (buo instanceof bwr && !((Boolean)ceh.c(bwr.a)).booleanValue())) {
/* 598 */       return cwz.f;
/*     */     }
/*     */ 
/*     */     
/* 602 */     if (!ceh.a(☃, fx1, cxe.a)) {
/* 603 */       return cwz.a;
/*     */     }
/*     */     
/* 606 */     return cwz.b;
/*     */   }
/*     */   
/*     */   private static boolean a(ceh ☃) {
/* 610 */     return (☃.a(aed.an) || ☃
/* 611 */       .a(bup.B) || ☃
/* 612 */       .a(bup.iJ) || 
/* 613 */       buy.g(☃));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
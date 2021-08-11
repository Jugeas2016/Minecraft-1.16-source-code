/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import com.mojang.datafixers.util.Pair;
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
/*     */ public abstract class dpp<T extends bic>
/*     */   extends dot
/*     */   implements dqq<T>
/*     */ {
/*  27 */   public static final vk a = new vk("textures/gui/container/inventory.png");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  35 */   protected int b = 176;
/*  36 */   protected int c = 166;
/*     */   
/*     */   protected int p;
/*     */   
/*     */   protected int q;
/*     */   
/*     */   protected int r;
/*     */   
/*     */   protected int s;
/*     */   protected final T t;
/*     */   protected final bfv u;
/*     */   @Nullable
/*     */   protected bjr v;
/*     */   @Nullable
/*     */   private bjr A;
/*     */   @Nullable
/*     */   private bjr B;
/*     */   @Nullable
/*     */   private bjr C;
/*     */   @Nullable
/*     */   private bjr D;
/*     */   protected int w;
/*     */   protected int x;
/*     */   private boolean E;
/*  60 */   private bmb F = bmb.b;
/*     */   private int G;
/*     */   private int H;
/*     */   private long I;
/*  64 */   private bmb J = bmb.b;
/*     */   
/*     */   private long K;
/*  67 */   protected final Set<bjr> y = Sets.newHashSet();
/*     */   protected boolean z;
/*     */   private int L;
/*     */   private int M;
/*     */   private boolean N;
/*     */   private int O;
/*     */   private long P;
/*     */   private int Q;
/*     */   private boolean R;
/*  76 */   private bmb S = bmb.b;
/*     */   
/*     */   public dpp(T ☃, bfv bfv1, nr nr1) {
/*  79 */     super(nr1);
/*  80 */     this.t = ☃;
/*  81 */     this.u = bfv1;
/*  82 */     this.N = true;
/*  83 */     this.p = 8;
/*  84 */     this.q = 6;
/*  85 */     this.r = 8;
/*  86 */     this.s = this.c - 94;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  91 */     super.b();
/*  92 */     this.w = (this.k - this.b) / 2;
/*  93 */     this.x = (this.l - this.c) / 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  98 */     int k = this.w;
/*  99 */     int m = this.x;
/*     */     
/* 101 */     a(☃, f, i, j);
/*     */     
/* 103 */     RenderSystem.disableRescaleNormal();
/* 104 */     RenderSystem.disableDepthTest();
/*     */     
/* 106 */     super.a(☃, i, j, f);
/*     */     
/* 108 */     RenderSystem.pushMatrix();
/* 109 */     RenderSystem.translatef(k, m, 0.0F);
/*     */     
/* 111 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 112 */     RenderSystem.enableRescaleNormal();
/*     */     
/* 114 */     this.v = null;
/*     */     
/* 116 */     int n = 240;
/* 117 */     int i1 = 240;
/* 118 */     RenderSystem.glMultiTexCoord2f(33986, 240.0F, 240.0F);
/* 119 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 121 */     for (int i2 = 0; i2 < ((bic)this.t).a.size(); i2++) {
/* 122 */       bjr bjr1 = ((bic)this.t).a.get(i2);
/*     */       
/* 124 */       if (bjr1.b()) {
/* 125 */         a(☃, bjr1);
/*     */       }
/*     */       
/* 128 */       if (a(bjr1, i, j) && bjr1.b()) {
/* 129 */         this.v = bjr1;
/*     */         
/* 131 */         RenderSystem.disableDepthTest();
/*     */         
/* 133 */         int i3 = bjr1.e;
/* 134 */         int i4 = bjr1.f;
/* 135 */         RenderSystem.colorMask(true, true, true, false);
/* 136 */         a(☃, i3, i4, i3 + 16, i4 + 16, -2130706433, -2130706433);
/* 137 */         RenderSystem.colorMask(true, true, true, true);
/* 138 */         RenderSystem.enableDepthTest();
/*     */       } 
/*     */     } 
/*     */     
/* 142 */     b(☃, i, j);
/*     */     
/* 144 */     bfv bfv1 = this.i.s.bm;
/* 145 */     bmb bmb1 = this.F.a() ? bfv1.m() : this.F;
/*     */     
/* 147 */     if (!bmb1.a()) {
/* 148 */       int i3 = 8;
/* 149 */       int i4 = this.F.a() ? 8 : 16;
/* 150 */       String str = null;
/*     */       
/* 152 */       if (!this.F.a() && this.E) {
/* 153 */         bmb1 = bmb1.i();
/* 154 */         bmb1.e(afm.f(bmb1.E() / 2.0F));
/* 155 */       } else if (this.z && this.y.size() > 1) {
/* 156 */         bmb1 = bmb1.i();
/* 157 */         bmb1.e(this.O);
/*     */         
/* 159 */         if (bmb1.a()) {
/* 160 */           str = "" + k.o + "0";
/*     */         }
/*     */       } 
/* 163 */       a(bmb1, i - k - 8, j - m - i4, str);
/*     */     } 
/*     */     
/* 166 */     if (!this.J.a()) {
/* 167 */       float f1 = (float)(x.b() - this.I) / 100.0F;
/*     */       
/* 169 */       if (f1 >= 1.0F) {
/* 170 */         f1 = 1.0F;
/* 171 */         this.J = bmb.b;
/*     */       } 
/*     */       
/* 174 */       int i3 = this.B.e - this.G;
/* 175 */       int i4 = this.B.f - this.H;
/* 176 */       int i5 = this.G + (int)(i3 * f1);
/* 177 */       int i6 = this.H + (int)(i4 * f1);
/*     */       
/* 179 */       a(this.J, i5, i6, (String)null);
/*     */     } 
/*     */     
/* 182 */     RenderSystem.popMatrix();
/*     */     
/* 184 */     RenderSystem.enableDepthTest();
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, int i, int j) {
/* 188 */     if (this.i.s.bm.m().a() && this.v != null && this.v.f()) {
/* 189 */       a(☃, this.v.e(), i, j);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(bmb ☃, int i, int j, String str) {
/* 194 */     RenderSystem.translatef(0.0F, 0.0F, 32.0F);
/* 195 */     d(200);
/* 196 */     this.j.b = 200.0F;
/*     */     
/* 198 */     this.j.b(☃, i, j);
/* 199 */     this.j.a(this.o, ☃, i, j - (this.F.a() ? 0 : 8), str);
/* 200 */     d(0);
/* 201 */     this.j.b = 0.0F;
/*     */   }
/*     */   
/*     */   protected void b(dfm ☃, int i, int j) {
/* 205 */     this.o.b(☃, this.d, this.p, this.q, 4210752);
/* 206 */     this.o.b(☃, this.u.d(), this.r, this.s, 4210752);
/*     */   }
/*     */   
/*     */   protected abstract void a(dfm paramdfm, float paramFloat, int paramInt1, int paramInt2);
/*     */   
/*     */   private void a(dfm ☃, bjr bjr1) {
/* 212 */     int i = bjr1.e;
/* 213 */     int j = bjr1.f;
/* 214 */     bmb bmb1 = bjr1.e();
/* 215 */     boolean bool1 = false;
/* 216 */     boolean bool2 = (bjr1 == this.A && !this.F.a() && !this.E);
/* 217 */     bmb bmb2 = this.i.s.bm.m();
/* 218 */     String str = null;
/*     */     
/* 220 */     if (bjr1 == this.A && !this.F.a() && this.E && !bmb1.a()) {
/* 221 */       bmb1 = bmb1.i();
/* 222 */       bmb1.e(bmb1.E() / 2);
/* 223 */     } else if (this.z && this.y.contains(bjr1) && !bmb2.a()) {
/* 224 */       if (this.y.size() == 1) {
/*     */         return;
/*     */       }
/* 227 */       if (bic.a(bjr1, bmb2, true) && this.t.b(bjr1)) {
/* 228 */         bmb1 = bmb2.i();
/* 229 */         bool1 = true;
/*     */         
/* 231 */         bic.a(this.y, this.L, bmb1, bjr1.e().a() ? 0 : bjr1.e().E());
/*     */         
/* 233 */         int k = Math.min(bmb1.c(), bjr1.b(bmb1));
/* 234 */         if (bmb1.E() > k) {
/* 235 */           str = k.o.toString() + k;
/* 236 */           bmb1.e(k);
/*     */         } 
/*     */       } else {
/* 239 */         this.y.remove(bjr1);
/* 240 */         l();
/*     */       } 
/*     */     } 
/*     */     
/* 244 */     d(100);
/* 245 */     this.j.b = 100.0F;
/* 246 */     if (bmb1.a() && bjr1.b()) {
/* 247 */       Pair<vk, vk> pair = bjr1.c();
/* 248 */       if (pair != null) {
/* 249 */         ekc ekc = this.i.a((vk)pair.getFirst()).apply(pair.getSecond());
/* 250 */         this.i.M().a(ekc.m().g());
/* 251 */         a(☃, i, j, v(), 16, 16, ekc);
/* 252 */         bool2 = true;
/*     */       } 
/*     */     } 
/*     */     
/* 256 */     if (!bool2) {
/* 257 */       if (bool1) {
/* 258 */         a(☃, i, j, i + 16, j + 16, -2130706433);
/*     */       }
/* 260 */       RenderSystem.enableDepthTest();
/* 261 */       this.j.a(this.i.s, bmb1, i, j);
/* 262 */       this.j.a(this.o, bmb1, i, j, str);
/*     */     } 
/* 264 */     this.j.b = 0.0F;
/* 265 */     d(0);
/*     */   }
/*     */   
/*     */   private void l() {
/* 269 */     bmb ☃ = this.i.s.bm.m();
/* 270 */     if (☃.a() || !this.z) {
/*     */       return;
/*     */     }
/*     */     
/* 274 */     if (this.L == 2) {
/* 275 */       this.O = ☃.c();
/*     */       
/*     */       return;
/*     */     } 
/* 279 */     this.O = ☃.E();
/*     */     
/* 281 */     for (bjr bjr1 : this.y) {
/* 282 */       bmb bmb1 = ☃.i();
/* 283 */       bmb bmb2 = bjr1.e();
/* 284 */       int i = bmb2.a() ? 0 : bmb2.E();
/* 285 */       bic.a(this.y, this.L, bmb1, i);
/*     */       
/* 287 */       int j = Math.min(bmb1.c(), bjr1.b(bmb1));
/* 288 */       if (bmb1.E() > j) {
/* 289 */         bmb1.e(j);
/*     */       }
/* 291 */       this.O -= bmb1.E() - i;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private bjr a(double ☃, double d1) {
/* 297 */     for (int i = 0; i < ((bic)this.t).a.size(); i++) {
/* 298 */       bjr bjr1 = ((bic)this.t).a.get(i);
/* 299 */       if (a(bjr1, ☃, d1) && bjr1.b()) {
/* 300 */         return bjr1;
/*     */       }
/*     */     } 
/* 303 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 308 */     if (super.a(☃, d1, i)) {
/* 309 */       return true;
/*     */     }
/* 311 */     boolean bool = this.i.k.ar.a(i);
/* 312 */     bjr bjr1 = a(☃, d1);
/* 313 */     long l = x.b();
/* 314 */     this.R = (this.D == bjr1 && l - this.P < 250L && this.Q == i);
/* 315 */     this.N = false;
/*     */     
/* 317 */     if (i == 0 || i == 1 || bool) {
/* 318 */       int j = this.w;
/* 319 */       int k = this.x;
/* 320 */       boolean bool1 = a(☃, d1, j, k, i);
/*     */       
/* 322 */       int m = -1;
/* 323 */       if (bjr1 != null) {
/* 324 */         m = bjr1.d;
/*     */       }
/*     */       
/* 327 */       if (bool1) {
/* 328 */         m = -999;
/*     */       }
/*     */       
/* 331 */       if (this.i.k.Y && bool1 && this.i.s.bm.m().a()) {
/* 332 */         this.i.a((dot)null);
/* 333 */         return true;
/*     */       } 
/*     */       
/* 336 */       if (m != -1) {
/* 337 */         if (this.i.k.Y) {
/* 338 */           if (bjr1 != null && bjr1.f()) {
/* 339 */             this.A = bjr1;
/* 340 */             this.F = bmb.b;
/* 341 */             this.E = (i == 1);
/*     */           } else {
/* 343 */             this.A = null;
/*     */           } 
/* 345 */         } else if (!this.z) {
/* 346 */           if (this.i.s.bm.m().a()) {
/* 347 */             if (this.i.k.ar.a(i)) {
/* 348 */               a(bjr1, m, i, bik.d);
/*     */             } else {
/* 350 */               boolean bool2 = (m != -999 && (deo.a(djz.C().aD().i(), 340) || deo.a(djz.C().aD().i(), 344)));
/* 351 */               bik bik = bik.a;
/* 352 */               if (bool2) {
/* 353 */                 this.S = (bjr1 != null && bjr1.f()) ? bjr1.e().i() : bmb.b;
/* 354 */                 bik = bik.b;
/* 355 */               } else if (m == -999) {
/* 356 */                 bik = bik.e;
/*     */               } 
/* 358 */               a(bjr1, m, i, bik);
/*     */             } 
/* 360 */             this.N = true;
/*     */           } else {
/* 362 */             this.z = true;
/* 363 */             this.M = i;
/* 364 */             this.y.clear();
/*     */             
/* 366 */             if (i == 0) {
/* 367 */               this.L = 0;
/* 368 */             } else if (i == 1) {
/* 369 */               this.L = 1;
/* 370 */             } else if (this.i.k.ar.a(i)) {
/* 371 */               this.L = 2;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } else {
/* 377 */       a(i);
/*     */     } 
/*     */     
/* 380 */     this.D = bjr1;
/* 381 */     this.P = l;
/* 382 */     this.Q = i;
/*     */     
/* 384 */     return true;
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 388 */     if (this.v != null && this.i.s.bm.m().a()) {
/* 389 */       if (this.i.k.an.a(☃)) {
/* 390 */         a(this.v, this.v.d, 40, bik.c);
/*     */         return;
/*     */       } 
/* 393 */       for (int i = 0; i < 9; i++) {
/* 394 */         if (this.i.k.aC[i].a(☃)) {
/* 395 */           a(this.v, this.v.d, i, bik.c);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean a(double ☃, double d1, int i, int j, int k) {
/* 402 */     return (☃ < i || d1 < j || ☃ >= (i + this.b) || d1 >= (j + this.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, double d2, double d3) {
/* 407 */     bjr bjr1 = a(☃, d1);
/* 408 */     bmb bmb1 = this.i.s.bm.m();
/*     */     
/* 410 */     if (this.A != null && this.i.k.Y) {
/* 411 */       if (i == 0 || i == 1) {
/* 412 */         if (this.F.a()) {
/* 413 */           if (bjr1 != this.A && !this.A.e().a()) {
/* 414 */             this.F = this.A.e().i();
/*     */           }
/* 416 */         } else if (this.F.E() > 1 && bjr1 != null && bic.a(bjr1, this.F, false)) {
/* 417 */           long l = x.b();
/*     */           
/* 419 */           if (this.C == bjr1) {
/* 420 */             if (l - this.K > 500L) {
/* 421 */               a(this.A, this.A.d, 0, bik.a);
/* 422 */               a(bjr1, bjr1.d, 1, bik.a);
/* 423 */               a(this.A, this.A.d, 0, bik.a);
/* 424 */               this.K = l + 750L;
/* 425 */               this.F.g(1);
/*     */             } 
/*     */           } else {
/* 428 */             this.C = bjr1;
/* 429 */             this.K = l;
/*     */           } 
/*     */         } 
/*     */       }
/* 433 */     } else if (this.z && bjr1 != null && !bmb1.a() && (bmb1.E() > this.y.size() || this.L == 2) && bic.a(bjr1, bmb1, true) && bjr1.a(bmb1) && this.t.b(bjr1)) {
/* 434 */       this.y.add(bjr1);
/* 435 */       l();
/*     */     } 
/*     */     
/* 438 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(double ☃, double d1, int i) {
/* 443 */     bjr bjr1 = a(☃, d1);
/* 444 */     int j = this.w;
/* 445 */     int k = this.x;
/* 446 */     boolean bool = a(☃, d1, j, k, i);
/*     */     
/* 448 */     int m = -1;
/* 449 */     if (bjr1 != null) {
/* 450 */       m = bjr1.d;
/*     */     }
/*     */     
/* 453 */     if (bool) {
/* 454 */       m = -999;
/*     */     }
/*     */     
/* 457 */     if (this.R && bjr1 != null && i == 0 && this.t.a(bmb.b, bjr1)) {
/* 458 */       if (y()) {
/* 459 */         if (!this.S.a()) {
/* 460 */           for (bjr bjr2 : ((bic)this.t).a) {
/* 461 */             if (bjr2 != null && bjr2.a(this.i.s) && bjr2.f() && bjr2.c == bjr1.c && bic.a(bjr2, this.S, true)) {
/* 462 */               a(bjr2, bjr2.d, i, bik.b);
/*     */             }
/*     */           } 
/*     */         }
/*     */       } else {
/* 467 */         a(bjr1, m, i, bik.g);
/*     */       } 
/* 469 */       this.R = false;
/* 470 */       this.P = 0L;
/*     */     } else {
/* 472 */       if (this.z && this.M != i) {
/* 473 */         this.z = false;
/* 474 */         this.y.clear();
/* 475 */         this.N = true;
/* 476 */         return true;
/* 477 */       }  if (this.N) {
/* 478 */         this.N = false;
/* 479 */         return true;
/*     */       } 
/*     */       
/* 482 */       if (this.A != null && this.i.k.Y) {
/* 483 */         if (i == 0 || i == 1) {
/* 484 */           if (this.F.a() && bjr1 != this.A) {
/* 485 */             this.F = this.A.e();
/*     */           }
/*     */           
/* 488 */           boolean bool1 = bic.a(bjr1, this.F, false);
/*     */           
/* 490 */           if (m != -1 && !this.F.a() && bool1) {
/* 491 */             a(this.A, this.A.d, i, bik.a);
/* 492 */             a(bjr1, m, 0, bik.a);
/*     */             
/* 494 */             if (this.i.s.bm.m().a()) {
/* 495 */               this.J = bmb.b;
/*     */             } else {
/* 497 */               a(this.A, this.A.d, i, bik.a);
/* 498 */               this.G = afm.c(☃ - j);
/* 499 */               this.H = afm.c(d1 - k);
/* 500 */               this.B = this.A;
/* 501 */               this.J = this.F;
/* 502 */               this.I = x.b();
/*     */             } 
/* 504 */           } else if (!this.F.a()) {
/* 505 */             this.G = afm.c(☃ - j);
/* 506 */             this.H = afm.c(d1 - k);
/* 507 */             this.B = this.A;
/* 508 */             this.J = this.F;
/* 509 */             this.I = x.b();
/*     */           } 
/*     */           
/* 512 */           this.F = bmb.b;
/* 513 */           this.A = null;
/*     */         } 
/* 515 */       } else if (this.z && !this.y.isEmpty()) {
/* 516 */         a((bjr)null, -999, bic.b(0, this.L), bik.f);
/*     */         
/* 518 */         for (bjr bjr2 : this.y) {
/* 519 */           a(bjr2, bjr2.d, bic.b(1, this.L), bik.f);
/*     */         }
/*     */         
/* 522 */         a((bjr)null, -999, bic.b(2, this.L), bik.f);
/* 523 */       } else if (!this.i.s.bm.m().a()) {
/* 524 */         if (this.i.k.ar.a(i)) {
/* 525 */           a(bjr1, m, i, bik.d);
/*     */         } else {
/* 527 */           boolean bool1 = (m != -999 && (deo.a(djz.C().aD().i(), 340) || deo.a(djz.C().aD().i(), 344)));
/* 528 */           if (bool1) {
/* 529 */             this.S = (bjr1 != null && bjr1.f()) ? bjr1.e().i() : bmb.b;
/*     */           }
/* 531 */           a(bjr1, m, i, bool1 ? bik.b : bik.a);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 536 */     if (this.i.s.bm.m().a()) {
/* 537 */       this.P = 0L;
/*     */     }
/*     */     
/* 540 */     this.z = false;
/*     */     
/* 542 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(bjr ☃, double d1, double d2) {
/* 546 */     return a(☃.e, ☃.f, 16, 16, d1, d2);
/*     */   }
/*     */   
/*     */   protected boolean a(int ☃, int i, int j, int k, double d1, double d2) {
/* 550 */     int m = this.w;
/* 551 */     int n = this.x;
/* 552 */     d1 -= m;
/* 553 */     d2 -= n;
/*     */     
/* 555 */     return (d1 >= (☃ - 1) && d1 < (☃ + j + 1) && d2 >= (i - 1) && d2 < (i + k + 1));
/*     */   }
/*     */   
/*     */   protected void a(bjr ☃, int i, int j, bik bik1) {
/* 559 */     if (☃ != null) {
/* 560 */       i = ☃.d;
/*     */     }
/* 562 */     this.i.q.a(((bic)this.t).b, i, j, bik1, this.i.s);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 567 */     if (super.a(☃, i, j)) {
/* 568 */       return true;
/*     */     }
/* 570 */     if (this.i.k.am.a(☃, i)) {
/* 571 */       at_();
/* 572 */       return true;
/*     */     } 
/*     */     
/* 575 */     b(☃, i);
/*     */     
/* 577 */     if (this.v != null && this.v.f()) {
/* 578 */       if (this.i.k.ar.a(☃, i)) {
/* 579 */         a(this.v, this.v.d, 0, bik.d);
/* 580 */       } else if (this.i.k.ao.a(☃, i)) {
/* 581 */         a(this.v, this.v.d, x() ? 1 : 0, bik.e);
/*     */       } 
/*     */     }
/* 584 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean b(int ☃, int i) {
/* 588 */     if (this.i.s.bm.m().a() && this.v != null) {
/* 589 */       if (this.i.k.an.a(☃, i)) {
/* 590 */         a(this.v, this.v.d, 40, bik.c);
/* 591 */         return true;
/*     */       } 
/* 593 */       for (int j = 0; j < 9; j++) {
/* 594 */         if (this.i.k.aC[j].a(☃, i)) {
/* 595 */           a(this.v, this.v.d, j, bik.c);
/* 596 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 601 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 606 */     if (this.i.s == null) {
/*     */       return;
/*     */     }
/* 609 */     this.t.b(this.i.s);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ay_() {
/* 614 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 619 */     super.d();
/* 620 */     if (!this.i.s.aX() || this.i.s.y) {
/* 621 */       this.i.s.m();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public T h() {
/* 627 */     return this.t;
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/* 632 */     this.i.s.m();
/* 633 */     super.at_();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
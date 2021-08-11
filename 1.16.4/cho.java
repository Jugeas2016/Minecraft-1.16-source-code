/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function3;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectListIterator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.IntStream;
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
/*     */ public final class cho
/*     */   extends cfy
/*     */ {
/*     */   public static final Codec<cho> d;
/*     */   private static final float[] i;
/*     */   private static final float[] j;
/*     */   
/*     */   static {
/*  52 */     d = RecordCodecBuilder.create(☃ -> ☃.group((App)bsy.a.fieldOf("biome_source").forGetter(()), (App)Codec.LONG.fieldOf("seed").stable().forGetter(()), (App)chp.b.fieldOf("settings").forGetter(())).apply((Applicative)☃, ☃.stable(cho::new)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  60 */     i = x.<float[]>a(new float[13824], ☃ -> {
/*     */           for (int i = 0; i < 24; i++) {
/*     */             for (int j = 0; j < 24; j++) {
/*     */               for (int k = 0; k < 24; k++) {
/*     */                 ☃[i * 24 * 24 + j * 24 + k] = (float)b(j - 12, k - 12, i - 12);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         });
/*     */     
/*  70 */     j = x.<float[]>a(new float[25], ☃ -> {
/*     */           for (int i = -2; i <= 2; i++) {
/*     */             for (int j = -2; j <= 2; j++) {
/*     */               float f = 10.0F / afm.c((i * i + j * j) + 0.2F);
/*     */               ☃[i + 2 + (j + 2) * 5] = f;
/*     */             } 
/*     */           } 
/*     */         });
/*     */   }
/*  79 */   private static final ceh k = bup.a.n();
/*     */   
/*     */   private final int l;
/*     */   
/*     */   private final int m;
/*     */   
/*     */   private final int n;
/*     */   
/*     */   private final int o;
/*     */   private final int p;
/*     */   protected final chx e;
/*     */   private final cub q;
/*     */   private final cub r;
/*     */   private final cub s;
/*     */   private final cue t;
/*     */   private final cub u;
/*     */   @Nullable
/*     */   private final cud v;
/*     */   protected final ceh f;
/*     */   protected final ceh g;
/*     */   private final long w;
/*     */   protected final Supplier<chp> h;
/*     */   private final int x;
/*     */   
/*     */   public cho(bsy ☃, long l, Supplier<chp> supplier) {
/* 104 */     this(☃, ☃, l, supplier);
/*     */   }
/*     */   
/*     */   private cho(bsy ☃, bsy bsy1, long l, Supplier<chp> supplier) {
/* 108 */     super(☃, bsy1, ((chp)supplier.get()).a(), l);
/* 109 */     this.w = l;
/*     */     
/* 111 */     chp chp = supplier.get();
/*     */     
/* 113 */     this.h = supplier;
/* 114 */     chr chr = chp.b();
/* 115 */     this.x = chr.a();
/*     */     
/* 117 */     this.l = chr.f() * 4;
/* 118 */     this.m = chr.e() * 4;
/* 119 */     this.f = chp.c();
/* 120 */     this.g = chp.d();
/*     */     
/* 122 */     this.n = 16 / this.m;
/* 123 */     this.o = chr.a() / this.l;
/* 124 */     this.p = 16 / this.m;
/*     */     
/* 126 */     this.e = new chx(l);
/* 127 */     this.q = new cub(this.e, IntStream.rangeClosed(-15, 0));
/* 128 */     this.r = new cub(this.e, IntStream.rangeClosed(-15, 0));
/* 129 */     this.s = new cub(this.e, IntStream.rangeClosed(-7, 0));
/* 130 */     this.t = chr.i() ? new cuc(this.e, IntStream.rangeClosed(-3, 0)) : new cub(this.e, IntStream.rangeClosed(-3, 0));
/*     */     
/* 132 */     this.e.a(2620);
/* 133 */     this.u = new cub(this.e, IntStream.rangeClosed(-15, 0));
/*     */     
/* 135 */     if (chr.k()) {
/* 136 */       chx chx1 = new chx(l);
/*     */       
/* 138 */       chx1.a(17292);
/* 139 */       this.v = new cud(chx1);
/*     */     } else {
/* 141 */       this.v = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected Codec<? extends cfy> a() {
/* 147 */     return (Codec)d;
/*     */   }
/*     */ 
/*     */   
/*     */   public cfy a(long ☃) {
/* 152 */     return new cho(this.b.a(☃), ☃, this.h);
/*     */   }
/*     */   
/*     */   public boolean a(long ☃, vj<chp> vj1) {
/* 156 */     return (this.w == ☃ && ((chp)this.h.get()).a(vj1));
/*     */   }
/*     */   
/*     */   private double a(int ☃, int i, int j, double d1, double d2, double d3, double d4) {
/* 160 */     double d5 = 0.0D;
/* 161 */     double d6 = 0.0D;
/* 162 */     double d7 = 0.0D;
/*     */     
/* 164 */     boolean bool = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     double d8 = 1.0D;
/*     */     
/* 174 */     for (int k = 0; k < 16; k++) {
/* 175 */       double d9 = cub.a(☃ * d1 * d8);
/* 176 */       double d10 = cub.a(i * d2 * d8);
/* 177 */       double d11 = cub.a(j * d1 * d8);
/* 178 */       double d12 = d2 * d8;
/* 179 */       ctz ctz1 = this.q.a(k);
/* 180 */       if (ctz1 != null) {
/* 181 */         d5 += ctz1.a(d9, d10, d11, d12, i * d12) / d8;
/*     */       }
/* 183 */       ctz ctz2 = this.r.a(k);
/* 184 */       if (ctz2 != null) {
/* 185 */         d6 += ctz2.a(d9, d10, d11, d12, i * d12) / d8;
/*     */       }
/* 187 */       if (k < 8) {
/* 188 */         ctz ctz = this.s.a(k);
/* 189 */         if (ctz != null) {
/* 190 */           d7 += ctz.a(cub.a(☃ * d3 * d8), cub.a(i * d4 * d8), cub.a(j * d3 * d8), d4 * d8, i * d4 * d8) / d8;
/*     */         }
/*     */       } 
/* 193 */       d8 /= 2.0D;
/*     */     } 
/*     */ 
/*     */     
/* 197 */     return afm.b(d5 / 512.0D, d6 / 512.0D, (d7 / 10.0D + 1.0D) / 2.0D);
/*     */   }
/*     */   
/*     */   private double[] b(int ☃, int i) {
/* 201 */     double[] arrayOfDouble = new double[this.o + 1];
/* 202 */     a(arrayOfDouble, ☃, i);
/* 203 */     return arrayOfDouble;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(double[] ☃, int i, int j) {
/*     */     double d1, d2;
/* 210 */     chr chr = ((chp)this.h.get()).b();
/*     */     
/* 212 */     if (this.v != null) {
/*     */       
/* 214 */       d1 = (btk.a(this.v, i, j) - 8.0F);
/* 215 */       if (d1 > 0.0D) {
/* 216 */         d2 = 0.25D;
/*     */       } else {
/* 218 */         d2 = 1.0D;
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 223 */       float f1 = 0.0F;
/* 224 */       float f2 = 0.0F;
/* 225 */       float f3 = 0.0F;
/* 226 */       int m = 2;
/* 227 */       int n = f();
/*     */ 
/*     */       
/* 230 */       float f4 = this.b.b(i, n, j).h();
/* 231 */       for (int i1 = -2; i1 <= 2; i1++) {
/* 232 */         for (int i2 = -2; i2 <= 2; i2++) {
/* 233 */           float f9, f10; bsv bsv = this.b.b(i + i1, n, j + i2);
/*     */           
/* 235 */           float f7 = bsv.h();
/* 236 */           float f8 = bsv.j();
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 241 */           if (chr.l() && f7 > 0.0F) {
/* 242 */             f9 = 1.0F + f7 * 2.0F;
/* 243 */             f10 = 1.0F + f8 * 4.0F;
/*     */           } else {
/* 245 */             f9 = f7;
/* 246 */             f10 = f8;
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 255 */           float f11 = (f7 > f4) ? 0.5F : 1.0F;
/* 256 */           float f12 = f11 * j[i1 + 2 + (i2 + 2) * 5] / (f9 + 2.0F);
/*     */           
/* 258 */           f1 += f10 * f12;
/* 259 */           f2 += f9 * f12;
/* 260 */           f3 += f12;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 266 */       float f5 = f2 / f3;
/* 267 */       float f6 = f1 / f3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 279 */       double d16 = (f5 * 0.5F - 0.125F);
/*     */ 
/*     */       
/* 282 */       double d17 = (f6 * 0.9F + 0.1F);
/*     */       
/* 284 */       d1 = d16 * 0.265625D;
/* 285 */       d2 = 96.0D / d17;
/*     */     } 
/*     */     
/* 288 */     double d3 = 684.412D * chr.b().a();
/* 289 */     double d4 = 684.412D * chr.b().b();
/*     */     
/* 291 */     double d5 = d3 / chr.b().c();
/* 292 */     double d6 = d4 / chr.b().d();
/*     */     
/* 294 */     double d7 = chr.c().a();
/* 295 */     double d8 = chr.c().b();
/* 296 */     double d9 = chr.c().c();
/*     */     
/* 298 */     double d10 = chr.d().a();
/* 299 */     double d11 = chr.d().b();
/* 300 */     double d12 = chr.d().c();
/*     */     
/* 302 */     double d13 = chr.j() ? c(i, j) : 0.0D;
/*     */     
/* 304 */     double d14 = chr.g();
/* 305 */     double d15 = chr.h();
/*     */ 
/*     */     
/* 308 */     for (int k = 0; k <= this.o; k++) {
/*     */       
/* 310 */       double d16 = a(i, k, j, d3, d4, d5, d6);
/*     */ 
/*     */       
/* 313 */       double d17 = 1.0D - k * 2.0D / this.o + d13;
/*     */       
/* 315 */       double d18 = d17 * d14 + d15;
/*     */       
/* 317 */       double d19 = (d18 + d1) * d2;
/*     */ 
/*     */ 
/*     */       
/* 321 */       if (d19 > 0.0D) {
/* 322 */         d16 += d19 * 4.0D;
/*     */       } else {
/* 324 */         d16 += d19;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 339 */       if (d8 > 0.0D) {
/* 340 */         double d = ((this.o - k) - d9) / d8;
/* 341 */         d16 = afm.b(d7, d16, d);
/*     */       } 
/*     */       
/* 344 */       if (d11 > 0.0D) {
/* 345 */         double d = (k - d12) / d11;
/* 346 */         d16 = afm.b(d10, d16, d);
/*     */       } 
/*     */       
/* 349 */       ☃[k] = d16;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private double c(int ☃, int i) {
/* 355 */     double d2, d1 = this.u.a((☃ * 200), 10.0D, (i * 200), 1.0D, 0.0D, true);
/*     */ 
/*     */ 
/*     */     
/* 359 */     if (d1 < 0.0D) {
/* 360 */       d2 = -d1 * 0.3D;
/*     */     } else {
/* 362 */       d2 = d1;
/*     */     } 
/*     */ 
/*     */     
/* 366 */     double d3 = d2 * 24.575625D - 2.0D;
/*     */ 
/*     */     
/* 369 */     if (d3 < 0.0D) {
/* 370 */       return d3 * 0.009486607142857142D;
/*     */     }
/* 372 */     return Math.min(d3, 1.0D) * 0.006640625D;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int ☃, int i, chn.a a1) {
/* 378 */     return a(☃, i, (ceh[])null, a1.e());
/*     */   }
/*     */ 
/*     */   
/*     */   public brc a(int ☃, int i) {
/* 383 */     ceh[] arrayOfCeh = new ceh[this.o * this.l];
/* 384 */     a(☃, i, arrayOfCeh, (Predicate<ceh>)null);
/* 385 */     return new bsh(arrayOfCeh);
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i, @Nullable ceh[] arrayOfCeh, @Nullable Predicate<ceh> predicate) {
/* 389 */     int j = Math.floorDiv(☃, this.m);
/* 390 */     int k = Math.floorDiv(i, this.m);
/* 391 */     int m = Math.floorMod(☃, this.m);
/* 392 */     int n = Math.floorMod(i, this.m);
/*     */     
/* 394 */     double d1 = m / this.m;
/* 395 */     double d2 = n / this.m;
/*     */     
/* 397 */     double[][] arrayOfDouble = new double[4][];
/*     */     
/* 399 */     arrayOfDouble[0] = b(j, k);
/* 400 */     arrayOfDouble[1] = b(j, k + 1);
/* 401 */     arrayOfDouble[2] = b(j + 1, k);
/* 402 */     arrayOfDouble[3] = b(j + 1, k + 1);
/*     */     
/* 404 */     for (int i1 = this.o - 1; i1 >= 0; i1--) {
/* 405 */       double d3 = arrayOfDouble[0][i1];
/* 406 */       double d4 = arrayOfDouble[1][i1];
/* 407 */       double d5 = arrayOfDouble[2][i1];
/* 408 */       double d6 = arrayOfDouble[3][i1];
/*     */       
/* 410 */       double d7 = arrayOfDouble[0][i1 + 1];
/* 411 */       double d8 = arrayOfDouble[1][i1 + 1];
/* 412 */       double d9 = arrayOfDouble[2][i1 + 1];
/* 413 */       double d10 = arrayOfDouble[3][i1 + 1];
/*     */       
/* 415 */       for (int i2 = this.l - 1; i2 >= 0; i2--) {
/* 416 */         double d11 = i2 / this.l;
/*     */         
/* 418 */         double d12 = afm.a(d11, d1, d2, d3, d7, d5, d9, d4, d8, d6, d10);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 424 */         int i3 = i1 * this.l + i2;
/*     */         
/* 426 */         ceh ceh1 = a(d12, i3);
/* 427 */         if (arrayOfCeh != null) {
/* 428 */           arrayOfCeh[i3] = ceh1;
/*     */         }
/* 430 */         if (predicate != null && predicate.test(ceh1)) {
/* 431 */           return i3 + 1;
/*     */         }
/*     */       } 
/*     */     } 
/* 435 */     return 0;
/*     */   }
/*     */   
/*     */   protected ceh a(double ☃, int i) {
/*     */     ceh ceh1;
/* 440 */     if (☃ > 0.0D) {
/* 441 */       ceh1 = this.f;
/*     */     }
/* 443 */     else if (i < f()) {
/* 444 */       ceh1 = this.g;
/*     */     } else {
/* 446 */       ceh1 = k;
/*     */     } 
/*     */     
/* 449 */     return ceh1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aam ☃, cfw cfw1) {
/* 454 */     brd brd1 = cfw1.g();
/* 455 */     int i = brd1.b;
/* 456 */     int j = brd1.c;
/*     */     
/* 458 */     chx chx1 = new chx();
/* 459 */     chx1.a(i, j);
/*     */     
/* 461 */     brd brd2 = cfw1.g();
/* 462 */     int k = brd2.d();
/* 463 */     int m = brd2.e();
/* 464 */     double d = 0.0625D;
/*     */     
/* 466 */     fx.a a = new fx.a();
/*     */     
/* 468 */     for (int n = 0; n < 16; n++) {
/* 469 */       for (int i1 = 0; i1 < 16; i1++) {
/* 470 */         int i2 = k + n;
/* 471 */         int i3 = m + i1;
/* 472 */         int i4 = cfw1.a(chn.a.a, n, i1) + 1;
/*     */ 
/*     */         
/* 475 */         double d1 = this.t.a(i2 * 0.0625D, i3 * 0.0625D, 0.0625D, n * 0.0625D) * 15.0D;
/* 476 */         ☃.v(a.d(k + n, i4, m + i1)).a(chx1, cfw1, i2, i3, i4, d1, this.f, this.g, f(), ☃.C());
/*     */       } 
/*     */     } 
/* 479 */     a(cfw1, chx1);
/*     */   }
/*     */   
/*     */   private void a(cfw ☃, Random random) {
/* 483 */     fx.a a = new fx.a();
/* 484 */     int i = ☃.g().d();
/* 485 */     int j = ☃.g().e();
/*     */     
/* 487 */     chp chp = this.h.get();
/*     */     
/* 489 */     int k = chp.f();
/*     */     
/* 491 */     int m = this.x - 1 - chp.e();
/*     */     
/* 493 */     int n = 5;
/*     */     
/* 495 */     boolean bool1 = (m + 4 >= 0 && m < this.x);
/* 496 */     boolean bool2 = (k + 4 >= 0 && k < this.x);
/*     */     
/* 498 */     if (!bool1 && !bool2) {
/*     */       return;
/*     */     }
/*     */     
/* 502 */     for (fx fx : fx.b(i, 0, j, i + 15, 0, j + 15)) {
/* 503 */       if (bool1) {
/* 504 */         for (int i1 = 0; i1 < 5; i1++) {
/* 505 */           if (i1 <= random.nextInt(5)) {
/* 506 */             ☃.a(a.d(fx.u(), m - i1, fx.w()), bup.z.n(), false);
/*     */           }
/*     */         } 
/*     */       }
/*     */       
/* 511 */       if (bool2) {
/* 512 */         for (int i1 = 4; i1 >= 0; i1--) {
/* 513 */           if (i1 <= random.nextInt(5)) {
/* 514 */             ☃.a(a.d(fx.u(), k + i1, fx.w()), bup.z.n(), false);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bry ☃, bsn bsn1, cfw cfw1) {
/* 523 */     ObjectArrayList objectArrayList1 = new ObjectArrayList(10);
/* 524 */     ObjectArrayList objectArrayList2 = new ObjectArrayList(32);
/*     */     
/* 526 */     brd brd = cfw1.g();
/*     */     
/* 528 */     int i = brd.b;
/* 529 */     int j = brd.c;
/*     */     
/* 531 */     int k = i << 4;
/* 532 */     int m = j << 4;
/*     */     
/* 534 */     for (Iterator<cla<?>> iterator = cla.t.iterator(); iterator.hasNext(); ) { cla<?> cla = iterator.next();
/*     */       
/* 536 */       bsn1.a(gp.a(brd, 0), cla).forEach(crv1 -> {
/*     */             for (cru cru : crv1.d()) {
/*     */               if (!cru.a(☃, 12)) {
/*     */                 continue;
/*     */               }
/*     */               
/*     */               if (cru instanceof cro) {
/*     */                 cro cro = (cro)cru;
/*     */                 
/*     */                 cok.a a = cro.b().e();
/*     */                 
/*     */                 if (a == cok.a.b) {
/*     */                   objectList1.add(cro);
/*     */                 }
/*     */                 
/*     */                 for (cod cod : cro.e()) {
/*     */                   int k = cod.a();
/*     */                   
/*     */                   int m = cod.c();
/*     */                   
/*     */                   if (k <= i - 12 || m <= j - 12 || k >= i + 15 + 12 || m >= j + 15 + 12) {
/*     */                     continue;
/*     */                   }
/*     */                   
/*     */                   objectList2.add(cod);
/*     */                 } 
/*     */                 
/*     */                 continue;
/*     */               } 
/*     */               objectList1.add(cru);
/*     */             } 
/*     */           }); }
/*     */     
/* 569 */     double[][][] arrayOfDouble = new double[2][this.p + 1][this.o + 1];
/*     */     
/* 571 */     for (int n = 0; n < this.p + 1; n++) {
/* 572 */       arrayOfDouble[0][n] = new double[this.o + 1];
/* 573 */       a(arrayOfDouble[0][n], i * this.n, j * this.p + n);
/* 574 */       arrayOfDouble[1][n] = new double[this.o + 1];
/*     */     } 
/*     */     
/* 577 */     cgp cgp = (cgp)cfw1;
/*     */     
/* 579 */     chn chn1 = cgp.a(chn.a.c);
/* 580 */     chn chn2 = cgp.a(chn.a.a);
/*     */     
/* 582 */     fx.a a = new fx.a();
/* 583 */     ObjectListIterator<cru> objectListIterator = objectArrayList1.iterator();
/* 584 */     ObjectListIterator<cod> objectListIterator1 = objectArrayList2.iterator();
/*     */     
/* 586 */     for (int i1 = 0; i1 < this.n; i1++) {
/* 587 */       int i2; for (i2 = 0; i2 < this.p + 1; i2++) {
/* 588 */         a(arrayOfDouble[1][i2], i * this.n + i1 + 1, j * this.p + i2);
/*     */       }
/*     */       
/* 591 */       for (i2 = 0; i2 < this.p; i2++) {
/* 592 */         cgi cgi = cgp.a(15);
/* 593 */         cgi.a();
/*     */         
/* 595 */         for (int i3 = this.o - 1; i3 >= 0; i3--) {
/* 596 */           double d1 = arrayOfDouble[0][i2][i3];
/* 597 */           double d2 = arrayOfDouble[0][i2 + 1][i3];
/* 598 */           double d3 = arrayOfDouble[1][i2][i3];
/* 599 */           double d4 = arrayOfDouble[1][i2 + 1][i3];
/*     */           
/* 601 */           double d5 = arrayOfDouble[0][i2][i3 + 1];
/* 602 */           double d6 = arrayOfDouble[0][i2 + 1][i3 + 1];
/* 603 */           double d7 = arrayOfDouble[1][i2][i3 + 1];
/* 604 */           double d8 = arrayOfDouble[1][i2 + 1][i3 + 1];
/*     */           
/* 606 */           for (int i4 = this.l - 1; i4 >= 0; i4--) {
/* 607 */             int i5 = i3 * this.l + i4;
/* 608 */             int i6 = i5 & 0xF;
/*     */             
/* 610 */             int i7 = i5 >> 4;
/* 611 */             if (cgi.g() >> 4 != i7) {
/* 612 */               cgi.b();
/* 613 */               cgi = cgp.a(i7);
/* 614 */               cgi.a();
/*     */             } 
/*     */             
/* 617 */             double d9 = i4 / this.l;
/* 618 */             double d10 = afm.d(d9, d1, d5);
/* 619 */             double d11 = afm.d(d9, d3, d7);
/* 620 */             double d12 = afm.d(d9, d2, d6);
/* 621 */             double d13 = afm.d(d9, d4, d8);
/*     */             
/* 623 */             for (int i8 = 0; i8 < this.m; i8++) {
/* 624 */               int i9 = k + i1 * this.m + i8;
/* 625 */               int i10 = i9 & 0xF;
/*     */               
/* 627 */               double d14 = i8 / this.m;
/* 628 */               double d15 = afm.d(d14, d10, d11);
/* 629 */               double d16 = afm.d(d14, d12, d13);
/*     */               
/* 631 */               for (int i11 = 0; i11 < this.m; i11++) {
/* 632 */                 int i12 = m + i2 * this.m + i11;
/* 633 */                 int i13 = i12 & 0xF;
/*     */                 
/* 635 */                 double d17 = i11 / this.m;
/* 636 */                 double d18 = afm.d(d17, d15, d16);
/*     */ 
/*     */                 
/* 639 */                 double d19 = afm.a(d18 / 200.0D, -1.0D, 1.0D);
/* 640 */                 d19 = d19 / 2.0D - d19 * d19 * d19 / 24.0D;
/*     */                 
/* 642 */                 while (objectListIterator.hasNext()) {
/* 643 */                   cru cru = (cru)objectListIterator.next();
/* 644 */                   cra cra = cru.g();
/* 645 */                   int i14 = Math.max(0, Math.max(cra.a - i9, i9 - cra.d));
/* 646 */                   int i15 = i5 - cra.b + ((cru instanceof cro) ? ((cro)cru).d() : 0);
/* 647 */                   int i16 = Math.max(0, Math.max(cra.c - i12, i12 - cra.f));
/* 648 */                   d19 += a(i14, i15, i16) * 0.8D;
/*     */                 } 
/* 650 */                 objectListIterator.back(objectArrayList1.size());
/*     */                 
/* 652 */                 while (objectListIterator1.hasNext()) {
/* 653 */                   cod cod = (cod)objectListIterator1.next();
/* 654 */                   int i14 = i9 - cod.a();
/* 655 */                   int i15 = i5 - cod.b();
/* 656 */                   int i16 = i12 - cod.c();
/* 657 */                   d19 += a(i14, i15, i16) * 0.4D;
/*     */                 } 
/* 659 */                 objectListIterator1.back(objectArrayList2.size());
/*     */                 
/* 661 */                 ceh ceh1 = a(d19, i5);
/*     */                 
/* 663 */                 if (ceh1 != k) {
/* 664 */                   if (ceh1.f() != 0) {
/* 665 */                     a.d(i9, i5, i12);
/* 666 */                     cgp.k(a);
/*     */                   } 
/* 668 */                   cgi.a(i10, i6, i13, ceh1, false);
/* 669 */                   chn1.a(i10, i5, i13, ceh1);
/* 670 */                   chn2.a(i10, i5, i13, ceh1);
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/* 676 */         cgi.b();
/*     */       } 
/*     */       
/* 679 */       double[][] arrayOfDouble1 = arrayOfDouble[0];
/* 680 */       arrayOfDouble[0] = arrayOfDouble[1];
/* 681 */       arrayOfDouble[1] = arrayOfDouble1;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static double a(int ☃, int i, int j) {
/* 686 */     int k = ☃ + 12;
/* 687 */     int m = i + 12;
/* 688 */     int n = j + 12;
/* 689 */     if (k < 0 || k >= 24) {
/* 690 */       return 0.0D;
/*     */     }
/* 692 */     if (m < 0 || m >= 24) {
/* 693 */       return 0.0D;
/*     */     }
/* 695 */     if (n < 0 || n >= 24) {
/* 696 */       return 0.0D;
/*     */     }
/*     */     
/* 699 */     return i[n * 24 * 24 + k * 24 + m];
/*     */   }
/*     */   
/*     */   private static double b(int ☃, int i, int j) {
/* 703 */     double d1 = (☃ * ☃ + j * j);
/*     */ 
/*     */     
/* 706 */     double d2 = i + 0.5D;
/* 707 */     double d3 = d2 * d2;
/*     */     
/* 709 */     double d4 = Math.pow(Math.E, -(d3 / 16.0D + d1 / 16.0D));
/* 710 */     double d5 = -d2 * afm.i(d3 / 2.0D + d1 / 2.0D) / 2.0D;
/*     */     
/* 712 */     return d5 * d4;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/* 717 */     return this.x;
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 722 */     return ((chp)this.h.get()).g();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<btg.c> a(bsv ☃, bsn bsn1, aqo aqo1, fx fx1) {
/* 728 */     if (bsn1.a(fx1, true, cla.j).e()) {
/* 729 */       if (aqo1 == aqo.a)
/* 730 */         return cla.j.c(); 
/* 731 */       if (aqo1 == aqo.b) {
/* 732 */         return cla.j.j();
/*     */       }
/*     */     } 
/* 735 */     if (aqo1 == aqo.a) {
/* 736 */       if (bsn1.a(fx1, false, cla.b).e())
/* 737 */         return cla.b.c(); 
/* 738 */       if (bsn1.a(fx1, false, cla.l).e())
/* 739 */         return cla.l.c(); 
/* 740 */       if (bsn1.a(fx1, true, cla.n).e()) {
/* 741 */         return cla.n.c();
/*     */       }
/*     */     } 
/*     */     
/* 745 */     return super.a(☃, bsn1, aqo1, fx1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aam ☃) {
/* 751 */     if (((chp)this.h.get()).h()) {
/*     */       return;
/*     */     }
/* 754 */     int i = ☃.a();
/* 755 */     int j = ☃.b();
/* 756 */     bsv bsv = ☃.v((new brd(i, j)).l());
/*     */     
/* 758 */     chx chx1 = new chx();
/* 759 */     chx1.a(☃.C(), i << 4, j << 4);
/* 760 */     bsg.a(☃, bsv, i, j, chx1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
/*     */ import java.util.BitSet;
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
/*     */ public class eaz
/*     */ {
/*     */   private final dko a;
/*     */   
/*     */   public eaz(dko ☃) {
/*  38 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean a(bra ☃, elo elo1, ceh ceh1, fx fx1, dfm dfm1, dfq dfq1, boolean bool, Random random, long l, int i) {
/*  42 */     boolean bool1 = (djz.B() && ceh1.f() == 0 && elo1.a());
/*  43 */     dcn dcn = ceh1.n(☃, fx1);
/*  44 */     dfm1.a(dcn.b, dcn.c, dcn.d);
/*     */     try {
/*  46 */       if (bool1) {
/*  47 */         return b(☃, elo1, ceh1, fx1, dfm1, dfq1, bool, random, l, i);
/*     */       }
/*  49 */       return c(☃, elo1, ceh1, fx1, dfm1, dfq1, bool, random, l, i);
/*     */     }
/*  51 */     catch (Throwable throwable) {
/*  52 */       l l1 = l.a(throwable, "Tesselating block model");
/*  53 */       m m = l1.a("Block model being tesselated");
/*     */       
/*  55 */       m.a(m, fx1, ceh1);
/*  56 */       m.a("Using AO", Boolean.valueOf(bool1));
/*  57 */       throw new u(l1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean b(bra ☃, elo elo1, ceh ceh1, fx fx1, dfm dfm1, dfq dfq1, boolean bool, Random random, long l, int i) {
/*  62 */     boolean bool1 = false;
/*     */     
/*  64 */     float[] arrayOfFloat = new float[(gc.values()).length * 2];
/*  65 */     BitSet bitSet = new BitSet(3);
/*  66 */     b b = new b(this);
/*     */     
/*  68 */     for (gc gc : gc.values()) {
/*  69 */       random.setSeed(l);
/*  70 */       List<eba> list1 = elo1.a(ceh1, gc, random);
/*  71 */       if (!list1.isEmpty())
/*     */       {
/*     */ 
/*     */         
/*  75 */         if (!bool || buo.c(ceh1, ☃, fx1, gc)) {
/*  76 */           a(☃, ceh1, fx1, dfm1, dfq1, list1, arrayOfFloat, bitSet, b, i);
/*  77 */           bool1 = true;
/*     */         } 
/*     */       }
/*     */     } 
/*  81 */     random.setSeed(l);
/*  82 */     List<eba> list = elo1.a(ceh1, null, random);
/*  83 */     if (!list.isEmpty()) {
/*  84 */       a(☃, ceh1, fx1, dfm1, dfq1, list, arrayOfFloat, bitSet, b, i);
/*  85 */       bool1 = true;
/*     */     } 
/*     */     
/*  88 */     return bool1;
/*     */   }
/*     */   
/*     */   public boolean c(bra ☃, elo elo1, ceh ceh1, fx fx1, dfm dfm1, dfq dfq1, boolean bool, Random random, long l, int i) {
/*  92 */     boolean bool1 = false;
/*     */     
/*  94 */     BitSet bitSet = new BitSet(3);
/*  95 */     for (gc gc : gc.values()) {
/*  96 */       random.setSeed(l);
/*  97 */       List<eba> list1 = elo1.a(ceh1, gc, random);
/*  98 */       if (!list1.isEmpty())
/*     */       {
/*     */ 
/*     */         
/* 102 */         if (!bool || buo.c(ceh1, ☃, fx1, gc)) {
/*     */ 
/*     */ 
/*     */           
/* 106 */           int j = eae.a(☃, ceh1, fx1.a(gc));
/*     */           
/* 108 */           a(☃, ceh1, fx1, j, i, false, dfm1, dfq1, list1, bitSet);
/* 109 */           bool1 = true;
/*     */         }  } 
/*     */     } 
/* 112 */     random.setSeed(l);
/* 113 */     List<eba> list = elo1.a(ceh1, null, random);
/* 114 */     if (!list.isEmpty()) {
/* 115 */       a(☃, ceh1, fx1, -1, i, true, dfm1, dfq1, list, bitSet);
/* 116 */       bool1 = true;
/*     */     } 
/*     */     
/* 119 */     return bool1;
/*     */   }
/*     */   
/*     */   private void a(bra ☃, ceh ceh1, fx fx1, dfm dfm1, dfq dfq1, List<eba> list, float[] arrayOfFloat, BitSet bitSet, b b1, int i) {
/* 123 */     for (eba eba : list) {
/* 124 */       a(☃, ceh1, fx1, eba.b(), eba.e(), arrayOfFloat, bitSet);
/* 125 */       b1.a(☃, ceh1, fx1, eba.e(), arrayOfFloat, bitSet, eba.f());
/*     */       
/* 127 */       a(☃, ceh1, fx1, dfq1, dfm1
/* 128 */           .c(), eba, 
/* 129 */           b.a(b1)[0], b.a(b1)[1], b.a(b1)[2], b.a(b1)[3], 
/* 130 */           b.b(b1)[0], b.b(b1)[1], b.b(b1)[2], b.b(b1)[3], i);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(bra ☃, ceh ceh1, fx fx1, dfq dfq1, dfm.a a1, eba eba1, float f1, float f2, float f3, float f4, int i, int j, int k, int m, int n) {
/*     */     float f5, f6, f7;
/* 140 */     if (eba1.c()) {
/* 141 */       int i1 = this.a.a(ceh1, ☃, fx1, eba1.d());
/* 142 */       f5 = (i1 >> 16 & 0xFF) / 255.0F;
/* 143 */       f6 = (i1 >> 8 & 0xFF) / 255.0F;
/* 144 */       f7 = (i1 & 0xFF) / 255.0F;
/*     */     } else {
/* 146 */       f5 = 1.0F;
/* 147 */       f6 = 1.0F;
/* 148 */       f7 = 1.0F;
/*     */     } 
/*     */     
/* 151 */     dfq1.a(a1, eba1, new float[] { f1, f2, f3, f4 }, f5, f6, f7, new int[] { i, j, k, m }, n, true);
/*     */   }
/*     */   
/*     */   private void a(bra ☃, ceh ceh1, fx fx1, int[] arrayOfInt, gc gc1, @Nullable float[] arrayOfFloat, BitSet bitSet) {
/* 155 */     float f1 = 32.0F;
/* 156 */     float f2 = 32.0F;
/* 157 */     float f3 = 32.0F;
/* 158 */     float f4 = -32.0F;
/* 159 */     float f5 = -32.0F;
/* 160 */     float f6 = -32.0F; int i;
/* 161 */     for (i = 0; i < 4; i++) {
/* 162 */       float f9 = Float.intBitsToFloat(arrayOfInt[i * 8]);
/* 163 */       float f10 = Float.intBitsToFloat(arrayOfInt[i * 8 + 1]);
/* 164 */       float f11 = Float.intBitsToFloat(arrayOfInt[i * 8 + 2]);
/* 165 */       f1 = Math.min(f1, f9);
/* 166 */       f2 = Math.min(f2, f10);
/* 167 */       f3 = Math.min(f3, f11);
/* 168 */       f4 = Math.max(f4, f9);
/* 169 */       f5 = Math.max(f5, f10);
/* 170 */       f6 = Math.max(f6, f11);
/*     */     } 
/*     */     
/* 173 */     if (arrayOfFloat != null) {
/* 174 */       arrayOfFloat[gc.e.c()] = f1;
/* 175 */       arrayOfFloat[gc.f.c()] = f4;
/* 176 */       arrayOfFloat[gc.a.c()] = f2;
/* 177 */       arrayOfFloat[gc.b.c()] = f5;
/* 178 */       arrayOfFloat[gc.c.c()] = f3;
/* 179 */       arrayOfFloat[gc.d.c()] = f6;
/* 180 */       i = (gc.values()).length;
/* 181 */       arrayOfFloat[gc.e.c() + i] = 1.0F - f1;
/* 182 */       arrayOfFloat[gc.f.c() + i] = 1.0F - f4;
/* 183 */       arrayOfFloat[gc.a.c() + i] = 1.0F - f2;
/* 184 */       arrayOfFloat[gc.b.c() + i] = 1.0F - f5;
/* 185 */       arrayOfFloat[gc.c.c() + i] = 1.0F - f3;
/* 186 */       arrayOfFloat[gc.d.c() + i] = 1.0F - f6;
/*     */     } 
/*     */     
/* 189 */     float f7 = 1.0E-4F;
/* 190 */     float f8 = 0.9999F;
/* 191 */     switch (null.a[gc1.ordinal()]) {
/*     */       case 1:
/* 193 */         bitSet.set(1, (f1 >= 1.0E-4F || f3 >= 1.0E-4F || f4 <= 0.9999F || f6 <= 0.9999F));
/* 194 */         bitSet.set(0, (f2 == f5 && (f2 < 1.0E-4F || ceh1.r(☃, fx1))));
/*     */         break;
/*     */       case 2:
/* 197 */         bitSet.set(1, (f1 >= 1.0E-4F || f3 >= 1.0E-4F || f4 <= 0.9999F || f6 <= 0.9999F));
/* 198 */         bitSet.set(0, (f2 == f5 && (f5 > 0.9999F || ceh1.r(☃, fx1))));
/*     */         break;
/*     */       case 3:
/* 201 */         bitSet.set(1, (f1 >= 1.0E-4F || f2 >= 1.0E-4F || f4 <= 0.9999F || f5 <= 0.9999F));
/* 202 */         bitSet.set(0, (f3 == f6 && (f3 < 1.0E-4F || ceh1.r(☃, fx1))));
/*     */         break;
/*     */       case 4:
/* 205 */         bitSet.set(1, (f1 >= 1.0E-4F || f2 >= 1.0E-4F || f4 <= 0.9999F || f5 <= 0.9999F));
/* 206 */         bitSet.set(0, (f3 == f6 && (f6 > 0.9999F || ceh1.r(☃, fx1))));
/*     */         break;
/*     */       case 5:
/* 209 */         bitSet.set(1, (f2 >= 1.0E-4F || f3 >= 1.0E-4F || f5 <= 0.9999F || f6 <= 0.9999F));
/* 210 */         bitSet.set(0, (f1 == f4 && (f1 < 1.0E-4F || ceh1.r(☃, fx1))));
/*     */         break;
/*     */       case 6:
/* 213 */         bitSet.set(1, (f2 >= 1.0E-4F || f3 >= 1.0E-4F || f5 <= 0.9999F || f6 <= 0.9999F));
/* 214 */         bitSet.set(0, (f1 == f4 && (f4 > 0.9999F || ceh1.r(☃, fx1))));
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bra ☃, ceh ceh1, fx fx1, int i, int j, boolean bool, dfm dfm1, dfq dfq1, List<eba> list, BitSet bitSet) {
/* 220 */     for (eba eba : list) {
/* 221 */       if (bool) {
/* 222 */         a(☃, ceh1, fx1, eba.b(), eba.e(), null, bitSet);
/*     */         
/* 224 */         fx fx2 = bitSet.get(0) ? fx1.a(eba.e()) : fx1;
/* 225 */         i = eae.a(☃, ceh1, fx2);
/*     */       } 
/*     */       
/* 228 */       float f = ☃.a(eba.e(), eba.f());
/* 229 */       a(☃, ceh1, fx1, dfq1, dfm1
/* 230 */           .c(), eba, f, f, f, f, i, i, i, i, j);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dfm.a ☃, dfq dfq1, @Nullable ceh ceh1, elo elo1, float f1, float f2, float f3, int i, int j) {
/* 238 */     Random random = new Random();
/* 239 */     long l = 42L;
/* 240 */     for (gc gc : gc.values()) {
/* 241 */       random.setSeed(42L);
/* 242 */       a(☃, dfq1, f1, f2, f3, elo1.a(ceh1, gc, random), i, j);
/*     */     } 
/* 244 */     random.setSeed(42L);
/* 245 */     a(☃, dfq1, f1, f2, f3, elo1.a(ceh1, null, random), i, j);
/*     */   }
/*     */   
/*     */   private static void a(dfm.a ☃, dfq dfq1, float f1, float f2, float f3, List<eba> list, int i, int j) {
/* 249 */     for (eba eba : list) {
/*     */       float f4, f5, f6;
/*     */ 
/*     */       
/* 253 */       if (eba.c()) {
/* 254 */         f4 = afm.a(f1, 0.0F, 1.0F);
/* 255 */         f5 = afm.a(f2, 0.0F, 1.0F);
/* 256 */         f6 = afm.a(f3, 0.0F, 1.0F);
/*     */       } else {
/* 258 */         f4 = 1.0F;
/* 259 */         f5 = 1.0F;
/* 260 */         f6 = 1.0F;
/*     */       } 
/* 262 */       dfq1.a(☃, eba, f4, f5, f6, i, j);
/*     */     } 
/*     */   }
/*     */   
/*     */   enum c {
/* 267 */     a(0, 1, 2, 3),
/* 268 */     b(2, 3, 0, 1),
/* 269 */     c(3, 0, 1, 2),
/* 270 */     d(0, 1, 2, 3),
/* 271 */     e(3, 0, 1, 2),
/* 272 */     f(1, 2, 3, 0); private final int g;
/*     */     private final int h;
/*     */     private final int i;
/*     */     private final int j;
/*     */     private static final c[] k;
/*     */     
/*     */     static {
/* 279 */       k = x.<c[]>a(new c[6], ☃ -> {
/*     */             ☃[gc.a.c()] = a;
/*     */             ☃[gc.b.c()] = b;
/*     */             ☃[gc.c.c()] = c;
/*     */             ☃[gc.d.c()] = d;
/*     */             ☃[gc.e.c()] = e;
/*     */             ☃[gc.f.c()] = f;
/*     */           });
/*     */     }
/*     */     c(int ☃, int i, int j, int k) {
/* 289 */       this.g = ☃;
/* 290 */       this.h = i;
/* 291 */       this.i = j;
/* 292 */       this.j = k;
/*     */     }
/*     */     
/*     */     public static c a(gc ☃) {
/* 296 */       return k[☃.c()];
/*     */     } }
/*     */   
/*     */   static class d {
/*     */     private boolean a;
/*     */     private final Long2IntLinkedOpenHashMap b;
/*     */     private final Long2FloatLinkedOpenHashMap c;
/*     */     
/*     */     private d() {
/* 305 */       this.b = x.<Long2IntLinkedOpenHashMap>a(() -> {
/*     */             Long2IntLinkedOpenHashMap ☃ = new Long2IntLinkedOpenHashMap(this, 100, 0.25F)
/*     */               {
/*     */                 protected void rehash(int ☃) {}
/*     */               };
/*     */             
/*     */             ☃.defaultReturnValue(2147483647);
/*     */             
/*     */             return ☃;
/*     */           });
/* 315 */       this.c = x.<Long2FloatLinkedOpenHashMap>a(() -> {
/*     */             Long2FloatLinkedOpenHashMap ☃ = new Long2FloatLinkedOpenHashMap(this, 100, 0.25F)
/*     */               {
/*     */                 protected void rehash(int ☃) {}
/*     */               };
/*     */             ☃.defaultReturnValue(Float.NaN);
/*     */             return ☃;
/*     */           });
/*     */     }
/*     */     
/*     */     public void a() {
/* 326 */       this.a = true;
/*     */     }
/*     */     
/*     */     public void b() {
/* 330 */       this.a = false;
/* 331 */       this.b.clear();
/* 332 */       this.c.clear();
/*     */     }
/*     */     
/*     */     public int a(ceh ☃, bra bra1, fx fx1) {
/* 336 */       long l = fx1.a();
/* 337 */       if (this.a) {
/* 338 */         int j = this.b.get(l);
/* 339 */         if (j != Integer.MAX_VALUE) {
/* 340 */           return j;
/*     */         }
/*     */       } 
/*     */       
/* 344 */       int i = eae.a(bra1, ☃, fx1);
/* 345 */       if (this.a) {
/* 346 */         if (this.b.size() == 100) {
/* 347 */           this.b.removeFirstInt();
/*     */         }
/* 349 */         this.b.put(l, i);
/*     */       } 
/* 351 */       return i;
/*     */     }
/*     */     
/*     */     public float b(ceh ☃, bra bra1, fx fx1) {
/* 355 */       long l = fx1.a();
/* 356 */       if (this.a) {
/* 357 */         float f1 = this.c.get(l);
/* 358 */         if (!Float.isNaN(f1)) {
/* 359 */           return f1;
/*     */         }
/*     */       } 
/*     */       
/* 363 */       float f = ☃.f(bra1, fx1);
/* 364 */       if (this.a) {
/* 365 */         if (this.c.size() == 100) {
/* 366 */           this.c.removeFirstFloat();
/*     */         }
/* 368 */         this.c.put(l, f);
/*     */       } 
/* 370 */       return f;
/*     */     }
/*     */   }
/*     */   
/* 374 */   private static final ThreadLocal<d> b = ThreadLocal.withInitial(() -> new d());
/*     */   
/*     */   public static void a() {
/* 377 */     ((d)b.get()).a();
/*     */   }
/*     */   
/*     */   public static void b() {
/* 381 */     ((d)b.get()).b();
/*     */   }
/*     */   
/*     */   class b {
/* 385 */     private final float[] b = new float[4];
/* 386 */     private final int[] c = new int[4];
/*     */ 
/*     */     
/*     */     public void a(bra ☃, ceh ceh1, fx fx1, gc gc1, float[] arrayOfFloat, BitSet bitSet, boolean bool) {
/*     */       float f5, f6, f7, f8;
/*     */       int n, i1, i2, i3;
/* 392 */       fx fx2 = bitSet.get(0) ? fx1.a(gc1) : fx1;
/* 393 */       eaz.a a = eaz.a.a(gc1);
/*     */       
/* 395 */       fx.a a1 = new fx.a();
/*     */       
/* 397 */       eaz.d d = eaz.c().get();
/*     */       
/* 399 */       a1.a(fx2, eaz.a.a(a)[0]);
/* 400 */       ceh ceh2 = ☃.d_(a1);
/* 401 */       int i = d.a(ceh2, ☃, a1);
/* 402 */       float f1 = d.b(ceh2, ☃, a1);
/*     */       
/* 404 */       a1.a(fx2, eaz.a.a(a)[1]);
/* 405 */       ceh ceh3 = ☃.d_(a1);
/* 406 */       int j = d.a(ceh3, ☃, a1);
/* 407 */       float f2 = d.b(ceh3, ☃, a1);
/*     */       
/* 409 */       a1.a(fx2, eaz.a.a(a)[2]);
/* 410 */       ceh ceh4 = ☃.d_(a1);
/* 411 */       int k = d.a(ceh4, ☃, a1);
/* 412 */       float f3 = d.b(ceh4, ☃, a1);
/*     */       
/* 414 */       a1.a(fx2, eaz.a.a(a)[3]);
/* 415 */       ceh ceh5 = ☃.d_(a1);
/* 416 */       int m = d.a(ceh5, ☃, a1);
/* 417 */       float f4 = d.b(ceh5, ☃, a1);
/*     */       
/* 419 */       a1.a(fx2, eaz.a.a(a)[0]).c(gc1);
/* 420 */       boolean bool1 = (☃.d_(a1).b(☃, a1) == 0);
/* 421 */       a1.a(fx2, eaz.a.a(a)[1]).c(gc1);
/* 422 */       boolean bool2 = (☃.d_(a1).b(☃, a1) == 0);
/* 423 */       a1.a(fx2, eaz.a.a(a)[2]).c(gc1);
/* 424 */       boolean bool3 = (☃.d_(a1).b(☃, a1) == 0);
/* 425 */       a1.a(fx2, eaz.a.a(a)[3]).c(gc1);
/* 426 */       boolean bool4 = (☃.d_(a1).b(☃, a1) == 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 437 */       if (bool3 || bool1) {
/* 438 */         a1.a(fx2, eaz.a.a(a)[0]).c(eaz.a.a(a)[2]);
/* 439 */         ceh ceh7 = ☃.d_(a1);
/* 440 */         f5 = d.b(ceh7, ☃, a1);
/* 441 */         n = d.a(ceh7, ☃, a1);
/*     */       } else {
/* 443 */         f5 = f1;
/* 444 */         n = i;
/*     */       } 
/* 446 */       if (bool4 || bool1) {
/* 447 */         a1.a(fx2, eaz.a.a(a)[0]).c(eaz.a.a(a)[3]);
/* 448 */         ceh ceh7 = ☃.d_(a1);
/* 449 */         f6 = d.b(ceh7, ☃, a1);
/* 450 */         i1 = d.a(ceh7, ☃, a1);
/*     */       } else {
/* 452 */         f6 = f1;
/* 453 */         i1 = i;
/*     */       } 
/* 455 */       if (bool3 || bool2) {
/* 456 */         a1.a(fx2, eaz.a.a(a)[1]).c(eaz.a.a(a)[2]);
/* 457 */         ceh ceh7 = ☃.d_(a1);
/* 458 */         f7 = d.b(ceh7, ☃, a1);
/* 459 */         i2 = d.a(ceh7, ☃, a1);
/*     */       } else {
/* 461 */         f7 = f1;
/* 462 */         i2 = i;
/*     */       } 
/* 464 */       if (bool4 || bool2) {
/* 465 */         a1.a(fx2, eaz.a.a(a)[1]).c(eaz.a.a(a)[3]);
/* 466 */         ceh ceh7 = ☃.d_(a1);
/* 467 */         f8 = d.b(ceh7, ☃, a1);
/* 468 */         i3 = d.a(ceh7, ☃, a1);
/*     */       } else {
/* 470 */         f8 = f1;
/* 471 */         i3 = i;
/*     */       } 
/*     */       
/* 474 */       int i4 = d.a(ceh1, ☃, fx1);
/* 475 */       a1.a(fx1, gc1);
/* 476 */       ceh ceh6 = ☃.d_(a1);
/* 477 */       if (bitSet.get(0) || !ceh6.i(☃, a1)) {
/* 478 */         i4 = d.a(ceh6, ☃, a1);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 483 */       float f9 = bitSet.get(0) ? d.b(☃.d_(fx2), ☃, fx2) : d.b(☃.d_(fx1), ☃, fx1);
/*     */       
/* 485 */       eaz.c c = eaz.c.a(gc1);
/*     */       
/* 487 */       if (!bitSet.get(1) || !eaz.a.b(a)) {
/* 488 */         float f11 = (f4 + f1 + f6 + f9) * 0.25F;
/* 489 */         float f12 = (f3 + f1 + f5 + f9) * 0.25F;
/* 490 */         float f13 = (f3 + f2 + f7 + f9) * 0.25F;
/* 491 */         float f14 = (f4 + f2 + f8 + f9) * 0.25F;
/*     */         
/* 493 */         this.c[eaz.c.a(c)] = a(m, i, i1, i4);
/* 494 */         this.c[eaz.c.b(c)] = a(k, i, n, i4);
/* 495 */         this.c[eaz.c.c(c)] = a(k, j, i2, i4);
/* 496 */         this.c[eaz.c.d(c)] = a(m, j, i3, i4);
/*     */         
/* 498 */         this.b[eaz.c.a(c)] = f11;
/* 499 */         this.b[eaz.c.b(c)] = f12;
/* 500 */         this.b[eaz.c.c(c)] = f13;
/* 501 */         this.b[eaz.c.d(c)] = f14;
/*     */       } else {
/* 503 */         float f11 = (f4 + f1 + f6 + f9) * 0.25F;
/* 504 */         float f12 = (f3 + f1 + f5 + f9) * 0.25F;
/* 505 */         float f13 = (f3 + f2 + f7 + f9) * 0.25F;
/* 506 */         float f14 = (f4 + f2 + f8 + f9) * 0.25F;
/*     */         
/* 508 */         float f15 = arrayOfFloat[eaz.e.a(eaz.a.c(a)[0])] * arrayOfFloat[eaz.e.a(eaz.a.c(a)[1])];
/* 509 */         float f16 = arrayOfFloat[eaz.e.a(eaz.a.c(a)[2])] * arrayOfFloat[eaz.e.a(eaz.a.c(a)[3])];
/* 510 */         float f17 = arrayOfFloat[eaz.e.a(eaz.a.c(a)[4])] * arrayOfFloat[eaz.e.a(eaz.a.c(a)[5])];
/* 511 */         float f18 = arrayOfFloat[eaz.e.a(eaz.a.c(a)[6])] * arrayOfFloat[eaz.e.a(eaz.a.c(a)[7])];
/*     */         
/* 513 */         float f19 = arrayOfFloat[eaz.e.a(eaz.a.d(a)[0])] * arrayOfFloat[eaz.e.a(eaz.a.d(a)[1])];
/* 514 */         float f20 = arrayOfFloat[eaz.e.a(eaz.a.d(a)[2])] * arrayOfFloat[eaz.e.a(eaz.a.d(a)[3])];
/* 515 */         float f21 = arrayOfFloat[eaz.e.a(eaz.a.d(a)[4])] * arrayOfFloat[eaz.e.a(eaz.a.d(a)[5])];
/* 516 */         float f22 = arrayOfFloat[eaz.e.a(eaz.a.d(a)[6])] * arrayOfFloat[eaz.e.a(eaz.a.d(a)[7])];
/*     */         
/* 518 */         float f23 = arrayOfFloat[eaz.e.a(eaz.a.e(a)[0])] * arrayOfFloat[eaz.e.a(eaz.a.e(a)[1])];
/* 519 */         float f24 = arrayOfFloat[eaz.e.a(eaz.a.e(a)[2])] * arrayOfFloat[eaz.e.a(eaz.a.e(a)[3])];
/* 520 */         float f25 = arrayOfFloat[eaz.e.a(eaz.a.e(a)[4])] * arrayOfFloat[eaz.e.a(eaz.a.e(a)[5])];
/* 521 */         float f26 = arrayOfFloat[eaz.e.a(eaz.a.e(a)[6])] * arrayOfFloat[eaz.e.a(eaz.a.e(a)[7])];
/*     */         
/* 523 */         float f27 = arrayOfFloat[eaz.e.a(eaz.a.f(a)[0])] * arrayOfFloat[eaz.e.a(eaz.a.f(a)[1])];
/* 524 */         float f28 = arrayOfFloat[eaz.e.a(eaz.a.f(a)[2])] * arrayOfFloat[eaz.e.a(eaz.a.f(a)[3])];
/* 525 */         float f29 = arrayOfFloat[eaz.e.a(eaz.a.f(a)[4])] * arrayOfFloat[eaz.e.a(eaz.a.f(a)[5])];
/* 526 */         float f30 = arrayOfFloat[eaz.e.a(eaz.a.f(a)[6])] * arrayOfFloat[eaz.e.a(eaz.a.f(a)[7])];
/*     */         
/* 528 */         this.b[eaz.c.a(c)] = f11 * f15 + f12 * f16 + f13 * f17 + f14 * f18;
/* 529 */         this.b[eaz.c.b(c)] = f11 * f19 + f12 * f20 + f13 * f21 + f14 * f22;
/* 530 */         this.b[eaz.c.c(c)] = f11 * f23 + f12 * f24 + f13 * f25 + f14 * f26;
/* 531 */         this.b[eaz.c.d(c)] = f11 * f27 + f12 * f28 + f13 * f29 + f14 * f30;
/*     */         
/* 533 */         int i6 = a(m, i, i1, i4);
/* 534 */         int i7 = a(k, i, n, i4);
/* 535 */         int i8 = a(k, j, i2, i4);
/* 536 */         int i9 = a(m, j, i3, i4);
/*     */         
/* 538 */         this.c[eaz.c.a(c)] = a(i6, i7, i8, i9, f15, f16, f17, f18);
/* 539 */         this.c[eaz.c.b(c)] = a(i6, i7, i8, i9, f19, f20, f21, f22);
/* 540 */         this.c[eaz.c.c(c)] = a(i6, i7, i8, i9, f23, f24, f25, f26);
/* 541 */         this.c[eaz.c.d(c)] = a(i6, i7, i8, i9, f27, f28, f29, f30);
/*     */       } 
/*     */       
/* 544 */       float f10 = ☃.a(gc1, bool);
/* 545 */       for (int i5 = 0; i5 < this.b.length; i5++) {
/* 546 */         this.b[i5] = this.b[i5] * f10;
/*     */       }
/*     */     }
/*     */     
/*     */     private int a(int ☃, int i, int j, int k) {
/* 551 */       if (☃ == 0) {
/* 552 */         ☃ = k;
/*     */       }
/* 554 */       if (i == 0) {
/* 555 */         i = k;
/*     */       }
/* 557 */       if (j == 0) {
/* 558 */         j = k;
/*     */       }
/* 560 */       return ☃ + i + j + k >> 2 & 0xFF00FF;
/*     */     }
/*     */     public b(eaz this$0) {}
/*     */     private int a(int ☃, int i, int j, int k, float f1, float f2, float f3, float f4) {
/* 564 */       int m = (int)((☃ >> 16 & 0xFF) * f1 + (i >> 16 & 0xFF) * f2 + (j >> 16 & 0xFF) * f3 + (k >> 16 & 0xFF) * f4) & 0xFF;
/* 565 */       int n = (int)((☃ & 0xFF) * f1 + (i & 0xFF) * f2 + (j & 0xFF) * f3 + (k & 0xFF) * f4) & 0xFF;
/* 566 */       return m << 16 | n;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum e {
/* 571 */     a((String)gc.a, false),
/* 572 */     b((String)gc.b, false),
/* 573 */     c((String)gc.c, false),
/* 574 */     d((String)gc.d, false),
/* 575 */     e((String)gc.e, false),
/* 576 */     f((String)gc.f, false),
/* 577 */     g((String)gc.a, true),
/* 578 */     h((String)gc.b, true),
/* 579 */     i((String)gc.c, true),
/* 580 */     j((String)gc.d, true),
/* 581 */     k((String)gc.e, true),
/* 582 */     l((String)gc.f, true);
/*     */     
/*     */     private final int m;
/*     */     
/*     */     e(gc ☃, boolean bool) {
/* 587 */       this.m = ☃.c() + (bool ? (gc.values()).length : 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public enum a {
/* 592 */     a((String)new gc[] { gc.e, gc.f, gc.c, gc.d }, 0.5F, true, new eaz.e[] { eaz.e.k, eaz.e.d, eaz.e.k, eaz.e.j, eaz.e.e, eaz.e.j, eaz.e.e, eaz.e.d }, new eaz.e[] { eaz.e.k, eaz.e.c, eaz.e.k, eaz.e.i, eaz.e.e, eaz.e.i, eaz.e.e, eaz.e.c }, new eaz.e[] { eaz.e.l, eaz.e.c, eaz.e.l, eaz.e.i, eaz.e.f, eaz.e.i, eaz.e.f, eaz.e.c }, new eaz.e[] { eaz.e.l, eaz.e.d, eaz.e.l, eaz.e.j, eaz.e.f, eaz.e.j, eaz.e.f, eaz.e.d
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }),
/* 598 */     b((String)new gc[] { gc.f, gc.e, gc.c, gc.d }, 1.0F, true, new eaz.e[] { eaz.e.f, eaz.e.d, eaz.e.f, eaz.e.j, eaz.e.l, eaz.e.j, eaz.e.l, eaz.e.d }, new eaz.e[] { eaz.e.f, eaz.e.c, eaz.e.f, eaz.e.i, eaz.e.l, eaz.e.i, eaz.e.l, eaz.e.c }, new eaz.e[] { eaz.e.e, eaz.e.c, eaz.e.e, eaz.e.i, eaz.e.k, eaz.e.i, eaz.e.k, eaz.e.c }, new eaz.e[] { eaz.e.e, eaz.e.d, eaz.e.e, eaz.e.j, eaz.e.k, eaz.e.j, eaz.e.k, eaz.e.d
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }),
/* 604 */     c((String)new gc[] { gc.b, gc.a, gc.f, gc.e }, 0.8F, true, new eaz.e[] { eaz.e.b, eaz.e.k, eaz.e.b, eaz.e.e, eaz.e.h, eaz.e.e, eaz.e.h, eaz.e.k }, new eaz.e[] { eaz.e.b, eaz.e.l, eaz.e.b, eaz.e.f, eaz.e.h, eaz.e.f, eaz.e.h, eaz.e.l }, new eaz.e[] { eaz.e.a, eaz.e.l, eaz.e.a, eaz.e.f, eaz.e.g, eaz.e.f, eaz.e.g, eaz.e.l }, new eaz.e[] { eaz.e.a, eaz.e.k, eaz.e.a, eaz.e.e, eaz.e.g, eaz.e.e, eaz.e.g, eaz.e.k
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }),
/* 610 */     d((String)new gc[] { gc.e, gc.f, gc.a, gc.b }, 0.8F, true, new eaz.e[] { eaz.e.b, eaz.e.k, eaz.e.h, eaz.e.k, eaz.e.h, eaz.e.e, eaz.e.b, eaz.e.e }, new eaz.e[] { eaz.e.a, eaz.e.k, eaz.e.g, eaz.e.k, eaz.e.g, eaz.e.e, eaz.e.a, eaz.e.e }, new eaz.e[] { eaz.e.a, eaz.e.l, eaz.e.g, eaz.e.l, eaz.e.g, eaz.e.f, eaz.e.a, eaz.e.f }, new eaz.e[] { eaz.e.b, eaz.e.l, eaz.e.h, eaz.e.l, eaz.e.h, eaz.e.f, eaz.e.b, eaz.e.f
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }),
/* 616 */     e((String)new gc[] { gc.b, gc.a, gc.c, gc.d }, 0.6F, true, new eaz.e[] { eaz.e.b, eaz.e.d, eaz.e.b, eaz.e.j, eaz.e.h, eaz.e.j, eaz.e.h, eaz.e.d }, new eaz.e[] { eaz.e.b, eaz.e.c, eaz.e.b, eaz.e.i, eaz.e.h, eaz.e.i, eaz.e.h, eaz.e.c }, new eaz.e[] { eaz.e.a, eaz.e.c, eaz.e.a, eaz.e.i, eaz.e.g, eaz.e.i, eaz.e.g, eaz.e.c }, new eaz.e[] { eaz.e.a, eaz.e.d, eaz.e.a, eaz.e.j, eaz.e.g, eaz.e.j, eaz.e.g, eaz.e.d
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }),
/* 622 */     f((String)new gc[] { gc.a, gc.b, gc.c, gc.d }, 0.6F, true, new eaz.e[] { eaz.e.g, eaz.e.d, eaz.e.g, eaz.e.j, eaz.e.a, eaz.e.j, eaz.e.a, eaz.e.d }, new eaz.e[] { eaz.e.g, eaz.e.c, eaz.e.g, eaz.e.i, eaz.e.a, eaz.e.i, eaz.e.a, eaz.e.c }, new eaz.e[] { eaz.e.h, eaz.e.c, eaz.e.h, eaz.e.i, eaz.e.b, eaz.e.i, eaz.e.b, eaz.e.c }, new eaz.e[] { eaz.e.h, eaz.e.d, eaz.e.h, eaz.e.j, eaz.e.b, eaz.e.j, eaz.e.b, eaz.e.d });
/*     */     
/*     */     private final gc[] g;
/*     */     
/*     */     private final boolean h;
/*     */     
/*     */     private final eaz.e[] i;
/*     */     
/*     */     private final eaz.e[] j;
/*     */     private final eaz.e[] k;
/*     */     private final eaz.e[] l;
/*     */     private static final a[] m;
/*     */     
/*     */     static {
/* 636 */       m = x.<a[]>a(new a[6], ☃ -> {
/*     */             ☃[gc.a.c()] = a;
/*     */             ☃[gc.b.c()] = b;
/*     */             ☃[gc.c.c()] = c;
/*     */             ☃[gc.d.c()] = d;
/*     */             ☃[gc.e.c()] = e;
/*     */             ☃[gc.f.c()] = f;
/*     */           });
/*     */     }
/*     */     a(gc[] ☃, float f, boolean bool, eaz.e[] arrayOfE1, eaz.e[] arrayOfE2, eaz.e[] arrayOfE3, eaz.e[] arrayOfE4) {
/* 646 */       this.g = ☃;
/* 647 */       this.h = bool;
/* 648 */       this.i = arrayOfE1;
/* 649 */       this.j = arrayOfE2;
/* 650 */       this.k = arrayOfE3;
/* 651 */       this.l = arrayOfE4;
/*     */     }
/*     */     
/*     */     public static a a(gc ☃) {
/* 655 */       return m[☃.c()];
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eaz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
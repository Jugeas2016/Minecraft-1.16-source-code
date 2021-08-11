/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.math.DoubleMath;
/*     */ import com.google.common.math.IntMath;
/*     */ import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
/*     */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.Objects;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class dde
/*     */ {
/*     */   private static final ddh b;
/*     */   
/*     */   static {
/*  26 */     b = x.<ddh>a(() -> {
/*     */           dcw ☃ = new dcq(1, 1, 1);
/*     */           ☃.a(0, 0, 0, true, true);
/*     */           return new dcu(☃);
/*     */         });
/*     */   }
/*  32 */   public static final ddh a = a(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  37 */   private static final ddh c = new dcp(new dcq(0, 0, 0), (DoubleList)new DoubleArrayList(new double[] { 0.0D }, ), (DoubleList)new DoubleArrayList(new double[] { 0.0D }, ), (DoubleList)new DoubleArrayList(new double[] { 0.0D }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ddh a() {
/*  45 */     return c;
/*     */   }
/*     */   
/*     */   public static ddh b() {
/*  49 */     return b;
/*     */   }
/*     */   
/*     */   public static ddh a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/*  53 */     return a(new dci(☃, d1, d2, d3, d4, d5));
/*     */   }
/*     */   
/*     */   public static ddh a(dci ☃) {
/*  57 */     int i = a(☃.a, ☃.d);
/*  58 */     int j = a(☃.b, ☃.e);
/*  59 */     int k = a(☃.c, ☃.f);
/*     */     
/*  61 */     if (i < 0 || j < 0 || k < 0) {
/*  62 */       return new dcp(b.a, new double[] { ☃.a, ☃.d }, new double[] { ☃.b, ☃.e }, new double[] { ☃.c, ☃.f });
/*     */     }
/*     */     
/*  65 */     if (i == 0 && j == 0 && k == 0) {
/*  66 */       return ☃.e(0.5D, 0.5D, 0.5D) ? b() : a();
/*     */     }
/*     */     
/*  69 */     int m = 1 << i;
/*  70 */     int n = 1 << j;
/*  71 */     int i1 = 1 << k;
/*     */     
/*  73 */     int i2 = (int)Math.round(☃.a * m);
/*  74 */     int i3 = (int)Math.round(☃.d * m);
/*  75 */     int i4 = (int)Math.round(☃.b * n);
/*  76 */     int i5 = (int)Math.round(☃.e * n);
/*  77 */     int i6 = (int)Math.round(☃.c * i1);
/*  78 */     int i7 = (int)Math.round(☃.f * i1);
/*     */     
/*  80 */     dcq dcq = new dcq(m, n, i1, i2, i4, i6, i3, i5, i7);
/*     */ 
/*     */     
/*     */     long l;
/*     */ 
/*     */     
/*  86 */     for (l = i2; l < i3; l++) {
/*  87 */       long l1; for (l1 = i4; l1 < i5; l1++) {
/*  88 */         long l2; for (l2 = i6; l2 < i7; l2++) {
/*  89 */           dcq.a((int)l, (int)l1, (int)l2, false, true);
/*     */         }
/*     */       } 
/*     */     } 
/*  93 */     return new dcu(dcq);
/*     */   }
/*     */   
/*     */   private static int a(double ☃, double d1) {
/*  97 */     if (☃ < -1.0E-7D || d1 > 1.0000001D) {
/*  98 */       return -1;
/*     */     }
/* 100 */     for (int i = 0; i <= 3; i++) {
/* 101 */       double d2 = ☃ * (1 << i);
/* 102 */       double d3 = d1 * (1 << i);
/* 103 */       boolean bool1 = (Math.abs(d2 - Math.floor(d2)) < 1.0E-7D);
/* 104 */       boolean bool2 = (Math.abs(d3 - Math.floor(d3)) < 1.0E-7D);
/* 105 */       if (bool1 && bool2) {
/* 106 */         return i;
/*     */       }
/*     */     } 
/* 109 */     return -1;
/*     */   }
/*     */   
/*     */   protected static long a(int ☃, int i) {
/* 113 */     return ☃ * (i / IntMath.gcd(☃, i));
/*     */   }
/*     */   
/*     */   public static ddh a(ddh ☃, ddh ddh1) {
/* 117 */     return a(☃, ddh1, dcr.o);
/*     */   }
/*     */   
/*     */   public static ddh a(ddh ☃, ddh... arrayOfDdh) {
/* 121 */     return Arrays.<ddh>stream(arrayOfDdh).reduce(☃, dde::a);
/*     */   }
/*     */   
/*     */   public static ddh a(ddh ☃, ddh ddh1, dcr dcr1) {
/* 125 */     return b(☃, ddh1, dcr1).c();
/*     */   }
/*     */   
/*     */   public static ddh b(ddh ☃, ddh ddh1, dcr dcr1) {
/* 129 */     if (dcr1.apply(false, false)) {
/* 130 */       throw (IllegalArgumentException)x.c(new IllegalArgumentException());
/*     */     }
/* 132 */     if (☃ == ddh1) {
/* 133 */       return dcr1.apply(true, true) ? ☃ : a();
/*     */     }
/* 135 */     boolean bool1 = dcr1.apply(true, false);
/* 136 */     boolean bool2 = dcr1.apply(false, true);
/*     */     
/* 138 */     if (☃.b()) {
/* 139 */       return bool2 ? ddh1 : a();
/*     */     }
/* 141 */     if (ddh1.b()) {
/* 142 */       return bool1 ? ☃ : a();
/*     */     }
/*     */     
/* 145 */     dcz dcz1 = a(1, ☃.a(gc.a.a), ddh1.a(gc.a.a), bool1, bool2);
/* 146 */     dcz dcz2 = a(dcz1.a().size() - 1, ☃.a(gc.a.b), ddh1.a(gc.a.b), bool1, bool2);
/* 147 */     dcz dcz3 = a((dcz1.a().size() - 1) * (dcz2.a().size() - 1), ☃.a(gc.a.c), ddh1.a(gc.a.c), bool1, bool2);
/*     */     
/* 149 */     dcq dcq = dcq.a(☃.a, ddh1.a, dcz1, dcz2, dcz3, dcr1);
/* 150 */     if (dcz1 instanceof dcv && dcz2 instanceof dcv && dcz3 instanceof dcv) {
/* 151 */       return new dcu(dcq);
/*     */     }
/* 153 */     return new dcp(dcq, dcz1.a(), dcz2.a(), dcz3.a());
/*     */   }
/*     */   
/*     */   public static boolean c(ddh ☃, ddh ddh1, dcr dcr1) {
/* 157 */     if (dcr1.apply(false, false)) {
/* 158 */       throw (IllegalArgumentException)x.c(new IllegalArgumentException());
/*     */     }
/* 160 */     if (☃ == ddh1) {
/* 161 */       return dcr1.apply(true, true);
/*     */     }
/* 163 */     if (☃.b()) {
/* 164 */       return dcr1.apply(false, !ddh1.b());
/*     */     }
/* 166 */     if (ddh1.b()) {
/* 167 */       return dcr1.apply(!☃.b(), false);
/*     */     }
/* 169 */     boolean bool1 = dcr1.apply(true, false);
/* 170 */     boolean bool2 = dcr1.apply(false, true);
/* 171 */     for (gc.a a : fv.d) {
/* 172 */       if (☃.c(a) < ddh1.b(a) - 1.0E-7D) {
/* 173 */         return (bool1 || bool2);
/*     */       }
/* 175 */       if (ddh1.c(a) < ☃.b(a) - 1.0E-7D) {
/* 176 */         return (bool1 || bool2);
/*     */       }
/*     */     } 
/* 179 */     dcz dcz1 = a(1, ☃.a(gc.a.a), ddh1.a(gc.a.a), bool1, bool2);
/* 180 */     dcz dcz2 = a(dcz1.a().size() - 1, ☃.a(gc.a.b), ddh1.a(gc.a.b), bool1, bool2);
/* 181 */     dcz dcz3 = a((dcz1.a().size() - 1) * (dcz2.a().size() - 1), ☃.a(gc.a.c), ddh1.a(gc.a.c), bool1, bool2);
/* 182 */     return a(dcz1, dcz2, dcz3, ☃.a, ddh1.a, dcr1);
/*     */   }
/*     */   
/*     */   private static boolean a(dcz ☃, dcz dcz1, dcz dcz2, dcw dcw1, dcw dcw2, dcr dcr1) {
/* 186 */     return !☃.a((i, j, k) -> ☃.a(()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static double a(gc.a ☃, dci dci1, Stream<ddh> stream, double d) {
/* 196 */     Iterator<ddh> iterator = stream.iterator();
/* 197 */     while (iterator.hasNext()) {
/* 198 */       if (Math.abs(d) < 1.0E-7D) {
/* 199 */         return 0.0D;
/*     */       }
/* 201 */       d = ((ddh)iterator.next()).a(☃, dci1, d);
/*     */     } 
/* 203 */     return d;
/*     */   }
/*     */   
/*     */   public static double a(gc.a ☃, dci dci1, brz brz1, double d, dcs dcs1, Stream<ddh> stream) {
/* 207 */     return a(dci1, brz1, d, dcs1, fv.a(☃, gc.a.c), stream);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static double a(dci ☃, brz brz1, double d, dcs dcs1, fv fv1, Stream<ddh> stream) {
/* 213 */     if (☃.b() < 1.0E-6D || ☃.c() < 1.0E-6D || ☃.d() < 1.0E-6D) {
/* 214 */       return d;
/*     */     }
/*     */     
/* 217 */     if (Math.abs(d) < 1.0E-7D) {
/* 218 */       return 0.0D;
/*     */     }
/*     */     
/* 221 */     fv fv2 = fv1.a();
/* 222 */     gc.a a1 = fv2.a(gc.a.a);
/* 223 */     gc.a a2 = fv2.a(gc.a.b);
/* 224 */     gc.a a3 = fv2.a(gc.a.c);
/*     */     
/* 226 */     fx.a a = new fx.a();
/*     */     
/* 228 */     int i = afm.c(☃.a(a1) - 1.0E-7D) - 1;
/* 229 */     int j = afm.c(☃.b(a1) + 1.0E-7D) + 1;
/* 230 */     int k = afm.c(☃.a(a2) - 1.0E-7D) - 1;
/* 231 */     int m = afm.c(☃.b(a2) + 1.0E-7D) + 1;
/* 232 */     double d1 = ☃.a(a3) - 1.0E-7D;
/* 233 */     double d2 = ☃.b(a3) + 1.0E-7D;
/*     */     
/* 235 */     boolean bool = (d > 0.0D);
/*     */     
/* 237 */     int n = bool ? (afm.c(☃.b(a3) - 1.0E-7D) - 1) : (afm.c(☃.a(a3) + 1.0E-7D) + 1);
/* 238 */     int i1 = a(d, d1, d2);
/* 239 */     int i2 = bool ? 1 : -1;
/*     */     int i3;
/* 241 */     for (i3 = n; bool ? (i3 <= i1) : (i3 >= i1); i3 += i2) {
/* 242 */       for (int i4 = i; i4 <= j; i4++) {
/* 243 */         for (int i5 = k; i5 <= m; i5++) {
/* 244 */           int i6 = 0;
/* 245 */           if (i4 == i || i4 == j) {
/* 246 */             i6++;
/*     */           }
/* 248 */           if (i5 == k || i5 == m) {
/* 249 */             i6++;
/*     */           }
/* 251 */           if (i3 == n || i3 == i1) {
/* 252 */             i6++;
/*     */           }
/* 254 */           if (i6 < 3) {
/*     */ 
/*     */             
/* 257 */             a.a(fv2, i4, i5, i3);
/*     */             
/* 259 */             ceh ceh = brz1.d_(a);
/*     */             
/* 261 */             if (i6 != 1 || ceh.d())
/*     */             {
/*     */               
/* 264 */               if (i6 != 2 || ceh.a(bup.bo)) {
/*     */ 
/*     */                 
/* 267 */                 d = ceh.b(brz1, a, dcs1).a(a3, ☃.d(-a.u(), -a.v(), -a.w()), d);
/* 268 */                 if (Math.abs(d) < 1.0E-7D) {
/* 269 */                   return 0.0D;
/*     */                 }
/* 271 */                 i1 = a(d, d1, d2);
/*     */               }  } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 276 */     }  double[] arrayOfDouble = { d };
/* 277 */     stream.forEach(ddh1 -> ☃[0] = ddh1.a(a1, dci1, ☃[0]));
/*     */ 
/*     */ 
/*     */     
/* 281 */     return arrayOfDouble[0];
/*     */   }
/*     */   
/*     */   private static int a(double ☃, double d1, double d2) {
/* 285 */     return (☃ > 0.0D) ? (afm.c(d2 + ☃) + 1) : (afm.c(d1 + ☃) - 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(ddh ☃, ddh ddh1, gc gc1) {
/* 292 */     if (☃ == b() && ddh1 == b()) {
/* 293 */       return true;
/*     */     }
/* 295 */     if (ddh1.b()) {
/* 296 */       return false;
/*     */     }
/* 298 */     gc.a a = gc1.n();
/* 299 */     gc.b b = gc1.e();
/*     */     
/* 301 */     ddh ddh2 = (b == gc.b.a) ? ☃ : ddh1;
/* 302 */     ddh ddh3 = (b == gc.b.a) ? ddh1 : ☃;
/* 303 */     dcr dcr = (b == gc.b.a) ? dcr.e : dcr.c;
/*     */     
/* 305 */     return (DoubleMath.fuzzyEquals(ddh2.c(a), 1.0D, 1.0E-7D) && 
/* 306 */       DoubleMath.fuzzyEquals(ddh3.b(a), 0.0D, 1.0E-7D) && 
/* 307 */       !c(new ddf(ddh2, a, ddh2.a.c(a) - 1), new ddf(ddh3, a, 0), dcr));
/*     */   } public static ddh a(ddh ☃, gc gc1) {
/*     */     boolean bool;
/*     */     int i;
/* 311 */     if (☃ == b()) {
/* 312 */       return b();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 317 */     gc.a a = gc1.n();
/* 318 */     if (gc1.e() == gc.b.a) {
/* 319 */       bool = DoubleMath.fuzzyEquals(☃.c(a), 1.0D, 1.0E-7D);
/* 320 */       i = ☃.a.c(a) - 1;
/*     */     } else {
/* 322 */       bool = DoubleMath.fuzzyEquals(☃.b(a), 0.0D, 1.0E-7D);
/* 323 */       i = 0;
/*     */     } 
/*     */     
/* 326 */     if (!bool) {
/* 327 */       return a();
/*     */     }
/*     */     
/* 330 */     return new ddf(☃, a, i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean b(ddh ☃, ddh ddh1, gc gc1) {
/* 337 */     if (☃ == b() || ddh1 == b()) {
/* 338 */       return true;
/*     */     }
/*     */     
/* 341 */     gc.a a = gc1.n();
/* 342 */     gc.b b = gc1.e();
/*     */     
/* 344 */     ddh ddh2 = (b == gc.b.a) ? ☃ : ddh1;
/* 345 */     ddh ddh3 = (b == gc.b.a) ? ddh1 : ☃;
/*     */     
/* 347 */     if (!DoubleMath.fuzzyEquals(ddh2.c(a), 1.0D, 1.0E-7D)) {
/* 348 */       ddh2 = a();
/*     */     }
/* 350 */     if (!DoubleMath.fuzzyEquals(ddh3.b(a), 0.0D, 1.0E-7D)) {
/* 351 */       ddh3 = a();
/*     */     }
/*     */     
/* 354 */     return !c(b(), b(new ddf(ddh2, a, ddh2.a.c(a) - 1), new ddf(ddh3, a, 0), dcr.o), dcr.e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean b(ddh ☃, ddh ddh1) {
/* 361 */     if (☃ == b() || ddh1 == b()) {
/* 362 */       return true;
/*     */     }
/*     */     
/* 365 */     if (☃.b() && ddh1.b()) {
/* 366 */       return false;
/*     */     }
/*     */     
/* 369 */     return !c(
/* 370 */         b(), 
/* 371 */         b(☃, ddh1, dcr.o), dcr.e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @VisibleForTesting
/*     */   protected static dcz a(int ☃, DoubleList doubleList1, DoubleList doubleList2, boolean bool1, boolean bool2) {
/* 382 */     int i = doubleList1.size() - 1;
/* 383 */     int j = doubleList2.size() - 1;
/* 384 */     if (doubleList1 instanceof dct && doubleList2 instanceof dct) {
/* 385 */       long l = a(i, j);
/* 386 */       if (☃ * l <= 256L) {
/* 387 */         return new dcv(i, j);
/*     */       }
/*     */     } 
/*     */     
/* 391 */     if (doubleList1.getDouble(i) < doubleList2.getDouble(0) - 1.0E-7D)
/* 392 */       return new ddc(doubleList1, doubleList2, false); 
/* 393 */     if (doubleList2.getDouble(j) < doubleList1.getDouble(0) - 1.0E-7D) {
/* 394 */       return new ddc(doubleList2, doubleList1, true);
/*     */     }
/*     */     
/* 397 */     if (i == j && Objects.equals(doubleList1, doubleList2)) {
/* 398 */       if (doubleList1 instanceof dcy) {
/* 399 */         return (dcz)doubleList1;
/*     */       }
/* 401 */       if (doubleList2 instanceof dcy) {
/* 402 */         return (dcz)doubleList2;
/*     */       }
/* 404 */       return new dcy(doubleList1);
/*     */     } 
/*     */     
/* 407 */     return new dda(doubleList1, doubleList2, bool1, bool2);
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     void consume(double param1Double1, double param1Double2, double param1Double3, double param1Double4, double param1Double5, double param1Double6);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dde.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
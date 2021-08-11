/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import java.util.function.IntPredicate;
/*     */ import org.apache.commons.lang3.math.NumberUtils;
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
/*     */ public class afm
/*     */ {
/*  32 */   public static final float a = c(2.0F);
/*     */   private static final float[] b;
/*     */   
/*     */   static {
/*  36 */     b = x.<float[]>a(new float[65536], ☃ -> {
/*     */           for (int i = 0; i < ☃.length; i++)
/*     */             ☃[i] = (float)Math.sin(i * Math.PI * 2.0D / 65536.0D); 
/*     */         });
/*     */   }
/*     */   
/*  42 */   private static final Random c = new Random();
/*     */   
/*     */   public static float a(float ☃) {
/*  45 */     return b[(int)(☃ * 10430.378F) & 0xFFFF];
/*     */   }
/*     */   
/*     */   public static float b(float ☃) {
/*  49 */     return b[(int)(☃ * 10430.378F + 16384.0F) & 0xFFFF];
/*     */   }
/*     */   
/*     */   public static float c(float ☃) {
/*  53 */     return (float)Math.sqrt(☃);
/*     */   }
/*     */   
/*     */   public static float a(double ☃) {
/*  57 */     return (float)Math.sqrt(☃);
/*     */   }
/*     */   
/*     */   public static int d(float ☃) {
/*  61 */     int i = (int)☃;
/*  62 */     return (☃ < i) ? (i - 1) : i;
/*     */   }
/*     */   
/*     */   public static int b(double ☃) {
/*  66 */     return (int)(☃ + 1024.0D) - 1024;
/*     */   }
/*     */   
/*     */   public static int c(double ☃) {
/*  70 */     int i = (int)☃;
/*  71 */     return (☃ < i) ? (i - 1) : i;
/*     */   }
/*     */   
/*     */   public static long d(double ☃) {
/*  75 */     long l = (long)☃;
/*  76 */     return (☃ < l) ? (l - 1L) : l;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float e(float ☃) {
/*  84 */     return Math.abs(☃);
/*     */   }
/*     */   
/*     */   public static int a(int ☃) {
/*  88 */     return Math.abs(☃);
/*     */   }
/*     */   
/*     */   public static int f(float ☃) {
/*  92 */     int i = (int)☃;
/*  93 */     return (☃ > i) ? (i + 1) : i;
/*     */   }
/*     */   
/*     */   public static int f(double ☃) {
/*  97 */     int i = (int)☃;
/*  98 */     return (☃ > i) ? (i + 1) : i;
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
/*     */   public static int a(int ☃, int i, int j) {
/* 112 */     if (☃ < i) {
/* 113 */       return i;
/*     */     }
/* 115 */     if (☃ > j) {
/* 116 */       return j;
/*     */     }
/* 118 */     return ☃;
/*     */   }
/*     */   
/*     */   public static long a(long ☃, long l1, long l2) {
/* 122 */     if (☃ < l1) {
/* 123 */       return l1;
/*     */     }
/* 125 */     if (☃ > l2) {
/* 126 */       return l2;
/*     */     }
/* 128 */     return ☃;
/*     */   }
/*     */   
/*     */   public static float a(float ☃, float f1, float f2) {
/* 132 */     if (☃ < f1) {
/* 133 */       return f1;
/*     */     }
/* 135 */     if (☃ > f2) {
/* 136 */       return f2;
/*     */     }
/* 138 */     return ☃;
/*     */   }
/*     */   
/*     */   public static double a(double ☃, double d1, double d2) {
/* 142 */     if (☃ < d1) {
/* 143 */       return d1;
/*     */     }
/* 145 */     if (☃ > d2) {
/* 146 */       return d2;
/*     */     }
/* 148 */     return ☃;
/*     */   }
/*     */   
/*     */   public static double b(double ☃, double d1, double d2) {
/* 152 */     if (d2 < 0.0D) {
/* 153 */       return ☃;
/*     */     }
/* 155 */     if (d2 > 1.0D) {
/* 156 */       return d1;
/*     */     }
/* 158 */     return d(d2, ☃, d1);
/*     */   }
/*     */   
/*     */   public static double a(double ☃, double d1) {
/* 162 */     if (☃ < 0.0D) {
/* 163 */       ☃ = -☃;
/*     */     }
/* 165 */     if (d1 < 0.0D) {
/* 166 */       d1 = -d1;
/*     */     }
/* 168 */     return (☃ > d1) ? ☃ : d1;
/*     */   }
/*     */   
/*     */   public static int a(int ☃, int i) {
/* 172 */     return Math.floorDiv(☃, i);
/*     */   }
/*     */   
/*     */   public static int a(Random ☃, int i, int j) {
/* 176 */     if (i >= j) {
/* 177 */       return i;
/*     */     }
/* 179 */     return ☃.nextInt(j - i + 1) + i;
/*     */   }
/*     */   
/*     */   public static float a(Random ☃, float f1, float f2) {
/* 183 */     if (f1 >= f2) {
/* 184 */       return f1;
/*     */     }
/* 186 */     return ☃.nextFloat() * (f2 - f1) + f1;
/*     */   }
/*     */   
/*     */   public static double a(Random ☃, double d1, double d2) {
/* 190 */     if (d1 >= d2) {
/* 191 */       return d1;
/*     */     }
/* 193 */     return ☃.nextDouble() * (d2 - d1) + d1;
/*     */   }
/*     */   
/*     */   public static double a(long[] ☃) {
/* 197 */     long l = 0L;
/*     */     
/* 199 */     for (long l1 : ☃) {
/* 200 */       l += l1;
/*     */     }
/*     */     
/* 203 */     return l / ☃.length;
/*     */   }
/*     */   
/*     */   public static boolean a(float ☃, float f1) {
/* 207 */     return (Math.abs(f1 - ☃) < 1.0E-5F);
/*     */   }
/*     */   
/*     */   public static boolean b(double ☃, double d1) {
/* 211 */     return (Math.abs(d1 - ☃) < 9.999999747378752E-6D);
/*     */   }
/*     */   
/*     */   public static int b(int ☃, int i) {
/* 215 */     return Math.floorMod(☃, i);
/*     */   }
/*     */   
/*     */   public static float b(float ☃, float f1) {
/* 219 */     return (☃ % f1 + f1) % f1;
/*     */   }
/*     */   
/*     */   public static double c(double ☃, double d1) {
/* 223 */     return (☃ % d1 + d1) % d1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int b(int ☃) {
/* 230 */     int i = ☃ % 360;
/* 231 */     if (i >= 180) {
/* 232 */       i -= 360;
/*     */     }
/* 234 */     if (i < -180) {
/* 235 */       i += 360;
/*     */     }
/* 237 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float g(float ☃) {
/* 244 */     float f = ☃ % 360.0F;
/* 245 */     if (f >= 180.0F) {
/* 246 */       f -= 360.0F;
/*     */     }
/* 248 */     if (f < -180.0F) {
/* 249 */       f += 360.0F;
/*     */     }
/* 251 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static double g(double ☃) {
/* 258 */     double d = ☃ % 360.0D;
/* 259 */     if (d >= 180.0D) {
/* 260 */       d -= 360.0D;
/*     */     }
/* 262 */     if (d < -180.0D) {
/* 263 */       d += 360.0D;
/*     */     }
/* 265 */     return d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float c(float ☃, float f1) {
/* 273 */     return g(f1 - ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float d(float ☃, float f1) {
/* 281 */     return e(c(☃, f1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float b(float ☃, float f1, float f2) {
/* 290 */     float f3 = c(☃, f1);
/* 291 */     float f4 = a(f3, -f2, f2);
/* 292 */     return f1 - f4;
/*     */   }
/*     */   
/*     */   public static float c(float ☃, float f1, float f2) {
/* 296 */     f2 = e(f2);
/*     */     
/* 298 */     if (☃ < f1) {
/* 299 */       return a(☃ + f2, ☃, f1);
/*     */     }
/* 301 */     return a(☃ - f2, f1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public static float d(float ☃, float f1, float f2) {
/* 306 */     float f = c(☃, f1);
/* 307 */     return c(☃, ☃ + f, f2);
/*     */   }
/*     */   
/*     */   public static int a(String ☃, int i) {
/* 311 */     return NumberUtils.toInt(☃, i);
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
/*     */   public static int c(int ☃) {
/* 332 */     int i = ☃ - 1;
/* 333 */     i |= i >> 1;
/* 334 */     i |= i >> 2;
/* 335 */     i |= i >> 4;
/* 336 */     i |= i >> 8;
/* 337 */     i |= i >> 16;
/* 338 */     return i + 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean d(int ☃) {
/* 343 */     return (☃ != 0 && (☃ & ☃ - 1) == 0);
/*     */   }
/*     */ 
/*     */   
/* 347 */   private static final int[] d = new int[] { 0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9 };
/*     */ 
/*     */ 
/*     */   
/*     */   public static int e(int ☃) {
/* 352 */     ☃ = d(☃) ? ☃ : c(☃);
/* 353 */     return d[(int)(☃ * 125613361L >> 27L) & 0x1F];
/*     */   }
/*     */   
/*     */   public static int f(int ☃) {
/* 357 */     return e(☃) - (d(☃) ? 0 : 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public static int c(int ☃, int i) {
/* 362 */     if (i == 0) {
/* 363 */       return 0;
/*     */     }
/* 365 */     if (☃ == 0) {
/* 366 */       return i;
/*     */     }
/*     */     
/* 369 */     if (☃ < 0) {
/* 370 */       i *= -1;
/*     */     }
/*     */     
/* 373 */     int j = ☃ % i;
/* 374 */     if (j == 0) {
/* 375 */       return ☃;
/*     */     }
/* 377 */     return ☃ + i - j;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int e(float ☃, float f1, float f2) {
/* 382 */     return b(d(☃ * 255.0F), d(f1 * 255.0F), d(f2 * 255.0F));
/*     */   }
/*     */   
/*     */   public static int b(int ☃, int i, int j) {
/* 386 */     int k = ☃;
/* 387 */     k = (k << 8) + i;
/* 388 */     k = (k << 8) + j;
/* 389 */     return k;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static float h(float ☃) {
/* 420 */     return ☃ - d(☃);
/*     */   }
/*     */   
/*     */   public static double h(double ☃) {
/* 424 */     return ☃ - d(☃);
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
/*     */   public static long a(gr ☃) {
/* 437 */     return c(☃.u(), ☃.v(), ☃.w());
/*     */   }
/*     */   
/*     */   public static long c(int ☃, int i, int j) {
/* 441 */     long l = (☃ * 3129871) ^ j * 116129781L ^ i;
/* 442 */     l = l * l * 42317861L + l * 11L;
/* 443 */     return l >> 16L;
/*     */   }
/*     */   
/*     */   public static UUID a(Random ☃) {
/* 447 */     long l1 = ☃.nextLong() & 0xFFFFFFFFFFFF0FFFL | 0x4000L;
/* 448 */     long l2 = ☃.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
/* 449 */     return new UUID(l1, l2);
/*     */   }
/*     */   
/*     */   public static UUID a() {
/* 453 */     return a(c);
/*     */   }
/*     */   
/*     */   public static double c(double ☃, double d1, double d2) {
/* 457 */     return (☃ - d1) / (d2 - d1);
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
/*     */   public static double d(double ☃, double d1) {
/* 503 */     double d2 = d1 * d1 + ☃ * ☃;
/*     */ 
/*     */     
/* 506 */     if (Double.isNaN(d2)) {
/* 507 */       return Double.NaN;
/*     */     }
/*     */ 
/*     */     
/* 511 */     boolean bool1 = (☃ < 0.0D);
/* 512 */     if (bool1) {
/* 513 */       ☃ = -☃;
/*     */     }
/* 515 */     boolean bool2 = (d1 < 0.0D);
/* 516 */     if (bool2) {
/* 517 */       d1 = -d1;
/*     */     }
/* 519 */     boolean bool3 = (☃ > d1);
/* 520 */     if (bool3) {
/* 521 */       double d = d1;
/* 522 */       d1 = ☃;
/* 523 */       ☃ = d;
/*     */     } 
/*     */ 
/*     */     
/* 527 */     double d3 = i(d2);
/* 528 */     d1 *= d3;
/* 529 */     ☃ *= d3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 538 */     double d4 = e + ☃;
/* 539 */     int i = (int)Double.doubleToRawLongBits(d4);
/*     */ 
/*     */     
/* 542 */     double d5 = f[i];
/* 543 */     double d6 = g[i];
/*     */ 
/*     */ 
/*     */     
/* 547 */     double d7 = d4 - e;
/* 548 */     double d8 = ☃ * d6 - d1 * d7;
/*     */ 
/*     */     
/* 551 */     double d9 = (6.0D + d8 * d8) * d8 * 0.16666666666666666D;
/* 552 */     double d10 = d5 + d9;
/*     */ 
/*     */     
/* 555 */     if (bool3) {
/* 556 */       d10 = 1.5707963267948966D - d10;
/*     */     }
/* 558 */     if (bool2) {
/* 559 */       d10 = Math.PI - d10;
/*     */     }
/* 561 */     if (bool1) {
/* 562 */       d10 = -d10;
/*     */     }
/*     */     
/* 565 */     return d10;
/*     */   }
/*     */   
/*     */   public static float i(float ☃) {
/* 569 */     float f = 0.5F * ☃;
/* 570 */     int i = Float.floatToIntBits(☃);
/* 571 */     i = 1597463007 - (i >> 1);
/* 572 */     ☃ = Float.intBitsToFloat(i);
/* 573 */     ☃ *= 1.5F - f * ☃ * ☃;
/* 574 */     return ☃;
/*     */   }
/*     */   
/*     */   public static double i(double ☃) {
/* 578 */     double d = 0.5D * ☃;
/* 579 */     long l = Double.doubleToRawLongBits(☃);
/* 580 */     l = 6910469410427058090L - (l >> 1L);
/* 581 */     ☃ = Double.longBitsToDouble(l);
/* 582 */     ☃ *= 1.5D - d * ☃ * ☃;
/* 583 */     return ☃;
/*     */   }
/*     */   
/*     */   public static float j(float ☃) {
/* 587 */     int i = Float.floatToIntBits(☃);
/* 588 */     i = 1419967116 - i / 3;
/* 589 */     float f = Float.intBitsToFloat(i);
/* 590 */     f = 0.6666667F * f + 1.0F / 3.0F * f * f * ☃;
/* 591 */     f = 0.6666667F * f + 1.0F / 3.0F * f * f * ☃;
/* 592 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 598 */   private static final double e = Double.longBitsToDouble(4805340802404319232L);
/* 599 */   private static final double[] f = new double[257];
/* 600 */   private static final double[] g = new double[257];
/*     */ 
/*     */   
/*     */   static {
/* 604 */     for (int ☃ = 0; ☃ < 257; ☃++) {
/* 605 */       double d1 = ☃ / 256.0D;
/* 606 */       double d2 = Math.asin(d1);
/* 607 */       g[☃] = Math.cos(d2);
/* 608 */       f[☃] = d2;
/*     */     } 
/*     */   }
/*     */   public static int f(float ☃, float f1, float f2) {
/*     */     float f7, f8, f9;
/* 613 */     int j, k, m, i = (int)(☃ * 6.0F) % 6;
/* 614 */     float f3 = ☃ * 6.0F - i;
/* 615 */     float f4 = f2 * (1.0F - f1);
/* 616 */     float f5 = f2 * (1.0F - f3 * f1);
/* 617 */     float f6 = f2 * (1.0F - (1.0F - f3) * f1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 623 */     switch (i) {
/*     */       case 0:
/* 625 */         f7 = f2;
/* 626 */         f8 = f6;
/* 627 */         f9 = f4;
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
/* 658 */         j = a((int)(f7 * 255.0F), 0, 255);
/* 659 */         k = a((int)(f8 * 255.0F), 0, 255);
/* 660 */         m = a((int)(f9 * 255.0F), 0, 255);
/*     */         
/* 662 */         return j << 16 | k << 8 | m;case 1: f7 = f5; f8 = f2; f9 = f4; j = a((int)(f7 * 255.0F), 0, 255); k = a((int)(f8 * 255.0F), 0, 255); m = a((int)(f9 * 255.0F), 0, 255); return j << 16 | k << 8 | m;case 2: f7 = f4; f8 = f2; f9 = f6; j = a((int)(f7 * 255.0F), 0, 255); k = a((int)(f8 * 255.0F), 0, 255); m = a((int)(f9 * 255.0F), 0, 255); return j << 16 | k << 8 | m;case 3: f7 = f4; f8 = f5; f9 = f2; j = a((int)(f7 * 255.0F), 0, 255); k = a((int)(f8 * 255.0F), 0, 255); m = a((int)(f9 * 255.0F), 0, 255); return j << 16 | k << 8 | m;case 4: f7 = f6; f8 = f4; f9 = f2; j = a((int)(f7 * 255.0F), 0, 255); k = a((int)(f8 * 255.0F), 0, 255); m = a((int)(f9 * 255.0F), 0, 255); return j << 16 | k << 8 | m;case 5: f7 = f2; f8 = f4; f9 = f5; j = a((int)(f7 * 255.0F), 0, 255); k = a((int)(f8 * 255.0F), 0, 255); m = a((int)(f9 * 255.0F), 0, 255); return j << 16 | k << 8 | m;
/*     */     } 
/*     */     throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + ☃ + ", " + f1 + ", " + f2);
/*     */   }
/*     */   public static int g(int ☃) {
/* 667 */     ☃ ^= ☃ >>> 16;
/* 668 */     ☃ *= -2048144789;
/* 669 */     ☃ ^= ☃ >>> 13;
/* 670 */     ☃ *= -1028477387;
/* 671 */     ☃ ^= ☃ >>> 16;
/* 672 */     return ☃;
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
/*     */   public static int a(int ☃, int i, IntPredicate intPredicate) {
/* 769 */     int j = i - ☃;
/* 770 */     while (j > 0) {
/* 771 */       int k = j / 2;
/* 772 */       int m = ☃ + k;
/* 773 */       if (intPredicate.test(m)) {
/*     */         
/* 775 */         j = k; continue;
/*     */       } 
/* 777 */       ☃ = m + 1;
/* 778 */       j -= k + 1;
/*     */     } 
/*     */     
/* 781 */     return ☃;
/*     */   }
/*     */   
/*     */   public static float g(float ☃, float f1, float f2) {
/* 785 */     return f1 + ☃ * (f2 - f1);
/*     */   }
/*     */   
/*     */   public static double d(double ☃, double d1, double d2) {
/* 789 */     return d1 + ☃ * (d2 - d1);
/*     */   }
/*     */   
/*     */   public static double a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/* 793 */     return d(d1, 
/*     */         
/* 795 */         d(☃, d2, d3), 
/* 796 */         d(☃, d4, d5));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static double a(double ☃, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
/* 805 */     return d(d2, 
/*     */         
/* 807 */         a(☃, d1, d3, d4, d5, d6), 
/* 808 */         a(☃, d1, d7, d8, d9, d10));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static double j(double ☃) {
/* 816 */     return ☃ * ☃ * ☃ * (☃ * (☃ * 6.0D - 15.0D) + 10.0D);
/*     */   }
/*     */   
/*     */   public static int k(double ☃) {
/* 820 */     if (☃ == 0.0D) {
/* 821 */       return 0;
/*     */     }
/* 823 */     return (☃ > 0.0D) ? 1 : -1;
/*     */   }
/*     */   
/*     */   public static float h(float ☃, float f1, float f2) {
/* 827 */     return f1 + ☃ * g(f2 - f1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static float j(float ☃, float f1, float f2) {
/* 837 */     float f = f1 - ☃;
/* 838 */     while (f < -180.0F) {
/* 839 */       f += 360.0F;
/*     */     }
/* 841 */     while (f >= 180.0F) {
/* 842 */       f -= 360.0F;
/*     */     }
/* 844 */     return ☃ + f2 * f;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static float l(double ☃) {
/* 849 */     while (☃ >= 180.0D) {
/* 850 */       ☃ -= 360.0D;
/*     */     }
/* 852 */     while (☃ < -180.0D) {
/* 853 */       ☃ += 360.0D;
/*     */     }
/* 855 */     return (float)☃;
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
/*     */   public static float e(float ☃, float f1) {
/* 867 */     return (Math.abs(☃ % f1 - f1 * 0.5F) - f1 * 0.25F) / f1 * 0.25F;
/*     */   }
/*     */   
/*     */   public static float k(float ☃) {
/* 871 */     return ☃ * ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
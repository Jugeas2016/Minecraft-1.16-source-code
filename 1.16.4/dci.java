/*     */ import java.util.Optional;
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
/*     */ public class dci
/*     */ {
/*     */   public final double a;
/*     */   public final double b;
/*     */   public final double c;
/*     */   public final double d;
/*     */   public final double e;
/*     */   public final double f;
/*     */   
/*     */   public dci(double ☃, double d1, double d2, double d3, double d4, double d5) {
/*  26 */     this.a = Math.min(☃, d3);
/*  27 */     this.b = Math.min(d1, d4);
/*  28 */     this.c = Math.min(d2, d5);
/*  29 */     this.d = Math.max(☃, d3);
/*  30 */     this.e = Math.max(d1, d4);
/*  31 */     this.f = Math.max(d2, d5);
/*     */   }
/*     */   
/*     */   public dci(fx ☃) {
/*  35 */     this(☃.u(), ☃.v(), ☃.w(), (☃.u() + 1), (☃.v() + 1), (☃.w() + 1));
/*     */   }
/*     */   
/*     */   public dci(fx ☃, fx fx1) {
/*  39 */     this(☃.u(), ☃.v(), ☃.w(), fx1.u(), fx1.v(), fx1.w());
/*     */   }
/*     */   
/*     */   public dci(dcn ☃, dcn dcn1) {
/*  43 */     this(☃.b, ☃.c, ☃.d, dcn1.b, dcn1.c, dcn1.d);
/*     */   }
/*     */   
/*     */   public static dci a(cra ☃) {
/*  47 */     return new dci(☃.a, ☃.b, ☃.c, (☃.d + 1), (☃.e + 1), (☃.f + 1));
/*     */   }
/*     */   
/*     */   public static dci a(dcn ☃) {
/*  51 */     return new dci(☃.b, ☃.c, ☃.d, ☃.b + 1.0D, ☃.c + 1.0D, ☃.d + 1.0D);
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
/*     */   public double a(gc.a ☃) {
/*  79 */     return ☃.a(this.a, this.b, this.c);
/*     */   }
/*     */   
/*     */   public double b(gc.a ☃) {
/*  83 */     return ☃.a(this.d, this.e, this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  88 */     if (this == ☃) {
/*  89 */       return true;
/*     */     }
/*  91 */     if (!(☃ instanceof dci)) {
/*  92 */       return false;
/*     */     }
/*     */     
/*  95 */     dci dci1 = (dci)☃;
/*     */     
/*  97 */     if (Double.compare(dci1.a, this.a) != 0) {
/*  98 */       return false;
/*     */     }
/* 100 */     if (Double.compare(dci1.b, this.b) != 0) {
/* 101 */       return false;
/*     */     }
/* 103 */     if (Double.compare(dci1.c, this.c) != 0) {
/* 104 */       return false;
/*     */     }
/* 106 */     if (Double.compare(dci1.d, this.d) != 0) {
/* 107 */       return false;
/*     */     }
/* 109 */     if (Double.compare(dci1.e, this.e) != 0) {
/* 110 */       return false;
/*     */     }
/* 112 */     return (Double.compare(dci1.f, this.f) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 117 */     long ☃ = Double.doubleToLongBits(this.a);
/* 118 */     int i = (int)(☃ ^ ☃ >>> 32L);
/* 119 */     ☃ = Double.doubleToLongBits(this.b);
/* 120 */     i = 31 * i + (int)(☃ ^ ☃ >>> 32L);
/* 121 */     ☃ = Double.doubleToLongBits(this.c);
/* 122 */     i = 31 * i + (int)(☃ ^ ☃ >>> 32L);
/* 123 */     ☃ = Double.doubleToLongBits(this.d);
/* 124 */     i = 31 * i + (int)(☃ ^ ☃ >>> 32L);
/* 125 */     ☃ = Double.doubleToLongBits(this.e);
/* 126 */     i = 31 * i + (int)(☃ ^ ☃ >>> 32L);
/* 127 */     ☃ = Double.doubleToLongBits(this.f);
/* 128 */     i = 31 * i + (int)(☃ ^ ☃ >>> 32L);
/* 129 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public dci a(double ☃, double d1, double d2) {
/* 139 */     double d3 = this.a;
/* 140 */     double d4 = this.b;
/* 141 */     double d5 = this.c;
/* 142 */     double d6 = this.d;
/* 143 */     double d7 = this.e;
/* 144 */     double d8 = this.f;
/*     */     
/* 146 */     if (☃ < 0.0D) {
/* 147 */       d3 -= ☃;
/* 148 */     } else if (☃ > 0.0D) {
/* 149 */       d6 -= ☃;
/*     */     } 
/*     */     
/* 152 */     if (d1 < 0.0D) {
/* 153 */       d4 -= d1;
/* 154 */     } else if (d1 > 0.0D) {
/* 155 */       d7 -= d1;
/*     */     } 
/*     */     
/* 158 */     if (d2 < 0.0D) {
/* 159 */       d5 -= d2;
/* 160 */     } else if (d2 > 0.0D) {
/* 161 */       d8 -= d2;
/*     */     } 
/*     */     
/* 164 */     return new dci(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */   
/*     */   public dci b(dcn ☃) {
/* 168 */     return b(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public dci b(double ☃, double d1, double d2) {
/* 178 */     double d3 = this.a;
/* 179 */     double d4 = this.b;
/* 180 */     double d5 = this.c;
/* 181 */     double d6 = this.d;
/* 182 */     double d7 = this.e;
/* 183 */     double d8 = this.f;
/*     */     
/* 185 */     if (☃ < 0.0D) {
/* 186 */       d3 += ☃;
/* 187 */     } else if (☃ > 0.0D) {
/* 188 */       d6 += ☃;
/*     */     } 
/*     */     
/* 191 */     if (d1 < 0.0D) {
/* 192 */       d4 += d1;
/* 193 */     } else if (d1 > 0.0D) {
/* 194 */       d7 += d1;
/*     */     } 
/*     */     
/* 197 */     if (d2 < 0.0D) {
/* 198 */       d5 += d2;
/* 199 */     } else if (d2 > 0.0D) {
/* 200 */       d8 += d2;
/*     */     } 
/*     */     
/* 203 */     return new dci(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public dci c(double ☃, double d1, double d2) {
/* 213 */     double d3 = this.a - ☃;
/* 214 */     double d4 = this.b - d1;
/* 215 */     double d5 = this.c - d2;
/* 216 */     double d6 = this.d + ☃;
/* 217 */     double d7 = this.e + d1;
/* 218 */     double d8 = this.f + d2;
/*     */     
/* 220 */     return new dci(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */   
/*     */   public dci g(double ☃) {
/* 224 */     return c(☃, ☃, ☃);
/*     */   }
/*     */   
/*     */   public dci a(dci ☃) {
/* 228 */     double d1 = Math.max(this.a, ☃.a);
/* 229 */     double d2 = Math.max(this.b, ☃.b);
/* 230 */     double d3 = Math.max(this.c, ☃.c);
/* 231 */     double d4 = Math.min(this.d, ☃.d);
/* 232 */     double d5 = Math.min(this.e, ☃.e);
/* 233 */     double d6 = Math.min(this.f, ☃.f);
/*     */     
/* 235 */     return new dci(d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public dci b(dci ☃) {
/* 239 */     double d1 = Math.min(this.a, ☃.a);
/* 240 */     double d2 = Math.min(this.b, ☃.b);
/* 241 */     double d3 = Math.min(this.c, ☃.c);
/* 242 */     double d4 = Math.max(this.d, ☃.d);
/* 243 */     double d5 = Math.max(this.e, ☃.e);
/* 244 */     double d6 = Math.max(this.f, ☃.f);
/*     */     
/* 246 */     return new dci(d1, d2, d3, d4, d5, d6);
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
/*     */   public dci d(double ☃, double d1, double d2) {
/* 282 */     return new dci(this.a + ☃, this.b + d1, this.c + d2, this.d + ☃, this.e + d1, this.f + d2);
/*     */   }
/*     */   
/*     */   public dci a(fx ☃) {
/* 286 */     return new dci(this.a + ☃.u(), this.b + ☃.v(), this.c + ☃.w(), this.d + ☃.u(), this.e + ☃.v(), this.f + ☃.w());
/*     */   }
/*     */   
/*     */   public dci c(dcn ☃) {
/* 290 */     return d(☃.b, ☃.c, ☃.d);
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
/*     */   public boolean c(dci ☃) {
/* 360 */     return a(☃.a, ☃.b, ☃.c, ☃.d, ☃.e, ☃.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2, double d3, double d4, double d5) {
/* 365 */     return (this.a < d3 && this.d > ☃ && this.b < d4 && this.e > d1 && this.c < d5 && this.f > d2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(dcn ☃, dcn dcn1) {
/* 374 */     return a(Math.min(☃.b, dcn1.b), Math.min(☃.c, dcn1.c), Math.min(☃.d, dcn1.d), Math.max(☃.b, dcn1.b), Math.max(☃.c, dcn1.c), Math.max(☃.d, dcn1.d));
/*     */   }
/*     */   
/*     */   public boolean d(dcn ☃) {
/* 378 */     return e(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */   
/*     */   public boolean e(double ☃, double d1, double d2) {
/* 382 */     return (☃ >= this.a && ☃ < this.d && d1 >= this.b && d1 < this.e && d2 >= this.c && d2 < this.f);
/*     */   }
/*     */   
/*     */   public double a() {
/* 386 */     double ☃ = b();
/* 387 */     double d1 = c();
/* 388 */     double d2 = d();
/* 389 */     return (☃ + d1 + d2) / 3.0D;
/*     */   }
/*     */   
/*     */   public double b() {
/* 393 */     return this.d - this.a;
/*     */   }
/*     */   
/*     */   public double c() {
/* 397 */     return this.e - this.b;
/*     */   }
/*     */   
/*     */   public double d() {
/* 401 */     return this.f - this.c;
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
/*     */   public dci h(double ☃) {
/* 417 */     return g(-☃);
/*     */   }
/*     */   
/*     */   public Optional<dcn> b(dcn ☃, dcn dcn1) {
/* 421 */     double[] arrayOfDouble = { 1.0D };
/* 422 */     double d1 = dcn1.b - ☃.b;
/* 423 */     double d2 = dcn1.c - ☃.c;
/* 424 */     double d3 = dcn1.d - ☃.d;
/*     */     
/* 426 */     gc gc = a(this, ☃, arrayOfDouble, null, d1, d2, d3);
/* 427 */     if (gc == null) {
/* 428 */       return Optional.empty();
/*     */     }
/*     */     
/* 431 */     double d4 = arrayOfDouble[0];
/* 432 */     return Optional.of(☃.b(d4 * d1, d4 * d2, d4 * d3));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dcj a(Iterable<dci> ☃, dcn dcn1, dcn dcn2, fx fx1) {
/* 437 */     double[] arrayOfDouble = { 1.0D };
/* 438 */     gc gc = null;
/*     */     
/* 440 */     double d1 = dcn2.b - dcn1.b;
/* 441 */     double d2 = dcn2.c - dcn1.c;
/* 442 */     double d3 = dcn2.d - dcn1.d;
/*     */     
/* 444 */     for (dci dci1 : ☃) {
/* 445 */       gc = a(dci1.a(fx1), dcn1, arrayOfDouble, gc, d1, d2, d3);
/*     */     }
/*     */     
/* 448 */     if (gc == null) {
/* 449 */       return null;
/*     */     }
/*     */     
/* 452 */     double d4 = arrayOfDouble[0];
/* 453 */     return new dcj(dcn1.b(d4 * d1, d4 * d2, d4 * d3), gc, fx1, false);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static gc a(dci ☃, dcn dcn1, double[] arrayOfDouble, @Nullable gc gc1, double d1, double d2, double d3) {
/* 458 */     if (d1 > 1.0E-7D) {
/* 459 */       gc1 = a(arrayOfDouble, gc1, d1, d2, d3, ☃.a, ☃.b, ☃.e, ☃.c, ☃.f, gc.e, dcn1.b, dcn1.c, dcn1.d);
/* 460 */     } else if (d1 < -1.0E-7D) {
/* 461 */       gc1 = a(arrayOfDouble, gc1, d1, d2, d3, ☃.d, ☃.b, ☃.e, ☃.c, ☃.f, gc.f, dcn1.b, dcn1.c, dcn1.d);
/*     */     } 
/*     */     
/* 464 */     if (d2 > 1.0E-7D) {
/* 465 */       gc1 = a(arrayOfDouble, gc1, d2, d3, d1, ☃.b, ☃.c, ☃.f, ☃.a, ☃.d, gc.a, dcn1.c, dcn1.d, dcn1.b);
/* 466 */     } else if (d2 < -1.0E-7D) {
/* 467 */       gc1 = a(arrayOfDouble, gc1, d2, d3, d1, ☃.e, ☃.c, ☃.f, ☃.a, ☃.d, gc.b, dcn1.c, dcn1.d, dcn1.b);
/*     */     } 
/*     */     
/* 470 */     if (d3 > 1.0E-7D) {
/* 471 */       gc1 = a(arrayOfDouble, gc1, d3, d1, d2, ☃.c, ☃.a, ☃.d, ☃.b, ☃.e, gc.c, dcn1.d, dcn1.b, dcn1.c);
/* 472 */     } else if (d3 < -1.0E-7D) {
/* 473 */       gc1 = a(arrayOfDouble, gc1, d3, d1, d2, ☃.f, ☃.a, ☃.d, ☃.b, ☃.e, gc.d, dcn1.d, dcn1.b, dcn1.c);
/*     */     } 
/* 475 */     return gc1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static gc a(double[] ☃, @Nullable gc gc1, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, gc gc2, double d9, double d10, double d11) {
/* 480 */     double d12 = (d4 - d9) / d1;
/* 481 */     double d13 = d10 + d12 * d2;
/* 482 */     double d14 = d11 + d12 * d3;
/* 483 */     if (0.0D < d12 && d12 < ☃[0] && d5 - 1.0E-7D < d13 && d13 < d6 + 1.0E-7D && d7 - 1.0E-7D < d14 && d14 < d8 + 1.0E-7D) {
/*     */ 
/*     */ 
/*     */       
/* 487 */       ☃[0] = d12;
/* 488 */       return gc2;
/*     */     } 
/* 490 */     return gc1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 495 */     return "AABB[" + this.a + ", " + this.b + ", " + this.c + "] -> [" + this.d + ", " + this.e + ", " + this.f + "]";
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 499 */     return (Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f));
/*     */   }
/*     */   
/*     */   public dcn f() {
/* 503 */     return new dcn(afm.d(0.5D, this.a, this.d), afm.d(0.5D, this.b, this.e), afm.d(0.5D, this.c, this.f));
/*     */   }
/*     */   
/*     */   public static dci g(double ☃, double d1, double d2) {
/* 507 */     return new dci(-☃ / 2.0D, -d1 / 2.0D, -d2 / 2.0D, ☃ / 2.0D, d1 / 2.0D, d2 / 2.0D);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
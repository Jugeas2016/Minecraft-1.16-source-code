/*     */ import com.google.common.collect.AbstractIterator;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import java.util.Iterator;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
/*     */ import javax.annotation.concurrent.Immutable;
/*     */ import org.apache.commons.lang3.Validate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Immutable
/*     */ public class fx
/*     */   extends gr
/*     */ {
/*     */   public static final Codec<fx> a;
/*     */   
/*     */   static {
/*  29 */     a = Codec.INT_STREAM.comapFlatMap(☃ -> x.a(☃, 3).map(()), ☃ -> IntStream.of(new int[] { ☃.u(), ☃.v(), ☃.w() })).stable();
/*     */   }
/*  31 */   private static final Logger e = LogManager.getLogger();
/*     */   
/*  33 */   public static final fx b = new fx(0, 0, 0);
/*     */   
/*  35 */   private static final int f = 1 + afm.f(afm.c(30000000));
/*  36 */   private static final int g = f;
/*  37 */   private static final int h = 64 - f - g;
/*     */   
/*  39 */   private static final long i = (1L << f) - 1L;
/*  40 */   private static final long j = (1L << h) - 1L;
/*  41 */   private static final long k = (1L << g) - 1L;
/*     */ 
/*     */   
/*  44 */   private static final int l = h;
/*  45 */   private static final int m = h + g;
/*     */   
/*     */   public fx(int ☃, int i, int j) {
/*  48 */     super(☃, i, j);
/*     */   }
/*     */   
/*     */   public fx(double ☃, double d1, double d2) {
/*  52 */     super(☃, d1, d2);
/*     */   }
/*     */   
/*     */   public fx(dcn ☃) {
/*  56 */     this(☃.b, ☃.c, ☃.d);
/*     */   }
/*     */   
/*     */   public fx(gk ☃) {
/*  60 */     this(☃.a(), ☃.b(), ☃.c());
/*     */   }
/*     */   
/*     */   public fx(gr ☃) {
/*  64 */     this(☃.u(), ☃.v(), ☃.w());
/*     */   }
/*     */   
/*     */   public static long a(long ☃, gc gc1) {
/*  68 */     return a(☃, gc1.i(), gc1.j(), gc1.k());
/*     */   }
/*     */   
/*     */   public static long a(long ☃, int i, int j, int k) {
/*  72 */     return a(b(☃) + i, c(☃) + j, d(☃) + k);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int b(long ☃) {
/*  81 */     return (int)(☃ << 64 - m - f >> 64 - f);
/*     */   }
/*     */   
/*     */   public static int c(long ☃) {
/*  85 */     return (int)(☃ << 64 - h >> 64 - h);
/*     */   }
/*     */   
/*     */   public static int d(long ☃) {
/*  89 */     return (int)(☃ << 64 - l - g >> 64 - g);
/*     */   }
/*     */   
/*     */   public static fx e(long ☃) {
/*  93 */     return new fx(b(☃), c(☃), d(☃));
/*     */   }
/*     */   
/*     */   public long a() {
/*  97 */     return a(u(), v(), w());
/*     */   }
/*     */   
/*     */   public static long a(int ☃, int i, int j) {
/* 101 */     long l = 0L;
/* 102 */     l |= (☃ & i) << m;
/* 103 */     l |= (i & j) << 0L;
/* 104 */     l |= (j & k) << l;
/* 105 */     return l;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long f(long ☃) {
/* 113 */     return ☃ & 0xFFFFFFFFFFFFFFF0L;
/*     */   }
/*     */ 
/*     */   
/*     */   public fx a(double ☃, double d1, double d2) {
/* 118 */     if (☃ == 0.0D && d1 == 0.0D && d2 == 0.0D) {
/* 119 */       return this;
/*     */     }
/* 121 */     return new fx(u() + ☃, v() + d1, w() + d2);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx b(int ☃, int i, int j) {
/* 126 */     if (☃ == 0 && i == 0 && j == 0) {
/* 127 */       return this;
/*     */     }
/* 129 */     return new fx(u() + ☃, v() + i, w() + j);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx a(gr ☃) {
/* 134 */     return b(☃.u(), ☃.v(), ☃.w());
/*     */   }
/*     */ 
/*     */   
/*     */   public fx b(gr ☃) {
/* 139 */     return b(-☃.u(), -☃.v(), -☃.w());
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
/*     */   public fx b() {
/* 154 */     return a(gc.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx b(int ☃) {
/* 159 */     return a(gc.b, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx c() {
/* 164 */     return a(gc.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx c(int ☃) {
/* 169 */     return a(gc.a, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx d() {
/* 174 */     return a(gc.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx d(int ☃) {
/* 179 */     return a(gc.c, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx e() {
/* 184 */     return a(gc.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx e(int ☃) {
/* 189 */     return a(gc.d, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx f() {
/* 194 */     return a(gc.e);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx f(int ☃) {
/* 199 */     return a(gc.e, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx g() {
/* 204 */     return a(gc.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx g(int ☃) {
/* 209 */     return a(gc.f, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx a(gc ☃) {
/* 214 */     return new fx(u() + ☃.i(), v() + ☃.j(), w() + ☃.k());
/*     */   }
/*     */ 
/*     */   
/*     */   public fx a(gc ☃, int i) {
/* 219 */     if (i == 0) {
/* 220 */       return this;
/*     */     }
/* 222 */     return new fx(u() + ☃.i() * i, v() + ☃.j() * i, w() + ☃.k() * i);
/*     */   }
/*     */ 
/*     */   
/*     */   public fx a(gc.a ☃, int i) {
/* 227 */     if (i == 0) {
/* 228 */       return this;
/*     */     }
/* 230 */     int j = (☃ == gc.a.a) ? i : 0;
/* 231 */     int k = (☃ == gc.a.b) ? i : 0;
/* 232 */     int m = (☃ == gc.a.c) ? i : 0;
/* 233 */     return new fx(u() + j, v() + k, w() + m);
/*     */   }
/*     */   
/*     */   public fx a(bzm ☃) {
/* 237 */     switch (null.a[☃.ordinal()])
/*     */     
/*     */     { default:
/* 240 */         return this;
/*     */       case 2:
/* 242 */         return new fx(-w(), v(), u());
/*     */       case 3:
/* 244 */         return new fx(-u(), v(), -w());
/*     */       case 4:
/* 246 */         break; }  return new fx(w(), v(), -u());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public fx c(gr ☃) {
/* 252 */     return new fx(v() * ☃.w() - w() * ☃.v(), w() * ☃.u() - u() * ☃.w(), u() * ☃.v() - v() * ☃.u());
/*     */   }
/*     */   
/*     */   public fx h() {
/* 256 */     return this;
/*     */   }
/*     */   
/*     */   public a i() {
/* 260 */     return new a(u(), v(), w());
/*     */   }
/*     */   
/*     */   public static class a extends fx {
/*     */     public a() {
/* 265 */       this(0, 0, 0);
/*     */     }
/*     */     
/*     */     public a(int ☃, int i, int j) {
/* 269 */       super(☃, i, j);
/*     */     }
/*     */     
/*     */     public a(double ☃, double d1, double d2) {
/* 273 */       this(afm.c(☃), afm.c(d1), afm.c(d2));
/*     */     }
/*     */ 
/*     */     
/*     */     public fx a(double ☃, double d1, double d2) {
/* 278 */       return super.a(☃, d1, d2).h();
/*     */     }
/*     */ 
/*     */     
/*     */     public fx b(int ☃, int i, int j) {
/* 283 */       return super.b(☃, i, j).h();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public fx a(gc ☃, int i) {
/* 293 */       return super.a(☃, i).h();
/*     */     }
/*     */ 
/*     */     
/*     */     public fx a(gc.a ☃, int i) {
/* 298 */       return super.a(☃, i).h();
/*     */     }
/*     */ 
/*     */     
/*     */     public fx a(bzm ☃) {
/* 303 */       return super.a(☃).h();
/*     */     }
/*     */     
/*     */     public a d(int ☃, int i, int j) {
/* 307 */       o(☃);
/* 308 */       p(i);
/* 309 */       q(j);
/* 310 */       return this;
/*     */     }
/*     */     
/*     */     public a c(double ☃, double d1, double d2) {
/* 314 */       return d(afm.c(☃), afm.c(d1), afm.c(d2));
/*     */     }
/*     */     
/*     */     public a g(gr ☃) {
/* 318 */       return d(☃.u(), ☃.v(), ☃.w());
/*     */     }
/*     */     
/*     */     public a g(long ☃) {
/* 322 */       return d(b(☃), c(☃), d(☃));
/*     */     }
/*     */     
/*     */     public a a(fv ☃, int i, int j, int k) {
/* 326 */       return d(☃
/* 327 */           .a(i, j, k, gc.a.a), ☃
/* 328 */           .a(i, j, k, gc.a.b), ☃
/* 329 */           .a(i, j, k, gc.a.c));
/*     */     }
/*     */ 
/*     */     
/*     */     public a a(gr ☃, gc gc1) {
/* 334 */       return d(☃.u() + gc1.i(), ☃.v() + gc1.j(), ☃.w() + gc1.k());
/*     */     }
/*     */     
/*     */     public a a(gr ☃, int i, int j, int k) {
/* 338 */       return d(☃.u() + i, ☃.v() + j, ☃.w() + k);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a c(gc ☃) {
/* 346 */       return c(☃, 1);
/*     */     }
/*     */     
/*     */     public a c(gc ☃, int i) {
/* 350 */       return d(u() + ☃.i() * i, v() + ☃.j() * i, w() + ☃.k() * i);
/*     */     }
/*     */     
/*     */     public a e(int ☃, int i, int j) {
/* 354 */       return d(u() + ☃, v() + i, w() + j);
/*     */     }
/*     */     
/*     */     public a h(gr ☃) {
/* 358 */       return d(u() + ☃.u(), v() + ☃.v(), w() + ☃.w());
/*     */     }
/*     */     
/*     */     public a a(gc.a ☃, int i, int j) {
/* 362 */       switch (fx.null.b[☃.ordinal()]) {
/*     */         case 1:
/* 364 */           return d(afm.a(u(), i, j), v(), w());
/*     */         case 2:
/* 366 */           return d(u(), afm.a(v(), i, j), w());
/*     */         case 3:
/* 368 */           return d(u(), v(), afm.a(w(), i, j));
/*     */       } 
/* 370 */       throw new IllegalStateException("Unable to clamp axis " + ☃);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void o(int ☃) {
/* 376 */       super.o(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void p(int ☃) {
/* 381 */       super.p(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void q(int ☃) {
/* 386 */       super.q(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public fx h() {
/* 391 */       return new fx(this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static Iterable<fx> a(Random ☃, int i, int j, int k, int m, int n, int i1, int i2) {
/* 397 */     int i3 = n - j + 1;
/* 398 */     int i4 = i1 - k + 1;
/* 399 */     int i5 = i2 - m + 1;
/*     */     
/* 401 */     return () -> new AbstractIterator<fx>(☃, i, random, j, k, m, n, i1) {
/* 402 */         final fx.a a = new fx.a();
/* 403 */         int b = this.c;
/*     */ 
/*     */         
/*     */         protected fx a() {
/* 407 */           if (this.b <= 0) {
/* 408 */             return (fx)endOfData();
/*     */           }
/*     */           
/* 411 */           fx ☃ = this.a.d(this.d + this.e
/* 412 */               .nextInt(this.f), this.g + this.e
/* 413 */               .nextInt(this.h), this.i + this.e
/* 414 */               .nextInt(this.j));
/*     */           
/* 416 */           this.b--;
/* 417 */           return ☃;
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   public static Iterable<fx> a(fx ☃, int i, int j, int k) {
/* 423 */     int m = i + j + k;
/* 424 */     int n = ☃.u();
/* 425 */     int i1 = ☃.v();
/* 426 */     int i2 = ☃.w();
/*     */     
/* 428 */     return () -> new AbstractIterator<fx>(☃, i, j, k, m, n, i1) {
/* 429 */         private final fx.a h = new fx.a();
/*     */         
/*     */         private int i;
/*     */         
/*     */         private int j;
/*     */         
/*     */         private int k;
/*     */         
/*     */         private int l;
/*     */         private int m;
/*     */         private boolean n;
/*     */         
/*     */         protected fx a() {
/* 442 */           if (this.n) {
/* 443 */             this.n = false;
/* 444 */             this.h.q(this.a - this.h.w() - this.a);
/* 445 */             return this.h;
/*     */           } 
/*     */           
/* 448 */           fx ☃ = null;
/* 449 */           while (☃ == null) {
/* 450 */             if (this.m > this.k) {
/* 451 */               this.l++;
/* 452 */               if (this.l > this.j) {
/* 453 */                 this.i++;
/* 454 */                 if (this.i > this.b) {
/* 455 */                   return (fx)endOfData();
/*     */                 }
/* 457 */                 this.j = Math.min(this.c, this.i);
/* 458 */                 this.l = -this.j;
/*     */               } 
/* 460 */               this.k = Math.min(this.d, this.i - Math.abs(this.l));
/* 461 */               this.m = -this.k;
/*     */             } 
/*     */             
/* 464 */             int i = this.l;
/* 465 */             int j = this.m;
/* 466 */             int k = this.i - Math.abs(i) - Math.abs(j);
/* 467 */             if (k <= this.e) {
/* 468 */               this.n = (k != 0);
/* 469 */               ☃ = this.h.d(this.f + i, this.g + j, this.a + k);
/*     */             } 
/* 471 */             this.m++;
/*     */           } 
/* 473 */           return ☃;
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   public static Optional<fx> a(fx ☃, int i, int j, Predicate<fx> predicate) {
/* 479 */     return b(☃, i, j, i).filter(predicate).findFirst();
/*     */   }
/*     */   
/*     */   public static Stream<fx> b(fx ☃, int i, int j, int k) {
/* 483 */     return StreamSupport.stream(a(☃, i, j, k).spliterator(), false);
/*     */   }
/*     */   
/*     */   public static Iterable<fx> a(fx ☃, fx fx1) {
/* 487 */     return b(
/* 488 */         Math.min(☃.u(), fx1.u()), 
/* 489 */         Math.min(☃.v(), fx1.v()), 
/* 490 */         Math.min(☃.w(), fx1.w()), 
/* 491 */         Math.max(☃.u(), fx1.u()), 
/* 492 */         Math.max(☃.v(), fx1.v()), 
/* 493 */         Math.max(☃.w(), fx1.w()));
/*     */   }
/*     */ 
/*     */   
/*     */   public static Stream<fx> b(fx ☃, fx fx1) {
/* 498 */     return StreamSupport.stream(a(☃, fx1).spliterator(), false);
/*     */   }
/*     */   
/*     */   public static Stream<fx> a(cra ☃) {
/* 502 */     return a(
/* 503 */         Math.min(☃.a, ☃.d), 
/* 504 */         Math.min(☃.b, ☃.e), 
/* 505 */         Math.min(☃.c, ☃.f), 
/* 506 */         Math.max(☃.a, ☃.d), 
/* 507 */         Math.max(☃.b, ☃.e), 
/* 508 */         Math.max(☃.c, ☃.f));
/*     */   }
/*     */ 
/*     */   
/*     */   public static Stream<fx> a(dci ☃) {
/* 513 */     return a(afm.c(☃.a), afm.c(☃.b), afm.c(☃.c), afm.c(☃.d), afm.c(☃.e), afm.c(☃.f));
/*     */   }
/*     */   
/*     */   public static Stream<fx> a(int ☃, int i, int j, int k, int m, int n) {
/* 517 */     return StreamSupport.stream(b(☃, i, j, k, m, n).spliterator(), false);
/*     */   }
/*     */ 
/*     */   
/*     */   public static Iterable<fx> b(int ☃, int i, int j, int k, int m, int n) {
/* 522 */     int i1 = k - ☃ + 1;
/* 523 */     int i2 = m - i + 1;
/* 524 */     int i3 = n - j + 1;
/* 525 */     int i4 = i1 * i2 * i3;
/*     */     
/* 527 */     return () -> new AbstractIterator<fx>(☃, i, j, k, m, n) {
/* 528 */         private final fx.a g = new fx.a();
/*     */         
/*     */         private int h;
/*     */         
/*     */         protected fx a() {
/* 533 */           if (this.h == this.a) {
/* 534 */             return (fx)endOfData();
/*     */           }
/*     */           
/* 537 */           int ☃ = this.h % this.b;
/* 538 */           int i = this.h / this.b;
/* 539 */           int j = i % this.c;
/* 540 */           int k = i / this.c;
/*     */           
/* 542 */           this.h++;
/* 543 */           return this.g.d(this.d + ☃, this.e + j, this.f + k);
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   public static Iterable<a> a(fx ☃, int i, gc gc1, gc gc2) {
/* 549 */     Validate.validState((gc1.n() != gc2.n()), "The two directions cannot be on the same axis", new Object[0]);
/*     */     
/* 551 */     return () -> new AbstractIterator<a>(☃, gc1, fx1, i) {
/* 552 */         private final gc[] e = new gc[] { this.a, this.b, this.a
/*     */ 
/*     */             
/* 555 */             .f(), this.b
/* 556 */             .f() };
/*     */         
/* 558 */         private final fx.a f = this.c.i().c(this.b);
/* 559 */         private final int g = 4 * this.d;
/* 560 */         private int h = -1;
/*     */         
/*     */         private int i;
/*     */         private int j;
/* 564 */         private int k = this.f.u();
/* 565 */         private int l = this.f.v();
/* 566 */         private int m = this.f.w();
/*     */ 
/*     */         
/*     */         protected fx.a a() {
/* 570 */           this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
/*     */           
/* 572 */           this.k = this.f.u();
/* 573 */           this.l = this.f.v();
/* 574 */           this.m = this.f.w();
/*     */           
/* 576 */           if (this.j >= this.i) {
/* 577 */             if (this.h >= this.g) {
/* 578 */               return (fx.a)endOfData();
/*     */             }
/* 580 */             this.h++;
/* 581 */             this.j = 0;
/* 582 */             this.i = this.h / 2 + 1;
/*     */           } 
/* 584 */           this.j++;
/*     */           
/* 586 */           return this.f;
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
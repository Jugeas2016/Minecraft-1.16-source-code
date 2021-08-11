/*     */ import java.nio.FloatBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class b
/*     */ {
/*     */   protected float a;
/*     */   protected float b;
/*     */   protected float c;
/*     */   protected float d;
/*     */   protected float e;
/*     */   protected float f;
/*     */   protected float g;
/*     */   protected float h;
/*     */   protected float i;
/*     */   protected float j;
/*     */   protected float k;
/*     */   protected float l;
/*     */   protected float m;
/*     */   protected float n;
/*     */   protected float o;
/*     */   protected float p;
/*     */   
/*     */   public b() {}
/*     */   
/*     */   public b(b ☃) {
/*  32 */     this.a = ☃.a;
/*  33 */     this.b = ☃.b;
/*  34 */     this.c = ☃.c;
/*  35 */     this.d = ☃.d;
/*     */     
/*  37 */     this.e = ☃.e;
/*  38 */     this.f = ☃.f;
/*  39 */     this.g = ☃.g;
/*  40 */     this.h = ☃.h;
/*     */     
/*  42 */     this.i = ☃.i;
/*  43 */     this.j = ☃.j;
/*  44 */     this.k = ☃.k;
/*  45 */     this.l = ☃.l;
/*     */     
/*  47 */     this.m = ☃.m;
/*  48 */     this.n = ☃.n;
/*  49 */     this.o = ☃.o;
/*  50 */     this.p = ☃.p;
/*     */   }
/*     */ 
/*     */   
/*     */   public b(d ☃) {
/*  55 */     float f1 = ☃.a();
/*  56 */     float f2 = ☃.b();
/*  57 */     float f3 = ☃.c();
/*  58 */     float f4 = ☃.d();
/*     */     
/*  60 */     float f5 = 2.0F * f1 * f1;
/*  61 */     float f6 = 2.0F * f2 * f2;
/*  62 */     float f7 = 2.0F * f3 * f3;
/*     */     
/*  64 */     this.a = 1.0F - f6 - f7;
/*  65 */     this.f = 1.0F - f7 - f5;
/*  66 */     this.k = 1.0F - f5 - f6;
/*  67 */     this.p = 1.0F;
/*     */     
/*  69 */     float f8 = f1 * f2;
/*  70 */     float f9 = f2 * f3;
/*  71 */     float f10 = f3 * f1;
/*     */     
/*  73 */     float f11 = f1 * f4;
/*  74 */     float f12 = f2 * f4;
/*  75 */     float f13 = f3 * f4;
/*     */     
/*  77 */     this.e = 2.0F * (f8 + f13);
/*  78 */     this.b = 2.0F * (f8 - f13);
/*     */     
/*  80 */     this.i = 2.0F * (f10 - f12);
/*  81 */     this.c = 2.0F * (f10 + f12);
/*     */     
/*  83 */     this.j = 2.0F * (f9 + f11);
/*  84 */     this.g = 2.0F * (f9 - f11);
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
/*     */   public boolean equals(Object ☃) {
/* 112 */     if (this == ☃) {
/* 113 */       return true;
/*     */     }
/* 115 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 116 */       return false;
/*     */     }
/*     */     
/* 119 */     b b1 = (b)☃;
/* 120 */     return (Float.compare(b1.a, this.a) == 0 && Float.compare(b1.b, this.b) == 0 && Float.compare(b1.c, this.c) == 0 && Float.compare(b1.d, this.d) == 0 && 
/* 121 */       Float.compare(b1.e, this.e) == 0 && Float.compare(b1.f, this.f) == 0 && Float.compare(b1.g, this.g) == 0 && Float.compare(b1.h, this.h) == 0 && 
/* 122 */       Float.compare(b1.i, this.i) == 0 && Float.compare(b1.j, this.j) == 0 && Float.compare(b1.k, this.k) == 0 && Float.compare(b1.l, this.l) == 0 && 
/* 123 */       Float.compare(b1.m, this.m) == 0 && Float.compare(b1.n, this.n) == 0 && Float.compare(b1.o, this.o) == 0 && Float.compare(b1.p, this.p) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 128 */     int ☃ = (this.a != 0.0F) ? Float.floatToIntBits(this.a) : 0;
/* 129 */     ☃ = 31 * ☃ + ((this.b != 0.0F) ? Float.floatToIntBits(this.b) : 0);
/* 130 */     ☃ = 31 * ☃ + ((this.c != 0.0F) ? Float.floatToIntBits(this.c) : 0);
/* 131 */     ☃ = 31 * ☃ + ((this.d != 0.0F) ? Float.floatToIntBits(this.d) : 0);
/* 132 */     ☃ = 31 * ☃ + ((this.e != 0.0F) ? Float.floatToIntBits(this.e) : 0);
/* 133 */     ☃ = 31 * ☃ + ((this.f != 0.0F) ? Float.floatToIntBits(this.f) : 0);
/* 134 */     ☃ = 31 * ☃ + ((this.g != 0.0F) ? Float.floatToIntBits(this.g) : 0);
/* 135 */     ☃ = 31 * ☃ + ((this.h != 0.0F) ? Float.floatToIntBits(this.h) : 0);
/* 136 */     ☃ = 31 * ☃ + ((this.i != 0.0F) ? Float.floatToIntBits(this.i) : 0);
/* 137 */     ☃ = 31 * ☃ + ((this.j != 0.0F) ? Float.floatToIntBits(this.j) : 0);
/* 138 */     ☃ = 31 * ☃ + ((this.k != 0.0F) ? Float.floatToIntBits(this.k) : 0);
/* 139 */     ☃ = 31 * ☃ + ((this.l != 0.0F) ? Float.floatToIntBits(this.l) : 0);
/* 140 */     ☃ = 31 * ☃ + ((this.m != 0.0F) ? Float.floatToIntBits(this.m) : 0);
/* 141 */     ☃ = 31 * ☃ + ((this.n != 0.0F) ? Float.floatToIntBits(this.n) : 0);
/* 142 */     ☃ = 31 * ☃ + ((this.o != 0.0F) ? Float.floatToIntBits(this.o) : 0);
/* 143 */     ☃ = 31 * ☃ + ((this.p != 0.0F) ? Float.floatToIntBits(this.p) : 0);
/* 144 */     return ☃;
/*     */   }
/*     */   
/*     */   private static int a(int ☃, int i) {
/* 148 */     return i * 4 + ☃;
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
/*     */   public String toString() {
/* 227 */     StringBuilder ☃ = new StringBuilder();
/* 228 */     ☃.append("Matrix4f:\n");
/* 229 */     ☃.append(this.a);
/* 230 */     ☃.append(" ");
/* 231 */     ☃.append(this.b);
/* 232 */     ☃.append(" ");
/* 233 */     ☃.append(this.c);
/* 234 */     ☃.append(" ");
/* 235 */     ☃.append(this.d);
/* 236 */     ☃.append("\n");
/*     */     
/* 238 */     ☃.append(this.e);
/* 239 */     ☃.append(" ");
/* 240 */     ☃.append(this.f);
/* 241 */     ☃.append(" ");
/* 242 */     ☃.append(this.g);
/* 243 */     ☃.append(" ");
/* 244 */     ☃.append(this.h);
/* 245 */     ☃.append("\n");
/*     */     
/* 247 */     ☃.append(this.i);
/* 248 */     ☃.append(" ");
/* 249 */     ☃.append(this.j);
/* 250 */     ☃.append(" ");
/* 251 */     ☃.append(this.k);
/* 252 */     ☃.append(" ");
/* 253 */     ☃.append(this.l);
/* 254 */     ☃.append("\n");
/*     */     
/* 256 */     ☃.append(this.m);
/* 257 */     ☃.append(" ");
/* 258 */     ☃.append(this.n);
/* 259 */     ☃.append(" ");
/* 260 */     ☃.append(this.o);
/* 261 */     ☃.append(" ");
/* 262 */     ☃.append(this.p);
/* 263 */     ☃.append("\n");
/* 264 */     return ☃.toString();
/*     */   }
/*     */   
/*     */   public void a(FloatBuffer ☃) {
/* 268 */     ☃.put(a(0, 0), this.a);
/* 269 */     ☃.put(a(0, 1), this.b);
/* 270 */     ☃.put(a(0, 2), this.c);
/* 271 */     ☃.put(a(0, 3), this.d);
/*     */     
/* 273 */     ☃.put(a(1, 0), this.e);
/* 274 */     ☃.put(a(1, 1), this.f);
/* 275 */     ☃.put(a(1, 2), this.g);
/* 276 */     ☃.put(a(1, 3), this.h);
/*     */     
/* 278 */     ☃.put(a(2, 0), this.i);
/* 279 */     ☃.put(a(2, 1), this.j);
/* 280 */     ☃.put(a(2, 2), this.k);
/* 281 */     ☃.put(a(2, 3), this.l);
/*     */     
/* 283 */     ☃.put(a(3, 0), this.m);
/* 284 */     ☃.put(a(3, 1), this.n);
/* 285 */     ☃.put(a(3, 2), this.o);
/* 286 */     ☃.put(a(3, 3), this.p);
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
/*     */   public void a() {
/* 321 */     this.a = 1.0F;
/* 322 */     this.b = 0.0F;
/* 323 */     this.c = 0.0F;
/* 324 */     this.d = 0.0F;
/*     */     
/* 326 */     this.e = 0.0F;
/* 327 */     this.f = 1.0F;
/* 328 */     this.g = 0.0F;
/* 329 */     this.h = 0.0F;
/*     */     
/* 331 */     this.i = 0.0F;
/* 332 */     this.j = 0.0F;
/* 333 */     this.k = 1.0F;
/* 334 */     this.l = 0.0F;
/*     */     
/* 336 */     this.m = 0.0F;
/* 337 */     this.n = 0.0F;
/* 338 */     this.o = 0.0F;
/* 339 */     this.p = 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float b() {
/* 347 */     float ☃ = this.a * this.f - this.b * this.e;
/* 348 */     float f1 = this.a * this.g - this.c * this.e;
/* 349 */     float f2 = this.a * this.h - this.d * this.e;
/* 350 */     float f3 = this.b * this.g - this.c * this.f;
/* 351 */     float f4 = this.b * this.h - this.d * this.f;
/* 352 */     float f5 = this.c * this.h - this.d * this.g;
/*     */     
/* 354 */     float f6 = this.i * this.n - this.j * this.m;
/* 355 */     float f7 = this.i * this.o - this.k * this.m;
/* 356 */     float f8 = this.i * this.p - this.l * this.m;
/* 357 */     float f9 = this.j * this.o - this.k * this.n;
/* 358 */     float f10 = this.j * this.p - this.l * this.n;
/* 359 */     float f11 = this.k * this.p - this.l * this.o;
/*     */ 
/*     */     
/* 362 */     float f12 = this.f * f11 - this.g * f10 + this.h * f9;
/* 363 */     float f13 = -this.e * f11 + this.g * f8 - this.h * f7;
/* 364 */     float f14 = this.e * f10 - this.f * f8 + this.h * f6;
/* 365 */     float f15 = -this.e * f9 + this.f * f7 - this.g * f6;
/*     */     
/* 367 */     float f16 = -this.b * f11 + this.c * f10 - this.d * f9;
/* 368 */     float f17 = this.a * f11 - this.c * f8 + this.d * f7;
/* 369 */     float f18 = -this.a * f10 + this.b * f8 - this.d * f6;
/* 370 */     float f19 = this.a * f9 - this.b * f7 + this.c * f6;
/*     */     
/* 372 */     float f20 = this.n * f5 - this.o * f4 + this.p * f3;
/* 373 */     float f21 = -this.m * f5 + this.o * f2 - this.p * f1;
/* 374 */     float f22 = this.m * f4 - this.n * f2 + this.p * ☃;
/* 375 */     float f23 = -this.m * f3 + this.n * f1 - this.o * ☃;
/*     */     
/* 377 */     float f24 = -this.j * f5 + this.k * f4 - this.l * f3;
/* 378 */     float f25 = this.i * f5 - this.k * f2 + this.l * f1;
/* 379 */     float f26 = -this.i * f4 + this.j * f2 - this.l * ☃;
/* 380 */     float f27 = this.i * f3 - this.j * f1 + this.k * ☃;
/*     */ 
/*     */     
/* 383 */     this.a = f12;
/* 384 */     this.e = f13;
/* 385 */     this.i = f14;
/* 386 */     this.m = f15;
/*     */     
/* 388 */     this.b = f16;
/* 389 */     this.f = f17;
/* 390 */     this.j = f18;
/* 391 */     this.n = f19;
/*     */     
/* 393 */     this.c = f20;
/* 394 */     this.g = f21;
/* 395 */     this.k = f22;
/* 396 */     this.o = f23;
/*     */     
/* 398 */     this.d = f24;
/* 399 */     this.h = f25;
/* 400 */     this.l = f26;
/* 401 */     this.p = f27;
/*     */ 
/*     */     
/* 404 */     return ☃ * f11 - f1 * f10 + f2 * f9 + f3 * f8 - f4 * f7 + f5 * f6;
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
/*     */   public void e() {
/* 426 */     float ☃ = this.e;
/* 427 */     this.e = this.b;
/* 428 */     this.b = ☃;
/*     */     
/* 430 */     ☃ = this.i;
/* 431 */     this.i = this.c;
/* 432 */     this.c = ☃;
/*     */     
/* 434 */     ☃ = this.j;
/* 435 */     this.j = this.g;
/* 436 */     this.g = ☃;
/*     */     
/* 438 */     ☃ = this.m;
/* 439 */     this.m = this.d;
/* 440 */     this.d = ☃;
/*     */     
/* 442 */     ☃ = this.n;
/* 443 */     this.n = this.h;
/* 444 */     this.h = ☃;
/*     */     
/* 446 */     ☃ = this.o;
/* 447 */     this.o = this.l;
/* 448 */     this.l = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 457 */     float ☃ = b();
/* 458 */     if (Math.abs(☃) > 1.0E-6F) {
/* 459 */       a(☃);
/* 460 */       return true;
/*     */     } 
/* 462 */     return false;
/*     */   }
/*     */   
/*     */   public void a(b ☃) {
/* 466 */     float f1 = this.a * ☃.a + this.b * ☃.e + this.c * ☃.i + this.d * ☃.m;
/* 467 */     float f2 = this.a * ☃.b + this.b * ☃.f + this.c * ☃.j + this.d * ☃.n;
/* 468 */     float f3 = this.a * ☃.c + this.b * ☃.g + this.c * ☃.k + this.d * ☃.o;
/* 469 */     float f4 = this.a * ☃.d + this.b * ☃.h + this.c * ☃.l + this.d * ☃.p;
/*     */     
/* 471 */     float f5 = this.e * ☃.a + this.f * ☃.e + this.g * ☃.i + this.h * ☃.m;
/* 472 */     float f6 = this.e * ☃.b + this.f * ☃.f + this.g * ☃.j + this.h * ☃.n;
/* 473 */     float f7 = this.e * ☃.c + this.f * ☃.g + this.g * ☃.k + this.h * ☃.o;
/* 474 */     float f8 = this.e * ☃.d + this.f * ☃.h + this.g * ☃.l + this.h * ☃.p;
/*     */     
/* 476 */     float f9 = this.i * ☃.a + this.j * ☃.e + this.k * ☃.i + this.l * ☃.m;
/* 477 */     float f10 = this.i * ☃.b + this.j * ☃.f + this.k * ☃.j + this.l * ☃.n;
/* 478 */     float f11 = this.i * ☃.c + this.j * ☃.g + this.k * ☃.k + this.l * ☃.o;
/* 479 */     float f12 = this.i * ☃.d + this.j * ☃.h + this.k * ☃.l + this.l * ☃.p;
/*     */     
/* 481 */     float f13 = this.m * ☃.a + this.n * ☃.e + this.o * ☃.i + this.p * ☃.m;
/* 482 */     float f14 = this.m * ☃.b + this.n * ☃.f + this.o * ☃.j + this.p * ☃.n;
/* 483 */     float f15 = this.m * ☃.c + this.n * ☃.g + this.o * ☃.k + this.p * ☃.o;
/* 484 */     float f16 = this.m * ☃.d + this.n * ☃.h + this.o * ☃.l + this.p * ☃.p;
/*     */     
/* 486 */     this.a = f1;
/* 487 */     this.b = f2;
/* 488 */     this.c = f3;
/* 489 */     this.d = f4;
/* 490 */     this.e = f5;
/* 491 */     this.f = f6;
/* 492 */     this.g = f7;
/* 493 */     this.h = f8;
/* 494 */     this.i = f9;
/* 495 */     this.j = f10;
/* 496 */     this.k = f11;
/* 497 */     this.l = f12;
/* 498 */     this.m = f13;
/* 499 */     this.n = f14;
/* 500 */     this.o = f15;
/* 501 */     this.p = f16;
/*     */   }
/*     */   
/*     */   public void a(d ☃) {
/* 505 */     a(new b(☃));
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 509 */     this.a *= ☃;
/* 510 */     this.b *= ☃;
/* 511 */     this.c *= ☃;
/* 512 */     this.d *= ☃;
/*     */     
/* 514 */     this.e *= ☃;
/* 515 */     this.f *= ☃;
/* 516 */     this.g *= ☃;
/* 517 */     this.h *= ☃;
/*     */     
/* 519 */     this.i *= ☃;
/* 520 */     this.j *= ☃;
/* 521 */     this.k *= ☃;
/* 522 */     this.l *= ☃;
/*     */     
/* 524 */     this.m *= ☃;
/* 525 */     this.n *= ☃;
/* 526 */     this.o *= ☃;
/* 527 */     this.p *= ☃;
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
/*     */   public static b a(double ☃, float f1, float f2, float f3) {
/* 583 */     float f = (float)(1.0D / Math.tan(☃ * 0.01745329238474369D / 2.0D));
/* 584 */     b b1 = new b();
/* 585 */     b1.a = f / f1;
/* 586 */     b1.f = f;
/* 587 */     b1.k = (f3 + f2) / (f2 - f3);
/* 588 */     b1.o = -1.0F;
/* 589 */     b1.l = 2.0F * f3 * f2 / (f2 - f3);
/* 590 */     return b1;
/*     */   }
/*     */   
/*     */   public static b a(float ☃, float f1, float f2, float f3) {
/* 594 */     b b1 = new b();
/* 595 */     b1.a = 2.0F / ☃;
/* 596 */     b1.f = 2.0F / f1;
/* 597 */     float f = f3 - f2;
/* 598 */     b1.k = -2.0F / f;
/* 599 */     b1.p = 1.0F;
/* 600 */     b1.d = -1.0F;
/* 601 */     b1.h = -1.0F;
/* 602 */     b1.l = -(f3 + f2) / f;
/* 603 */     return b1;
/*     */   }
/*     */   
/*     */   public void a(g ☃) {
/* 607 */     this.d += ☃.a();
/* 608 */     this.h += ☃.b();
/* 609 */     this.l += ☃.c();
/*     */   }
/*     */   
/*     */   public b d() {
/* 613 */     return new b(this);
/*     */   }
/*     */   
/*     */   public static b a(float ☃, float f1, float f2) {
/* 617 */     b b1 = new b();
/* 618 */     b1.a = ☃;
/* 619 */     b1.f = f1;
/* 620 */     b1.k = f2;
/* 621 */     b1.p = 1.0F;
/* 622 */     return b1;
/*     */   }
/*     */   
/*     */   public static b b(float ☃, float f1, float f2) {
/* 626 */     b b1 = new b();
/* 627 */     b1.a = 1.0F;
/* 628 */     b1.f = 1.0F;
/* 629 */     b1.k = 1.0F;
/* 630 */     b1.p = 1.0F;
/*     */     
/* 632 */     b1.d = ☃;
/* 633 */     b1.h = f1;
/* 634 */     b1.l = f2;
/* 635 */     return b1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
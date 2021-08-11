/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import org.apache.commons.lang3.tuple.Triple;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class a
/*     */ {
/*  15 */   private static final float j = 3.0F + 2.0F * (float)Math.sqrt(2.0D);
/*  16 */   private static final float k = (float)Math.cos(0.39269908169872414D);
/*  17 */   private static final float l = (float)Math.sin(0.39269908169872414D);
/*  18 */   private static final float m = 1.0F / (float)Math.sqrt(2.0D);
/*     */   
/*     */   protected float a;
/*     */   
/*     */   protected float b;
/*     */   
/*     */   protected float c;
/*     */   
/*     */   protected float d;
/*     */   
/*     */   protected float e;
/*     */   protected float f;
/*     */   protected float g;
/*     */   protected float h;
/*     */   protected float i;
/*     */   
/*     */   public a() {}
/*     */   
/*     */   public a(d ☃) {
/*  37 */     float f1 = ☃.a();
/*  38 */     float f2 = ☃.b();
/*  39 */     float f3 = ☃.c();
/*  40 */     float f4 = ☃.d();
/*     */     
/*  42 */     float f5 = 2.0F * f1 * f1;
/*  43 */     float f6 = 2.0F * f2 * f2;
/*  44 */     float f7 = 2.0F * f3 * f3;
/*     */     
/*  46 */     this.a = 1.0F - f6 - f7;
/*  47 */     this.e = 1.0F - f7 - f5;
/*  48 */     this.i = 1.0F - f5 - f6;
/*     */     
/*  50 */     float f8 = f1 * f2;
/*  51 */     float f9 = f2 * f3;
/*  52 */     float f10 = f3 * f1;
/*     */     
/*  54 */     float f11 = f1 * f4;
/*  55 */     float f12 = f2 * f4;
/*  56 */     float f13 = f3 * f4;
/*     */     
/*  58 */     this.d = 2.0F * (f8 + f13);
/*  59 */     this.b = 2.0F * (f8 - f13);
/*     */     
/*  61 */     this.g = 2.0F * (f10 - f12);
/*  62 */     this.c = 2.0F * (f10 + f12);
/*     */     
/*  64 */     this.h = 2.0F * (f9 + f11);
/*  65 */     this.f = 2.0F * (f9 - f11);
/*     */   }
/*     */   
/*     */   public static a b(float ☃, float f1, float f2) {
/*  69 */     a a1 = new a();
/*  70 */     a1.a = ☃;
/*  71 */     a1.e = f1;
/*  72 */     a1.i = f2;
/*  73 */     return a1;
/*     */   }
/*     */   
/*     */   public a(b ☃) {
/*  77 */     this.a = ☃.a;
/*  78 */     this.b = ☃.b;
/*  79 */     this.c = ☃.c;
/*     */     
/*  81 */     this.d = ☃.e;
/*  82 */     this.e = ☃.f;
/*  83 */     this.f = ☃.g;
/*     */     
/*  85 */     this.g = ☃.i;
/*  86 */     this.h = ☃.j;
/*  87 */     this.i = ☃.k;
/*     */   }
/*     */   
/*     */   public a(a ☃) {
/*  91 */     this.a = ☃.a;
/*  92 */     this.b = ☃.b;
/*  93 */     this.c = ☃.c;
/*     */     
/*  95 */     this.d = ☃.d;
/*  96 */     this.e = ☃.e;
/*  97 */     this.f = ☃.f;
/*     */     
/*  99 */     this.g = ☃.g;
/* 100 */     this.h = ☃.h;
/* 101 */     this.i = ☃.i;
/*     */   }
/*     */   
/*     */   private static Pair<Float, Float> a(float ☃, float f1, float f2) {
/* 105 */     float f3 = 2.0F * (☃ - f2);
/* 106 */     float f4 = f1;
/*     */     
/* 108 */     if (j * f4 * f4 < f3 * f3) {
/* 109 */       float f = afm.i(f4 * f4 + f3 * f3);
/* 110 */       return Pair.of(Float.valueOf(f * f4), Float.valueOf(f * f3));
/*     */     } 
/* 112 */     return Pair.of(Float.valueOf(l), Float.valueOf(k));
/*     */   }
/*     */ 
/*     */   
/*     */   private static Pair<Float, Float> a(float ☃, float f1) {
/* 117 */     float f2 = (float)Math.hypot(☃, f1);
/* 118 */     float f3 = (f2 > 1.0E-6F) ? f1 : 0.0F;
/* 119 */     float f4 = Math.abs(☃) + Math.max(f2, 1.0E-6F);
/* 120 */     if (☃ < 0.0F) {
/* 121 */       float f = f3;
/* 122 */       f3 = f4;
/* 123 */       f4 = f;
/*     */     } 
/*     */     
/* 126 */     float f5 = afm.i(f4 * f4 + f3 * f3);
/* 127 */     f4 *= f5;
/* 128 */     f3 *= f5;
/* 129 */     return Pair.of(Float.valueOf(f3), Float.valueOf(f4));
/*     */   }
/*     */   
/*     */   private static d c(a ☃) {
/* 133 */     a a1 = new a();
/* 134 */     d d = d.a.g();
/*     */ 
/*     */     
/* 137 */     if (☃.b * ☃.b + ☃.d * ☃.d > 1.0E-6F) {
/* 138 */       Pair<Float, Float> pair = a(☃.a, 0.5F * (☃.b + ☃.d), ☃.e);
/* 139 */       Float float_1 = (Float)pair.getFirst();
/* 140 */       Float float_2 = (Float)pair.getSecond();
/* 141 */       d d1 = new d(0.0F, 0.0F, float_1.floatValue(), float_2.floatValue());
/*     */       
/* 143 */       float f1 = float_2.floatValue() * float_2.floatValue() - float_1.floatValue() * float_1.floatValue();
/* 144 */       float f2 = -2.0F * float_1.floatValue() * float_2.floatValue();
/* 145 */       float f3 = float_2.floatValue() * float_2.floatValue() + float_1.floatValue() * float_1.floatValue();
/*     */       
/* 147 */       d.a(d1);
/*     */       
/* 149 */       a1.c();
/* 150 */       a1.a = f1;
/* 151 */       a1.e = f1;
/* 152 */       a1.d = -f2;
/* 153 */       a1.b = f2;
/* 154 */       a1.i = f3;
/* 155 */       ☃.b(a1);
/* 156 */       a1.a();
/* 157 */       a1.b(☃);
/* 158 */       ☃.a(a1);
/*     */     } 
/*     */     
/* 161 */     if (☃.c * ☃.c + ☃.g * ☃.g > 1.0E-6F) {
/* 162 */       Pair<Float, Float> pair = a(☃.a, 0.5F * (☃.c + ☃.g), ☃.i);
/* 163 */       float f1 = -((Float)pair.getFirst()).floatValue();
/* 164 */       Float float_ = (Float)pair.getSecond();
/* 165 */       d d1 = new d(0.0F, f1, 0.0F, float_.floatValue());
/*     */       
/* 167 */       float f2 = float_.floatValue() * float_.floatValue() - f1 * f1;
/* 168 */       float f3 = -2.0F * f1 * float_.floatValue();
/* 169 */       float f4 = float_.floatValue() * float_.floatValue() + f1 * f1;
/*     */       
/* 171 */       d.a(d1);
/*     */       
/* 173 */       a1.c();
/* 174 */       a1.a = f2;
/* 175 */       a1.i = f2;
/* 176 */       a1.g = f3;
/* 177 */       a1.c = -f3;
/* 178 */       a1.e = f4;
/* 179 */       ☃.b(a1);
/* 180 */       a1.a();
/* 181 */       a1.b(☃);
/* 182 */       ☃.a(a1);
/*     */     } 
/*     */     
/* 185 */     if (☃.f * ☃.f + ☃.h * ☃.h > 1.0E-6F) {
/* 186 */       Pair<Float, Float> pair = a(☃.e, 0.5F * (☃.f + ☃.h), ☃.i);
/* 187 */       Float float_1 = (Float)pair.getFirst();
/* 188 */       Float float_2 = (Float)pair.getSecond();
/* 189 */       d d1 = new d(float_1.floatValue(), 0.0F, 0.0F, float_2.floatValue());
/*     */       
/* 191 */       float f1 = float_2.floatValue() * float_2.floatValue() - float_1.floatValue() * float_1.floatValue();
/* 192 */       float f2 = -2.0F * float_1.floatValue() * float_2.floatValue();
/* 193 */       float f3 = float_2.floatValue() * float_2.floatValue() + float_1.floatValue() * float_1.floatValue();
/*     */       
/* 195 */       d.a(d1);
/*     */       
/* 197 */       a1.c();
/* 198 */       a1.e = f1;
/* 199 */       a1.i = f1;
/* 200 */       a1.h = -f2;
/* 201 */       a1.f = f2;
/* 202 */       a1.a = f3;
/* 203 */       ☃.b(a1);
/* 204 */       a1.a();
/* 205 */       a1.b(☃);
/* 206 */       ☃.a(a1);
/*     */     } 
/* 208 */     return d;
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
/*     */   public void a() {
/* 272 */     float ☃ = this.b;
/* 273 */     this.b = this.d;
/* 274 */     this.d = ☃;
/*     */     
/* 276 */     ☃ = this.c;
/* 277 */     this.c = this.g;
/* 278 */     this.g = ☃;
/*     */     
/* 280 */     ☃ = this.f;
/* 281 */     this.f = this.h;
/* 282 */     this.h = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Triple<d, g, d> b() {
/* 290 */     d ☃ = d.a.g();
/* 291 */     d d1 = d.a.g();
/* 292 */     a a1 = d();
/* 293 */     a1.a();
/* 294 */     a1.b(this);
/*     */     
/* 296 */     for (int i = 0; i < 5; i++) {
/* 297 */       d1.a(c(a1));
/*     */     }
/*     */     
/* 300 */     d1.f();
/*     */     
/* 302 */     a a2 = new a(this);
/* 303 */     a2.b(new a(d1));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 310 */     float f1 = 1.0F;
/*     */     
/* 312 */     Pair<Float, Float> pair = a(a2.a, a2.d);
/* 313 */     Float float_1 = (Float)pair.getFirst();
/* 314 */     Float float_2 = (Float)pair.getSecond();
/*     */     
/* 316 */     float f2 = float_2.floatValue() * float_2.floatValue() - float_1.floatValue() * float_1.floatValue();
/* 317 */     float f3 = -2.0F * float_1.floatValue() * float_2.floatValue();
/* 318 */     float f4 = float_2.floatValue() * float_2.floatValue() + float_1.floatValue() * float_1.floatValue();
/*     */     
/* 320 */     d d2 = new d(0.0F, 0.0F, float_1.floatValue(), float_2.floatValue());
/* 321 */     ☃.a(d2);
/*     */     
/* 323 */     a a3 = new a();
/* 324 */     a3.c();
/* 325 */     a3.a = f2;
/* 326 */     a3.e = f2;
/* 327 */     a3.d = f3;
/* 328 */     a3.b = -f3;
/* 329 */     a3.i = f4;
/*     */     
/* 331 */     f1 *= f4;
/* 332 */     a3.b(a2);
/*     */     
/* 334 */     pair = a(a3.a, a3.g);
/* 335 */     float f5 = -((Float)pair.getFirst()).floatValue();
/* 336 */     Float float_3 = (Float)pair.getSecond();
/*     */     
/* 338 */     float f6 = float_3.floatValue() * float_3.floatValue() - f5 * f5;
/* 339 */     float f7 = -2.0F * f5 * float_3.floatValue();
/* 340 */     float f8 = float_3.floatValue() * float_3.floatValue() + f5 * f5;
/*     */     
/* 342 */     d d3 = new d(0.0F, f5, 0.0F, float_3.floatValue());
/* 343 */     ☃.a(d3);
/*     */     
/* 345 */     a a4 = new a();
/* 346 */     a4.c();
/* 347 */     a4.a = f6;
/* 348 */     a4.i = f6;
/* 349 */     a4.g = -f7;
/* 350 */     a4.c = f7;
/* 351 */     a4.e = f8;
/*     */     
/* 353 */     f1 *= f8;
/* 354 */     a4.b(a3);
/*     */     
/* 356 */     pair = a(a4.e, a4.h);
/* 357 */     Float float_4 = (Float)pair.getFirst();
/* 358 */     Float float_5 = (Float)pair.getSecond();
/*     */     
/* 360 */     float f9 = float_5.floatValue() * float_5.floatValue() - float_4.floatValue() * float_4.floatValue();
/* 361 */     float f10 = -2.0F * float_4.floatValue() * float_5.floatValue();
/* 362 */     float f11 = float_5.floatValue() * float_5.floatValue() + float_4.floatValue() * float_4.floatValue();
/*     */     
/* 364 */     d d4 = new d(float_4.floatValue(), 0.0F, 0.0F, float_5.floatValue());
/* 365 */     ☃.a(d4);
/*     */     
/* 367 */     a a5 = new a();
/* 368 */     a5.c();
/* 369 */     a5.e = f9;
/* 370 */     a5.i = f9;
/* 371 */     a5.h = f10;
/* 372 */     a5.f = -f10;
/* 373 */     a5.a = f11;
/*     */     
/* 375 */     f1 *= f11;
/* 376 */     a5.b(a4);
/*     */     
/* 378 */     f1 = 1.0F / f1;
/* 379 */     ☃.a((float)Math.sqrt(f1));
/*     */     
/* 381 */     g g = new g(a5.a * f1, a5.e * f1, a5.i * f1);
/*     */     
/* 383 */     return Triple.of(☃, g, d1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 388 */     if (this == ☃) {
/* 389 */       return true;
/*     */     }
/* 391 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 392 */       return false;
/*     */     }
/*     */     
/* 395 */     a a1 = (a)☃;
/* 396 */     return (Float.compare(a1.a, this.a) == 0 && Float.compare(a1.b, this.b) == 0 && Float.compare(a1.c, this.c) == 0 && 
/* 397 */       Float.compare(a1.d, this.d) == 0 && Float.compare(a1.e, this.e) == 0 && Float.compare(a1.f, this.f) == 0 && 
/* 398 */       Float.compare(a1.g, this.g) == 0 && Float.compare(a1.h, this.h) == 0 && Float.compare(a1.i, this.i) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 403 */     int ☃ = (this.a != 0.0F) ? Float.floatToIntBits(this.a) : 0;
/* 404 */     ☃ = 31 * ☃ + ((this.b != 0.0F) ? Float.floatToIntBits(this.b) : 0);
/* 405 */     ☃ = 31 * ☃ + ((this.c != 0.0F) ? Float.floatToIntBits(this.c) : 0);
/* 406 */     ☃ = 31 * ☃ + ((this.d != 0.0F) ? Float.floatToIntBits(this.d) : 0);
/* 407 */     ☃ = 31 * ☃ + ((this.e != 0.0F) ? Float.floatToIntBits(this.e) : 0);
/* 408 */     ☃ = 31 * ☃ + ((this.f != 0.0F) ? Float.floatToIntBits(this.f) : 0);
/* 409 */     ☃ = 31 * ☃ + ((this.g != 0.0F) ? Float.floatToIntBits(this.g) : 0);
/* 410 */     ☃ = 31 * ☃ + ((this.h != 0.0F) ? Float.floatToIntBits(this.h) : 0);
/* 411 */     ☃ = 31 * ☃ + ((this.i != 0.0F) ? Float.floatToIntBits(this.i) : 0);
/* 412 */     return ☃;
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
/*     */   public void a(a ☃) {
/* 456 */     this.a = ☃.a;
/* 457 */     this.b = ☃.b;
/* 458 */     this.c = ☃.c;
/*     */     
/* 460 */     this.d = ☃.d;
/* 461 */     this.e = ☃.e;
/* 462 */     this.f = ☃.f;
/*     */     
/* 464 */     this.g = ☃.g;
/* 465 */     this.h = ☃.h;
/* 466 */     this.i = ☃.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 471 */     StringBuilder ☃ = new StringBuilder();
/* 472 */     ☃.append("Matrix3f:\n");
/* 473 */     ☃.append(this.a);
/* 474 */     ☃.append(" ");
/* 475 */     ☃.append(this.b);
/* 476 */     ☃.append(" ");
/* 477 */     ☃.append(this.c);
/* 478 */     ☃.append("\n");
/*     */     
/* 480 */     ☃.append(this.d);
/* 481 */     ☃.append(" ");
/* 482 */     ☃.append(this.e);
/* 483 */     ☃.append(" ");
/* 484 */     ☃.append(this.f);
/* 485 */     ☃.append("\n");
/*     */     
/* 487 */     ☃.append(this.g);
/* 488 */     ☃.append(" ");
/* 489 */     ☃.append(this.h);
/* 490 */     ☃.append(" ");
/* 491 */     ☃.append(this.i);
/* 492 */     ☃.append("\n");
/* 493 */     return ☃.toString();
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
/*     */   public void c() {
/* 533 */     this.a = 1.0F;
/* 534 */     this.b = 0.0F;
/* 535 */     this.c = 0.0F;
/*     */     
/* 537 */     this.d = 0.0F;
/* 538 */     this.e = 1.0F;
/* 539 */     this.f = 0.0F;
/*     */     
/* 541 */     this.g = 0.0F;
/* 542 */     this.h = 0.0F;
/* 543 */     this.i = 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float e() {
/* 551 */     float ☃ = this.e * this.i - this.f * this.h;
/* 552 */     float f1 = -(this.d * this.i - this.f * this.g);
/* 553 */     float f2 = this.d * this.h - this.e * this.g;
/*     */     
/* 555 */     float f3 = -(this.b * this.i - this.c * this.h);
/* 556 */     float f4 = this.a * this.i - this.c * this.g;
/* 557 */     float f5 = -(this.a * this.h - this.b * this.g);
/*     */     
/* 559 */     float f6 = this.b * this.f - this.c * this.e;
/* 560 */     float f7 = -(this.a * this.f - this.c * this.d);
/* 561 */     float f8 = this.a * this.e - this.b * this.d;
/*     */ 
/*     */     
/* 564 */     float f9 = this.a * ☃ + this.b * f1 + this.c * f2;
/*     */ 
/*     */     
/* 567 */     this.a = ☃;
/* 568 */     this.d = f1;
/* 569 */     this.g = f2;
/*     */     
/* 571 */     this.b = f3;
/* 572 */     this.e = f4;
/* 573 */     this.h = f5;
/*     */     
/* 575 */     this.c = f6;
/* 576 */     this.f = f7;
/* 577 */     this.i = f8;
/*     */     
/* 579 */     return f9;
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
/*     */   public boolean f() {
/* 591 */     float ☃ = e();
/* 592 */     if (Math.abs(☃) > 1.0E-6F) {
/* 593 */       a(☃);
/* 594 */       return true;
/*     */     } 
/* 596 */     return false;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, float f) {
/* 600 */     if (☃ == 0) {
/* 601 */       if (i == 0) {
/* 602 */         this.a = f;
/* 603 */       } else if (i == 1) {
/* 604 */         this.b = f;
/*     */       } else {
/* 606 */         this.c = f;
/*     */       } 
/* 608 */     } else if (☃ == 1) {
/* 609 */       if (i == 0) {
/* 610 */         this.d = f;
/* 611 */       } else if (i == 1) {
/* 612 */         this.e = f;
/*     */       } else {
/* 614 */         this.f = f;
/*     */       }
/*     */     
/* 617 */     } else if (i == 0) {
/* 618 */       this.g = f;
/* 619 */     } else if (i == 1) {
/* 620 */       this.h = f;
/*     */     } else {
/* 622 */       this.i = f;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(a ☃) {
/* 628 */     float f1 = this.a * ☃.a + this.b * ☃.d + this.c * ☃.g;
/* 629 */     float f2 = this.a * ☃.b + this.b * ☃.e + this.c * ☃.h;
/* 630 */     float f3 = this.a * ☃.c + this.b * ☃.f + this.c * ☃.i;
/* 631 */     float f4 = this.d * ☃.a + this.e * ☃.d + this.f * ☃.g;
/* 632 */     float f5 = this.d * ☃.b + this.e * ☃.e + this.f * ☃.h;
/* 633 */     float f6 = this.d * ☃.c + this.e * ☃.f + this.f * ☃.i;
/* 634 */     float f7 = this.g * ☃.a + this.h * ☃.d + this.i * ☃.g;
/* 635 */     float f8 = this.g * ☃.b + this.h * ☃.e + this.i * ☃.h;
/* 636 */     float f9 = this.g * ☃.c + this.h * ☃.f + this.i * ☃.i;
/*     */     
/* 638 */     this.a = f1;
/* 639 */     this.b = f2;
/* 640 */     this.c = f3;
/* 641 */     this.d = f4;
/* 642 */     this.e = f5;
/* 643 */     this.f = f6;
/* 644 */     this.g = f7;
/* 645 */     this.h = f8;
/* 646 */     this.i = f9;
/*     */   }
/*     */   
/*     */   public void a(d ☃) {
/* 650 */     b(new a(☃));
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 654 */     this.a *= ☃;
/* 655 */     this.b *= ☃;
/* 656 */     this.c *= ☃;
/*     */     
/* 658 */     this.d *= ☃;
/* 659 */     this.e *= ☃;
/* 660 */     this.f *= ☃;
/*     */     
/* 662 */     this.g *= ☃;
/* 663 */     this.h *= ☃;
/* 664 */     this.i *= ☃;
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
/*     */   public a d() {
/* 700 */     return new a(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
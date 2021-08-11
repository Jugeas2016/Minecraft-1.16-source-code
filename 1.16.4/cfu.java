/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.serialization.DynamicLike;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cfu
/*     */ {
/*     */   static interface a
/*     */   {
/*     */     double a();
/*     */     
/*     */     double b();
/*     */     
/*     */     double c();
/*     */     
/*     */     double d();
/*     */     
/*     */     double e();
/*     */     
/*     */     double f();
/*     */     
/*     */     long g();
/*     */     
/*     */     double h();
/*     */     
/*     */     cft i();
/*     */     
/*     */     void j();
/*     */     
/*     */     void k();
/*     */     
/*     */     a l();
/*     */     
/*     */     ddh m();
/*     */   }
/*     */   
/*     */   class b
/*     */     implements a
/*     */   {
/*     */     private final double b;
/*     */     private final double c;
/*     */     private final long d;
/*     */     private final long e;
/*     */     private final double f;
/*     */     
/*     */     private b(cfu this$0, double ☃, double d1, long l) {
/*  59 */       this.b = ☃;
/*  60 */       this.c = d1;
/*     */       
/*  62 */       this.f = l;
/*  63 */       this.e = x.b();
/*  64 */       this.d = this.e + l;
/*     */     }
/*     */ 
/*     */     
/*     */     public double a() {
/*  69 */       return Math.max(this.a.a() - e() / 2.0D, -cfu.a(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public double c() {
/*  74 */       return Math.max(this.a.b() - e() / 2.0D, -cfu.a(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public double b() {
/*  79 */       return Math.min(this.a.a() + e() / 2.0D, cfu.a(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public double d() {
/*  84 */       return Math.min(this.a.b() + e() / 2.0D, cfu.a(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public double e() {
/*  89 */       double ☃ = (x.b() - this.e) / this.f;
/*  90 */       return (☃ < 1.0D) ? afm.d(☃, this.b, this.c) : this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public double f() {
/*  95 */       return Math.abs(this.b - this.c) / (this.d - this.e);
/*     */     }
/*     */ 
/*     */     
/*     */     public long g() {
/* 100 */       return this.d - x.b();
/*     */     }
/*     */ 
/*     */     
/*     */     public double h() {
/* 105 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public cft i() {
/* 110 */       return (this.c < this.b) ? cft.b : cft.a;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void k() {}
/*     */ 
/*     */ 
/*     */     
/*     */     public void j() {}
/*     */ 
/*     */     
/*     */     public cfu.a l() {
/* 123 */       if (g() <= 0L) {
/* 124 */         return new cfu.d(this.a, this.c);
/*     */       }
/*     */       
/* 127 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public ddh m() {
/* 132 */       return dde.a(dde.a, dde.a(
/* 133 */             Math.floor(a()), Double.NEGATIVE_INFINITY, Math.floor(c()), 
/* 134 */             Math.ceil(b()), Double.POSITIVE_INFINITY, Math.ceil(d())), dcr.e);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   class d
/*     */     implements a
/*     */   {
/*     */     private final double b;
/*     */     private double c;
/*     */     private double d;
/*     */     private double e;
/*     */     private double f;
/*     */     private ddh g;
/*     */     
/*     */     public d(cfu this$0, double ☃) {
/* 150 */       this.b = ☃;
/* 151 */       n();
/*     */     }
/*     */ 
/*     */     
/*     */     public double a() {
/* 156 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public double b() {
/* 161 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public double c() {
/* 166 */       return this.d;
/*     */     }
/*     */ 
/*     */     
/*     */     public double d() {
/* 171 */       return this.f;
/*     */     }
/*     */ 
/*     */     
/*     */     public double e() {
/* 176 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public cft i() {
/* 181 */       return cft.c;
/*     */     }
/*     */ 
/*     */     
/*     */     public double f() {
/* 186 */       return 0.0D;
/*     */     }
/*     */ 
/*     */     
/*     */     public long g() {
/* 191 */       return 0L;
/*     */     }
/*     */ 
/*     */     
/*     */     public double h() {
/* 196 */       return this.b;
/*     */     }
/*     */     
/*     */     private void n() {
/* 200 */       this.c = Math.max(this.a.a() - this.b / 2.0D, -cfu.a(this.a));
/* 201 */       this.d = Math.max(this.a.b() - this.b / 2.0D, -cfu.a(this.a));
/* 202 */       this.e = Math.min(this.a.a() + this.b / 2.0D, cfu.a(this.a));
/* 203 */       this.f = Math.min(this.a.b() + this.b / 2.0D, cfu.a(this.a));
/*     */       
/* 205 */       this.g = dde.a(dde.a, dde.a(
/* 206 */             Math.floor(a()), Double.NEGATIVE_INFINITY, Math.floor(c()), 
/* 207 */             Math.ceil(b()), Double.POSITIVE_INFINITY, Math.ceil(d())), dcr.e);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void j() {
/* 213 */       n();
/*     */     }
/*     */ 
/*     */     
/*     */     public void k() {
/* 218 */       n();
/*     */     }
/*     */ 
/*     */     
/*     */     public cfu.a l() {
/* 223 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public ddh m() {
/* 228 */       return this.g;
/*     */     }
/*     */   }
/*     */   
/* 232 */   private final List<cfs> a = Lists.newArrayList();
/*     */   
/* 234 */   private double b = 0.2D;
/* 235 */   private double d = 5.0D;
/* 236 */   private int e = 15;
/* 237 */   private int f = 5;
/*     */   
/*     */   private double g;
/*     */   
/*     */   private double h;
/* 242 */   private int i = 29999984;
/*     */   
/* 244 */   private a j = new d(this, 6.0E7D);
/*     */   
/*     */   public boolean a(fx ☃) {
/* 247 */     return ((☃.u() + 1) > e() && ☃.u() < g() && (☃.w() + 1) > f() && ☃.w() < h());
/*     */   }
/*     */   
/*     */   public boolean a(brd ☃) {
/* 251 */     return (☃.f() > e() && ☃.d() < g() && ☃.g() > f() && ☃.e() < h());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(dci ☃) {
/* 259 */     return (☃.d > e() && ☃.a < g() && ☃.f > f() && ☃.c < h());
/*     */   }
/*     */   
/*     */   public double a(aqa ☃) {
/* 263 */     return b(☃.cD(), ☃.cH());
/*     */   }
/*     */   
/*     */   public ddh c() {
/* 267 */     return this.j.m();
/*     */   }
/*     */   
/*     */   public double b(double ☃, double d1) {
/* 271 */     double d2 = d1 - f();
/* 272 */     double d3 = h() - d1;
/* 273 */     double d4 = ☃ - e();
/* 274 */     double d5 = g() - ☃;
/* 275 */     double d6 = Math.min(d4, d5);
/* 276 */     d6 = Math.min(d6, d2);
/* 277 */     return Math.min(d6, d3);
/*     */   }
/*     */   
/*     */   public cft d() {
/* 281 */     return this.j.i();
/*     */   }
/*     */   
/*     */   public double e() {
/* 285 */     return this.j.a();
/*     */   }
/*     */   
/*     */   public double f() {
/* 289 */     return this.j.c();
/*     */   }
/*     */   
/*     */   public double g() {
/* 293 */     return this.j.b();
/*     */   }
/*     */   
/*     */   public double h() {
/* 297 */     return this.j.d();
/*     */   }
/*     */   
/*     */   public double a() {
/* 301 */     return this.g;
/*     */   }
/*     */   
/*     */   public double b() {
/* 305 */     return this.h;
/*     */   }
/*     */   
/*     */   public void c(double ☃, double d1) {
/* 309 */     this.g = ☃;
/* 310 */     this.h = d1;
/*     */     
/* 312 */     this.j.k();
/*     */     
/* 314 */     for (cfs cfs : l()) {
/* 315 */       cfs.a(this, ☃, d1);
/*     */     }
/*     */   }
/*     */   
/*     */   public double i() {
/* 320 */     return this.j.e();
/*     */   }
/*     */   
/*     */   public long j() {
/* 324 */     return this.j.g();
/*     */   }
/*     */   
/*     */   public double k() {
/* 328 */     return this.j.h();
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 332 */     this.j = new d(this, ☃);
/*     */     
/* 334 */     for (cfs cfs : l()) {
/* 335 */       cfs.a(this, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(double ☃, double d1, long l) {
/* 340 */     this.j = (☃ == d1) ? new d(this, d1) : new b(☃, d1, l);
/*     */     
/* 342 */     for (cfs cfs : l()) {
/* 343 */       cfs.a(this, ☃, d1, l);
/*     */     }
/*     */   }
/*     */   
/*     */   protected List<cfs> l() {
/* 348 */     return Lists.newArrayList(this.a);
/*     */   }
/*     */   
/*     */   public void a(cfs ☃) {
/* 352 */     this.a.add(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/* 360 */     this.i = ☃;
/* 361 */     this.j.j();
/*     */   }
/*     */   
/*     */   public int m() {
/* 365 */     return this.i;
/*     */   }
/*     */   
/*     */   public double n() {
/* 369 */     return this.d;
/*     */   }
/*     */   
/*     */   public void b(double ☃) {
/* 373 */     this.d = ☃;
/*     */     
/* 375 */     for (cfs cfs : l()) {
/* 376 */       cfs.c(this, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public double o() {
/* 381 */     return this.b;
/*     */   }
/*     */   
/*     */   public void c(double ☃) {
/* 385 */     this.b = ☃;
/*     */     
/* 387 */     for (cfs cfs : l()) {
/* 388 */       cfs.b(this, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public double p() {
/* 393 */     return this.j.f();
/*     */   }
/*     */   
/*     */   public int q() {
/* 397 */     return this.e;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 401 */     this.e = ☃;
/*     */     
/* 403 */     for (cfs cfs : l()) {
/* 404 */       cfs.a(this, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public int r() {
/* 409 */     return this.f;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 413 */     this.f = ☃;
/*     */     
/* 415 */     for (cfs cfs : l()) {
/* 416 */       cfs.b(this, ☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void s() {
/* 421 */     this.j = this.j.l();
/*     */   }
/*     */   
/*     */   public c t() {
/* 425 */     return new c(this);
/*     */   }
/*     */   
/*     */   public void a(c ☃) {
/* 429 */     c(☃.a(), ☃.b());
/* 430 */     c(☃.c());
/* 431 */     b(☃.d());
/* 432 */     c(☃.e());
/* 433 */     b(☃.f());
/*     */     
/* 435 */     if (☃.h() > 0L) {
/* 436 */       a(☃.g(), ☃.i(), ☃.h());
/*     */     } else {
/* 438 */       a(☃.g());
/*     */     } 
/*     */   }
/*     */   
/* 442 */   public static final c c = new c(0.0D, 0.0D, 0.2D, 5.0D, 5, 15, 6.0E7D, 0L, 0.0D);
/*     */   
/*     */   public static class c {
/*     */     private final double a;
/*     */     private final double b;
/*     */     private final double c;
/*     */     private final double d;
/*     */     private final int e;
/*     */     private final int f;
/*     */     private final double g;
/*     */     private final long h;
/*     */     private final double i;
/*     */     
/*     */     private c(double ☃, double d1, double d2, double d3, int i, int j, double d4, long l, double d5) {
/* 456 */       this.a = ☃;
/* 457 */       this.b = d1;
/* 458 */       this.c = d2;
/* 459 */       this.d = d3;
/* 460 */       this.e = i;
/* 461 */       this.f = j;
/* 462 */       this.g = d4;
/* 463 */       this.h = l;
/* 464 */       this.i = d5;
/*     */     }
/*     */     
/*     */     private c(cfu ☃) {
/* 468 */       this.a = ☃.a();
/* 469 */       this.b = ☃.b();
/* 470 */       this.c = ☃.o();
/* 471 */       this.d = ☃.n();
/* 472 */       this.e = ☃.r();
/* 473 */       this.f = ☃.q();
/* 474 */       this.g = ☃.i();
/* 475 */       this.h = ☃.j();
/* 476 */       this.i = ☃.k();
/*     */     }
/*     */     
/*     */     public double a() {
/* 480 */       return this.a;
/*     */     }
/*     */     
/*     */     public double b() {
/* 484 */       return this.b;
/*     */     }
/*     */     
/*     */     public double c() {
/* 488 */       return this.c;
/*     */     }
/*     */     
/*     */     public double d() {
/* 492 */       return this.d;
/*     */     }
/*     */     
/*     */     public int e() {
/* 496 */       return this.e;
/*     */     }
/*     */     
/*     */     public int f() {
/* 500 */       return this.f;
/*     */     }
/*     */     
/*     */     public double g() {
/* 504 */       return this.g;
/*     */     }
/*     */     
/*     */     public long h() {
/* 508 */       return this.h;
/*     */     }
/*     */     
/*     */     public double i() {
/* 512 */       return this.i;
/*     */     }
/*     */     
/*     */     public static c a(DynamicLike<?> ☃, c c1) {
/* 516 */       double d1 = ☃.get("BorderCenterX").asDouble(c1.a);
/* 517 */       double d2 = ☃.get("BorderCenterZ").asDouble(c1.b);
/* 518 */       double d3 = ☃.get("BorderSize").asDouble(c1.g);
/* 519 */       long l = ☃.get("BorderSizeLerpTime").asLong(c1.h);
/* 520 */       double d4 = ☃.get("BorderSizeLerpTarget").asDouble(c1.i);
/* 521 */       double d5 = ☃.get("BorderSafeZone").asDouble(c1.d);
/* 522 */       double d6 = ☃.get("BorderDamagePerBlock").asDouble(c1.c);
/* 523 */       int i = ☃.get("BorderWarningBlocks").asInt(c1.e);
/* 524 */       int j = ☃.get("BorderWarningTime").asInt(c1.f);
/*     */       
/* 526 */       return new c(d1, d2, d6, d5, i, j, d3, l, d4);
/*     */     }
/*     */     
/*     */     public void a(md ☃) {
/* 530 */       ☃.a("BorderCenterX", this.a);
/* 531 */       ☃.a("BorderCenterZ", this.b);
/* 532 */       ☃.a("BorderSize", this.g);
/* 533 */       ☃.a("BorderSizeLerpTime", this.h);
/* 534 */       ☃.a("BorderSafeZone", this.d);
/* 535 */       ☃.a("BorderDamagePerBlock", this.c);
/* 536 */       ☃.a("BorderSizeLerpTarget", this.i);
/* 537 */       ☃.a("BorderWarningBlocks", this.e);
/* 538 */       ☃.a("BorderWarningTime", this.f);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
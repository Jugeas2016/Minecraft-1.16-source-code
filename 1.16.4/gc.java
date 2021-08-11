/*     */ import com.google.common.collect.Iterators;
/*     */ import com.mojang.serialization.Codec;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum gc
/*     */   implements afs
/*     */ {
/*     */   private final int g;
/*     */   private final int h;
/*     */   private final int i;
/*     */   private final String j;
/*     */   private final a k;
/*     */   private final b l;
/*  28 */   a(0, 1, -1, "down", b.b, a.b, new gr(0, -1, 0)),
/*  29 */   b(1, 0, -1, "up", b.a, a.b, new gr(0, 1, 0)),
/*  30 */   c(2, 3, 2, "north", b.b, a.c, new gr(0, 0, -1)),
/*  31 */   d(3, 2, 0, "south", b.a, a.c, new gr(0, 0, 1)),
/*  32 */   e(4, 5, 1, "west", b.b, a.a, new gr(-1, 0, 0)),
/*  33 */   f(5, 4, 3, "east", b.a, a.a, new gr(1, 0, 0));
/*     */   
/*     */   private final gr m;
/*     */   
/*     */   private static final gc[] n;
/*     */   private static final Map<String, gc> o;
/*     */   private static final gc[] p;
/*     */   private static final gc[] q;
/*     */   private static final Long2ObjectMap<gc> r;
/*     */   
/*     */   static {
/*  44 */     n = values();
/*     */     
/*  46 */     o = (Map<String, gc>)Arrays.<gc>stream(n).collect(Collectors.toMap(gc::m, ☃ -> ☃));
/*  47 */     p = (gc[])Arrays.<gc>stream(n).sorted(Comparator.comparingInt(☃ -> ☃.g)).toArray(☃ -> new gc[☃]);
/*  48 */     q = (gc[])Arrays.<gc>stream(n).filter(☃ -> ☃.n().d()).sorted(Comparator.comparingInt(☃ -> ☃.i)).toArray(☃ -> new gc[☃]);
/*  49 */     r = (Long2ObjectMap<gc>)Arrays.<gc>stream(n).collect(Collectors.toMap(☃ -> Long.valueOf((new fx(☃.p())).a()), ☃ -> ☃, (☃, gc1) -> { throw new IllegalArgumentException("Duplicate keys"); }it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap::new));
/*     */   }
/*     */   gc(int ☃, int i, int j, String str1, b b1, a a1, gr gr1) {
/*  52 */     this.g = ☃;
/*  53 */     this.i = j;
/*  54 */     this.h = i;
/*  55 */     this.j = str1;
/*  56 */     this.k = a1;
/*  57 */     this.l = b1;
/*  58 */     this.m = gr1;
/*     */   }
/*     */   
/*     */   public static gc[] a(aqa ☃) {
/*  62 */     float f1 = ☃.g(1.0F) * 0.017453292F;
/*  63 */     float f2 = -☃.h(1.0F) * 0.017453292F;
/*     */     
/*  65 */     float f3 = afm.a(f1);
/*  66 */     float f4 = afm.b(f1);
/*  67 */     float f5 = afm.a(f2);
/*  68 */     float f6 = afm.b(f2);
/*     */     
/*  70 */     boolean bool1 = (f5 > 0.0F);
/*  71 */     boolean bool2 = (f3 < 0.0F);
/*  72 */     boolean bool3 = (f6 > 0.0F);
/*     */     
/*  74 */     float f7 = bool1 ? f5 : -f5;
/*  75 */     float f8 = bool2 ? -f3 : f3;
/*  76 */     float f9 = bool3 ? f6 : -f6;
/*     */     
/*  78 */     float f10 = f7 * f4;
/*  79 */     float f11 = f9 * f4;
/*     */     
/*  81 */     gc gc1 = bool1 ? f : e;
/*  82 */     gc gc2 = bool2 ? b : a;
/*  83 */     gc gc3 = bool3 ? d : c;
/*     */     
/*  85 */     if (f7 > f9) {
/*  86 */       if (f8 > f10)
/*  87 */         return a(gc2, gc1, gc3); 
/*  88 */       if (f11 > f8) {
/*  89 */         return a(gc1, gc3, gc2);
/*     */       }
/*  91 */       return a(gc1, gc2, gc3);
/*     */     } 
/*     */     
/*  94 */     if (f8 > f11)
/*  95 */       return a(gc2, gc3, gc1); 
/*  96 */     if (f10 > f8) {
/*  97 */       return a(gc3, gc1, gc2);
/*     */     }
/*  99 */     return a(gc3, gc2, gc1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static gc[] a(gc ☃, gc gc1, gc gc2) {
/* 105 */     return new gc[] { ☃, gc1, gc2, gc2.f(), gc1.f(), ☃.f() };
/*     */   }
/*     */   
/*     */   public static gc a(b ☃, gc gc1) {
/* 109 */     gr gr1 = gc1.p();
/* 110 */     h h = new h(gr1.u(), gr1.v(), gr1.w(), 0.0F);
/* 111 */     h.a(☃);
/* 112 */     return a(h.a(), h.b(), h.c());
/*     */   }
/*     */   
/*     */   public d b() {
/* 116 */     d ☃ = g.b.a(90.0F);
/*     */     
/* 118 */     switch (null.a[ordinal()]) {
/*     */       case 1:
/* 120 */         return g.b.a(180.0F);
/*     */       case 2:
/* 122 */         return d.a.g();
/*     */       case 3:
/* 124 */         ☃.a(g.f.a(180.0F));
/* 125 */         return ☃;
/*     */       case 4:
/* 127 */         return ☃;
/*     */       case 5:
/* 129 */         ☃.a(g.f.a(90.0F));
/* 130 */         return ☃;
/*     */     } 
/*     */     
/* 133 */     ☃.a(g.f.a(-90.0F));
/* 134 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 139 */     return this.g;
/*     */   }
/*     */   
/*     */   public int d() {
/* 143 */     return this.i;
/*     */   }
/*     */   
/*     */   public b e() {
/* 147 */     return this.l;
/*     */   }
/*     */   
/*     */   public gc f() {
/* 151 */     return a(this.h);
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
/*     */   public gc g() {
/* 205 */     switch (null.a[ordinal()]) {
/*     */       case 3:
/* 207 */         return f;
/*     */       case 6:
/* 209 */         return d;
/*     */       case 4:
/* 211 */         return e;
/*     */       case 5:
/* 213 */         return c;
/*     */     } 
/* 215 */     throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
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
/*     */   public gc h() {
/* 280 */     switch (null.a[ordinal()]) {
/*     */       case 3:
/* 282 */         return e;
/*     */       case 6:
/* 284 */         return c;
/*     */       case 4:
/* 286 */         return f;
/*     */       case 5:
/* 288 */         return d;
/*     */     } 
/* 290 */     throw new IllegalStateException("Unable to get CCW facing of " + this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int i() {
/* 295 */     return this.m.u();
/*     */   }
/*     */   
/*     */   public int j() {
/* 299 */     return this.m.v();
/*     */   }
/*     */   
/*     */   public int k() {
/* 303 */     return this.m.w();
/*     */   }
/*     */   
/*     */   public g l() {
/* 307 */     return new g(i(), j(), k());
/*     */   }
/*     */   
/*     */   public String m() {
/* 311 */     return this.j;
/*     */   }
/*     */   
/*     */   public a n() {
/* 315 */     return this.k;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static gc a(@Nullable String ☃) {
/* 320 */     if (☃ == null) {
/* 321 */       return null;
/*     */     }
/* 323 */     return o.get(☃.toLowerCase(Locale.ROOT));
/*     */   }
/*     */   
/*     */   public static gc a(int ☃) {
/* 327 */     return p[afm.a(☃ % p.length)];
/*     */   }
/*     */   
/*     */   public static gc b(int ☃) {
/* 331 */     return q[afm.a(☃ % q.length)];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static gc a(int ☃, int i, int j) {
/* 341 */     return (gc)r.get(fx.a(☃, i, j));
/*     */   }
/*     */   
/*     */   public static gc a(double ☃) {
/* 345 */     return b(afm.c(☃ / 90.0D + 0.5D) & 0x3);
/*     */   }
/*     */   
/*     */   public static gc a(a ☃, b b1) {
/* 349 */     switch (null.b[☃.ordinal()]) {
/*     */       case 1:
/* 351 */         return (b1 == b.a) ? f : e;
/*     */       case 2:
/* 353 */         return (b1 == b.a) ? b : a;
/*     */     } 
/*     */     
/* 356 */     return (b1 == b.a) ? d : c;
/*     */   }
/*     */ 
/*     */   
/*     */   public float o() {
/* 361 */     return ((this.i & 0x3) * 90);
/*     */   }
/*     */   
/*     */   public static gc a(Random ☃) {
/* 365 */     return x.<gc>a(n, ☃);
/*     */   }
/*     */   
/*     */   public static gc a(double ☃, double d1, double d2) {
/* 369 */     return a((float)☃, (float)d1, (float)d2);
/*     */   }
/*     */   
/*     */   public static gc a(float ☃, float f1, float f2) {
/* 373 */     gc gc1 = c;
/* 374 */     float f = Float.MIN_VALUE;
/* 375 */     for (gc gc2 : n) {
/* 376 */       float f3 = ☃ * gc2.m.u() + f1 * gc2.m.v() + f2 * gc2.m.w();
/*     */       
/* 378 */       if (f3 > f) {
/* 379 */         f = f3;
/* 380 */         gc1 = gc2;
/*     */       } 
/*     */     } 
/* 383 */     return gc1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 388 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 393 */     return this.j;
/*     */   }
/*     */   
/*     */   public static gc a(b ☃, a a1) {
/* 397 */     for (gc gc1 : n) {
/* 398 */       if (gc1.e() == ☃ && gc1.n() == a1) {
/* 399 */         return gc1;
/*     */       }
/*     */     } 
/* 402 */     throw new IllegalArgumentException("No such direction: " + ☃ + " " + a1);
/*     */   }
/*     */   
/*     */   public enum a implements afs, Predicate<gc> {
/* 406 */     a("x")
/*     */     {
/*     */       public int a(int ☃, int i, int j) {
/* 409 */         return ☃;
/*     */       }
/*     */ 
/*     */       
/*     */       public double a(double ☃, double d1, double d2) {
/* 414 */         return ☃;
/*     */       }
/*     */     },
/* 417 */     b("y")
/*     */     {
/*     */       public int a(int ☃, int i, int j) {
/* 420 */         return i;
/*     */       }
/*     */ 
/*     */       
/*     */       public double a(double ☃, double d1, double d2) {
/* 425 */         return d1;
/*     */       }
/*     */     },
/* 428 */     c("z")
/*     */     {
/*     */       public int a(int ☃, int i, int j) {
/* 431 */         return j;
/*     */       }
/*     */ 
/*     */       
/*     */       public double a(double ☃, double d1, double d2) {
/* 436 */         return d2;
/*     */       }
/*     */     };
/*     */ 
/*     */     
/* 441 */     private static final a[] e = values();
/*     */     
/* 443 */     public static final Codec<a> d = afs.a(a::values, a::a); private static final Map<String, a> f;
/*     */     static {
/* 445 */       f = (Map<String, a>)Arrays.<a>stream(e).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*     */     }
/*     */     private final String g;
/*     */     
/*     */     a(String ☃) {
/* 450 */       this.g = ☃;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public static a a(String ☃) {
/* 455 */       return f.get(☃.toLowerCase(Locale.ROOT));
/*     */     }
/*     */     
/*     */     public String b() {
/* 459 */       return this.g;
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 463 */       return (this == b);
/*     */     }
/*     */     
/*     */     public boolean d() {
/* 467 */       return (this == a || this == c);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 472 */       return this.g;
/*     */     }
/*     */     
/*     */     public static a a(Random ☃) {
/* 476 */       return x.<a>a(e, ☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(@Nullable gc ☃) {
/* 481 */       return (☃ != null && ☃.n() == this);
/*     */     }
/*     */     
/*     */     public gc.c e() {
/* 485 */       switch (gc.null.b[ordinal()]) {
/*     */         case 1:
/*     */         case 3:
/* 488 */           return gc.c.a;
/*     */         case 2:
/* 490 */           return gc.c.b;
/*     */       } 
/* 492 */       throw new Error("Someone's been tampering with the universe!");
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/* 497 */       return this.g;
/*     */     }
/*     */     
/*     */     public abstract int a(int param1Int1, int param1Int2, int param1Int3);
/*     */     
/*     */     public abstract double a(double param1Double1, double param1Double2, double param1Double3);
/*     */   }
/*     */   
/*     */   public enum b {
/* 506 */     a(1, "Towards positive"),
/* 507 */     b(-1, "Towards negative");
/*     */     
/*     */     private final int c;
/*     */     
/*     */     private final String d;
/*     */     
/*     */     b(int ☃, String str1) {
/* 514 */       this.c = ☃;
/* 515 */       this.d = str1;
/*     */     }
/*     */     
/*     */     public int a() {
/* 519 */       return this.c;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 528 */       return this.d;
/*     */     }
/*     */     
/*     */     public b c() {
/* 532 */       return (this == a) ? b : a;
/*     */     }
/*     */   }
/*     */   
/*     */   public gr p() {
/* 537 */     return this.m;
/*     */   }
/*     */   
/*     */   public boolean a(float ☃) {
/* 541 */     float f1 = ☃ * 0.017453292F;
/* 542 */     float f2 = -afm.a(f1);
/* 543 */     float f3 = afm.b(f1);
/* 544 */     return (this.m.u() * f2 + this.m.w() * f3 > 0.0F);
/*     */   }
/*     */   
/*     */   public enum c implements Iterable<gc>, Predicate<gc> {
/* 548 */     a((String)new gc[] { gc.c, gc.f, gc.d, gc.e }, new gc.a[] { gc.a.a, gc.a.c }),
/* 549 */     b((String)new gc[] { gc.b, gc.a }, new gc.a[] { gc.a.b });
/*     */     
/*     */     private final gc[] c;
/*     */     
/*     */     private final gc.a[] d;
/*     */     
/*     */     c(gc[] ☃, gc.a[] arrayOfA) {
/* 556 */       this.c = ☃;
/* 557 */       this.d = arrayOfA;
/*     */     }
/*     */     
/*     */     public gc a(Random ☃) {
/* 561 */       return x.<gc>a(this.c, ☃);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(@Nullable gc ☃) {
/* 570 */       return (☃ != null && ☃.n().e() == this);
/*     */     }
/*     */ 
/*     */     
/*     */     public Iterator<gc> iterator() {
/* 575 */       return (Iterator<gc>)Iterators.forArray((Object[])this.c);
/*     */     }
/*     */     
/*     */     public Stream<gc> a() {
/* 579 */       return Arrays.stream(this.c);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
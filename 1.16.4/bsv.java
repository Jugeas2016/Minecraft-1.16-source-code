/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function4;
/*     */ import com.mojang.datafixers.util.Function5;
/*     */ import com.mojang.datafixers.util.Function7;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.MapCodec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class bsv
/*     */ {
/*  59 */   public static final Logger a = LogManager.getLogger(); public static final Codec<bsv> b; public static final Codec<bsv> c;
/*     */   static {
/*  61 */     b = RecordCodecBuilder.create(☃ -> ☃.group((App)d.a.forGetter(()), (App)b.r.fieldOf("category").forGetter(()), (App)Codec.FLOAT.fieldOf("depth").forGetter(()), (App)Codec.FLOAT.fieldOf("scale").forGetter(()), (App)bsz.a.fieldOf("effects").forGetter(()), (App)bsw.c.forGetter(()), (App)btg.c.forGetter(())).apply((Applicative)☃, bsv::new));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     c = RecordCodecBuilder.create(☃ -> ☃.group((App)d.a.forGetter(()), (App)b.r.fieldOf("category").forGetter(()), (App)Codec.FLOAT.fieldOf("depth").forGetter(()), (App)Codec.FLOAT.fieldOf("scale").forGetter(()), (App)bsz.a.fieldOf("effects").forGetter(())).apply((Applicative)☃, ()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   public static final Codec<Supplier<bsv>> d = vf.a(gm.ay, b);
/*  80 */   public static final Codec<List<Supplier<bsv>>> e = vf.b(gm.ay, b);
/*     */ 
/*     */ 
/*     */   
/*     */   private final Map<Integer, List<cla<?>>> g;
/*     */ 
/*     */ 
/*     */   
/*  88 */   private static final cuc h = new cuc(new chx(1234L), (List<Integer>)ImmutableList.of(Integer.valueOf(0)));
/*  89 */   private static final cuc i = new cuc(new chx(3456L), (List<Integer>)ImmutableList.of(Integer.valueOf(-2), Integer.valueOf(-1), Integer.valueOf(0))); private final d j; private final bsw k; private final btg l; private final float m;
/*  90 */   public static final cuc f = new cuc(new chx(2345L), (List<Integer>)ImmutableList.of(Integer.valueOf(0)));
/*     */   private final float n;
/*     */   private final b o;
/*     */   private final bsz p;
/*     */   private final ThreadLocal<Long2FloatLinkedOpenHashMap> q;
/*     */   
/*     */   public enum b implements afs {
/*  97 */     a("none"),
/*  98 */     b("taiga"),
/*  99 */     c("extreme_hills"),
/* 100 */     d("jungle"),
/* 101 */     e("mesa"),
/* 102 */     f("plains"),
/* 103 */     g("savanna"),
/* 104 */     h("icy"),
/* 105 */     i("the_end"),
/* 106 */     j("beach"),
/* 107 */     k("forest"),
/* 108 */     l("ocean"),
/* 109 */     m("desert"),
/* 110 */     n("river"),
/* 111 */     o("swamp"),
/* 112 */     p("mushroom"),
/* 113 */     q("nether");
/*     */ 
/*     */     
/* 116 */     public static final Codec<b> r = afs.a(b::values, b::a); private static final Map<String, b> s; private final String t;
/*     */     static {
/* 118 */       s = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(b::b, ☃ -> ☃));
/*     */     }
/*     */     
/*     */     b(String ☃) {
/* 122 */       this.t = ☃;
/*     */     }
/*     */     
/*     */     public String b() {
/* 126 */       return this.t;
/*     */     }
/*     */     
/*     */     public static b a(String ☃) {
/* 130 */       return s.get(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/* 135 */       return this.t;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum e implements afs {
/* 140 */     a("none"),
/* 141 */     b("rain"),
/* 142 */     c("snow");
/*     */ 
/*     */     
/* 145 */     public static final Codec<e> d = afs.a(e::values, e::a); private static final Map<String, e> e; private final String f;
/*     */     static {
/* 147 */       e = (Map<String, e>)Arrays.<e>stream(values()).collect(Collectors.toMap(e::b, ☃ -> ☃));
/*     */     }
/*     */     
/*     */     e(String ☃) {
/* 151 */       this.f = ☃;
/*     */     }
/*     */     
/*     */     public String b() {
/* 155 */       return this.f;
/*     */     }
/*     */     
/*     */     public static e a(String ☃) {
/* 159 */       return e.get(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/* 164 */       return this.f;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum f implements afs {
/* 169 */     a("none")
/*     */     {
/*     */       public float a(fx ☃, float f1) {
/* 172 */         return f1;
/*     */       }
/*     */     },
/* 175 */     b("frozen")
/*     */     {
/*     */       public float a(fx ☃, float f1) {
/* 178 */         double d1 = bsv.u().a(☃.u() * 0.05D, ☃.w() * 0.05D, false) * 7.0D;
/* 179 */         double d2 = bsv.f.a(☃.u() * 0.2D, ☃.w() * 0.2D, false);
/* 180 */         double d3 = d1 + d2;
/* 181 */         if (d3 < 0.3D) {
/* 182 */           double d = bsv.f.a(☃.u() * 0.09D, ☃.w() * 0.09D, false);
/* 183 */           if (d < 0.8D) {
/* 184 */             return 0.2F;
/*     */           }
/*     */         } 
/*     */         
/* 188 */         return f1;
/*     */       }
/*     */     };
/*     */ 
/*     */     
/*     */     private final String d;
/*     */     private static final Map<String, f> e;
/*     */     
/*     */     f(String ☃) {
/*     */       this.d = ☃;
/*     */     }
/*     */     
/* 200 */     public static final Codec<f> c = afs.a(f::values, f::a);
/*     */     static {
/* 202 */       e = (Map<String, f>)Arrays.<f>stream(values()).collect(Collectors.toMap(f::b, ☃ -> ☃));
/*     */     }
/*     */     public String b() {
/* 205 */       return this.d;
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/* 210 */       return this.d;
/*     */     }
/*     */     
/*     */     public static f a(String ☃) {
/* 214 */       return e.get(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public abstract float a(fx param1fx, float param1Float);
/*     */   }
/*     */   
/*     */   private bsv(d ☃, b b1, float f1, float f2, bsz bsz1, bsw bsw1, btg btg1) {
/*     */     this.g = (Map<Integer, List<cla<?>>>)gm.aG.g().collect(Collectors.groupingBy(☃ -> Integer.valueOf(☃.f().ordinal())));
/* 223 */     this.q = ThreadLocal.withInitial(() -> (Long2FloatLinkedOpenHashMap)x.<Long2FloatLinkedOpenHashMap>a(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 242 */     this.j = ☃;
/* 243 */     this.k = bsw1;
/* 244 */     this.l = btg1;
/*     */     
/* 246 */     this.o = b1;
/* 247 */     this.m = f1;
/* 248 */     this.n = f2;
/* 249 */     this.p = bsz1;
/*     */   }
/*     */   
/*     */   public int a() {
/* 253 */     return this.p.d();
/*     */   }
/*     */   
/*     */   public btg b() {
/* 257 */     return this.l;
/*     */   }
/*     */   
/*     */   public e c() {
/* 261 */     return d.a(this.j);
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 265 */     return (i() > 0.85F);
/*     */   }
/*     */   
/*     */   private float b(fx ☃) {
/* 269 */     float f = d.b(this.j).a(☃, k());
/*     */     
/* 271 */     if (☃.v() > 64) {
/* 272 */       float f1 = (float)(h.a((☃.u() / 8.0F), (☃.w() / 8.0F), false) * 4.0D);
/* 273 */       return f - (f1 + ☃.v() - 64.0F) * 0.05F / 30.0F;
/*     */     } 
/* 275 */     return f;
/*     */   }
/*     */   
/*     */   public final float a(fx ☃) {
/* 279 */     long l = ☃.a();
/* 280 */     Long2FloatLinkedOpenHashMap long2FloatLinkedOpenHashMap = this.q.get();
/* 281 */     float f1 = long2FloatLinkedOpenHashMap.get(l);
/* 282 */     if (!Float.isNaN(f1)) {
/* 283 */       return f1;
/*     */     }
/* 285 */     float f2 = b(☃);
/* 286 */     if (long2FloatLinkedOpenHashMap.size() == 1024) {
/* 287 */       long2FloatLinkedOpenHashMap.removeFirstFloat();
/*     */     }
/* 289 */     long2FloatLinkedOpenHashMap.put(l, f2);
/* 290 */     return f2;
/*     */   }
/*     */   
/*     */   public boolean a(brz ☃, fx fx1) {
/* 294 */     return a(☃, fx1, true);
/*     */   }
/*     */   
/*     */   public boolean a(brz ☃, fx fx1, boolean bool) {
/* 298 */     if (a(fx1) >= 0.15F) {
/* 299 */       return false;
/*     */     }
/*     */     
/* 302 */     if (fx1.v() >= 0 && fx1.v() < 256 && ☃.a(bsf.b, fx1) < 10) {
/* 303 */       ceh ceh = ☃.d_(fx1);
/* 304 */       cux cux = ☃.b(fx1);
/* 305 */       if (cux.a() == cuy.c && ceh.b() instanceof byb) {
/* 306 */         if (!bool) {
/* 307 */           return true;
/*     */         }
/*     */         
/* 310 */         boolean bool1 = (☃.A(fx1.f()) && ☃.A(fx1.g()) && ☃.A(fx1.d()) && ☃.A(fx1.e()));
/* 311 */         if (!bool1) {
/* 312 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 316 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(brz ☃, fx fx1) {
/* 320 */     if (a(fx1) >= 0.15F) {
/* 321 */       return false;
/*     */     }
/*     */     
/* 324 */     if (fx1.v() >= 0 && fx1.v() < 256 && ☃.a(bsf.b, fx1) < 10) {
/* 325 */       ceh ceh = ☃.d_(fx1);
/*     */ 
/*     */       
/* 328 */       if (ceh.g() && bup.cC.n().a(☃, fx1)) {
/* 329 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 333 */     return false;
/*     */   }
/*     */   
/*     */   public bsw e() {
/* 337 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(bsn ☃, cfy cfy1, aam aam1, long l, chx chx1, fx fx1) {
/* 341 */     List<List<Supplier<civ<?, ?>>>> list = this.k.c();
/* 342 */     int i = (chm.b.values()).length;
/* 343 */     for (int j = 0; j < i; j++) {
/*     */       
/* 345 */       int k = 0;
/* 346 */       if (☃.a()) {
/* 347 */         List<cla<?>> list1 = this.g.getOrDefault(Integer.valueOf(j), Collections.emptyList());
/* 348 */         for (cla<?> cla : list1) {
/* 349 */           chx1.b(l, k, j);
/* 350 */           int m = fx1.u() >> 4;
/* 351 */           int n = fx1.w() >> 4;
/* 352 */           int i1 = m << 4;
/* 353 */           int i2 = n << 4;
/*     */           try {
/* 355 */             ☃.a(gp.a(fx1), cla).forEach(crv1 -> crv1.a(☃, bsn1, cfy1, chx1, new cra(i, j, i + 15, j + 15), new brd(k, m)));
/*     */           
/*     */           }
/* 358 */           catch (Exception exception) {
/* 359 */             l l1 = l.a(exception, "Feature placement");
/* 360 */             l1.a("Feature")
/* 361 */               .a("Id", gm.aG.b(cla))
/* 362 */               .a("Description", () -> ☃.toString());
/* 363 */             throw new u(l1);
/*     */           } 
/* 365 */           k++;
/*     */         } 
/*     */       } 
/* 368 */       if (list.size() > j) {
/* 369 */         for (Supplier<civ<?, ?>> supplier : list.get(j)) {
/* 370 */           civ<?, ?> civ = supplier.get();
/* 371 */           chx1.b(l, k, j);
/*     */           try {
/* 373 */             civ.a(aam1, cfy1, chx1, fx1);
/* 374 */           } catch (Exception exception) {
/* 375 */             l l1 = l.a(exception, "Feature placement");
/* 376 */             l1.a("Feature")
/* 377 */               .a("Id", gm.aE.b((cjl<?>)civ.e))
/* 378 */               .a("Config", civ.f)
/* 379 */               .a("Description", () -> ☃.e.toString());
/* 380 */             throw new u(l1);
/*     */           } 
/* 382 */           k++;
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public int f() {
/* 389 */     return this.p.a();
/*     */   }
/*     */   
/*     */   public int a(double ☃, double d1) {
/* 393 */     int i = ((Integer)this.p.f().orElseGet(this::v)).intValue();
/* 394 */     return this.p.g().a(☃, d1, i);
/*     */   }
/*     */   
/*     */   private int v() {
/* 398 */     double ☃ = afm.a(d.c(this.j), 0.0F, 1.0F);
/* 399 */     double d1 = afm.a(d.d(this.j), 0.0F, 1.0F);
/*     */     
/* 401 */     return brv.a(☃, d1);
/*     */   }
/*     */   
/*     */   public int g() {
/* 405 */     return ((Integer)this.p.e().orElseGet(this::w)).intValue();
/*     */   }
/*     */   
/*     */   private int w() {
/* 409 */     double ☃ = afm.a(d.c(this.j), 0.0F, 1.0F);
/* 410 */     double d1 = afm.a(d.d(this.j), 0.0F, 1.0F);
/* 411 */     return brr.a(☃, d1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Random ☃, cfw cfw1, int i, int j, int k, double d1, ceh ceh1, ceh ceh2, int m, long l) {
/* 416 */     ctg<?> ctg = this.k.d().get();
/* 417 */     ctg.a(l);
/* 418 */     ctg.a(☃, cfw1, this, i, j, k, d1, ceh1, ceh2, m, l);
/*     */   }
/*     */   
/*     */   public final float h() {
/* 422 */     return this.m;
/*     */   }
/*     */   
/*     */   public final float i() {
/* 426 */     return d.d(this.j);
/*     */   }
/*     */   
/*     */   public final float j() {
/* 430 */     return this.n;
/*     */   }
/*     */   
/*     */   public final float k() {
/* 434 */     return d.c(this.j);
/*     */   }
/*     */   
/*     */   public bsz l() {
/* 438 */     return this.p;
/*     */   }
/*     */   
/*     */   public final int m() {
/* 442 */     return this.p.b();
/*     */   }
/*     */   
/*     */   public final int n() {
/* 446 */     return this.p.c();
/*     */   }
/*     */   
/*     */   public Optional<bsu> o() {
/* 450 */     return this.p.h();
/*     */   }
/*     */   
/*     */   public Optional<adp> p() {
/* 454 */     return this.p.i();
/*     */   }
/*     */   
/*     */   public Optional<bst> q() {
/* 458 */     return this.p.j();
/*     */   }
/*     */   
/*     */   public Optional<bss> r() {
/* 462 */     return this.p.k();
/*     */   }
/*     */   
/*     */   public Optional<adn> s() {
/* 466 */     return this.p.l();
/*     */   }
/*     */   
/*     */   public final b t() {
/* 470 */     return this.o;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     @Nullable
/*     */     private bsv.e a;
/*     */     @Nullable
/*     */     private bsv.b b;
/*     */     @Nullable
/*     */     private Float c;
/*     */     @Nullable
/*     */     private Float d;
/*     */     @Nullable
/*     */     private Float e;
/* 484 */     private bsv.f f = bsv.f.a;
/*     */     @Nullable
/*     */     private Float g;
/*     */     @Nullable
/*     */     private bsz h;
/*     */     @Nullable
/*     */     private btg i;
/*     */     @Nullable
/*     */     private bsw j;
/*     */     
/*     */     public a a(bsv.e ☃) {
/* 495 */       this.a = ☃;
/* 496 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bsv.b ☃) {
/* 500 */       this.b = ☃;
/* 501 */       return this;
/*     */     }
/*     */     
/*     */     public a a(float ☃) {
/* 505 */       this.c = Float.valueOf(☃);
/* 506 */       return this;
/*     */     }
/*     */     
/*     */     public a b(float ☃) {
/* 510 */       this.d = Float.valueOf(☃);
/* 511 */       return this;
/*     */     }
/*     */     
/*     */     public a c(float ☃) {
/* 515 */       this.e = Float.valueOf(☃);
/* 516 */       return this;
/*     */     }
/*     */     
/*     */     public a d(float ☃) {
/* 520 */       this.g = Float.valueOf(☃);
/* 521 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bsz ☃) {
/* 525 */       this.h = ☃;
/* 526 */       return this;
/*     */     }
/*     */     
/*     */     public a a(btg ☃) {
/* 530 */       this.i = ☃;
/* 531 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bsw ☃) {
/* 535 */       this.j = ☃;
/* 536 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bsv.f ☃) {
/* 540 */       this.f = ☃;
/* 541 */       return this;
/*     */     }
/*     */     
/*     */     public bsv a() {
/* 545 */       if (this.a == null || this.b == null || this.c == null || this.d == null || this.e == null || this.g == null || this.h == null || this.i == null || this.j == null)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 555 */         throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
/*     */       }
/*     */       
/* 558 */       return new bsv(new bsv.d(this.a, this.e
/* 559 */             .floatValue(), this.f, this.g.floatValue()), this.b, this.c
/*     */           
/* 561 */           .floatValue(), this.d
/* 562 */           .floatValue(), this.h, this.j, this.i);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/* 571 */       return "BiomeBuilder{\nprecipitation=" + this.a + ",\nbiomeCategory=" + this.b + ",\ndepth=" + this.c + ",\nscale=" + this.d + ",\ntemperature=" + this.e + ",\ntemperatureModifier=" + this.f + ",\ndownfall=" + this.g + ",\nspecialEffects=" + this.h + ",\nmobSpawnSettings=" + this.i + ",\ngenerationSettings=" + this.j + ",\n" + '}';
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class c
/*     */   {
/*     */     public static final Codec<c> a;
/*     */     
/*     */     private final float b;
/*     */     private final float c;
/*     */     private final float d;
/*     */     private final float e;
/*     */     private final float f;
/*     */     
/*     */     static {
/* 587 */       a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.floatRange(-2.0F, 2.0F).fieldOf("temperature").forGetter(()), (App)Codec.floatRange(-2.0F, 2.0F).fieldOf("humidity").forGetter(()), (App)Codec.floatRange(-2.0F, 2.0F).fieldOf("altitude").forGetter(()), (App)Codec.floatRange(-2.0F, 2.0F).fieldOf("weirdness").forGetter(()), (App)Codec.floatRange(0.0F, 1.0F).fieldOf("offset").forGetter(())).apply((Applicative)☃, c::new));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public c(float ☃, float f1, float f2, float f3, float f4) {
/* 602 */       this.b = ☃;
/* 603 */       this.c = f1;
/* 604 */       this.d = f2;
/* 605 */       this.e = f3;
/* 606 */       this.f = f4;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 611 */       if (this == ☃) {
/* 612 */         return true;
/*     */       }
/* 614 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 615 */         return false;
/*     */       }
/*     */       
/* 618 */       c c1 = (c)☃;
/*     */       
/* 620 */       if (Float.compare(c1.b, this.b) != 0) {
/* 621 */         return false;
/*     */       }
/* 623 */       if (Float.compare(c1.c, this.c) != 0) {
/* 624 */         return false;
/*     */       }
/* 626 */       if (Float.compare(c1.d, this.d) != 0) {
/* 627 */         return false;
/*     */       }
/* 629 */       return (Float.compare(c1.e, this.e) == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 634 */       int ☃ = (this.b != 0.0F) ? Float.floatToIntBits(this.b) : 0;
/* 635 */       ☃ = 31 * ☃ + ((this.c != 0.0F) ? Float.floatToIntBits(this.c) : 0);
/* 636 */       ☃ = 31 * ☃ + ((this.d != 0.0F) ? Float.floatToIntBits(this.d) : 0);
/* 637 */       ☃ = 31 * ☃ + ((this.e != 0.0F) ? Float.floatToIntBits(this.e) : 0);
/* 638 */       return ☃;
/*     */     }
/*     */     
/*     */     public float a(c ☃) {
/* 642 */       return (this.b - ☃.b) * (this.b - ☃.b) + (this.c - ☃.c) * (this.c - ☃.c) + (this.d - ☃.d) * (this.d - ☃.d) + (this.e - ☃.e) * (this.e - ☃.e) + (this.f - ☃.f) * (this.f - ☃.f);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 652 */     vk ☃ = hk.i.b(this);
/* 653 */     return (☃ == null) ? super.toString() : ☃.toString();
/*     */   }
/*     */   static class d { public static final MapCodec<d> a; private final bsv.e b;
/*     */     static {
/* 657 */       a = RecordCodecBuilder.mapCodec(☃ -> ☃.group((App)bsv.e.d.fieldOf("precipitation").forGetter(()), (App)Codec.FLOAT.fieldOf("temperature").forGetter(()), (App)bsv.f.c.optionalFieldOf("temperature_modifier", bsv.f.a).forGetter(()), (App)Codec.FLOAT.fieldOf("downfall").forGetter(())).apply((Applicative)☃, d::new));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private final float c;
/*     */     
/*     */     private final bsv.f d;
/*     */     
/*     */     private final float e;
/*     */ 
/*     */     
/*     */     private d(bsv.e ☃, float f1, bsv.f f2, float f3) {
/* 670 */       this.b = ☃;
/* 671 */       this.c = f1;
/* 672 */       this.d = f2;
/* 673 */       this.e = f3;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
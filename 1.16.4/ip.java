/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ip
/*     */ {
/*  17 */   private final Map<iq, List<ir>> a = Maps.newHashMap();
/*     */   
/*     */   protected void a(iq ☃, List<ir> list) {
/*  20 */     List<ir> list1 = this.a.put(☃, list);
/*  21 */     if (list1 != null) {
/*  22 */       throw new IllegalStateException("Value " + ☃ + " is already defined");
/*     */     }
/*     */   }
/*     */   
/*     */   Map<iq, List<ir>> a() {
/*  27 */     c();
/*  28 */     return (Map<iq, List<ir>>)ImmutableMap.copyOf(this.a);
/*     */   }
/*     */   
/*     */   private void c() {
/*  32 */     List<cfj<?>> ☃ = b();
/*  33 */     Stream<iq> stream = Stream.of(iq.a());
/*  34 */     for (cfj<?> cfj : ☃) {
/*  35 */       stream = stream.flatMap(iq1 -> ☃.c().map(iq1::a));
/*     */     }
/*  37 */     List<iq> list = (List<iq>)stream.filter(☃ -> !this.a.containsKey(☃)).collect(Collectors.toList());
/*  38 */     if (!list.isEmpty()) {
/*  39 */       throw new IllegalStateException("Missing definition for properties: " + list);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T1 extends Comparable<T1>> a<T1> a(cfj<T1> ☃) {
/*  46 */     return new a<>(☃);
/*     */   }
/*     */   
/*     */   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> b<T1, T2> a(cfj<T1> ☃, cfj<T2> cfj1) {
/*  50 */     return new b<>(☃, cfj1);
/*     */   }
/*     */   
/*     */   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> c<T1, T2, T3> a(cfj<T1> ☃, cfj<T2> cfj1, cfj<T3> cfj2) {
/*  54 */     return new c<>(☃, cfj1, cfj2);
/*     */   }
/*     */   
/*     */   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> d<T1, T2, T3, T4> a(cfj<T1> ☃, cfj<T2> cfj1, cfj<T3> cfj2, cfj<T4> cfj3) {
/*  58 */     return new d<>(☃, cfj1, cfj2, cfj3);
/*     */   }
/*     */   
/*     */   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> e<T1, T2, T3, T4, T5> a(cfj<T1> ☃, cfj<T2> cfj1, cfj<T3> cfj2, cfj<T4> cfj3, cfj<T5> cfj4) {
/*  62 */     return new e<>(☃, cfj1, cfj2, cfj3, cfj4);
/*     */   }
/*     */   
/*     */   abstract List<cfj<?>> b();
/*     */   
/*     */   public static class a<T1 extends Comparable<T1>> extends ip {
/*     */     private a(cfj<T1> ☃) {
/*  69 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<cfj<?>> b() {
/*  74 */       return (List<cfj<?>>)ImmutableList.of(this.a);
/*     */     }
/*     */     private final cfj<T1> a;
/*     */     public a<T1> a(T1 ☃, List<ir> list) {
/*  78 */       iq iq = iq.a((cfj.a<?>[])new cfj.a[] { this.a
/*  79 */             .b(☃) });
/*     */       
/*  81 */       a(iq, list);
/*  82 */       return this;
/*     */     }
/*     */     
/*     */     public a<T1> a(T1 ☃, ir ir1) {
/*  86 */       return a(☃, Collections.singletonList(ir1));
/*     */     }
/*     */     
/*     */     public ip a(Function<T1, ir> ☃) {
/*  90 */       this.a.a().forEach(comparable -> a((T1)comparable, ☃.apply(comparable)));
/*     */ 
/*     */       
/*  93 */       return this;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>>
/*     */     extends ip
/*     */   {
/*     */     private final cfj<T1> a;
/*     */ 
/*     */     
/*     */     private final cfj<T2> b;
/*     */ 
/*     */     
/*     */     private b(cfj<T1> ☃, cfj<T2> cfj1) {
/* 109 */       this.a = ☃;
/* 110 */       this.b = cfj1;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<cfj<?>> b() {
/* 115 */       return (List<cfj<?>>)ImmutableList.of(this.a, this.b);
/*     */     }
/*     */     
/*     */     public b<T1, T2> a(T1 ☃, T2 t2, List<ir> list) {
/* 119 */       iq iq = iq.a((cfj.a<?>[])new cfj.a[] { this.a
/* 120 */             .b(☃), this.b
/* 121 */             .b(t2) });
/*     */       
/* 123 */       a(iq, list);
/* 124 */       return this;
/*     */     }
/*     */     
/*     */     public b<T1, T2> a(T1 ☃, T2 t2, ir ir1) {
/* 128 */       return a(☃, t2, Collections.singletonList(ir1));
/*     */     }
/*     */     
/*     */     public ip a(BiFunction<T1, T2, ir> ☃) {
/* 132 */       this.a.a().forEach(comparable -> this.b.a().forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 137 */       return this;
/*     */     }
/*     */     
/*     */     public ip b(BiFunction<T1, T2, List<ir>> ☃) {
/* 141 */       this.a.a().forEach(comparable -> this.b.a().forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 146 */       return this;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends ip {
/*     */     private final cfj<T1> a;
/*     */     private final cfj<T2> b;
/*     */     private final cfj<T3> c;
/*     */     
/*     */     private c(cfj<T1> ☃, cfj<T2> cfj1, cfj<T3> cfj2) {
/* 156 */       this.a = ☃;
/* 157 */       this.b = cfj1;
/* 158 */       this.c = cfj2;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<cfj<?>> b() {
/* 163 */       return (List<cfj<?>>)ImmutableList.of(this.a, this.b, this.c);
/*     */     }
/*     */     
/*     */     public c<T1, T2, T3> a(T1 ☃, T2 t2, T3 t3, List<ir> list) {
/* 167 */       iq iq = iq.a((cfj.a<?>[])new cfj.a[] { this.a
/* 168 */             .b(☃), this.b
/* 169 */             .b(t2), this.c
/* 170 */             .b(t3) });
/*     */       
/* 172 */       a(iq, list);
/* 173 */       return this;
/*     */     }
/*     */     
/*     */     public c<T1, T2, T3> a(T1 ☃, T2 t2, T3 t3, ir ir1) {
/* 177 */       return a(☃, t2, t3, Collections.singletonList(ir1));
/*     */     }
/*     */     
/*     */     public ip a(ip.h<T1, T2, T3, ir> ☃) {
/* 181 */       this.a.a().forEach(comparable -> this.b.a().forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 188 */       return this;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>>
/*     */     extends ip
/*     */   {
/*     */     private final cfj<T1> a;
/*     */ 
/*     */     
/*     */     private final cfj<T2> b;
/*     */ 
/*     */     
/*     */     private final cfj<T3> c;
/*     */ 
/*     */     
/*     */     private final cfj<T4> d;
/*     */ 
/*     */     
/*     */     private d(cfj<T1> ☃, cfj<T2> cfj1, cfj<T3> cfj2, cfj<T4> cfj3) {
/* 210 */       this.a = ☃;
/* 211 */       this.b = cfj1;
/* 212 */       this.c = cfj2;
/* 213 */       this.d = cfj3;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<cfj<?>> b() {
/* 218 */       return (List<cfj<?>>)ImmutableList.of(this.a, this.b, this.c, this.d);
/*     */     }
/*     */     
/*     */     public d<T1, T2, T3, T4> a(T1 ☃, T2 t2, T3 t3, T4 t4, List<ir> list) {
/* 222 */       iq iq = iq.a((cfj.a<?>[])new cfj.a[] { this.a
/* 223 */             .b(☃), this.b
/* 224 */             .b(t2), this.c
/* 225 */             .b(t3), this.d
/* 226 */             .b(t4) });
/*     */       
/* 228 */       a(iq, list);
/* 229 */       return this;
/*     */     }
/*     */     
/*     */     public d<T1, T2, T3, T4> a(T1 ☃, T2 t2, T3 t3, T4 t4, ir ir1) {
/* 233 */       return a(☃, t2, t3, t4, Collections.singletonList(ir1));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class e<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
/*     */     extends ip
/*     */   {
/*     */     private final cfj<T1> a;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final cfj<T2> b;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final cfj<T3> c;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final cfj<T4> d;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final cfj<T5> e;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private e(cfj<T1> ☃, cfj<T2> cfj1, cfj<T3> cfj2, cfj<T4> cfj3, cfj<T5> cfj4) {
/* 271 */       this.a = ☃;
/* 272 */       this.b = cfj1;
/* 273 */       this.c = cfj2;
/* 274 */       this.d = cfj3;
/* 275 */       this.e = cfj4;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<cfj<?>> b() {
/* 280 */       return (List<cfj<?>>)ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
/*     */     }
/*     */     
/*     */     public e<T1, T2, T3, T4, T5> a(T1 ☃, T2 t2, T3 t3, T4 t4, T5 t5, List<ir> list) {
/* 284 */       iq iq = iq.a((cfj.a<?>[])new cfj.a[] { this.a
/* 285 */             .b(☃), this.b
/* 286 */             .b(t2), this.c
/* 287 */             .b(t3), this.d
/* 288 */             .b(t4), this.e
/* 289 */             .b(t5) });
/*     */       
/* 291 */       a(iq, list);
/* 292 */       return this;
/*     */     }
/*     */     
/*     */     public e<T1, T2, T3, T4, T5> a(T1 ☃, T2 t2, T3 t3, T4 t4, T5 t5, ir ir1) {
/* 296 */       return a(☃, t2, t3, t4, t5, Collections.singletonList(ir1));
/*     */     }
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface h<P1, P2, P3, R> {
/*     */     R apply(P1 param1P1, P2 param1P2, P3 param1P3);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
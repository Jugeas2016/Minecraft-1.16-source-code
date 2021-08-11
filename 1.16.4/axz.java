/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function3;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Decoder;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class axz
/*     */ {
/*     */   static class b
/*     */   {
/*     */     public final UUID a;
/*     */     public final aya b;
/*     */     public final int c;
/*     */     
/*     */     public b(UUID ☃, aya aya1, int i) {
/*  43 */       this.a = ☃;
/*  44 */       this.b = aya1;
/*  45 */       this.c = i;
/*     */     }
/*     */     
/*     */     public int a() {
/*  49 */       return this.c * this.b.g;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  54 */       return "GossipEntry{target=" + this.a + ", type=" + this.b + ", value=" + this.c + '}';
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public <T> Dynamic<T> a(DynamicOps<T> ☃) {
/*  62 */       return new Dynamic(☃, ☃.createMap((Map)ImmutableMap.of(☃
/*  63 */               .createString("Target"), gq.a.encodeStart(☃, this.a).result().orElseThrow(RuntimeException::new), ☃
/*  64 */               .createString("Type"), ☃.createString(this.b.f), ☃
/*  65 */               .createString("Value"), ☃.createInt(this.c))));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public static DataResult<b> a(Dynamic<?> ☃) {
/*  71 */       return DataResult.unbox(DataResult.instance().group((App)☃
/*  72 */             .get("Target").read((Decoder)gq.a), (App)☃
/*  73 */             .get("Type").asString().map(aya::a), (App)☃
/*  74 */             .get("Value").asNumber().map(Number::intValue))
/*  75 */           .apply((Applicative)DataResult.instance(), b::new));
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*  80 */     private final Object2IntMap<aya> a = (Object2IntMap<aya>)new Object2IntOpenHashMap();
/*     */     
/*     */     public int a(Predicate<aya> ☃) {
/*  83 */       return this.a.object2IntEntrySet()
/*  84 */         .stream()
/*  85 */         .filter(entry -> ☃.test(entry.getKey()))
/*  86 */         .mapToInt(☃ -> ☃.getIntValue() * ((aya)☃.getKey()).g)
/*  87 */         .sum();
/*     */     }
/*     */     
/*     */     public Stream<axz.b> a(UUID ☃) {
/*  91 */       return this.a.object2IntEntrySet().stream().map(entry -> new axz.b(☃, (aya)entry.getKey(), entry.getIntValue()));
/*     */     }
/*     */     
/*     */     public void a() {
/*  95 */       ObjectIterator<Object2IntMap.Entry<aya>> ☃ = this.a.object2IntEntrySet().iterator();
/*  96 */       while (☃.hasNext()) {
/*  97 */         Object2IntMap.Entry<aya> entry = (Object2IntMap.Entry<aya>)☃.next();
/*  98 */         int i = entry.getIntValue() - ((aya)entry.getKey()).i;
/*  99 */         if (i < 2) {
/* 100 */           ☃.remove(); continue;
/*     */         } 
/* 102 */         entry.setValue(i);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 108 */       return this.a.isEmpty();
/*     */     }
/*     */     
/*     */     public void a(aya ☃) {
/* 112 */       int i = this.a.getInt(☃);
/* 113 */       if (i > ☃.h) {
/* 114 */         this.a.put(☃, ☃.h);
/*     */       }
/* 116 */       if (i < 2) {
/* 117 */         b(☃);
/*     */       }
/*     */     }
/*     */     
/*     */     public void b(aya ☃) {
/* 122 */       this.a.removeInt(☃);
/*     */     }
/*     */     
/*     */     private a() {} }
/* 126 */   private final Map<UUID, a> a = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b() {
/* 139 */     Iterator<a> ☃ = this.a.values().iterator();
/* 140 */     while (☃.hasNext()) {
/* 141 */       a a = ☃.next();
/* 142 */       a.a();
/* 143 */       if (a.b())
/*     */       {
/* 145 */         ☃.remove();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private Stream<b> c() {
/* 151 */     return this.a.entrySet().stream().flatMap(☃ -> ((a)☃.getValue()).a((UUID)☃.getKey()));
/*     */   }
/*     */   
/*     */   private Collection<b> a(Random ☃, int i) {
/* 155 */     List<b> list = c().collect((Collector)Collectors.toList());
/* 156 */     if (list.isEmpty()) {
/* 157 */       return Collections.emptyList();
/*     */     }
/*     */     
/* 160 */     int[] arrayOfInt = new int[list.size()];
/* 161 */     int j = 0;
/* 162 */     for (int k = 0; k < list.size(); k++) {
/* 163 */       b b = list.get(k);
/* 164 */       j += Math.abs(b.a());
/* 165 */       arrayOfInt[k] = j - 1;
/*     */     } 
/*     */     
/* 168 */     Set<b> set = Sets.newIdentityHashSet();
/* 169 */     for (int m = 0; m < i; m++) {
/* 170 */       int n = ☃.nextInt(j);
/* 171 */       int i1 = Arrays.binarySearch(arrayOfInt, n);
/* 172 */       set.add(list.get((i1 < 0) ? (-i1 - 1) : i1));
/*     */     } 
/* 174 */     return set;
/*     */   }
/*     */   
/*     */   private a a(UUID ☃) {
/* 178 */     return this.a.computeIfAbsent(☃, ☃ -> new a());
/*     */   }
/*     */   
/*     */   public void a(axz ☃, Random random, int i) {
/* 182 */     Collection<b> collection = ☃.a(random, i);
/*     */     
/* 184 */     collection.forEach(☃ -> {
/*     */           int i = ☃.c - ☃.b.j;
/*     */           if (i >= 2) {
/*     */             a.a(a(☃.a)).mergeInt(☃.b, i, axz::a);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(UUID ☃, Predicate<aya> predicate) {
/* 197 */     a a = this.a.get(☃);
/* 198 */     return (a != null) ? a.a(predicate) : 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(UUID ☃, aya aya1, int i) {
/* 209 */     a a = a(☃);
/* 210 */     a.a(a).mergeInt(aya1, i, (integer1, integer2) -> Integer.valueOf(a(☃, integer1.intValue(), integer2.intValue())));
/* 211 */     a.a(aya1);
/* 212 */     if (a.b()) {
/* 213 */       this.a.remove(☃);
/*     */     }
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
/*     */   public <T> Dynamic<T> a(DynamicOps<T> ☃) {
/* 247 */     return new Dynamic(☃, ☃.createList(c().map(b1 -> b1.a(☃)).map(Dynamic::getValue)));
/*     */   }
/*     */   
/*     */   public void a(Dynamic<?> ☃) {
/* 251 */     ☃.asStream()
/* 252 */       .map(b::a)
/* 253 */       .flatMap(☃ -> x.a(☃.result()))
/* 254 */       .forEach(☃ -> a.a(a(☃.a)).put(☃.b, ☃.c));
/*     */   }
/*     */   
/*     */   private static int a(int ☃, int i) {
/* 258 */     return Math.max(☃, i);
/*     */   }
/*     */   
/*     */   private int a(aya ☃, int i, int j) {
/* 262 */     int k = i + j;
/* 263 */     return (k > ☃.h) ? Math.max(☃.h, i) : k;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.ImmutableSortedMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.Decoder;
/*     */ import com.mojang.serialization.Encoder;
/*     */ import com.mojang.serialization.MapCodec;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.regex.Pattern;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cei<O, S extends cej<O, S>>
/*     */ {
/*  28 */   private static final Pattern a = Pattern.compile("^[a-z0-9_]+$");
/*     */   
/*     */   private final O b;
/*     */   private final ImmutableSortedMap<String, cfj<?>> c;
/*     */   private final ImmutableList<S> d;
/*     */   
/*     */   protected cei(Function<O, S> ☃, O o, b<O, S> b1, Map<String, cfj<?>> map) {
/*  35 */     this.b = o;
/*  36 */     this.c = ImmutableSortedMap.copyOf(map);
/*     */     
/*  38 */     Supplier<S> supplier = () -> (cej)☃.apply(object);
/*  39 */     MapCodec<S> mapCodec1 = MapCodec.of(Encoder.empty(), Decoder.unit(supplier));
/*  40 */     for (UnmodifiableIterator<Map.Entry<String, cfj<?>>> unmodifiableIterator = this.c.entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<String, cfj<?>> entry = unmodifiableIterator.next();
/*  41 */       mapCodec1 = a(mapCodec1, supplier, entry.getKey(), (cfj<Comparable>)entry.getValue()); }
/*     */ 
/*     */     
/*  44 */     MapCodec<S> mapCodec2 = mapCodec1;
/*     */ 
/*     */     
/*  47 */     Map<Map<cfj<?>, Comparable<?>>, S> map1 = Maps.newLinkedHashMap();
/*  48 */     List<S> list = Lists.newArrayList();
/*     */     
/*  50 */     Stream<List<Pair<cfj<?>, Comparable<?>>>> stream = Stream.of(Collections.emptyList());
/*  51 */     for (UnmodifiableIterator<cfj> unmodifiableIterator1 = this.c.values().iterator(); unmodifiableIterator1.hasNext(); ) { cfj<?> cfj = unmodifiableIterator1.next();
/*  52 */       stream = stream.flatMap(list -> ☃.a().stream().map(())); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  59 */     stream.forEach(list1 -> {
/*     */           ImmutableMap<cfj<?>, Comparable<?>> immutableMap = (ImmutableMap<cfj<?>, Comparable<?>>)list1.stream().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
/*     */           
/*     */           cej cej = ☃.create(object, immutableMap, mapCodec);
/*     */           
/*     */           map.put(immutableMap, cej);
/*     */           list.add(cej);
/*     */         });
/*  67 */     for (cej cej : list) {
/*  68 */       cej.a(map1);
/*     */     }
/*     */     
/*  71 */     this.d = ImmutableList.copyOf(list);
/*     */   }
/*     */   
/*     */   private static <S extends cej<?, S>, T extends Comparable<T>> MapCodec<S> a(MapCodec<S> ☃, Supplier<S> supplier, String str, cfj<T> cfj1) {
/*  75 */     return Codec.mapPair(☃, cfj1.e().fieldOf(str).setPartial(() -> ☃.a(supplier.get()))).xmap(pair -> (cej)((cej)pair.getFirst()).a(☃, ((cfj.a)pair.getSecond()).b()), cej1 -> Pair.of(cej1, ☃.a(cej1)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ImmutableList<S> a() {
/*  82 */     return this.d;
/*     */   }
/*     */   
/*     */   public S b() {
/*  86 */     return (S)this.d.get(0);
/*     */   }
/*     */   
/*     */   public O c() {
/*  90 */     return this.b;
/*     */   }
/*     */   
/*     */   public Collection<cfj<?>> d() {
/*  94 */     return (Collection<cfj<?>>)this.c.values();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  99 */     return MoreObjects.toStringHelper(this)
/* 100 */       .add("block", this.b)
/* 101 */       .add("properties", this.c.values().stream().map(cfj::f).collect(Collectors.toList()))
/* 102 */       .toString();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cfj<?> a(String ☃) {
/* 107 */     return (cfj)this.c.get(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a<O, S extends cej<O, S>>
/*     */   {
/*     */     private final O a;
/*     */     
/* 116 */     private final Map<String, cfj<?>> b = Maps.newHashMap();
/*     */     
/*     */     public a(O ☃) {
/* 119 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public a<O, S> a(cfj<?>... ☃) {
/* 123 */       for (cfj<?> cfj1 : ☃) {
/* 124 */         a(cfj1);
/* 125 */         this.b.put(cfj1.f(), cfj1);
/*     */       } 
/* 127 */       return this;
/*     */     }
/*     */     
/*     */     private <T extends Comparable<T>> void a(cfj<T> ☃) {
/* 131 */       String str = ☃.f();
/* 132 */       if (!cei.e().matcher(str).matches()) {
/* 133 */         throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has invalidly named property: ").append(str).toString());
/*     */       }
/*     */       
/* 136 */       Collection<T> collection = ☃.a();
/* 137 */       if (collection.size() <= 1) {
/* 138 */         throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" attempted use property ").append(str).append(" with <= 1 possible values").toString());
/*     */       }
/*     */       
/* 141 */       for (Comparable comparable : collection) {
/* 142 */         String str1 = ☃.a((T)comparable);
/* 143 */         if (!cei.e().matcher(str1).matches()) {
/* 144 */           throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has property: ").append(str).append(" with invalidly named value: ").append(str1).toString());
/*     */         }
/*     */       } 
/*     */       
/* 148 */       if (this.b.containsKey(str)) {
/* 149 */         throw new IllegalArgumentException((new StringBuilder()).append(this.a).append(" has duplicate property: ").append(str).toString());
/*     */       }
/*     */     }
/*     */     
/*     */     public cei<O, S> a(Function<O, S> ☃, cei.b<O, S> b1) {
/* 154 */       return new cei<>(☃, this.a, b1, this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface b<O, S> {
/*     */     S create(O param1O, ImmutableMap<cfj<?>, Comparable<?>> param1ImmutableMap, MapCodec<S> param1MapCodec);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cei.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.MapCodec;
/*     */ import com.mojang.serialization.MapLike;
/*     */ import com.mojang.serialization.RecordBuilder;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.mutable.MutableObject;
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
/*     */ public class arf<E extends aqm>
/*     */ {
/*  49 */   private static final Logger a = LogManager.getLogger();
/*     */   private final Supplier<Codec<arf<E>>> b;
/*     */   
/*     */   public static final class b<E extends aqm> {
/*     */     private final Collection<? extends ayd<?>> a;
/*     */     private final Collection<? extends azc<? extends azb<? super E>>> b;
/*     */     private final Codec<arf<E>> c;
/*     */     
/*     */     private b(Collection<? extends ayd<?>> ☃, Collection<? extends azc<? extends azb<? super E>>> collection) {
/*  58 */       this.a = ☃;
/*  59 */       this.b = collection;
/*  60 */       this.c = arf.b(☃, collection);
/*     */     }
/*     */     
/*     */     public arf<E> a(Dynamic<?> ☃) {
/*  64 */       return this.c.parse(☃).resultOrPartial(arf.i()::error).orElseGet(() -> new arf<>(this.a, this.b, ImmutableList.of(), ()));
/*     */     }
/*     */   }
/*     */   
/*     */   public static <E extends aqm> b<E> a(Collection<? extends ayd<?>> ☃, Collection<? extends azc<? extends azb<? super E>>> collection) {
/*  69 */     return new b<>(☃, collection);
/*     */   }
/*     */   
/*     */   public static <E extends aqm> Codec<arf<E>> b(Collection<? extends ayd<?>> ☃, Collection<? extends azc<? extends azb<? super E>>> collection) {
/*  73 */     MutableObject<Codec<arf<E>>> mutableObject = new MutableObject();
/*     */     
/*  75 */     mutableObject.setValue((new MapCodec<arf<E>>(☃, collection, mutableObject)
/*     */         {
/*     */           public <T> Stream<T> keys(DynamicOps<T> ☃) {
/*  78 */             return this.a.stream().flatMap(☃ -> x.a(☃.a().map(()))).map(vk1 -> ☃.createString(vk1.toString()));
/*     */           }
/*     */ 
/*     */           
/*     */           public <T> DataResult<arf<E>> decode(DynamicOps<T> ☃, MapLike<T> mapLike) {
/*  83 */             MutableObject<DataResult<ImmutableList.Builder<arf.a<?>>>> mutableObject = new MutableObject(DataResult.success(ImmutableList.builder()));
/*     */             
/*  85 */             mapLike.entries().forEach(pair -> {
/*     */                   DataResult<ayd<?>> dataResult = gm.ak.parse(☃, pair.getFirst());
/*     */                   
/*     */                   DataResult<? extends arf.a<?>> dataResult1 = dataResult.flatMap(());
/*     */                   mutableObject.setValue(((DataResult)mutableObject.getValue()).apply2(ImmutableList.Builder::add, dataResult1));
/*     */                 });
/*  91 */             ImmutableList<arf.a<?>> immutableList = ((DataResult)mutableObject.getValue()).resultOrPartial(arf.i()::error).map(ImmutableList.Builder::build).orElseGet(ImmutableList::of);
/*  92 */             return DataResult.success(new arf<>(this.a, this.b, immutableList, this.c::getValue));
/*     */           }
/*     */           
/*     */           private <T, U> DataResult<arf.a<U>> a(ayd<U> ☃, DynamicOps<T> dynamicOps, T t) {
/*  96 */             return ((DataResult)☃.a().map(DataResult::success).orElseGet(() -> DataResult.error("No codec for memory: " + ☃)))
/*  97 */               .flatMap(codec -> codec.parse(☃, object))
/*  98 */               .map(ayc1 -> new arf.a(☃, Optional.of(ayc1)));
/*     */           }
/*     */ 
/*     */           
/*     */           public <T> RecordBuilder<T> a(arf<E> ☃, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
/* 103 */             arf.a(☃).forEach(a1 -> a1.a(☃, recordBuilder));
/* 104 */             return recordBuilder;
/*     */           }
/* 106 */         }).fieldOf("memories").codec());
/*     */     
/* 108 */     return (Codec<arf<E>>)mutableObject.getValue();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 113 */   private final Map<ayd<?>, Optional<? extends ayc<?>>> c = Maps.newHashMap();
/*     */ 
/*     */   
/* 116 */   private final Map<azc<? extends azb<? super E>>, azb<? super E>> d = Maps.newLinkedHashMap();
/*     */ 
/*     */   
/* 119 */   private final Map<Integer, Map<bhf, Set<arv<? super E>>>> e = Maps.newTreeMap();
/*     */   
/* 121 */   private bhh f = bhh.a;
/*     */ 
/*     */   
/* 124 */   private final Map<bhf, Set<Pair<ayd<?>, aye>>> g = Maps.newHashMap();
/*     */   
/* 126 */   private final Map<bhf, Set<ayd<?>>> h = Maps.newHashMap();
/*     */ 
/*     */   
/* 129 */   private Set<bhf> i = Sets.newHashSet();
/*     */ 
/*     */   
/* 132 */   private final Set<bhf> j = Sets.newHashSet();
/*     */ 
/*     */   
/* 135 */   private bhf k = bhf.b;
/*     */   
/* 137 */   private long l = -9999L;
/*     */   
/*     */   public arf(Collection<? extends ayd<?>> ☃, Collection<? extends azc<? extends azb<? super E>>> collection, ImmutableList<a<?>> immutableList, Supplier<Codec<arf<E>>> supplier) {
/* 140 */     this.b = supplier;
/* 141 */     for (ayd<?> ayd : ☃) {
/* 142 */       this.c.put(ayd, Optional.empty());
/*     */     }
/* 144 */     for (azc<? extends azb<? super E>> azc : collection) {
/* 145 */       this.d.put(azc, azc.a());
/*     */     }
/*     */     
/* 148 */     for (azb<? super E> azb : this.d.values()) {
/* 149 */       for (ayd<?> ayd : azb.a()) {
/* 150 */         this.c.put(ayd, Optional.empty());
/*     */       }
/*     */     } 
/*     */     
/* 154 */     for (UnmodifiableIterator<a> unmodifiableIterator = immutableList.iterator(); unmodifiableIterator.hasNext(); ) { a<?> a = unmodifiableIterator.next();
/* 155 */       a.a(a, this); }
/*     */   
/*     */   }
/*     */   
/*     */   public <T> DataResult<T> a(DynamicOps<T> ☃) {
/* 160 */     return ((Codec)this.b.get()).encodeStart(☃, this);
/*     */   }
/*     */   
/*     */   static final class a<U>
/*     */   {
/*     */     private final ayd<U> a;
/*     */     private final Optional<? extends ayc<U>> b;
/*     */     
/*     */     private static <U> a<U> b(ayd<U> ☃, Optional<? extends ayc<?>> optional) {
/* 169 */       return new a<>(☃, (Optional)optional);
/*     */     }
/*     */     
/*     */     private a(ayd<U> ☃, Optional<? extends ayc<U>> optional) {
/* 173 */       this.a = ☃;
/* 174 */       this.b = optional;
/*     */     }
/*     */     
/*     */     private void a(arf<?> ☃) {
/* 178 */       arf.a(☃, this.a, this.b);
/*     */     }
/*     */     
/*     */     public <T> void a(DynamicOps<T> ☃, RecordBuilder<T> recordBuilder) {
/* 182 */       this.a.a().ifPresent(codec -> this.b.ifPresent(()));
/*     */     }
/*     */   }
/*     */   
/*     */   private Stream<a<?>> j() {
/* 187 */     return this.c.entrySet().stream().map(☃ -> a.a((ayd)☃.getKey(), (Optional)☃.getValue()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ayd<?> ☃) {
/* 194 */     return a(☃, aye.a);
/*     */   }
/*     */   
/*     */   public <U> void b(ayd<U> ☃) {
/* 198 */     a(☃, Optional.empty());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <U> void a(ayd<U> ☃, @Nullable U u) {
/* 206 */     a(☃, Optional.ofNullable(u));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <U> void a(ayd<U> ☃, U u, long l) {
/* 215 */     b(☃, Optional.of(ayc.a(u, l)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <U> void a(ayd<U> ☃, Optional<? extends U> optional) {
/* 223 */     b(☃, optional.map(ayc::a));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private <U> void b(ayd<U> ☃, Optional<? extends ayc<?>> optional) {
/* 232 */     if (this.c.containsKey(☃)) {
/* 233 */       if (optional.isPresent() && a(((ayc)optional.get()).c())) {
/* 234 */         b(☃);
/*     */       } else {
/* 236 */         this.c.put(☃, optional);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public <U> Optional<U> c(ayd<U> ☃) {
/* 243 */     return ((Optional)this.c.get(☃)).map(ayc::c);
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
/*     */   public <U> boolean b(ayd<U> ☃, U u) {
/* 256 */     if (!a(☃)) {
/* 257 */       return false;
/*     */     }
/* 259 */     return c(☃).filter(object1 -> object1.equals(☃)).isPresent();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ayd<?> ☃, aye aye1) {
/* 264 */     Optional<? extends ayc<?>> optional = this.c.get(☃);
/* 265 */     if (optional == null) {
/* 266 */       return false;
/*     */     }
/*     */     
/* 269 */     return (aye1 == aye.c || (aye1 == aye.a && optional
/* 270 */       .isPresent()) || (aye1 == aye.b && 
/* 271 */       !optional.isPresent()));
/*     */   }
/*     */   
/*     */   public bhh b() {
/* 275 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(bhh ☃) {
/* 279 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   public void a(Set<bhf> ☃) {
/* 283 */     this.i = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public List<arv<? super E>> d() {
/* 295 */     ObjectArrayList<arv<? super E>> objectArrayList = new ObjectArrayList();
/* 296 */     for (Map<bhf, Set<arv<? super E>>> ☃ : this.e.values()) {
/* 297 */       for (Set<arv<? super E>> set : ☃.values()) {
/* 298 */         for (arv<? super E> arv : set) {
/* 299 */           if (arv.a() == arv.a.b) {
/* 300 */             objectArrayList.add(arv);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 305 */     return (List<arv<? super E>>)objectArrayList;
/*     */   }
/*     */   
/*     */   public void e() {
/* 309 */     d(this.k);
/*     */   }
/*     */   
/*     */   public Optional<bhf> f() {
/* 313 */     for (bhf ☃ : this.j) {
/* 314 */       if (!this.i.contains(☃)) {
/* 315 */         return Optional.of(☃);
/*     */       }
/*     */     } 
/* 318 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bhf ☃) {
/* 327 */     if (f(☃)) {
/* 328 */       d(☃);
/*     */     } else {
/* 330 */       e();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(bhf ☃) {
/* 335 */     if (c(☃)) {
/*     */       return;
/*     */     }
/*     */     
/* 339 */     e(☃);
/* 340 */     this.j.clear();
/* 341 */     this.j.addAll(this.i);
/* 342 */     this.j.add(☃);
/*     */   }
/*     */   
/*     */   private void e(bhf ☃) {
/* 346 */     for (bhf bhf1 : this.j) {
/* 347 */       if (bhf1 != ☃) {
/* 348 */         Set<ayd<?>> set = this.h.get(bhf1);
/* 349 */         if (set != null) {
/* 350 */           for (ayd<?> ayd : set) {
/* 351 */             b(ayd);
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(long ☃, long l1) {
/* 363 */     if (l1 - this.l > 20L) {
/* 364 */       this.l = l1;
/* 365 */       bhf bhf1 = b().a((int)(☃ % 24000L));
/* 366 */       if (!this.j.contains(bhf1)) {
/* 367 */         a(bhf1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(List<bhf> ☃) {
/* 376 */     for (bhf bhf1 : ☃) {
/* 377 */       if (f(bhf1)) {
/* 378 */         d(bhf1);
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(bhf ☃) {
/* 385 */     this.k = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bhf ☃, int i, ImmutableList<? extends arv<? super E>> immutableList) {
/* 392 */     a(☃, a(i, immutableList));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bhf ☃, int i, ImmutableList<? extends arv<? super E>> immutableList, ayd<?> ayd1) {
/* 401 */     ImmutableSet immutableSet1 = ImmutableSet.of(
/* 402 */         Pair.of(ayd1, aye.a));
/*     */     
/* 404 */     ImmutableSet immutableSet2 = ImmutableSet.of(ayd1);
/* 405 */     a(☃, a(i, immutableList), (Set<Pair<ayd<?>, aye>>)immutableSet1, (Set<ayd<?>>)immutableSet2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bhf ☃, ImmutableList<? extends Pair<Integer, ? extends arv<? super E>>> immutableList) {
/* 412 */     a(☃, immutableList, (Set<Pair<ayd<?>, aye>>)ImmutableSet.of(), Sets.newHashSet());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bhf ☃, ImmutableList<? extends Pair<Integer, ? extends arv<? super E>>> immutableList, Set<Pair<ayd<?>, aye>> set) {
/* 420 */     a(☃, immutableList, set, Sets.newHashSet());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(bhf ☃, ImmutableList<? extends Pair<Integer, ? extends arv<? super E>>> immutableList, Set<Pair<ayd<?>, aye>> set, Set<ayd<?>> set1) {
/* 429 */     this.g.put(☃, set);
/* 430 */     if (!set1.isEmpty()) {
/* 431 */       this.h.put(☃, set1);
/*     */     }
/* 433 */     for (UnmodifiableIterator<Pair<Integer, ? extends arv<? super E>>> unmodifiableIterator = immutableList.iterator(); unmodifiableIterator.hasNext(); ) { Pair<Integer, ? extends arv<? super E>> pair = unmodifiableIterator.next();
/* 434 */       ((Set<Object>)((Map<bhf, Set<Object>>)this.e
/* 435 */         .computeIfAbsent(pair.getFirst(), ☃ -> Maps.newHashMap()))
/* 436 */         .computeIfAbsent(☃, ☃ -> Sets.newLinkedHashSet()))
/* 437 */         .add(pair.getSecond()); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(bhf ☃) {
/* 447 */     return this.j.contains(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public arf<E> h() {
/* 452 */     arf<E> ☃ = new arf(this.c.keySet(), this.d.keySet(), ImmutableList.of(), this.b);
/* 453 */     for (Map.Entry<ayd<?>, Optional<? extends ayc<?>>> entry : this.c.entrySet()) {
/* 454 */       ayd<?> ayd = entry.getKey();
/* 455 */       if (((Optional)entry.getValue()).isPresent()) {
/* 456 */         ☃.c.put(ayd, entry.getValue());
/*     */       }
/*     */     } 
/* 459 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(aag ☃, E e) {
/* 463 */     k();
/* 464 */     c(☃, e);
/* 465 */     d(☃, e);
/* 466 */     e(☃, e);
/*     */   }
/*     */   
/*     */   private void c(aag ☃, E e) {
/* 470 */     for (azb<? super E> azb : this.d.values()) {
/* 471 */       azb.b(☃, e);
/*     */     }
/*     */   }
/*     */   
/*     */   private void k() {
/* 476 */     for (Map.Entry<ayd<?>, Optional<? extends ayc<?>>> ☃ : this.c.entrySet()) {
/* 477 */       if (((Optional)☃.getValue()).isPresent()) {
/* 478 */         ayc<?> ayc = ((Optional<ayc>)☃.getValue()).get();
/* 479 */         ayc.a();
/* 480 */         if (ayc.d()) {
/* 481 */           b(☃.getKey());
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(aag ☃, E e) {
/* 488 */     long l = ((aqm)e).l.T();
/* 489 */     for (arv<? super E> arv : d()) {
/* 490 */       arv.g(☃, e, l);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void d(aag ☃, E e) {
/* 498 */     long l = ☃.T();
/* 499 */     for (Map<bhf, Set<arv<? super E>>> map : this.e.values()) {
/* 500 */       for (Map.Entry<bhf, Set<arv<? super E>>> entry : map.entrySet()) {
/* 501 */         bhf bhf1 = entry.getKey();
/* 502 */         if (this.j.contains(bhf1)) {
/* 503 */           Set<arv<? super E>> set = entry.getValue();
/* 504 */           for (arv<? super E> arv : set) {
/* 505 */             if (arv.a() == arv.a.a) {
/* 506 */               arv.e(☃, e, l);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void e(aag ☃, E e) {
/* 519 */     long l = ☃.T();
/* 520 */     for (arv<? super E> arv : d()) {
/* 521 */       arv.f(☃, e, l);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean f(bhf ☃) {
/* 526 */     if (!this.g.containsKey(☃)) {
/* 527 */       return false;
/*     */     }
/*     */     
/* 530 */     for (Pair<ayd<?>, aye> pair : this.g.get(☃)) {
/* 531 */       ayd<?> ayd = (ayd)pair.getFirst();
/* 532 */       aye aye = (aye)pair.getSecond();
/* 533 */       if (!a(ayd, aye)) {
/* 534 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 538 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(Object ☃) {
/* 542 */     return (☃ instanceof Collection && ((Collection)☃).isEmpty());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   ImmutableList<? extends Pair<Integer, ? extends arv<? super E>>> a(int ☃, ImmutableList<? extends arv<? super E>> immutableList) {
/* 549 */     int i = ☃;
/* 550 */     ImmutableList.Builder<Pair<Integer, ? extends arv<? super E>>> builder = ImmutableList.builder();
/* 551 */     for (UnmodifiableIterator<arv<? super E>> unmodifiableIterator = immutableList.iterator(); unmodifiableIterator.hasNext(); ) { arv<? super E> arv = unmodifiableIterator.next();
/* 552 */       builder.add(Pair.of(Integer.valueOf(i++), arv)); }
/*     */     
/* 554 */     return builder.build();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
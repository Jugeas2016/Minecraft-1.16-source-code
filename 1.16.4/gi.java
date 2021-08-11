/*     */ import com.google.common.collect.BiMap;
/*     */ import com.google.common.collect.HashBiMap;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function3;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import com.mojang.serialization.MapCodec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectList;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.OptionalInt;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.Validate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class gi<T>
/*     */   extends gs<T>
/*     */ {
/*  38 */   protected static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final ObjectList<T> bf;
/*     */   
/*     */   private final Object2IntMap<T> bg;
/*     */   
/*     */   private final BiMap<vk, T> bh;
/*     */   private final BiMap<vj<T>, T> bi;
/*     */   private final Map<T, Lifecycle> bj;
/*     */   private Lifecycle bk;
/*     */   protected Object[] b;
/*     */   private int bl;
/*     */   
/*     */   public gi(vj<? extends gm<T>> ☃, Lifecycle lifecycle) {
/*  52 */     super(☃, lifecycle);
/*  53 */     this.bf = (ObjectList<T>)new ObjectArrayList(256);
/*  54 */     this.bg = (Object2IntMap<T>)new Object2IntOpenCustomHashMap(x.k());
/*  55 */     this.bg.defaultReturnValue(-1);
/*  56 */     this.bh = (BiMap<vk, T>)HashBiMap.create();
/*  57 */     this.bi = (BiMap<vj<T>, T>)HashBiMap.create();
/*  58 */     this.bj = Maps.newIdentityHashMap();
/*  59 */     this.bk = lifecycle;
/*     */   }
/*     */   
/*     */   public static <T> MapCodec<a<T>> a(vj<? extends gm<T>> ☃, MapCodec<T> mapCodec) {
/*  63 */     return RecordCodecBuilder.mapCodec(instance -> instance.group((App)vk.a.xmap(vj.b(☃), vj::a).fieldOf("name").forGetter(()), (App)Codec.INT.fieldOf("id").forGetter(()), (App)mapCodec.forGetter(())).apply((Applicative)instance, a::new));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <V extends T> V a(int ☃, vj<T> vj1, V v, Lifecycle lifecycle) {
/*  72 */     return a(☃, vj1, v, lifecycle, true);
/*     */   }
/*     */   
/*     */   private <V extends T> V a(int ☃, vj<T> vj1, V v, Lifecycle lifecycle, boolean bool) {
/*  76 */     Validate.notNull(vj1);
/*  77 */     Validate.notNull(v);
/*     */     
/*  79 */     this.bf.size(Math.max(this.bf.size(), ☃ + 1));
/*  80 */     this.bf.set(☃, v);
/*  81 */     this.bg.put(v, ☃);
/*  82 */     this.b = null;
/*     */     
/*  84 */     if (bool && this.bi.containsKey(vj1)) {
/*  85 */       a.debug("Adding duplicate key '{}' to registry", vj1);
/*     */     }
/*  87 */     if (this.bh.containsValue(v)) {
/*  88 */       a.error("Adding duplicate value '{}' to registry", v);
/*     */     }
/*  90 */     this.bh.put(vj1.a(), v);
/*  91 */     this.bi.put(vj1, v);
/*  92 */     this.bj.put((T)v, lifecycle);
/*  93 */     this.bk = this.bk.add(lifecycle);
/*  94 */     if (this.bl <= ☃) {
/*  95 */       this.bl = ☃ + 1;
/*     */     }
/*     */     
/*  98 */     return v;
/*     */   }
/*     */ 
/*     */   
/*     */   public <V extends T> V a(vj<T> ☃, V v, Lifecycle lifecycle) {
/* 103 */     return a(this.bl, ☃, v, lifecycle);
/*     */   }
/*     */   
/*     */   public <V extends T> V a(OptionalInt ☃, vj<T> vj1, V v, Lifecycle lifecycle) {
/*     */     int i;
/* 108 */     Validate.notNull(vj1);
/* 109 */     Validate.notNull(v);
/*     */     
/* 111 */     T t = (T)this.bi.get(vj1);
/*     */     
/* 113 */     if (t == null) {
/* 114 */       i = ☃.isPresent() ? ☃.getAsInt() : this.bl;
/*     */     } else {
/* 116 */       i = this.bg.getInt(t);
/* 117 */       if (☃.isPresent() && ☃.getAsInt() != i) {
/* 118 */         throw new IllegalStateException("ID mismatch");
/*     */       }
/* 120 */       this.bg.removeInt(t);
/* 121 */       this.bj.remove(t);
/*     */     } 
/*     */     
/* 124 */     return a(i, vj1, v, lifecycle, false);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public vk b(T ☃) {
/* 130 */     return (vk)this.bh.inverse().get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<vj<T>> c(T ☃) {
/* 135 */     return Optional.ofNullable(this.bi.inverse().get(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(@Nullable T ☃) {
/* 140 */     return this.bg.getInt(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T a(@Nullable vj<T> ☃) {
/* 146 */     return (T)this.bi.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T a(int ☃) {
/* 152 */     if (☃ < 0 || ☃ >= this.bf.size()) {
/* 153 */       return null;
/*     */     }
/* 155 */     return (T)this.bf.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Lifecycle d(T ☃) {
/* 160 */     return this.bj.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Lifecycle b() {
/* 165 */     return this.bk;
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<T> iterator() {
/* 170 */     return (Iterator<T>)Iterators.filter((Iterator)this.bf.iterator(), Objects::nonNull);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T a(@Nullable vk ☃) {
/* 176 */     return (T)this.bh.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<vk> c() {
/* 181 */     return Collections.unmodifiableSet(this.bh.keySet());
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<Map.Entry<vj<T>, T>> d() {
/* 186 */     return Collections.<vj<T>, T>unmodifiableMap((Map<? extends vj<T>, ? extends T>)this.bi).entrySet();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T a(Random ☃) {
/* 198 */     if (this.b == null) {
/* 199 */       Collection<?> collection = this.bh.values();
/* 200 */       if (collection.isEmpty()) {
/* 201 */         return null;
/*     */       }
/* 203 */       this.b = collection.toArray(new Object[collection.size()]);
/*     */     } 
/* 205 */     return x.a((T[])this.b, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(vk ☃) {
/* 210 */     return this.bh.containsKey(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> Codec<gi<T>> a(vj<? extends gm<T>> ☃, Lifecycle lifecycle, Codec<T> codec) {
/* 219 */     return a(☃, codec.fieldOf("element")).codec().listOf().xmap(list -> {
/*     */           gi<T> gi1 = new gi<>(☃, lifecycle);
/*     */           for (a<T> a : (Iterable<a<T>>)list) {
/*     */             gi1.a(a.b, a.a, a.c, lifecycle);
/*     */           }
/*     */           return gi1;
/*     */         }☃ -> {
/*     */           ImmutableList.Builder<a<T>> builder = ImmutableList.builder();
/*     */           for (T t : ☃) {
/*     */             builder.add(new a<>(☃.c(t).get(), ☃.a(t), t));
/*     */           }
/*     */           return (List)builder.build();
/*     */         });
/*     */   }
/*     */   
/*     */   public static <T> Codec<gi<T>> b(vj<? extends gm<T>> ☃, Lifecycle lifecycle, Codec<T> codec) {
/* 235 */     return ve.a(☃, lifecycle, codec);
/*     */   }
/*     */   
/*     */   public static <T> Codec<gi<T>> c(vj<? extends gm<T>> ☃, Lifecycle lifecycle, Codec<T> codec) {
/* 239 */     return Codec.unboundedMap(vk.a
/* 240 */         .xmap(vj.b(☃), vj::a), codec)
/*     */       
/* 242 */       .xmap(map -> {
/*     */           gi<T> gi1 = new gi<>(☃, lifecycle);
/*     */           map.forEach(());
/*     */           return gi1;
/*     */         }☃ -> ImmutableMap.copyOf((Map)☃.bi));
/*     */   }
/*     */   
/*     */   public static class a<T> {
/*     */     public final vj<T> a;
/*     */     public final int b;
/*     */     public final T c;
/*     */     
/*     */     public a(vj<T> ☃, int i, T t) {
/* 255 */       this.a = ☃;
/* 256 */       this.b = i;
/* 257 */       this.c = t;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongCollection;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class zt<T>
/*     */ {
/*  19 */   public static final int a = zs.a + 2;
/*  20 */   private final List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>> b = (List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>>)IntStream.range(0, a).mapToObj(☃ -> new Long2ObjectLinkedOpenHashMap()).collect(Collectors.toList());
/*  21 */   private volatile int c = a;
/*     */   
/*     */   private final String d;
/*     */   
/*  25 */   private final LongSet e = (LongSet)new LongOpenHashSet();
/*     */   private final int f;
/*     */   
/*     */   public zt(String ☃, int i) {
/*  29 */     this.d = ☃;
/*  30 */     this.f = i;
/*     */   }
/*     */   
/*     */   protected void a(int ☃, brd brd1, int i) {
/*  34 */     if (☃ >= a) {
/*     */       return;
/*     */     }
/*  37 */     Long2ObjectLinkedOpenHashMap<List<Optional<T>>> long2ObjectLinkedOpenHashMap = this.b.get(☃);
/*  38 */     List<Optional<T>> list = (List<Optional<T>>)long2ObjectLinkedOpenHashMap.remove(brd1.a());
/*  39 */     if (☃ == this.c) {
/*  40 */       while (this.c < a && ((Long2ObjectLinkedOpenHashMap)this.b.get(this.c)).isEmpty()) {
/*  41 */         this.c++;
/*     */       }
/*     */     }
/*  44 */     if (list != null && !list.isEmpty()) {
/*  45 */       ((List<Optional<T>>)((Long2ObjectLinkedOpenHashMap)this.b.get(i)).computeIfAbsent(brd1.a(), ☃ -> Lists.newArrayList())).addAll(list);
/*  46 */       this.c = Math.min(this.c, i);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(Optional<T> ☃, long l, int i) {
/*  51 */     ((List<Optional<T>>)((Long2ObjectLinkedOpenHashMap)this.b.get(i)).computeIfAbsent(l, ☃ -> Lists.newArrayList())).add(☃);
/*  52 */     this.c = Math.min(this.c, i);
/*     */   }
/*     */   
/*     */   protected void a(long ☃, boolean bool) {
/*  56 */     for (Long2ObjectLinkedOpenHashMap<List<Optional<T>>> long2ObjectLinkedOpenHashMap : this.b) {
/*  57 */       List<Optional<T>> list = (List<Optional<T>>)long2ObjectLinkedOpenHashMap.get(☃);
/*  58 */       if (list == null) {
/*     */         continue;
/*     */       }
/*  61 */       if (bool) {
/*  62 */         list.clear();
/*     */       } else {
/*  64 */         list.removeIf(☃ -> !☃.isPresent());
/*     */       } 
/*  66 */       if (list.isEmpty()) {
/*  67 */         long2ObjectLinkedOpenHashMap.remove(☃);
/*     */       }
/*     */     } 
/*  70 */     while (this.c < a && ((Long2ObjectLinkedOpenHashMap)this.b.get(this.c)).isEmpty()) {
/*  71 */       this.c++;
/*     */     }
/*  73 */     this.e.remove(☃);
/*     */   }
/*     */   
/*     */   private Runnable a(long ☃) {
/*  77 */     return () -> this.e.add(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Stream<Either<T, Runnable>> a() {
/*  82 */     if (this.e.size() >= this.f) {
/*  83 */       return null;
/*     */     }
/*  85 */     if (this.c < a) {
/*  86 */       int ☃ = this.c;
/*  87 */       Long2ObjectLinkedOpenHashMap<List<Optional<T>>> long2ObjectLinkedOpenHashMap = this.b.get(☃);
/*  88 */       long l = long2ObjectLinkedOpenHashMap.firstLongKey();
/*  89 */       List<Optional<T>> list = (List<Optional<T>>)long2ObjectLinkedOpenHashMap.removeFirst();
/*  90 */       while (this.c < a && ((Long2ObjectLinkedOpenHashMap)this.b.get(this.c)).isEmpty()) {
/*  91 */         this.c++;
/*     */       }
/*  93 */       return list.stream().map(optional -> (Either)optional.map(Either::left).orElseGet(()));
/*     */     } 
/*  95 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 100 */     return this.d + " " + this.c + "...";
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   LongSet b() {
/* 105 */     return (LongSet)new LongOpenHashSet((LongCollection)this.e);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
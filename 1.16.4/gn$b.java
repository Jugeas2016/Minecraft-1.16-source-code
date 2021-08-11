/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import com.mojang.serialization.codecs.UnboundedMapCodec;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class b
/*     */   extends gn
/*     */ {
/*  99 */   public static final Codec<b> a = d();
/*     */   
/*     */   private static <E> Codec<b> d() {
/* 102 */     Codec<vj<? extends gm<E>>> ☃ = vk.a.xmap(vj::a, vj::a);
/* 103 */     Codec<gi<E>> codec = ☃.partialDispatch("type", ☃ -> DataResult.success(☃.f()), ☃ -> c(☃).map(()));
/* 104 */     UnboundedMapCodec<? extends vj<? extends gm<?>>, ? extends gi<?>> unboundedMapCodec = Codec.unboundedMap(☃, codec);
/* 105 */     return a(unboundedMapCodec);
/*     */   }
/*     */   private final Map<? extends vj<? extends gm<?>>, ? extends gi<?>> b;
/*     */   
/*     */   private static <K extends vj<? extends gm<?>>, V extends gi<?>> Codec<b> a(UnboundedMapCodec<K, V> ☃) {
/* 110 */     return ☃.xmap(b::new, ☃ -> (Map)☃.b.entrySet().stream().filter(()).collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, Map.Entry::getValue)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static <E> DataResult<? extends Codec<E>> c(vj<? extends gm<E>> ☃) {
/* 121 */     return Optional.ofNullable(gn.c().get(☃))
/* 122 */       .map(☃ -> ☃.c())
/* 123 */       .map(DataResult::success)
/* 124 */       .orElseGet(() -> DataResult.error("Unknown or not serializable registry: " + ☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public b() {
/* 130 */     this((Map<? extends vj<? extends gm<?>>, ? extends gi<?>>)gn.c().keySet().stream().collect(Collectors.toMap(Function.identity(), b::d)));
/*     */   }
/*     */   
/*     */   private b(Map<? extends vj<? extends gm<?>>, ? extends gi<?>> ☃) {
/* 134 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static <E> gi<?> d(vj<? extends gm<?>> ☃) {
/* 140 */     return new gi(☃, Lifecycle.stable());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <E> Optional<gs<E>> a(vj<? extends gm<E>> ☃) {
/* 146 */     return Optional.ofNullable(this.b.get(☃)).map(☃ -> ☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gn$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
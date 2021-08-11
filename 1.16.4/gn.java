/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.Encoder;
/*     */ import com.mojang.serialization.JsonOps;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import com.mojang.serialization.codecs.UnboundedMapCodec;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
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
/*     */ public abstract class gn
/*     */ {
/*  33 */   private static final Logger a = LogManager.getLogger();
/*     */   private static final Map<vj<? extends gm<?>>, a<?>> b;
/*     */   private static final b c;
/*     */   
/*     */   public <E> gs<E> b(vj<? extends gm<E>> ☃) {
/*  38 */     return (gs<E>)a(☃).orElseThrow(() -> new IllegalStateException("Missing registry: " + ☃));
/*     */   }
/*     */   
/*     */   public gm<chd> a() {
/*  42 */     return b(gm.K);
/*     */   }
/*     */   
/*     */   static final class a<E> {
/*     */     private final vj<? extends gm<E>> a;
/*     */     private final Codec<E> b;
/*     */     @Nullable
/*     */     private final Codec<E> c;
/*     */     
/*     */     public a(vj<? extends gm<E>> ☃, Codec<E> codec1, @Nullable Codec<E> codec2) {
/*  52 */       this.a = ☃;
/*  53 */       this.b = codec1;
/*  54 */       this.c = codec2;
/*     */     }
/*     */     
/*     */     public vj<? extends gm<E>> a() {
/*  58 */       return this.a;
/*     */     }
/*     */     
/*     */     public Codec<E> b() {
/*  62 */       return this.b;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Codec<E> c() {
/*  67 */       return this.c;
/*     */     }
/*     */     
/*     */     public boolean d() {
/*  71 */       return (this.c != null);
/*     */     }
/*     */   }
/*     */   
/*     */   static {
/*  76 */     b = x.<Map<vj<? extends gm<?>>, a<?>>>a(() -> {
/*     */           ImmutableMap.Builder<vj<? extends gm<?>>, a<?>> ☃ = ImmutableMap.builder();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, gm.K, chd.d, chd.d);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, gm.ay, bsv.b, bsv.c);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, gm.as, ctg.a);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, gm.at, cib.a);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, gm.au, civ.a);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, gm.av, ciw.a);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, gm.aw, cta.l);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, gm.ax, cok.a);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, gm.ar, chp.a);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           return ☃.build();
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     c = x.<b>a(() -> {
/*     */           b ☃ = new b();
/*     */           chd.a(☃);
/*     */           b.keySet().stream().filter(()).forEach(());
/*     */           return ☃;
/*     */         });
/*     */   } private static <E> void a(ImmutableMap.Builder<vj<? extends gm<?>>, a<?>> ☃, vj<? extends gm<E>> vj1, Codec<E> codec) {
/*     */     ☃.put(vj1, new a<>(vj1, codec, null));
/* 158 */   } public static b b() { b ☃ = new b();
/* 159 */     vh.b.a a = new vh.b.a();
/*     */     
/* 161 */     for (a<?> a1 : b.values()) {
/* 162 */       a(☃, a, a1);
/*     */     }
/*     */     
/* 165 */     vh.a((DynamicOps<?>)JsonOps.INSTANCE, a, ☃);
/* 166 */     return ☃; }
/*     */   private static <E> void a(ImmutableMap.Builder<vj<? extends gm<?>>, a<?>> ☃, vj<? extends gm<E>> vj1, Codec<E> codec1, Codec<E> codec2) { ☃.put(vj1, new a<>(vj1, codec1, codec2)); }
/*     */   public static final class b extends gn {
/*     */     public static final Codec<b> a = d();
/* 170 */     private final Map<? extends vj<? extends gm<?>>, ? extends gi<?>> b; private static <E> Codec<b> d() { Codec<vj<? extends gm<E>>> ☃ = vk.a.xmap(vj::a, vj::a); Codec<gi<E>> codec = ☃.partialDispatch("type", ☃ -> DataResult.success(☃.f()), ☃ -> c(☃).map(())); UnboundedMapCodec<? extends vj<? extends gm<?>>, ? extends gi<?>> unboundedMapCodec = Codec.unboundedMap(☃, codec); return a(unboundedMapCodec); } private static <K extends vj<? extends gm<?>>, V extends gi<?>> Codec<b> a(UnboundedMapCodec<K, V> ☃) { return ☃.xmap(b::new, ☃ -> (Map)☃.b.entrySet().stream().filter(()).collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, Map.Entry::getValue))); } private static <E> DataResult<? extends Codec<E>> c(vj<? extends gm<E>> ☃) { return Optional.ofNullable(gn.c().get(☃)).map(☃ -> ☃.c()).map(DataResult::success).orElseGet(() -> DataResult.error("Unknown or not serializable registry: " + ☃)); } public b() { this((Map<? extends vj<? extends gm<?>>, ? extends gi<?>>)gn.c().keySet().stream().collect(Collectors.toMap(Function.identity(), b::d))); } private b(Map<? extends vj<? extends gm<?>>, ? extends gi<?>> ☃) { this.b = ☃; } private static <E> gi<?> d(vj<? extends gm<?>> ☃) { return new gi(☃, Lifecycle.stable()); } public <E> Optional<gs<E>> a(vj<? extends gm<E>> ☃) { return Optional.ofNullable(this.b.get(☃)).map(☃ -> ☃); } } private static <E> void a(b ☃, vh.b.a a1, a<E> a2) { vj<? extends gm<E>> vj = a2.a();
/*     */     
/* 172 */     boolean bool = (!vj.equals(gm.ar) && !vj.equals(gm.K));
/* 173 */     gm<E> gm = c.b(vj);
/* 174 */     gs<E> gs = ☃.b(vj);
/* 175 */     for (Map.Entry<vj<E>, E> entry : gm.d()) {
/* 176 */       E e = entry.getValue();
/* 177 */       if (bool) {
/* 178 */         a1.a(c, entry.getKey(), (Encoder<E>)a2.b(), gm.a(e), e, gm.d(e)); continue;
/*     */       } 
/* 180 */       gs.a(gm.a(e), entry.getKey(), e, gm.d(e));
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static <R extends gm<?>> void a(b ☃, vj<R> vj1) {
/* 187 */     gm<? extends gm<?>> gm = hk.b;
/* 188 */     gm<?> gm1 = gm.a(vj1);
/* 189 */     if (gm1 == null) {
/* 190 */       throw new IllegalStateException("Missing builtin registry: " + vj1);
/*     */     }
/* 192 */     a(☃, gm1);
/*     */   }
/*     */   
/*     */   private static <E> void a(b ☃, gm<E> gm1) {
/* 196 */     gs<E> gs = (gs<E>)☃.a(gm1.f()).orElseThrow(() -> new IllegalStateException("Missing registry: " + ☃.f()));
/* 197 */     for (Map.Entry<vj<E>, E> entry : gm1.d()) {
/* 198 */       E e = entry.getValue();
/* 199 */       gs.a(gm1.a(e), entry.getKey(), e, gm1.d(e));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(b ☃, vh<?> vh1) {
/* 204 */     for (a<?> a : b.values()) {
/* 205 */       a(vh1, ☃, a);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static <E> void a(vh<?> ☃, b b1, a<E> a1) {
/* 211 */     vj<? extends gm<E>> vj = a1.a();
/* 212 */     gi<E> gi = (gi<E>)Optional.ofNullable(b.a(b1).get(vj)).map(☃ -> ☃).orElseThrow(() -> new IllegalStateException("Missing registry: " + ☃));
/* 213 */     DataResult<gi<E>> dataResult = ☃.a(gi, a1.a(), a1.b());
/* 214 */     dataResult.error().ifPresent(☃ -> a.error("Error loading registry data: {}", ☃.message()));
/*     */   }
/*     */   
/*     */   public abstract <E> Optional<gs<E>> a(vj<? extends gm<E>> paramvj);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
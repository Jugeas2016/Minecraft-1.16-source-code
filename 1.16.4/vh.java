/*     */ import com.google.common.base.Supplier;
/*     */ import com.google.common.base.Suppliers;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParser;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Decoder;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.Encoder;
/*     */ import com.mojang.serialization.JsonOps;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collection;
/*     */ import java.util.IdentityHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.OptionalInt;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class vh<T>
/*     */   extends vd<T>
/*     */ {
/*  42 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private final b c;
/*     */   
/*     */   private final gn.b d;
/*     */   private final Map<vj<? extends gm<?>>, a<?>> e;
/*     */   private final vh<JsonElement> f;
/*     */   
/*     */   public static <T> vh<T> a(DynamicOps<T> ☃, ach ach1, gn.b b1) {
/*  51 */     return a(☃, b.a(ach1), b1);
/*     */   }
/*     */   
/*     */   public static <T> vh<T> a(DynamicOps<T> ☃, b b1, gn.b b2) {
/*  55 */     vh<T> vh1 = new vh<>(☃, b1, b2, Maps.newIdentityHashMap());
/*     */     
/*  57 */     gn.a(b2, vh1);
/*  58 */     return vh1;
/*     */   }
/*     */   
/*     */   static final class a<E> {
/*  62 */     private final Map<vj<E>, DataResult<Supplier<E>>> a = Maps.newIdentityHashMap();
/*     */     
/*     */     private a() {} }
/*     */   
/*     */   private vh(DynamicOps<T> ☃, b b1, gn.b b2, IdentityHashMap<vj<? extends gm<?>>, a<?>> identityHashMap) {
/*  67 */     super(☃);
/*  68 */     this.c = b1;
/*  69 */     this.d = b2;
/*  70 */     this.e = identityHashMap;
/*  71 */     this.f = (☃ == JsonOps.INSTANCE) ? (vh)this : new vh((DynamicOps<T>)JsonOps.INSTANCE, b1, b2, identityHashMap);
/*     */   }
/*     */   
/*     */   protected <E> DataResult<Pair<Supplier<E>, T>> a(T ☃, vj<? extends gm<E>> vj1, Codec<E> codec, boolean bool) {
/*  75 */     Optional<gs<E>> optional = this.d.a(vj1);
/*  76 */     if (!optional.isPresent()) {
/*  77 */       return DataResult.error("Unknown registry: " + vj1);
/*     */     }
/*     */     
/*  80 */     gs<E> gs = optional.get();
/*     */     
/*  82 */     DataResult<Pair<vk, T>> dataResult = vk.a.decode(this.a, ☃);
/*  83 */     if (!dataResult.result().isPresent()) {
/*  84 */       if (!bool) {
/*  85 */         return DataResult.error("Inline definitions not allowed here");
/*     */       }
/*  87 */       return codec.decode(this, ☃).map(☃ -> ☃.mapFirst(()));
/*     */     } 
/*     */     
/*  90 */     Pair<vk, T> pair = dataResult.result().get();
/*  91 */     vk vk = (vk)pair.getFirst();
/*  92 */     return a(vj1, gs, codec, vk).map(supplier -> Pair.of(supplier, ☃.getSecond()));
/*     */   }
/*     */ 
/*     */   
/*     */   public <E> DataResult<gi<E>> a(gi<E> ☃, vj<? extends gm<E>> vj1, Codec<E> codec) {
/*  97 */     Collection<vk> collection = this.c.a(vj1);
/*     */     
/*  99 */     DataResult<gi<E>> dataResult = DataResult.success(☃, Lifecycle.stable());
/*     */     
/* 101 */     String str = vj1.a().a() + "/";
/* 102 */     for (vk vk1 : collection) {
/* 103 */       String str1 = vk1.a();
/* 104 */       if (!str1.endsWith(".json")) {
/* 105 */         b.warn("Skipping resource {} since it is not a json file", vk1);
/*     */         continue;
/*     */       } 
/* 108 */       if (!str1.startsWith(str)) {
/* 109 */         b.warn("Skipping resource {} since it does not have a registry name prefix", vk1);
/*     */         continue;
/*     */       } 
/* 112 */       String str2 = str1.substring(str.length(), str1.length() - ".json".length());
/* 113 */       vk vk2 = new vk(vk1.b(), str2);
/*     */       
/* 115 */       dataResult = dataResult.flatMap(gi1 -> a(☃, gi1, codec, vk1).map(()));
/*     */     } 
/*     */     
/* 118 */     return dataResult.setPartial(☃);
/*     */   }
/*     */   private <E> DataResult<Supplier<E>> a(vj<? extends gm<E>> ☃, gs<E> gs1, Codec<E> codec, vk vk1) {
/*     */     DataResult<Supplier<E>> dataResult2;
/* 122 */     vj<E> vj1 = vj.a(☃, vk1);
/*     */     
/* 124 */     a<E> a = b(☃);
/* 125 */     DataResult<Supplier<E>> dataResult1 = (DataResult<Supplier<E>>)a.a(a).get(vj1);
/* 126 */     if (dataResult1 != null)
/*     */     {
/* 128 */       return dataResult1;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     Supplier supplier = Suppliers.memoize(() -> {
/*     */           E e = ☃.a(vj1);
/*     */           if (e == null) {
/*     */             throw new RuntimeException("Error during recursive registry parsing, element resolved too early: " + vj1);
/*     */           }
/*     */           return (Supplier)e;
/*     */         });
/* 141 */     a.a(a).put(vj1, DataResult.success(supplier));
/*     */ 
/*     */     
/* 144 */     DataResult<Pair<E, OptionalInt>> dataResult = this.c.a(this.f, ☃, vj1, (Decoder<E>)codec);
/*     */     
/* 146 */     Optional<Pair<E, OptionalInt>> optional = dataResult.result();
/*     */     
/* 148 */     if (optional.isPresent()) {
/*     */       
/* 150 */       Pair<E, OptionalInt> pair = optional.get();
/* 151 */       gs1.a((OptionalInt)pair.getSecond(), vj1, pair.getFirst(), dataResult.lifecycle());
/*     */     } 
/*     */ 
/*     */     
/* 155 */     if (!optional.isPresent() && gs1.a(vj1) != null) {
/*     */       
/* 157 */       dataResult2 = DataResult.success(() -> ☃.a(vj1), Lifecycle.stable());
/*     */     } else {
/*     */       
/* 160 */       dataResult2 = dataResult.map(pair -> ());
/*     */     } 
/*     */ 
/*     */     
/* 164 */     a.a(a).put(vj1, dataResult2);
/*     */     
/* 166 */     return dataResult2;
/*     */   }
/*     */ 
/*     */   
/*     */   private <E> a<E> b(vj<? extends gm<E>> ☃) {
/* 171 */     return (a<E>)this.e.computeIfAbsent(☃, ☃ -> new a());
/*     */   }
/*     */ 
/*     */   
/*     */   protected <E> DataResult<gm<E>> a(vj<? extends gm<E>> ☃) {
/* 176 */     return this.d.<E>a(☃)
/* 177 */       .map(☃ -> DataResult.success(☃, ☃.b()))
/* 178 */       .orElseGet(() -> DataResult.error("Unknown registry: " + ☃));
/*     */   }
/*     */   
/*     */   public static interface b {
/*     */     Collection<vk> a(vj<? extends gm<?>> param1vj);
/*     */     
/*     */     <E> DataResult<Pair<E, OptionalInt>> a(DynamicOps<JsonElement> param1DynamicOps, vj<? extends gm<E>> param1vj, vj<E> param1vj1, Decoder<E> param1Decoder);
/*     */     
/*     */     static b a(ach ☃) {
/* 187 */       return new b(☃)
/*     */         {
/*     */           public Collection<vk> a(vj<? extends gm<?>> ☃) {
/* 190 */             return this.a.a(☃.a().a(), ☃ -> ☃.endsWith(".json"));
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public <E> DataResult<Pair<E, OptionalInt>> a(DynamicOps<JsonElement> ☃, vj<? extends gm<E>> vj1, vj<E> vj2, Decoder<E> decoder) {
/* 196 */             vk vk1 = vj2.a();
/* 197 */             vk vk2 = new vk(vk1.b(), vj1.a().a() + "/" + vk1.a() + ".json");
/*     */             
/* 199 */             try(acg ☃ = this.a.a(vk2); 
/* 200 */                 Reader ☃ = new InputStreamReader(acg.b(), StandardCharsets.UTF_8)) {
/*     */               
/* 202 */               JsonParser jsonParser = new JsonParser();
/* 203 */               JsonElement jsonElement = jsonParser.parse(reader);
/* 204 */               return decoder.parse(☃, jsonElement).map(☃ -> Pair.of(☃, OptionalInt.empty()));
/* 205 */             } catch (IOException|com.google.gson.JsonIOException|com.google.gson.JsonSyntaxException exception) {
/* 206 */               return DataResult.error("Failed to parse " + vk2 + " file: " + exception.getMessage());
/*     */             } 
/*     */           }
/*     */ 
/*     */           
/*     */           public String toString() {
/* 212 */             return "ResourceAccess[" + this.a + "]";
/*     */           }
/*     */         };
/*     */     }
/*     */     
/*     */     public static final class a implements b {
/* 218 */       private final Map<vj<?>, JsonElement> a = Maps.newIdentityHashMap();
/* 219 */       private final Object2IntMap<vj<?>> b = (Object2IntMap<vj<?>>)new Object2IntOpenCustomHashMap(x.k());
/* 220 */       private final Map<vj<?>, Lifecycle> c = Maps.newIdentityHashMap();
/*     */       
/*     */       public <E> void a(gn.b ☃, vj<E> vj1, Encoder<E> encoder, int i, E e, Lifecycle lifecycle) {
/* 223 */         DataResult<JsonElement> dataResult = encoder.encodeStart(vi.a((DynamicOps<?>)JsonOps.INSTANCE, ☃), e);
/* 224 */         Optional<DataResult.PartialResult<JsonElement>> optional = dataResult.error();
/* 225 */         if (optional.isPresent()) {
/* 226 */           vh.a().error("Error adding element: {}", ((DataResult.PartialResult)optional.get()).message());
/*     */           return;
/*     */         } 
/* 229 */         this.a.put(vj1, dataResult.result().get());
/* 230 */         this.b.put(vj1, i);
/* 231 */         this.c.put(vj1, lifecycle);
/*     */       }
/*     */ 
/*     */       
/*     */       public Collection<vk> a(vj<? extends gm<?>> ☃) {
/* 236 */         return (Collection<vk>)this.a.keySet().stream().filter(vj1 -> vj1.a(☃)).map(vj1 -> new vk(vj1.a().b(), ☃.a().a() + "/" + vj1.a().a() + ".json")).collect(Collectors.toList());
/*     */       }
/*     */ 
/*     */       
/*     */       public <E> DataResult<Pair<E, OptionalInt>> a(DynamicOps<JsonElement> ☃, vj<? extends gm<E>> vj1, vj<E> vj2, Decoder<E> decoder) {
/* 241 */         JsonElement jsonElement = this.a.get(vj2);
/* 242 */         if (jsonElement == null) {
/* 243 */           return DataResult.error("Unknown element: " + vj2);
/*     */         }
/* 245 */         return decoder.parse(☃, jsonElement).setLifecycle(this.c.get(vj2)).map(object -> Pair.of(object, OptionalInt.of(this.b.getInt(☃))));
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
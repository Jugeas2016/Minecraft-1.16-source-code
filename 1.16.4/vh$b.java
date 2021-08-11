/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParser;
/*     */ import com.mojang.datafixers.util.Pair;
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
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.OptionalInt;
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
/*     */ public interface b
/*     */ {
/*     */   Collection<vk> a(vj<? extends gm<?>> paramvj);
/*     */   
/*     */   <E> DataResult<Pair<E, OptionalInt>> a(DynamicOps<JsonElement> paramDynamicOps, vj<? extends gm<E>> paramvj, vj<E> paramvj1, Decoder<E> paramDecoder);
/*     */   
/*     */   static b a(ach ☃) {
/* 187 */     return new b(☃)
/*     */       {
/*     */         public Collection<vk> a(vj<? extends gm<?>> ☃) {
/* 190 */           return this.a.a(☃.a().a(), ☃ -> ☃.endsWith(".json"));
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*     */         public <E> DataResult<Pair<E, OptionalInt>> a(DynamicOps<JsonElement> ☃, vj<? extends gm<E>> vj1, vj<E> vj2, Decoder<E> decoder) {
/* 196 */           vk vk1 = vj2.a();
/* 197 */           vk vk2 = new vk(vk1.b(), vj1.a().a() + "/" + vk1.a() + ".json");
/*     */           
/* 199 */           try(acg ☃ = this.a.a(vk2); 
/* 200 */               Reader ☃ = new InputStreamReader(acg.b(), StandardCharsets.UTF_8)) {
/*     */             
/* 202 */             JsonParser jsonParser = new JsonParser();
/* 203 */             JsonElement jsonElement = jsonParser.parse(reader);
/* 204 */             return decoder.parse(☃, jsonElement).map(☃ -> Pair.of(☃, OptionalInt.empty()));
/* 205 */           } catch (IOException|com.google.gson.JsonIOException|com.google.gson.JsonSyntaxException exception) {
/* 206 */             return DataResult.error("Failed to parse " + vk2 + " file: " + exception.getMessage());
/*     */           } 
/*     */         }
/*     */ 
/*     */         
/*     */         public String toString() {
/* 212 */           return "ResourceAccess[" + this.a + "]";
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   public static final class a implements b {
/* 218 */     private final Map<vj<?>, JsonElement> a = Maps.newIdentityHashMap();
/* 219 */     private final Object2IntMap<vj<?>> b = (Object2IntMap<vj<?>>)new Object2IntOpenCustomHashMap(x.k());
/* 220 */     private final Map<vj<?>, Lifecycle> c = Maps.newIdentityHashMap();
/*     */     
/*     */     public <E> void a(gn.b ☃, vj<E> vj1, Encoder<E> encoder, int i, E e, Lifecycle lifecycle) {
/* 223 */       DataResult<JsonElement> dataResult = encoder.encodeStart(vi.a((DynamicOps<?>)JsonOps.INSTANCE, ☃), e);
/* 224 */       Optional<DataResult.PartialResult<JsonElement>> optional = dataResult.error();
/* 225 */       if (optional.isPresent()) {
/* 226 */         vh.a().error("Error adding element: {}", ((DataResult.PartialResult)optional.get()).message());
/*     */         return;
/*     */       } 
/* 229 */       this.a.put(vj1, dataResult.result().get());
/* 230 */       this.b.put(vj1, i);
/* 231 */       this.c.put(vj1, lifecycle);
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<vk> a(vj<? extends gm<?>> ☃) {
/* 236 */       return (Collection<vk>)this.a.keySet().stream().filter(vj1 -> vj1.a(☃)).map(vj1 -> new vk(vj1.a().b(), ☃.a().a() + "/" + vj1.a().a() + ".json")).collect(Collectors.toList());
/*     */     }
/*     */ 
/*     */     
/*     */     public <E> DataResult<Pair<E, OptionalInt>> a(DynamicOps<JsonElement> ☃, vj<? extends gm<E>> vj1, vj<E> vj2, Decoder<E> decoder) {
/* 241 */       JsonElement jsonElement = this.a.get(vj2);
/* 242 */       if (jsonElement == null) {
/* 243 */         return DataResult.error("Unknown element: " + vj2);
/*     */       }
/* 245 */       return decoder.parse(☃, jsonElement).setLifecycle(this.c.get(vj2)).map(object -> Pair.of(object, OptionalInt.of(this.b.getInt(☃))));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vh$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
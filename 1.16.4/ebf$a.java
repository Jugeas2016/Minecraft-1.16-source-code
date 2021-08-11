/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   implements JsonDeserializer<ebf>
/*     */ {
/*     */   public ebf a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 318 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*     */     
/* 320 */     List<ebb> list = b(jsonDeserializationContext, jsonObject);
/* 321 */     String str = c(jsonObject);
/*     */     
/* 323 */     Map<String, Either<elr, String>> map = b(jsonObject);
/* 324 */     boolean bool = a(jsonObject);
/*     */     
/* 326 */     ebm ebm = ebm.a;
/* 327 */     if (jsonObject.has("display")) {
/* 328 */       JsonObject jsonObject1 = afd.t(jsonObject, "display");
/* 329 */       ebm = (ebm)jsonDeserializationContext.deserialize((JsonElement)jsonObject1, ebm.class);
/*     */     } 
/*     */     
/* 332 */     List<ebj> list1 = a(jsonDeserializationContext, jsonObject);
/*     */     
/* 334 */     ebf.b b = null;
/* 335 */     if (jsonObject.has("gui_light")) {
/* 336 */       b = ebf.b.a(afd.h(jsonObject, "gui_light"));
/*     */     }
/*     */     
/* 339 */     vk vk = str.isEmpty() ? null : new vk(str);
/* 340 */     return new ebf(vk, list, map, bool, b, ebm, list1);
/*     */   }
/*     */   
/*     */   protected List<ebj> a(JsonDeserializationContext ☃, JsonObject jsonObject) {
/* 344 */     List<ebj> list = Lists.newArrayList();
/* 345 */     if (jsonObject.has("overrides")) {
/* 346 */       JsonArray jsonArray = afd.u(jsonObject, "overrides");
/* 347 */       for (JsonElement jsonElement : jsonArray) {
/* 348 */         list.add(☃.deserialize(jsonElement, ebj.class));
/*     */       }
/*     */     } 
/* 351 */     return list;
/*     */   }
/*     */   
/*     */   private Map<String, Either<elr, String>> b(JsonObject ☃) {
/* 355 */     vk vk = ekb.d;
/*     */     
/* 357 */     Map<String, Either<elr, String>> map = Maps.newHashMap();
/*     */     
/* 359 */     if (☃.has("textures")) {
/* 360 */       JsonObject jsonObject = afd.t(☃, "textures");
/* 361 */       for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject.entrySet()) {
/* 362 */         map.put(entry.getKey(), a(vk, ((JsonElement)entry.getValue()).getAsString()));
/*     */       }
/*     */     } 
/*     */     
/* 366 */     return map;
/*     */   }
/*     */   
/*     */   private static Either<elr, String> a(vk ☃, String str) {
/* 370 */     if (ebf.d(str)) {
/* 371 */       return Either.right(str.substring(1));
/*     */     }
/* 373 */     vk vk1 = vk.a(str);
/* 374 */     if (vk1 == null) {
/* 375 */       throw new JsonParseException(str + " is not valid resource location");
/*     */     }
/* 377 */     return Either.left(new elr(☃, vk1));
/*     */   }
/*     */ 
/*     */   
/*     */   private String c(JsonObject ☃) {
/* 382 */     return afd.a(☃, "parent", "");
/*     */   }
/*     */   
/*     */   protected boolean a(JsonObject ☃) {
/* 386 */     return afd.a(☃, "ambientocclusion", true);
/*     */   }
/*     */   
/*     */   protected List<ebb> b(JsonDeserializationContext ☃, JsonObject jsonObject) {
/* 390 */     List<ebb> list = Lists.newArrayList();
/*     */     
/* 392 */     if (jsonObject.has("elements")) {
/* 393 */       for (JsonElement jsonElement : afd.u(jsonObject, "elements")) {
/* 394 */         list.add(☃.deserialize(jsonElement, ebb.class));
/*     */       }
/*     */     }
/* 397 */     return list;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebf$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
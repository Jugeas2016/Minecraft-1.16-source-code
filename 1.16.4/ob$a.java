/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.lang.reflect.Type;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements JsonDeserializer<ob>, JsonSerializer<ob>
/*     */ {
/*     */   @Nullable
/*     */   public ob a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 334 */     if (☃.isJsonObject()) {
/* 335 */       JsonObject jsonObject = ☃.getAsJsonObject();
/* 336 */       if (jsonObject == null) {
/* 337 */         return null;
/*     */       }
/*     */       
/* 340 */       Boolean bool1 = a(jsonObject, "bold");
/* 341 */       Boolean bool2 = a(jsonObject, "italic");
/* 342 */       Boolean bool3 = a(jsonObject, "underlined");
/* 343 */       Boolean bool4 = a(jsonObject, "strikethrough");
/* 344 */       Boolean bool5 = a(jsonObject, "obfuscated");
/* 345 */       od od = e(jsonObject);
/* 346 */       String str = d(jsonObject);
/* 347 */       np np = c(jsonObject);
/* 348 */       nv nv = b(jsonObject);
/* 349 */       vk vk = a(jsonObject);
/*     */       
/* 351 */       return new ob(od, bool1, bool2, bool3, bool4, bool5, np, nv, str, vk, null);
/*     */     } 
/*     */     
/* 354 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static vk a(JsonObject ☃) {
/* 359 */     if (☃.has("font")) {
/* 360 */       String str = afd.h(☃, "font");
/*     */       try {
/* 362 */         return new vk(str);
/* 363 */       } catch (v v) {
/* 364 */         throw new JsonSyntaxException("Invalid font name: " + str);
/*     */       } 
/*     */     } 
/* 367 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static nv b(JsonObject ☃) {
/* 372 */     if (☃.has("hoverEvent")) {
/* 373 */       JsonObject jsonObject = afd.t(☃, "hoverEvent");
/* 374 */       nv nv = nv.a(jsonObject);
/* 375 */       if (nv != null && nv.a().a()) {
/* 376 */         return nv;
/*     */       }
/*     */     } 
/* 379 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static np c(JsonObject ☃) {
/* 384 */     if (☃.has("clickEvent")) {
/* 385 */       JsonObject jsonObject = afd.t(☃, "clickEvent");
/* 386 */       String str1 = afd.a(jsonObject, "action", (String)null);
/* 387 */       np.a a1 = (str1 == null) ? null : np.a.a(str1);
/*     */       
/* 389 */       String str2 = afd.a(jsonObject, "value", (String)null);
/*     */       
/* 391 */       if (a1 != null && str2 != null && a1.a()) {
/* 392 */         return new np(a1, str2);
/*     */       }
/*     */     } 
/* 395 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static String d(JsonObject ☃) {
/* 400 */     return afd.a(☃, "insertion", (String)null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static od e(JsonObject ☃) {
/* 405 */     if (☃.has("color")) {
/* 406 */       String str = afd.h(☃, "color");
/* 407 */       return od.a(str);
/*     */     } 
/* 409 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static Boolean a(JsonObject ☃, String str) {
/* 414 */     if (☃.has(str)) {
/* 415 */       return Boolean.valueOf(☃.get(str).getAsBoolean());
/*     */     }
/*     */     
/* 418 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public JsonElement a(ob ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 424 */     if (☃.g()) {
/* 425 */       return null;
/*     */     }
/* 427 */     JsonObject jsonObject = new JsonObject();
/*     */     
/* 429 */     if (ob.b(☃) != null) {
/* 430 */       jsonObject.addProperty("bold", ob.b(☃));
/*     */     }
/* 432 */     if (ob.c(☃) != null) {
/* 433 */       jsonObject.addProperty("italic", ob.c(☃));
/*     */     }
/* 435 */     if (ob.d(☃) != null) {
/* 436 */       jsonObject.addProperty("underlined", ob.d(☃));
/*     */     }
/* 438 */     if (ob.e(☃) != null)
/*     */     {
/* 440 */       jsonObject.addProperty("strikethrough", ob.e(☃));
/*     */     }
/* 442 */     if (ob.f(☃) != null) {
/* 443 */       jsonObject.addProperty("obfuscated", ob.f(☃));
/*     */     }
/* 445 */     if (ob.g(☃) != null) {
/* 446 */       jsonObject.addProperty("color", ob.g(☃).b());
/*     */     }
/* 448 */     if (ob.h(☃) != null) {
/* 449 */       jsonObject.add("insertion", jsonSerializationContext.serialize(ob.h(☃)));
/*     */     }
/*     */     
/* 452 */     if (ob.i(☃) != null) {
/* 453 */       JsonObject jsonObject1 = new JsonObject();
/* 454 */       jsonObject1.addProperty("action", ob.i(☃).a().b());
/* 455 */       jsonObject1.addProperty("value", ob.i(☃).b());
/* 456 */       jsonObject.add("clickEvent", (JsonElement)jsonObject1);
/*     */     } 
/*     */     
/* 459 */     if (ob.j(☃) != null) {
/* 460 */       jsonObject.add("hoverEvent", (JsonElement)ob.j(☃).b());
/*     */     }
/*     */     
/* 463 */     if (ob.k(☃) != null) {
/* 464 */       jsonObject.addProperty("font", ob.k(☃).toString());
/*     */     }
/*     */     
/* 467 */     return (JsonElement)jsonObject;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ob$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
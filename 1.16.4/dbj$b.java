/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class b
/*     */   implements cze<dbj>
/*     */ {
/*     */   public void a(JsonObject ☃, dbj dbj1, JsonSerializationContext jsonSerializationContext) {
/*  95 */     JsonObject jsonObject = new JsonObject();
/*  96 */     for (Map.Entry<String, czd> entry : (Iterable<Map.Entry<String, czd>>)dbj.a(dbj1).entrySet()) {
/*  97 */       jsonObject.add(entry.getKey(), jsonSerializationContext.serialize(entry.getValue()));
/*     */     }
/*  99 */     ☃.add("scores", (JsonElement)jsonObject);
/* 100 */     ☃.add("entity", jsonSerializationContext.serialize(dbj.b(dbj1)));
/*     */   }
/*     */ 
/*     */   
/*     */   public dbj b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 105 */     Set<Map.Entry<String, JsonElement>> set = afd.t(☃, "scores").entrySet();
/* 106 */     Map<String, czd> map = Maps.newLinkedHashMap();
/* 107 */     for (Map.Entry<String, JsonElement> entry : set) {
/* 108 */       map.put(entry.getKey(), afd.a(entry.getValue(), "score", jsonDeserializationContext, czd.class));
/*     */     }
/* 110 */     return new dbj(map, afd.<cyv.c>a(☃, "entity", jsonDeserializationContext, cyv.c.class), null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbj$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
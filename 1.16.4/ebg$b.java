/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Map;
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
/*     */ public class b
/*     */   implements JsonDeserializer<ebg>
/*     */ {
/*     */   public ebg a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 136 */     JsonObject jsonObject = ☃.getAsJsonObject();
/*     */     
/* 138 */     Map<String, ebn> map = a(jsonDeserializationContext, jsonObject);
/* 139 */     ebs ebs = b(jsonDeserializationContext, jsonObject);
/*     */     
/* 141 */     if (map.isEmpty() && (ebs == null || ebs.b().isEmpty())) {
/* 142 */       throw new JsonParseException("Neither 'variants' nor 'multipart' found");
/*     */     }
/*     */     
/* 145 */     return new ebg(map, ebs);
/*     */   }
/*     */   
/*     */   protected Map<String, ebn> a(JsonDeserializationContext ☃, JsonObject jsonObject) {
/* 149 */     Map<String, ebn> map = Maps.newHashMap();
/*     */     
/* 151 */     if (jsonObject.has("variants")) {
/* 152 */       JsonObject jsonObject1 = afd.t(jsonObject, "variants");
/* 153 */       for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject1.entrySet()) {
/* 154 */         map.put(entry.getKey(), ☃.deserialize(entry.getValue(), ebn.class));
/*     */       }
/*     */     } 
/*     */     
/* 158 */     return map;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected ebs b(JsonDeserializationContext ☃, JsonObject jsonObject) {
/* 163 */     if (!jsonObject.has("multipart")) {
/* 164 */       return null;
/*     */     }
/*     */     
/* 167 */     JsonArray jsonArray = afd.u(jsonObject, "multipart");
/* 168 */     return (ebs)☃.deserialize((JsonElement)jsonArray, ebs.class);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebg$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements JsonDeserializer<cyy>, JsonSerializer<cyy>
/*     */ {
/*     */   public cyy a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 212 */     JsonObject jsonObject = afd.m(☃, "loot table");
/* 213 */     cyx[] arrayOfCyx = afd.<cyx[]>a(jsonObject, "pools", new cyx[0], jsonDeserializationContext, (Class)cyx[].class);
/*     */     
/* 215 */     dba dba = null;
/*     */     
/* 217 */     if (jsonObject.has("type")) {
/* 218 */       String str = afd.h(jsonObject, "type");
/* 219 */       dba = dbb.a(new vk(str));
/*     */     } 
/*     */     
/* 222 */     daj[] arrayOfDaj = afd.<daj[]>a(jsonObject, "functions", new daj[0], jsonDeserializationContext, (Class)daj[].class);
/* 223 */     return new cyy((dba != null) ? dba : dbb.k, arrayOfCyx, arrayOfDaj, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonElement a(cyy ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 228 */     JsonObject jsonObject = new JsonObject();
/* 229 */     if (cyy.a(☃) != cyy.b) {
/* 230 */       vk vk = dbb.a(cyy.a(☃));
/* 231 */       if (vk != null) {
/* 232 */         jsonObject.addProperty("type", vk.toString());
/*     */       } else {
/* 234 */         cyy.c().warn("Failed to find id for param set " + cyy.a(☃));
/*     */       } 
/*     */     } 
/*     */     
/* 238 */     if ((cyy.b(☃)).length > 0) {
/* 239 */       jsonObject.add("pools", jsonSerializationContext.serialize(cyy.b(☃)));
/*     */     }
/*     */     
/* 242 */     if (!ArrayUtils.isEmpty((Object[])cyy.c(☃))) {
/* 243 */       jsonObject.add("functions", jsonSerializationContext.serialize(cyy.c(☃)));
/*     */     }
/*     */     
/* 246 */     return (JsonElement)jsonObject;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyy$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
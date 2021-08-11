/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class e
/*     */   extends dai.c<czx>
/*     */ {
/*     */   public void a(JsonObject ☃, czx czx1, JsonSerializationContext jsonSerializationContext) {
/* 195 */     super.a(☃, czx1, jsonSerializationContext);
/*     */     
/* 197 */     ☃.addProperty("enchantment", gm.R.b(czx.a(czx1)).toString());
/* 198 */     ☃.addProperty("formula", czx.b(czx1).a().toString());
/*     */     
/* 200 */     JsonObject jsonObject = new JsonObject();
/* 201 */     czx.b(czx1).a(jsonObject, jsonSerializationContext);
/* 202 */     if (jsonObject.size() > 0) {
/* 203 */       ☃.add("parameters", (JsonElement)jsonObject);
/*     */     }
/*     */   }
/*     */   
/*     */   public czx a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/*     */     czx.b b;
/* 209 */     vk vk1 = new vk(afd.h(☃, "enchantment"));
/* 210 */     bps bps = (bps)gm.R.b(vk1).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + ☃));
/* 211 */     vk vk2 = new vk(afd.h(☃, "formula"));
/* 212 */     czx.c c1 = (czx.c)czx.c().get(vk2);
/* 213 */     if (c1 == null) {
/* 214 */       throw new JsonParseException("Invalid formula id: " + vk2);
/*     */     }
/*     */ 
/*     */     
/* 218 */     if (☃.has("parameters")) {
/* 219 */       b = c1.deserialize(afd.t(☃, "parameters"), jsonDeserializationContext);
/*     */     } else {
/* 221 */       b = c1.deserialize(new JsonObject(), jsonDeserializationContext);
/*     */     } 
/*     */     
/* 224 */     return new czx(arrayOfDbo, bps, b, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czx$e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
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
/*     */ 
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
/*     */   extends dai.c<czz>
/*     */ {
/*     */   public void a(JsonObject ☃, czz czz1, JsonSerializationContext jsonSerializationContext) {
/* 105 */     super.a(☃, czz1, jsonSerializationContext);
/* 106 */     ☃.addProperty("block", gm.Q.b(czz.a(czz1)).toString());
/* 107 */     JsonArray jsonArray = new JsonArray();
/* 108 */     czz.b(czz1).forEach(cfj1 -> ☃.add(cfj1.f()));
/* 109 */     ☃.add("properties", (JsonElement)jsonArray);
/*     */   }
/*     */ 
/*     */   
/*     */   public czz a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 114 */     vk vk = new vk(afd.h(☃, "block"));
/*     */     
/* 116 */     buo buo = (buo)gm.Q.b(vk).orElseThrow(() -> new IllegalArgumentException("Can't find block " + ☃));
/* 117 */     cei<buo, ceh> cei = buo.m();
/* 118 */     Set<cfj<?>> set = Sets.newHashSet();
/*     */     
/* 120 */     JsonArray jsonArray = afd.a(☃, "properties", (JsonArray)null);
/* 121 */     if (jsonArray != null) {
/* 122 */       jsonArray.forEach(jsonElement -> ☃.add(cei1.a(afd.a(jsonElement, "property"))));
/*     */     }
/* 124 */     return new czz(arrayOfDbo, buo, set, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czz$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
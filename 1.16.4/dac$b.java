/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends dai.c<dac>
/*     */ {
/*     */   public void a(JsonObject ☃, dac dac1, JsonSerializationContext jsonSerializationContext) {
/* 114 */     super.a(☃, dac1, jsonSerializationContext);
/*     */     
/* 116 */     if (!dac.a(dac1).isEmpty()) {
/* 117 */       JsonArray jsonArray = new JsonArray();
/* 118 */       for (bps bps : dac.a(dac1)) {
/* 119 */         vk vk = gm.R.b(bps);
/* 120 */         if (vk == null) {
/* 121 */           throw new IllegalArgumentException("Don't know how to serialize enchantment " + bps);
/*     */         }
/* 123 */         jsonArray.add((JsonElement)new JsonPrimitive(vk.toString()));
/*     */       } 
/* 125 */       ☃.add("enchantments", (JsonElement)jsonArray);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public dac a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 131 */     List<bps> list = Lists.newArrayList();
/* 132 */     if (☃.has("enchantments")) {
/* 133 */       JsonArray jsonArray = afd.u(☃, "enchantments");
/* 134 */       for (JsonElement jsonElement : jsonArray) {
/* 135 */         String str = afd.a(jsonElement, "enchantment");
/*     */         
/* 137 */         bps bps = (bps)gm.R.b(new vk(str)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + ☃ + "'"));
/* 138 */         list.add(bps);
/*     */       } 
/*     */     } 
/* 141 */     return new dac(arrayOfDbo, list, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dac$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
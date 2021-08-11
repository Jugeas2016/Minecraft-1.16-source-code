/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class d
/*     */   extends dai.c<dan>
/*     */ {
/*     */   public void a(JsonObject ☃, dan dan1, JsonSerializationContext jsonSerializationContext) {
/* 120 */     super.a(☃, dan1, jsonSerializationContext);
/*     */     
/* 122 */     JsonArray jsonArray = new JsonArray();
/* 123 */     for (dan.b b : dan.a(dan1)) {
/* 124 */       jsonArray.add((JsonElement)b.a(jsonSerializationContext));
/*     */     }
/* 126 */     ☃.add("modifiers", (JsonElement)jsonArray);
/*     */   }
/*     */ 
/*     */   
/*     */   public dan a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 131 */     JsonArray jsonArray = afd.u(☃, "modifiers");
/* 132 */     List<dan.b> list = Lists.newArrayListWithExpectedSize(jsonArray.size());
/*     */     
/* 134 */     for (JsonElement jsonElement : jsonArray) {
/* 135 */       list.add(dan.b.a(afd.m(jsonElement, "modifier"), jsonDeserializationContext));
/*     */     }
/*     */     
/* 138 */     if (list.isEmpty()) {
/* 139 */       throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
/*     */     }
/* 141 */     return new dan(arrayOfDbo, list, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dan$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonObject;
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
/*     */ public class b
/*     */   extends dai.c<dam>
/*     */ {
/*     */   public void a(JsonObject ☃, dam dam1, JsonSerializationContext jsonSerializationContext) {
/*  96 */     super.a(☃, dam1, jsonSerializationContext);
/*     */     
/*  98 */     ☃.add("count", jsonSerializationContext.serialize(dam.a(dam1)));
/*  99 */     if (dam.b(dam1)) {
/* 100 */       ☃.add("limit", jsonSerializationContext.serialize(Integer.valueOf(dam.c(dam1))));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public dam a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 106 */     int i = afd.a(☃, "limit", 0);
/* 107 */     return new dam(arrayOfDbo, afd.<czd>a(☃, "count", jsonDeserializationContext, czd.class), i, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dam$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
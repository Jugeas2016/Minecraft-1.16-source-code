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
/*     */ public class a
/*     */   extends dai.c<dat>
/*     */ {
/*     */   public void a(JsonObject ☃, dat dat1, JsonSerializationContext jsonSerializationContext) {
/*  88 */     super.a(☃, dat1, jsonSerializationContext);
/*     */     
/*  90 */     if (dat.a(dat1) != null) {
/*  91 */       ☃.add("name", nr.a.b(dat.a(dat1)));
/*     */     }
/*     */     
/*  94 */     if (dat.b(dat1) != null) {
/*  95 */       ☃.add("entity", jsonSerializationContext.serialize(dat.b(dat1)));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public dat a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 101 */     nr nr = nr.a.a(☃.get("name"));
/* 102 */     cyv.c c1 = afd.<cyv.c>a(☃, "entity", null, jsonDeserializationContext, cyv.c.class);
/* 103 */     return new dat(arrayOfDbo, nr, c1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dat$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
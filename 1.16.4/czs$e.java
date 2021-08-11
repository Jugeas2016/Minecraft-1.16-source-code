/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
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
/*     */ public abstract class e<T extends czs>
/*     */   extends czq.b<T>
/*     */ {
/*     */   public void a(JsonObject ☃, T t, JsonSerializationContext jsonSerializationContext) {
/* 132 */     if (((czs)t).c != 1) {
/* 133 */       ☃.addProperty("weight", Integer.valueOf(((czs)t).c));
/*     */     }
/*     */     
/* 136 */     if (((czs)t).e != 0) {
/* 137 */       ☃.addProperty("quality", Integer.valueOf(((czs)t).e));
/*     */     }
/*     */     
/* 140 */     if (!ArrayUtils.isEmpty((Object[])((czs)t).f)) {
/* 141 */       ☃.add("functions", jsonSerializationContext.serialize(((czs)t).f));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final T a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 147 */     int i = afd.a(☃, "weight", 1);
/* 148 */     int j = afd.a(☃, "quality", 0);
/* 149 */     daj[] arrayOfDaj = afd.<daj[]>a(☃, "functions", new daj[0], jsonDeserializationContext, (Class)daj[].class);
/*     */     
/* 151 */     return b(☃, jsonDeserializationContext, i, j, arrayOfDbo, arrayOfDaj);
/*     */   }
/*     */   
/*     */   protected abstract T b(JsonObject paramJsonObject, JsonDeserializationContext paramJsonDeserializationContext, int paramInt1, int paramInt2, dbo[] paramArrayOfdbo, daj[] paramArrayOfdaj);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czs$e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
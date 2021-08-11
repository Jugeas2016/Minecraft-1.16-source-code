/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class b<T extends czq>
/*    */   implements cze<T>
/*    */ {
/*    */   public final void b(JsonObject ☃, T t, JsonSerializationContext jsonSerializationContext) {
/* 77 */     if (!ArrayUtils.isEmpty((Object[])((czq)t).d)) {
/* 78 */       ☃.add("conditions", jsonSerializationContext.serialize(((czq)t).d));
/*    */     }
/* 80 */     a(☃, t, jsonSerializationContext);
/*    */   }
/*    */ 
/*    */   
/*    */   public final T b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 85 */     dbo[] arrayOfDbo = afd.<dbo[]>a(☃, "conditions", new dbo[0], jsonDeserializationContext, (Class)dbo[].class);
/* 86 */     return b(☃, jsonDeserializationContext, arrayOfDbo);
/*    */   }
/*    */   
/*    */   public abstract void a(JsonObject paramJsonObject, T paramT, JsonSerializationContext paramJsonSerializationContext);
/*    */   
/*    */   public abstract T b(JsonObject paramJsonObject, JsonDeserializationContext paramJsonDeserializationContext, dbo[] paramArrayOfdbo);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czq$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
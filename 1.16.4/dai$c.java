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
/*    */ public abstract class c<T extends dai>
/*    */   implements cze<T>
/*    */ {
/*    */   public void a(JsonObject ☃, T t, JsonSerializationContext jsonSerializationContext) {
/* 91 */     if (!ArrayUtils.isEmpty((Object[])((dai)t).c)) {
/* 92 */       ☃.add("conditions", jsonSerializationContext.serialize(((dai)t).c));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public final T b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 98 */     dbo[] arrayOfDbo = afd.<dbo[]>a(☃, "conditions", new dbo[0], jsonDeserializationContext, (Class)dbo[].class);
/* 99 */     return b(☃, jsonDeserializationContext, arrayOfDbo);
/*    */   }
/*    */   
/*    */   public abstract T b(JsonObject paramJsonObject, JsonDeserializationContext paramJsonDeserializationContext, dbo[] paramArrayOfdbo);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dai$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
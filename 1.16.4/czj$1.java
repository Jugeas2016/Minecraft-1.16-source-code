/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
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
/*    */ final class null
/*    */   extends czq.b<T>
/*    */ {
/*    */   null(czj.a parama) {}
/*    */   
/*    */   public void a(JsonObject ☃, T t, JsonSerializationContext jsonSerializationContext) {
/* 56 */     ☃.add("children", jsonSerializationContext.serialize(((czj)t).c));
/*    */   }
/*    */ 
/*    */   
/*    */   public final T a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 61 */     czq[] arrayOfCzq = afd.<czq[]>a(☃, "children", jsonDeserializationContext, (Class)czq[].class);
/* 62 */     return (T)this.a.create(arrayOfCzq, arrayOfDbo);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czj$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
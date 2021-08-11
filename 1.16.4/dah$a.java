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
/*    */ public class a
/*    */   extends dai.c<dah>
/*    */ {
/*    */   public void a(JsonObject ☃, dah dah1, JsonSerializationContext jsonSerializationContext) {
/* 39 */     super.a(☃, dah1, jsonSerializationContext);
/*    */     
/* 41 */     ☃.add("limit", jsonSerializationContext.serialize(dah.a(dah1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public dah a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 46 */     cyu cyu = afd.<cyu>a(☃, "limit", jsonDeserializationContext, cyu.class);
/* 47 */     return new dah(arrayOfDbo, cyu, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dah$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ public class a
/*    */   extends dai.c<dar>
/*    */ {
/*    */   public void a(JsonObject ☃, dar dar1, JsonSerializationContext jsonSerializationContext) {
/* 48 */     super.a(☃, dar1, jsonSerializationContext);
/*    */     
/* 50 */     ☃.add("damage", jsonSerializationContext.serialize(dar.a(dar1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public dar a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 55 */     return new dar(arrayOfDbo, afd.<czd>a(☃, "damage", jsonDeserializationContext, czd.class), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dar$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
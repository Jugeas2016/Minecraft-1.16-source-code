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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends dai.c<daf>
/*    */ {
/*    */   public void a(JsonObject ☃, daf daf1, JsonSerializationContext jsonSerializationContext) {
/* 59 */     super.a(☃, daf1, jsonSerializationContext);
/* 60 */     ☃.add("entity", jsonSerializationContext.serialize(daf.a(daf1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public daf a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 65 */     cyv.c c1 = afd.<cyv.c>a(☃, "entity", jsonDeserializationContext, cyv.c.class);
/* 66 */     return new daf(arrayOfDbo, c1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\daf$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
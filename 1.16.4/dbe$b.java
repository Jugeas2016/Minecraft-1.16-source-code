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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class b
/*    */   implements cze<dbe>
/*    */ {
/*    */   public void a(JsonObject ☃, dbe dbe1, JsonSerializationContext jsonSerializationContext) {
/* 71 */     ☃.add("terms", jsonSerializationContext.serialize(dbe.a(dbe1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public dbe b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 76 */     dbo[] arrayOfDbo = afd.<dbo[]>a(☃, "terms", jsonDeserializationContext, (Class)dbo[].class);
/* 77 */     return new dbe(arrayOfDbo, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbe$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
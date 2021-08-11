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
/*    */ public class a
/*    */   implements cze<dbl>
/*    */ {
/*    */   public void a(JsonObject ☃, dbl dbl1, JsonSerializationContext jsonSerializationContext) {
/* 49 */     ☃.add("term", jsonSerializationContext.serialize(dbl.a(dbl1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public dbl b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 54 */     dbo dbo = afd.<dbo>a(☃, "term", jsonDeserializationContext, dbo.class);
/* 55 */     return new dbl(dbo, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbl$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ public class a
/*    */   implements cze<dbr>
/*    */ {
/*    */   public void a(JsonObject ☃, dbr dbr1, JsonSerializationContext jsonSerializationContext) {
/* 58 */     ☃.add("predicate", dbr.a(dbr1).a());
/* 59 */     ☃.add("entity", jsonSerializationContext.serialize(dbr.b(dbr1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public dbr b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 64 */     bg bg = bg.a(☃.get("predicate"));
/* 65 */     return new dbr(bg, afd.<cyv.c>a(☃, "entity", jsonDeserializationContext, cyv.c.class), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbr$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */   implements cze<dbw>
/*    */ {
/*    */   public void a(JsonObject ☃, dbw dbw1, JsonSerializationContext jsonSerializationContext) {
/* 71 */     ☃.addProperty("period", dbw.a(dbw1));
/* 72 */     ☃.add("value", jsonSerializationContext.serialize(dbw.b(dbw1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public dbw b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 77 */     Long long_ = ☃.has("period") ? Long.valueOf(afd.m(☃, "period")) : null;
/* 78 */     czd czd = afd.<czd>a(☃, "value", jsonDeserializationContext, czd.class);
/* 79 */     return new dbw(long_, czd, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbw$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
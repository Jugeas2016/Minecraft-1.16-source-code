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
/*    */ public class a
/*    */   implements cze<dbu>
/*    */ {
/*    */   public void a(JsonObject ☃, dbu dbu1, JsonSerializationContext jsonSerializationContext) {
/* 54 */     ☃.addProperty("chance", Float.valueOf(dbu.a(dbu1)));
/* 55 */     ☃.addProperty("looting_multiplier", Float.valueOf(dbu.b(dbu1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public dbu b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 60 */     return new dbu(afd.l(☃, "chance"), afd.l(☃, "looting_multiplier"), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
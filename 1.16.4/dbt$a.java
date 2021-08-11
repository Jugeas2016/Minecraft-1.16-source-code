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
/*    */ public class a
/*    */   implements cze<dbt>
/*    */ {
/*    */   public void a(JsonObject ☃, dbt dbt1, JsonSerializationContext jsonSerializationContext) {
/* 33 */     ☃.addProperty("chance", Float.valueOf(dbt.a(dbt1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public dbt b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 38 */     return new dbt(afd.l(☃, "chance"), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbt$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
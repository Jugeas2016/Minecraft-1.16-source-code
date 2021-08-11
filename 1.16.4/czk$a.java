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
/*    */ public class a
/*    */   extends czs.e<czk>
/*    */ {
/*    */   public void a(JsonObject ☃, czk czk1, JsonSerializationContext jsonSerializationContext) {
/* 40 */     super.a(☃, czk1, jsonSerializationContext);
/* 41 */     ☃.addProperty("name", czk.a(czk1).toString());
/*    */   }
/*    */ 
/*    */   
/*    */   protected czk a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 46 */     vk vk = new vk(afd.h(☃, "name"));
/* 47 */     return new czk(vk, i, j, arrayOfDbo, arrayOfDaj, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czk$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
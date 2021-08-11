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
/*    */ public class a
/*    */   extends czs.e<czt>
/*    */ {
/*    */   public void a(JsonObject ☃, czt czt1, JsonSerializationContext jsonSerializationContext) {
/* 60 */     super.a(☃, czt1, jsonSerializationContext);
/* 61 */     ☃.addProperty("name", czt.a(czt1).toString());
/*    */   }
/*    */ 
/*    */   
/*    */   protected czt a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 66 */     vk vk = new vk(afd.h(☃, "name"));
/* 67 */     return new czt(vk, i, j, arrayOfDbo, arrayOfDaj, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czt$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
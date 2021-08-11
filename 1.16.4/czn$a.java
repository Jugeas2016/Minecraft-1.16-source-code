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
/*    */ public class a
/*    */   extends czs.e<czn>
/*    */ {
/*    */   public void a(JsonObject ☃, czn czn1, JsonSerializationContext jsonSerializationContext) {
/* 43 */     super.a(☃, czn1, jsonSerializationContext);
/*    */     
/* 45 */     vk vk = gm.T.b(czn.a(czn1));
/* 46 */     if (vk == null) {
/* 47 */       throw new IllegalArgumentException("Can't serialize unknown item " + czn.a(czn1));
/*    */     }
/*    */     
/* 50 */     ☃.addProperty("name", vk.toString());
/*    */   }
/*    */ 
/*    */   
/*    */   protected czn a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 55 */     blx blx = afd.i(☃, "name");
/* 56 */     return new czn(blx, i, j, arrayOfDbo, arrayOfDaj, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
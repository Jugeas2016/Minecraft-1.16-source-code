/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
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
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends czs.e<czv>
/*    */ {
/*    */   public void a(JsonObject ☃, czv czv1, JsonSerializationContext jsonSerializationContext) {
/* 74 */     super.a(☃, czv1, jsonSerializationContext);
/*    */     
/* 76 */     ☃.addProperty("name", aeh.a().b().b(czv.a(czv1)).toString());
/* 77 */     ☃.addProperty("expand", Boolean.valueOf(czv.b(czv1)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected czv a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 82 */     vk vk = new vk(afd.h(☃, "name"));
/*    */     
/* 84 */     ael<blx> ael = aeh.a().b().a(vk);
/* 85 */     if (ael == null) {
/* 86 */       throw new JsonParseException("Can't find tag: " + vk);
/*    */     }
/*    */     
/* 89 */     boolean bool = afd.j(☃, "expand");
/*    */     
/* 91 */     return new czv(ael, bool, i, j, arrayOfDbo, arrayOfDaj, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czv$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
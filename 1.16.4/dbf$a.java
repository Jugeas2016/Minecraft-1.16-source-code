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
/*    */ public class a
/*    */   implements cze<dbf>
/*    */ {
/*    */   public void a(JsonObject ☃, dbf dbf1, JsonSerializationContext jsonSerializationContext) {
/* 56 */     ☃.addProperty("enchantment", gm.R.b(dbf.a(dbf1)).toString());
/* 57 */     ☃.add("chances", jsonSerializationContext.serialize(dbf.b(dbf1)));
/*    */   }
/*    */ 
/*    */   
/*    */   public dbf b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 62 */     vk vk = new vk(afd.h(☃, "enchantment"));
/*    */     
/* 64 */     bps bps = (bps)gm.R.b(vk).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + ☃));
/* 65 */     float[] arrayOfFloat = afd.<float[]>a(☃, "chances", jsonDeserializationContext, (Class)float[].class);
/* 66 */     return new dbf(bps, arrayOfFloat, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbf$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
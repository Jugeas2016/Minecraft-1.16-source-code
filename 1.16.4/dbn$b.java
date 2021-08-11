/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */   implements cze<dbn>
/*    */ {
/*    */   public void a(JsonObject ☃, dbn dbn1, JsonSerializationContext jsonSerializationContext) {
/* 71 */     ☃.addProperty("block", gm.Q.b(dbn.a(dbn1)).toString());
/* 72 */     ☃.add("properties", dbn.b(dbn1).a());
/*    */   }
/*    */ 
/*    */   
/*    */   public dbn b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 77 */     vk vk = new vk(afd.h(☃, "block"));
/*    */     
/* 79 */     buo buo = (buo)gm.Q.b(vk).orElseThrow(() -> new IllegalArgumentException("Can't find block " + ☃));
/* 80 */     cm cm = cm.a(☃.get("properties"));
/* 81 */     cm.a(buo.m(), str -> {
/*    */           throw new JsonSyntaxException("Block " + ☃ + " has no property " + str);
/*    */         });
/*    */     
/* 85 */     return new dbn(buo, cm, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbn$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends dai.c<dap>
/*    */ {
/*    */   public void a(JsonObject ☃, dap dap1, JsonSerializationContext jsonSerializationContext) {
/* 75 */     super.a(☃, dap1, jsonSerializationContext);
/*    */     
/* 77 */     ☃.addProperty("name", dap.a(dap1).toString());
/* 78 */     if (dap.b(dap1) != 0L) {
/* 79 */       ☃.addProperty("seed", Long.valueOf(dap.b(dap1)));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public dap a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 85 */     vk vk = new vk(afd.h(☃, "name"));
/* 86 */     long l = afd.a(☃, "seed", 0L);
/* 87 */     return new dap(arrayOfDbo, vk, l, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dap$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
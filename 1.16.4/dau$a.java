/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */   extends dai.c<dau>
/*    */ {
/*    */   public void a(JsonObject ☃, dau dau1, JsonSerializationContext jsonSerializationContext) {
/* 41 */     super.a(☃, dau1, jsonSerializationContext);
/*    */     
/* 43 */     ☃.addProperty("tag", dau.a(dau1).toString());
/*    */   }
/*    */ 
/*    */   
/*    */   public dau a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/*    */     try {
/* 49 */       md md = mu.a(afd.h(☃, "tag"));
/* 50 */       return new dau(arrayOfDbo, md, null);
/* 51 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 52 */       throw new JsonSyntaxException(commandSyntaxException.getMessage());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dau$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
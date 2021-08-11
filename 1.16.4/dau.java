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
/*    */ public class dau
/*    */   extends dai
/*    */ {
/*    */   private final md a;
/*    */   
/*    */   private dau(dbo[] ☃, md md1) {
/* 19 */     super(☃);
/* 20 */     this.a = md1;
/*    */   }
/*    */ 
/*    */   
/*    */   public dak b() {
/* 25 */     return dal.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bmb ☃, cyv cyv1) {
/* 30 */     ☃.p().a(this.a);
/* 31 */     return ☃;
/*    */   }
/*    */   
/*    */   public static dai.a<?> a(md ☃) {
/* 35 */     return a(arrayOfDbo -> new dau(arrayOfDbo, ☃));
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends dai.c<dau> {
/*    */     public void a(JsonObject ☃, dau dau1, JsonSerializationContext jsonSerializationContext) {
/* 41 */       super.a(☃, dau1, jsonSerializationContext);
/*    */       
/* 43 */       ☃.addProperty("tag", dau.a(dau1).toString());
/*    */     }
/*    */ 
/*    */     
/*    */     public dau a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/*    */       try {
/* 49 */         md md = mu.a(afd.h(☃, "tag"));
/* 50 */         return new dau(arrayOfDbo, md);
/* 51 */       } catch (CommandSyntaxException commandSyntaxException) {
/* 52 */         throw new JsonSyntaxException(commandSyntaxException.getMessage());
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dau.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
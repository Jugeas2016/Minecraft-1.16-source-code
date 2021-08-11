/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.function.Consumer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class czk
/*    */   extends czs
/*    */ {
/*    */   private final vk g;
/*    */   
/*    */   private czk(vk ☃, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 19 */     super(i, j, arrayOfDbo, arrayOfDaj);
/* 20 */     this.g = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public czr a() {
/* 25 */     return czo.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Consumer<bmb> ☃, cyv cyv1) {
/* 30 */     cyv1.a(this.g, ☃);
/*    */   }
/*    */   
/*    */   public static czs.a<?> a(vk ☃) {
/* 34 */     return a((i, j, arrayOfDbo, arrayOfDaj) -> new czk(☃, i, j, arrayOfDbo, arrayOfDaj));
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends czs.e<czk> {
/*    */     public void a(JsonObject ☃, czk czk1, JsonSerializationContext jsonSerializationContext) {
/* 40 */       super.a(☃, czk1, jsonSerializationContext);
/* 41 */       ☃.addProperty("name", czk.a(czk1).toString());
/*    */     }
/*    */ 
/*    */     
/*    */     protected czk a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 46 */       vk vk = new vk(afd.h(☃, "name"));
/* 47 */       return new czk(vk, i, j, arrayOfDbo, arrayOfDaj);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class czn
/*    */   extends czs
/*    */ {
/*    */   private final blx g;
/*    */   
/*    */   private czn(blx ☃, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 22 */     super(i, j, arrayOfDbo, arrayOfDaj);
/* 23 */     this.g = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public czr a() {
/* 28 */     return czo.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Consumer<bmb> ☃, cyv cyv1) {
/* 33 */     ☃.accept(new bmb(this.g));
/*    */   }
/*    */   
/*    */   public static czs.a<?> a(brw ☃) {
/* 37 */     return a((i, j, arrayOfDbo, arrayOfDaj) -> new czn(☃.h(), i, j, arrayOfDbo, arrayOfDaj));
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends czs.e<czn> {
/*    */     public void a(JsonObject ☃, czn czn1, JsonSerializationContext jsonSerializationContext) {
/* 43 */       super.a(☃, czn1, jsonSerializationContext);
/*    */       
/* 45 */       vk vk = gm.T.b(czn.a(czn1));
/* 46 */       if (vk == null) {
/* 47 */         throw new IllegalArgumentException("Can't serialize unknown item " + czn.a(czn1));
/*    */       }
/*    */       
/* 50 */       ☃.addProperty("name", vk.toString());
/*    */     }
/*    */ 
/*    */     
/*    */     protected czn a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 55 */       blx blx = afd.i(☃, "name");
/* 56 */       return new czn(blx, i, j, arrayOfDbo, arrayOfDaj);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
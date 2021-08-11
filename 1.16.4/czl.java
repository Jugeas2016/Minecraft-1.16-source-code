/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.function.Consumer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class czl
/*    */   extends czs
/*    */ {
/*    */   private czl(int ☃, int i, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 14 */     super(☃, i, arrayOfDbo, arrayOfDaj);
/*    */   }
/*    */ 
/*    */   
/*    */   public czr a() {
/* 19 */     return czo.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Consumer<bmb> ☃, cyv cyv1) {}
/*    */ 
/*    */   
/*    */   public static czs.a<?> b() {
/* 27 */     return a(czl::new);
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends czs.e<czl> {
/*    */     public czl a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 33 */       return new czl(i, j, arrayOfDbo, arrayOfDaj);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
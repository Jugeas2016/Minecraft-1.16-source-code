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
/*    */ public class czt
/*    */   extends czs
/*    */ {
/*    */   private final vk g;
/*    */   
/*    */   private czt(vk ☃, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 21 */     super(i, j, arrayOfDbo, arrayOfDaj);
/* 22 */     this.g = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public czr a() {
/* 27 */     return czo.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Consumer<bmb> ☃, cyv cyv1) {
/* 32 */     cyy cyy = cyv1.a(this.g);
/* 33 */     cyy.a(cyv1, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(czg ☃) {
/* 38 */     if (☃.a(this.g)) {
/* 39 */       ☃.a("Table " + this.g + " is recursively called");
/*    */       
/*    */       return;
/*    */     } 
/* 43 */     super.a(☃);
/*    */     
/* 45 */     cyy cyy = ☃.c(this.g);
/* 46 */     if (cyy == null) {
/* 47 */       ☃.a("Unknown loot table called " + this.g);
/*    */     } else {
/* 49 */       cyy.a(☃.a("->{" + this.g + "}", this.g));
/*    */     } 
/*    */   }
/*    */   
/*    */   public static czs.a<?> a(vk ☃) {
/* 54 */     return a((i, j, arrayOfDbo, arrayOfDaj) -> new czt(☃, i, j, arrayOfDbo, arrayOfDaj));
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends czs.e<czt> {
/*    */     public void a(JsonObject ☃, czt czt1, JsonSerializationContext jsonSerializationContext) {
/* 60 */       super.a(☃, czt1, jsonSerializationContext);
/* 61 */       ☃.addProperty("name", czt.a(czt1).toString());
/*    */     }
/*    */ 
/*    */     
/*    */     protected czt a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 66 */       vk vk = new vk(afd.h(☃, "name"));
/* 67 */       return new czt(vk, i, j, arrayOfDbo, arrayOfDaj);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
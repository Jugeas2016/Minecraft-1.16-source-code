/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class al
/*    */   implements ag
/*    */ {
/*    */   private final vk a;
/*    */   private final bg.b b;
/*    */   
/*    */   public al(vk ☃, bg.b b1) {
/* 12 */     this.a = ☃;
/* 13 */     this.b = b1;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a() {
/* 18 */     return this.a;
/*    */   }
/*    */   
/*    */   protected bg.b b() {
/* 22 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 27 */     JsonObject jsonObject = new JsonObject();
/* 28 */     jsonObject.add("player", this.b.a(☃));
/* 29 */     return jsonObject;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 34 */     return "AbstractCriterionInstance{criterion=" + this.a + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
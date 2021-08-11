/*    */ import com.google.gson.JsonObject;
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
/*    */   extends al
/*    */ {
/*    */   private final bg.b a;
/*    */   private final bq b;
/*    */   
/*    */   public a(bg.b ☃, bg.b b1, bq bq1) {
/* 35 */     super(cr.b(), ☃);
/* 36 */     this.a = b1;
/* 37 */     this.b = bq1;
/*    */   }
/*    */   
/*    */   public static a c() {
/* 41 */     return new a(bg.b.a, bg.b.a, bq.a);
/*    */   }
/*    */   
/*    */   public boolean a(cyv ☃, bmb bmb1) {
/* 45 */     if (!this.a.a(☃)) {
/* 46 */       return false;
/*    */     }
/* 48 */     if (!this.b.a(bmb1)) {
/* 49 */       return false;
/*    */     }
/* 51 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 56 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 58 */     jsonObject.add("item", this.b.a());
/* 59 */     jsonObject.add("villager", this.a.a(☃));
/*    */     
/* 61 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cr$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
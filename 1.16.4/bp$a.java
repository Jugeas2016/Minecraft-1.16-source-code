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
/*    */   private final bq a;
/*    */   private final bg.b b;
/*    */   
/*    */   public a(bg.b ☃, bq bq1, bg.b b1) {
/* 35 */     super(bp.b(), ☃);
/* 36 */     this.a = bq1;
/* 37 */     this.b = b1;
/*    */   }
/*    */   
/*    */   public static a a(bg.b ☃, bq.a a1, bg.b b1) {
/* 41 */     return new a(☃, a1.b(), b1);
/*    */   }
/*    */   
/*    */   public boolean a(aah ☃, bmb bmb1, cyv cyv1) {
/* 45 */     if (!this.a.a(bmb1)) {
/* 46 */       return false;
/*    */     }
/*    */     
/* 49 */     if (!this.b.a(cyv1)) {
/* 50 */       return false;
/*    */     }
/*    */     
/* 53 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 58 */     JsonObject jsonObject = super.a(☃);
/* 59 */     jsonObject.add("item", this.a.a());
/* 60 */     jsonObject.add("entity", this.b.a(☃));
/* 61 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bp$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
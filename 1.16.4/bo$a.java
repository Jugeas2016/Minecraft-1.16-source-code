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
/*    */ public class a
/*    */   extends al
/*    */ {
/*    */   private final bq a;
/*    */   private final bz.d b;
/*    */   private final bz.d c;
/*    */   
/*    */   public a(bg.b ☃, bq bq1, bz.d d1, bz.d d2) {
/* 34 */     super(bo.b(), ☃);
/* 35 */     this.a = bq1;
/* 36 */     this.b = d1;
/* 37 */     this.c = d2;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static a a(bg.b ☃, bq bq1, bz.d d1) {
/* 45 */     return new a(☃, bq1, d1, bz.d.e);
/*    */   }
/*    */   
/*    */   public boolean a(bmb ☃, int i) {
/* 49 */     if (!this.a.a(☃)) {
/* 50 */       return false;
/*    */     }
/* 52 */     if (!this.b.d(☃.h() - i)) {
/* 53 */       return false;
/*    */     }
/* 55 */     if (!this.c.d(☃.g() - i)) {
/* 56 */       return false;
/*    */     }
/* 58 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 63 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 65 */     jsonObject.add("item", this.a.a());
/* 66 */     jsonObject.add("durability", this.b.d());
/* 67 */     jsonObject.add("delta", this.c.d());
/*    */     
/* 69 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bo$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/* 35 */     super(cf.b(), ☃);
/* 36 */     this.a = bq1;
/* 37 */     this.b = b1;
/*    */   }
/*    */   
/*    */   public static a a(bg.b ☃, bq.a a1, bg.b b1) {
/* 41 */     return new a(☃, a1.b(), b1);
/*    */   }
/*    */   
/*    */   public boolean a(bmb ☃, cyv cyv1) {
/* 45 */     if (!this.a.a(☃)) {
/* 46 */       return false;
/*    */     }
/*    */     
/* 49 */     return this.b.a(cyv1);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 54 */     JsonObject jsonObject = super.a(☃);
/* 55 */     jsonObject.add("item", this.a.a());
/* 56 */     jsonObject.add("entity", this.b.a(☃));
/* 57 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cf$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
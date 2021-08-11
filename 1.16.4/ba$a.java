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
/*    */ public class a
/*    */   extends al
/*    */ {
/*    */   private final bq a;
/*    */   private final bz.d b;
/*    */   
/*    */   public a(bg.b ☃, bq bq1, bz.d d1) {
/* 32 */     super(ba.b(), ☃);
/* 33 */     this.a = bq1;
/* 34 */     this.b = d1;
/*    */   }
/*    */   
/*    */   public static a c() {
/* 38 */     return new a(bg.b.a, bq.a, bz.d.e);
/*    */   }
/*    */   
/*    */   public boolean a(bmb ☃, int i) {
/* 42 */     if (!this.a.a(☃)) {
/* 43 */       return false;
/*    */     }
/* 45 */     if (!this.b.d(i)) {
/* 46 */       return false;
/*    */     }
/* 48 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 53 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 55 */     jsonObject.add("item", this.a.a());
/* 56 */     jsonObject.add("levels", this.b.d());
/*    */     
/* 58 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ba$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
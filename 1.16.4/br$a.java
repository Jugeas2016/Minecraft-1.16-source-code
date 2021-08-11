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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends al
/*    */ {
/*    */   private final bw a;
/*    */   private final bq b;
/*    */   
/*    */   public a(bg.b ☃, bw bw1, bq bq1) {
/* 38 */     super(br.b(), ☃);
/* 39 */     this.a = bw1;
/* 40 */     this.b = bq1;
/*    */   }
/*    */   
/*    */   public static a a(bw.a ☃, bq.a a1) {
/* 44 */     return new a(bg.b.a, ☃.b(), a1.b());
/*    */   }
/*    */   
/*    */   public boolean a(ceh ☃, aag aag1, fx fx1, bmb bmb1) {
/* 48 */     if (!this.a.a(aag1, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D)) {
/* 49 */       return false;
/*    */     }
/* 51 */     return this.b.a(bmb1);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 56 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 58 */     jsonObject.add("location", this.a.a());
/* 59 */     jsonObject.add("item", this.b.a());
/*    */     
/* 61 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\br$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
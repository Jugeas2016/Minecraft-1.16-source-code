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
/*    */ public class a
/*    */   extends al
/*    */ {
/*    */   private final bw a;
/*    */   private final bw b;
/*    */   private final ay c;
/*    */   
/*    */   public a(bg.b ☃, bw bw1, bw bw2, ay ay1) {
/* 35 */     super(cc.b(), ☃);
/* 36 */     this.a = bw1;
/* 37 */     this.b = bw2;
/* 38 */     this.c = ay1;
/*    */   }
/*    */   
/*    */   public static a a(ay ☃) {
/* 42 */     return new a(bg.b.a, bw.a, bw.a, ☃);
/*    */   }
/*    */   
/*    */   public boolean a(aag ☃, dcn dcn1, double d1, double d2, double d3) {
/* 46 */     if (!this.a.a(☃, dcn1.b, dcn1.c, dcn1.d)) {
/* 47 */       return false;
/*    */     }
/* 49 */     if (!this.b.a(☃, d1, d2, d3)) {
/* 50 */       return false;
/*    */     }
/* 52 */     if (!this.c.a(dcn1.b, dcn1.c, dcn1.d, d1, d2, d3)) {
/* 53 */       return false;
/*    */     }
/* 55 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 60 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 62 */     jsonObject.add("entered", this.a.a());
/* 63 */     jsonObject.add("exited", this.b.a());
/* 64 */     jsonObject.add("distance", this.c.a());
/*    */     
/* 66 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cc$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
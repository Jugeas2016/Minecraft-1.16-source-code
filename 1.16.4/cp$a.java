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
/*    */   private final bz.d a;
/*    */   private final bg.b b;
/*    */   
/*    */   public a(bg.b ☃, bz.d d1, bg.b b1) {
/* 35 */     super(cp.b(), ☃);
/* 36 */     this.a = d1;
/* 37 */     this.b = b1;
/*    */   }
/*    */   
/*    */   public static a a(bz.d ☃, bg.b b1) {
/* 41 */     return new a(bg.b.a, ☃, b1);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 46 */     JsonObject jsonObject = super.a(☃);
/* 47 */     jsonObject.add("signal_strength", this.a.d());
/* 48 */     jsonObject.add("projectile", this.b.a(☃));
/* 49 */     return jsonObject;
/*    */   }
/*    */   
/*    */   public boolean a(cyv ☃, dcn dcn1, int i) {
/* 53 */     if (!this.a.d(i)) {
/* 54 */       return false;
/*    */     }
/* 56 */     if (!this.b.a(☃)) {
/* 57 */       return false;
/*    */     }
/* 59 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cp$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
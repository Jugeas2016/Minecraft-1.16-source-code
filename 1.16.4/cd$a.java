/*    */ import com.google.gson.JsonObject;
/*    */ import javax.annotation.Nullable;
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
/*    */   private final buo a;
/*    */   private final cm b;
/*    */   private final bw c;
/*    */   private final bq d;
/*    */   
/*    */   public a(bg.b ☃, @Nullable buo buo1, cm cm1, bw bw1, bq bq1) {
/* 61 */     super(cd.b(), ☃);
/* 62 */     this.a = buo1;
/* 63 */     this.b = cm1;
/* 64 */     this.c = bw1;
/* 65 */     this.d = bq1;
/*    */   }
/*    */   
/*    */   public static a a(buo ☃) {
/* 69 */     return new a(bg.b.a, ☃, cm.a, bw.a, bq.a);
/*    */   }
/*    */   
/*    */   public boolean a(ceh ☃, fx fx1, aag aag1, bmb bmb1) {
/* 73 */     if (this.a != null && !☃.a(this.a)) {
/* 74 */       return false;
/*    */     }
/* 76 */     if (!this.b.a(☃)) {
/* 77 */       return false;
/*    */     }
/* 79 */     if (!this.c.a(aag1, fx1.u(), fx1.v(), fx1.w())) {
/* 80 */       return false;
/*    */     }
/* 82 */     if (!this.d.a(bmb1)) {
/* 83 */       return false;
/*    */     }
/* 85 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 90 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 92 */     if (this.a != null) {
/* 93 */       jsonObject.addProperty("block", gm.Q.b(this.a).toString());
/*    */     }
/* 95 */     jsonObject.add("state", this.b.a());
/* 96 */     jsonObject.add("location", this.c.a());
/* 97 */     jsonObject.add("item", this.d.a());
/*    */     
/* 99 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cd$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
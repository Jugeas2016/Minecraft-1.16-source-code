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
/*    */ public class a
/*    */   extends al
/*    */ {
/*    */   @Nullable
/*    */   private final buo a;
/*    */   private final bq b;
/*    */   private final bz.d c;
/*    */   
/*    */   public a(bg.b ☃, @Nullable buo buo1, bq bq1, bz.d d1) {
/* 51 */     super(am.b(), ☃);
/* 52 */     this.a = buo1;
/* 53 */     this.b = bq1;
/* 54 */     this.c = d1;
/*    */   }
/*    */   
/*    */   public static a a(buo ☃, bq.a a1, bz.d d1) {
/* 58 */     return new a(bg.b.a, ☃, a1.b(), d1);
/*    */   }
/*    */   
/*    */   public boolean a(buo ☃, bmb bmb1, int i) {
/* 62 */     if (this.a != null && ☃ != this.a) {
/* 63 */       return false;
/*    */     }
/* 65 */     if (!this.b.a(bmb1)) {
/* 66 */       return false;
/*    */     }
/* 68 */     return this.c.d(i);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 73 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 75 */     if (this.a != null) {
/* 76 */       jsonObject.addProperty("block", gm.Q.b(this.a).toString());
/*    */     }
/* 78 */     jsonObject.add("item", this.b.a());
/* 79 */     jsonObject.add("num_bees_inside", this.c.d());
/*    */     
/* 81 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\am$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
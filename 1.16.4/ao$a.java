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
/*    */ public class a
/*    */   extends al
/*    */ {
/*    */   private final bg.b a;
/*    */   private final bg.b b;
/*    */   private final bg.b c;
/*    */   
/*    */   public a(bg.b ☃, bg.b b1, bg.b b2, bg.b b3) {
/* 42 */     super(ao.b(), ☃);
/* 43 */     this.a = b1;
/* 44 */     this.b = b2;
/* 45 */     this.c = b3;
/*    */   }
/*    */   
/*    */   public static a c() {
/* 49 */     return new a(bg.b.a, bg.b.a, bg.b.a, bg.b.a);
/*    */   }
/*    */   
/*    */   public static a a(bg.a ☃) {
/* 53 */     return new a(bg.b.a, bg.b.a, bg.b.a, bg.b.a(☃.b()));
/*    */   }
/*    */   
/*    */   public static a a(bg ☃, bg bg1, bg bg2) {
/* 57 */     return new a(bg.b.a, bg.b.a(☃), bg.b.a(bg1), bg.b.a(bg2));
/*    */   }
/*    */   
/*    */   public boolean a(cyv ☃, cyv cyv1, @Nullable cyv cyv2) {
/* 61 */     if (this.c != bg.b.a && (cyv2 == null || !this.c.a(cyv2))) {
/* 62 */       return false;
/*    */     }
/*    */     
/* 65 */     return ((this.a.a(☃) && this.b.a(cyv1)) || (this.a.a(cyv1) && this.b.a(☃)));
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 70 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 72 */     jsonObject.add("parent", this.a.a(☃));
/* 73 */     jsonObject.add("partner", this.b.a(☃));
/* 74 */     jsonObject.add("child", this.c.a(☃));
/*    */     
/* 76 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ao$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
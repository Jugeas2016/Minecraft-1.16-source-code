/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cs
/*    */   extends ck<cs.a>
/*    */ {
/*  9 */   private static final vk a = new vk("used_ender_eye");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 13 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 18 */     bz.c c = bz.c.a(☃.get("distance"));
/* 19 */     return new a(b1, c);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, fx fx1) {
/* 23 */     double d1 = ☃.cD() - fx1.u();
/* 24 */     double d2 = ☃.cH() - fx1.w();
/* 25 */     double d3 = d1 * d1 + d2 * d2;
/* 26 */     a(☃, a1 -> a1.a(☃));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bz.c a;
/*    */     
/*    */     public a(bg.b ☃, bz.c c1) {
/* 33 */       super(cs.b(), ☃);
/* 34 */       this.a = c1;
/*    */     }
/*    */     
/*    */     public boolean a(double ☃) {
/* 38 */       return this.a.a(☃);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
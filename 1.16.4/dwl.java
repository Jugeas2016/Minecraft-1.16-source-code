/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dwl
/*    */   extends dvt
/*    */ {
/*    */   private final dwn b;
/*    */   private final dwn c;
/*    */   
/*    */   public dwl(float ☃) {
/* 17 */     float f = -16.0F;
/* 18 */     this.b = new dwn(this);
/* 19 */     this.b.a("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, ☃, 176, 44);
/* 20 */     this.b.a("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, ☃, 112, 30);
/* 21 */     this.b.g = true;
/* 22 */     this.b.a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, ☃, 0, 0);
/* 23 */     this.b.a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, ☃, 112, 0);
/* 24 */     this.b.g = false;
/* 25 */     this.b.a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, ☃, 0, 0);
/* 26 */     this.b.a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, ☃, 112, 0);
/*    */     
/* 28 */     this.c = new dwn(this);
/* 29 */     this.c.a(0.0F, 4.0F, -8.0F);
/* 30 */     this.c.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, ☃, 176, 65);
/* 31 */     this.b.b(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float ☃, float f1, float f2) {
/* 36 */     this.c.d = (float)(Math.sin((☃ * 3.1415927F * 0.2F)) + 1.0D) * 0.2F;
/*    */     
/* 38 */     this.b.e = f1 * 0.017453292F;
/* 39 */     this.b.d = f2 * 0.017453292F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/* 44 */     ☃.a();
/* 45 */     ☃.a(0.0D, -0.37437498569488525D, 0.0D);
/* 46 */     ☃.a(0.75F, 0.75F, 0.75F);
/*    */     
/* 48 */     this.b.a(☃, dfq1, i, j, f1, f2, f3, f4);
/* 49 */     ☃.b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
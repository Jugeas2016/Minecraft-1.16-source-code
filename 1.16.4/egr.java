/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class egr
/*    */   extends efw<bdz, dvu<bdz>>
/*    */ {
/* 12 */   private static final vk a = new vk("textures/entity/slime/slime.png");
/*    */   
/*    */   public egr(eet ☃) {
/* 15 */     super(☃, new dvu<>(16), 0.25F);
/*    */     
/* 17 */     a(new eix<>(this));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bdz ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 22 */     this.c = 0.25F * ☃.eP();
/* 23 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(bdz ☃, dfm dfm1, float f) {
/* 29 */     float f1 = 0.999F;
/* 30 */     dfm1.a(0.999F, 0.999F, 0.999F);
/* 31 */     dfm1.a(0.0D, 0.0010000000474974513D, 0.0D);
/*    */     
/* 33 */     float f2 = ☃.eP();
/* 34 */     float f3 = afm.g(f, ☃.d, ☃.c) / (f2 * 0.5F + 1.0F);
/* 35 */     float f4 = 1.0F / (f3 + 1.0F);
/* 36 */     dfm1.a(f4 * f2, 1.0F / f4 * f2, f4 * f2);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bdz ☃) {
/* 41 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\egr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eek
/*    */   extends efw<bdc, dtw<bdc>>
/*    */ {
/* 11 */   private static final vk a = new vk("textures/entity/creeper/creeper.png");
/*    */   
/*    */   public eek(eet ☃) {
/* 14 */     super(☃, new dtw<>(), 0.5F);
/*    */     
/* 16 */     a(new ehx(this));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bdc ☃, dfm dfm1, float f) {
/* 21 */     float f1 = ☃.y(f);
/*    */     
/* 23 */     float f2 = 1.0F + afm.a(f1 * 100.0F) * f1 * 0.01F;
/* 24 */     f1 = afm.a(f1, 0.0F, 1.0F);
/* 25 */     f1 *= f1;
/* 26 */     f1 *= f1;
/* 27 */     float f3 = (1.0F + f1 * 0.4F) * f2;
/* 28 */     float f4 = (1.0F + f1 * 0.1F) / f2;
/* 29 */     dfm1.a(f3, f4, f3);
/*    */   }
/*    */ 
/*    */   
/*    */   protected float a(bdc ☃, float f) {
/* 34 */     float f1 = ☃.y(f);
/*    */     
/* 36 */     if ((int)(f1 * 10.0F) % 2 == 0) {
/* 37 */       return 0.0F;
/*    */     }
/*    */     
/* 40 */     return afm.a(f1, 0.5F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bdc ☃) {
/* 45 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eek.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
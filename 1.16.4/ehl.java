/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ehl
/*    */   extends efw<bcl, dwh<bcl>>
/*    */ {
/* 13 */   private static final vk a = new vk("textures/entity/wither/wither_invulnerable.png");
/* 14 */   private static final vk g = new vk("textures/entity/wither/wither.png");
/*    */   
/*    */   public ehl(eet ☃) {
/* 17 */     super(☃, new dwh<>(0.0F), 1.0F);
/*    */     
/* 19 */     a(new ejg(this));
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(bcl ☃, fx fx1) {
/* 24 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bcl ☃) {
/* 29 */     int i = ☃.eL();
/* 30 */     if (i <= 0 || (i <= 80 && i / 5 % 2 == 1)) {
/* 31 */       return g;
/*    */     }
/* 33 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bcl ☃, dfm dfm1, float f) {
/* 38 */     float f1 = 2.0F;
/*    */     
/* 40 */     int i = ☃.eL();
/* 41 */     if (i > 0) {
/* 42 */       f1 -= (i - f) / 220.0F * 0.5F;
/*    */     }
/*    */     
/* 45 */     dfm1.a(f1, f1, f1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ehl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
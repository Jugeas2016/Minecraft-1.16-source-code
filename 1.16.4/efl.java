/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class efl
/*    */   extends efw<bai, duo<bai>>
/*    */ {
/* 12 */   private static final vk a = new vk("textures/entity/iron_golem/iron_golem.png");
/*    */   
/*    */   public efl(eet ☃) {
/* 15 */     super(☃, new duo<>(), 0.7F);
/* 16 */     a(new eil(this));
/* 17 */     a(new eim(this));
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bai ☃) {
/* 22 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bai ☃, dfm dfm1, float f1, float f2, float f3) {
/* 27 */     super.a(☃, dfm1, f1, f2, f3);
/* 28 */     if (☃.av < 0.01D) {
/*    */       return;
/*    */     }
/*    */     
/* 32 */     float f4 = 13.0F;
/* 33 */     float f5 = ☃.aw - ☃.av * (1.0F - f3) + 6.0F;
/* 34 */     float f6 = (Math.abs(f5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
/* 35 */     dfm1.a(g.f.a(6.5F * f6));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
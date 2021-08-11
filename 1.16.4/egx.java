/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class egx
/*    */   extends efw<bed, dvy<bed>>
/*    */ {
/* 10 */   private static final vk a = new vk("textures/entity/strider/strider.png");
/* 11 */   private static final vk g = new vk("textures/entity/strider/strider_cold.png");
/*    */   
/*    */   public egx(eet ☃) {
/* 14 */     super(☃, new dvy<>(), 0.5F);
/*    */     
/* 16 */     a(new eiu<>(this, new dvy<>(), new vk("textures/entity/strider/strider_saddle.png")));
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bed ☃) {
/* 21 */     return ☃.eK() ? g : a;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(bed ☃, dfm dfm1, float f) {
/* 27 */     if (☃.w_()) {
/* 28 */       dfm1.a(0.5F, 0.5F, 0.5F);
/* 29 */       this.c = 0.25F;
/*    */     } else {
/* 31 */       this.c = 0.5F;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b(bed ☃) {
/* 37 */     return ☃.eK();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\egx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
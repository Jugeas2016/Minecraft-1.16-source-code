/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eho
/*    */   extends efw<baz, dwi<baz>>
/*    */ {
/* 11 */   private static final vk a = new vk("textures/entity/wolf/wolf.png");
/* 12 */   private static final vk g = new vk("textures/entity/wolf/wolf_tame.png");
/* 13 */   private static final vk h = new vk("textures/entity/wolf/wolf_angry.png");
/*    */   
/*    */   public eho(eet ☃) {
/* 16 */     super(☃, new dwi<>(), 0.5F);
/*    */     
/* 18 */     a(new ejh(this));
/*    */   }
/*    */ 
/*    */   
/*    */   protected float a(baz ☃, float f) {
/* 23 */     return ☃.eW();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(baz ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 29 */     if (☃.eV()) {
/* 30 */       float f = ☃.y(f2);
/* 31 */       this.e.a(f, f, f);
/*    */     } 
/*    */     
/* 34 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */     
/* 36 */     if (☃.eV()) {
/* 37 */       this.e.a(1.0F, 1.0F, 1.0F);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(baz ☃) {
/* 43 */     if (☃.eK()) {
/* 44 */       return g;
/*    */     }
/* 46 */     if (☃.H_()) {
/* 47 */       return h;
/*    */     }
/* 49 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
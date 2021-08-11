/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class efb
/*    */   extends efw<bah, due<bah>>
/*    */ {
/* 12 */   private static final vk a = new vk("textures/entity/fox/fox.png");
/* 13 */   private static final vk g = new vk("textures/entity/fox/fox_sleep.png");
/* 14 */   private static final vk h = new vk("textures/entity/fox/snow_fox.png");
/* 15 */   private static final vk i = new vk("textures/entity/fox/snow_fox_sleep.png");
/*    */   
/*    */   public efb(eet ☃) {
/* 18 */     super(☃, new due<>(), 0.4F);
/*    */     
/* 20 */     a(new eih(this));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bah ☃, dfm dfm1, float f1, float f2, float f3) {
/* 25 */     super.a(☃, dfm1, f1, f2, f3);
/*    */     
/* 27 */     if (☃.eO() || ☃.eN()) {
/* 28 */       float f = -afm.g(f3, ☃.s, ☃.q);
/* 29 */       dfm1.a(g.b.a(f));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bah ☃) {
/* 35 */     if (☃.eL() == bah.v.a) {
/* 36 */       return ☃.em() ? g : a;
/*    */     }
/* 38 */     return ☃.em() ? i : h;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
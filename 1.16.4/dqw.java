/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dqw
/*    */   extends dqm<bjs>
/*    */ {
/* 11 */   private static final vk A = new vk("textures/gui/container/smithing.png");
/*    */   
/*    */   public dqw(bjs ☃, bfv bfv1, nr nr1) {
/* 14 */     super(☃, bfv1, nr1, A);
/* 15 */     this.p = 60;
/* 16 */     this.q = 18;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(dfm ☃, int i, int j) {
/* 21 */     RenderSystem.disableBlend();
/* 22 */     super.b(☃, i, j);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
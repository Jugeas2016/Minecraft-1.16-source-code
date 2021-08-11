/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dqj
/*    */   extends dpp<bix>
/*    */ {
/* 11 */   private static final vk A = new vk("textures/gui/container/hopper.png");
/*    */   
/*    */   public dqj(bix ☃, bfv bfv1, nr nr1) {
/* 14 */     super(☃, bfv1, nr1);
/* 15 */     this.n = false;
/* 16 */     this.c = 133;
/* 17 */     this.s = this.c - 94;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 22 */     a(☃);
/* 23 */     super.a(☃, i, j, f);
/* 24 */     a(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dfm ☃, float f, int i, int j) {
/* 29 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 30 */     this.i.M().a(A);
/* 31 */     int k = (this.k - this.b) / 2;
/* 32 */     int m = (this.l - this.c) / 2;
/* 33 */     b(☃, k, m, 0, 0, this.b, this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dqu
/*    */   extends dpp<bjo>
/*    */ {
/* 11 */   private static final vk A = new vk("textures/gui/container/shulker_box.png");
/*    */   
/*    */   public dqu(bjo ☃, bfv bfv1, nr nr1) {
/* 14 */     super(☃, bfv1, nr1);
/*    */     
/* 16 */     this.c++;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 21 */     a(☃);
/* 22 */     super.a(☃, i, j, f);
/* 23 */     a(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dfm ☃, float f, int i, int j) {
/* 28 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 29 */     this.i.M().a(A);
/* 30 */     int k = (this.k - this.b) / 2;
/* 31 */     int m = (this.l - this.c) / 2;
/* 32 */     b(☃, k, m, 0, 0, this.b, this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
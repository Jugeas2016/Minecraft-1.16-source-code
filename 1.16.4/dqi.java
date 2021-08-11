/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dqi
/*    */   extends dpp<biw>
/*    */ {
/* 11 */   private static final vk A = new vk("textures/gui/container/grindstone.png");
/*    */   
/*    */   public dqi(biw ☃, bfv bfv1, nr nr1) {
/* 14 */     super(☃, bfv1, nr1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 19 */     a(☃);
/*    */     
/* 21 */     a(☃, f, i, j);
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
/*    */     
/* 34 */     if ((this.t.a(0).f() || this.t.a(1).f()) && !this.t.a(2).f())
/* 35 */       b(☃, k + 92, m + 31, this.b, 0, 28, 21); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
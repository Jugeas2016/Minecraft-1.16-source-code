/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dpz
/*    */   extends dpp<bij>
/*    */   implements dqq<bij>
/*    */ {
/* 11 */   private static final vk A = new vk("textures/gui/container/generic_54.png");
/*    */   
/*    */   private final int B;
/*    */   
/*    */   public dpz(bij ☃, bfv bfv1, nr nr1) {
/* 16 */     super(☃, bfv1, nr1);
/* 17 */     this.n = false;
/*    */     
/* 19 */     int i = 222;
/* 20 */     int j = 114;
/* 21 */     this.B = ☃.f();
/*    */     
/* 23 */     this.c = 114 + this.B * 18;
/* 24 */     this.s = this.c - 94;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 29 */     a(☃);
/* 30 */     super.a(☃, i, j, f);
/* 31 */     a(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dfm ☃, float f, int i, int j) {
/* 36 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 37 */     this.i.M().a(A);
/* 38 */     int k = (this.k - this.b) / 2;
/* 39 */     int m = (this.l - this.c) / 2;
/* 40 */     b(☃, k, m, 0, 0, this.b, this.B * 18 + 17);
/* 41 */     b(☃, k, m + this.B * 18 + 17, 0, 126, this.b, 96);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
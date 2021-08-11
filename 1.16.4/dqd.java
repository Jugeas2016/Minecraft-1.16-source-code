/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dqd
/*    */   extends dpp<bir>
/*    */ {
/* 11 */   private static final vk A = new vk("textures/gui/container/dispenser.png");
/*    */   
/*    */   public dqd(bir ☃, bfv bfv1, nr nr1) {
/* 14 */     super(☃, bfv1, nr1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 19 */     super.b();
/* 20 */     this.p = (this.b - this.o.a(this.d)) / 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 25 */     a(☃);
/* 26 */     super.a(☃, i, j, f);
/* 27 */     a(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dfm ☃, float f, int i, int j) {
/* 32 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 33 */     this.i.M().a(A);
/* 34 */     int k = (this.k - this.b) / 2;
/* 35 */     int m = (this.l - this.c) / 2;
/* 36 */     b(☃, k, m, 0, 0, this.b, this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dqm<T extends bja>
/*    */   extends dpp<T>
/*    */   implements bin
/*    */ {
/*    */   private vk A;
/*    */   
/*    */   public dqm(T ☃, bfv bfv1, nr nr1, vk vk1) {
/* 18 */     super(☃, bfv1, nr1);
/* 19 */     this.A = vk1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void i() {}
/*    */ 
/*    */   
/*    */   protected void b() {
/* 27 */     super.b();
/* 28 */     i();
/* 29 */     ((bja)this.t).a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 34 */     super.e();
/*    */     
/* 36 */     ((bja)this.t).b(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 41 */     a(☃);
/* 42 */     super.a(☃, i, j, f);
/*    */     
/* 44 */     RenderSystem.disableBlend();
/* 45 */     b(☃, i, j, f);
/*    */     
/* 47 */     a(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(dfm ☃, int i, int j, float f) {}
/*    */ 
/*    */   
/*    */   protected void a(dfm ☃, float f, int i, int j) {
/* 55 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 56 */     this.i.M().a(this.A);
/* 57 */     int k = (this.k - this.b) / 2;
/* 58 */     int m = (this.l - this.c) / 2;
/* 59 */     b(☃, k, m, 0, 0, this.b, this.c);
/*    */     
/* 61 */     b(☃, k + 59, m + 20, 0, this.c + (((bja)this.t).a(0).f() ? 0 : 16), 110, 16);
/*    */     
/* 63 */     if ((((bja)this.t).a(0).f() || ((bja)this.t).a(1).f()) && !((bja)this.t).a(2).f()) {
/* 64 */       b(☃, k + 99, m + 45, this.b, 0, 28, 21);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bic ☃, gj<bmb> gj1) {
/* 70 */     a(☃, 0, ☃.a(0).e());
/*    */   }
/*    */   
/*    */   public void a(bic ☃, int i, int j) {}
/*    */   
/*    */   public void a(bic ☃, int i, bmb bmb1) {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
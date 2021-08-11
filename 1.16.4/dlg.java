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
/*    */ public abstract class dlg
/*    */   extends dlh
/*    */ {
/*    */   protected double b;
/*    */   
/*    */   public dlg(int ☃, int i, int j, int k, nr nr1, double d) {
/* 17 */     super(☃, i, j, k, nr1);
/* 18 */     this.b = d;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(boolean ☃) {
/* 23 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected nx c() {
/* 28 */     return new of("gui.narrate.slider", new Object[] { i() });
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dfm ☃, djz djz1, int i, int j) {
/* 33 */     djz1.M().a(i);
/* 34 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 35 */     int k = (g() ? 2 : 1) * 20;
/* 36 */     b(☃, this.l + (int)(this.b * (this.j - 8)), this.m, 0, 46 + k, 4, 20);
/* 37 */     b(☃, this.l + (int)(this.b * (this.j - 8)) + 4, this.m, 196, 46 + k, 4, 20);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(double ☃, double d1) {
/* 42 */     a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i, int j) {
/* 47 */     boolean bool = (☃ == 263);
/* 48 */     if (bool || ☃ == 262) {
/* 49 */       float f = bool ? -1.0F : 1.0F;
/* 50 */       b(this.b + (f / (this.j - 8)));
/*    */     } 
/* 52 */     return false;
/*    */   }
/*    */   
/*    */   private void a(double ☃) {
/* 56 */     b((☃ - (this.l + 4)) / (this.j - 8));
/*    */   }
/*    */   
/*    */   private void b(double ☃) {
/* 60 */     double d = this.b;
/* 61 */     this.b = afm.a(☃, 0.0D, 1.0D);
/* 62 */     if (d != this.b) {
/* 63 */       a();
/*    */     }
/* 65 */     b();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(double ☃, double d1, double d2, double d3) {
/* 70 */     a(☃);
/* 71 */     super.a(☃, d1, d2, d3);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(enu ☃) {}
/*    */ 
/*    */   
/*    */   public void a_(double ☃, double d1) {
/* 80 */     super.a(djz.C().W());
/*    */   }
/*    */   
/*    */   protected abstract void b();
/*    */   
/*    */   protected abstract void a();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
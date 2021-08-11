/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dma
/*    */   extends dlh
/*    */ {
/*    */   protected vk a;
/*    */   protected boolean b;
/*    */   protected int c;
/*    */   protected int d;
/*    */   protected int e;
/*    */   protected int s;
/*    */   
/*    */   public dma(int ☃, int i, int j, int k, boolean bool) {
/* 18 */     super(☃, i, j, k, oe.d);
/* 19 */     this.b = bool;
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i, int j, int k, vk vk1) {
/* 23 */     this.c = ☃;
/* 24 */     this.d = i;
/* 25 */     this.e = j;
/* 26 */     this.s = k;
/* 27 */     this.a = vk1;
/*    */   }
/*    */   
/*    */   public void e(boolean ☃) {
/* 31 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 35 */     return this.b;
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i) {
/* 39 */     this.l = ☃;
/* 40 */     this.m = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(dfm ☃, int i, int j, float f) {
/* 45 */     djz djz = djz.C();
/* 46 */     djz.M().a(this.a);
/* 47 */     RenderSystem.disableDepthTest();
/*    */     
/* 49 */     int k = this.c;
/* 50 */     int m = this.d;
/* 51 */     if (this.b) {
/* 52 */       k += this.e;
/*    */     }
/* 54 */     if (g()) {
/* 55 */       m += this.s;
/*    */     }
/*    */     
/* 58 */     b(☃, this.l, this.m, k, m, this.j, this.k);
/* 59 */     RenderSystem.enableDepthTest();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dma.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
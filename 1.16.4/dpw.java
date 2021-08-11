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
/*    */ 
/*    */ public class dpw
/*    */   extends dpp<bih>
/*    */ {
/* 15 */   private static final vk A = new vk("textures/gui/container/brewing_stand.png");
/* 16 */   private static final int[] B = new int[] { 29, 24, 20, 16, 11, 6, 0 };
/*    */   
/*    */   public dpw(bih ☃, bfv bfv1, nr nr1) {
/* 19 */     super(☃, bfv1, nr1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 24 */     super.b();
/* 25 */     this.p = (this.b - this.o.a(this.d)) / 2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 30 */     a(☃);
/* 31 */     super.a(☃, i, j, f);
/* 32 */     a(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dfm ☃, float f, int i, int j) {
/* 37 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 38 */     this.i.M().a(A);
/* 39 */     int k = (this.k - this.b) / 2;
/* 40 */     int m = (this.l - this.c) / 2;
/* 41 */     b(☃, k, m, 0, 0, this.b, this.c);
/*    */     
/* 43 */     int n = this.t.e();
/* 44 */     int i1 = afm.a((18 * n + 20 - 1) / 20, 0, 18);
/* 45 */     if (i1 > 0) {
/* 46 */       b(☃, k + 60, m + 44, 176, 29, i1, 4);
/*    */     }
/*    */     
/* 49 */     int i2 = this.t.f();
/* 50 */     if (i2 > 0) {
/* 51 */       int i3 = (int)(28.0F * (1.0F - i2 / 400.0F));
/* 52 */       if (i3 > 0) {
/* 53 */         b(☃, k + 97, m + 16, 176, 0, 9, i3);
/*    */       }
/*    */       
/* 56 */       i3 = B[i2 / 2 % 7];
/* 57 */       if (i3 > 0)
/* 58 */         b(☃, k + 63, m + 14 + 29 - i3, 185, 29 - i3, 12, i3); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dqk
/*    */   extends dpp<biy>
/*    */ {
/* 13 */   private static final vk A = new vk("textures/gui/container/horse.png");
/*    */   
/*    */   private final bbb B;
/*    */   private float C;
/*    */   private float D;
/*    */   
/*    */   public dqk(biy ☃, bfv bfv1, bbb bbb1) {
/* 20 */     super(☃, bfv1, bbb1.d());
/* 21 */     this.B = bbb1;
/* 22 */     this.n = false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dfm ☃, float f, int i, int j) {
/* 27 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 28 */     this.i.M().a(A);
/* 29 */     int k = (this.k - this.b) / 2;
/* 30 */     int m = (this.l - this.c) / 2;
/* 31 */     b(☃, k, m, 0, 0, this.b, this.c);
/*    */     
/* 33 */     if (this.B instanceof bba) {
/* 34 */       bba bba = (bba)this.B;
/* 35 */       if (bba.eM()) {
/* 36 */         b(☃, k + 79, m + 17, 0, this.c, bba.eU() * 18, 54);
/*    */       }
/*    */     } 
/*    */     
/* 40 */     if (this.B.L_()) {
/* 41 */       b(☃, k + 7, m + 35 - 18, 18, this.c + 54, 18, 18);
/*    */     }
/*    */     
/* 44 */     if (this.B.fs()) {
/* 45 */       if (this.B instanceof bbe) {
/* 46 */         b(☃, k + 7, m + 35, 36, this.c + 54, 18, 18);
/*    */       } else {
/* 48 */         b(☃, k + 7, m + 35, 0, this.c + 54, 18, 18);
/*    */       } 
/*    */     }
/*    */     
/* 52 */     dql.a(k + 51, m + 60, 17, (k + 51) - this.C, (m + 75 - 50) - this.D, this.B);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 57 */     a(☃);
/* 58 */     this.C = i;
/* 59 */     this.D = j;
/*    */     
/* 61 */     super.a(☃, i, j, f);
/* 62 */     a(☃, i, j);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
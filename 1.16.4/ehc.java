/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ehc
/*    */   extends eeu<bcw>
/*    */ {
/*    */   public ehc(eet ☃) {
/* 14 */     super(☃);
/* 15 */     this.c = 0.5F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bcw ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/* 20 */     dfm1.a();
/* 21 */     dfm1.a(0.0D, 0.5D, 0.0D);
/* 22 */     if (☃.i() - f2 + 1.0F < 10.0F) {
/* 23 */       float f3 = 1.0F - (☃.i() - f2 + 1.0F) / 10.0F;
/* 24 */       f3 = afm.a(f3, 0.0F, 1.0F);
/* 25 */       f3 *= f3;
/* 26 */       f3 *= f3;
/* 27 */       float f4 = 1.0F + f3 * 0.3F;
/* 28 */       dfm1.a(f4, f4, f4);
/*    */     } 
/*    */     
/* 31 */     dfm1.a(g.d.a(-90.0F));
/* 32 */     dfm1.a(-0.5D, -0.5D, 0.5D);
/* 33 */     dfm1.a(g.d.a(90.0F));
/*    */     
/* 35 */     ehb.a(bup.bH.n(), dfm1, eag1, i, (☃.i() / 5 % 2 == 0));
/*    */     
/* 37 */     dfm1.b();
/*    */     
/* 39 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bcw ☃) {
/* 44 */     return ekb.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ehc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ 
/*    */ public class eib
/*    */   extends eit<baf, dtx<baf>>
/*    */ {
/*    */   public eib(egk<baf, dtx<baf>> ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, baf baf1, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 21 */     boolean bool = (baf1.dV() == aqi.b);
/*    */     
/* 23 */     ☃.a();
/*    */     
/* 25 */     float f7 = 1.0F;
/* 26 */     float f8 = -1.0F;
/* 27 */     float f9 = afm.e(baf1.q) / 60.0F;
/* 28 */     if (baf1.q < 0.0F) {
/* 29 */       ☃.a(0.0D, (1.0F - f9 * 0.5F), (-1.0F + f9 * 0.5F));
/*    */     } else {
/* 31 */       ☃.a(0.0D, (1.0F + f9 * 0.8F), (-1.0F + f9 * 0.2F));
/*    */     } 
/*    */     
/* 34 */     bmb bmb = bool ? baf1.dD() : baf1.dE();
/* 35 */     djz.C().ae().a(baf1, bmb, ebm.b.h, false, ☃, eag1, i);
/*    */     
/* 37 */     ☃.b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
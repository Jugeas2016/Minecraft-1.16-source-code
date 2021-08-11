/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bzx
/*    */   extends bxi
/*    */ {
/*    */   public bzx(ceg.c ☃) {
/* 12 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brx ☃, fx fx1, aqa aqa1, float f) {
/* 17 */     if (aqa1.bw()) {
/* 18 */       super.a(☃, fx1, aqa1, f);
/*    */     } else {
/*    */       
/* 21 */       aqa1.b(f, 0.0F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brc ☃, aqa aqa1) {
/* 27 */     if (aqa1.bw()) {
/* 28 */       super.a(☃, aqa1);
/*    */     } else {
/* 30 */       a(aqa1);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void a(aqa ☃) {
/* 35 */     dcn dcn = ☃.cC();
/* 36 */     if (dcn.c < 0.0D) {
/*    */       
/* 38 */       double d = (☃ instanceof aqm) ? 1.0D : 0.8D;
/* 39 */       ☃.n(dcn.b, -dcn.c * d, dcn.d);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(brx ☃, fx fx1, aqa aqa1) {
/* 49 */     double d = Math.abs((aqa1.cC()).c);
/* 50 */     if (d < 0.1D && !aqa1.bv()) {
/* 51 */       double d1 = 0.4D + d * 0.2D;
/* 52 */       aqa1.f(aqa1.cC().d(d1, 1.0D, d1));
/*    */     } 
/* 54 */     super.a(☃, fx1, aqa1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ public class gv
/*    */   implements gw
/*    */ {
/*    */   public final bmb dispense(fy ☃, bmb bmb1) {
/* 15 */     bmb bmb2 = a(☃, bmb1);
/*    */     
/* 17 */     a(☃);
/* 18 */     a(☃, (gc)☃.e().c(bwa.a));
/*    */     
/* 20 */     return bmb2;
/*    */   }
/*    */   
/*    */   protected bmb a(fy ☃, bmb bmb1) {
/* 24 */     gc gc = (gc)☃.e().c(bwa.a);
/* 25 */     gk gk = bwa.a(☃);
/*    */     
/* 27 */     bmb bmb2 = bmb1.a(1);
/*    */     
/* 29 */     a(☃.h(), bmb2, 6, gc, gk);
/*    */     
/* 31 */     return bmb1;
/*    */   }
/*    */   
/*    */   public static void a(brx ☃, bmb bmb1, int i, gc gc1, gk gk1) {
/* 35 */     double d1 = gk1.a();
/* 36 */     double d2 = gk1.b();
/* 37 */     double d3 = gk1.c();
/*    */     
/* 39 */     if (gc1.n() == gc.a.b) {
/*    */       
/* 41 */       d2 -= 0.125D;
/*    */     } else {
/*    */       
/* 44 */       d2 -= 0.15625D;
/*    */     } 
/*    */     
/* 47 */     bcv bcv = new bcv(☃, d1, d2, d3, bmb1);
/*    */     
/* 49 */     double d4 = ☃.t.nextDouble() * 0.1D + 0.2D;
/* 50 */     bcv.n(☃.t
/* 51 */         .nextGaussian() * 0.007499999832361937D * i + gc1.i() * d4, ☃.t
/* 52 */         .nextGaussian() * 0.007499999832361937D * i + 0.20000000298023224D, ☃.t
/* 53 */         .nextGaussian() * 0.007499999832361937D * i + gc1.k() * d4);
/*    */ 
/*    */     
/* 56 */     ☃.c(bcv);
/*    */   }
/*    */   
/*    */   protected void a(fy ☃) {
/* 60 */     ☃.h().c(1000, ☃.d(), 0);
/*    */   }
/*    */   
/*    */   protected void a(fy ☃, gc gc1) {
/* 64 */     ☃.h().c(2000, ☃.d(), gc1.c());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
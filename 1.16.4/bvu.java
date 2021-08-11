/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bvu
/*    */   extends buo
/*    */ {
/*    */   public bvu(ceg.c ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 18 */     if (random.nextInt(5) != 0) {
/*    */       return;
/*    */     }
/*    */     
/* 22 */     gc gc = gc.a(random);
/* 23 */     if (gc == gc.b) {
/*    */       return;
/*    */     }
/* 26 */     fx fx2 = fx1.a(gc);
/* 27 */     ceh ceh1 = brx1.d_(fx2);
/* 28 */     if (☃.l() && ceh1.d(brx1, fx2, gc.f())) {
/*    */       return;
/*    */     }
/*    */     
/* 32 */     double d1 = (gc.i() == 0) ? random.nextDouble() : (0.5D + gc.i() * 0.6D);
/* 33 */     double d2 = (gc.j() == 0) ? random.nextDouble() : (0.5D + gc.j() * 0.6D);
/* 34 */     double d3 = (gc.k() == 0) ? random.nextDouble() : (0.5D + gc.k() * 0.6D);
/*    */     
/* 36 */     brx1.a(hh.ap, fx1.u() + d1, fx1.v() + d2, fx1.w() + d3, 0.0D, 0.0D, 0.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
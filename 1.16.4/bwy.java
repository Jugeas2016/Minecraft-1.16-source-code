/*    */ import java.util.Random;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bwy
/*    */   extends bto
/*    */ {
/*    */   protected bwy(ceg.c ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public ccj a(brc ☃) {
/* 26 */     return new ccw();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(brx ☃, fx fx1, bfw bfw1) {
/* 31 */     ccj ccj = ☃.c(fx1);
/* 32 */     if (ccj instanceof ccw) {
/* 33 */       bfw1.a((aox)ccj);
/* 34 */       bfw1.a(aea.al);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 40 */     if (!((Boolean)☃.c(b)).booleanValue()) {
/*    */       return;
/*    */     }
/*    */     
/* 44 */     double d1 = fx1.u() + 0.5D;
/* 45 */     double d2 = fx1.v();
/* 46 */     double d3 = fx1.w() + 0.5D;
/*    */     
/* 48 */     if (random.nextDouble() < 0.1D) {
/* 49 */       brx1.a(d1, d2, d3, adq.eF, adr.e, 1.0F, 1.0F, false);
/*    */     }
/*    */     
/* 52 */     gc gc = (gc)☃.c(a);
/* 53 */     gc.a a = gc.n();
/*    */     
/* 55 */     double d4 = 0.52D;
/* 56 */     double d5 = random.nextDouble() * 0.6D - 0.3D;
/*    */     
/* 58 */     double d6 = (a == gc.a.a) ? (gc.i() * 0.52D) : d5;
/* 59 */     double d7 = random.nextDouble() * 6.0D / 16.0D;
/* 60 */     double d8 = (a == gc.a.c) ? (gc.k() * 0.52D) : d5;
/*    */     
/* 62 */     brx1.a(hh.S, d1 + d6, d2 + d7, d3 + d8, 0.0D, 0.0D, 0.0D);
/* 63 */     brx1.a(hh.A, d1 + d6, d2 + d7, d3 + d8, 0.0D, 0.0D, 0.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
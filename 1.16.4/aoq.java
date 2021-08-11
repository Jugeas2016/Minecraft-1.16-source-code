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
/*    */ public class aoq
/*    */ {
/* 14 */   private static final Random a = new Random();
/*    */   
/*    */   public static void a(brx ☃, fx fx1, aon aon1) {
/* 17 */     a(☃, fx1.u(), fx1.v(), fx1.w(), aon1);
/*    */   }
/*    */   
/*    */   public static void a(brx ☃, aqa aqa1, aon aon1) {
/* 21 */     a(☃, aqa1.cD(), aqa1.cE(), aqa1.cH(), aon1);
/*    */   }
/*    */   
/*    */   private static void a(brx ☃, double d1, double d2, double d3, aon aon1) {
/* 25 */     for (int i = 0; i < aon1.Z_(); i++) {
/* 26 */       a(☃, d1, d2, d3, aon1.a(i));
/*    */     }
/*    */   }
/*    */   
/*    */   public static void a(brx ☃, fx fx1, gj<bmb> gj1) {
/* 31 */     gj1.forEach(bmb1 -> a(☃, fx1.u(), fx1.v(), fx1.w(), bmb1));
/*    */   }
/*    */   
/*    */   public static void a(brx ☃, double d1, double d2, double d3, bmb bmb1) {
/* 35 */     double d4 = aqe.L.j();
/* 36 */     double d5 = 1.0D - d4;
/* 37 */     double d6 = d4 / 2.0D;
/* 38 */     double d7 = Math.floor(d1) + a.nextDouble() * d5 + d6;
/* 39 */     double d8 = Math.floor(d2) + a.nextDouble() * d5;
/* 40 */     double d9 = Math.floor(d3) + a.nextDouble() * d5 + d6;
/*    */     
/* 42 */     while (!bmb1.a()) {
/* 43 */       bcv bcv = new bcv(☃, d7, d8, d9, bmb1.a(a.nextInt(21) + 10));
/*    */       
/* 45 */       float f = 0.05F;
/* 46 */       bcv.n(a
/* 47 */           .nextGaussian() * 0.05000000074505806D, a
/* 48 */           .nextGaussian() * 0.05000000074505806D + 0.20000000298023224D, a
/* 49 */           .nextGaussian() * 0.05000000074505806D);
/*    */ 
/*    */       
/* 52 */       ☃.c(bcv);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aoq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ public class byp
/*    */   extends buo
/*    */   implements buq
/*    */ {
/*    */   protected byp(ceg.c ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */   
/*    */   private static boolean b(ceh ☃, brz brz1, fx fx1) {
/* 24 */     fx fx2 = fx1.b();
/* 25 */     ceh ceh1 = brz1.d_(fx2);
/*    */ 
/*    */     
/* 28 */     int i = cul.a(brz1, ☃, fx1, ceh1, fx2, gc.b, ceh1.b(brz1, fx2));
/* 29 */     return (i < brz1.K());
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 34 */     if (!b(☃, aag1, fx1)) {
/* 35 */       aag1.a(fx1, bup.cL.n());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 41 */     return ☃.d_(fx1.b()).g();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 46 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 51 */     ceh ceh2 = ☃.d_(fx1);
/* 52 */     fx fx2 = fx1.b();
/* 53 */     if (ceh2.a(bup.mu)) {
/* 54 */       ckd.a(☃, random, fx2, kh.a.k, 3, 1);
/* 55 */     } else if (ceh2.a(bup.ml)) {
/* 56 */       ckd.a(☃, random, fx2, kh.a.l, 3, 1);
/* 57 */       ckd.a(☃, random, fx2, kh.a.m, 3, 1);
/* 58 */       if (random.nextInt(8) == 0)
/* 59 */         cle.a(☃, random, fx2, 3, 1, 2); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\byp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
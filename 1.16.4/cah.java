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
/*    */ public abstract class cah
/*    */   extends cab
/*    */ {
/*    */   protected cah(ceg.c ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */   
/*    */   private static boolean b(ceh ☃, brz brz1, fx fx1) {
/* 21 */     fx fx2 = fx1.b();
/* 22 */     ceh ceh1 = brz1.d_(fx2);
/* 23 */     if (ceh1.a(bup.cC) && ((Integer)ceh1.c(caa.a)).intValue() == 1) {
/* 24 */       return true;
/*    */     }
/*    */     
/* 27 */     if (ceh1.m().e() == 8) {
/* 28 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 32 */     int i = cul.a(brz1, ☃, fx1, ceh1, fx2, gc.b, ceh1.b(brz1, fx2));
/*    */     
/* 34 */     return (i < brz1.K());
/*    */   }
/*    */   
/*    */   private static boolean c(ceh ☃, brz brz1, fx fx1) {
/* 38 */     fx fx2 = fx1.b();
/* 39 */     return (b(☃, brz1, fx1) && !brz1.b(fx2).a(aef.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 44 */     if (!b(☃, aag1, fx1)) {
/* 45 */       aag1.a(fx1, bup.j.n());
/*    */       
/*    */       return;
/*    */     } 
/* 49 */     if (aag1.B(fx1.b()) >= 9) {
/* 50 */       ceh ceh1 = n();
/*    */       
/* 52 */       for (int i = 0; i < 4; i++) {
/* 53 */         fx fx2 = fx1.b(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
/* 54 */         if (aag1.d_(fx2).a(bup.j) && c(ceh1, aag1, fx2))
/* 55 */           aag1.a(fx2, ceh1.a(a, Boolean.valueOf(aag1.d_(fx2.b()).a(bup.cC)))); 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class byn
/*    */   extends buo
/*    */   implements buq
/*    */ {
/*    */   public byn(ceg.c ☃) {
/* 14 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 19 */     if (!☃.d_(fx1.b()).a(☃, fx1)) {
/* 20 */       return false;
/*    */     }
/*    */     
/* 23 */     for (fx fx2 : fx.a(fx1.b(-1, -1, -1), fx1.b(1, 1, 1))) {
/* 24 */       if (☃.d_(fx2).a(aed.ao)) {
/* 25 */         return true;
/*    */       }
/*    */     } 
/* 28 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 33 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 38 */     boolean bool1 = false;
/* 39 */     boolean bool2 = false;
/* 40 */     for (fx fx2 : fx.a(fx1.b(-1, -1, -1), fx1.b(1, 1, 1))) {
/* 41 */       ceh ceh2 = ☃.d_(fx2);
/* 42 */       if (ceh2.a(bup.ml)) {
/* 43 */         bool2 = true;
/*    */       }
/*    */       
/* 46 */       if (ceh2.a(bup.mu)) {
/* 47 */         bool1 = true;
/*    */       }
/*    */       
/* 50 */       if (bool2 && bool1) {
/*    */         break;
/*    */       }
/*    */     } 
/*    */     
/* 55 */     if (bool2 && bool1) {
/* 56 */       ☃.a(fx1, random.nextBoolean() ? bup.ml.n() : bup.mu.n(), 3);
/* 57 */     } else if (bool2) {
/* 58 */       ☃.a(fx1, bup.ml.n(), 3);
/* 59 */     } else if (bool1) {
/* 60 */       ☃.a(fx1, bup.mu.n(), 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\byn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
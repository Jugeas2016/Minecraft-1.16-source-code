/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
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
/*    */ public abstract class cdq
/*    */ {
/*    */   @Nullable
/*    */   protected abstract civ<cmz, ?> a(Random paramRandom, boolean paramBoolean);
/*    */   
/*    */   public boolean a(aag ☃, cfy cfy1, fx fx1, ceh ceh1, Random random) {
/* 22 */     civ<cmz, ?> civ = a(random, a(☃, fx1));
/* 23 */     if (civ == null) {
/* 24 */       return false;
/*    */     }
/*    */     
/* 27 */     ☃.a(fx1, bup.a.n(), 4);
/*    */     
/* 29 */     ((cmz)civ.f).b();
/* 30 */     if (civ.a(☃, cfy1, random, fx1)) {
/* 31 */       return true;
/*    */     }
/* 33 */     ☃.a(fx1, ceh1, 4);
/* 34 */     return false;
/*    */   }
/*    */   
/*    */   private boolean a(bry ☃, fx fx1) {
/* 38 */     for (fx fx2 : fx.a.a(fx1.c().d(2).f(2), fx1.b().e(2).g(2))) {
/* 39 */       if (☃.d_(fx2).a(aed.O)) {
/* 40 */         return true;
/*    */       }
/*    */     } 
/* 43 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cdq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
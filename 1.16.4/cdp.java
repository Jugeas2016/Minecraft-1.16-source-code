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
/*    */ public abstract class cdp
/*    */   extends cdq
/*    */ {
/*    */   public boolean a(aag ☃, cfy cfy1, fx fx1, ceh ceh1, Random random) {
/* 19 */     for (int i = 0; i >= -1; i--) {
/* 20 */       for (int j = 0; j >= -1; j--) {
/* 21 */         if (a(ceh1, ☃, fx1, i, j)) {
/* 22 */           return a(☃, cfy1, fx1, ceh1, random, i, j);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 27 */     return super.a(☃, cfy1, fx1, ceh1, random);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected abstract civ<cmz, ?> a(Random paramRandom);
/*    */   
/*    */   public boolean a(aag ☃, cfy cfy1, fx fx1, ceh ceh1, Random random, int i, int j) {
/* 34 */     civ<cmz, ?> civ = a(random);
/*    */     
/* 36 */     if (civ == null) {
/* 37 */       return false;
/*    */     }
/*    */     
/* 40 */     ((cmz)civ.f).b();
/* 41 */     ceh ceh2 = bup.a.n();
/* 42 */     ☃.a(fx1.b(i, 0, j), ceh2, 4);
/* 43 */     ☃.a(fx1.b(i + 1, 0, j), ceh2, 4);
/* 44 */     ☃.a(fx1.b(i, 0, j + 1), ceh2, 4);
/* 45 */     ☃.a(fx1.b(i + 1, 0, j + 1), ceh2, 4);
/*    */     
/* 47 */     if (civ.a(☃, cfy1, random, fx1.b(i, 0, j))) {
/* 48 */       return true;
/*    */     }
/* 50 */     ☃.a(fx1.b(i, 0, j), ceh1, 4);
/* 51 */     ☃.a(fx1.b(i + 1, 0, j), ceh1, 4);
/* 52 */     ☃.a(fx1.b(i, 0, j + 1), ceh1, 4);
/* 53 */     ☃.a(fx1.b(i + 1, 0, j + 1), ceh1, 4);
/* 54 */     return false;
/*    */   }
/*    */   
/*    */   public static boolean a(ceh ☃, brc brc1, fx fx1, int i, int j) {
/* 58 */     buo buo = ☃.b();
/* 59 */     return (buo == brc1.d_(fx1.b(i, 0, j)).b() && buo == brc1
/* 60 */       .d_(fx1.b(i + 1, 0, j)).b() && buo == brc1
/* 61 */       .d_(fx1.b(i, 0, j + 1)).b() && buo == brc1
/* 62 */       .d_(fx1.b(i + 1, 0, j + 1)).b());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cdp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
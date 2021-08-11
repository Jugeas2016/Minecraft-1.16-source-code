/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cjp
/*    */   extends cij
/*    */ {
/*    */   public cjp(Codec<cmb> ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bry ☃, Random random, fx fx1, int i, fx.a a1, cmb cmb1) {
/* 18 */     int j = cmb1.d;
/* 19 */     for (int k = -j; k <= j; k++) {
/* 20 */       for (int m = -j; m <= j; m++) {
/* 21 */         boolean bool1 = (k == -j);
/* 22 */         boolean bool2 = (k == j);
/* 23 */         boolean bool3 = (m == -j);
/* 24 */         boolean bool4 = (m == j);
/*    */         
/* 26 */         boolean bool5 = (bool1 || bool2);
/* 27 */         boolean bool6 = (bool3 || bool4);
/* 28 */         if (!bool5 || !bool6) {
/*    */ 
/*    */ 
/*    */           
/* 32 */           a1.a(fx1, k, i, m);
/* 33 */           if (!☃.d_(a1).i(☃, a1)) {
/* 34 */             boolean bool7 = (bool1 || (bool6 && k == 1 - j));
/* 35 */             boolean bool8 = (bool2 || (bool6 && k == j - 1));
/* 36 */             boolean bool9 = (bool3 || (bool5 && m == 1 - j));
/* 37 */             boolean bool10 = (bool4 || (bool5 && m == j - 1));
/* 38 */             a(☃, a1, cmb1.b.a(random, fx1)
/* 39 */                 .a(bxn.d, Boolean.valueOf(bool7))
/* 40 */                 .a(bxn.b, Boolean.valueOf(bool8))
/* 41 */                 .a(bxn.a, Boolean.valueOf(bool9))
/* 42 */                 .a(bxn.c, Boolean.valueOf(bool10)));
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(int ☃, int i, int j, int k) {
/* 51 */     return (k <= 3) ? 0 : j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
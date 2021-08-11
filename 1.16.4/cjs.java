/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cjs
/*    */   extends cij
/*    */ {
/*    */   public cjs(Codec<cmb> ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bry ☃, Random random, fx fx1, int i, fx.a a1, cmb cmb1) {
/* 18 */     for (int j = i - 3; j <= i; j++) {
/* 19 */       int k = (j < i) ? cmb1.d : (cmb1.d - 1);
/* 20 */       int m = cmb1.d - 2;
/*    */       
/* 22 */       for (int n = -k; n <= k; n++) {
/* 23 */         for (int i1 = -k; i1 <= k; i1++) {
/* 24 */           boolean bool1 = (n == -k);
/* 25 */           boolean bool2 = (n == k);
/* 26 */           boolean bool3 = (i1 == -k);
/* 27 */           boolean bool4 = (i1 == k);
/*    */           
/* 29 */           boolean bool5 = (bool1 || bool2);
/* 30 */           boolean bool6 = (bool3 || bool4);
/*    */           
/* 32 */           if (j >= i || bool5 != bool6) {
/*    */ 
/*    */ 
/*    */             
/* 36 */             a1.a(fx1, n, j, i1);
/* 37 */             if (!☃.d_(a1).i(☃, a1)) {
/* 38 */               a(☃, a1, cmb1.b.a(random, fx1)
/* 39 */                   .a(bxn.e, Boolean.valueOf((j >= i - 1)))
/* 40 */                   .a(bxn.d, Boolean.valueOf((n < -m)))
/* 41 */                   .a(bxn.b, Boolean.valueOf((n > m)))
/* 42 */                   .a(bxn.a, Boolean.valueOf((i1 < -m)))
/* 43 */                   .a(bxn.c, Boolean.valueOf((i1 > m))));
/*    */             }
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected int a(int ☃, int i, int j, int k) {
/* 53 */     int m = 0;
/* 54 */     if (k < i && k >= i - 3) {
/* 55 */       m = j;
/* 56 */     } else if (k == i) {
/* 57 */       m = j;
/*    */     } 
/* 59 */     return m;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
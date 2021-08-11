/*    */ import com.mojang.serialization.Codec;
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
/*    */ public abstract class cij
/*    */   extends cjl<cmb>
/*    */ {
/*    */   public cij(Codec<cmb> ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */   
/*    */   protected void a(bry ☃, Random random, fx fx1, cmb cmb1, int i, fx.a a1) {
/* 23 */     for (int j = 0; j < i; j++) {
/* 24 */       a1.g(fx1).c(gc.b, j);
/* 25 */       if (!☃.d_(a1).i(☃, a1)) {
/* 26 */         a(☃, a1, cmb1.c.a(random, fx1));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   protected int a(Random ☃) {
/* 32 */     int i = ☃.nextInt(3) + 4;
/* 33 */     if (☃.nextInt(12) == 0) {
/* 34 */       i *= 2;
/*    */     }
/* 36 */     return i;
/*    */   }
/*    */   
/*    */   protected boolean a(bry ☃, fx fx1, int i, fx.a a1, cmb cmb1) {
/* 40 */     int j = fx1.v();
/* 41 */     if (j < 1 || j + i + 1 >= 256) {
/* 42 */       return false;
/*    */     }
/*    */     
/* 45 */     buo buo = ☃.d_(fx1.c()).b();
/* 46 */     if (!b(buo) && !buo.a(aed.aD)) {
/* 47 */       return false;
/*    */     }
/*    */     
/* 50 */     for (int k = 0; k <= i; k++) {
/* 51 */       int m = a(-1, -1, cmb1.d, k);
/* 52 */       for (int n = -m; n <= m; n++) {
/* 53 */         for (int i1 = -m; i1 <= m; i1++) {
/* 54 */           ceh ceh = ☃.d_(a1.a(fx1, n, k, i1));
/* 55 */           if (!ceh.g() && !ceh.a(aed.I)) {
/* 56 */             return false;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 61 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmb cmb1) {
/* 66 */     int i = a(random);
/*    */     
/* 68 */     fx.a a = new fx.a();
/* 69 */     if (!a(☃, fx1, i, a, cmb1)) {
/* 70 */       return false;
/*    */     }
/*    */     
/* 73 */     a(☃, random, fx1, i, a, cmb1);
/* 74 */     a(☃, random, fx1, cmb1, i, a);
/* 75 */     return true;
/*    */   }
/*    */   
/*    */   protected abstract int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*    */   
/*    */   protected abstract void a(bry parambry, Random paramRandom, fx paramfx, int paramInt, fx.a parama, cmb paramcmb);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ import com.google.common.collect.ImmutableList;
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
/*    */ public class cjd
/*    */   extends cjl<clx>
/*    */ {
/* 18 */   private static final ImmutableList<buo> a = ImmutableList.of(bup.z, bup.dV, bup.dW, bup.dX, bup.dY, bup.bR, bup.bP);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 25 */   private static final gc[] ab = gc.values();
/*    */ 
/*    */   
/*    */   public cjd(Codec<clx> ☃) {
/* 29 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, clx clx1) {
/* 34 */     boolean bool1 = false;
/* 35 */     boolean bool2 = (random.nextDouble() < 0.9D);
/* 36 */     int i = bool2 ? clx1.e().a(random) : 0;
/* 37 */     int j = bool2 ? clx1.e().a(random) : 0;
/* 38 */     boolean bool3 = (bool2 && i != 0 && j != 0);
/*    */     
/* 40 */     int k = clx1.d().a(random);
/* 41 */     int m = clx1.d().a(random);
/* 42 */     int n = Math.max(k, m);
/* 43 */     for (fx fx2 : fx.a(fx1, k, 0, m)) {
/* 44 */       if (fx2.k(fx1) > n) {
/*    */         break;
/*    */       }
/*    */       
/* 48 */       if (a(☃, fx2, clx1)) {
/* 49 */         if (bool3) {
/* 50 */           bool1 = true;
/* 51 */           a(☃, fx2, clx1.c());
/*    */         } 
/*    */         
/* 54 */         fx fx3 = fx2.b(i, 0, j);
/* 55 */         if (a(☃, fx3, clx1)) {
/* 56 */           bool1 = true;
/* 57 */           a(☃, fx3, clx1.b());
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 62 */     return bool1;
/*    */   }
/*    */   
/*    */   private static boolean a(bry ☃, fx fx1, clx clx1) {
/* 66 */     ceh ceh = ☃.d_(fx1);
/* 67 */     if (ceh.a(clx1.b().b())) {
/* 68 */       return false;
/*    */     }
/*    */     
/* 71 */     if (a.contains(ceh.b())) {
/* 72 */       return false;
/*    */     }
/*    */     
/* 75 */     for (gc gc1 : ab) {
/* 76 */       boolean bool = ☃.d_(fx1.a(gc1)).g();
/* 77 */       if ((bool && gc1 != gc.b) || (!bool && gc1 == gc.b)) {
/* 78 */         return false;
/*    */       }
/*    */     } 
/* 81 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
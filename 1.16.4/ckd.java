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
/*    */ public class ckd
/*    */   extends cjl<clr>
/*    */ {
/*    */   public ckd(Codec<clr> ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, clr clr1) {
/* 25 */     return a(☃, random, fx1, clr1, 8, 4);
/*    */   }
/*    */   
/*    */   public static boolean a(bry ☃, Random random, fx fx1, clr clr1, int i, int j) {
/* 29 */     buo buo = ☃.d_(fx1.c()).b();
/*    */     
/* 31 */     if (!buo.a(aed.ao)) {
/* 32 */       return false;
/*    */     }
/*    */     
/* 35 */     int k = fx1.v();
/*    */     
/* 37 */     if (k < 1 || k + 1 >= 256) {
/* 38 */       return false;
/*    */     }
/*    */     
/* 41 */     int m = 0;
/*    */     
/* 43 */     for (int n = 0; n < i * i; n++) {
/* 44 */       fx fx2 = fx1.b(random.nextInt(i) - random.nextInt(i), random.nextInt(j) - random.nextInt(j), random.nextInt(i) - random.nextInt(i));
/* 45 */       ceh ceh = clr1.b.a(random, fx2);
/* 46 */       if (☃.w(fx2) && fx2.v() > 0 && 
/* 47 */         ceh.a(☃, fx2)) {
/* 48 */         ☃.a(fx2, ceh, 2);
/* 49 */         m++;
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 54 */     return (m > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
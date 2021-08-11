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
/*    */ public class ciq
/*    */   extends cjl<clr>
/*    */ {
/*    */   public ciq(Codec<clr> ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, clr clr1) {
/* 23 */     if (fx1.v() < 5) {
/* 24 */       return false;
/*    */     }
/*    */     
/* 27 */     int i = 2 + random.nextInt(2);
/* 28 */     int j = 2 + random.nextInt(2);
/*    */     
/* 30 */     for (fx fx2 : fx.a(fx1.b(-i, 0, -j), fx1.b(i, 1, j))) {
/* 31 */       int k = fx1.u() - fx2.u();
/* 32 */       int m = fx1.w() - fx2.w();
/* 33 */       if ((k * k + m * m) <= random.nextFloat() * 10.0F - random.nextFloat() * 6.0F) {
/* 34 */         a(☃, fx2, random, clr1); continue;
/* 35 */       }  if (random.nextFloat() < 0.031D) {
/* 36 */         a(☃, fx2, random, clr1);
/*    */       }
/*    */     } 
/*    */     
/* 40 */     return true;
/*    */   }
/*    */   
/*    */   private boolean a(bry ☃, fx fx1, Random random) {
/* 44 */     fx fx2 = fx1.c();
/* 45 */     ceh ceh = ☃.d_(fx2);
/* 46 */     if (ceh.a(bup.iE)) {
/* 47 */       return random.nextBoolean();
/*    */     }
/*    */     
/* 50 */     return ceh.d(☃, fx2, gc.b);
/*    */   }
/*    */   
/*    */   private void a(bry ☃, fx fx1, Random random, clr clr1) {
/* 54 */     if (☃.w(fx1) && a(☃, fx1, random))
/* 55 */       ☃.a(fx1, clr1.b.a(random, fx1), 4); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ciq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
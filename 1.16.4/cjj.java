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
/*    */ public class cjj
/*    */   extends cjl<cmh>
/*    */ {
/*    */   public cjj(Codec<cmh> ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 20 */     float f = (random.nextInt(3) + 4);
/* 21 */     int i = 0;
/* 22 */     while (f > 0.5F) {
/* 23 */       for (int j = afm.d(-f); j <= afm.f(f); j++) {
/* 24 */         for (int k = afm.d(-f); k <= afm.f(f); k++) {
/* 25 */           if ((j * j + k * k) <= (f + 1.0F) * (f + 1.0F)) {
/* 26 */             a(☃, fx1.b(j, i, k), bup.ee.n());
/*    */           }
/*    */         } 
/*    */       } 
/* 30 */       f = (float)(f - random.nextInt(2) + 0.5D);
/* 31 */       i--;
/*    */     } 
/*    */     
/* 34 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
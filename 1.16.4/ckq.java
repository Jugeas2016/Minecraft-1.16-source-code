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
/*    */ public class ckq
/*    */   extends cjl<clu>
/*    */ {
/*    */   public ckq(Codec<clu> ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, clu clu1) {
/* 23 */     int i = 0;
/* 24 */     int j = clu1.a().a(random);
/* 25 */     for (int k = 0; k < j; k++) {
/* 26 */       int m = random.nextInt(8) - random.nextInt(8);
/* 27 */       int n = random.nextInt(8) - random.nextInt(8);
/* 28 */       int i1 = ☃.a(chn.a.d, fx1.u() + m, fx1.w() + n);
/* 29 */       fx fx2 = new fx(fx1.u() + m, i1, fx1.w() + n);
/*    */       
/* 31 */       ceh ceh = bup.kU.n().a(bzq.a, Integer.valueOf(random.nextInt(4) + 1));
/* 32 */       if (☃.d_(fx2).a(bup.A) && ceh.a(☃, fx2)) {
/* 33 */         ☃.a(fx2, ceh, 2);
/* 34 */         i++;
/*    */       } 
/*    */     } 
/* 37 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ public class ckr
/*    */   extends cjl<cmk>
/*    */ {
/*    */   public ckr(Codec<cmk> ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmk cmk1) {
/* 24 */     boolean bool = false;
/* 25 */     int i = random.nextInt(8) - random.nextInt(8);
/* 26 */     int j = random.nextInt(8) - random.nextInt(8);
/* 27 */     int k = ☃.a(chn.a.d, fx1.u() + i, fx1.w() + j);
/* 28 */     fx fx2 = new fx(fx1.u() + i, k, fx1.w() + j);
/*    */     
/* 30 */     if (☃.d_(fx2).a(bup.A)) {
/* 31 */       boolean bool1 = (random.nextDouble() < cmk1.c);
/* 32 */       ceh ceh = bool1 ? bup.aV.n() : bup.aU.n();
/* 33 */       if (ceh.a(☃, fx2)) {
/* 34 */         if (bool1) {
/* 35 */           ceh ceh1 = ceh.a(cax.b, cfd.a);
/* 36 */           fx fx3 = fx2.b();
/* 37 */           if (☃.d_(fx3).a(bup.A)) {
/* 38 */             ☃.a(fx2, ceh, 2);
/* 39 */             ☃.a(fx3, ceh1, 2);
/*    */           } 
/*    */         } else {
/* 42 */           ☃.a(fx2, ceh, 2);
/*    */         } 
/* 44 */         bool = true;
/*    */       } 
/*    */     } 
/* 47 */     return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ public class cjz
/*    */   extends cjl<cmh>
/*    */ {
/*    */   public cjz(Codec<cmh> ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 23 */     int i = 0;
/* 24 */     int j = ☃.a(chn.a.d, fx1.u(), fx1.w());
/* 25 */     fx fx2 = new fx(fx1.u(), j, fx1.w());
/*    */     
/* 27 */     if (☃.d_(fx2).a(bup.A)) {
/* 28 */       ceh ceh1 = bup.kc.n();
/* 29 */       ceh ceh2 = bup.kd.n();
/* 30 */       int k = 1 + random.nextInt(10);
/* 31 */       for (int m = 0; m <= k; m++) {
/* 32 */         if (☃.d_(fx2).a(bup.A) && ☃.d_(fx2.b()).a(bup.A) && ceh2.a(☃, fx2)) {
/* 33 */           if (m == k) {
/* 34 */             ☃.a(fx2, ceh1.a(bxt.d, Integer.valueOf(random.nextInt(4) + 20)), 2);
/* 35 */             i++;
/*    */           } else {
/* 37 */             ☃.a(fx2, ceh2, 2);
/*    */           } 
/* 39 */         } else if (m > 0) {
/* 40 */           fx fx3 = fx2.c();
/* 41 */           if (ceh1.a(☃, fx3) && !☃.d_(fx3.c()).a(bup.kc)) {
/* 42 */             ☃.a(fx3, ceh1.a(bxt.d, Integer.valueOf(random.nextInt(4) + 20)), 2);
/* 43 */             i++;
/*    */           } 
/*    */           
/*    */           break;
/*    */         } 
/* 48 */         fx2 = fx2.b();
/*    */       } 
/*    */     } 
/*    */     
/* 52 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
/*    */ 
/*    */ public class ckw
/*    */   extends cjl<cmh>
/*    */ {
/*    */   public ckw(Codec<cmh> ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 25 */     fx.a a1 = new fx.a();
/* 26 */     fx.a a2 = new fx.a();
/*    */     
/* 28 */     for (int i = 0; i < 16; i++) {
/* 29 */       for (int j = 0; j < 16; j++) {
/* 30 */         int k = fx1.u() + i;
/* 31 */         int m = fx1.w() + j;
/* 32 */         int n = ☃.a(chn.a.e, k, m);
/*    */         
/* 34 */         a1.d(k, n, m);
/* 35 */         a2.g(a1).c(gc.a, 1);
/*    */         
/* 37 */         bsv bsv = ☃.v(a1);
/*    */         
/* 39 */         if (bsv.a(☃, a2, false)) {
/* 40 */           ☃.a(a2, bup.cD.n(), 2);
/*    */         }
/* 42 */         if (bsv.b(☃, a1)) {
/* 43 */           ☃.a(a1, bup.cC.n(), 2);
/*    */           
/* 45 */           ceh ceh = ☃.d_(a2);
/* 46 */           if (ceh.b(cab.a)) {
/* 47 */             ☃.a(a2, ceh.a(cab.a, Boolean.valueOf(true)), 2);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 52 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
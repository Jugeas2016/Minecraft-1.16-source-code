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
/*    */ public class cji
/*    */   extends cjl<clz>
/*    */ {
/*    */   public cji(Codec<clz> ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, clz clz1) {
/* 21 */     for (fx fx2 : fx.a(fx1.b(-1, -2, -1), fx1.b(1, 2, 1))) {
/* 22 */       boolean bool1 = (fx2.u() == fx1.u());
/* 23 */       boolean bool2 = (fx2.v() == fx1.v());
/* 24 */       boolean bool3 = (fx2.w() == fx1.w());
/* 25 */       boolean bool4 = (Math.abs(fx2.v() - fx1.v()) == 2);
/*    */       
/* 27 */       if (bool1 && bool2 && bool3) {
/* 28 */         fx fx3 = fx2.h();
/* 29 */         a(☃, fx3, bup.iF.n());
/* 30 */         clz1.c().ifPresent(fx2 -> {
/*    */               ccj ccj = ☃.c(fx1); if (ccj instanceof cdk) {
/*    */                 cdk cdk = (cdk)ccj; cdk.a(fx2, clz1.d());
/*    */                 ccj.X_();
/*    */               } 
/*    */             });
/*    */         continue;
/*    */       } 
/* 38 */       if (bool2) {
/* 39 */         a(☃, fx2, bup.a.n()); continue;
/* 40 */       }  if (bool4 && bool1 && bool3) {
/* 41 */         a(☃, fx2, bup.z.n()); continue;
/* 42 */       }  if ((!bool1 && !bool3) || bool4) {
/* 43 */         a(☃, fx2, bup.a.n()); continue;
/*    */       } 
/* 45 */       a(☃, fx2, bup.z.n());
/*    */     } 
/*    */     
/* 48 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cji.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
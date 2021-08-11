/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class ckn
/*    */   extends cjl<cmq>
/*    */ {
/*    */   public ckn(Codec<cmq> ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmq cmq1) {
/* 23 */     buo buo = cmq1.b.b();
/* 24 */     fx fx2 = a(☃, fx1.i().a(gc.a.b, 1, ☃.L() - 1), buo);
/* 25 */     if (fx2 == null) {
/* 26 */       return false;
/*    */     }
/*    */     
/* 29 */     int i = cmq1.b().a(random);
/*    */     
/* 31 */     boolean bool = false;
/* 32 */     for (fx fx3 : fx.a(fx2, i, i, i)) {
/* 33 */       if (fx3.k(fx2) > i) {
/*    */         break;
/*    */       }
/*    */ 
/*    */       
/* 38 */       ceh ceh = ☃.d_(fx3);
/* 39 */       if (ceh.a(buo)) {
/* 40 */         a(☃, fx3, cmq1.c);
/* 41 */         bool = true;
/*    */       } 
/*    */     } 
/*    */     
/* 45 */     return bool;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private static fx a(bry ☃, fx.a a1, buo buo1) {
/* 50 */     while (a1.v() > 1) {
/* 51 */       ceh ceh = ☃.d_(a1);
/* 52 */       if (ceh.a(buo1)) {
/* 53 */         return a1;
/*    */       }
/*    */       
/* 56 */       a1.c(gc.a);
/*    */     } 
/* 58 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
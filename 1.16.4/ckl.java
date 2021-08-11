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
/*    */ public class ckl
/*    */   extends cjl<cmn>
/*    */ {
/*    */   public ckl(Codec<cmn> ☃) {
/* 16 */     super(☃);
/*    */   }
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmn cmn1) {
/*    */     fx fx2;
/* 21 */     ceh ceh = cmn1.b.a(random, fx1);
/*    */     
/* 23 */     if (cmn1.l) {
/* 24 */       fx2 = ☃.a(chn.a.a, fx1);
/*    */     } else {
/* 26 */       fx2 = fx1;
/*    */     } 
/*    */     
/* 29 */     int i = 0;
/*    */     
/* 31 */     fx.a a = new fx.a();
/* 32 */     for (int j = 0; j < cmn1.f; j++) {
/* 33 */       a.a(fx2, random.nextInt(cmn1.g + 1) - random.nextInt(cmn1.g + 1), random.nextInt(cmn1.h + 1) - random.nextInt(cmn1.h + 1), random.nextInt(cmn1.i + 1) - random.nextInt(cmn1.i + 1));
/* 34 */       fx fx3 = a.c();
/* 35 */       ceh ceh1 = ☃.d_(fx3);
/* 36 */       if ((☃.w(a) || (cmn1.j && ☃.d_(a).c().e())) && ceh
/* 37 */         .a(☃, a) && (cmn1.d
/* 38 */         .isEmpty() || cmn1.d.contains(ceh1.b())) && 
/* 39 */         !cmn1.e.contains(ceh1) && (!cmn1.m || ☃
/* 40 */         .b(fx3.f()).a(aef.b) || ☃.b(fx3.g()).a(aef.b) || ☃.b(fx3.d()).a(aef.b) || ☃.b(fx3.e()).a(aef.b))) {
/*    */         
/* 42 */         cmn1.c.a(☃, a, ceh, random);
/* 43 */         i++;
/*    */       } 
/*    */     } 
/*    */     
/* 47 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
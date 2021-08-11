/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cip
/*    */   extends cjl<cls>
/*    */ {
/*    */   public cip(Codec<cls> ☃) {
/* 14 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cls cls1) {
/* 19 */     while (fx1.v() > 3) {
/* 20 */       if (!☃.w(fx1.c())) {
/* 21 */         buo buo = ☃.d_(fx1.c()).b();
/* 22 */         if (b(buo) || a(buo)) {
/*    */           break;
/*    */         }
/*    */       } 
/* 26 */       fx1 = fx1.c();
/*    */     } 
/* 28 */     if (fx1.v() <= 3) {
/* 29 */       return false;
/*    */     }
/*    */     
/* 32 */     int i = 0;
/* 33 */     while (i < 3) {
/* 34 */       int j = random.nextInt(2);
/* 35 */       int k = random.nextInt(2);
/* 36 */       int m = random.nextInt(2);
/* 37 */       float f = (j + k + m) * 0.333F + 0.5F;
/*    */       
/* 39 */       for (fx fx2 : fx.a(fx1.b(-j, -k, -m), fx1.b(j, k, m))) {
/* 40 */         if (fx2.j(fx1) <= (f * f)) {
/* 41 */           ☃.a(fx2, cls1.b, 4);
/*    */         }
/*    */       } 
/*    */       
/* 45 */       fx1 = fx1.b(-1 + random.nextInt(2), -random.nextInt(2), -1 + random.nextInt(2));
/* 46 */       i++;
/*    */     } 
/*    */     
/* 49 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
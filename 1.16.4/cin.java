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
/*    */ public class cin
/*    */   extends cjl<cly>
/*    */ {
/*    */   public cin(Codec<cly> ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cly cly1) {
/* 20 */     boolean bool = false;
/*    */     
/* 22 */     int i = cly1.c.a(random);
/* 23 */     for (int j = fx1.u() - i; j <= fx1.u() + i; j++) {
/* 24 */       for (int k = fx1.w() - i; k <= fx1.w() + i; k++) {
/* 25 */         int m = j - fx1.u();
/* 26 */         int n = k - fx1.w();
/* 27 */         if (m * m + n * n <= i * i)
/*    */         {
/*    */           
/* 30 */           for (int i1 = fx1.v() - cly1.d; i1 <= fx1.v() + cly1.d; i1++) {
/* 31 */             fx fx2 = new fx(j, i1, k);
/* 32 */             buo buo = ☃.d_(fx2).b();
/*    */             
/* 34 */             for (ceh ceh : cly1.e) {
/* 35 */               if (ceh.a(buo)) {
/* 36 */                 ☃.a(fx2, cly1.b, 2);
/* 37 */                 bool = true;
/*    */                 break;
/*    */               } 
/*    */             } 
/*    */           } 
/*    */         }
/*    */       } 
/*    */     } 
/* 45 */     return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */